package joerichard.net.weather.utils;

import android.content.Context;

import com.inaka.galgo.Galgo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import joerichard.net.weather.R;
import joerichard.net.weather.app.AppConfig;

/**
 * Created by Joe on 3/4/2016.
 */
public class DateUtil {

    public static String timezone;

    public static final int SECOND = 60;
    public static final int MINUTE = SECOND;
    public static final int HOUR = 60 * MINUTE;
    public static final int DAY = 24 * HOUR;
    public static final int WEEK = 7 * DAY;
    public static final int MONTH = 30 * DAY;
    public static final int YEAR = 365 * DAY;

    private static long getUnixSeconds(Date date) {
        return date.getTime() / 1000L;
    }

    public static String getTimeAgo(Context context, long activeUnix) {

        Date date = new Date();
        long currentUnix = getUnixSeconds(date);

        long interval = currentUnix - activeUnix;
        Galgo.log("interval:" + interval);

        if (interval > YEAR) {
            int years = (int) (interval / YEAR);
            return years + context.getString(R.string.year_abr);
        } else if (interval > MONTH) {
            int months = (int) (interval / MONTH);
            return months + context.getString(R.string.month_abr);
        } else if (interval > WEEK) {
            int weeks = (int) (interval / WEEK);
            return weeks + context.getString(R.string.week_abr);
        } else if (interval > DAY) {
            int days = (int) (interval / DAY);
            return days + context.getString(R.string.day_abr);
        } else if (interval > HOUR) {
            int hours = (int) (interval / HOUR);
            return hours + context.getString(R.string.hour_abr);
        } else if (interval > MINUTE) {
            int minutes = (int) (interval / MINUTE);
            return minutes + context.getString(R.string.minite_abr);
        } else {
            return "";
        }

    }

    public static boolean doUpdateData(long timestamp){
        return getElapsedSeconds(timestamp)> AppConfig.DATA_UPDATE_TIME;
    }

    public static boolean isDataExpired(long timestamp){
        return getElapsedSeconds(timestamp)> AppConfig.DATA_EXPIRY_TIME;
    }

    private static Date getDate(long epoch){
        return new Date(epoch*1000);
    }

    public static String getDDM(long time){
        SimpleDateFormat sdf = new SimpleDateFormat("d/M");
        sdf.setTimeZone(TimeZone.getTimeZone(timezone));
        return sdf.format(getDate(time));
    }

    public static String getHmm(long time){
        SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
        sdf.setTimeZone(TimeZone.getTimeZone(timezone));
        return sdf.format(getDate(time));
    }

    public static boolean isDayPassed(long time){
        Date date = getDate(time);
        Date todayMidnight = getTodayMidnight();
        return date.before(todayMidnight);
    }

    public static boolean isHourPassed(long time){
        return time<System.currentTimeMillis()/1000;
    }

    private static Date getTodayMidnight() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static long getElapsedSeconds(long time){
        return (long)(System.currentTimeMillis()/1000)-time;
    }

}
