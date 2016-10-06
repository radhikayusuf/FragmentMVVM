package com.example.root.fragmentmvvm.Main.Fragments.FragmentViewModel.RecyclerViewSetting;

import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;

import com.example.root.fragmentmvvm.Main.Dao.MyAppDao;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 06/10/16.
 */

public class RcAppVM extends GitsRowVM {
    public ObservableField<String> bTitle = new ObservableField<>();
    public ObservableField<String> bImageResource = new ObservableField<>();

    public RcAppVM(Context context, ViewDataBinding binding, MyAppDao data) {
        super(context, binding, data);
        bTitle.set(data.getTitle());
    }
}
