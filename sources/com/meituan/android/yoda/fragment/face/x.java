package com.meituan.android.yoda.fragment.face;

import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2.AnonymousClass3 b;

    public x(FaceDetectionSubFragment2.AnonymousClass3 anonymousClass3) {
        this.b = anonymousClass3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54747cc91290b4c618bb43d474e993a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54747cc91290b4c618bb43d474e993a");
            return;
        }
        FaceDetectionSubFragment2.AnonymousClass3 anonymousClass3 = this.b;
        Object[] objArr2 = {anonymousClass3};
        ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.AnonymousClass3.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c4e54ee99d142605c48e27a2fa6cd3fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c4e54ee99d142605c48e27a2fa6cd3fe");
            return;
        }
        FaceDetectionSubFragment2.this.n.b();
        FaceDetectionSubFragment2.this.f = false;
        FaceDetectionSubFragment2.this.d();
    }
}
