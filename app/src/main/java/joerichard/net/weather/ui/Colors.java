package joerichard.net.weather.ui;

import android.graphics.Color;
import android.view.View;

import java.util.HashMap;

/**
 * Created by JOE on 10.04.2015.
 */
public class Colors {

    public static final String CLEAR_NIGHT = "clear-night";
    public static final String CLEAR_DAY = "clear-day";

    int currentBgColor = 0;

    public static HashMap<String, String> bg_colors = new HashMap<>();
    public static HashMap<String, String> border_colors = new HashMap<>();

    public Colors() {
        initializeBgColors();
        initializeBorderColors();
    }

    public void setColors(View layout, View divider, String icon_name) {
        layout.setBackgroundColor(Color.parseColor(bg_colors.get(icon_name)));
        if (divider!=null) {
            divider.setBackgroundColor(Color.parseColor(border_colors.get(icon_name)));
        }
    }

    private void initializeBgColors() {

        bg_colors.put("clear-day", "#e04d3e");
        bg_colors.put("clear-night", "#1A1A1A");
        bg_colors.put("rain", "#2c4063");
        bg_colors.put("snow", "#6F8DAC");
        bg_colors.put("sleet", "#2c3f63");
        bg_colors.put("wind", "#687DB2");
        bg_colors.put("fog", "#6F8DAC");//TEMP
        bg_colors.put("cloudy", "#6f8dac");
        bg_colors.put("partly-cloudy-day", "#6f8dac");
        bg_colors.put("partly-cloudy-night", "#6f8dac");
        bg_colors.put("hail", "#2c3f63");//TEMP
        bg_colors.put("thunderstorm", "#2c3f63");//TEMP
        bg_colors.put("tornado", "#2c3f63");//TEMP

    }

    private void initializeBorderColors() {

        border_colors.put("clear-day", "#CF4B35");
        border_colors.put("clear-night", "#010101");
        border_colors.put("rain", "#1f3152");
        border_colors.put("snow", "#6886A1");
        border_colors.put("sleet", "#294165");
        border_colors.put("wind", "#586DA2");
        border_colors.put("fog", "#6886A1");
        border_colors.put("cloudy", "#6886A1");
        border_colors.put("partly-cloudy-day", "#6886A1");
        border_colors.put("partly-cloudy-night", "#6886A1");
        border_colors.put("hail", "#294165");
        border_colors.put("thunderstorm", "#294165");
        border_colors.put("tornado", "#294165");//TEMP

    }

}
