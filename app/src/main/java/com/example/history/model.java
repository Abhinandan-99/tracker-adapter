package com.example.history;

public class model {

    String date,time,from_coor,to_coor,distance;

    model()
    {

    }

    public model(String date, String time, String from_coor, String to_coor, String distance) {
        this.date = date;
        this.time = time;
        this.from_coor = from_coor;
        this.to_coor = to_coor;
        this.distance = distance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom_coor() {
        return from_coor;
    }

    public void setFrom_coor(String from_coor) {
        this.from_coor = from_coor;
    }

    public String getTo_coor() {
        return to_coor;
    }

    public void setTo_coor(String to_coor) {
        this.to_coor = to_coor;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
