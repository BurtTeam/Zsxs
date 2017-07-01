
package cn.huida.burt.zsxs.pager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import cn.huida.burt.zsxs.R;


/**
 * Created by Administrator on 2017/3/28.
 */

public class MyClassPager extends BasePager {


    @Override
    public View initView(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.myclass_layout,null);
        initData();
        return inflate;
    }


    public void initData() {

    }
}
