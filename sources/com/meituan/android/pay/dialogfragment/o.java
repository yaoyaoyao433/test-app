package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final QuickBindCardDetainDialog b;

    private o(QuickBindCardDetainDialog quickBindCardDetainDialog) {
        this.b = quickBindCardDetainDialog;
    }

    public static View.OnClickListener a(QuickBindCardDetainDialog quickBindCardDetainDialog) {
        Object[] objArr = {quickBindCardDetainDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a44b6c89ff79d50ab4eb33439a6c9d4e", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a44b6c89ff79d50ab4eb33439a6c9d4e") : new o(quickBindCardDetainDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d335d54a733e014d59fa86b098568fcf", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d335d54a733e014d59fa86b098568fcf");
        } else {
            QuickBindCardDetainDialog.b(this.b, view);
        }
    }
}
