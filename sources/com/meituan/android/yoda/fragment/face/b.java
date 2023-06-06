package com.meituan.android.yoda.fragment.face;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final FaceDetectionSubFragment1 b;

    private b(FaceDetectionSubFragment1 faceDetectionSubFragment1) {
        this.b = faceDetectionSubFragment1;
    }

    public static CompoundButton.OnCheckedChangeListener a(FaceDetectionSubFragment1 faceDetectionSubFragment1) {
        Object[] objArr = {faceDetectionSubFragment1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "312cb4655003563f706ef5f41d1b0e80", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "312cb4655003563f706ef5f41d1b0e80") : new b(faceDetectionSubFragment1);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e586d478c6263323f3a58f4d683302d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e586d478c6263323f3a58f4d683302d");
        } else {
            FaceDetectionSubFragment1.a(this.b, compoundButton, z);
        }
    }
}
