package com.example.tourguideapp;

public class Informations {
    private String placeName;
    private String cityName;
    private int imgRes;
    private String descraption;
    private String rate;

    public Informations(String placeName, String cityName, int imgRes, String descraption, String rate) {
        this.placeName = placeName;
        this.cityName = cityName;
        this.imgRes = imgRes;
        this.descraption = descraption;
        this.rate = rate;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getDescraption() {
        return descraption;
    }

    public void setDescraption(String descraption) {
        this.descraption = descraption;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
