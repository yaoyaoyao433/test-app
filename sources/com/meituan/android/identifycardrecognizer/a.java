package com.meituan.android.identifycardrecognizer;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final IdCardCaptureActivity b;

    public a(IdCardCaptureActivity idCardCaptureActivity) {
        this.b = idCardCaptureActivity;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3678c9a7592c7c954fff16f17cadd00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3678c9a7592c7c954fff16f17cadd00c");
        } else {
            IdCardCaptureActivity.c(this.b, dialog);
        }
    }
}
