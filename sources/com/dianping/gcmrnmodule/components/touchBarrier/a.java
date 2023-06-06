package com.dianping.gcmrnmodule.components.touchBarrier;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.dianping.gcmrnmodule.wrapperviews.c;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends f {
    public static ChangeQuickRedirect a;
    private boolean b;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac5a8cd2cd40b67a127f486f888806f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac5a8cd2cd40b67a127f486f888806f5");
        } else {
            this.b = false;
        }
    }

    public final void setBarrierEnabled(boolean z) {
        this.b = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807533194803ab89a9277235117dae3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807533194803ab89a9277235117dae3b")).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (this.b) {
            ViewParent parent = getParent();
            while (parent != null && !(parent instanceof c)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                ((c) parent).setNeedBubbling(!dispatchTouchEvent);
            }
            switch (motionEvent.getAction()) {
                case 0:
                case 2:
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                case 1:
                    getParent().requestDisallowInterceptTouchEvent(false);
                    break;
            }
            return dispatchTouchEvent;
        }
        return dispatchTouchEvent;
    }
}
