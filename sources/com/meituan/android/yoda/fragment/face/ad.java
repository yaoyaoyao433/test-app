package com.meituan.android.yoda.fragment.face;

import com.meituan.android.yoda.activity.YodaConfirmActivity;
import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements Runnable {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2.AnonymousClass5 b;

    private ad(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5) {
        this.b = anonymousClass5;
    }

    public static Runnable a(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5) {
        Object[] objArr = {anonymousClass5};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8376d14942140ba0842ac8a83449e2d6", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8376d14942140ba0842ac8a83449e2d6") : new ad(anonymousClass5);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d127573ac9a48a2f0cd9f223cee8bb22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d127573ac9a48a2f0cd9f223cee8bb22");
            return;
        }
        FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5 = this.b;
        Object[] objArr2 = {anonymousClass5};
        ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.AnonymousClass5.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a63616e66cfaca785db63a07c3639313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a63616e66cfaca785db63a07c3639313");
            return;
        }
        try {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "info.onSuccess, start preview.", true);
            FaceDetectionSubFragment2 faceDetectionSubFragment2 = FaceDetectionSubFragment2.this;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = FaceDetectionSubFragment2.a;
            if (PatchProxy.isSupport(objArr3, faceDetectionSubFragment2, changeQuickRedirect3, false, "266c6ac754454146a4652ead01bf780b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, faceDetectionSubFragment2, changeQuickRedirect3, false, "266c6ac754454146a4652ead01bf780b")).booleanValue() : ((YodaConfirmActivity) faceDetectionSubFragment2.b.getActivity()).c()) {
                FaceDetectionSubFragment2.this.c.startPreview();
            } else {
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "info.onSuccess, prepare start preview, but activity paused. requestCode = " + FaceDetectionSubFragment2.this.o, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (FaceDetectionSubFragment2.this.b != null) {
                FaceDetectionSubFragment2.this.b.a("yoda_face_verify_launch_status", "face_fragment2", true, 707);
            }
        }
        FaceDetectionSubFragment2.this.e = System.currentTimeMillis();
        if (FaceDetectionSubFragment2.this.b != null) {
            FaceDetectionSubFragment2.this.b.d("yoda_face_verify_launch_status", "face_fragment2");
        }
    }
}
