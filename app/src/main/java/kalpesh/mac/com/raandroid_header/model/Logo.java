package kalpesh.mac.com.raandroid_header.model;

/**
 * Created by kalpesh on 05/09/2015.
 */

import com.google.gson.annotations.Expose;


public class Logo {

    @Expose
    private String StandardResolutionURL;

    /**
     * @return The StandardResolutionURL
     */
    public String getStandardResolutionURL() {
        return StandardResolutionURL;
    }

    /**
     * @param StandardResolutionURL The StandardResolutionURL
     */
    public void setStandardResolutionURL(String StandardResolutionURL) {
        this.StandardResolutionURL = StandardResolutionURL;
    }
}