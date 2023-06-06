package com.dianping.gcmrnmodule.components.touchbackground;

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

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07ae99caf8c153f7b4ae16ab281a5a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07ae99caf8c153f7b4ae16ab281a5a0");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54e7c8679380579e46f30b035186a97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54e7c8679380579e46f30b035186a97")).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof c)) {
            parent = parent.getParent();
        }
        if (parent != null) {
            ((c) parent).setNeedBubbling(!dispatchTouchEvent);
        }
        return dispatchTouchEvent;
    }
}
