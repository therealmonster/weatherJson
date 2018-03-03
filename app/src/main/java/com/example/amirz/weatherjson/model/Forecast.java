
package com.example.amirz.weatherjson.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

   /* @SerializedName("coord")
    @Expose
    private Coord coord; */
    @SerializedName("weather")
    @Expose
    private List<Weather> weather = null;
    /* @SerializedName("base")
    @Expose
    private String base; */
    @SerializedName("main")
    @Expose
    private Main main;

    @SerializedName("dt")
    @Expose
    private Integer dt;
   /*  @SerializedName("sys")
    @Expose
    private Sys sys;*/
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cod")
    @Expose
    private Integer cod;
    /*public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }*/

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }



    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

  public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

  /*  public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }
    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }*/

}
