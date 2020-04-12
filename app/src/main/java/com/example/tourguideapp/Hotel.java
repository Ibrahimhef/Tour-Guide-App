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
 * Use the {@link Hotel#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Hotel extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Hotel() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Hotel.
     */
    // TODO: Rename and change types and number of parameters
    public static Hotel newInstance(String param1, String param2) {
        Hotel fragment = new Hotel();
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
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);
        ArrayList<Informations> informations = new ArrayList<>();
        informations.add(new Informations("Ritz-Carlton","Riyadh",R.drawable.ret," Arched doorways and marble hallways define the interior of this luxurious Riyadh hotel, next to King Abdulaziz Convention Center. The hotel features 6 restaurants, an indoor pool and spacious rooms with iPod docking stations. Free WiFi is available in public areas.","4.6"));
        CustomAdapter<Informations> informationsCustomAdapter = new CustomAdapter<>(getContext(),informations);
        ListView listView = (ListView) view.findViewById(R.id.list_hotel);
        listView.setAdapter(informationsCustomAdapter);
        return view;
    }
}
