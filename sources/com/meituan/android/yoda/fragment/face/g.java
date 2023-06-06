package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2 b;

    private g(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        this.b = faceDetectionSubFragment2;
    }

    public static View.OnClickListener a(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "872f8bf7a437de664dda3ab07697cb37", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "872f8bf7a437de664dda3ab07697cb37") : new g(faceDetectionSubFragment2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6382e54f2b3ab483ce1c71e97e913246", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6382e54f2b3ab483ce1c71e97e913246");
        } else {
            FaceDetectionSubFragment2.b(this.b, view);
        }
    }
}
