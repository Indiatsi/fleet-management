package com.example.myapplication.Model;

public class Tracking {
    private String email;
    private String uid;
    private String lat;
    private String lng;

    public Tracking() {

    }

    public Tracking(String email, String uid, String lat, String lng) {

        this.email = email;
        this.uid = uid;
        this.lat = lat;
        this.lng = lng;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}

