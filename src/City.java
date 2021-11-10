public class City {
    private String countryName;
    private String cityName;
    private String address;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Our office place{" +
                "country='" + countryName + '\'' +
                ", city='" + cityName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
