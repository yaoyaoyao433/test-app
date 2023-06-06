package com.meituan.android.paybase.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BasePayDialog b;

    private c(BasePayDialog basePayDialog) {
        this.b = basePayDialog;
    }

    public static View.OnClickListener a(BasePayDialog basePayDialog) {
        Object[] objArr = {basePayDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02800d6aa794d5cf5fbce33faedf8318", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02800d6aa794d5cf5fbce33faedf8318") : new c(basePayDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbe1da09e5103606b742026ab8861c5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbe1da09e5103606b742026ab8861c5");
        } else {
            BasePayDialog.a(this.b, view);
        }
    }
}
