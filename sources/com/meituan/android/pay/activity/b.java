package com.meituan.android.pay.activity;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayActivity b;

    private b(PayActivity payActivity) {
        this.b = payActivity;
    }

    public static View.OnClickListener a(PayActivity payActivity) {
        Object[] objArr = {payActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3361b7643924741071655ca2b8e14514", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3361b7643924741071655ca2b8e14514") : new b(payActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50eab00642a2b7a8fb3d58d6951b28a6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50eab00642a2b7a8fb3d58d6951b28a6");
        } else {
            PayActivity.a(this.b, view);
        }
    }
}
