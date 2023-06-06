package com.meituan.android.cashier.oneclick.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OneClickPayConfirmDialog b;

    private b(OneClickPayConfirmDialog oneClickPayConfirmDialog) {
        this.b = oneClickPayConfirmDialog;
    }

    public static View.OnClickListener a(OneClickPayConfirmDialog oneClickPayConfirmDialog) {
        Object[] objArr = {oneClickPayConfirmDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8bc262cd3414722e1cbd13759cff167", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8bc262cd3414722e1cbd13759cff167") : new b(oneClickPayConfirmDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c9216d912d666cb3c5a58945f97df9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c9216d912d666cb3c5a58945f97df9");
        } else {
            OneClickPayConfirmDialog.a(this.b, view);
        }
    }
}
