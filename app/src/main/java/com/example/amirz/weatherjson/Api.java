package com.example.amirz.weatherjson;

import com.example.amirz.weatherjson.model.Forecast;
import com.example.amirz.weatherjson.model.Main;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by amirz on 3/2/2018.
 */

public class Api {
    private  static final String url ="http://api.openweathermap.org/data/2.5/";
    public   static final String api ="59b3a0d4a73786ca3f14fa11c8f8f31c";
    public static PostService PostService = null;


    public static PostService getPostService(){
        if(PostService ==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            PostService =retrofit.create(PostService.class);

        }
        return PostService;
    }
    public interface PostService {

            @GET("weather")
        Call<Forecast> getWeatherInfo(@Query("q")String cityName, @Query("appid")String appid);



    }

}

