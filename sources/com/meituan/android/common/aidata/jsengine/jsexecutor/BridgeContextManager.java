package com.meituan.android.common.aidata.jsengine.jsexecutor;

import android.support.annotation.NonNull;
import com.meituan.android.common.aidata.AIData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BridgeContextManager {
    private static final int BRIDGE_CONTEXT_POOL_SIZE = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    private final List<BridgeContext> mBridgeContextPool;
    private final AtomicLong mJSContextIndex;
    private final String mJSFrameworkId;
    private final String mJSScript;

    public BridgeContextManager(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "300015ba94aa0df6500660e6ca36f7de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "300015ba94aa0df6500660e6ca36f7de");
            return;
        }
        this.mJSContextIndex = new AtomicLong(0L);
        this.mBridgeContextPool = new ArrayList();
        this.mJSFrameworkId = str;
        this.mJSScript = str2;
    }

    public BridgeContext getBridgeContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5a939d4a1a0c5d9013c7d494635f224", RobustBitConfig.DEFAULT_VALUE) ? (BridgeContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5a939d4a1a0c5d9013c7d494635f224") : getBridgeContext(incrementExecutorInstanceIndex());
    }

    private long incrementExecutorInstanceIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6abef9b1a513128e3e79064c8b4b181", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6abef9b1a513128e3e79064c8b4b181")).longValue() : this.mJSContextIndex.incrementAndGet();
    }

    private BridgeContext getBridgeContext(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6993753c7ad590d60818fd666bf3445", RobustBitConfig.DEFAULT_VALUE)) {
            return (BridgeContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6993753c7ad590d60818fd666bf3445");
        }
        int i = (int) ((j - 1) % 3);
        if (this.mBridgeContextPool.size() < i + 1) {
            BridgeContext bridgeContext = new BridgeContext(AIData.getContext(), this.mJSFrameworkId, this.mJSScript);
            this.mBridgeContextPool.add(bridgeContext);
            return bridgeContext;
        }
        return this.mBridgeContextPool.get(i);
    }
}
