package com.sankuai.waimai.platform.widget.scrollview;

import android.view.MotionEvent;
import com.sankuai.waimai.platform.widget.compat.ViewPagerCompat;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NoScrollViewPager extends ViewPagerCompat {
    @Override // com.sankuai.waimai.platform.widget.compat.ViewPagerCompat, android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.sankuai.waimai.platform.widget.compat.ViewPagerCompat, android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
