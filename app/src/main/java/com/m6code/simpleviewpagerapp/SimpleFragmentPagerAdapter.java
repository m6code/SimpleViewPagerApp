package com.m6code.simpleviewpagerapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Benjamin on 26/6/2017.
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext; // A variable that holds the name of the current tab

    /**
     * A simple constructor for the viewpager
     *
     * @param context         the current tab on which the viewpager is
     * @param fragmentManager return the appropriate fragment to the viewpager
     */
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    /**
     * Get the current position and sets the appropriate fragment
     *
     * @param position the current position
     * @return the appropriate fragment
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FirstFragment();
        } else if (position == 1) {
            return new SecondFragment();
        } else {
            return new ThirdFragment();
        }
    }


    /**
     * get the number of fragment to be returned
     *
     * @return the numbers of fragments
     */
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.first_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.second_fragment);
        } else {
            return mContext.getString(R.string.third_fragment);
        }
    }
}
