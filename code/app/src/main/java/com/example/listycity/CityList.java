package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is to keep a list of city objects
 */
public class CityList{
    private List<City> cities = new ArrayList<>();


    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */

    public void add(City city){
        if (cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Check if a city is present in the list.
     * @param city
     *      This is the City object to check.
     * @return
     *      True if the city is in the list, False otherwise.
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Deletes the city from the list
     * @param city
     *      This is the City object to delete.
     * @throws
     *      IllegalArgumentException if the city is not in the list
     */
    public void delete(City city){
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in list");
        }
        cities.remove(city);
    }

    /**
     * This returns how many cities are in the list
     * @return
     *      The number of the cities in the list
     */
    public int countCities(){
        return cities.size();
    }

}
