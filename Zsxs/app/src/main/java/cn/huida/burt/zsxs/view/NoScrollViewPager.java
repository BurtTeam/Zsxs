
package cn.huida.burt.zsxs.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Administrator on 2017/4/9.
 */

public class NoScrollViewPager extends ViewPager {

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        return true;
    }

    //用来拦截事件的方法
    //当该viewpager(5)里层的viewpager(12) 滑动到最后一个条目的时候，事件被该viewpager(5)
    //拦截下来，消费掉了，出现bug
    //解决方式，重写该viewpager的拦截事件的方法   让他任何时候都不拦截事件

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
}
