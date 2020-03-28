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
public class ResidentialHallsFragment extends Fragment {

    public ResidentialHallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_resident_halls, container, false);
        //ArrayList of places and locations
        ArrayList<PlacesDetails> places = new ArrayList<PlacesDetails>();
        places.add(new PlacesDetails("Mensah Sarbah Hall", "Main Campus",R.drawable.hotel));
        places.add(new PlacesDetails("Legon Hall", "Main Campus",R.drawable.hotel));
        places.add(new PlacesDetails("Volta Hall", "Main Campus",R.drawable.hotel));
        places.add(new PlacesDetails("Commonwealth Hall", "Main Campus",R.drawable.hotel));
        places.add(new PlacesDetails("Akuaffo Hall", "Main Campus",R.drawable.hotel));
        places.add(new PlacesDetails("Hilla Liman Hall", "Diaspora",R.drawable.hotel));
        places.add(new PlacesDetails("Kwapong Hall", "Diaspora",R.drawable.hotel));
        places.add(new PlacesDetails("Elizabeth Sey Hall", "Diaspora",R.drawable.hotel));
        places.add(new PlacesDetails("Jean Nelson Hall", "Diaspora",R.drawable.hotel));
        places.add(new PlacesDetails("African Union Hall", "Pent Road",R.drawable.hotel));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.resident_halls);
        listView.setAdapter(adapter);
        return rootView;
    }
}
