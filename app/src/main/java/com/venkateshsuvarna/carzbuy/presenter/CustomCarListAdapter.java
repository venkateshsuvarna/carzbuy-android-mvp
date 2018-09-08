package com.venkateshsuvarna.carzbuy.presenter;

import android.app.Activity;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.venkateshsuvarna.carzbuy.R;

public class CustomCarListAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] carName;
    private final String[] carYear;
    private final String[] carMiles;
    private final String[] carCondition;
    private final Integer[] carImage;

    public CustomCarListAdapter(Activity context, String[] carName, String[] carYear, String[] carMiles, String[] carCondition, Integer[] carImage){
        super(context,R.layout.car_list_item,carName);
        this.context = context;
        this.carName = carName;
        this.carYear = carYear;
        this.carMiles = carMiles;
        this.carCondition = carCondition;
        this.carImage = carImage;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.car_list_item, null,true);

        TextView tvCarName = rowView.findViewById(R.id.tv_carlist_item_car_name);
        TextView tvCarYear = rowView.findViewById(R.id.tv_carlist_item_car_year);
        TextView tvCarMiles = rowView.findViewById(R.id.tv_carlist_item_miles);
        TextView tvCarCondition = rowView.findViewById(R.id.tv_carlist_item_condition);

        ImageView ivCarImage = rowView.findViewById(R.id.iv_carlist_item_car_image);

        tvCarName.setText(carName[position]);
        tvCarYear.setText(carYear[position]);
        tvCarMiles.setText(carMiles[position]);
        tvCarCondition.setText(carCondition[position]);

        if(carCondition[position].equals("Average")){
            tvCarCondition.setTextColor(Color.parseColor("#FFFF00"));
        }
        else if(carCondition[position].equals("Good")){
            tvCarCondition.setTextColor(Color.parseColor("#0000FF"));
        }
        else if(carCondition[position].equals("Excellent")){
            tvCarCondition.setTextColor(Color.parseColor("#00FF00"));
        }
        else{

        }


        ivCarImage.setImageResource(carImage[position]);

        return rowView;

    }
}
