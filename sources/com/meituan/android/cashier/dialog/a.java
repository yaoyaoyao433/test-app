package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AutomaticPayGuideDialog b;

    private a(AutomaticPayGuideDialog automaticPayGuideDialog) {
        this.b = automaticPayGuideDialog;
    }

    public static View.OnClickListener a(AutomaticPayGuideDialog automaticPayGuideDialog) {
        Object[] objArr = {automaticPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84774ae4206b8d719dd9c869a6d8aca0", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84774ae4206b8d719dd9c869a6d8aca0") : new a(automaticPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9112c25f1ae570bc07eab2cc1e2e7984", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9112c25f1ae570bc07eab2cc1e2e7984");
        } else {
            AutomaticPayGuideDialog.c(this.b, view);
        }
    }
}
