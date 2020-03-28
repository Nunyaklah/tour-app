package com.example.tour_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ResidentialHallsFragment();
        } else if (position == 1) {
            return new LectureHallsFragment();
        } else if (position == 2) {
            return new EatriesFragment();
        } else {
            return new OthersFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
