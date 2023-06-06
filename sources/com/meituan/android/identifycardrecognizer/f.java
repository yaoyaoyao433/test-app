package com.meituan.android.identifycardrecognizer;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final OcrCaptureActivity b;

    public f(OcrCaptureActivity ocrCaptureActivity) {
        this.b = ocrCaptureActivity;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "889e391d311d8cb3a4156558deb885ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "889e391d311d8cb3a4156558deb885ec");
        } else {
            OcrCaptureActivity.a(this.b, dialog);
        }
    }
}
