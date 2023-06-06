package com.meituan.android.ocr;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PayBaseCameraFragment b;

    public i(PayBaseCameraFragment payBaseCameraFragment) {
        this.b = payBaseCameraFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2343755cef4549eb27551807ccdbc57e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2343755cef4549eb27551807ccdbc57e");
            return;
        }
        PayBaseCameraFragment payBaseCameraFragment = this.b;
        Object[] objArr2 = {dialog};
        ChangeQuickRedirect changeQuickRedirect2 = PayBaseCameraFragment.a;
        if (PatchProxy.isSupport(objArr2, payBaseCameraFragment, changeQuickRedirect2, false, "14fd04dd77dc2d6c5efae43a7e924a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, payBaseCameraFragment, changeQuickRedirect2, false, "14fd04dd77dc2d6c5efae43a7e924a14");
        } else {
            payBaseCameraFragment.getActivity().finish();
        }
    }
}
