package cn.huida.burt.zsxs.application;

import android.app.Application;

import org.xutils.x;

/**
 * Created by xx on 2017/6/30.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
