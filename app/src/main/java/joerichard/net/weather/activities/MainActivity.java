package joerichard.net.weather.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import joerichard.net.weather.R;
import joerichard.net.weather.adapter.DailyRecyclerAdapter;
import joerichard.net.weather.adapter.HourlyRecyclerAdapter;
import joerichard.net.weather.presenters.MainPresenter;
import joerichard.net.weather.ui.Colors;
import joerichard.net.weather.ui.GlyphIcon;
import joerichard.net.weather.views.MainView;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener{

    MainPresenter mainPresenter;
    GlyphIcon glyphIcon;
    Colors colors;

    AdView adView;
    LinearLayout llNow;
    View vNowDivider;
    TextView tvCity;
    TextView tvUpdateIcon;
    TextView tvUpdateTime;
    TextView tvCurrentTemp;
    TextView tvNowIcon;
    TextView tvSummary;
    TextView tvWindSpeed;
    TextView tvTodayTemp;

    RecyclerView rvHourly;
    RecyclerView rvDaily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        glyphIcon = new GlyphIcon(this);
        colors = new Colors();

        llNow = (LinearLayout) findViewById(R.id.llNow);
        vNowDivider = (View) findViewById(R.id.vNowDivider);
        tvCity = (TextView) findViewById(R.id.tvCity);
        tvUpdateTime = (TextView) findViewById(R.id.tvUpdateTime);
        tvUpdateTime.setOnClickListener(this);
        tvUpdateIcon = (TextView) findViewById(R.id.tvUpdateIcon);
        tvUpdateIcon.setOnClickListener(this);
        tvCurrentTemp = (TextView) findViewById(R.id.tvCurrentTemp);
        tvNowIcon = (TextView) findViewById(R.id.tvNowIcon);
        tvSummary = (TextView) findViewById(R.id.tvSummary);
        tvWindSpeed = (TextView) findViewById(R.id.tvWindSpeed);
        tvTodayTemp = (TextView) findViewById(R.id.tvTodayTemp);

        rvHourly = (RecyclerView) findViewById(R.id.rvHourly);
        rvDaily = (RecyclerView) findViewById(R.id.rvDaily);

        mainPresenter = new MainPresenter(this, this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.init();
        showAd();
    }

    private void showAd() {
        // Load an ad into the AdMob banner view.
        adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                adView.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public void setNowBackground(String icon) {
        colors.setColors(llNow, vNowDivider, icon);
    }

    @Override
    public void setCity(String city) {
        tvCity.setText(city);
    }

    @Override
    public void setUpdateIcon(String icon) {
        glyphIcon.setGlyphIcon(tvUpdateIcon, icon);
    }

    @Override
    public void setUpdateTime(String updateTime) {
        tvUpdateTime.setText(updateTime);
    }

    @Override
    public void setCurrentTemp(String currentTemp) {
        tvCurrentTemp.setText(currentTemp);
    }

    @Override
    public void setNowIcon(String icon_name) {
        glyphIcon.setGlyphIcon(tvNowIcon, icon_name);
    }

    @Override
    public void setSummary(String summary) {
        tvSummary.setText(summary);
    }

    @Override
    public void setWindSpeed(String windSpeed) {
        tvWindSpeed.setText(windSpeed);
    }

    @Override
    public void setTodayTemp(String todayTemp) {
        tvTodayTemp.setText(todayTemp);
    }

    @Override
    public void setHourlyWeather(HourlyRecyclerAdapter adapter, RecyclerView.LayoutManager layoutManager) {
        rvHourly.setAdapter(adapter);
        rvHourly.setLayoutManager(layoutManager);
    }

    @Override
    public void setDailyWeather(DailyRecyclerAdapter adapter, RecyclerView.LayoutManager layoutManager) {
        rvDaily.setAdapter(adapter);
        rvDaily.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View v) {
        mainPresenter.onClick(v);
    }

    @Override
    public void goToUpdateActivity(boolean updateButtonClicked) {
        startActivity(new Intent(MainActivity.this, LoadingActivity.class).putExtra("updateButtonClicked", updateButtonClicked));
        finish();
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

}
