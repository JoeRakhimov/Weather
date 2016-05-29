package joerichard.net.weather.presenters;

import android.content.Context;
import android.view.View;

import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;
import joerichard.net.weather.R;
import joerichard.net.weather.data.FileManager;
import joerichard.net.weather.data.WeatherApiClient;
import joerichard.net.weather.models.City;
import joerichard.net.weather.utils.DateUtil;
import joerichard.net.weather.utils.NetworkUtil;
import joerichard.net.weather.views.LoadingView;

/**
 * Created by joe on 30.03.16.
 */
public class LoadingPresenter {

    Context context;
    LoadingView loadingView;
    City city;

    public LoadingPresenter(Context context, LoadingView loadingView) {
        this.context = context;
        this.loadingView = loadingView;
        city = City.newInstance(context.getString(R.string.app_name));
    }

    public void onClick(View v){
        int i = v.getId();
        if (i == R.id.llLoading) {
            updateWeather(false);
        }
    }

    public void updateWeather(boolean updateButtonClicked) {

        if(!NetworkUtil.isNetworkAvailable(context)){
            if(FileManager.isFileExist(context, city.getFilename()) && !DateUtil.isDataExpired(Long.parseLong(FileManager.readFromFile(context, "timestamp"))))
                loadingView.goToMainActivity();
            else
                loadingView.showMessage(context.getString(R.string.no_internet_connection));
            return;
        }

        if(!updateButtonClicked &&
                FileManager.isFileExist(context, city.getFilename()) &&
                !DateUtil.doUpdateData(Long.parseLong(FileManager.readFromFile(context, "timestamp")))){
            loadingView.goToMainActivity();
            return;
        }


        loadingView.showMessage(context.getString(R.string.loading));
        WeatherApiClient.get(city.getFilename(), null, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String json = new String(responseBody);
                FileManager.writeToFile(context, city.getFilename(), json);
                FileManager.writeToFile(context, "timestamp", String.valueOf(System.currentTimeMillis()/1000));
                loadingView.goToMainActivity();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                loadingView.showMessage(context.getString(R.string.erron_on_update)+"\n"+context.getString(R.string.tap_to_update));
            }
        });
    }




}
