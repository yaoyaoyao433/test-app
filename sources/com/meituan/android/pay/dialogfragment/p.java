package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final QuickBindCardDetainDialog b;

    private p(QuickBindCardDetainDialog quickBindCardDetainDialog) {
        this.b = quickBindCardDetainDialog;
    }

    public static View.OnClickListener a(QuickBindCardDetainDialog quickBindCardDetainDialog) {
        Object[] objArr = {quickBindCardDetainDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e40ba64b46b33bdfa8e468037ce9d439", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e40ba64b46b33bdfa8e468037ce9d439") : new p(quickBindCardDetainDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85eeab6b3841c470602c156d015f339", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85eeab6b3841c470602c156d015f339");
        } else {
            QuickBindCardDetainDialog.a(this.b, view);
        }
    }
}
