package com.meituan.android.legwork.mrn.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final CommonBridgeModule b;

    private a(CommonBridgeModule commonBridgeModule) {
        this.b = commonBridgeModule;
    }

    public static Runnable a(CommonBridgeModule commonBridgeModule) {
        Object[] objArr = {commonBridgeModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8417296da831a2ecc96a41e5385a78f8", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8417296da831a2ecc96a41e5385a78f8") : new a(commonBridgeModule);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c53dbb75e64a17a8cbbc915cee27bd9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c53dbb75e64a17a8cbbc915cee27bd9a");
        } else {
            CommonBridgeModule.lambda$showProgressDialog$8(this.b);
        }
    }
}
