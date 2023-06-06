package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ChangeBindPhoneDialogFragment b;

    private l(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment) {
        this.b = changeBindPhoneDialogFragment;
    }

    public static View.OnClickListener a(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment) {
        Object[] objArr = {changeBindPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e1e206c02a2b03b4e8dfc72de205252", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e1e206c02a2b03b4e8dfc72de205252") : new l(changeBindPhoneDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d16d46df96af22c027305fec144ffcc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d16d46df96af22c027305fec144ffcc");
        } else {
            ChangeBindPhoneDialogFragment.a(this.b, view);
        }
    }
}
