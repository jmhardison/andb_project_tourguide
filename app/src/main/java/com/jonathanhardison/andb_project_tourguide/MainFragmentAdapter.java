package com.jonathanhardison.andb_project_tourguide;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class MainFragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context context;
    private String tabTitles[];

    public MainFragmentAdapter(FragmentManager fm, Context inContext) {

        super(fm);
        context = inContext;
        tabTitles = new String[] { context.getResources().getString(R.string.fragment_1), context.getResources().getString(R.string.fragment_2), context.getResources().getString(R.string.fragment_3), context.getResources().getString(R.string.fragment_4) };

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1){
            return new ParksFragment();
        } else if (position == 2){
            return new ShoppingFragment();
        }
        else{
            return new CityServicesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
