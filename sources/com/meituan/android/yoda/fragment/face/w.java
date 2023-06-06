package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2.AnonymousClass3 b;

    private w(FaceDetectionSubFragment2.AnonymousClass3 anonymousClass3) {
        this.b = anonymousClass3;
    }

    public static View.OnClickListener a(FaceDetectionSubFragment2.AnonymousClass3 anonymousClass3) {
        Object[] objArr = {anonymousClass3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e563b7a9f2e49b4696a3fe888e0211d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e563b7a9f2e49b4696a3fe888e0211d") : new w(anonymousClass3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d58f12c848cb44c1e57557f3ebe3850d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d58f12c848cb44c1e57557f3ebe3850d");
        } else {
            FaceDetectionSubFragment2.AnonymousClass3.a(this.b, view);
        }
    }
}
