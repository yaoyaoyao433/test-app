package com.meituan.android.yoda.fragment.face;

import android.view.View;
import com.meituan.android.yoda.fragment.FaceDetectionFragment;
import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment2.AnonymousClass5 b;
    private final Error c;

    private z(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5, Error error) {
        this.b = anonymousClass5;
        this.c = error;
    }

    public static View.OnClickListener a(FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5, Error error) {
        Object[] objArr = {anonymousClass5, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7c95962e0ffb04293b95c51572a194f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7c95962e0ffb04293b95c51572a194f") : new z(anonymousClass5, error);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a66734b78abbde5ee719cabfd0668e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a66734b78abbde5ee719cabfd0668e");
            return;
        }
        FaceDetectionSubFragment2.AnonymousClass5 anonymousClass5 = this.b;
        Error error = this.c;
        Object[] objArr2 = {anonymousClass5, error, view};
        ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.AnonymousClass5.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "09d3ace4521f4b10fdd666b41307646b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "09d3ace4521f4b10fdd666b41307646b");
            return;
        }
        if (FaceDetectionSubFragment2.this.b != null) {
            FaceDetectionFragment unused = FaceDetectionSubFragment2.this.b;
            if (FaceDetectionFragment.b(error)) {
                FaceDetectionSubFragment2.this.b.a("yoda_face_verify_launch_status", "face_fragment2", true, TbsListener.ErrorCode.INFO_COOKIE_SWITCH_TRANSFER);
            } else {
                FaceDetectionSubFragment2.this.b.a("yoda_face_verify_launch_status", "face_fragment2", true, 703);
            }
            FaceDetectionSubFragment2.this.b.d("yoda_face_verify_launch_status", "face_fragment2");
        }
        FaceDetectionSubFragment2.this.n.b();
        FaceDetectionSubFragment2.this.f = false;
        FaceDetectionSubFragment2.y(FaceDetectionSubFragment2.this);
    }
}
