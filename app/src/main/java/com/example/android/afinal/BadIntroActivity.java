package com.example.android.afinal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class BadIntroActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private TabItem tabElement01;
    private TabItem tabElement02;
    private TabItem tabElement03;
    private ViewPager viewPager;
    public PagerAdapter pageradapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_intro);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabElement01 = (TabItem)findViewById(R.id.tab1);
        tabElement02 = (TabItem)findViewById(R.id.tab2);
        tabElement03 = (TabItem)findViewById(R.id.tab3);
        viewPager = findViewById(R.id.viewPager);

        pageradapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageradapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){


            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0){
                    pageradapter.notifyDataSetChanged();
                }else if(tab.getPosition()==1){
                    pageradapter.notifyDataSetChanged();
                }else if(tab.getPosition()==2){
                    pageradapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}
