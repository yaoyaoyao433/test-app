package com.meituan.android.identifycardrecognizer;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PhotoSelectorActivity b;

    public o(PhotoSelectorActivity photoSelectorActivity) {
        this.b = photoSelectorActivity;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e6c06e1deab3d667f830b8d7cd29fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e6c06e1deab3d667f830b8d7cd29fb6");
        } else {
            PhotoSelectorActivity.a(this.b, dialog);
        }
    }
}
