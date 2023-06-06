package com.meituan.metrics.rn;

import android.annotation.TargetApi;
import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.metrics.cache.MetricsCacheManager;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.metrics.sampler.fps.MetricsFpsSampler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes3.dex */
public class MetricsJSFPSSamplerImpl extends a.AbstractC0145a implements MetricsFpsSampler {
    private static final double EXPECTED_FRAME_TIME = 16.9d;
    private static final String TAG = "metrics FpsSampler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private long currentFrameTotalCostTime;
    private int currentFrameTotalCount;
    private Map<String, FpsEvent> customEvents;
    private a mChoreographer;
    private final DidJSUpdateUiDuringFrameDetector mDidJSUpdateUiDuringFrameDetector;
    private long mFirstFrameTime;
    private long mLastFrameTime;
    private int mNumFrameCallbacks;
    private int mNumFrameCallbacksWithBatchDispatches;
    private boolean mShouldStop;
    private final UIManagerModule mUIManagerModule;
    private double nowFPS;
    private ReactContext reactContext;

    @Override // com.meituan.metrics.sampler.fps.MetricsFpsSampler
    public void changeToFragment(Object obj) {
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void doSample() {
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void pageEnter(Activity activity) {
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void pageExit(Activity activity) {
    }

    public MetricsJSFPSSamplerImpl(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0eef31d6f8f0f642a678a447f1112f34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0eef31d6f8f0f642a678a447f1112f34");
            return;
        }
        this.customEvents = new ConcurrentHashMap();
        this.mFirstFrameTime = -1L;
        this.mLastFrameTime = -1L;
        this.mShouldStop = false;
        this.mNumFrameCallbacks = 0;
        this.mNumFrameCallbacksWithBatchDispatches = 0;
        this.mUIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.mDidJSUpdateUiDuringFrameDetector = new DidJSUpdateUiDuringFrameDetector();
        this.mChoreographer = a.a();
        this.reactContext = reactContext;
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public double getRealTimeValue() {
        return this.nowFPS;
    }

    @Override // com.meituan.metrics.sampler.fps.MetricsFpsSampler
    public void startCustomRecordFps(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "338aca57b9c60fbc0aceb5c8f16f27b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "338aca57b9c60fbc0aceb5c8f16f27b8");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            FpsEvent fpsEvent = new FpsEvent("custom", str);
            fpsEvent.sampleUpdateEnabled = true;
            fpsEvent.frameTotalCostTime = this.currentFrameTotalCostTime;
            fpsEvent.frameTotalCount = this.currentFrameTotalCount;
            this.customEvents.put(str, fpsEvent);
            this.mShouldStop = false;
            this.reactContext.getCatalystInstance().addBridgeIdleDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
            this.mUIManagerModule.setViewHierarchyUpdateDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
            if (this.mChoreographer == null) {
                return;
            }
            this.mChoreographer.a(this);
        }
    }

    @Override // com.meituan.metrics.sampler.fps.MetricsFpsSampler
    public void stopCustomRecordFps(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ae3821692e4d8819c4bb1ba7895e56e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ae3821692e4d8819c4bb1ba7895e56e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.mChoreographer != null) {
                this.mChoreographer.b(this);
            }
            this.mShouldStop = true;
            this.reactContext.getCatalystInstance().removeBridgeIdleDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
            this.mUIManagerModule.setViewHierarchyUpdateDebugListener(null);
            FpsEvent fpsEvent = this.customEvents.get(str);
            if (fpsEvent != null) {
                fpsEvent.computeAvgFps(this.mLastFrameTime - this.mFirstFrameTime, getNumJSFrames());
                fpsEvent.sampleUpdateEnabled = false;
                if (fpsEvent.isValid()) {
                    fpsEvent.optionTags = map;
                    MetricsCacheManager.getInstance().addToCache(fpsEvent);
                }
                this.customEvents.remove(str);
            }
            reset();
        }
    }

    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3212a258e606d51bbf4880d16f6fb2f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3212a258e606d51bbf4880d16f6fb2f4");
            return;
        }
        this.currentFrameTotalCostTime = 0L;
        this.currentFrameTotalCount = 0;
        this.nowFPS = 0.0d;
        if (this.mChoreographer != null) {
            this.mChoreographer.b(this);
        }
        this.mFirstFrameTime = -1L;
        this.mLastFrameTime = -1L;
        this.mNumFrameCallbacks = 0;
        this.mNumFrameCallbacksWithBatchDispatches = 0;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0145a
    public void doFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c606e62d1e9683139cc45d5f20debf25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c606e62d1e9683139cc45d5f20debf25");
        } else if (!this.mShouldStop) {
            if (this.mFirstFrameTime == -1) {
                this.mFirstFrameTime = j;
            }
            long j2 = this.mLastFrameTime;
            this.mLastFrameTime = j;
            if (this.mDidJSUpdateUiDuringFrameDetector.getDidJSHitFrameAndCleanup(j2, j)) {
                this.mNumFrameCallbacksWithBatchDispatches++;
            }
            this.mNumFrameCallbacks++;
            this.nowFPS = getJSFPS();
            if (this.nowFPS >= 60.0d) {
                this.nowFPS = 60.0d;
            }
            for (FpsEvent fpsEvent : this.customEvents.values()) {
                if (fpsEvent != null && fpsEvent.sampleUpdateEnabled && this.nowFPS > 0.0d && fpsEvent.minFps > this.nowFPS) {
                    fpsEvent.minFps = this.nowFPS;
                }
            }
            this.mChoreographer.a(this);
        }
    }

    public double getJSFPS() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25dc99c740558b3f0f63825d669f4030", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25dc99c740558b3f0f63825d669f4030")).doubleValue();
        }
        if (this.mLastFrameTime <= this.mFirstFrameTime) {
            return 0.0d;
        }
        return (getNumJSFrames() * 1.0E9d) / (this.mLastFrameTime - this.mFirstFrameTime);
    }

    public int getNumFrames() {
        return this.mNumFrameCallbacks - 1;
    }

    public int getNumJSFrames() {
        return this.mNumFrameCallbacksWithBatchDispatches - 1;
    }

    public int getExpectedNumFrames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cac5d79ad606f1c99d9ecf3c5395a01", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cac5d79ad606f1c99d9ecf3c5395a01")).intValue() : (int) ((getTotalTimeMS() / EXPECTED_FRAME_TIME) + 1.0d);
    }

    public int getTotalTimeMS() {
        return ((int) (this.mLastFrameTime - this.mFirstFrameTime)) / 1000000;
    }
}
