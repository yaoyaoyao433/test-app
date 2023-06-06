package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2.AnonymousClass5 b;

    private af(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5) {
        this.b = anonymousClass5;
    }

    public static View.OnClickListener a(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5) {
        Object[] objArr = {anonymousClass5};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f8ed8050ee765dd9aa0d07fa3d74200", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f8ed8050ee765dd9aa0d07fa3d74200") : new af(anonymousClass5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca3beb545bf084c641b0687fbcd235e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca3beb545bf084c641b0687fbcd235e");
            return;
        }
        FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5 = this.b;
        Object[] objArr2 = {anonymousClass5, view};
        ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.AnonymousClass5.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4f53fd8c7f7496bc4eca1e932ccd775b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4f53fd8c7f7496bc4eca1e932ccd775b");
            return;
        }
        FaceDetectionSubFragment2.this.f = true;
        FaceDetectionSubFragment2.this.d();
    }
}
