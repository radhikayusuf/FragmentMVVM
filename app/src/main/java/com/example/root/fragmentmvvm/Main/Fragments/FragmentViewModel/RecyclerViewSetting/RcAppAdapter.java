package com.example.root.fragmentmvvm.Main.Fragments.FragmentViewModel.RecyclerViewSetting;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.root.fragmentmvvm.Main.Dao.MyAppDao;
import com.example.root.fragmentmvvm.R;
import com.example.root.fragmentmvvm.databinding.MyappRowBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;

/**
 * Created by root on 06/10/16.
 */

public class RcAppAdapter extends GitsAdapter<MyAppDao, RcAppVM, MyappRowBinding> {
    public RcAppAdapter(List<MyAppDao> collection) {
        super(collection);
    }

    @Override
    public RcAppVM createViewModel(AppCompatActivity activity, MyappRowBinding binding, MyAppDao item, int position) {
        return new RcAppVM(activity,binding,item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.myapp_row;
    }

    @Override
    public void render(MyappRowBinding binding, RcAppVM viewModel, MyAppDao item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(MyAppDao data, int position) {
        Toast.makeText(mContext, "My App "+ mCollection.get(position).getTitle(), Toast.LENGTH_SHORT).show();
    }
}
