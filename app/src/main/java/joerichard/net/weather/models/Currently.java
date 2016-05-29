
package joerichard.net.weather.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Currently {

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("precipIntensity")
    @Expose
    private Double precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private Double precipProbability;
    @SerializedName("precipType")
    @Expose
    private String precipType;
    @SerializedName("temperature")
    @Expose
    private Double temperature;
    @SerializedName("apparentTemperature")
    @Expose
    private Double apparentTemperature;
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

    /**
     * 
     * @return
     *     The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The precipIntensity
     */
    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    /**
     * 
     * @param precipIntensity
     *     The precipIntensity
     */
    public void setPrecipIntensity(Double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    /**
     * 
     * @return
     *     The precipProbability
     */
    public Double getPrecipProbability() {
        return precipProbability;
    }

    /**
     * 
     * @param precipProbability
     *     The precipProbability
     */
    public void setPrecipProbability(Double precipProbability) {
        this.precipProbability = precipProbability;
    }

    /**
     * 
     * @return
     *     The precipType
     */
    public String getPrecipType() {
        return precipType;
    }

    /**
     * 
     * @param precipType
     *     The precipType
     */
    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The temperature
     */
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    /**
     * 
     * @return
     *     The apparentTemperature
     */
    public Double getApparentTemperature() {
        return apparentTemperature;
    }

    /**
     * 
     * @param apparentTemperature
     *     The apparentTemperature
     */
    public void setApparentTemperature(Double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    /**
     * 
     * @return
     *     The dewPoint
     */
    public Double getDewPoint() {
        return dewPoint;
    }

    /**
     * 
     * @param dewPoint
     *     The dewPoint
     */
    public void setDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    public Double getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    /**
     * 
     * @return
     *     The windSpeed
     */
    public Double getWindSpeed() {
        return windSpeed;
    }

    /**
     * 
     * @param windSpeed
     *     The windSpeed
     */
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * 
     * @return
     *     The windBearing
     */
    public Integer getWindBearing() {
        return windBearing;
    }

    /**
     * 
     * @param windBearing
     *     The windBearing
     */
    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public Double getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The cloudCover
     */
    public Double getCloudCover() {
        return cloudCover;
    }

    /**
     * 
     * @param cloudCover
     *     The cloudCover
     */
    public void setCloudCover(Double cloudCover) {
        this.cloudCover = cloudCover;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    public Double getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The ozone
     */
    public Double getOzone() {
        return ozone;
    }

    /**
     * 
     * @param ozone
     *     The ozone
     */
    public void setOzone(Double ozone) {
        this.ozone = ozone;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("time".equals(name)) {
            if (value instanceof Integer) {
                setTime(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"time\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("summary".equals(name)) {
                if (value instanceof String) {
                    setSummary(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"summary\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("icon".equals(name)) {
                    if (value instanceof String) {
                        setIcon(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"icon\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("precipIntensity".equals(name)) {
                        if (value instanceof Double) {
                            setPrecipIntensity(((Double) value));
                        } else {
                            throw new IllegalArgumentException(("property \"precipIntensity\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("precipProbability".equals(name)) {
                            if (value instanceof Double) {
                                setPrecipProbability(((Double) value));
                            } else {
                                throw new IllegalArgumentException(("property \"precipProbability\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("precipType".equals(name)) {
                                if (value instanceof String) {
                                    setPrecipType(((String) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"precipType\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("temperature".equals(name)) {
                                    if (value instanceof Double) {
                                        setTemperature(((Double) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"temperature\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("apparentTemperature".equals(name)) {
                                        if (value instanceof Double) {
                                            setApparentTemperature(((Double) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"apparentTemperature\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("dewPoint".equals(name)) {
                                            if (value instanceof Double) {
                                                setDewPoint(((Double) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"dewPoint\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("humidity".equals(name)) {
                                                if (value instanceof Double) {
                                                    setHumidity(((Double) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"humidity\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("windSpeed".equals(name)) {
                                                    if (value instanceof Double) {
                                                        setWindSpeed(((Double) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"windSpeed\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("windBearing".equals(name)) {
                                                        if (value instanceof Integer) {
                                                            setWindBearing(((Integer) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"windBearing\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("visibility".equals(name)) {
                                                            if (value instanceof Double) {
                                                                setVisibility(((Double) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"visibility\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("cloudCover".equals(name)) {
                                                                if (value instanceof Double) {
                                                                    setCloudCover(((Double) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"cloudCover\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("pressure".equals(name)) {
                                                                    if (value instanceof Double) {
                                                                        setPressure(((Double) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"pressure\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("ozone".equals(name)) {
                                                                        if (value instanceof Double) {
                                                                            setOzone(((Double) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"ozone\" is of type \"java.lang.Double\", but got "+ value.getClass().toString()));
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
                    if ("precipIntensity".equals(name)) {
                        return getPrecipIntensity();
                    } else {
                        if ("precipProbability".equals(name)) {
                            return getPrecipProbability();
                        } else {
                            if ("precipType".equals(name)) {
                                return getPrecipType();
                            } else {
                                if ("temperature".equals(name)) {
                                    return getTemperature();
                                } else {
                                    if ("apparentTemperature".equals(name)) {
                                        return getApparentTemperature();
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

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Currently.NOT_FOUND_VALUE);
        if (Currently.NOT_FOUND_VALUE!= value) {
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
