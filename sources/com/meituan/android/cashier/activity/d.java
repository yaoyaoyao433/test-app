package com.meituan.android.cashier.activity;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final MTCashierActivity b;

    private d(MTCashierActivity mTCashierActivity) {
        this.b = mTCashierActivity;
    }

    public static View.OnClickListener a(MTCashierActivity mTCashierActivity) {
        Object[] objArr = {mTCashierActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a43c923a4ae2eb55b88082affc13bd21", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a43c923a4ae2eb55b88082affc13bd21") : new d(mTCashierActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "825fb14f4378a8d5fc6b75fc6988c6d4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "825fb14f4378a8d5fc6b75fc6988c6d4");
        } else {
            MTCashierActivity.b(this.b, view);
        }
    }
}
