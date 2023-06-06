package com.meituan.android.identifycardrecognizer;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PhotoSelectorActivity b;

    public m(PhotoSelectorActivity photoSelectorActivity) {
        this.b = photoSelectorActivity;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be6add54878f277298318a6ca4fc518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be6add54878f277298318a6ca4fc518");
        } else {
            PhotoSelectorActivity.c(this.b, dialog);
        }
    }
}
