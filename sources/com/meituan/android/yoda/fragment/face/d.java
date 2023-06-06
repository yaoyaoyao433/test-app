package com.meituan.android.yoda.fragment.face;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2 b;

    private d(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        this.b = faceDetectionSubFragment2;
    }

    public static Runnable a(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3519a8abdcc83a8202cd1fecdc950963", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3519a8abdcc83a8202cd1fecdc950963") : new d(faceDetectionSubFragment2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c6114e4a38254b8ebfbc43a64fa046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c6114e4a38254b8ebfbc43a64fa046");
        } else {
            FaceDetectionSubFragment2.e(this.b);
        }
    }
}
