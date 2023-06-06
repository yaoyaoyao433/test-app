package com.meituan.android.cashier.dialogfragment;

import android.view.View;
import com.meituan.android.cashier.dialogfragment.DCEPDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DCEPDialogFragment.DCEPDialog b;

    private a(DCEPDialogFragment.DCEPDialog dCEPDialog) {
        this.b = dCEPDialog;
    }

    public static View.OnClickListener a(DCEPDialogFragment.DCEPDialog dCEPDialog) {
        Object[] objArr = {dCEPDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ed0d2ab59f60e4ebacd6cd8c6fd1477", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ed0d2ab59f60e4ebacd6cd8c6fd1477") : new a(dCEPDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d23e518badfbf2126b60da861cf3b35c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d23e518badfbf2126b60da861cf3b35c");
        } else {
            DCEPDialogFragment.DCEPDialog.a(this.b, view);
        }
    }
}
