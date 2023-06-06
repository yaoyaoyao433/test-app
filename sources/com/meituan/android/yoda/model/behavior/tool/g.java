package com.meituan.android.yoda.model.behavior.tool;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    boolean b;
    private float c;
    private float d;
    private long e;
    private int f;

    public g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b90442fb2e2804cc5577edc1a7c15c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b90442fb2e2804cc5577edc1a7c15c3");
            return;
        }
        this.b = false;
        this.f = 0;
        this.f = ViewConfiguration.get(context.getApplicationContext()).getScaledTouchSlop();
    }

    public final void a(MotionEvent motionEvent) {
        boolean z = true;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff06ccfb05936f433fc9ff3a9253d24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff06ccfb05936f433fc9ff3a9253d24");
        } else if (motionEvent.getAction() == 0) {
            this.b = false;
            this.c = motionEvent.getRawX();
            this.d = motionEvent.getRawY();
            this.e = System.currentTimeMillis();
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.e <= ViewConfiguration.getTapTimeout() || (Math.abs(motionEvent.getRawX() - this.c) <= this.f && Math.abs(motionEvent.getRawY() - this.d) <= this.f)) {
                z = false;
            }
            this.b = z;
        }
    }
}
