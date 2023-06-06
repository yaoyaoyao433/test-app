package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2 b;

    private h(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        this.b = faceDetectionSubFragment2;
    }

    public static View.OnClickListener a(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aaa1eb39a363b5840e117b991e0be550", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aaa1eb39a363b5840e117b991e0be550") : new h(faceDetectionSubFragment2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9813a8ab45ff242e6c8ac91207aa35ae", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9813a8ab45ff242e6c8ac91207aa35ae");
        } else {
            FaceDetectionSubFragment2.a(this.b, view);
        }
    }
}
