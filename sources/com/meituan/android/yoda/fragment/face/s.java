package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2 b;

    private s(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        this.b = faceDetectionSubFragment2;
    }

    public static View.OnClickListener a(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7e3cfee86e68d6003a19d1c01e9a527", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7e3cfee86e68d6003a19d1c01e9a527") : new s(faceDetectionSubFragment2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7ade4fe0328f25323c52aa78c0b62a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7ade4fe0328f25323c52aa78c0b62a");
        } else {
            FaceDetectionSubFragment2.e(this.b, view);
        }
    }
}
