package com.meituan.android.mrn.component.pullrefresh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.views.view.f;
import com.handmark.pulltorefresh.library.c;
import com.handmark.pulltorefresh.library.internal.LoadingView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends c<f> {
    public static ChangeQuickRedirect c;

    @Override // com.handmark.pulltorefresh.library.c
    public final boolean b() {
        return false;
    }

    @Override // com.handmark.pulltorefresh.library.c
    public final /* synthetic */ f a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "395f1132c73601c8ac9d671870187b51", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "395f1132c73601c8ac9d671870187b51") : new f(context);
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c89c95536211e03736ff2bd7759ad51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c89c95536211e03736ff2bd7759ad51");
        } else {
            setDisableScrollingWhileRefreshing(false);
        }
    }

    @Override // com.handmark.pulltorefresh.library.c, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b03f35a5cf6c92c23d6b7d2af42904f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b03f35a5cf6c92c23d6b7d2af42904f9")).booleanValue();
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                e.a(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e) {
            Log.w("ReactNative", "Error intercepting touch event.", e);
        }
        return false;
    }

    @Override // com.handmark.pulltorefresh.library.c
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bae4dae10990863d61c41aa98ccca97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bae4dae10990863d61c41aa98ccca97")).booleanValue();
        }
        if (getRefreshableView().getChildCount() == 0) {
            return false;
        }
        if (!(getRefreshableView().getChildAt(0) instanceof RecyclerView)) {
            return getRefreshableView().getChildAt(0).getScrollY() == 0;
        }
        RecyclerView recyclerView = (RecyclerView) getRefreshableView().getChildAt(0);
        return recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0)) == 0 && recyclerView.getChildAt(0).getTop() == 0;
    }

    public final LoadingView getLoadingView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "031eef9d043edcfdf337d40d0cf96b64", RobustBitConfig.DEFAULT_VALUE) ? (LoadingView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "031eef9d043edcfdf337d40d0cf96b64") : getHeaderLayout();
    }
}
