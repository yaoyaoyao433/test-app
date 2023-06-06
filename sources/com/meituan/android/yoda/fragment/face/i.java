package com.meituan.android.yoda.fragment.face;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2 b;
    private final HashMap c;
    private final String d;
    private final File e;

    private i(FaceDetectionSubFragment2 faceDetectionSubFragment2, HashMap hashMap, String str, File file) {
        this.b = faceDetectionSubFragment2;
        this.c = hashMap;
        this.d = str;
        this.e = file;
    }

    public static Runnable a(FaceDetectionSubFragment2 faceDetectionSubFragment2, HashMap hashMap, String str, File file) {
        Object[] objArr = {faceDetectionSubFragment2, hashMap, str, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f010adc7f3b3c2d49472064e458eab5", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f010adc7f3b3c2d49472064e458eab5") : new i(faceDetectionSubFragment2, hashMap, str, file);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38b6df9c36ad662d8b125a62b9e23af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38b6df9c36ad662d8b125a62b9e23af2");
        } else {
            FaceDetectionSubFragment2.a(this.b, this.c, this.d, this.e);
        }
    }
}
