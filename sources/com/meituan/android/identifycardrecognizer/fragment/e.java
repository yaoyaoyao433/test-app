package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final IdCardCaptureFragment b;

    public e(IdCardCaptureFragment idCardCaptureFragment) {
        this.b = idCardCaptureFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66c5e1c2e6666f985d335832898aaf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66c5e1c2e6666f985d335832898aaf7");
        } else {
            IdCardCaptureFragment.a(this.b, dialog);
        }
    }
}
