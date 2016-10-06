package com.example.root.fragmentmvvm.Main.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.fragmentmvvm.Main.Fragments.FragmentViewModel.ListAppFragmentViewModel;
import com.example.root.fragmentmvvm.R;
import com.example.root.fragmentmvvm.databinding.FragmentListAppBinding;

import id.gits.mvvmcore.fragment.GitsFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListAppFragment extends GitsFragment<ListAppFragmentViewModel, FragmentListAppBinding> {


    @Override
    public int getResLayout() {
        return R.layout.fragment_list_app;
    }

    @Override
    public ListAppFragmentViewModel getViewModel() {
        return new ListAppFragmentViewModel(getContext());
    }

    @Override
    public void bindViewModel(FragmentListAppBinding binding, ListAppFragmentViewModel viewModel) {
        binding.setVm(viewModel);
    }
}
