package com.example.root.fragmentmvvm.Main.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.root.fragmentmvvm.Main.Fragments.HomeFragment;

import java.util.ArrayList;

import id.gits.mvvmcore.fragment.GitsFragment;

/**
 * Created by root on 06/10/16.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{
    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();

    public void addFragment(Fragment fragments, String tabTitles){
        this.fragments.add(fragments);
        this.tabTitles.add(tabTitles);
    }


    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
