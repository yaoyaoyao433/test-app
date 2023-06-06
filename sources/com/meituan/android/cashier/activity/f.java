package com.meituan.android.cashier.activity;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final MTCashierActivity b;

    private f(MTCashierActivity mTCashierActivity) {
        this.b = mTCashierActivity;
    }

    public static View.OnClickListener a(MTCashierActivity mTCashierActivity) {
        Object[] objArr = {mTCashierActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ef1103fc4e21ffb4284498b2992bd68", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ef1103fc4e21ffb4284498b2992bd68") : new f(mTCashierActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f4c2d164cc972e717c264e43fcc3f5a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f4c2d164cc972e717c264e43fcc3f5a");
        } else {
            MTCashierActivity.a(this.b, view);
        }
    }
}
