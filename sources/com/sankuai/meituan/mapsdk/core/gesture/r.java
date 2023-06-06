package com.sankuai.meituan.mapsdk.core.gesture;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class r {
    public static ChangeQuickRedirect a;

    public static PointF a(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14a6bc395a26f8ff1f7dd46a7da60e1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14a6bc395a26f8ff1f7dd46a7da60e1e");
        }
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = pointerCount;
        return new PointF(f / f3, f2 / f3);
    }
}
