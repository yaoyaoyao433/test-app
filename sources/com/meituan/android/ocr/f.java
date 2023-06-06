package com.meituan.android.ocr;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final PayBaseCameraFragment b;

    private f(PayBaseCameraFragment payBaseCameraFragment) {
        this.b = payBaseCameraFragment;
    }

    public static Runnable a(PayBaseCameraFragment payBaseCameraFragment) {
        Object[] objArr = {payBaseCameraFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebff0644d9af33cf22aa6c39e58b0d2f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebff0644d9af33cf22aa6c39e58b0d2f") : new f(payBaseCameraFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794bc3abe24549b4c440faabe5bdcefc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794bc3abe24549b4c440faabe5bdcefc");
            return;
        }
        PayBaseCameraFragment payBaseCameraFragment = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PayBaseCameraFragment.a;
        if (PatchProxy.isSupport(objArr2, payBaseCameraFragment, changeQuickRedirect2, false, "d5334c355aa32d4b9f0b3557b405588c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, payBaseCameraFragment, changeQuickRedirect2, false, "d5334c355aa32d4b9f0b3557b405588c");
        }
    }
}
