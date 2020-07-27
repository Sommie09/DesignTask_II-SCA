package com.example.designtaskii_sca;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    List<Car> cars;
    private Context context;
    private ViewPager2 mViewPager2;
    public static ClickInterface mClickInterface;

    public CarAdapter(List<Car> cars, Context context, ClickInterface clickInterface, ViewPager2 mViewPager2) {
        this.cars = cars;
        this.context = context;
        this.mClickInterface = clickInterface;
        this.mViewPager2 = mViewPager2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.car_item_view, parent, false);
        return new CarAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.carName.setText(cars.get(position).getCarName());
        holder.imageResource.setImageResource(cars.get(position).getImageResource());
        holder.carBrand.setText(cars.get(position).getCarBrand());
        holder.carDoors.setText(cars.get(position).getCarDoors());
        holder.starImage4.setImageDrawable(cars.get(position).getBackgroundColourStar4());
        holder.starImage5.setImageDrawable(cars.get(position).getBackgroundColourStar5());
        holder.peopleRating.setText(cars.get(position).getPeopleRating());
    }


    @Override
    public int getItemCount() {
        return cars.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView carName;
        ImageView imageResource;
        TextView carBrand;
        TextView carDoors;
        ImageView starImage5;
        ImageView starImage4;
        TextView peopleRating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            carName = itemView.findViewById(R.id.car_name);
            imageResource = itemView.findViewById(R.id.car_image);
            carBrand = itemView.findViewById(R.id.car_brand);
            carDoors = itemView.findViewById(R.id.car_doors);
            starImage5 = itemView.findViewById(R.id.star5);
            starImage4 = itemView.findViewById(R.id.star4);
            peopleRating = itemView.findViewById(R.id.people_rating);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mClickInterface.onItemClick(getAdapterPosition());
                }
            });


        }


    }




}
