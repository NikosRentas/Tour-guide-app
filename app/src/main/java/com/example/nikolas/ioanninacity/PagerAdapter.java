package com.example.nikolas.ioanninacity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fragmentManager, int mNumOfTabs) {
        super(fragmentManager);
        this.mNumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MuseumTabFragment tab1 = new MuseumTabFragment();
                return tab1;
            case 1:
                RestaurantTabFragment tab2 = new RestaurantTabFragment();
                return tab2;
            case 2:
                BarTabFragment tab3 = new BarTabFragment();
                return tab3;
            case 3:
                EventTabFragment tab4 = new EventTabFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}