package org.example;

public class UserAddress {
    private String city;
    private String citySubName;
    private String countryName;

    public String getCity() {
        return city;
    }

    public String getCitySubName() {
        return citySubName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String margedAddress() {
        return city + citySubName + countryName;
    }
}
