package com.example.creativeminds_first_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import info.hoang8f.android.segmented.SegmentedGroup;

import static androidx.navigation.Navigation.findNavController;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    RadioButton button1,button2;
    View nav_host_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav_host_fragment = findViewById(R.id.nav_host_fragment);
        SegmentedGroup segmented2 = (SegmentedGroup) findViewById(R.id.segmented2);
        segmented2.setTintColor(Color.parseColor("#FFFFFF"), Color.parseColor("#000000"));
        segmented2.setSelected(true);
        button1 = (RadioButton)findViewById(R.id.button1);
        button2 = (RadioButton) findViewById(R.id.button2);



//        SegmentedGroup segmented3 = (SegmentedGroup) findViewById(R.id.segmented3);
//
//
//        SegmentedGroup segmented4 = (SegmentedGroup) findViewById(R.id.segmented4);
//        segmented4.setTintColor(getResources().getColor(R.color.radio_button_selected_color));
    }

    @Override
    protected void onStart() {
        super.onStart();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate_to_other();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate_to_my();
            }
        });


    }

    public void navigate_to_other() {
        try {
            Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.action_my_to_others);
        }catch (Exception e){}
    }

    public void navigate_to_my() {
        try{
        Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.action_others_to_my);
    }catch (Exception e){}
    }

}