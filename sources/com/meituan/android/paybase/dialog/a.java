package com.meituan.android.paybase.dialog;

import android.view.View;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BasePayDialog b;
    private final BasePayDialog.c c;

    private a(BasePayDialog basePayDialog, BasePayDialog.c cVar) {
        this.b = basePayDialog;
        this.c = cVar;
    }

    public static View.OnClickListener a(BasePayDialog basePayDialog, BasePayDialog.c cVar) {
        Object[] objArr = {basePayDialog, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "780868420e4067f196d2422345c4477d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "780868420e4067f196d2422345c4477d") : new a(basePayDialog, cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6516a77ff8b5f110cb5543307ac44b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6516a77ff8b5f110cb5543307ac44b");
        } else {
            BasePayDialog.c(this.b, this.c, view);
        }
    }
}
