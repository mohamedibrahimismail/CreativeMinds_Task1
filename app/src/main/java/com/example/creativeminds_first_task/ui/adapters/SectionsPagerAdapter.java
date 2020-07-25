package com.example.creativeminds_first_task.ui.adapters;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.creativeminds_first_task.Model;
import com.example.creativeminds_first_task.R;
import com.example.creativeminds_first_task.ui.main.PlaceholderFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    List<Model> waiting_list,accepted_list,cancelled_list;
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_3, R.string.tab_text_2,R.string.tab_text_1};


    private final Context mContext;

    public SectionsPagerAdapter(List<Model> waiting_list,List<Model> accepted_list,List<Model> cancelled_list,Context context, FragmentManager fm) {
        super(fm);
        this.waiting_list = waiting_list;
        this.accepted_list=accepted_list;
        this.cancelled_list = cancelled_list;
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position){
            case 0:
                return new PlaceholderFragment(cancelled_list);


            case 1:
                return new PlaceholderFragment(accepted_list);

            case 2:
                return new PlaceholderFragment(waiting_list);

        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}