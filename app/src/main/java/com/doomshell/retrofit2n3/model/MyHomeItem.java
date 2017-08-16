
package com.doomshell.retrofit2n3.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyHomeItem {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private Url url;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MyHomeItem() {
    }

    /**
     * 
     * @param timestamp
     * @param name
     * @param url
     */
    public MyHomeItem(String name, Url url, String timestamp) {
        super();
        this.name = name;
        this.url = url;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
