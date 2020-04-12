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
 * Use the {@link Landscape#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Landscape extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Landscape() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Landscape.
     */
    // TODO: Rename and change types and number of parameters
    public static Landscape newInstance(String param1, String param2) {
        Landscape fragment = new Landscape();
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
        View view = inflater.inflate(R.layout.fragment_landscape, container, false);
        ArrayList<Informations> informations = new ArrayList<>();
        informations.add(new Informations("Rijal Almaa","Rijal Almaa",R.drawable.rj," Rijal Almaa is a village located in 'Asir Region, Saudi Arabia.It is 45 km (28 mi) from Abha. Anciently, the village used to be a natural passage that linked between Yemen, Makkah, Madinah and Levant. Thus, it was a regional trade center. Rijal Almaa contains around 60 multiple-story buildings made of stone, clay and wood. The village has a historical significance as it has a number of long and old fortresses. As the village is open for visitors, people can reach the place through a number of ways including Sawda center, Aqabat Sama, Muhayil Asir and Hobail","4.7"));
        CustomAdapter<Informations> informationsCustomAdapter = new CustomAdapter<>(getContext(),informations);
        ListView listView = (ListView) view.findViewById(R.id.list_lindscape);
        listView.setAdapter(informationsCustomAdapter);
        return view;
    }
}
