package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment1 b;

    public a(FaceDetectionSubFragment1 faceDetectionSubFragment1) {
        this.b = faceDetectionSubFragment1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3075a7053f07cb8fe3d2d90cbaa8fe6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3075a7053f07cb8fe3d2d90cbaa8fe6");
        } else {
            FaceDetectionSubFragment1.a(this.b, view);
        }
    }
}
