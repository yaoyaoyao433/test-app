package com.meituan.android.ocr;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PayBaseCameraFragment b;
    private final int c;

    public k(PayBaseCameraFragment payBaseCameraFragment, int i) {
        this.b = payBaseCameraFragment;
        this.c = i;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741f4f95d841c68b79542baf59d534b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741f4f95d841c68b79542baf59d534b6");
            return;
        }
        PayBaseCameraFragment payBaseCameraFragment = this.b;
        int i = this.c;
        Object[] objArr2 = {Integer.valueOf(i), dialog};
        ChangeQuickRedirect changeQuickRedirect2 = PayBaseCameraFragment.a;
        if (PatchProxy.isSupport(objArr2, payBaseCameraFragment, changeQuickRedirect2, false, "ec16c419cf63c5201bf5e190092e6441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, payBaseCameraFragment, changeQuickRedirect2, false, "ec16c419cf63c5201bf5e190092e6441");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", payBaseCameraFragment.getActivity().getPackageName(), null));
        payBaseCameraFragment.startActivityForResult(intent, i);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_authorized_bankcard_ocr", 1170004);
    }
}
