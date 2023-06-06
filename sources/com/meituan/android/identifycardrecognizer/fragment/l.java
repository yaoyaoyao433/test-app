package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PreviewFragment b;

    private l(PreviewFragment previewFragment) {
        this.b = previewFragment;
    }

    public static BasePayDialog.c a(PreviewFragment previewFragment) {
        Object[] objArr = {previewFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0827b4da6a71345b8ceb6543e28b965", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0827b4da6a71345b8ceb6543e28b965") : new l(previewFragment);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b5a920cf093985dca30db5304149406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b5a920cf093985dca30db5304149406");
        } else {
            PreviewFragment.a(this.b, dialog);
        }
    }
}
