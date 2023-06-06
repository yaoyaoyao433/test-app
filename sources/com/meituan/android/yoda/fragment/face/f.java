package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2 b;
    private final String c;
    private final Error d;

    private f(FaceDetectionSubFragment2 faceDetectionSubFragment2, String str, Error error) {
        this.b = faceDetectionSubFragment2;
        this.c = str;
        this.d = error;
    }

    public static View.OnClickListener a(FaceDetectionSubFragment2 faceDetectionSubFragment2, String str, Error error) {
        Object[] objArr = {faceDetectionSubFragment2, str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12e18cbcc45f5dba41f9bf247bd20fb9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12e18cbcc45f5dba41f9bf247bd20fb9") : new f(faceDetectionSubFragment2, str, error);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77694ac52563d51bf6cc853180adbc85", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77694ac52563d51bf6cc853180adbc85");
        } else {
            FaceDetectionSubFragment2.a(this.b, this.c, this.d, view);
        }
    }
}
