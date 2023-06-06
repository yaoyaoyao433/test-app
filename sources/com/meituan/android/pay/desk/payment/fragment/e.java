package com.meituan.android.pay.desk.payment.fragment;

import android.view.View;
import com.meituan.android.pay.desk.payment.fragment.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final a.b b;

    private e(a.b bVar) {
        this.b = bVar;
    }

    public static View.OnClickListener a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "990a4aa3f8edf1cabadd739e8739c914", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "990a4aa3f8edf1cabadd739e8739c914") : new e(bVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9743568fdbd41253f7a0586e872b25", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9743568fdbd41253f7a0586e872b25");
        } else {
            a.a(this.b, view);
        }
    }
}
