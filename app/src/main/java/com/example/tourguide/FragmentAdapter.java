package com.example.tourguide;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DelhiFragment();
            case 1:
                return new KolkataFragment();
            case 2:
                return new MumbaiFragment();
            case 3:
                return new GoaFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Delhi";
            case 1:
                return "Kolkata";
            case 2:
                return "Mumbai";
            case 3:
                return "Goa";
            default:
                return null;
        }
    }
}
