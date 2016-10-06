package com.example.root.fragmentmvvm.Main;

import com.example.root.fragmentmvvm.Main.ViewModel.MainActivityVM;
import com.example.root.fragmentmvvm.R;
import com.example.root.fragmentmvvm.databinding.ActivityMainBinding;

import id.gits.mvvmcore.activity.GitsActivity;

public class MainActivity extends GitsActivity<MainActivityVM, ActivityMainBinding> {

    @Override
    protected int getToolbarId() {
        return 0;
    }

    @Override
    public int getResLayout() {
        return R.layout.activity_main;
    }

    @Override
    public MainActivityVM getViewModel() {
        return new MainActivityVM(this, getSupportFragmentManager());
    }

    @Override
    public void bindViewModel(ActivityMainBinding binding, MainActivityVM viewModel) {
        binding.setVm(viewModel);
    }
}
