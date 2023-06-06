package com.sankuai.waimai.business.page.home.head.majorcategory.indicator;

import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class OnPageChangeListenerHelper implements ViewPager.OnPageChangeListener {
    public static ChangeQuickRedirect c;
    private int a;
    private int b;

    public abstract int a();

    public abstract void a(int i);

    public abstract void a(int i, int i2, float f);

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa1be960396e221df1bcab2772a85be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa1be960396e221df1bcab2772a85be");
            return;
        }
        int i3 = this.a;
        if ((i != this.a && f == 0.0f) || this.a < i) {
            a(i3);
            this.a = i;
            i3 = i;
        }
        if (Math.abs(this.a - i) > 1) {
            a(i3);
            this.a = this.b;
        }
        int i4 = -1;
        if (this.a == i && this.a + 1 < a()) {
            i4 = this.a + 1;
        } else if (this.a > i) {
            i4 = i3;
            i3 = this.a - 1;
        }
        a(i3, i4, f);
        this.b = i;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        this.a = i;
    }
}
