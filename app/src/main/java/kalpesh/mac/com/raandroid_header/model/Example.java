package kalpesh.mac.com.raandroid_header.model;

/**
 * Created by kalpesh on 05/09/2015.
 */
import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;


public class Example {

    @Expose
    private String ShortResultText;
    @Expose
    private List<Restaurant> Restaurants = new ArrayList<Restaurant>();


    public String getShortResultText() {
        return ShortResultText;
    }

    /**
     *
     * @param ShortResultText
     * The ShortResultText
     */
    public void setShortResultText(String ShortResultText) {
        this.ShortResultText = ShortResultText;
    }

    /**
     *
     * @return
     * The Restaurants
     */
    public List<Restaurant> getRestaurants() {
        return Restaurants;
    }

    /**
     *
     * @param Restaurants
     * The Restaurants
     */
    public void setRestaurants(List<Restaurant> Restaurants) {
        this.Restaurants = Restaurants;
    }


}