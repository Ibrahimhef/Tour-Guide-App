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
 * Use the {@link Museum#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Museum extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Museum() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Museum.
     */
    // TODO: Rename and change types and number of parameters
    public static Museum newInstance(String param1, String param2) {
        Museum fragment = new Museum();
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
        View view = inflater.inflate(R.layout.fragment_museum, container, false);
        ArrayList<Informations> informations = new ArrayList<>();
        informations.add(new Informations("Masmak fort","Riyadh",R.drawable.castle," The Masmak is a clay and mud-brick fort, with four watchtowers and thick walls, founded on stone blocks, lying in the center of Riyadh, in the old quarters. This building played a major part in the kingdom's history, as it was here that the recapture of Riyadh, led by Ibn Saud, occurred on 14 January 1902.","4.5"));
        CustomAdapter<Informations> informationsCustomAdapter = new CustomAdapter<>(getContext(),informations);
        ListView listView = (ListView) view.findViewById(R.id.list_musem);
        listView.setAdapter(informationsCustomAdapter);
        return view;
    }
}
