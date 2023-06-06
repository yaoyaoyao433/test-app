package com.meituan.android.yoda.fragment.face;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2 b;

    private m(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        this.b = faceDetectionSubFragment2;
    }

    public static Runnable a(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "729668294332e22d22728517412fb80b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "729668294332e22d22728517412fb80b") : new m(faceDetectionSubFragment2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "895091ba527fef37f3a2fa3dcebd65cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "895091ba527fef37f3a2fa3dcebd65cd");
        } else {
            FaceDetectionSubFragment2.d(this.b);
        }
    }
}
