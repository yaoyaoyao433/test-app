package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PreviewFragment b;

    private j(PreviewFragment previewFragment) {
        this.b = previewFragment;
    }

    public static BasePayDialog.c a(PreviewFragment previewFragment) {
        Object[] objArr = {previewFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b5df36c326b838171d70d7818d3730c", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b5df36c326b838171d70d7818d3730c") : new j(previewFragment);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f65091200b404e6e04f52d908fcfe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f65091200b404e6e04f52d908fcfe7");
        } else {
            PreviewFragment.b(this.b, dialog);
        }
    }
}
