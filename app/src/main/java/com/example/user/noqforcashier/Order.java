package com.example.user.noqforcashier;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String mLocation;
    private Date mDate;
    private String mTime;
    private String mCafe;
    private int mSum;
    private ArrayList<Meal> listOfMeals;
    public Order(String time, String location, String cafe, int sum,
                 Date date, ArrayList<Meal> meals){
        mLocation=location;
        mTime=time;
        mCafe=cafe;
        mSum=sum;
        mDate=date;
        listOfMeals=meals;
    }
    public Order(){}


    public int getmSum() {
        return mSum;
    }

    public Date getmDate() {
        return mDate;
    }

    public String getmCafe() {
        return mCafe;
    }

    public ArrayList<Meal> getListOfMeals() {
        return listOfMeals;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmTime() {
        return mTime;
    }
}
