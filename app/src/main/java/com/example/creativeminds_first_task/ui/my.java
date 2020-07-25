package com.example.creativeminds_first_task.ui;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.creativeminds_first_task.Model;
import com.example.creativeminds_first_task.R;
import com.example.creativeminds_first_task.ui.adapters.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class my extends Fragment {

    private static final List<Model> waiting_list = new ArrayList<>();
    static {
        waiting_list.add(new Model("ابي اروح الهايبر و ما عندي سيارة ممكنم حد يوديني",R.drawable.type_car,true,"منذ ساعة","رجال","فزعة سيارات","2 فزعو",true));
        waiting_list.add(new Model("بنات ضروري انا عندي عزومة و محتاجة حد يساعدني",R.drawable.type_food,true,"منذ 3 ساعات","سيدات","فزعة اكل","5 فزعو",false));
    }
    private static final List<Model> accepted_list = new ArrayList<>();
    static {
        accepted_list.add(new Model("بدي اصلح السيارة",R.drawable.type_car,true,"منذ 2 ساعة","رجال","فزعة سيارات","1 فزعو",true));
        accepted_list.add(new Model("بدي اسافر عطلة",R.drawable.type_food,true,"منذ 7 ساعات","سيدات","فزعة عطلات","5 فزعو",true));
    }
    private static final List<Model> cancelled_list = new ArrayList<>();
    static {
        cancelled_list.add(new Model("ابي برنامج محاسبة",R.drawable.type_car,false,"منذ 7 ساعة","رجال","فزعة برمجة","8 فزعو",false));
        cancelled_list.add(new Model("بنات ضروري محتاجة انواع اكل هندي",R.drawable.type_food,false,"منذ 11 ساعات","سيدات","فزعة اكل","5 فزعو",false));
    }


    public my() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(waiting_list,accepted_list,cancelled_list,getContext(), getChildFragmentManager());
        ViewPager viewPager = view.findViewById(R.id.pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = view.findViewById(R.id.tab_layout);
//        tabs.setSelectedTabIndicatorColor(Color.parseColor("#FF0000"));
//        tabs.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        tabs.setTabTextColors(R.color.grey, Color.parseColor("#C634AE"));
        tabs.setupWithViewPager(viewPager);
        return view;
    }

    public void navigate(){
        NavHostFragment.findNavController(this).navigate(R.id.action_my_to_others);
    }
}