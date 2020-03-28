package com.example.tour_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<PlacesDetails> {
    public PlacesAdapter(Activity context, ArrayList<PlacesDetails> places) {
        super(context, 0, places);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places, parent, false);
        }
        PlacesDetails currentPlace = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.place_name);
        songTextView.setText(currentPlace.getPlaceName());
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location);
        nameTextView.setText(currentPlace.getLocation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getmImageResourceId());
        return listItemView;
    }
}

