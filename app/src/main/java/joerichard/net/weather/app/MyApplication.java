package joerichard.net.weather.app;

import android.app.Application;

import joerichard.net.weather.R;
import joerichard.net.weather.models.City;
import joerichard.net.weather.utils.LocaleHelper;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by joe on 30.03.16.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/GloberBold.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );

        City city = City.newInstance(getString(R.string.app_name));
        LocaleHelper.onCreate(this, city.getLang());
    }


}
