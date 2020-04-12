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
 * Use the {@link Mosqe#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Mosqe extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Mosqe() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Mosqe.
     */
    // TODO: Rename and change types and number of parameters
    public static Mosqe newInstance(String param1, String param2) {
        Mosqe fragment = new Mosqe();
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
        View view = inflater.inflate(R.layout.fragment_mosqe, container, false);
        ArrayList<Informations> informations = new ArrayList<>();
        informations.add(new Informations("al-Masjid al-Ḥaram","Mecca",R.drawable.mharam,"The Great Mosque of Mecca, commonly known as al-Masjid al-Ḥarām , romanized: al-Masjid al-Ḥarām, lit. 'The Sacred Mosque'), is a mosque that surrounds the Kaaba in the city of Mecca, in the Hejazi region of Saudi Arabia. It is a site of pilgrimage for the Hajj, which every Muslim must do at least once in their lives if able, and is also the main phase for the ʿUmrah, the lesser pilgrimage that can be undertaken any time of the year. The rites of both pilgrimages include circumambulating the Kaaba within the mosque. The Great Mosque includes other important significant sites, including the Black Stone, the Zamzam Well, Maqam Ibrahim, and the hills of Safa and Marwa. The Great Mosque is the largest mosque in the world, and the second largest building in the world behind the Boeing Everett Factory. The Great Mosque has undergone major renovations and expansions through the years. It has passed through the control of various caliphs, sultans and kings, and is now under the control of the King of Saudi Arabia who is titled the Custodian of the Two Holy Mosques. ","not rateable"));
        informations.add(new Informations("Al-Masjid an-Nabawi","Medina",R.drawable.mnabawi," Al-Masjid an-Nabawī is a mosque established and built by the Islamic prophet Muhammad, situated in the city of Medina in the Hejaz region of Saudi Arabia. It was one of the first mosques built by Muhammad, and is now one of the largest mosques in the world. It is the second-holiest site in Islam, after the Great Mosque in Mecca. It is always open, regardless of date or time. The site was originally adjacent to Muhammad's house; he settled there after his migration from Mecca to Medina in 622. He shared in the heavy work of construction. The original mosque was an open-air building. The mosque served as a community center, a court, and a religious school. There was a raised platform for the people who taught the Quran. Subsequent Islamic rulers greatly expanded and decorated it. In 1909, it became the first place in the Arabian Peninsula to be provided with electrical lights. The mosque is under the control of the Custodian of the Two Holy Mosques. The mosque is located in what was traditionally the center of Medina, with many hotels and old markets nearby. It is a major pilgrimage site. Many pilgrims who perform the Hajj go on to Medina to visit the mosque, due to its connection to Muhammad.","not rateable"));
        CustomAdapter<Informations> informationsCustomAdapter = new CustomAdapter<>(getContext(),informations);
        ListView listView = (ListView) view.findViewById(R.id.list_mosq);
        listView.setAdapter(informationsCustomAdapter);
        return view;
    }
}
