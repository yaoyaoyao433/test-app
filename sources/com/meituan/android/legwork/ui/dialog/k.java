package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ChangeBindPhoneDialogFragment b;

    private k(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment) {
        this.b = changeBindPhoneDialogFragment;
    }

    public static View.OnClickListener a(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment) {
        Object[] objArr = {changeBindPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b25fd2b683e048dff7ab87bd3ef2864", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b25fd2b683e048dff7ab87bd3ef2864") : new k(changeBindPhoneDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1af9e6a17ce06a4be9ec73f9a876473", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1af9e6a17ce06a4be9ec73f9a876473");
        } else {
            ChangeBindPhoneDialogFragment.b(this.b, view);
        }
    }
}
