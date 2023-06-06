package com.meituan.metrics;

import android.view.Choreographer;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsFrameCallbackManager implements Choreographer.FrameCallback, AppBus.OnBackgroundUIListener, AppBus.OnForegroundUIListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile long lastCallbackNs;
    private static volatile MetricsFrameCallbackManager sInstance;
    private boolean isChoreographerReady;
    private boolean isForeground;
    private List<MetricsFrameCallback> mCallbacks;
    private Choreographer mChoreographer;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface MetricsFrameCallback {
        void doFrame(long j);
    }

    public static MetricsFrameCallbackManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b76fdd72ccfc3169b5d2147404c1ffd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsFrameCallbackManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b76fdd72ccfc3169b5d2147404c1ffd9");
        }
        if (sInstance == null) {
            synchronized (MetricsFrameCallbackManager.class) {
                if (sInstance == null) {
                    sInstance = new MetricsFrameCallbackManager();
                }
            }
        }
        return sInstance;
    }

    public MetricsFrameCallbackManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32aba1e22bd899061efa902daab7ae27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32aba1e22bd899061efa902daab7ae27");
            return;
        }
        this.mCallbacks = new CopyOnWriteArrayList();
        ThreadManager.getInstance().runInMainThread(new Runnable() { // from class: com.meituan.metrics.MetricsFrameCallbackManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a8236c6d92098b9744737f6686eb8662", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a8236c6d92098b9744737f6686eb8662");
                    return;
                }
                MetricsFrameCallbackManager.this.mChoreographer = Choreographer.getInstance();
                MetricsFrameCallbackManager.this.isChoreographerReady = true;
                MetricsFrameCallbackManager.this.isForeground = AppBus.getInstance().isForeground();
                AppBus.getInstance().register((AppBus.OnBackgroundListener) MetricsFrameCallbackManager.this);
                AppBus.getInstance().register((AppBus.OnForegroundListener) MetricsFrameCallbackManager.this);
            }
        });
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cf6a9c4d6f6a10e02f958b1c823824e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cf6a9c4d6f6a10e02f958b1c823824e");
            return;
        }
        lastCallbackNs = j;
        for (MetricsFrameCallback metricsFrameCallback : this.mCallbacks) {
            metricsFrameCallback.doFrame(j);
        }
        if (this.isForeground && this.isChoreographerReady) {
            this.mChoreographer.postFrameCallback(this);
        }
    }

    public void register(MetricsFrameCallback metricsFrameCallback) {
        Object[] objArr = {metricsFrameCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a276ba3c188dcabff41bd1e47dbf1bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a276ba3c188dcabff41bd1e47dbf1bb");
        } else if (metricsFrameCallback != null) {
            this.mCallbacks.add(metricsFrameCallback);
        }
    }

    public void unregister(MetricsFrameCallback metricsFrameCallback) {
        Object[] objArr = {metricsFrameCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22e7ac16f5c8bf7e4bfdbcc8d30da101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22e7ac16f5c8bf7e4bfdbcc8d30da101");
        } else {
            this.mCallbacks.remove(metricsFrameCallback);
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public void onBackground() {
        this.isForeground = false;
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
    public void onForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cf8f6118fee415849a5a203212c6548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cf8f6118fee415849a5a203212c6548");
            return;
        }
        this.isForeground = true;
        if (this.isChoreographerReady) {
            this.mChoreographer.postFrameCallback(this);
        }
    }

    public boolean isForeground() {
        return this.isForeground;
    }

    public static long getLastCallbackNs() {
        return lastCallbackNs;
    }
}
