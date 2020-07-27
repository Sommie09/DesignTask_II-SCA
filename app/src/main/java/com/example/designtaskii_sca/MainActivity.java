package com.example.designtaskii_sca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ClickInterface{
    List<Car> cars;
    private Context mContext;
    CarAdapter mCarAdapter;
    private ViewPager2 mViewPager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCarAdapter = new CarAdapter(cars, mContext, this,mViewPager2 );

        cars = new ArrayList<>();
        cars.add(new Car(4.5, "18 Deals", "Blue Kia Cerato", "From $199 / day", R.drawable.blue_car));
        cars.add(new Car(4.8, "10 Deals", "Red Tesla", "From $179 / day", R.drawable.red_car));
        cars.add(new Car(4.0, "5 Deals", "Orange Audi", "From $180 / day", R.drawable.gold_car));

        RecyclerView recyclerView = findViewById(R.id.choose_car_recycler_view);
        ChooseCarAdapter chooseCarAdapter = new ChooseCarAdapter(cars, MainActivity.this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(chooseCarAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, CarActivity.class);
        startActivity(intent);
    }
}