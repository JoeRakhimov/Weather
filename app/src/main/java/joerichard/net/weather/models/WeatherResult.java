
package joerichard.net.weather.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class WeatherResult {

    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("currently")
    @Expose
    private Currently currently;
    @SerializedName("hourly")
    @Expose
    private Hourly hourly;
    @SerializedName("daily")
    @Expose
    private Daily daily;
    @SerializedName("flags")
    @Expose
    private Flags flags;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * 
     * @return
     *     The offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 
     * @return
     *     The currently
     */
    public Currently getCurrently() {
        return currently;
    }

    /**
     * 
     * @param currently
     *     The currently
     */
    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    /**
     * 
     * @return
     *     The hourly
     */
    public Hourly getHourly() {
        return hourly;
    }

    /**
     * 
     * @param hourly
     *     The hourly
     */
    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    /**
     * 
     * @return
     *     The daily
     */
    public Daily getDaily() {
        return daily;
    }

    /**
     * 
     * @param daily
     *     The daily
     */
    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    /**
     * 
     * @return
     *     The flags
     */
    public Flags getFlags() {
        return flags;
    }

    /**
     * 
     * @param flags
     *     The flags
     */
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("latitude".equals(name)) {
            if (value instanceof Double) {
                setLatitude(((Double) value));
            } else {
                throw new IllegalArgumentException(("property \"latitude\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("longitude".equals(name)) {
                if (value instanceof Double) {
                    setLongitude(((Double) value));
                } else {
                    throw new IllegalArgumentException(("property \"longitude\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("timezone".equals(name)) {
                    if (value instanceof String) {
                        setTimezone(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"timezone\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("offset".equals(name)) {
                        if (value instanceof Integer) {
                            setOffset(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"offset\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("currently".equals(name)) {
                            if (value instanceof Currently) {
                                setCurrently(((Currently) value));
                            } else {
                                throw new IllegalArgumentException(("property \"currently\" is of type \"net.joerichard.weather.models.Currently\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("hourly".equals(name)) {
                                if (value instanceof Hourly) {
                                    setHourly(((Hourly) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"hourly\" is of type \"net.joerichard.weather.models.Hourly\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("daily".equals(name)) {
                                    if (value instanceof Daily) {
                                        setDaily(((Daily) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"daily\" is of type \"net.joerichard.weather.models.Daily\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("flags".equals(name)) {
                                        if (value instanceof Flags) {
                                            setFlags(((Flags) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"flags\" is of type \"net.joerichard.weather.models.Flags\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("latitude".equals(name)) {
            return getLatitude();
        } else {
            if ("longitude".equals(name)) {
                return getLongitude();
            } else {
                if ("timezone".equals(name)) {
                    return getTimezone();
                } else {
                    if ("offset".equals(name)) {
                        return getOffset();
                    } else {
                        if ("currently".equals(name)) {
                            return getCurrently();
                        } else {
                            if ("hourly".equals(name)) {
                                return getHourly();
                            } else {
                                if ("daily".equals(name)) {
                                    return getDaily();
                                } else {
                                    if ("flags".equals(name)) {
                                        return getFlags();
                                    } else {
                                        return notFoundValue;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, WeatherResult.NOT_FOUND_VALUE);
        if (WeatherResult.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

}
