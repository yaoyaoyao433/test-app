package com.meituan.android.pay.desk.payment.fragment;

import android.view.View;
import com.meituan.android.pay.desk.payment.fragment.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final f b;
    private final f.a c;

    private i(f fVar, f.a aVar) {
        this.b = fVar;
        this.c = aVar;
    }

    public static View.OnClickListener a(f fVar, f.a aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0010ac143adddf29196cb4ffdce0a76", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0010ac143adddf29196cb4ffdce0a76") : new i(fVar, aVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9be13600adb008c65fb8c37db8bf6c2f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9be13600adb008c65fb8c37db8bf6c2f");
        } else {
            f.a(this.b, this.c, view);
        }
    }
}
