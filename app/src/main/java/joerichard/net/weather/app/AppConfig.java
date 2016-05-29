package joerichard.net.weather.app;

import joerichard.net.weather.models.CityEnum;
import joerichard.net.weather.utils.DateUtil;

/**
 * Created by User on 28.05.2016.
 */
public class AppConfig {

    public static final CityEnum CITY = CityEnum.TOKYO;
    public static final long DATA_EXPIRY_TIME = 2 * DateUtil.DAY;
    public static final long DATA_UPDATE_TIME = DateUtil.HOUR;

}
