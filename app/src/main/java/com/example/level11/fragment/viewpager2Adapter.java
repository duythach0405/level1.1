package com.example.level11.fragment;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewpager2Adapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();

    public viewpager2Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
                return fragmentList.get(position);

    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }



    public void add1(Fragment frg){
        fragmentList.add(frg);
    }
}
