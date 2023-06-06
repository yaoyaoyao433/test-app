package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2.AnonymousClass5 b;
    private final String c;
    private final Error d;

    private aa(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5, String str, Error error) {
        this.b = anonymousClass5;
        this.c = str;
        this.d = error;
    }

    public static View.OnClickListener a(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5, String str, Error error) {
        Object[] objArr = {anonymousClass5, str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd9ed40be03dcd30d58ec4d879ad77ba", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd9ed40be03dcd30d58ec4d879ad77ba") : new aa(anonymousClass5, str, error);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "391ab6b94514fdeae3fc7b5f7c679097", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "391ab6b94514fdeae3fc7b5f7c679097");
            return;
        }
        FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5 = this.b;
        String str = this.c;
        Error error = this.d;
        Object[] objArr2 = {anonymousClass5, str, error, view};
        ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.AnonymousClass5.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f7acd40b5986d08acbe18e06ad48f7f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f7acd40b5986d08acbe18e06ad48f7f4");
            return;
        }
        FaceDetectionSubFragment2.this.n.b();
        FaceDetectionSubFragment2.this.f = false;
        FaceDetectionSubFragment2.this.c(FaceDetectionSubFragment2.this.l);
        if (FaceDetectionSubFragment2.this.b == null || FaceDetectionSubFragment2.this.b.g == null) {
            return;
        }
        FaceDetectionSubFragment2.this.b.g.onError(str, error);
    }
}
