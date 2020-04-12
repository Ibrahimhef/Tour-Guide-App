package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter<T> extends ArrayAdapter {

    public CustomAdapter(@NonNull Context context,  ArrayList<Informations> informations) {
        super(context, 0, informations);
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemViews = convertView;
        if (listItemViews == null) {
            listItemViews = LayoutInflater.from(getContext()).inflate(R.layout.layout_viewr, parent, false);
        }
        Informations informations = (Informations) getItem(position);
        TextView place = (TextView) listItemViews.findViewById(R.id.name_of_place);
        TextView city = (TextView) listItemViews.findViewById(R.id.name_of_city);
        TextView desc = (TextView) listItemViews.findViewById(R.id.descraption);
        TextView rate = (TextView) listItemViews.findViewById(R.id.rate);
        ImageView placImg = (ImageView) listItemViews.findViewById(R.id.img);
        place.setText(informations.getPlaceName());
        city.setText(informations.getCityName());
        desc.setText(informations.getDescraption());
        rate.setText("RATE Of 5 IS "+informations.getRate());
        placImg.setImageResource(informations.getImgRes());
        return listItemViews;
    }
}
