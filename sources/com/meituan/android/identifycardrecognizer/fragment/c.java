package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final BaseCaptureFragment b;

    private c(BaseCaptureFragment baseCaptureFragment) {
        this.b = baseCaptureFragment;
    }

    public static BasePayDialog.c a(BaseCaptureFragment baseCaptureFragment) {
        Object[] objArr = {baseCaptureFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf8c70f3e8e92b0c727c8ca5aeb2e68e", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf8c70f3e8e92b0c727c8ca5aeb2e68e") : new c(baseCaptureFragment);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca58cfa5fe781e149b6173b6f2bff4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca58cfa5fe781e149b6173b6f2bff4f");
        } else {
            BaseCaptureFragment.a(this.b, dialog);
        }
    }
}
