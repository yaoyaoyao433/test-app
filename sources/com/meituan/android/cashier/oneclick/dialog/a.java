package com.meituan.android.cashier.oneclick.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OneClickPayConfirmDialog b;

    private a(OneClickPayConfirmDialog oneClickPayConfirmDialog) {
        this.b = oneClickPayConfirmDialog;
    }

    public static View.OnClickListener a(OneClickPayConfirmDialog oneClickPayConfirmDialog) {
        Object[] objArr = {oneClickPayConfirmDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e672cb56270d901381e10c1903e17a16", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e672cb56270d901381e10c1903e17a16") : new a(oneClickPayConfirmDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458be8d8daec5bf5e4351851d74d7ada", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458be8d8daec5bf5e4351851d74d7ada");
        } else {
            OneClickPayConfirmDialog.b(this.b, view);
        }
    }
}
