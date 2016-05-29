package joerichard.net.weather.presenters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import joerichard.net.weather.R;
import joerichard.net.weather.adapter.DailyRecyclerAdapter;
import joerichard.net.weather.adapter.HourlyRecyclerAdapter;
import joerichard.net.weather.data.FileManager;
import joerichard.net.weather.models.City;
import joerichard.net.weather.models.DailyDatum;
import joerichard.net.weather.models.HourlyDatum;
import joerichard.net.weather.models.WeatherResult;
import joerichard.net.weather.utils.DateUtil;
import joerichard.net.weather.utils.NetworkUtil;
import joerichard.net.weather.views.MainView;

/**
 * Created by joe on 30.03.16.
 */
public class MainPresenter {

    Context context;
    MainView mainView;
    WeatherResult weather;
    City city;

    public MainPresenter(Context context, MainView mainView) {

        this.context = context;
        this.mainView = mainView;
        city = City.newInstance(context.getString(R.string.app_name));

        String json = FileManager.readFromFile(context, city.getFilename());
        Gson gson = new GsonBuilder().create();
        weather = gson.fromJson(json, WeatherResult.class);
        DateUtil.timezone = weather.getTimezone();

    }

    public void init() {

        if(FileManager.isFileExist(context, city.getFilename()) && DateUtil.isDataExpired(Long.parseLong(FileManager.readFromFile(context, "timestamp"))))
            mainView.goToUpdateActivity(false);

        showCurrentWeather();
        showHourlyWeather();
        showDailyWeather();
    }

    private void showCurrentWeather() {

        mainView.setCity(city.getName()+" "+context.getString(R.string.weather));
        mainView.setUpdateIcon("cloud-refresh");
        mainView.setUpdateTime(DateUtil.getTimeAgo(context, Long.parseLong(FileManager.readFromFile(context, "timestamp"))));
        mainView.setTodayTemp(weather.getDaily().getData().get(0).getMinMaxTemperature());

        // check if it is okey to use currently data
        if (System.currentTimeMillis() / 1000 < weather.getHourly().getData().get(1).getTime()) {
            mainView.setNowBackground(weather.getCurrently().getIcon());
            mainView.setCurrentTemp(Math.round(weather.getCurrently().getTemperature()) + "°");
            mainView.setNowIcon(weather.getCurrently().getIcon());
            mainView.setSummary(weather.getCurrently().getSummary());
            String windSpeeedUnit = context.getString(R.string.mps);
            if(city.getUnit().equals("us")) windSpeeedUnit = context.getString(R.string.mph);
            mainView.setWindSpeed(Math.round(weather.getCurrently().getWindSpeed()) + windSpeeedUnit);
        } else {
            for (int i = 0; i < weather.getHourly().getData().size(); i++) {
                HourlyDatum hourlyDatum = weather.getHourly().getData().get(i);
                if (hourlyDatum.getTime() > System.currentTimeMillis() / 1000) {
                    hourlyDatum = weather.getHourly().getData().get(i - 1);
                    mainView.setNowBackground(hourlyDatum.getIcon());
                    mainView.setCurrentTemp(Math.round(hourlyDatum.getTemperature()) + "°");
                    mainView.setNowIcon(hourlyDatum.getIcon());
                    mainView.setSummary(hourlyDatum.getSummary());
                    mainView.setWindSpeed(Math.round(hourlyDatum.getWindSpeed()) + "км/ч");
                    break;
                }
            }
        }

    }

    private void showHourlyWeather() {

        DailyDatum weatherToday = null;
        DailyDatum weatherTomorrow = null;
        for (DailyDatum daily : weather.getDaily().getData()) {
            if (!DateUtil.isDayPassed(daily.getTime())) {
                if (weatherToday == null) weatherToday = daily;
                else if (weatherTomorrow == null) weatherTomorrow = daily;
                else break;
            }
        }

        List<HourlyDatum> hourlyDatumList = new ArrayList<>();
        int added_count = 0;
        for (HourlyDatum hourly : weather.getHourly().getData()) {

            if(weatherToday.getSunriseTime()!=null && weatherToday.getSunsetTime()!=null && weatherTomorrow.getSunriseTime()!=null && weatherTomorrow.getSunsetTime()!=null){
                boolean isNightime = hourly.getTime() < weatherToday.getSunriseTime() ||
                        (hourly.getTime() > weatherToday.getSunsetTime() && hourly.getTime() < weatherTomorrow.getSunriseTime()) ||
                        hourly.getTime() > weatherTomorrow.getSunsetTime();
                hourly.setNighttime(isNightime);
            }


            if (!DateUtil.isHourPassed(hourly.getTime())) {
                hourlyDatumList.add(hourly);
                added_count++;
            }
            if (added_count == 24) {
                break;
            }
        }
        HourlyRecyclerAdapter adapter = new HourlyRecyclerAdapter(context, hourlyDatumList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        mainView.setHourlyWeather(adapter, layoutManager);
    }

    private void showDailyWeather() {

        List<DailyDatum> dailyDatumList = new ArrayList<>();
        for (DailyDatum daily : weather.getDaily().getData()) {
            if (!DateUtil.isDayPassed(daily.getTime())) {
                dailyDatumList.add(daily);
            }
        }
        DailyRecyclerAdapter adapter = new DailyRecyclerAdapter(context, dailyDatumList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        mainView.setDailyWeather(adapter, layoutManager);

    }


    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tvUpdateIcon) {
            if (NetworkUtil.isNetworkAvailable(context)) mainView.goToUpdateActivity(true);
            else mainView.showToast(context.getString(R.string.no_internet_connection));
        } else if (i == R.id.tvUpdateTime) {
            if (NetworkUtil.isNetworkAvailable(context)) mainView.goToUpdateActivity(true);
            else mainView.showToast(context.getString(R.string.no_internet_connection));

        }
    }

}
