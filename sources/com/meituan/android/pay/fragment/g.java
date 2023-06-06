package com.meituan.android.pay.fragment;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static View.OnTouchListener a() {
        return b;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe89c84199443884bf6fb4b6ee1642aa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe89c84199443884bf6fb4b6ee1642aa")).booleanValue() : MTCBanksFragment.a(view, motionEvent);
    }
}
