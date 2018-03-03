package com.example.amirz.weatherjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.amirz.weatherjson.model.Forecast;
import com.example.amirz.weatherjson.model.Main;
import com.example.amirz.weatherjson.model.Weather;

import org.w3c.dom.Text;

import java.util.List;
import java.util.concurrent.TimeoutException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String a;
    String b;
    String c;
    String d;
    TextView cityName;
    TextView minTemp;
    TextView maxTemp;
    TextView description;
    String citygotten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        cityName = (TextView)findViewById(R.id.cityName);
        minTemp = (TextView)findViewById(R.id.minTemp);
        maxTemp = (TextView)findViewById(R.id.maxTemp);
        description = (TextView)findViewById(R.id.description);
    }


    private void getData(){
        Call<Forecast>  getDegree = Api.getPostService().getWeatherInfo("Bishkek",Api.api);

        getDegree.enqueue(new Callback<Forecast>() {
            @Override
            public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                Forecast list = response.body();
                 a =list.getName();
                 cityName.setText(a);
                 b = list.getMain().getTempMax().toString();
                 maxTemp.setText("Max temprature: "+b);
                 c = list.getMain().getTempMin().toString();
                 minTemp.setText("Minimun Temprature: "+c);
                 d = list.getWeather().get(0).getDescription().toString();
                 description.setText(d);


                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Error Occured",Toast.LENGTH_SHORT).show();


            }
        });
    }

}
