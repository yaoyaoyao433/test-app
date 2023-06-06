package com.meituan.android.cashier.base.view.revision;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private static final c b = new c();

    public static View.OnTouchListener a() {
        return b;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a00ec21285311c723450b6380da95a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a00ec21285311c723450b6380da95a9")).booleanValue() : CashierOrderInfoView.a(view, motionEvent);
    }
}
