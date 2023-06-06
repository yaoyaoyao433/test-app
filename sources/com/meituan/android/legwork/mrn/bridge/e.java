package com.meituan.android.legwork.mrn.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final IMPushBridgeModule b;

    public e(IMPushBridgeModule iMPushBridgeModule) {
        this.b = iMPushBridgeModule;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50f6b544e1a7e2cea0741b25e655206f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50f6b544e1a7e2cea0741b25e655206f");
        } else {
            IMPushBridgeModule.lambda$lifecycleCallback$30(this.b, (com.meituan.android.legwork.common.bus.event.a) obj);
        }
    }
}
