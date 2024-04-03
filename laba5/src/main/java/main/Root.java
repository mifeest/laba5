package main;

import locality.City;

import java.util.List;

public class Root {
    private String name;
    private List<City> city;

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public List<City> getCity() {
        return city;
    }


    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
