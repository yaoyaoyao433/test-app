package com.meituan.android.yoda.fragment.face;

import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements Runnable {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2.AnonymousClass5 b;

    private ab(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5) {
        this.b = anonymousClass5;
    }

    public static Runnable a(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5) {
        Object[] objArr = {anonymousClass5};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bac86c42c2e42e52cc27de50123f0b4b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bac86c42c2e42e52cc27de50123f0b4b") : new ab(anonymousClass5);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9a2b52fc8e0db62004c5833e73cc79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9a2b52fc8e0db62004c5833e73cc79");
            return;
        }
        FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5 = this.b;
        Object[] objArr2 = {anonymousClass5};
        ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.AnonymousClass5.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "631042e2f59b4226196550cddc278745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "631042e2f59b4226196550cddc278745");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "info.onError, click retry button.", true);
        FaceDetectionSubFragment2.this.n.b();
        FaceDetectionSubFragment2.this.f = false;
        FaceDetectionSubFragment2.this.c.stopPreview();
        FaceDetectionSubFragment2.this.d();
    }
}
