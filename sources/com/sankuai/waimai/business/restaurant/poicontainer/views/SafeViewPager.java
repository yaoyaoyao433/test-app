package com.sankuai.waimai.business.restaurant.poicontainer.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SafeViewPager extends ViewPager {
    public static ChangeQuickRedirect a;
    private boolean b;

    public SafeViewPager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5e6f396d36ad8539a2fac99eab0c12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5e6f396d36ad8539a2fac99eab0c12");
        } else {
            this.b = true;
        }
    }

    public SafeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adfc13b72685eb1b85f9dad5b0a1464e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adfc13b72685eb1b85f9dad5b0a1464e");
        } else {
            this.b = true;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6feeb2020638efc1148fa658469c2555", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6feeb2020638efc1148fa658469c2555")).booleanValue();
        }
        try {
            if (this.b) {
                if (super.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b75a1c69afdf4da5ee97c06f416b758", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b75a1c69afdf4da5ee97c06f416b758")).booleanValue();
        }
        try {
            if (this.b) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void setCanScrollHorizontal(boolean z) {
        this.b = z;
    }
}
