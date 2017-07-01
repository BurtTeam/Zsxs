


package cn.huida.burt.zsxs.pager;


import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

import java.util.Arrays;
import java.util.List;

import cn.huida.burt.zsxs.MainActivity;
import cn.huida.burt.zsxs.R;
import cn.huida.burt.zsxs.pojo.ZsxsBean;
import cn.huida.burt.zsxs.view.gangedrecyclerview.CheckListener;
import cn.huida.burt.zsxs.view.gangedrecyclerview.RvListener;
import cn.huida.burt.zsxs.view.gangedrecyclerview.SortAdapter;
import cn.huida.burt.zsxs.view.gangedrecyclerview.SortDetailFragment;


/**
 * Created by Administrator on 2017/3/28.
 */

public class ClassPager extends BasePager implements View.OnClickListener ,CheckListener{

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


    private RecyclerView rvSort;
    private SortAdapter mSortAdapter;
    private SortDetailFragment mSortDetailFragment;
    private MainActivity mContext;
    public static boolean left;
    public static int finalNumber = 0;


    private String rootUrl = "http://api.chinaplat.com/getval_2017?Action=GetCourseTypesList";
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = initView(inflater,container);
        initData();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        initViews();
        initDataAd();
    }

    private void initViews() {
        rvSort = (RecyclerView) view.findViewById(R.id.rv_sort);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        rvSort.setLayoutManager(linearLayoutManager);
        DividerItemDecoration decoration = new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL);
        rvSort.addItemDecoration(decoration);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=(MainActivity)getActivity();
    }

    @Override
    public View initView(final LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.class_layout,container,false);
        tv_class = (TextView) view.findViewById(R.id.tv_class);
        rb_class_exam = (RadioButton) view.findViewById(R.id.rb_class_exam);
        rb_class_work = (RadioButton) view.findViewById(R.id.rb_class_work);
        rb_class_life = (RadioButton) view.findViewById(R.id.rb_class_life);
        right_top_more = (ImageButton) view.findViewById(R.id.right_top_more);
        rg_class = (RadioGroup) view.findViewById(R.id.rg_class);
        right_top_more.setOnClickListener(this);
        return view;
    }


    private void initDataAd() {
        String[] classify = getResources().getStringArray(R.array.pill);
        List<String> list = Arrays.asList(classify);
        mSortAdapter = new SortAdapter(mContext, list, new RvListener() {
            @Override
            public void onItemClick(int id, int position) {
                if (mSortDetailFragment != null) {
                    setChecked(position, true);
                }
            }
        });
        rvSort.setAdapter(mSortAdapter);
        createFragment();
    }

    public void createFragment() {
        FragmentTransaction fragmentTransaction = mContext.getSupportFragmentManager().beginTransaction();
        mSortDetailFragment = new SortDetailFragment();
        mSortDetailFragment.setListener(this);
        fragmentTransaction.add(R.id.lin_fragment, mSortDetailFragment);
        fragmentTransaction.commit();
    }

    private void setChecked(int position, boolean isLeft) {
        finalNumber = position;
        left = isLeft;
        Log.d("boolean---->", String.valueOf(left));
        mSortAdapter.setCheckedPosition(position);
        if (isLeft) {
            mSortDetailFragment.setData(position * 10 + position);
        }

    }






    public void initData() {
        //getDataForNet(null);
        rb_class_exam.setChecked(true);
        rg_class.setOnCheckedChangeListener(new MyOnCheckedChangeListener());
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
                        //getListViewData(getCourse_list.get(2).id);
                    }else {
                       // getListViewData(getCourse_list.get(0).id);
                    }
                    break;
                case R.id.rb_class_work:
                    rb_class_exam.setChecked(false);
                    rb_class_work.setChecked(true);
                    rb_class_life.setChecked(false);
                    Log.e("fgfg","工作");
                    //getListViewData(getCourse_list.get(1).id);
                    break;
                case R.id.rb_class_life:
                    rb_class_exam.setChecked(false);
                    rb_class_work.setChecked(false);
                    rb_class_life.setChecked(true);
                    Log.e("fgfg","生活");
                    if (kc_types=="2"||kc_types=="3") {
                        //getListViewData(getCourse_list.get(0).id);
                    }else {
                       // getListViewData(getCourse_list.get(2).id);
                    }
                    break;
                case R.id.right_top_more:
                    showPopupWindow();
                    break;
                case R.id.pop_tv_video:
                    kc_types = "0";
                    mPopupWindow.dismiss();
                    //getDataForNet(null);
                    tv_class.setText("视频中心");
                    rb_class_exam.setChecked(true);
                    rb_class_life.setChecked(false);
                    rb_class_work.setChecked(false);
                    break;
                case R.id.pop_tv_audio:
                    kc_types="1";
                    mPopupWindow.dismiss();
                   //getDataForNet(null);
                    tv_class.setText("音频中心");
                    rb_class_exam.setChecked(true);
                    rb_class_life.setChecked(false);
                    rb_class_work.setChecked(false);
                    break;
                case R.id.pop_tv_read:
                    kc_types="2";
                    mPopupWindow.dismiss();
                    //getDataForNet(null);
                    tv_class.setText("阅读中心");
                    rb_class_exam.setChecked(true);
                    rb_class_life.setChecked(false);
                    rb_class_work.setChecked(false);
                    break;
                case R.id.pop_tv_article:
                    kc_types="3";
                    mPopupWindow.dismiss();
                   // getDataForNet(null);
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

    @Override
    public void check(int position, boolean isChecked) {
        setChecked(position, isChecked);
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
                      //  getListViewData(getCourse_list.get(2).id);
                    }else {
                       // getListViewData(getCourse_list.get(0).id);
                    }
                    break;
                case R.id.rb_class_work:
                    rb_class_exam.setChecked(false);
                    rb_class_work.setChecked(true);
                    rb_class_life.setChecked(false);
                    Log.e("fgfg","工作");
                   // getListViewData(getCourse_list.get(1).id);
                    break;
                case R.id.rb_class_life:
                    rb_class_exam.setChecked(false);
                    rb_class_work.setChecked(false);
                    rb_class_life.setChecked(true);
                    Log.e("fgfg","生活");
                    if (kc_types=="2"||kc_types=="3") {
                       // getListViewData(getCourse_list.get(0).id);
                    }else {
                       // getListViewData(getCourse_list.get(2).id);
                    }
                    break;
            }
        }
    }
}
