package com.sankuai.xm.imui.common.panel.plugin.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.view.viewpagerindicator.CirclePageIndicator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PageView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public a b;
    private ViewPager c;
    private CirclePageIndicator d;
    private int e;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    public PageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "141f6fb40a281d74f5cc68c38982d948", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "141f6fb40a281d74f5cc68c38982d948");
        }
    }

    public PageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8f047b4f8bdd022279daead1892500", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8f047b4f8bdd022279daead1892500");
        }
    }

    public PageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c619f688a2840b14299b0ef1f94d66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c619f688a2840b14299b0ef1f94d66");
            return;
        }
        this.e = 0;
        inflate(context, R.layout.xm_sdk_pager_view, this);
        this.c = (ViewPager) findViewById(R.id.xm_sdk_view_pager);
        this.d = (CirclePageIndicator) findViewById(R.id.xm_sdk_indicator);
        this.c.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.PageView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e62647c50e296d2b50e3d14222b49b8e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e62647c50e296d2b50e3d14222b49b8e");
                    return;
                }
                PageView.this.e = i2;
                if (PageView.this.b != null) {
                    PageView.this.b.a(i2);
                }
            }
        });
        this.c.addOnAdapterChangeListener(new ViewPager.OnAdapterChangeListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.PageView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnAdapterChangeListener
            public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
                Object[] objArr2 = {viewPager, pagerAdapter, pagerAdapter2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4871caee61471fb85d70aa0c6d53cd88", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4871caee61471fb85d70aa0c6d53cd88");
                } else {
                    PageView.this.e = 0;
                }
            }
        });
    }

    public final PageView a(PagerAdapter pagerAdapter) {
        Object[] objArr = {pagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b79565d457f98aa7b23a6a98b8c46ef", 6917529027641081856L)) {
            return (PageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b79565d457f98aa7b23a6a98b8c46ef");
        }
        this.c.setAdapter(pagerAdapter);
        this.d.setViewPager(this.c);
        return this;
    }

    public final PageView a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1600e8b0cb14a9b67ccc49c7b20fd3", 6917529027641081856L)) {
            return (PageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1600e8b0cb14a9b67ccc49c7b20fd3");
        }
        this.d.setVisibility(z ? 0 : 8);
        return this;
    }

    public final PageView a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79341970e3adead9dfbf1283a672c76", 6917529027641081856L)) {
            return (PageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79341970e3adead9dfbf1283a672c76");
        }
        if (this.e < 0 || this.c.getAdapter() == null) {
            return this;
        }
        if (this.c.getCurrentItem() != this.e) {
            this.e = this.c.getCurrentItem();
        }
        if (this.b != null) {
            this.b.a(this.e);
        }
        return this;
    }

    public ViewPager getPager() {
        return this.c;
    }
}
