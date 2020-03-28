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
public class LectureHallsFragment extends Fragment {

    public LectureHallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lecture_halls, container, false);

        //ArrayList of places and locations
        ArrayList<PlacesDetails> places = new ArrayList<PlacesDetails>();
        places.add(new PlacesDetails("JQB", "Near Main Gate",R.drawable.teacher));
        places.add(new PlacesDetails("NNB", "Behind Political Science",R.drawable.teacher));
        places.add(new PlacesDetails("GCB", "Opposite Pharmacy school",R.drawable.teacher));
        places.add(new PlacesDetails("Software Lab", "In Computer Science",R.drawable.teacher));
        places.add(new PlacesDetails("HardWare Lab", "In Computer Science",R.drawable.teacher));
        places.add(new PlacesDetails("NB", "Near Information Studies",R.drawable.teacher));
        places.add(new PlacesDetails("CC", "Near Sarbah",R.drawable.teacher));
        places.add(new PlacesDetails("Math Room 05", "In Math dept",R.drawable.teacher));
        places.add(new PlacesDetails("G1", "Business School",R.drawable.teacher));
        places.add(new PlacesDetails("G2", "Business School",R.drawable.teacher));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.lecture_halls);
        listView.setAdapter(adapter);
        return rootView;
    }
}
