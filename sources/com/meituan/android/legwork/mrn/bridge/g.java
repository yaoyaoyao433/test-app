package com.meituan.android.legwork.mrn.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final IMPushBridgeModule b;

    private g(IMPushBridgeModule iMPushBridgeModule) {
        this.b = iMPushBridgeModule;
    }

    public static Runnable a(IMPushBridgeModule iMPushBridgeModule) {
        Object[] objArr = {iMPushBridgeModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a032240921106818be4785cfd4979342", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a032240921106818be4785cfd4979342") : new g(iMPushBridgeModule);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62e480c7d99658e0fe01f0fcd09de06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62e480c7d99658e0fe01f0fcd09de06");
        } else {
            IMPushBridgeModule.lambda$dismissProgressDialog$32(this.b);
        }
    }
}
