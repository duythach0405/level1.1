package com.example.level11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.level11.fragment.Fragment1;
import com.example.level11.fragment.Fragment2;
import com.example.level11.fragment.Fragment3;
import com.example.level11.fragment.viewpager2Adapter;
import com.google.android.material.tabs.TabLayout;

public class Main3Activity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);
        viewPager = findViewById(R.id.viewpager2);
        addtag(viewPager);
        tabLayout = findViewById(R.id.fragment2);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_tochucboi);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_chuaphanhoi);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_congcuhotro);
//        setSupportActionBar();
    }

    public void addtag(ViewPager viewPager){
        viewpager2Adapter viewpagerAdapter = new viewpager2Adapter(getSupportFragmentManager());
        viewpagerAdapter.add1(new Fragment1());
        viewpagerAdapter.add1(new Fragment2());
        viewpagerAdapter.add1(new Fragment3());
        viewPager.setAdapter(viewpagerAdapter);
    }
}
