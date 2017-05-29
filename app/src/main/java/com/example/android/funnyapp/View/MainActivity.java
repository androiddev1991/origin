package com.example.android.funnyapp.View;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.ViewGroup;

import android.support.design.widget.TabLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.funnyapp.Adapter.ViewPagerAdapter;
import com.example.android.funnyapp.Helper.CustomViewPager;
import com.example.android.funnyapp.R;
import com.example.android.funnyapp.View.Fragment.FavoritFragment;
import com.example.android.funnyapp.View.Fragment.KnowlageRoot;
import com.example.android.funnyapp.View.Fragment.MainProfileFragment;
import com.example.android.funnyapp.View.Fragment.SearchFragment;



import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.headertitle)
    TextView title;
    TabLayout mTabLayout;
    public LinearLayout linearLayout;

    ViewPager mViewPager;
    private int[] tabIcons = {
            R.drawable.ic_tab_knowlage,
            R.drawable.ic_tab_favorit,
            R.drawable.ic_tab_search,
            R.drawable.ic_tab_user,
    };
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    private void ClearFragmentStack() {
        FragmentManager fm = getSupportFragmentManager();
        for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabCustomization();
        setupTabIcons();
        ButterKnife.bind(this);

        mTabLayout.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#FF8035"), PorterDuff.Mode.SRC_IN);
        linearLayout=(LinearLayout)mTabLayout.getTabAt(0).getCustomView();
        ImageView firstTab=(ImageView)linearLayout.getChildAt(0);
        firstTab.setColorFilter(Color.parseColor("#FF8035"), PorterDuff.Mode.SRC_IN);
    }

    private void tabCustomization() {

        mViewPager = (CustomViewPager) findViewById(R.id.viewPager);
        mTabLayout = (TabLayout) findViewById(R.id.tabs);

        mTabLayout.setupWithViewPager(mViewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), getApplicationContext(), tabIcons);

        adapter.addFragment(new KnowlageRoot(), "دانستنی ها");
        adapter.addFragment(new FavoritFragment(), "مورد علاقه ها");
        adapter.addFragment(new SearchFragment(), "جست وجو");
        adapter.addFragment(new MainProfileFragment(), "پروفایل");

        mViewPager.setAdapter(adapter);
        mViewPager.setOffscreenPageLimit(5);
        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = mTabLayout.getTabAt(i);
            tab.setCustomView(adapter.getTabView(mTabLayout, i));
        }
        ViewGroup vg = (ViewGroup) mTabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        Log.i("TabChild", String.valueOf(tabsCount));
    }
    private void setupTabIcons() {
        mTabLayout.getTabAt(0).setIcon(tabIcons[0]);
        mTabLayout.getTabAt(1).setIcon(tabIcons[1]);
        mTabLayout.getTabAt(2).setIcon(tabIcons[2]);
        mTabLayout.getTabAt(3).setIcon(tabIcons[3]);


        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){


            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                TabChanges(tab);

            }

            private void TabChanges(TabLayout.Tab tab) {
                linearLayout=(LinearLayout)tab.getCustomView();
                ImageView v=(ImageView)linearLayout.getChildAt(0);
                TextView text=(TextView)linearLayout.getChildAt(1);
                text.setTextColor(Color.parseColor("#FF8035"));
                v.setColorFilter(Color.parseColor("#FF8035"), PorterDuff.Mode.SRC_IN);

                switch (tab.getPosition())
                {
                    case 0:
                        ClearFragmentStack();
                        Log.d("Position", String.valueOf(tab.getPosition()));
                        title.setText("دانستنی ها");
                        break;
                    case 1:
                        ClearFragmentStack();
                        Log.d("Position", String.valueOf(tab.getPosition()));
                        title.setText("مورد علاقه ها");
                        break;
                    case 2:
                        ClearFragmentStack();
                        title.setText("جست و جو");
                        Log.d("Position", String.valueOf(tab.getPosition()));

                        break;
                    case 3:
                        ClearFragmentStack();
                        title.setText("حساب کاربری");
                        Log.d("Position", String.valueOf(tab.getPosition()));

                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                linearLayout=(LinearLayout)tab.getCustomView();
                ImageView v=(ImageView)linearLayout.getChildAt(0);
                TextView text=(TextView)linearLayout.getChildAt(1);
                text.setTextColor(Color.parseColor("#ffffff"));
                v.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                linearLayout=(LinearLayout)tab.getCustomView();
                ImageView v=(ImageView)linearLayout.getChildAt(0);
                TextView text=(TextView)linearLayout.getChildAt(1);
                text.setTextColor(Color.parseColor("#FF8035"));
                v.setColorFilter(Color.parseColor("#FF8035"), PorterDuff.Mode.SRC_IN);

                switch (tab.getPosition())
                {

                    case 0:
                        ClearFragmentStack();
                        Log.d("Position", String.valueOf(tab.getPosition()));

                        break;
                    case 1:
                        ClearFragmentStack();
                        Log.d("Position", String.valueOf(tab.getPosition()));
                        break;
                    case 2:
                        ClearFragmentStack();
                        Log.d("Position", String.valueOf(tab.getPosition()));

                        break;
                    case 3:
                        ClearFragmentStack();
                        Log.d("Position", String.valueOf(tab.getPosition()));
                        break;
                }
            }
        });


    }

    }





