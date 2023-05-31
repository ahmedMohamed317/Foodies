package com.example.craveapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MealByNameResponse {
    @SerializedName("meals")
    private List<Meal> meals;

    public List<Meal> getMeals() {
        return meals;
    }
}
