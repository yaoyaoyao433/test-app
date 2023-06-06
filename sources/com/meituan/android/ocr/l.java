package com.meituan.android.ocr;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {
    public static ChangeQuickRedirect a;
    private final PayBaseCameraFragment b;

    private l(PayBaseCameraFragment payBaseCameraFragment) {
        this.b = payBaseCameraFragment;
    }

    public static Runnable a(PayBaseCameraFragment payBaseCameraFragment) {
        Object[] objArr = {payBaseCameraFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c8e053323740ef81319ea0e396cfa29", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c8e053323740ef81319ea0e396cfa29") : new l(payBaseCameraFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3988b54af55d5f9ad47a8ef70ba5b208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3988b54af55d5f9ad47a8ef70ba5b208");
        } else {
            this.b.b();
        }
    }
}
