package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Fragment;
import android.os.Bundle;

import com.example.fragment.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Fragment_Adapter adapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        binding=ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

        adapter = new Fragment_Adapter(getSupportFragmentManager());
//        Fragment fragment = new Fragment();
        adapter.addFragment(new Live_Fragment(),"Live");
        adapter.addFragment(new Overview_Fragment(),"Overview");
        adapter.addFragment(new Scoreboard_Fragment(),"Scoreboard");

        viewPager=findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        tabLayout=findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}