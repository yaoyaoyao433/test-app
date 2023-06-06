package com.meituan.msc.modules.page.render.rn;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.msc.views.ReactRootView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNRootView extends ReactRootView {
    public static ChangeQuickRedirect c;
    a d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public RNRootView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05daea4c638f4e089db8865b72abce25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05daea4c638f4e089db8865b72abce25");
        }
    }

    public RNRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea92a1b5bc33376a944cf299adbd781", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea92a1b5bc33376a944cf299adbd781");
        }
    }

    public a getCallback() {
        return this.d;
    }

    @Override // com.meituan.msc.views.ReactRootView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3fc29570ca19f6d8cc4bd9ecdb8e4a3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3fc29570ca19f6d8cc4bd9ecdb8e4a3")).booleanValue() : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.meituan.msc.views.ReactRootView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "125a7bed9cb3aa81739da8c18d68df2a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "125a7bed9cb3aa81739da8c18d68df2a")).booleanValue() : super.onTouchEvent(motionEvent);
    }

    @Override // com.meituan.msc.views.ReactRootView, android.view.ViewGroup
    public void onViewAdded(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae943423161c8af120f7195f66ef480c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae943423161c8af120f7195f66ef480c");
            return;
        }
        super.onViewAdded(view);
        if (this.d != null) {
            this.d.a();
        }
    }

    @Override // com.meituan.msc.views.ReactRootView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6493cfd09cfde936601d3c3e82c30ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6493cfd09cfde936601d3c3e82c30ed9");
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // com.meituan.msc.views.ReactRootView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5df124c93c30e7c426e7d4194dbca48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5df124c93c30e7c426e7d4194dbca48");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.meituan.msc.views.ReactRootView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957d7681994d6c79649a1d8bd36fe640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957d7681994d6c79649a1d8bd36fe640");
        } else {
            super.onMeasure(i, i2);
        }
    }
}
