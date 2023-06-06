package com.sankuai.waimai.store.drug.newwidgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.banner.SCBaseViewPager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCViewPagerCompat extends SCBaseViewPager {
    public static ChangeQuickRedirect a;
    private boolean c;

    public SCViewPagerCompat(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3029881ad66d75ef0d006a2f7efeace", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3029881ad66d75ef0d006a2f7efeace");
        } else {
            this.c = false;
        }
    }

    public void setViewTouchMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a97f941117289fc15ab01e74c65d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a97f941117289fc15ab01e74c65d96");
            return;
        }
        if (z && !isFakeDragging()) {
            beginFakeDrag();
        } else if (!z && isFakeDragging()) {
            endFakeDrag();
        }
        this.c = z;
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cfd7af48e91a42a223b558dfd90a574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cfd7af48e91a42a223b558dfd90a574");
        } else if (this.c) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i);
        }
    }

    @Override // com.sankuai.waimai.store.view.banner.SCBaseViewPager, android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab2b257fab5b9b78b3ca65ab170d96e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab2b257fab5b9b78b3ca65ab170d96e8")).booleanValue() : !this.c && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager
    public boolean arrowScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a69eee65b525dadea16fac2c7b898e75", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a69eee65b525dadea16fac2c7b898e75")).booleanValue() : !this.c && (i == 17 || i == 66) && super.arrowScroll(i);
    }
}
