package com.sankuai.waimai.store.poi.list.newp.home.view;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AppBarLayoutBehavior extends AppBarLayout.Behavior {
    public static ChangeQuickRedirect b;
    private boolean c;
    private boolean d;

    public AppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3beb6d5df8b4f540e97d47fc7f70ef85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3beb6d5df8b4f540e97d47fc7f70ef85");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.design.widget.HeaderBehavior, android.support.design.widget.CoordinatorLayout.a
    /* renamed from: a */
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        Object[] objArr = {coordinatorLayout, appBarLayout, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e15be3c2ac777c2f3a930099e3616409", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e15be3c2ac777c2f3a930099e3616409")).booleanValue();
        }
        this.d = false;
        if (this.c) {
            this.d = true;
        }
        if (motionEvent.getActionMasked() == 0) {
            a(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    private Field c() throws NoSuchFieldException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a093d9e10f292ec229667adbcb989ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a093d9e10f292ec229667adbcb989ce");
        }
        try {
            return getClass().getSuperclass().getSuperclass().getDeclaredField("mFlingRunnable");
        } catch (NoSuchFieldException unused) {
            return getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("flingRunnable");
        }
    }

    private Field d() throws NoSuchFieldException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868070e58a6e851e6e617322106ccb28", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868070e58a6e851e6e617322106ccb28");
        }
        try {
            return getClass().getSuperclass().getSuperclass().getDeclaredField("mScroller");
        } catch (NoSuchFieldException unused) {
            return getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("scroller");
        }
    }

    private void a(AppBarLayout appBarLayout) {
        Object[] objArr = {appBarLayout};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c153f760c31c904dca8bbaf0f68ae5e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c153f760c31c904dca8bbaf0f68ae5e7");
            return;
        }
        try {
            Field c = c();
            Field d = d();
            c.setAccessible(true);
            d.setAccessible(true);
            Runnable runnable = (Runnable) c.get(this);
            OverScroller overScroller = (OverScroller) d.get(this);
            if (runnable != null) {
                appBarLayout.removeCallbacks(runnable);
                c.set(this, null);
            }
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            overScroller.abortAnimation();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.support.design.widget.AppBarLayout.Behavior, android.support.design.widget.CoordinatorLayout.a
    /* renamed from: a */
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        Object[] objArr = {coordinatorLayout, appBarLayout, view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c9632384a1732ba33b0ed5bcced5d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c9632384a1732ba33b0ed5bcced5d5")).booleanValue();
        }
        a(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // android.support.design.widget.AppBarLayout.Behavior, android.support.design.widget.CoordinatorLayout.a
    /* renamed from: a */
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        Object[] objArr = {coordinatorLayout, appBarLayout, view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9fdd6ac21daceaa371f8998f8ab4da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9fdd6ac21daceaa371f8998f8ab4da");
            return;
        }
        if (i3 == 1) {
            this.c = true;
        }
        if (this.d) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    @Override // android.support.design.widget.AppBarLayout.Behavior, android.support.design.widget.CoordinatorLayout.a
    /* renamed from: a */
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {coordinatorLayout, appBarLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fccbb8f369cd2e637c51b07db8e936e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fccbb8f369cd2e637c51b07db8e936e");
        } else if (this.d) {
        } else {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }
    }

    @Override // android.support.design.widget.AppBarLayout.Behavior, android.support.design.widget.CoordinatorLayout.a
    /* renamed from: a */
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        Object[] objArr = {coordinatorLayout, appBarLayout, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c41ef57e0bd0a2341dc88fce3e217d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c41ef57e0bd0a2341dc88fce3e217d0");
            return;
        }
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        this.c = false;
        this.d = false;
    }
}
