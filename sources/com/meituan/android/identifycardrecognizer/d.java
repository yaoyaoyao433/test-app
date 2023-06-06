package com.meituan.android.identifycardrecognizer;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final OcrCaptureActivity b;

    public d(OcrCaptureActivity ocrCaptureActivity) {
        this.b = ocrCaptureActivity;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9af7b444ca0f15124bacc42b180d50b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9af7b444ca0f15124bacc42b180d50b");
        } else {
            OcrCaptureActivity.c(this.b, dialog);
        }
    }
}
