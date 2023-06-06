package com.meituan.android.legwork.ui.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public static ChangeQuickRedirect a;
    private final ChangeBindPhoneDialogFragment b;

    private j(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment) {
        this.b = changeBindPhoneDialogFragment;
    }

    public static Runnable a(ChangeBindPhoneDialogFragment changeBindPhoneDialogFragment) {
        Object[] objArr = {changeBindPhoneDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49ff2c187e9724340af7dadfc4e8f876", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49ff2c187e9724340af7dadfc4e8f876") : new j(changeBindPhoneDialogFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90395dc4162fb17a9e5cb553d784cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90395dc4162fb17a9e5cb553d784cf0");
        } else {
            ChangeBindPhoneDialogFragment.a(this.b);
        }
    }
}
