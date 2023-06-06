package com.meituan.android.legwork.mrn.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final IMPushBridgeModule b;

    private f(IMPushBridgeModule iMPushBridgeModule) {
        this.b = iMPushBridgeModule;
    }

    public static Runnable a(IMPushBridgeModule iMPushBridgeModule) {
        Object[] objArr = {iMPushBridgeModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2b5bc40942ce2f8b012ce210c98bcb0", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2b5bc40942ce2f8b012ce210c98bcb0") : new f(iMPushBridgeModule);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e454888eb92de40c5b92eec60ddbd9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e454888eb92de40c5b92eec60ddbd9d");
        } else {
            IMPushBridgeModule.lambda$showProgressDialog$31(this.b);
        }
    }
}
