package joerichard.net.weather.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by JOE on 10.04.2015.
 */
public class GlyphIcon {

    public static final String CLOUD_REFRESH = "cloud-refresh";
    public static final String CLEAR_DAY = "clear-day";

    Typeface typeface;

    static HashMap<String, String> icons = new HashMap<>();

    public GlyphIcon(Context context)
    {
        typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Climacons.ttf");
        initializeIconCodes();
    }

    public void setGlyphIcon(TextView tv, String icon_name)
    {
        tv.setText(icons.get(icon_name));
        tv.setTypeface(typeface);
    }

    private void initializeIconCodes() {

        icons.put("clear-day","I");
        icons.put("clear-night","N");
        icons.put("rain","$");
        icons.put("snow","9");
        icons.put("sleet","0");
        icons.put("wind","B");
        icons.put("fog","<");
        icons.put("cloudy","!");
        icons.put("partly-cloudy-day","\"");
        icons.put("partly-cloudy-night","#");
        icons.put("hail","3");
        icons.put("thunderstorm","F");
        icons.put("tornado","X");

        // icons used by other parts of application
        icons.put("cloud-refresh", "h");

    }

}
