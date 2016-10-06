package com.example.root.fragmentmvvm.Main.Fragments.FragmentViewModel;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.example.root.fragmentmvvm.Main.Dao.MyAppDao;
import com.example.root.fragmentmvvm.Main.Fragments.FragmentViewModel.RecyclerViewSetting.RcAppAdapter;

import java.util.ArrayList;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 06/10/16.
 */

public class ListAppFragmentViewModel extends GitsVM {
    public RcAppAdapter rcAppAdapter;
    private List<MyAppDao> myAppDaoList = new ArrayList<>();
    public GridLayoutManager bGridLayoutManager;

    public ListAppFragmentViewModel(Context context) {
        super(context);

        myAppDaoList.add(new MyAppDao("Foodspot", "food.png"));
        myAppDaoList.add(new MyAppDao("Calculator", "math.jpg"));
        myAppDaoList.add(new MyAppDao("Student Manager", "class.jpg"));

        bGridLayoutManager = new GridLayoutManager(context, 2);
        rcAppAdapter = new RcAppAdapter(myAppDaoList);

        rcAppAdapter.notifyDataSetChanged();
    }
}
