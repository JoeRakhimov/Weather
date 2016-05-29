
package joerichard.net.weather.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class DailyDatum {

    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("sunriseTime")
    @Expose
    private Integer sunriseTime;
    @SerializedName("sunsetTime")
    @Expose
    private Integer sunsetTime;
    @SerializedName("moonPhase")
    @Expose
    private Double moonPhase;
    @SerializedName("precipIntensity")
    @Expose
    private Double precipIntensity;
    @SerializedName("precipIntensityMax")
    @Expose
    private Double precipIntensityMax;
    @SerializedName("precipIntensityMaxTime")
    @Expose
    private Integer precipIntensityMaxTime;
    @SerializedName("precipProbability")
    @Expose
    private Double precipProbability;
    @SerializedName("precipType")
    @Expose
    private String precipType;
    @SerializedName("temperatureMin")
    @Expose
    private Double temperatureMin;
    @SerializedName("temperatureMinTime")
    @Expose
    private Integer temperatureMinTime;
    @SerializedName("temperatureMax")
    @Expose
    private Double temperatureMax;
    @SerializedName("temperatureMaxTime")
    @Expose
    private Integer temperatureMaxTime;
    @SerializedName("apparentTemperatureMin")
    @Expose
    private Double apparentTemperatureMin;
    @SerializedName("apparentTemperatureMinTime")
    @Expose
    private Integer apparentTemperatureMinTime;
    @SerializedName("apparentTemperatureMax")
    @Expose
    private Double apparentTemperatureMax;
    @SerializedName("apparentTemperatureMaxTime")
    @Expose
    private Integer apparentTemperatureMaxTime;
    @SerializedName("dewPoint")
    @Expose
    private Double dewPoint;
    @SerializedName("humidity")
    @Expose
    private Double humidity;
    @SerializedName("windSpeed")
    @Expose
    private Double windSpeed;
    @SerializedName("windBearing")
    @Expose
    private Integer windBearing;
    @SerializedName("visibility")
    @Expose
    private Double visibility;
    @SerializedName("cloudCover")
    @Expose
    private Double cloudCover;
    @SerializedName("pressure")
    @Expose
    private Double pressure;
    @SerializedName("ozone")
    @Expose
    private Double ozone;
    protected final static Object NOT_FOUND_VALUE = new Object();



    public String getWeekday(String[] weekdays) {
        Date date = new Date((long) time * 1000);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int weekday = c.get(Calendar.DAY_OF_WEEK);
        return weekdays[weekday];
    }

    public String getMinMaxTemperature() {
        return Math.round(temperatureMin) + "°/" + Math.round(temperatureMax) + "°";
    }

    /**
     * @return The time
     */
    public Long getTime() {
        return time;
    }

    /**
     * @param time The time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * @return The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return The sunriseTime
     */
    public Integer getSunriseTime() {
        return sunriseTime;
    }

    /**
     * @param sunriseTime The sunriseTime
     */
    public void setSunriseTime(Integer sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    /**
     * @return The sunsetTime
     */
    public Integer getSunsetTime() {
        return sunsetTime;
    }

    /**
     * @param sunsetTime The sunsetTime
     */
    public void setSunsetTime(Integer sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    /**
     * @return The moonPhase
     */
    public Double getMoonPhase() {
        return moonPhase;
    }

    /**
     * @param moonPhase The moonPhase
     */
    public void setMoonPhase(Double moonPhase) {
        this.moonPhase = moonPhase;
    }

    /**
     * @return The precipIntensity
     */
    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    /**
     * @param precipIntensity The precipIntensity
     */
    public void setPrecipIntensity(Double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    /**
     * @return The precipIntensityMax
     */
    public Double getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    /**
     * @param precipIntensityMax The precipIntensityMax
     */
    public void setPrecipIntensityMax(Double precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    /**
     * @return The precipIntensityMaxTime
     */
    public Integer getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    /**
     * @param precipIntensityMaxTime The precipIntensityMaxTime
     */
    public void setPrecipIntensityMaxTime(Integer precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    /**
     * @return The precipProbability
     */
    public Double getPrecipProbability() {
        return precipProbability;
    }

    /**
     * @param precipProbability The precipProbability
     */
    public void setPrecipProbability(Double precipProbability) {
        this.precipProbability = precipProbability;
    }

    /**
     * @return The precipType
     */
    public String getPrecipType() {
        return precipType;
    }

    /**
     * @param precipType The precipType
     */
    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    /**
     * @return The temperatureMin
     */
    public Double getTemperatureMin() {
        return temperatureMin;
    }

    /**
     * @param temperatureMin The temperatureMin
     */
    public void setTemperatureMin(Double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    /**
     * @return The temperatureMinTime
     */
    public Integer getTemperatureMinTime() {
        return temperatureMinTime;
    }

    /**
     * @param temperatureMinTime The temperatureMinTime
     */
    public void setTemperatureMinTime(Integer temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    /**
     * @return The temperatureMax
     */
    public Double getTemperatureMax() {
        return temperatureMax;
    }

    /**
     * @param temperatureMax The temperatureMax
     */
    public void setTemperatureMax(Double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    /**
     * @return The temperatureMaxTime
     */
    public Integer getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    /**
     * @param temperatureMaxTime The temperatureMaxTime
     */
    public void setTemperatureMaxTime(Integer temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    /**
     * @return The apparentTemperatureMin
     */
    public Double getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    /**
     * @param apparentTemperatureMin The apparentTemperatureMin
     */
    public void setApparentTemperatureMin(Double apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    /**
     * @return The apparentTemperatureMinTime
     */
    public Integer getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    /**
     * @param apparentTemperatureMinTime The apparentTemperatureMinTime
     */
    public void setApparentTemperatureMinTime(Integer apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    /**
     * @return The apparentTemperatureMax
     */
    public Double getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    /**
     * @param apparentTemperatureMax The apparentTemperatureMax
     */
    public void setApparentTemperatureMax(Double apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    /**
     * @return The apparentTemperatureMaxTime
     */
    public Integer getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    /**
     * @param apparentTemperatureMaxTime The apparentTemperatureMaxTime
     */
    public void setApparentTemperatureMaxTime(Integer apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    /**
     * @return The dewPoint
     */
    public Double getDewPoint() {
        return dewPoint;
    }

    /**
     * @param dewPoint The dewPoint
     */
    public void setDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     * @return The humidity
     */
    public Double getHumidity() {
        return humidity;
    }

    /**
     * @param humidity The humidity
     */
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    /**
     * @return The windSpeed
     */
    public Double getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed The windSpeed
     */
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return The windBearing
     */
    public Integer getWindBearing() {
        return windBearing;
    }

    /**
     * @param windBearing The windBearing
     */
    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    /**
     * @return The visibility
     */
    public Double getVisibility() {
        return visibility;
    }

    /**
     * @param visibility The visibility
     */
    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    /**
     * @return The cloudCover
     */
    public Double getCloudCover() {
        return cloudCover;
    }

    /**
     * @param cloudCover The cloudCover
     */
    public void setCloudCover(Double cloudCover) {
        this.cloudCover = cloudCover;
    }

    /**
     * @return The pressure
     */
    public Double getPressure() {
        return pressure;
    }

    /**
     * @param pressure The pressure
     */
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    /**
     * @return The ozone
     */
    public Double getOzone() {
        return ozone;
    }

    /**
     * @param ozone The ozone
     */
    public void setOzone(Double ozone) {
        this.ozone = ozone;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("time".equals(name)) {
            if (value instanceof Integer) {
                setTime(((Long) value));
            } else {
                throw new IllegalArgumentException(("property \"time\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
            }
            return true;
        } else {
            if ("summary".equals(name)) {
                if (value instanceof String) {
                    setSummary(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"summary\" is of type \"java.lang.String\", but got " + value.getClass().toString()));
                }
                return true;
            } else {
                if ("icon".equals(name)) {
                    if (value instanceof String) {
                        setIcon(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"icon\" is of type \"java.lang.String\", but got " + value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("sunriseTime".equals(name)) {
                        if (value instanceof Integer) {
                            setSunriseTime(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"sunriseTime\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("sunsetTime".equals(name)) {
                            if (value instanceof Integer) {
                                setSunsetTime(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"sunsetTime\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("moonPhase".equals(name)) {
                                if (value instanceof Double) {
                                    setMoonPhase(((Double) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"moonPhase\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("precipIntensity".equals(name)) {
                                    if (value instanceof Double) {
                                        setPrecipIntensity(((Double) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"precipIntensity\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("precipIntensityMax".equals(name)) {
                                        if (value instanceof Double) {
                                            setPrecipIntensityMax(((Double) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"precipIntensityMax\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("precipIntensityMaxTime".equals(name)) {
                                            if (value instanceof Integer) {
                                                setPrecipIntensityMaxTime(((Integer) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"precipIntensityMaxTime\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("precipProbability".equals(name)) {
                                                if (value instanceof Double) {
                                                    setPrecipProbability(((Double) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"precipProbability\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("precipType".equals(name)) {
                                                    if (value instanceof String) {
                                                        setPrecipType(((String) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"precipType\" is of type \"java.lang.String\", but got " + value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("temperatureMin".equals(name)) {
                                                        if (value instanceof Double) {
                                                            setTemperatureMin(((Double) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"temperatureMin\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("temperatureMinTime".equals(name)) {
                                                            if (value instanceof Integer) {
                                                                setTemperatureMinTime(((Integer) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"temperatureMinTime\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("temperatureMax".equals(name)) {
                                                                if (value instanceof Double) {
                                                                    setTemperatureMax(((Double) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"temperatureMax\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("temperatureMaxTime".equals(name)) {
                                                                    if (value instanceof Integer) {
                                                                        setTemperatureMaxTime(((Integer) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"temperatureMaxTime\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("apparentTemperatureMin".equals(name)) {
                                                                        if (value instanceof Double) {
                                                                            setApparentTemperatureMin(((Double) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"apparentTemperatureMin\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                        }
                                                                        return true;
                                                                    } else {
                                                                        if ("apparentTemperatureMinTime".equals(name)) {
                                                                            if (value instanceof Integer) {
                                                                                setApparentTemperatureMinTime(((Integer) value));
                                                                            } else {
                                                                                throw new IllegalArgumentException(("property \"apparentTemperatureMinTime\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
                                                                            }
                                                                            return true;
                                                                        } else {
                                                                            if ("apparentTemperatureMax".equals(name)) {
                                                                                if (value instanceof Double) {
                                                                                    setApparentTemperatureMax(((Double) value));
                                                                                } else {
                                                                                    throw new IllegalArgumentException(("property \"apparentTemperatureMax\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                                }
                                                                                return true;
                                                                            } else {
                                                                                if ("apparentTemperatureMaxTime".equals(name)) {
                                                                                    if (value instanceof Integer) {
                                                                                        setApparentTemperatureMaxTime(((Integer) value));
                                                                                    } else {
                                                                                        throw new IllegalArgumentException(("property \"apparentTemperatureMaxTime\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
                                                                                    }
                                                                                    return true;
                                                                                } else {
                                                                                    if ("dewPoint".equals(name)) {
                                                                                        if (value instanceof Double) {
                                                                                            setDewPoint(((Double) value));
                                                                                        } else {
                                                                                            throw new IllegalArgumentException(("property \"dewPoint\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                                        }
                                                                                        return true;
                                                                                    } else {
                                                                                        if ("humidity".equals(name)) {
                                                                                            if (value instanceof Double) {
                                                                                                setHumidity(((Double) value));
                                                                                            } else {
                                                                                                throw new IllegalArgumentException(("property \"humidity\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                                            }
                                                                                            return true;
                                                                                        } else {
                                                                                            if ("windSpeed".equals(name)) {
                                                                                                if (value instanceof Double) {
                                                                                                    setWindSpeed(((Double) value));
                                                                                                } else {
                                                                                                    throw new IllegalArgumentException(("property \"windSpeed\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                                                }
                                                                                                return true;
                                                                                            } else {
                                                                                                if ("windBearing".equals(name)) {
                                                                                                    if (value instanceof Integer) {
                                                                                                        setWindBearing(((Integer) value));
                                                                                                    } else {
                                                                                                        throw new IllegalArgumentException(("property \"windBearing\" is of type \"java.lang.Integer\", but got " + value.getClass().toString()));
                                                                                                    }
                                                                                                    return true;
                                                                                                } else {
                                                                                                    if ("visibility".equals(name)) {
                                                                                                        if (value instanceof Double) {
                                                                                                            setVisibility(((Double) value));
                                                                                                        } else {
                                                                                                            throw new IllegalArgumentException(("property \"visibility\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                                                        }
                                                                                                        return true;
                                                                                                    } else {
                                                                                                        if ("cloudCover".equals(name)) {
                                                                                                            if (value instanceof Double) {
                                                                                                                setCloudCover(((Double) value));
                                                                                                            } else {
                                                                                                                throw new IllegalArgumentException(("property \"cloudCover\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                                                            }
                                                                                                            return true;
                                                                                                        } else {
                                                                                                            if ("pressure".equals(name)) {
                                                                                                                if (value instanceof Double) {
                                                                                                                    setPressure(((Double) value));
                                                                                                                } else {
                                                                                                                    throw new IllegalArgumentException(("property \"pressure\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
                                                                                                                }
                                                                                                                return true;
                                                                                                            } else {
                                                                                                                if ("ozone".equals(name)) {
                                                                                                                    if (value instanceof Double) {
                                                                                                                        setOzone(((Double) value));
                                                                                                                    } else {
                                                                                                                        throw new IllegalArgumentException(("property \"ozone\" is of type \"java.lang.Double\", but got " + value.getClass().toString()));
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
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
        if ("time".equals(name)) {
            return getTime();
        } else {
            if ("summary".equals(name)) {
                return getSummary();
            } else {
                if ("icon".equals(name)) {
                    return getIcon();
                } else {
                    if ("sunriseTime".equals(name)) {
                        return getSunriseTime();
                    } else {
                        if ("sunsetTime".equals(name)) {
                            return getSunsetTime();
                        } else {
                            if ("moonPhase".equals(name)) {
                                return getMoonPhase();
                            } else {
                                if ("precipIntensity".equals(name)) {
                                    return getPrecipIntensity();
                                } else {
                                    if ("precipIntensityMax".equals(name)) {
                                        return getPrecipIntensityMax();
                                    } else {
                                        if ("precipIntensityMaxTime".equals(name)) {
                                            return getPrecipIntensityMaxTime();
                                        } else {
                                            if ("precipProbability".equals(name)) {
                                                return getPrecipProbability();
                                            } else {
                                                if ("precipType".equals(name)) {
                                                    return getPrecipType();
                                                } else {
                                                    if ("temperatureMin".equals(name)) {
                                                        return getTemperatureMin();
                                                    } else {
                                                        if ("temperatureMinTime".equals(name)) {
                                                            return getTemperatureMinTime();
                                                        } else {
                                                            if ("temperatureMax".equals(name)) {
                                                                return getTemperatureMax();
                                                            } else {
                                                                if ("temperatureMaxTime".equals(name)) {
                                                                    return getTemperatureMaxTime();
                                                                } else {
                                                                    if ("apparentTemperatureMin".equals(name)) {
                                                                        return getApparentTemperatureMin();
                                                                    } else {
                                                                        if ("apparentTemperatureMinTime".equals(name)) {
                                                                            return getApparentTemperatureMinTime();
                                                                        } else {
                                                                            if ("apparentTemperatureMax".equals(name)) {
                                                                                return getApparentTemperatureMax();
                                                                            } else {
                                                                                if ("apparentTemperatureMaxTime".equals(name)) {
                                                                                    return getApparentTemperatureMaxTime();
                                                                                } else {
                                                                                    if ("dewPoint".equals(name)) {
                                                                                        return getDewPoint();
                                                                                    } else {
                                                                                        if ("humidity".equals(name)) {
                                                                                            return getHumidity();
                                                                                        } else {
                                                                                            if ("windSpeed".equals(name)) {
                                                                                                return getWindSpeed();
                                                                                            } else {
                                                                                                if ("windBearing".equals(name)) {
                                                                                                    return getWindBearing();
                                                                                                } else {
                                                                                                    if ("visibility".equals(name)) {
                                                                                                        return getVisibility();
                                                                                                    } else {
                                                                                                        if ("cloudCover".equals(name)) {
                                                                                                            return getCloudCover();
                                                                                                        } else {
                                                                                                            if ("pressure".equals(name)) {
                                                                                                                return getPressure();
                                                                                                            } else {
                                                                                                                if ("ozone".equals(name)) {
                                                                                                                    return getOzone();
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
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public <T> T get(String name) {
        Object value = declaredPropertyOrNotFound(name, DailyDatum.NOT_FOUND_VALUE);
        if (DailyDatum.NOT_FOUND_VALUE != value) {
            return ((T) value);
        } else {
            throw new IllegalArgumentException((("property \"" + name) + "\" is not defined"));
        }
    }

    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            throw new IllegalArgumentException((("property \"" + name) + "\" is not defined"));
        }
    }

}
