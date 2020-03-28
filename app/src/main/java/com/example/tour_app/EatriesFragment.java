package com.example.tour_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatriesFragment extends Fragment {

    public EatriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_eatries, container, false);
        //ArrayList of eatries and locations

        ArrayList<PlacesDetails> places = new ArrayList<PlacesDetails>();
        places.add(new PlacesDetails("Sarbah Dinning Hall", "Mensah Sarbah",R.drawable.placeholder));
        places.add(new PlacesDetails("Campus Hub", "Commonwealth",R.drawable.placeholder));
        places.add(new PlacesDetails("Village Canteen", "Akuaffo Hall",R.drawable.placeholder));
        places.add(new PlacesDetails("Central Cafeteria", "Mensah Sarbah",R.drawable.placeholder));
        places.add(new PlacesDetails("Basement", "Mensah Sarbah",R.drawable.placeholder));
        places.add(new PlacesDetails("Night Market", "Road to Ish",R.drawable.placeholder));
        places.add(new PlacesDetails("Bush Canteen", "Near Fire Service",R.drawable.placeholder));
        places.add(new PlacesDetails("Volta Hall Dinning Hall", "Inside Volta Hall",R.drawable.placeholder));
        places.add(new PlacesDetails("Perries", "Inside Pent",R.drawable.placeholder));
        places.add(new PlacesDetails("Tacobel", "Inside Akuaffo Hall",R.drawable.placeholder));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.eatries);
        listView.setAdapter(adapter);
        return rootView;
    }
}
