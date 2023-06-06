package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f8c66fc240102ce6e9c4804326a3f30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f8c66fc240102ce6e9c4804326a3f30");
        } else {
            this.c = false;
        }
    }

    public SCViewPagerCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10eaddcfae366384ff948f1a78db697d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10eaddcfae366384ff948f1a78db697d");
        } else {
            this.c = false;
        }
    }

    public void setViewTouchMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e89c43d7ea9a8a19f975ee870ac7405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e89c43d7ea9a8a19f975ee870ac7405");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d49b0a4d51d20c30bbc891862318a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d49b0a4d51d20c30bbc891862318a14");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4707d60f3e3e935fc874cf4e18ed061", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4707d60f3e3e935fc874cf4e18ed061")).booleanValue() : !this.c && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager
    public boolean arrowScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "232067ffee72c3063e1aa63be391aad7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "232067ffee72c3063e1aa63be391aad7")).booleanValue() : !this.c && (i == 17 || i == 66) && super.arrowScroll(i);
    }
}
