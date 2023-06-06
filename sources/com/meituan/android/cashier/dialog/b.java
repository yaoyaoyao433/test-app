package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AutomaticPayGuideDialog b;

    private b(AutomaticPayGuideDialog automaticPayGuideDialog) {
        this.b = automaticPayGuideDialog;
    }

    public static View.OnClickListener a(AutomaticPayGuideDialog automaticPayGuideDialog) {
        Object[] objArr = {automaticPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c476b5e359b731b156a9aaf942d03aef", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c476b5e359b731b156a9aaf942d03aef") : new b(automaticPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99edc95ee08bf2e50b306621d8b863e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99edc95ee08bf2e50b306621d8b863e");
        } else {
            AutomaticPayGuideDialog.b(this.b, view);
        }
    }
}
