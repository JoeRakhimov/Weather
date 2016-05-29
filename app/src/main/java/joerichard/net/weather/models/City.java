package joerichard.net.weather.models;

/**
 * Created by User on 28.05.2016.
 */
public class City {

    CityEnum city;
    String name;
    String location;
    String lang;
    String unit;
    String filename;

//    public static City newInstance(CityEnum city) {
//        switch (city) {
//            case TASHKENT:
//                return new City(city, "Tashkent", "41.3112,69.2797", "si", "ru", "tashkent.json");
//            case ASTANA:
//                return new City(city, "Astana", "51.1282,71.4319", "si", "ru", "astana.json");
//            case MOSCOW:
//                return new City(city, "Moscow", "55.7515,37.6218", "si", "ru", "moscow.json");
//            case TOKYO:
//                return new City(city, "Tokyo", "35.6771,139.7630", "si", "en", "tokyo.json");
//            case NEWYORK:
//                return new City(city, "New York", "40.7104,-74.0066", "us", "en", "newyork.json");
//            case SEOUL:
//                return new City(city, "Seoul", "37.5452,126.9905", "si", "en", "seoul.json");
//            case PARIS:
//                return new City(city, "Paris", "48.8635,2.3289", "si", "en", "paris.json");
//            case BEIJING:
//                return new City(city, "Beijing", "39.9048,116.4037", "si", "en", "beijing.json");
//            case SAOPAULO:
//                return new City(city, "Sao Paolo", "-23.5487,-46.6352", "si", "en", "saopaolo.json");
//            case MANILA:
//                return new City(city, "Manila", "14.5990,120.9837", "si", "en", "manila.json");
//            case TEST:
//                return new City(city, "Test", "61.2082,-149.7976", "si", "en", "test.json");
//        }
//        return null;
//    }

    public static City newInstance(String city) {
        switch (city) {
            case "Tashkent":
                return new City(CityEnum.TASHKENT, city, "41.3112,69.2797", "si", "ru", "tashkent.json");
            case "Astana":
                return new City(CityEnum.ASTANA, city, "51.1282,71.4319", "si", "ru", "astana.json");
            case "Moscow":
                return new City(CityEnum.MOSCOW, city, "55.7515,37.6218", "si", "ru", "moscow.json");
            case "Tokyo":
                return new City(CityEnum.TOKYO, city, "35.6771,139.7630", "si", "en", "tokyo.json");
            case "New York":
                return new City(CityEnum.NEWYORK, city, "40.7104,-74.0066", "us", "en", "newyork.json");
            case "Seoul":
                return new City(CityEnum.SEOUL, city, "37.5452,126.9905", "si", "en", "seoul.json");
            case "Paris":
                return new City(CityEnum.PARIS, city, "48.8635,2.3289", "si", "en", "paris.json");
            case "Beijing":
                return new City(CityEnum.BEIJING, city, "39.9048,116.4037", "si", "en", "beijing.json");
            case "Sao Paulo":
                return new City(CityEnum.SAOPAULO, city, "-23.5487,-46.6352", "si", "en", "saopaolo.json");
            case "Manila":
                return new City(CityEnum.MANILA, city, "14.5990,120.9837", "si", "en", "manila.json");
            case "Test":
                return new City(CityEnum.TEST, city, "61.2082,-149.7976", "si", "en", "test.json");
        }
        return null;
    }

    public City(CityEnum city, String name, String location, String unit, String lang, String filename) {
        this.city = city;
        this.name = name;
        this.location = location;
        this.lang = lang;
        this.unit = unit;
        this.filename = filename;
    }

    public CityEnum getCity() {
        return city;
    }

    public void setCity(CityEnum city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
