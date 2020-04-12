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
 * Use the {@link Airport#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Airport extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Airport() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Airport.
     */
    // TODO: Rename and change types and number of parameters
    public static Airport newInstance(String param1, String param2) {
        Airport fragment = new Airport();
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
        View view = inflater.inflate(R.layout.fragment_airport, container, false);
        ArrayList<Informations> informations = new ArrayList<>();
        informations.add(new Informations("king khalid airport", "Riyadh",R.drawable.kingkhiled,"This airport consists of five passenger terminals (only three of which are in use), with eight aero-bridges each, a mosque, covered and uncovered car parking for 11,600 vehicles, an additional Royal Terminal (for the kingdom's guests, government heads, and Saudi royal family use), a central control tower (one of the world's tallest), and two parallel runways, which are each 4,260 metres (13,980 ft) long. The land area allocated for this airport is among the largest (second-largest, after King Fahd International Airport) in the world.[citation needed] The airport is managed and operated by Riyadh Airports Company.", "4.1"));
        informations.add(new Informations("King Abdulaziz International Airport","Jeddah" , R.drawable.kingabdo , "King Abdulaziz International Airport (KAIA) (IATA: JED, ICAO: OEJN) is a Saudi international airport located 19 km to the north of Jeddah. Named after King Abdulaziz Al Saud and inaugurated in 1981, the airport is the busiest airport of Saudi Arabia and the third-largest airport in the kingdom. The airport's Hajj Terminal was specially built for Muslim pilgrims going to Mecca annually on the Hajj. It is one of the largest in the world, and can handle 80,000 passengers at the same time.","3.2"));
        CustomAdapter<Informations> informationsCustomAdapter = new CustomAdapter<>(getContext(),informations);
        ListView listView = (ListView) view.findViewById(R.id.list_airport);
        listView.setAdapter(informationsCustomAdapter);
        return view;
    }
}
