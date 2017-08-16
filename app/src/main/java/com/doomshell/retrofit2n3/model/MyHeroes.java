
package com.doomshell.retrofit2n3.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyHeroes {

    @SerializedName("heroes")
    @Expose
    private List<Hero> heroes = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MyHeroes() {
    }

    /**
     * 
     * @param heroes
     */
    public MyHeroes(List<Hero> heroes) {
        super();
        this.heroes = heroes;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

}
