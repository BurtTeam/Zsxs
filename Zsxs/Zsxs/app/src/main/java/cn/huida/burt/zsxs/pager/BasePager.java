
package cn.huida.burt.zsxs.pager;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;



import cn.huida.burt.zsxs.R;


/**
 * Created by Q on 2017/6/24.
 */

public abstract class BasePager extends Fragment{
    public View view;
    public FrameLayout mLayout;
    public FragmentActivity mActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= initView(inflater,container);
        return view;
    }
    public abstract View initView(LayoutInflater inflater,ViewGroup container) ;




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = getActivity();
    }
}
