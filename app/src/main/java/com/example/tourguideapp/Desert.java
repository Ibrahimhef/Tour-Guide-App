package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Desert#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Desert extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Desert() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Desert.
     */
    // TODO: Rename and change types and number of parameters
    public static Desert newInstance(String param1, String param2) {
        Desert fragment = new Desert();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (container != null) {
            container.removeAllViews();
        }
        View view = inflater.inflate(R.layout.fragment_desert, container, false);
        ArrayList<Informations> informations = new ArrayList<>();
        informations.add(new Informations("Rub' al Khali","Rub' al Khali",R.drawable.dese," The desert is 1,000 kilometres (620 miles) long, and 500 kilometres (310 miles) wide. Its surface elevation varies from 800 metres (2,600 ft) in the southwest to around sea level in the northeast. The terrain is covered with sand dunes with heights up to 250 metres (820 ft), interspersed with gravel and gypsum plains. The sand is of a reddish-orange color due to the presence of feldspar. There are also brackish salt flats in some areas, such as the Umm al Samim area on the desert's eastern edge. Ali Al-Naimi reports that the sand dunes don't drift. He goes on to say, Sand blows off the surface, of course, but the essential shape of the dunes remains intact, probably due to the moisture leaching up into the base of the dunes from the surrounding sabkhas.","3.9"));
        CustomAdapter<Informations> informationsCustomAdapter = new CustomAdapter<>(getContext(),informations);
        ListView listView = (ListView) view.findViewById(R.id.list_desert);
        listView.setAdapter(informationsCustomAdapter);
        return view;
    }
}
