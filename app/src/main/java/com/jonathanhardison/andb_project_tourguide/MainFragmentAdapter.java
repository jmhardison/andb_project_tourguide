package com.jonathanhardison.andb_project_tourguide;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class MainFragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Food", "Parks", "Shopping", "City Services" };
    private Context context;

    public MainFragmentAdapter(FragmentManager fm) {

        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1){
            //return new FamilyFragment();
            return new Fragment();
        } else if (position == 2){
            //return new ColorsFragment();
            return new Fragment();
        }
        else{
            //return new PhrasesFragment();
            return new Fragment();
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
