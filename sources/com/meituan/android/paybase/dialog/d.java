package com.meituan.android.paybase.dialog;

import android.view.View;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BasePayDialog b;
    private final BasePayDialog.c c;

    private d(BasePayDialog basePayDialog, BasePayDialog.c cVar) {
        this.b = basePayDialog;
        this.c = cVar;
    }

    public static View.OnClickListener a(BasePayDialog basePayDialog, BasePayDialog.c cVar) {
        Object[] objArr = {basePayDialog, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebf9c2fb117232637720cffa83ec5f49", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebf9c2fb117232637720cffa83ec5f49") : new d(basePayDialog, cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b7565af35a7d698bafe7a6e8891e87", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b7565af35a7d698bafe7a6e8891e87");
        } else {
            BasePayDialog.a(this.b, this.c, view);
        }
    }
}
