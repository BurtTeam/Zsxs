


package cn.huida.burt.zsxs.pager;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;
import java.util.List;
import cn.huida.burt.zsxs.R;
import cn.huida.burt.zsxs.pojo.ZsxsBean;




/**
 * Created by Administrator on 2017/3/28.
 */

public class ClassPager extends BasePager implements View.OnClickListener{

    private ImageButton right_top_more;
    private GridView gv_class;
    private ListView lv_class;
    private PopupWindow mPopupWindow;
    private TextView tv_class;
    private TextView pop_tv_audio;
    private TextView pop_tv_read;
    private TextView pop_tv_video;
    private TextView pop_tv_article;
    private RadioButton rb_class_exam;
    private RadioButton rb_class_work;
    private RadioButton rb_class_life;
    private String kc_types = "0";
    private int currentPosi = 0;
    private ZsxsBean.XGetCourseTypesList getCourseBean;
    private List<ZsxsBean.XGetCourseTypesList.XTopListBean> getCourse_list;
    private ZsxsBean.XLeftCourseBean xLeftCourseBean;
    private List<ZsxsBean.XLeftCourseBean.TleftListBean> leftCourse_list;
    private RadioGroup rg_class;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=initView(inflater,container);
        initData();
        return view;
    }

    @Override
    public View initView(final LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.class_layout,container,false);

        lv_class = (ListView) view.findViewById(R.id.lv_class);
        gv_class = (GridView) view.findViewById(R.id.gv_class);
        tv_class = (TextView) view.findViewById(R.id.tv_class);
        rb_class_exam = (RadioButton) view.findViewById(R.id.rb_class_exam);
        rb_class_work = (RadioButton) view.findViewById(R.id.rb_class_work);
        rb_class_life = (RadioButton) view.findViewById(R.id.rb_class_life);
        right_top_more = (ImageButton) view.findViewById(R.id.right_top_more);
        rg_class = (RadioGroup) view.findViewById(R.id.rg_class);

        right_top_more.setOnClickListener(this);

        return view;
    }


    public void initData() {
        getDataForNet(null);
        rb_class_exam.setChecked(true);
        rg_class.setOnCheckedChangeListener(new MyOnCheckedChangeListener());
    }

    String rootUrl = "http://api.chinaplat.com/getval_2017?Action=GetCourseTypesList";

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
                    preseData(result);
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
        //第一次获取数据
    private void preseData(String result) {
        Gson gson = new Gson();
        getCourseBean = gson.fromJson(result, ZsxsBean.XGetCourseTypesList.class);
        getCourse_list = getCourseBean.t_list;

        if (kc_types=="0"||kc_types=="1"){
            getListViewData( getCourse_list.get(0).id);
        }else {
            getListViewData( getCourse_list.get(2).id);
        }
        }
        //下载左侧数据
    private void getListViewData(String tid) {
        Log.e("================","sdffffffffffffff");
        RequestParams params = new RequestParams(rootUrl);
        params.addBodyParameter("kc_types",kc_types);
        params.addBodyParameter("tid",tid);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                //解析result
                if (result!=null){
                    preseDataList(result);
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

    private void preseDataList(String result) {
        Gson gson = new Gson();
        xLeftCourseBean = gson.fromJson(result, ZsxsBean.XLeftCourseBean.class);
        leftCourse_list = xLeftCourseBean.t_list;
        final myLeftAdapter myLeftAdapter = new myLeftAdapter();
        lv_class.setAdapter(myLeftAdapter);
        lv_class.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                currentPosi = position;
                myLeftAdapter.notifyDataSetChanged();
            }
        });
    }


    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.rb_class_exam:
                    rb_class_exam.setChecked(true);
                    rb_class_work.setChecked(false);
                    rb_class_life.setChecked(false);
                    Log.e("fgfg","考试");
                    if (kc_types=="2"||kc_types=="3") {
                        getListViewData(getCourse_list.get(2).id);
                    }else {
                        getListViewData(getCourse_list.get(0).id);
                    }
                    break;
                case R.id.rb_class_work:
                    rb_class_exam.setChecked(false);
                    rb_class_work.setChecked(true);
                    rb_class_life.setChecked(false);
                    Log.e("fgfg","工作");
                    getListViewData(getCourse_list.get(1).id);
                    break;
                case R.id.rb_class_life:
                    rb_class_exam.setChecked(false);
                    rb_class_work.setChecked(false);
                    rb_class_life.setChecked(true);
                    Log.e("fgfg","生活");
                    if (kc_types=="2"||kc_types=="3") {
                        getListViewData(getCourse_list.get(0).id);
                    }else {
                        getListViewData(getCourse_list.get(2).id);
                    }
                    break;
                case R.id.right_top_more:
                    showPopupWindow();
                    break;
                case R.id.pop_tv_video:
                    kc_types = "0";
                    mPopupWindow.dismiss();
                    getDataForNet(null);
                    tv_class.setText("视频中心");
                    rb_class_exam.setChecked(true);
                    rb_class_life.setChecked(false);
                    rb_class_work.setChecked(false);
                    break;
                case R.id.pop_tv_audio:
                    kc_types="1";
                    mPopupWindow.dismiss();
                    getDataForNet(null);
                    tv_class.setText("音频中心");
                    rb_class_exam.setChecked(true);
                    rb_class_life.setChecked(false);
                    rb_class_work.setChecked(false);
                    break;
                case R.id.pop_tv_read:
                    kc_types="2";
                    mPopupWindow.dismiss();
                    getDataForNet(null);
                    tv_class.setText("阅读中心");
                    rb_class_exam.setChecked(true);
                    rb_class_life.setChecked(false);
                    rb_class_work.setChecked(false);
                    break;
                case R.id.pop_tv_article:
                    kc_types="3";
                    mPopupWindow.dismiss();
                    getDataForNet(null);
                    tv_class.setText("文章中心");
                    rb_class_exam.setChecked(true);
                    rb_class_life.setChecked(false);
                    rb_class_work.setChecked(false);
                    break;
            }
        Log.e("=======",kc_types);
        currentPosi = 0;
    }

    private void showPopupWindow() {
        mPopupWindow = new PopupWindow(getContext());
        mPopupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        mPopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        View popview = LayoutInflater.from(getContext()).inflate(R.layout.layout_popupwindow, null);
        mPopupWindow.setContentView(popview);
        pop_tv_audio = (TextView) popview.findViewById(R.id.pop_tv_audio);
        pop_tv_read = (TextView) popview.findViewById(R.id.pop_tv_read);
        pop_tv_video = (TextView) popview.findViewById(R.id.pop_tv_video);
        pop_tv_article = (TextView) popview.findViewById(R.id.pop_tv_article);

        pop_tv_audio.setOnClickListener(this);
        pop_tv_read.setOnClickListener(this);
        pop_tv_video.setOnClickListener(this);
        pop_tv_article.setOnClickListener(this);

        // 设置PopupWindow的背景颜色为半透明的白色
        ColorDrawable dw = new ColorDrawable(Color.parseColor("#ddffffff"));
        mPopupWindow.setBackgroundDrawable(dw);
        // 设置PopupWindow弹出窗体动画效果
        //popupWindow.setAnimationStyle(R.style.PopWindowAnimStyle);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setFocusable(true);

        mPopupWindow.showAsDropDown(right_top_more);
    }

    class myLeftAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return leftCourse_list.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = View.inflate(getContext(), R.layout.class_layout_lv_item, null);
            TextView tv_class_lv = (TextView) view.findViewById(R.id.tv_class_lv);
            tv_class_lv.setText(leftCourse_list.get(i).name);

            if (currentPosi==i){
                tv_class_lv.setEnabled(true);
            }else{
                tv_class_lv.setEnabled(false);
            }
            return view;
        }
    }

    private class MyOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
            switch (i){
                case R.id.rb_class_exam:
                    rb_class_exam.setChecked(true);
                    rb_class_work.setChecked(false);
                    rb_class_life.setChecked(false);
                    Log.e("fgfg","考试");
                    if (kc_types=="2"||kc_types=="3") {
                        getListViewData(getCourse_list.get(2).id);
                    }else {
                        getListViewData(getCourse_list.get(0).id);
                    }
                    break;
                case R.id.rb_class_work:
                    rb_class_exam.setChecked(false);
                    rb_class_work.setChecked(true);
                    rb_class_life.setChecked(false);
                    Log.e("fgfg","工作");
                    getListViewData(getCourse_list.get(1).id);
                    break;
                case R.id.rb_class_life:
                    rb_class_exam.setChecked(false);
                    rb_class_work.setChecked(false);
                    rb_class_life.setChecked(true);
                    Log.e("fgfg","生活");
                    if (kc_types=="2"||kc_types=="3") {
                        getListViewData(getCourse_list.get(0).id);
                    }else {
                        getListViewData(getCourse_list.get(2).id);
                    }
                    break;
            }
        }
    }
}
