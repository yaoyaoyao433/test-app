package com.meituan.android.identifycardrecognizer.widgets;

import android.hardware.Camera;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Camera.AutoFocusCallback {
    public static ChangeQuickRedirect a;
    private final a b;

    private c(a aVar) {
        this.b = aVar;
    }

    public static Camera.AutoFocusCallback a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb748ca39f6a3294fb1b98e8500bbcef", RobustBitConfig.DEFAULT_VALUE) ? (Camera.AutoFocusCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb748ca39f6a3294fb1b98e8500bbcef") : new c(aVar);
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "685b8bb88ca10dfe1cd52188b4d1a5fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "685b8bb88ca10dfe1cd52188b4d1a5fd");
        } else {
            a.a(this.b, z, camera);
        }
    }
}
