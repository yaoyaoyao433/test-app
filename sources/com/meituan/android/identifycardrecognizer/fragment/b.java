package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final BaseCaptureFragment b;

    private b(BaseCaptureFragment baseCaptureFragment) {
        this.b = baseCaptureFragment;
    }

    public static BasePayDialog.c a(BaseCaptureFragment baseCaptureFragment) {
        Object[] objArr = {baseCaptureFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "300c00e27c66ba21e9bde1b8e4f70a9d", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "300c00e27c66ba21e9bde1b8e4f70a9d") : new b(baseCaptureFragment);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8f2df94c3e2bc5657adfbdca5348c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8f2df94c3e2bc5657adfbdca5348c5");
        } else {
            BaseCaptureFragment.b(this.b, dialog);
        }
    }
}
