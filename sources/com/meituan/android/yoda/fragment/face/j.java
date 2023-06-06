package com.meituan.android.yoda.fragment.face;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2 b;

    private j(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        this.b = faceDetectionSubFragment2;
    }

    public static Runnable a(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "522e1502699fbb9a051564c9523a104c", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "522e1502699fbb9a051564c9523a104c") : new j(faceDetectionSubFragment2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1680b6a66ea2e652f5941ce6c64a2243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1680b6a66ea2e652f5941ce6c64a2243");
        } else {
            FaceDetectionSubFragment2.a(this.b);
        }
    }
}
