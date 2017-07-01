package cn.huida.burt.zsxs;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

import cn.huida.burt.zsxs.pager.BasePager;
import cn.huida.burt.zsxs.pager.ClassPager;
import cn.huida.burt.zsxs.pager.HomePager;
import cn.huida.burt.zsxs.pager.MyClassPager;
import cn.huida.burt.zsxs.pager.MyPager;
import cn.huida.burt.zsxs.view.NoScrollViewPager;
import cn.huida.burt.zsxs.view.gangedrecyclerview.CheckListener;


public class MainActivity extends FragmentActivity   {
    public ArrayList<BasePager> pagerList;
    private NoScrollViewPager vp_main_tab;
    private RadioButton rb_home;
    private MyAdapter myAdapter;
    private RadioButton rb_my;
    private RadioButton rb_myclass;
    private RadioButton rb_class;
    private RadioGroup rb_main;
    public static boolean left;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        vp_main_tab = (NoScrollViewPager) findViewById(R.id.vp_main_tab);
        rb_main = (RadioGroup) findViewById(R.id.rb_main);
        rb_class = (RadioButton) findViewById(R.id.rb_class);
        rb_myclass = (RadioButton) findViewById(R.id.rb_myclass);
        rb_home = (RadioButton) findViewById(R.id.rb_home);
        rb_my = (RadioButton) findViewById(R.id.rb_my);
        rb_home.setChecked(true);
        rb_home.setTextColor(getResources().getColor(R.color.colorgreen));
        rb_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_home:
                        rb_home.setTextColor(getResources().getColor(R.color.colorgreen));
                        rb_class.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_myclass.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_my.setTextColor(getResources().getColor(R.color.colorgrey));
                        vp_main_tab.setCurrentItem(0);
                        break;
                    case R.id.rb_class:
                        rb_home.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_class.setTextColor(getResources().getColor(R.color.colorgreen));
                        rb_myclass.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_my.setTextColor(getResources().getColor(R.color.colorgrey));
                        vp_main_tab.setCurrentItem(1);
                        break;
                    case R.id.rb_myclass:
                        rb_home.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_class.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_myclass.setTextColor(getResources().getColor(R.color.colorgreen));
                        rb_my.setTextColor(getResources().getColor(R.color.colorgrey));
                        vp_main_tab.setCurrentItem(2);
                        break;
                    case R.id.rb_my:
                        rb_home.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_class.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_myclass.setTextColor(getResources().getColor(R.color.colorgrey));
                        rb_my.setTextColor(getResources().getColor(R.color.colorgreen));
                        vp_main_tab.setCurrentItem(3);
                        break;
                }
            }
        });

    }

    private void initData() {
        pagerList = new ArrayList<>();
        pagerList.add(new HomePager());
        pagerList.add(new ClassPager());
        pagerList.add(new MyClassPager());
        pagerList.add(new MyPager());
        myAdapter = new MyAdapter(getSupportFragmentManager(), pagerList);
        vp_main_tab.setAdapter(myAdapter);
        vp_main_tab.setCurrentItem(0);
        vp_main_tab.setOffscreenPageLimit(3);
    }


}

    class MyAdapter extends FragmentPagerAdapter {
        private final ArrayList<BasePager> pagerList;

        public MyAdapter(FragmentManager fm, ArrayList<BasePager> pagerList) {
            super(fm);
            this.pagerList=pagerList;
        }

        @Override
        public Fragment getItem(int position) {
            return pagerList.get(position);
        }

        @Override
        public int getCount() {
            return pagerList.size();
        }

}
