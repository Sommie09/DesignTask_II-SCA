package com.example.designtaskii_sca;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CarActivity extends AppCompatActivity {
    private ViewPager2 mViewPager2;
    public static ClickInterface mClickInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        mViewPager2 = findViewById(R.id.pager);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(
                "Orange Audi",
                R.drawable.gold_car,
                "Audi A4 Sports",
                "4 Doors", R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_border_outline,
                "(23.75k)"));

        cars.add(new Car(
                "Red Tesla",
                R.drawable.red_car,
                "Tesla",
                "4 Doors", R.drawable.ic_baseline_star_24,
                R.drawable.ic_baseline_star_24,
                "(32.75k)"));

        cars.add(new Car(
                "Blue Kia Cerato",
                R.drawable.blue_car,
                "Kia",
                "4 Doors", R.drawable.ic_baseline_star_border_outline,
                R.drawable.ic_baseline_star_border_outline,
                "(3.75k)"));

        mViewPager2.setAdapter(new CarAdapter(cars, this, mClickInterface, mViewPager2 ));
        mViewPager2.setClipToPadding(false);
        mViewPager2.setClipChildren(false);
        mViewPager2.setOffscreenPageLimit(3);
        mViewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);


        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        mViewPager2.setPageTransformer(compositePageTransformer);


    }

}