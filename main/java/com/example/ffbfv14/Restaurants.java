package com.example.ffbfv14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Restaurants extends AppCompatActivity {

    //Widgets
    RecyclerView recyclerRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        recyclerRestaurants = findViewById(R.id.recyclerRestaurants);
    }
}