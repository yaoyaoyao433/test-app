package com.sankuai.waimai.store.view.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
/* compiled from: ProGuard */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes5.dex */
public class SCBaseViewPager extends ViewPager {
    public static ChangeQuickRedirect b;
    private View.OnTouchListener a;
    private boolean c;

    public SCBaseViewPager(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42689a26cf9a21206f92d3303e6f6d44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42689a26cf9a21206f92d3303e6f6d44");
            return;
        }
        this.c = false;
        a();
    }

    public SCBaseViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed1e314d7ae576581fece04d4a8e379b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed1e314d7ae576581fece04d4a8e379b");
            return;
        }
        this.c = false;
        a();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.a = onTouchListener;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "264309172c7004871064491f6b35c8e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "264309172c7004871064491f6b35c8e1");
        } else {
            super.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.view.banner.SCBaseViewPager.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr2 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "678f3670671d0f5f6138a98517cbf58d", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "678f3670671d0f5f6138a98517cbf58d")).booleanValue();
                    }
                    return (SCBaseViewPager.this.a != null ? SCBaseViewPager.this.a.onTouch(view, motionEvent) : false) || (2 == motionEvent.getAction() && motionEvent.getPointerCount() > 1);
                }
            });
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c87ad829b0c9e7aace81379088cd88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c87ad829b0c9e7aace81379088cd88")).booleanValue();
        }
        if (this.c) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            a.a(e);
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc75893b873bdeb275c14cdd15a9749d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc75893b873bdeb275c14cdd15a9749d")).booleanValue();
        }
        if (this.c) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            a.a(e);
            return false;
        }
    }

    public void setNoScroll(boolean z) {
        this.c = z;
    }
}
