package com.example.root.fragmentmvvm.Main.ViewModel;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.TableLayout;

import com.example.root.fragmentmvvm.Main.Adapter.ViewPagerAdapter;
import com.example.root.fragmentmvvm.Main.Fragments.HomeFragment;
import com.example.root.fragmentmvvm.Main.Fragments.ListAppFragment;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 06/10/16.
 */


public class MainActivityVM extends GitsVM {
    public ViewPagerAdapter viewPagerAdapter;
    public ViewPager viewPager;

    public MainActivityVM(Context context, FragmentManager fragmentManager) {
        super(context);

        viewPagerAdapter = new ViewPagerAdapter(fragmentManager);
        viewPagerAdapter.addFragment(new HomeFragment(), "Home");
        viewPagerAdapter.addFragment(new ListAppFragment(), "List");
        //viewPagerAdapter.addFragment(new HomeFragment(), "Home");


    }

    @BindingAdapter({"setAdapter"})
    public static void setAdapter(ViewPager viewPager, ViewPagerAdapter viewPagerAdapter){
        viewPager.setAdapter(viewPagerAdapter);
    }

    @BindingAdapter({"setupWithPager"})
    public static void setupWithPager(TabLayout tabLayout, ViewPager viewPager){
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.setupWithViewPager(viewPager, true);
        Log.d("Count Tab ",String.valueOf(tabLayout.getTabCount()));
    }
}
