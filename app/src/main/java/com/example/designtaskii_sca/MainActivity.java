package com.example.designtaskii_sca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Car> cars;
    private MaterialCardView nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cars = new ArrayList<>();
        cars.add(new Car(4.5, "18 Deals", "Blue Kia Cerato", "From $199 / day", R.drawable.blue_car));
        cars.add(new Car(4.8, "10 Deals", "Red Tesla", "From $179 / day", R.drawable.red_car));
        cars.add(new Car(4.0, "5 Deals", "Orange Audi", "From $180 / day", R.drawable.gold_car));

        RecyclerView recyclerView = findViewById(R.id.choose_car_recycler_view);
        ChooseCarAdapter chooseCarAdapter = new ChooseCarAdapter(cars, MainActivity.this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(chooseCarAdapter);

//        nextButton = findViewById(R.id.next_button);
//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, CarActivity.class);
//                startActivity(intent);
//            }
//        });



    }
}