package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView airport;
    ImageView museum;
    ImageView landscape;
    ImageView waterfall;
    ImageView mousq;
    ImageView hotel;
    ImageView desert;
    ImageView beach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        airport = (ImageView) findViewById(R.id.airport);
        mousq = (ImageView) findViewById(R.id.mosque);
        museum = (ImageView) findViewById(R.id.museums);
        landscape = (ImageView) findViewById(R.id.landscape);
        hotel = (ImageView) findViewById(R.id.hotels);
        desert = (ImageView) findViewById(R.id.desert);
        beach = (ImageView) findViewById(R.id.beaches);
        waterfall = (ImageView) findViewById(R.id.waterfall);

        airport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHolder.intendFra = new Airport();
                startActivity(new Intent(MainActivity.this, FragmentHolder.class));
            }
        });
        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHolder.intendFra = new Museum();
                startActivity(new Intent(MainActivity.this, FragmentHolder.class));
            }
        });
        mousq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHolder.intendFra = new Mosqe();
                startActivity(new Intent(MainActivity.this, FragmentHolder.class));
            }
        });
        desert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHolder.intendFra = new Desert();
                startActivity(new Intent(MainActivity.this, FragmentHolder.class));
            }
        });
        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHolder.intendFra = new Waterfall();
                startActivity(new Intent(MainActivity.this, FragmentHolder.class));
            }
        });
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHolder.intendFra = new Hotel();
                startActivity(new Intent(MainActivity.this, FragmentHolder.class));
            }
        });
        beach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHolder.intendFra = new Beach();
                startActivity(new Intent(MainActivity.this, FragmentHolder.class));
            }
        });
        landscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, FragmentHolder.class));
                FragmentHolder.intendFra = new Landscape();
            }
        });


    }
}
