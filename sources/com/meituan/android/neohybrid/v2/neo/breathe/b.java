package com.meituan.android.neohybrid.v2.neo.breathe;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private final a b;

    private b(a aVar) {
        this.b = aVar;
    }

    public static View.OnTouchListener a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31bc509676dcbccfd1e3f5c361d66242", RobustBitConfig.DEFAULT_VALUE) ? (View.OnTouchListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31bc509676dcbccfd1e3f5c361d66242") : new b(aVar);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977d6d7de6a52966de7b45b5bf34c167", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977d6d7de6a52966de7b45b5bf34c167")).booleanValue() : a.a(this.b, view, motionEvent);
    }
}
