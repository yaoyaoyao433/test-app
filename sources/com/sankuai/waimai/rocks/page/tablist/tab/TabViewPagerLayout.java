package com.sankuai.waimai.rocks.page.tablist.tab;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TabViewPagerLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    FrameLayout b;
    a c;
    ViewPager d;
    PagerAdapter e;

    public TabViewPagerLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54ca423639dfd707ec2f02916ccc0a67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54ca423639dfd707ec2f02916ccc0a67");
        }
    }

    public TabViewPagerLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b3694bf8cf2db03eb16511e4ee9ed04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b3694bf8cf2db03eb16511e4ee9ed04");
        }
    }

    public TabViewPagerLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c91fb030ff52aa39bbc3d7991c280a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c91fb030ff52aa39bbc3d7991c280a");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cbf6e1507f1ad0dded08bda5cefb689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cbf6e1507f1ad0dded08bda5cefb689");
            return;
        }
        this.b = (FrameLayout) findViewById(R.id.rocks_tab_layout_container);
        this.d = (ViewPager) findViewById(R.id.rocks_tab_viewpager);
        super.onFinishInflate();
    }

    public a getTabLayout() {
        return this.c;
    }

    public ViewPager getViewPager() {
        return this.d;
    }
}
