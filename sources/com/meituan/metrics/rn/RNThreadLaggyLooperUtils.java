package com.meituan.metrics.rn;

import android.os.Looper;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.meituan.metrics.laggy.MetricsLaggyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNThreadLaggyLooperUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void add2MetricLaggyManager(@Nullable final ReactInstanceManager reactInstanceManager) {
        Object[] objArr = {reactInstanceManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13945d40e37496e9645db8a0be6e1481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13945d40e37496e9645db8a0be6e1481");
        } else if (reactInstanceManager == null) {
        } else {
            ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
            if (currentReactContext == null) {
                reactInstanceManager.addReactInstanceEventListener(new ReactInstanceManager.b() { // from class: com.meituan.metrics.rn.RNThreadLaggyLooperUtils.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.facebook.react.ReactInstanceManager.b
                    public final void onReactContextInitialized(ReactContext reactContext) {
                        Object[] objArr2 = {reactContext};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "10bf96ad10295126e25d134992c2d7ff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "10bf96ad10295126e25d134992c2d7ff");
                            return;
                        }
                        RNThreadLaggyLooperUtils.initMetricsLaggyMonitor(reactContext);
                        ReactInstanceManager.this.removeReactInstanceEventListener(this);
                    }
                });
            } else {
                initMetricsLaggyMonitor(currentReactContext);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initMetricsLaggyMonitor(ReactContext reactContext) {
        ReactQueueConfiguration reactQueueConfiguration;
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa275dee3f9e81dae34ec3765ec4849f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa275dee3f9e81dae34ec3765ec4849f");
            return;
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        if (catalystInstance == null || (reactQueueConfiguration = catalystInstance.getReactQueueConfiguration()) == null) {
            return;
        }
        MessageQueueThreadImpl messageQueueThreadImpl = (MessageQueueThreadImpl) reactQueueConfiguration.getJSQueueThread();
        MessageQueueThreadImpl messageQueueThreadImpl2 = (MessageQueueThreadImpl) reactQueueConfiguration.getNativeModulesQueueThread();
        if (messageQueueThreadImpl != null) {
            try {
                MetricsLaggyManager metricsLaggyManager = MetricsLaggyManager.getInstance();
                Looper looper = messageQueueThreadImpl.getLooper();
                metricsLaggyManager.addLaggyLopperPrinter(looper, "mqt" + messageQueueThreadImpl.getName());
            } catch (Exception unused) {
                return;
            }
        }
        if (messageQueueThreadImpl2 != null) {
            MetricsLaggyManager metricsLaggyManager2 = MetricsLaggyManager.getInstance();
            Looper looper2 = messageQueueThreadImpl2.getLooper();
            metricsLaggyManager2.addLaggyLopperPrinter(looper2, "mqt" + messageQueueThreadImpl2.getName());
        }
    }
}
