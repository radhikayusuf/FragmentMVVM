package com.example.root.fragmentmvvm.Main.Fragments.FragmentViewModel.RecyclerViewSetting;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.media.Image;
import android.widget.ImageView;

import com.example.root.fragmentmvvm.Main.Dao.MyAppDao;
import com.example.root.fragmentmvvm.databinding.MyappRowBinding;
import com.squareup.picasso.Picasso;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 06/10/16.
 */

public class RcAppVM extends GitsRowVM<MyAppDao, MyappRowBinding> {
    public ObservableField<String> bTitle = new ObservableField<>();
    public ObservableField<String> bImageResource = new ObservableField<>();
    public static Context ctx;

    public RcAppVM(Context context, MyappRowBinding binding, MyAppDao data) {
        super(context, binding, data);
        bTitle.set(data.getTitle());
        System.out.println("datanya "+ bTitle.get());
        bImageResource.set(data.getImg());
        ctx = context;
    }


    @BindingAdapter({"setBackground"})
    public static void setBackground(ImageView iv, String value){
        Picasso.with(ctx)
                .load("http://www.morefoods.hol.es/img/"+value)
                .into(iv);

        System.out.println("Imagenya "+"http://www.morefoods.hol.es/img/"+value);
    }
}
