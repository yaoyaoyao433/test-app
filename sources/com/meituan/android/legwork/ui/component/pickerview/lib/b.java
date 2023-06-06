package com.meituan.android.legwork.ui.component.pickerview.lib;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {
    public static ChangeQuickRedirect a;
    public final WheelView b;

    public b(WheelView wheelView) {
        Object[] objArr = {wheelView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "353f2f268d68740720ada9a96d287a6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "353f2f268d68740720ada9a96d287a6a");
        } else {
            this.b = wheelView;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Object[] objArr = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25d3d7d3b215b7079ff2fe2917a51f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25d3d7d3b215b7079ff2fe2917a51f1")).booleanValue();
        }
        WheelView wheelView = this.b;
        Object[] objArr2 = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = WheelView.a;
        if (PatchProxy.isSupport(objArr2, wheelView, changeQuickRedirect2, false, "cd16536de4448ba761d9136a79d938e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, wheelView, changeQuickRedirect2, false, "cd16536de4448ba761d9136a79d938e9");
        } else {
            wheelView.a();
            wheelView.f = wheelView.e.scheduleWithFixedDelay(new a(wheelView, f2), 0L, 5L, TimeUnit.MILLISECONDS);
        }
        return true;
    }
}
