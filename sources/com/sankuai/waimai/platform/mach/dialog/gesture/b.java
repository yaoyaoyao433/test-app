package com.sankuai.waimai.platform.mach.dialog.gesture;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends com.sankuai.waimai.platform.mach.dialog.c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private d gestureDelegate;

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d77d4d9c76788632d651b46674f4971a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d77d4d9c76788632d651b46674f4971a");
        }
    }

    public b(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2fbeda9a6f79314aa70f5d841ec6869", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2fbeda9a6f79314aa70f5d841ec6869");
        }
    }

    public void setGestureDelegate(d dVar) {
        this.gestureDelegate = dVar;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ede2828d82676ebde04bac8290f77c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ede2828d82676ebde04bac8290f77c6")).booleanValue();
        }
        if (this.gestureDelegate != null) {
            return this.gestureDelegate.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb248e02b95130187313c05614409fef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb248e02b95130187313c05614409fef")).booleanValue();
        }
        if (this.gestureDelegate != null) {
            return this.gestureDelegate.b(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
