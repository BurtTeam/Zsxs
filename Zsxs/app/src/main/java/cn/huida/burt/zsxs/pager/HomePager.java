
package cn.huida.burt.zsxs.pager;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.huida.burt.zsxs.anim.DepthPageTransformer;
import cn.huida.burt.zsxs.R;
import cn.huida.burt.zsxs.pojo.ZsxsBean;
import cn.huida.burt.zsxs.utils.NetUrl;
import cn.huida.burt.zsxs.view.MyGridView;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import cn.huida.burt.zsxs.R;


/**
 * Created by Administrator on 2017/3/28.
 */

public class HomePager extends BasePager implements View.OnClickListener {
    private static final int HUNDRED_CLASS =2 ;
    private static final int RECOMMEND_CLASS = 3;
    private int preSelected=0;
    private static final int GET_HOME_PIC = 0;
    private static final int CarouselFigure_Move=1;
    private ViewPager home_vp;
    private List<ZsxsBean.QGuidePic.SlidesBean> piglist;
    private ImageView head_pic_1;
    private ImageView head_pic_2;
    private ImageView head_pic_3;
    private ImageView head_pic_4;
    private ImageButton weekly_class_content_1;
    private TextView weekly_class_content_title_1;
    private ImageButton weekly_class_content_2;
    private TextView weekly_class_content_title_2;
    private ImageButton weekly_class_content_3;
    private TextView weekly_class_content_title_3;
    private TextView home_getmore;
    private MyGridView home_recommend_gv;
    private OkHttpClient okHttpClient;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case GET_HOME_PIC:
                    String Home_pic = (String) msg.obj;
                    parseData(Home_pic);
                    break;
                case CarouselFigure_Move:
                    //轮播图切换下一页
                    home_vp.setCurrentItem((home_vp.getCurrentItem()+1)%piglist.size());
                    //再次发消息（循环）
                    handler.sendEmptyMessageDelayed(CarouselFigure_Move, 4000);
                    break;
                case HUNDRED_CLASS:
                    String Hundred_pic = (String) msg.obj;
                    parseHundredData(Hundred_pic);
                    break;
                case RECOMMEND_CLASS:
                    String  recommend_pic_info = (String) msg.obj;
                    parseRecommendData(recommend_pic_info);
                    break;
            }
        }
    };
    private ZsxsBean.QRecommendClassInfo qRecommendClassInfo;
    private int startY;
    private int startX;

    private void parseRecommendData(String recommend_pic_info) {
        Gson gson = new Gson();
        qRecommendClassInfo = gson.fromJson(recommend_pic_info, ZsxsBean.QRecommendClassInfo.class);
        home_recommend_gv.setAdapter(new HomeRecommendInfoAdapter());
    }
    class HomeRecommendInfoAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return qRecommendClassInfo.Course.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder=null;
            if (holder==null){
                holder=new ViewHolder();
                convertView = View.inflate(mActivity, R.layout.home_recommend_class_layout, null);
                holder.home_recommend_pic_1= (ImageView) convertView.findViewById(R.id.home_recommend_pic_1);
                holder.home_recommend_title_1 = (TextView) convertView.findViewById(R.id.home_recommend_title_1);
                holder.home_recommend_title_2 = (TextView) convertView.findViewById(R.id.home_recommend_title_2);
                holder.home_recommend_class_number= (TextView) convertView.findViewById(R.id.home_recommend_class_number);
                holder.home_recommend_class_hot= (TextView) convertView.findViewById(R.id.home_recommend_class_hot);
                convertView.setTag(holder);
            }else{
                holder= (ViewHolder) convertView.getTag();
            }
            Picasso.with(getActivity()).load( qRecommendClassInfo.Course.get(position).img)
                    .fit()
                    .placeholder(R.drawable.huandengpian)
                    .error(R.drawable.huandengpian)
                    .into(holder.home_recommend_pic_1);
            holder.home_recommend_pic_1.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.home_recommend_title_1.setText(qRecommendClassInfo.Course.get(position).title);
            holder.home_recommend_title_2.setText(qRecommendClassInfo.Course.get(position).info);
            holder.home_recommend_class_number.setText(qRecommendClassInfo.Course.get(position).keshi+"课时");
            holder.home_recommend_class_hot.setText(qRecommendClassInfo.Course.get(position).hot+"");
            return convertView;
        }

        class  ViewHolder{
            public  ImageView home_recommend_pic_1;
            public  TextView home_recommend_title_1;
            public   TextView home_recommend_title_2;
            public   TextView home_recommend_class_number;
            public   TextView home_recommend_class_hot;

        }
    }

    private ZsxsBean.QClass100Info qClass100Info;

    private void parseHundredData(String hundred_pic) {
        Gson gson = new Gson();
        qClass100Info = gson.fromJson(hundred_pic, ZsxsBean.QClass100Info.class);

        Picasso.with(getActivity()).load( qClass100Info.Course.get(0).img)
                .fit()
                .placeholder(R.drawable.huandengpian)
                .error(R.drawable.huandengpian)
                .into(weekly_class_content_1);
        weekly_class_content_1.setScaleType(ImageView.ScaleType.FIT_XY);
        weekly_class_content_title_1.setText(qClass100Info.Course.get(0).title);

        Picasso.with(getActivity()).load( qClass100Info.Course.get(1).img)
                .fit()
                .placeholder(R.drawable.huandengpian)
                .error(R.drawable.huandengpian)
                .into(weekly_class_content_2);
        weekly_class_content_2.setScaleType(ImageView.ScaleType.FIT_XY);
        weekly_class_content_title_2.setText(qClass100Info.Course.get(1).title);

        Picasso.with(getActivity()).load( qClass100Info.Course.get(2).img)
                .fit()
                .placeholder(R.drawable.huandengpian)
                .error(R.drawable.huandengpian)
                .into(weekly_class_content_3);
        weekly_class_content_3.setScaleType(ImageView.ScaleType.FIT_XY);
        weekly_class_content_title_3.setText(qClass100Info.Course.get(2).title);
    }

    private ZsxsBean.QGuidePic bean;

    private LinearLayout home_vp_point;
    private float startTime;
    private float end;


    private void parseData(String home_pic) {
        Gson gson = new Gson();
        bean = gson.fromJson(home_pic, ZsxsBean.QGuidePic.class);
        piglist = this.bean.Slides;
        home_vp.setPageTransformer(true, new DepthPageTransformer());
        home_vp.setAdapter(new HomeViewPager());

        //设置轮播图下面的四个小图片
        Picasso.with(getActivity()).load("http://www.chinaplat.com/images/app01.png")
                .fit()
                .placeholder(R.drawable.huandengpian)
                .error(R.drawable.huandengpian)
                .into(head_pic_1);
        head_pic_1.setScaleType(ImageView.ScaleType.FIT_XY);
        Picasso.with(getActivity()).load("http://www.chinaplat.com/images/app02.png")
                .fit()
                .placeholder(R.drawable.huandengpian)
                .error(R.drawable.huandengpian)
                .into(head_pic_2);
        head_pic_2.setScaleType(ImageView.ScaleType.FIT_XY);
        Picasso.with(getActivity()).load("http://www.chinaplat.com/images/app03.png")
                .fit()
                .placeholder(R.drawable.huandengpian)
                .error(R.drawable.huandengpian)
                .into(head_pic_3);
        head_pic_3.setScaleType(ImageView.ScaleType.FIT_XY);
        Picasso.with(getActivity()).load("http://www.chinaplat.com/images/app04.png")
                .fit()
                .placeholder(R.drawable.huandengpian)
                .error(R.drawable.huandengpian)
                .into(head_pic_4);
        head_pic_4.setScaleType(ImageView.ScaleType.FIT_XY);

        head_pic_1.setOnClickListener(this);
        head_pic_2.setOnClickListener(this);
        head_pic_3.setOnClickListener(this);
        head_pic_4.setOnClickListener(this);

        //百分百课程图片 标题设置
        getHundredClass(NetUrl.BaseUrl+"?Action=GetCourse100");

        //推荐课程 设置
        getCommendClass(NetUrl.BaseUrl+"?Action=GetTJCourseList");

        //点的设置
        home_vp.setOnPageChangeListener(new HomeViewPagerChangerListener());
        float density = getActivity().getResources().getDisplayMetrics().density;
        home_vp_point.removeAllViews();
        for (int i = 0; i <piglist.size() ; i++) {
            ImageView iv_point = new ImageView(getActivity());
            iv_point.setEnabled(false);
            iv_point.setBackgroundResource(R.drawable.point_selector);
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams((int)(5*density),(int)(5*density));
            if (i!=0){
                params.leftMargin= (int) (8*density);
            }
            home_vp_point.addView(iv_point,params);
        }
        //默认的点
        home_vp_point.getChildAt(preSelected).setEnabled(true);
        //发消息 让轮播图动起来

        handler.sendEmptyMessageDelayed(CarouselFigure_Move,4000);
    }

    private void getCommendClass(String url) {
        final Request request = new Request.Builder().url(url).build();
        new Thread(){
            @Override
            public void run() {
                okHttpClient = new OkHttpClient();
                try {
                    Response response = okHttpClient.newCall(request).execute();

                    if (response.isSuccessful()){
                        String s = response.body().string();
                        Message msg = Message.obtain();
                        msg.what=RECOMMEND_CLASS;
                        msg.obj=s;
                        handler.sendMessage(msg);
                    }else{
                        Log.e("msg","提取数据失败"+response.code());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    private void getHundredClass(String url) {
        final Request request = new Request.Builder().url(url).build();
        new Thread(){
            @Override
            public void run() {
                okHttpClient = new OkHttpClient();
                try {
                    Response response = okHttpClient.newCall(request).execute();

                    if (response.isSuccessful()){
                        String s = response.body().string();
                        Message msg = Message.obtain();
                        msg.what=HUNDRED_CLASS;
                        msg.obj=s;
                        handler.sendMessage(msg);
                    }else{
                        Log.e("msg","提取数据失败"+response.code());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    //四个小图片点击事件
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.head_pic_1:
                break;
            case R.id.head_pic_2:
                break;
            case R.id.head_pic_3:
                break;
            case R.id.head_pic_4:
                break;
        }
    }


    class HomeViewPagerChangerListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            home_vp_point.getChildAt(position).setEnabled(true);
            //将前一个点变色

            home_vp_point.getChildAt(preSelected).setEnabled(false);
            preSelected = position;
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
    class HomeViewPager extends PagerAdapter{

        @Override
        public int getCount() {
            return bean.Slides.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }


        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView iv = new ImageView(getActivity());
            Picasso.with(getActivity()).load(bean.Slides.get(position).pic)
                    .fit()
                    .placeholder(R.drawable.huandengpian)
                    .error(R.drawable.huandengpian)
                    .into(iv);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            container.addView(iv);

            //图片点击事件
            iv.setLongClickable(true);
            iv.setOnTouchListener(new MyOnTouchListener(position));

            return iv;
        }
        private class MyOnTouchListener implements View.OnTouchListener {
            int position=0;
            public MyOnTouchListener(int position){
                this.position=position;
            }
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        startX = (int) event.getX();
                        startY = (int) event.getY();
                        startTime = System.currentTimeMillis();
                        //循环停止
                        handler.removeMessages(CarouselFigure_Move);

                        break;
                    case MotionEvent.ACTION_UP:
                        end = System.currentTimeMillis();
                        if (end - startTime <150){
                            //页面跳转
                        }
                        handler.sendEmptyMessageDelayed(CarouselFigure_Move,4000);

                        break;
                    case MotionEvent.ACTION_MOVE:
                        handler.removeMessages(CarouselFigure_Move);
                        int diffX = (int) event.getX();
                        int diffY = (int) event.getY();
                        if (Math.abs(diffX-startX)>10) {
                            handler.sendEmptyMessageDelayed(CarouselFigure_Move, 4000);
                        }
                        break;
                }
                return true;
            }
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=initView(inflater,container);
        return view;
    }

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.home_layout,container,false);
        home_vp = (ViewPager) inflate.findViewById(R.id.home_vp);
        head_pic_1 = (ImageView) inflate.findViewById(R.id.head_pic_1);
        head_pic_2 = (ImageView) inflate.findViewById(R.id.head_pic_2);
        head_pic_3 = (ImageView) inflate.findViewById(R.id.head_pic_3);
        head_pic_4 = (ImageView) inflate.findViewById(R.id.head_pic_4);

        weekly_class_content_1 = (ImageButton) inflate. findViewById(R.id.weekly_class_content_1);
        weekly_class_content_title_1 = (TextView)inflate.findViewById(R.id.weekly_class_content_title_1);
        weekly_class_content_2 = (ImageButton) inflate. findViewById(R.id.weekly_class_content_2);
        weekly_class_content_title_2 = (TextView)inflate.findViewById(R.id.weekly_class_content_title_2);
        weekly_class_content_3 = (ImageButton) inflate. findViewById(R.id.weekly_class_content_3);
        weekly_class_content_title_3 = (TextView)inflate.findViewById(R.id.weekly_class_content_title_3);

        home_getmore = (TextView) inflate.findViewById(R.id.home_getmore);
        home_recommend_gv = (MyGridView) inflate.findViewById(R.id.home_recommend_gv);
        home_vp_point = (LinearLayout)inflate.findViewById(R.id.home_vp_point);
        initData();
        return inflate;
    }


    public void initData() {
        String url= NetUrl.BaseUrl+"?Action=GetSlides";
         final Request request = new Request.Builder().url(url).build();
        new Thread(){
            @Override
            public void run() {
                okHttpClient = new OkHttpClient();
                try {
                    Response response = okHttpClient.newCall(request).execute();

                    if (response.isSuccessful()){
                        String s = response.body().string();
                        Message msg = Message.obtain();
                        msg.what=GET_HOME_PIC;
                        msg.obj=s;
                        handler.sendMessage(msg);
                    }else{
                        Log.e("msg","提取数据失败"+response.code());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacksAndMessages(null);
    }

    @Override
    public void onStop() {
        super.onStop();
        handler.removeCallbacksAndMessages(null);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }
}

