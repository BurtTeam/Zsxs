
package cn.huida.burt.zsxs.pager;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.huida.burt.zsxs.R;


/**
 * Created by Administrator on 2017/3/28.
 */

public class MyPager extends BasePager {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=initView(inflater,container);
        return view;
    }

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.my_layout,container,false);
        initData();
        return inflate;
    }


    public void initData() {

    }
}
