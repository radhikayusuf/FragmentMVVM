package com.example.root.fragmentmvvm.Main.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.fragmentmvvm.Main.Fragments.FragmentViewModel.HomeFragmentVM;
import com.example.root.fragmentmvvm.R;
import com.example.root.fragmentmvvm.databinding.FragmentHomeBinding;

import id.gits.mvvmcore.activity.GitsActivity;
import id.gits.mvvmcore.fragment.GitsFragment;


public class HomeFragment extends GitsFragment<HomeFragmentVM,FragmentHomeBinding> {


    @Override
    public int getResLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public HomeFragmentVM getViewModel() {
        return new HomeFragmentVM(getContext());
    }

    @Override
    public void bindViewModel(FragmentHomeBinding binding, HomeFragmentVM viewModel) {
            binding.setVm(viewModel);
    }
}
