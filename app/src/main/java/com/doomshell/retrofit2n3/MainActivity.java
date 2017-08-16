package com.doomshell.retrofit2n3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.doomshell.retrofit2n3.helper.APIClient;
import com.doomshell.retrofit2n3.model.Hero;
import com.doomshell.retrofit2n3.model.MyHeroes;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Retrofit retrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient.Builder().build();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.simplifiedcoding.net/demos/view-flipper/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        APIClient apiClient=retrofit.create(APIClient.class);

        Call<MyHeroes> neha=apiClient.doGetUserList();

        neha.enqueue(new Callback<MyHeroes>() {
            @Override
            public void onResponse(Call<MyHeroes> call, Response<MyHeroes> response) {
                List<Hero> heros = response.body().getHeroes();
                String s=heros.get(1).getName();
                Toast.makeText(MainActivity.this, ""+s, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<MyHeroes> call, Throwable t) {
                Toast.makeText(MainActivity.this, "fail "+call.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
