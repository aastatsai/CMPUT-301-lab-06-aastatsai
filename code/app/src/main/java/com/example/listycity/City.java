package com.example.listycity;


/**
 * This class s to define a City
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares the current city's name with the name of the other city.
     * @param o
     *      This is the object to be compared.
     * @return
     *      0 if two cities are equal; Negative int if it's less; Positive int if greater than the other.
     */
    @Override
    public int compareTo(City o){
        return this.city.compareTo(o.getCityName());
    }

    /**
     *
     * @param o
     *      This is the object to be compare
     * @return
     *      True if both cities and provinces match, False otherwise
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City cityObj = (City) o;
        return this.city.equals(cityObj.city) && this.province.equals(cityObj.province);
    }

    /**
     * This returns a hash code for the city by its name and province
     * @return
     *      the hash code of the city
     */
    @Override
    public int hashCode(){
        return this.city.hashCode() + this.province.hashCode();
    }
}
