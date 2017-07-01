package cn.huida.burt.zsxs.utils;

import android.util.Log;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

import cn.huida.burt.zsxs.pojo.ZsxsBean;

/**
 * Created by Q on 2017/6/25.
 */

public class NetUrl {
    public static  String BaseUrl="http://api.chinaplat.com/getval_2017";


    public String rootUrl = "http://api.chinaplat.com/getval_2017?Action=GetCourseTypesList";

    private String kc_types = "0";
    private int currentPosi = 0;

    private ZsxsBean.XLeftCourseBean xLeftCourseBean;


    //下载数据
    private void getDataForNet(String tid) {
        RequestParams params = new RequestParams(rootUrl);
        params.addBodyParameter("kc_types",kc_types);
        params.addBodyParameter("tid",tid);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                //解析result
                if (result!=null){

                }
            }
            //请求异常后的回调方法
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
            }
            //主动调用取消请求的回调方法
            @Override
            public void onCancelled(CancelledException cex) {
            }
            @Override
            public void onFinished() {
            }
        });
    }



    //下载左侧数据
    private  void getListViewData(String tid) {
        Log.e("================","sdffffffffffffff");


        RequestParams params = new RequestParams(rootUrl);
        params.addBodyParameter("kc_types",kc_types);
        params.addBodyParameter("tid",tid);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                //解析result
                if (result!=null){
                    Gson gson = new Gson();
                    xLeftCourseBean = gson.fromJson(result, ZsxsBean.XLeftCourseBean.class);
                }
            }
            //请求异常后的回调方法
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
            }
            //主动调用取消请求的回调方法
            @Override
            public void onCancelled(CancelledException cex) {
            }
            @Override
            public void onFinished() {
            }
        });
    }


}
