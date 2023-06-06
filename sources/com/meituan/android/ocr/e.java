package com.meituan.android.ocr;

import android.hardware.Camera;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final PayBaseCameraFragment b;
    private final byte[] c;
    private final Camera.Size d;

    private e(PayBaseCameraFragment payBaseCameraFragment, byte[] bArr, Camera.Size size) {
        this.b = payBaseCameraFragment;
        this.c = bArr;
        this.d = size;
    }

    public static Runnable a(PayBaseCameraFragment payBaseCameraFragment, byte[] bArr, Camera.Size size) {
        Object[] objArr = {payBaseCameraFragment, bArr, size};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942f53b9c866868e9410e896d5d97f08", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942f53b9c866868e9410e896d5d97f08") : new e(payBaseCameraFragment, bArr, size);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d41e75826142b498e7a82e9801ea89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d41e75826142b498e7a82e9801ea89");
        } else {
            this.b.a(this.c, this.d);
        }
    }
}
