
package com.doomshell.retrofit2n3.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url {

    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("large")
    @Expose
    private String large;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url() {
    }

    /**
     * 
     * @param small
     * @param large
     * @param medium
     */
    public Url(String small, String medium, String large) {
        super();
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

}
