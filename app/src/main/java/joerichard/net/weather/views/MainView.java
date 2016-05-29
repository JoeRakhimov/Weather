package joerichard.net.weather.views;

import android.support.v7.widget.RecyclerView;

import joerichard.net.weather.adapter.DailyRecyclerAdapter;
import joerichard.net.weather.adapter.HourlyRecyclerAdapter;

/**
 * Created by joe on 30.03.16.
 */
public interface MainView {

    void setNowBackground(String icon);
    void setCity(String city);
    void setUpdateIcon(String icon);
    void setUpdateTime(String updateTime);
    void setCurrentTemp(String currentTemp);
    void setNowIcon(String icon_name);
    void setSummary(String summary);
    void setWindSpeed(String windSpeed);
    void setTodayTemp(String todayTemp);
    void setHourlyWeather(HourlyRecyclerAdapter adapter, RecyclerView.LayoutManager layoutManager);
    void setDailyWeather(DailyRecyclerAdapter adapter, RecyclerView.LayoutManager layoutManager);
    void goToUpdateActivity(boolean updateButtonClicked);
    void showToast(String message);

}
