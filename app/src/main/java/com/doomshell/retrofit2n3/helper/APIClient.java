package com.doomshell.retrofit2n3.helper;

import com.doomshell.retrofit2n3.model.MyHeroes;
import com.doomshell.retrofit2n3.model.MyHomeItem;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Anuj on 7/12/2017.
 */

public interface APIClient {

    @GET("heroes.php")
    Call<MyHeroes> doGetUserList();
}
