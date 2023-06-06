package com.meituan.android.paybase.dialog;

import android.view.View;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BasePayDialog b;
    private final BasePayDialog.c c;

    private b(BasePayDialog basePayDialog, BasePayDialog.c cVar) {
        this.b = basePayDialog;
        this.c = cVar;
    }

    public static View.OnClickListener a(BasePayDialog basePayDialog, BasePayDialog.c cVar) {
        Object[] objArr = {basePayDialog, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93b48623fc7b1e222c36a80addcaa8e4", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93b48623fc7b1e222c36a80addcaa8e4") : new b(basePayDialog, cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47fd67a9457d4ee2876915ca3f6cd39b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47fd67a9457d4ee2876915ca3f6cd39b");
        } else {
            BasePayDialog.b(this.b, this.c, view);
        }
    }
}
