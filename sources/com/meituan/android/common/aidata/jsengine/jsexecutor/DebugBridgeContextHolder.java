package com.meituan.android.common.aidata.jsengine.jsexecutor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DebugBridgeContextHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DebugBridgeContextHolder sInstance;
    private BridgeContext mDebugBridgeContext;

    public static DebugBridgeContextHolder getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7ca46b01ae9daafa9b5e03b9790403a", RobustBitConfig.DEFAULT_VALUE)) {
            return (DebugBridgeContextHolder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7ca46b01ae9daafa9b5e03b9790403a");
        }
        if (sInstance == null) {
            synchronized (DebugBridgeContextHolder.class) {
                if (sInstance == null) {
                    sInstance = new DebugBridgeContextHolder();
                }
            }
        }
        return sInstance;
    }

    public void setDebugBridgeContext(BridgeContext bridgeContext) {
        this.mDebugBridgeContext = bridgeContext;
    }

    public BridgeContext getDebugBridgeContext() {
        return this.mDebugBridgeContext;
    }
}
