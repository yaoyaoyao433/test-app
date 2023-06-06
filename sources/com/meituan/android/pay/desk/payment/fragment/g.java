package com.meituan.android.pay.desk.payment.fragment;

import android.view.View;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final f b;
    private final Agreement c;

    private g(f fVar, Agreement agreement) {
        this.b = fVar;
        this.c = agreement;
    }

    public static View.OnClickListener a(f fVar, Agreement agreement) {
        Object[] objArr = {fVar, agreement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbec27f35edce66ac7f1e8209a58281f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbec27f35edce66ac7f1e8209a58281f") : new g(fVar, agreement);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "535e7cfe8d5ac7b8f999318aff74c5a5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "535e7cfe8d5ac7b8f999318aff74c5a5");
        } else {
            f.a(this.b, this.c, view);
        }
    }
}
