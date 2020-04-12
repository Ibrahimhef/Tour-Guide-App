package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentHolder extends AppCompatActivity {
    TextView airport;
    TextView museum;
    TextView landscape;
    TextView waterfall;
    TextView mousq;
    TextView hotel;
    TextView desert;
    TextView beach;
    static Fragment intendFra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment_holder);
        airport = (TextView) findViewById(R.id.airport_cat);
        mousq = (TextView) findViewById(R.id.mosque_cat);
        museum = (TextView) findViewById(R.id.museums_cat);
        beach = (TextView) findViewById(R.id.beaches_cat);
        landscape = (TextView) findViewById(R.id.landscape_cat);
        hotel = (TextView) findViewById(R.id.hotels_cat);
        waterfall = (TextView) findViewById(R.id.waterfall_cat);
        desert = (TextView) findViewById(R.id.desert_cat);

        change(intendFra);

        airport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Airport());
            }
        });
        mousq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Mosqe());
            }
        });
        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Museum());
            }
        });
        beach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Beach());
            }
        });
        landscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Landscape());
            }
        });
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Hotel());
            }
        });
        desert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Desert());
            }
        });
        beach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Beach());
            }
        });
        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(new Waterfall());
            }
        });

}
private void change(Fragment fragment){
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.fragment_space, fragment);
    ft.commit();
}
}
