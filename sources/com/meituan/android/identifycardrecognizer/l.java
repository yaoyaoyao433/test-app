package com.meituan.android.identifycardrecognizer;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PhotoSelectorActivity b;

    public l(PhotoSelectorActivity photoSelectorActivity) {
        this.b = photoSelectorActivity;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06e58d36165c59a634ae5a0648d46db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06e58d36165c59a634ae5a0648d46db");
        } else {
            PhotoSelectorActivity.d(this.b, dialog);
        }
    }
}
