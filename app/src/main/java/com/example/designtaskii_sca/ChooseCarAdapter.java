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

import java.util.List;

public class ChooseCarAdapter extends RecyclerView.Adapter<ChooseCarAdapter.ViewHolder> {
    private List<Car> cars;
    private Context mContext;

    public ChooseCarAdapter(List<Car> cars, Context context) {
        this.cars = cars;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.choose_car_item_view, parent, false);
        return new ChooseCarAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.carDeals.setText(cars.get(position).getDeals());
        holder.carName.setText(cars.get(position).getCarName());
        holder.carPrice.setText(cars.get(position).getPrice());
        holder.carRating.setText(String.valueOf(cars.get(position).getRating()));
        holder.carImage.setImageResource(cars.get(position).getImageResource());

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView carName;
        TextView carPrice;
        TextView carRating;
        TextView carDeals;
        ImageView carImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            carName = itemView.findViewById(R.id.choose_car_name);
            carPrice = itemView.findViewById(R.id.choose_car_price);
            carRating = itemView.findViewById(R.id.choose_car_rating);
            carDeals = itemView.findViewById(R.id.choose_car_deals);
            carImage = itemView.findViewById(R.id.carImage);

        }
    }
}
