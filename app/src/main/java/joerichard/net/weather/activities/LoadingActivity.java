package joerichard.net.weather.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import joerichard.net.weather.R;
import joerichard.net.weather.models.City;
import joerichard.net.weather.presenters.LoadingPresenter;
import joerichard.net.weather.ui.GlyphIcon;
import joerichard.net.weather.utils.LocaleHelper;
import joerichard.net.weather.views.LoadingView;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LoadingActivity extends AppCompatActivity implements LoadingView{

    LoadingPresenter loadingPresenter;
    GlyphIcon glyphIcon;

    TextView tvUpdate;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        TextView tvUpdate = (TextView) findViewById(R.id.tvUpdate);
        glyphIcon = new GlyphIcon(getApplicationContext());
        glyphIcon.setGlyphIcon(tvUpdate, GlyphIcon.CLOUD_REFRESH);

        tvMessage = (TextView) findViewById(R.id.tvMessage);

        City city = City.newInstance(getString(R.string.app_name));
        LocaleHelper.setLocale(this, city.getLang());
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadingPresenter = new LoadingPresenter(this, this);
        boolean updateButtonClicked = getIntent().hasExtra("updateButtonClicked") && getIntent().getBooleanExtra("updateButtonClicked", false);
        loadingPresenter.updateWeather(updateButtonClicked);
    }

    public void update(View v){
        loadingPresenter.onClick(v);
    }

    @Override
    public void goToMainActivity() {
        startActivity(new Intent(LoadingActivity.this, MainActivity.class));
        finish();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public void showMessage(String message) {
        tvMessage.setText(message);
    }

}
