package com.example.android.funnyapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.Context;
import android.support.design.widget.TabLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.funnyapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android on 5/25/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    private int[] mTabIcon;
    private Context mContext;
    public ViewPagerAdapter(FragmentManager manager, Context applicationContext, int[] tabIcons) {
        super(manager);
        mContext=applicationContext;
        mTabIcon=tabIcons;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }
    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    public View getTabView(TabLayout tabLayout, int position) {
        // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView

        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.custom_tab, tabLayout, false);
        TextView textView= (TextView) view.findViewById(R.id.tabText);

        textView.setText(getPageTitle(position));


        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(mTabIcon[position]);

        return view;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

}