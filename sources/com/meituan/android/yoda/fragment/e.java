package com.meituan.android.yoda.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionFragment b;

    private e(FaceDetectionFragment faceDetectionFragment) {
        this.b = faceDetectionFragment;
    }

    public static View.OnClickListener a(FaceDetectionFragment faceDetectionFragment) {
        Object[] objArr = {faceDetectionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c5c434378b85d957b2f67ab3a8c2d01", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c5c434378b85d957b2f67ab3a8c2d01") : new e(faceDetectionFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06c8b7a1ca45cdaf42be43fc4e08310", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06c8b7a1ca45cdaf42be43fc4e08310");
        } else {
            FaceDetectionFragment.a(this.b, view);
        }
    }
}
