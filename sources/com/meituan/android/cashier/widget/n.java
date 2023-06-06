package com.meituan.android.cashier.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final m b;

    private n(m mVar) {
        this.b = mVar;
    }

    public static View.OnClickListener a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3fe809905480dd9fad03ba29f82f3f6", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3fe809905480dd9fad03ba29f82f3f6") : new n(mVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e64ad898f8e585a649e80dc3b0ea78c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e64ad898f8e585a649e80dc3b0ea78c");
        } else {
            m.a(this.b, view);
        }
    }
}
