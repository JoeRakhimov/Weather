
package joerichard.net.weather.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Daily {

    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("data")
    @Expose
    private List<DailyDatum> data = new ArrayList<DailyDatum>();
    protected final static Object NOT_FOUND_VALUE = new Object();

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
     *     The data
     */
    public List<DailyDatum> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<DailyDatum> data) {
        this.data = data;
    }

    protected boolean declaredProperty(String name, Object value) {
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
                if ("data".equals(name)) {
                    if (value instanceof List) {
                        setData(((List<DailyDatum> ) value));
                    } else {
                        throw new IllegalArgumentException(("property \"data\" is of type \"java.util.List<net.joerichard.weather.models.HourlyDatus>\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("summary".equals(name)) {
            return getSummary();
        } else {
            if ("icon".equals(name)) {
                return getIcon();
            } else {
                if ("data".equals(name)) {
                    return getData();
                } else {
                    return notFoundValue;
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Daily.NOT_FOUND_VALUE);
        if (Daily.NOT_FOUND_VALUE!= value) {
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
