package com.example.tour_app;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context,@NonNull FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Nullable


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

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.resident_halls);
        } else if (position == 1) {
            return mContext.getString(R.string.lecture_halls);
        } else if (position == 2) {
            return mContext.getString(R.string.eatries);
        } else {
            return mContext.getString(R.string.others);
        }
    }
}
