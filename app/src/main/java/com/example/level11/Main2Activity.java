package com.example.level11;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class Main2Activity extends AppCompatActivity {
    ViewPager viewPager;
    Toolbar toolbarSukien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbarSukien = findViewById(R.id.toolbarSukien);
        setSupportActionBar(toolbarSukien);
        viewPager = findViewById(R.id.viewpager);
        addTabs(viewPager);
        ((TabLayout)findViewById(R.id.tablayout)).setupWithViewPager(viewPager);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_save, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
    public void addTabs(ViewPager viewPager){
        viewpagerAdapter adapter = new viewpagerAdapter(getSupportFragmentManager());
        adapter.add(new FragmentSukien(),"SỰ KIỆN");
        adapter.add(new FragmentThoigian(),"THỜI GIAN");
        viewPager.setAdapter(adapter);
    }
}
