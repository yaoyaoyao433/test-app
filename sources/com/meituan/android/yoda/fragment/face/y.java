package com.meituan.android.yoda.fragment.face;

import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2.AnonymousClass5 b;
    private final String c;

    private y(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5, String str) {
        this.b = anonymousClass5;
        this.c = str;
    }

    public static Runnable a(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5, String str) {
        Object[] objArr = {anonymousClass5, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6a9b11c6cf1b19051bc992314d0e687", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6a9b11c6cf1b19051bc992314d0e687") : new y(anonymousClass5, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "866682e8184af33ff0635d1e4908029a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "866682e8184af33ff0635d1e4908029a");
            return;
        }
        FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5 = this.b;
        String str = this.c;
        Object[] objArr2 = {anonymousClass5, str};
        ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.AnonymousClass5.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2048719be41ee91fa063fdaf8c33ff19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2048719be41ee91fa063fdaf8c33ff19");
        } else if (FaceDetectionSubFragment2.this.b == null || FaceDetectionSubFragment2.this.b.g == null) {
        } else {
            FaceDetectionSubFragment2.this.b.g.onError(str, new Error(-1, "参数错误"));
        }
    }
}
