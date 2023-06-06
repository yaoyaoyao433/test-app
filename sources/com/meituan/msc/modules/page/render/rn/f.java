package com.meituan.msc.modules.page.render.rn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.views.ReactRootView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements com.meituan.msc.modules.page.render.h, ReactRootView.c {
    public static ChangeQuickRedirect a;
    RNRootView b;
    ReactContext c;
    com.meituan.msc.uimanager.h d;
    boolean e;
    final Set<a> f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(MotionEvent motionEvent);
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a() {
    }

    @Override // com.meituan.msc.modules.page.render.h
    public final View b() {
        return this;
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentScrollY() {
        return 0;
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79700d62da0dba895c8bf6edfeec0c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79700d62da0dba895c8bf6edfeec0c3");
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void l() {
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void q() {
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void setOnContentScrollChangeListener(com.meituan.msc.modules.page.render.webview.f fVar) {
    }

    public f(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab6450f6050f591923f64aa3c4fa048", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab6450f6050f591923f64aa3c4fa048");
        } else {
            this.f = new HashSet();
        }
    }

    public final void setReactRootView(RNRootView rNRootView) {
        Object[] objArr = {rNRootView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c158fe1fe51bbb80bad91775846528c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c158fe1fe51bbb80bad91775846528c");
            return;
        }
        this.b = rNRootView;
        this.b.setEventListener(this);
        c();
        try {
            this.d = new com.meituan.msc.uimanager.h(this.b);
            RNRootView rNRootView2 = this.b;
            com.meituan.msc.uimanager.h hVar = this.d;
            Object[] objArr2 = {rNRootView2, "mJSTouchDispatcher", hVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0d7cc47f2873206ff966cf969630cb15", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0d7cc47f2873206ff966cf969630cb15");
            } else if (rNRootView2 != null) {
                Field declaredField = rNRootView2.getClass().getSuperclass().getSuperclass().getDeclaredField("mJSTouchDispatcher");
                declaredField.setAccessible(true);
                declaredField.set(rNRootView2, hVar);
            }
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.a("[MSCRNView] ", e);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce84d5e696149a82e2c25791e1c273f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce84d5e696149a82e2c25791e1c273f");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("[MSCRNView@attachRootView]", "mReactRootView: " + this.b);
        if (this.b == null) {
            com.meituan.msc.modules.reporter.g.b("[MSCRNView@attachRootView]", null, "mReactRootView null");
        } else {
            addView(this.b, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public final RNRootView getReactRootView() {
        return this.b;
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "513b0a6c9284f26c90e70402e7d43140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "513b0a6c9284f26c90e70402e7d43140");
        } else {
            this.b.scrollBy(0, i);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3414c8f81dca40cde9e632d66f9568eb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3414c8f81dca40cde9e632d66f9568eb")).intValue() : this.b.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6da9f9b6287ce0bc231d54654d60da31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6da9f9b6287ce0bc231d54654d60da31")).booleanValue();
        }
        if (this.f != null) {
            for (a aVar : this.f) {
                aVar.a(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
