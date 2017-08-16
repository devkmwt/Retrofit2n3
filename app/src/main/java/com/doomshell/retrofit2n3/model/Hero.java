
package com.doomshell.retrofit2n3.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hero {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageurl")
    @Expose
    private String imageurl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hero() {
    }

    /**
     * 
     * @param name
     * @param imageurl
     */
    public Hero(String name, String imageurl) {
        super();
        this.name = name;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

}
