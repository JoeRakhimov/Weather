
package joerichard.net.weather.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Flags {

    @SerializedName("sources")
    @Expose
    private List<String> sources = new ArrayList<String>();
    @SerializedName("isd-stations")
    @Expose
    private List<String> isdStations = new ArrayList<String>();
    @SerializedName("madis-stations")
    @Expose
    private List<String> madisStations = new ArrayList<String>();
    @SerializedName("units")
    @Expose
    private String units;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The sources
     */
    public List<String> getSources() {
        return sources;
    }

    /**
     * 
     * @param sources
     *     The sources
     */
    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    /**
     * 
     * @return
     *     The isdStations
     */
    public List<String> getIsdStations() {
        return isdStations;
    }

    /**
     * 
     * @param isdStations
     *     The isd-stations
     */
    public void setIsdStations(List<String> isdStations) {
        this.isdStations = isdStations;
    }

    /**
     * 
     * @return
     *     The madisStations
     */
    public List<String> getMadisStations() {
        return madisStations;
    }

    /**
     * 
     * @param madisStations
     *     The madis-stations
     */
    public void setMadisStations(List<String> madisStations) {
        this.madisStations = madisStations;
    }

    /**
     * 
     * @return
     *     The units
     */
    public String getUnits() {
        return units;
    }

    /**
     * 
     * @param units
     *     The units
     */
    public void setUnits(String units) {
        this.units = units;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("sources".equals(name)) {
            if (value instanceof List) {
                setSources(((List<String> ) value));
            } else {
                throw new IllegalArgumentException(("property \"sources\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("isd-stations".equals(name)) {
                if (value instanceof List) {
                    setIsdStations(((List<String> ) value));
                } else {
                    throw new IllegalArgumentException(("property \"isd-stations\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("madis-stations".equals(name)) {
                    if (value instanceof List) {
                        setMadisStations(((List<String> ) value));
                    } else {
                        throw new IllegalArgumentException(("property \"madis-stations\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("units".equals(name)) {
                        if (value instanceof String) {
                            setUnits(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"units\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("sources".equals(name)) {
            return getSources();
        } else {
            if ("isd-stations".equals(name)) {
                return getIsdStations();
            } else {
                if ("madis-stations".equals(name)) {
                    return getMadisStations();
                } else {
                    if ("units".equals(name)) {
                        return getUnits();
                    } else {
                        return notFoundValue;
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Flags.NOT_FOUND_VALUE);
        if (Flags.NOT_FOUND_VALUE!= value) {
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
