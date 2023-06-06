package com.meituan.android.legwork.mrn.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final CommonBridgeModule b;

    private b(CommonBridgeModule commonBridgeModule) {
        this.b = commonBridgeModule;
    }

    public static Runnable a(CommonBridgeModule commonBridgeModule) {
        Object[] objArr = {commonBridgeModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7af74b662ee13c87f01e8f7b2c8909e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7af74b662ee13c87f01e8f7b2c8909e") : new b(commonBridgeModule);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8823f8a178f84f2cc0adf1e2985dad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8823f8a178f84f2cc0adf1e2985dad3");
        } else {
            CommonBridgeModule.lambda$dismissProgressDialog$9(this.b);
        }
    }
}
