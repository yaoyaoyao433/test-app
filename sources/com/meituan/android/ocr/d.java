package com.meituan.android.ocr;

import android.hardware.Camera;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Camera.AutoFocusCallback {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static Camera.AutoFocusCallback a() {
        return b;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9306d168c0a162e3c945cb228211d8bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9306d168c0a162e3c945cb228211d8bf");
        } else {
            PayBaseCameraFragment.a(z, camera);
        }
    }
}
