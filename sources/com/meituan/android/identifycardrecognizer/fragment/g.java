package com.meituan.android.identifycardrecognizer.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final OcrFragment b;
    private final int c;
    private final int d;

    private g(OcrFragment ocrFragment, int i, int i2) {
        this.b = ocrFragment;
        this.c = i;
        this.d = i2;
    }

    public static Runnable a(OcrFragment ocrFragment, int i, int i2) {
        Object[] objArr = {ocrFragment, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccb25231fdcf890120fe99fc6cd7e80f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccb25231fdcf890120fe99fc6cd7e80f") : new g(ocrFragment, i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efdf2249535162af54af411392339d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efdf2249535162af54af411392339d52");
        } else {
            OcrFragment.a(this.b, this.c, this.d);
        }
    }
}
