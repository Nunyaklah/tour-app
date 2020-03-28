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
public class OthersFragment extends Fragment {

    public OthersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_others, container, false);
        //ArrayList of places and locations

        ArrayList<PlacesDetails> places = new ArrayList<PlacesDetails>();
        places.add(new PlacesDetails("Registry", "Behind Commonwealth",R.drawable.placeholder));
        places.add(new PlacesDetails("Banking Square", "Near night market",R.drawable.placeholder));
        places.add(new PlacesDetails("UGCS", "Near Volta hall",R.drawable.placeholder));
        places.add(new PlacesDetails("Balme Library", "Middle of school",R.drawable.placeholder));
        places.add(new PlacesDetails("Kingdom Bookshop", "Near balme library",R.drawable.placeholder));
        places.add(new PlacesDetails("Info Centre", "Near main gate",R.drawable.placeholder));
        places.add(new PlacesDetails("Counselling and Guidance", "Top of Bookshop",R.drawable.placeholder));
        places.add(new PlacesDetails("Cedi Conference hall", "Opposite UGCS",R.drawable.placeholder));
        places.add(new PlacesDetails("Athletic Oval", "Road to Sarbah",R.drawable.placeholder));
        places.add(new PlacesDetails("Students Clinic", "Under CC",R.drawable.placeholder));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.others);
        listView.setAdapter(adapter);
        return rootView;
    }
}
