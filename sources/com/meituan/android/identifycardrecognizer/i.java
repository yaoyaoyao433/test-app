package com.meituan.android.identifycardrecognizer;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PeopleCaptureActivity b;

    public i(PeopleCaptureActivity peopleCaptureActivity) {
        this.b = peopleCaptureActivity;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080719c83741fd3892745f4c8c95ae21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080719c83741fd3892745f4c8c95ae21");
        } else {
            PeopleCaptureActivity.a(this.b, dialog);
        }
    }
}
