package com.meituan.msc.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.msc.uimanager.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db21ac76df607ca2d0e186a877abad35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db21ac76df607ca2d0e186a877abad35");
        } else {
            ae.a(view).onChildStartedNativeGesture(motionEvent);
        }
    }
}
