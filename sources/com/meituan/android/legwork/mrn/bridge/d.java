package com.meituan.android.legwork.mrn.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final IMPushBridgeModule b;
    private final String c;

    public d(IMPushBridgeModule iMPushBridgeModule, String str) {
        this.b = iMPushBridgeModule;
        this.c = str;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2929438894c7717490ed0f321cc96d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2929438894c7717490ed0f321cc96d7c");
        } else {
            IMPushBridgeModule.lambda$lifecycleCallback$29(this.b, this.c, (com.meituan.android.legwork.common.bus.event.b) obj);
        }
    }
}
