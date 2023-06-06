package com.meituan.android.ocr;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PayBaseCameraFragment b;

    public j(PayBaseCameraFragment payBaseCameraFragment) {
        this.b = payBaseCameraFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ab1adce76b091d3922f3809022496f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ab1adce76b091d3922f3809022496f");
            return;
        }
        PayBaseCameraFragment payBaseCameraFragment = this.b;
        Object[] objArr2 = {dialog};
        ChangeQuickRedirect changeQuickRedirect2 = PayBaseCameraFragment.a;
        if (PatchProxy.isSupport(objArr2, payBaseCameraFragment, changeQuickRedirect2, false, "38ecde938c44abd4be254980f45cc0b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, payBaseCameraFragment, changeQuickRedirect2, false, "38ecde938c44abd4be254980f45cc0b2");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = PayBaseCameraFragment.a;
        if (PatchProxy.isSupport(objArr3, payBaseCameraFragment, changeQuickRedirect3, false, "08ff4cd8045ee4c0375f04d058f87dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, payBaseCameraFragment, changeQuickRedirect3, false, "08ff4cd8045ee4c0375f04d058f87dd6");
        } else if (payBaseCameraFragment.getActivity() != null) {
            payBaseCameraFragment.getActivity().finish();
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_authorized_bankcard_ocr", 1170003);
        }
    }
}
