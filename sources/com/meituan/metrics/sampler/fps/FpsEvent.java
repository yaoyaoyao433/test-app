package com.meituan.metrics.sampler.fps;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.view.FrameMetrics;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.sampler.AbstractSampleEvent;
import com.meituan.metrics.util.AppUtils;
import com.meituan.metrics.util.JSONUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FpsEvent extends AbstractSampleEvent {
    private static final float CRITICAL_SLOW_MILLIS = 41.666668f;
    private static final float FREEZE_FRAME_THRESH_MILLIS = 700.0f;
    private static final float MILLIS_IN_SECOND = 1000.0f;
    private static final float NANOS_IN_MILLIS = 1000000.0f;
    private static final float NANOS_IN_SECOND = 1.0E9f;
    public static final String TYPE_SCROLL_AUTO = "auto";
    public static final String TYPE_SCROLL_CUSTOM = "custom";
    public static ChangeQuickRedirect changeQuickRedirect;
    private long accumulatedRefreshRate;
    private WeakReference<Activity> activityReference;
    private double avgFps;
    public double criticalSlowFrameTime;
    private double criticalSlowTimeRatio;
    private long endTimestamp;
    private int fixFrameCount;
    private int frameCount;
    private int frameCountBySecond;
    private float frameDurationAvg;
    public boolean frameMetricsListenerRegistered;
    public long frameTotalCostTime;
    public int frameTotalCount;
    public int freezeFrameCount;
    private float freezeFrameRate;
    private long gpuTimeOn31;
    public int jankFrameCount;
    private float jankFrameRate;
    public double jankTotalTime;
    private long lastFrameEndVsyncTimestamp;
    private long lastFrameStartTimestamp;
    private long lastFrameTotalCostTime;
    private int lastFrameTotalCount;
    private double lastFrameWaitingTime;
    private long longestFrameDuration;
    private int maxFrameCount;
    public double minFps;
    private final String name;
    private float normalFrameCostMillis;
    private long normalFrameCostNanos;
    private long recordTime;
    public volatile boolean sampleUpdateEnabled;
    private double scrollHitchRatio;
    public boolean scrollListenerRegistered;
    public String scrollType;
    private long secondDeadline;
    @Deprecated
    public int slowFrameCount;
    public double slowFrameTime;
    private double slowTimeRatio;
    private long startTimestamp;
    private final String type;
    private Boolean usedFrameMetrics;

    @Deprecated
    public void addFrameMetricsData(long j) {
    }

    public FpsEvent(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5772a37390dd12b9e6176f0ba90574e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5772a37390dd12b9e6176f0ba90574e3");
            return;
        }
        this.minFps = 2.147483647E9d;
        this.frameTotalCount = 0;
        this.frameTotalCostTime = 0L;
        this.jankTotalTime = 0.0d;
        this.jankFrameCount = 0;
        this.slowFrameTime = 0.0d;
        this.criticalSlowFrameTime = 0.0d;
        this.freezeFrameCount = 0;
        this.longestFrameDuration = 0L;
        this.accumulatedRefreshRate = 0L;
        this.scrollType = TYPE_SCROLL_AUTO;
        this.avgFps = 0.0d;
        this.usedFrameMetrics = null;
        this.scrollListenerRegistered = false;
        this.frameMetricsListenerRegistered = false;
        this.recordTime = 0L;
        this.startTimestamp = 0L;
        this.endTimestamp = 0L;
        this.gpuTimeOn31 = 0L;
        this.fixFrameCount = 0;
        this.lastFrameEndVsyncTimestamp = 0L;
        this.secondDeadline = Math.round((float) NANOS_IN_SECOND);
        this.lastFrameStartTimestamp = 0L;
        this.name = str2;
        this.type = str;
        setConfigFrom();
    }

    public FpsEvent(String str, String str2, int i) {
        this(str, str2);
        float f;
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc8644f6fe6c5a1c2d2d2a212d3fb320", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc8644f6fe6c5a1c2d2d2a212d3fb320");
            return;
        }
        this.maxFrameCount = i;
        this.normalFrameCostMillis = MILLIS_IN_SECOND / i;
        this.normalFrameCostNanos = NANOS_IN_SECOND / f;
        this.lastFrameWaitingTime = this.normalFrameCostMillis;
    }

    public FpsEvent(String str, String str2, int i, Activity activity) {
        this(str, str2, i);
        Object[] objArr = {str, str2, Integer.valueOf(i), activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc304130e700431c5854ca380548fa85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc304130e700431c5854ca380548fa85");
        } else {
            this.activityReference = new WeakReference<>(activity);
        }
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public double getAvgFps() {
        return this.avgFps;
    }

    public double getMinFps() {
        return this.minFps;
    }

    public void setUsedFrameMetrics(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb880887fe8c301bed666d1bb2277177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb880887fe8c301bed666d1bb2277177");
        } else {
            this.usedFrameMetrics = Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r1.equals("page") == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setConfigFrom() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.metrics.sampler.fps.FpsEvent.changeQuickRedirect
            java.lang.String r10 = "78b4ee710563f6d6517574d209979883"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            java.lang.String r1 = r11.type
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto La7
            java.lang.String r1 = r11.name
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto La7
            java.lang.String r1 = r11.type
            int r2 = r1.hashCode()
            r3 = -1349088399(0xffffffffaf968b71, float:-2.738392E-10)
            r4 = 2
            r5 = -1
            if (r2 == r3) goto L65
            r3 = -907680051(0xffffffffc9e5e6cd, float:-1883353.6)
            if (r2 == r3) goto L5a
            r3 = -402166450(0xffffffffe8076d4e, float:-2.5581432E24)
            if (r2 == r3) goto L4f
            r3 = 3433103(0x34628f, float:4.810802E-39)
            if (r2 == r3) goto L45
            goto L6f
        L45:
            java.lang.String r2 = "page"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6f
            goto L70
        L4f:
            java.lang.String r0 = "scroll-N"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
            r0 = 2
            goto L70
        L5a:
            java.lang.String r0 = "scroll"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
            r0 = 1
            goto L70
        L65:
            java.lang.String r0 = "custom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
            r0 = 3
            goto L70
        L6f:
            r0 = -1
        L70:
            switch(r0) {
                case 0: goto L96;
                case 1: goto L85;
                case 2: goto L85;
                case 3: goto L74;
                default: goto L73;
            }
        L73:
            goto La7
        L74:
            com.meituan.metrics.config.MetricsRemoteConfigManager r0 = com.meituan.metrics.config.MetricsRemoteConfigManager.getInstance()
            java.lang.String r1 = r11.name
            boolean r0 = r0.isFpsCustomEnable(r1)
            if (r0 == 0) goto L81
            goto L82
        L81:
            r4 = -1
        L82:
            r11.configFrom = r4
            goto La7
        L85:
            com.meituan.metrics.config.MetricsRemoteConfigManager r0 = com.meituan.metrics.config.MetricsRemoteConfigManager.getInstance()
            java.lang.String r1 = r11.name
            boolean r0 = r0.isFpsScrollEnable(r1)
            if (r0 == 0) goto L92
            goto L93
        L92:
            r4 = -1
        L93:
            r11.configFrom = r4
            return
        L96:
            com.meituan.metrics.config.MetricsRemoteConfigManager r0 = com.meituan.metrics.config.MetricsRemoteConfigManager.getInstance()
            java.lang.String r1 = r11.name
            boolean r0 = r0.isFpsPageEnable(r1)
            if (r0 == 0) goto La3
            goto La4
        La3:
            r4 = -1
        La4:
            r11.configFrom = r4
            return
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.sampler.fps.FpsEvent.setConfigFrom():void");
    }

    public void addFrameCost(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c1150f513615738c5d0cc2c95a44e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c1150f513615738c5d0cc2c95a44e33");
            return;
        }
        float f = (((float) j) * 1.0f) / NANOS_IN_MILLIS;
        if (f > 2.14748365E9f) {
            f = 2.14748365E9f;
        }
        if (f - this.normalFrameCostMillis > 0.01d) {
            this.jankFrameCount++;
        }
        if (f - FREEZE_FRAME_THRESH_MILLIS > 0.01d) {
            this.freezeFrameCount++;
        }
        this.frameCount++;
    }

    public void computeAvgFps(long j, int i) {
        float f;
        float f2;
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41e7ca8efc5e84fd4c6ef97d122bb6fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41e7ca8efc5e84fd4c6ef97d122bb6fd");
            return;
        }
        long j2 = j - this.frameTotalCostTime;
        int i2 = i - this.frameTotalCount;
        if (j2 > 0 && i2 > 0) {
            this.avgFps = (NANOS_IN_SECOND * f) / f2;
            this.frameDurationAvg = (((float) j2) / NANOS_IN_MILLIS) / i2;
        }
        this.jankFrameRate = (this.jankFrameCount * 1.0f) / this.frameCount;
        this.freezeFrameRate = (this.freezeFrameCount * 1.0f) / this.frameCount;
    }

    public void computeScrollAvgFps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e22c109e490938a8e8292a593fc96a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e22c109e490938a8e8292a593fc96a7");
            return;
        }
        if (this.lastFrameTotalCostTime > 0 && this.lastFrameTotalCount > 0) {
            this.avgFps = (this.lastFrameTotalCount * NANOS_IN_SECOND) / ((float) this.lastFrameTotalCostTime);
            this.frameDurationAvg = (((float) this.lastFrameTotalCostTime) / NANOS_IN_MILLIS) / this.lastFrameTotalCount;
        }
        this.jankFrameRate = (this.jankFrameCount * 1.0f) / this.frameCount;
        this.freezeFrameRate = (this.freezeFrameCount * 1.0f) / this.frameCount;
    }

    public void computeLastTimeAndCount(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50545338f959920767b9af867dfaff50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50545338f959920767b9af867dfaff50");
            return;
        }
        long j2 = j - this.frameTotalCostTime;
        int i2 = i - this.frameTotalCount;
        if (j2 <= 0 || i2 <= 0) {
            return;
        }
        this.lastFrameTotalCostTime += j2;
        this.lastFrameTotalCount += i2;
    }

    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1da71ebc4ed891e98b31f12afcd730ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1da71ebc4ed891e98b31f12afcd730ff");
            return;
        }
        this.lastFrameTotalCostTime = 0L;
        this.lastFrameTotalCount = 0;
        this.jankFrameCount = 0;
        this.frameCount = 0;
        this.freezeFrameCount = 0;
        this.lastFrameWaitingTime = this.normalFrameCostMillis;
        this.slowFrameTime = 0.0d;
        this.criticalSlowFrameTime = 0.0d;
        this.longestFrameDuration = 0L;
        this.jankTotalTime = 0.0d;
        this.recordTime = 0L;
        this.startTimestamp = 0L;
        this.endTimestamp = 0L;
        this.lastFrameStartTimestamp = 0L;
        this.lastFrameEndVsyncTimestamp = 0L;
        this.frameCountBySecond = 0;
        this.secondDeadline = Math.round((float) NANOS_IN_SECOND);
        this.fixFrameCount = 0;
    }

    public Map<String, Object> getDetails() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baf6e2ca1315f1774bc6613419f2c183", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baf6e2ca1315f1774bc6613419f2c183");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("jankFrameRate", Float.valueOf(this.jankFrameRate));
        hashMap.put("freezeFrameRate", Float.valueOf(this.freezeFrameRate));
        hashMap.put("frameCount", Integer.valueOf(this.frameCount));
        if (this.usedFrameMetrics != null) {
            hashMap.put("usedFrameMetrics", this.usedFrameMetrics);
        }
        if (this.type.equals(Constants.FPS_TYPE_SCROLL_N)) {
            hashMap.put("slowTimeRatio", Double.valueOf(this.slowTimeRatio));
            hashMap.put("scrollHitchRatio", Double.valueOf(this.scrollHitchRatio));
            hashMap.put("criticalSlowTimeRatio", Double.valueOf(this.criticalSlowTimeRatio));
            hashMap.put("longestJankTime", Double.valueOf(Math.max(((this.longestFrameDuration / 1.0E9d) / 0.016666666666666666d) - 1.0d, 0.0d)));
            if (Double.compare(this.minFps, -1.0d) > 0) {
                hashMap.put("minFPS", Double.valueOf(this.minFps));
            } else {
                hashMap.put("minFPS", Double.valueOf(this.avgFps));
            }
            if (this.accumulatedRefreshRate > 0) {
                hashMap.put("weightedRefreshRate", Long.valueOf(this.accumulatedRefreshRate / this.frameCount));
            }
            if (this.fixFrameCount > 0) {
                hashMap.put("fixFrameCount", Integer.valueOf(this.fixFrameCount));
            }
            Activity activity = this.activityReference == null ? null : this.activityReference.get();
            if (activity != null) {
                String tryToGetFragmentNameFromActivity = AppUtils.tryToGetFragmentNameFromActivity(activity);
                Map<String, Object> tryToGetFragmentTagsFromActivity = AppUtils.tryToGetFragmentTagsFromActivity(activity, Constants.FPS_SCROLL);
                if (tryToGetFragmentNameFromActivity != null) {
                    hashMap.put("fragmentName", tryToGetFragmentNameFromActivity);
                }
                if (tryToGetFragmentTagsFromActivity != null) {
                    hashMap.putAll(tryToGetFragmentTagsFromActivity);
                }
            }
        } else {
            hashMap.put("scrollListenerRegistered", Boolean.valueOf(this.scrollListenerRegistered));
            hashMap.put("frameMetricsListenerRegistered", Boolean.valueOf(this.frameMetricsListenerRegistered));
            hashMap.put("frameDurationAvg", Float.valueOf(this.frameDurationAvg));
        }
        return hashMap;
    }

    public int getMaxFrameCount() {
        return this.maxFrameCount;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ae8a7cac9a7897376458859e6b6f626", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ae8a7cac9a7897376458859e6b6f626")).booleanValue();
        }
        if (this.type.equals(Constants.FPS_TYPE_SCROLL_N)) {
            return true;
        }
        return (Double.isNaN(this.avgFps) || this.minFps == 2.147483647E9d) ? false : true;
    }

    @RequiresApi(api = 24)
    public void onMetricsAvailable(FrameMetrics frameMetrics, int i) {
        float f;
        Object[] objArr = {frameMetrics, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82e70e5d2837f15da240bba7cd57e080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82e70e5d2837f15da240bba7cd57e080");
            return;
        }
        long metric = frameMetrics.getMetric(8);
        this.frameCount++;
        if (this.maxFrameCount > 70) {
            int currentRefreshRate = MetricsFpsSamplerImpl.getCurrentRefreshRate();
            this.normalFrameCostMillis = MILLIS_IN_SECOND / currentRefreshRate;
            this.normalFrameCostNanos = NANOS_IN_SECOND / f;
            this.accumulatedRefreshRate += currentRefreshRate;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            computeMetricOn31(frameMetrics, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            computeMetricOn26(frameMetrics, i);
            if (metric > this.longestFrameDuration) {
                this.longestFrameDuration = metric;
            }
        } else {
            computeMetricOn24(frameMetrics, i);
            if (metric > this.longestFrameDuration) {
                this.longestFrameDuration = metric;
            }
        }
    }

    @RequiresApi(api = 31)
    @SuppressLint({"WrongConstant"})
    private void computeMetricOn31(FrameMetrics frameMetrics, int i) {
        Object[] objArr = {frameMetrics, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7d52d38255fd1ffedf61f95ff1eb0e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7d52d38255fd1ffedf61f95ff1eb0e0");
            return;
        }
        long metric = frameMetrics.getMetric(8);
        long metric2 = frameMetrics.getMetric(11);
        long metric3 = frameMetrics.getMetric(10);
        if (metric > 1099511627776L) {
            this.fixFrameCount++;
            metric = (metric - frameMetrics.getMetric(12)) + this.gpuTimeOn31;
        } else if (this.gpuTimeOn31 == 0) {
            long metric4 = frameMetrics.getMetric(12);
            if (metric4 < 1073741824) {
                this.gpuTimeOn31 = metric4;
            }
        }
        long j = metric;
        if (j > this.longestFrameDuration) {
            this.longestFrameDuration = j;
        }
        if (j > frameMetrics.getMetric(13)) {
            this.jankFrameCount++;
        }
        computeMetrics(metric3, metric2, j, i);
    }

    @RequiresApi(api = 26)
    private void computeMetricOn26(FrameMetrics frameMetrics, int i) {
        Object[] objArr = {frameMetrics, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7befb3a84b282cb26725dbf9d8b297e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7befb3a84b282cb26725dbf9d8b297e2");
            return;
        }
        long metric = frameMetrics.getMetric(8);
        long metric2 = frameMetrics.getMetric(11);
        long metric3 = frameMetrics.getMetric(10);
        if ((((float) metric) / NANOS_IN_MILLIS) - this.normalFrameCostMillis > 0.01d) {
            this.jankFrameCount++;
        }
        computeMetrics(metric3, metric2, metric, i);
    }

    @RequiresApi(api = 24)
    private void computeMetricOn24(FrameMetrics frameMetrics, int i) {
        Object[] objArr = {frameMetrics, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46b79f54f95c3a1c3e8d9d989f8173a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46b79f54f95c3a1c3e8d9d989f8173a7");
            return;
        }
        long metric = frameMetrics.getMetric(8);
        float f = ((float) metric) / NANOS_IN_MILLIS;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (f - this.normalFrameCostMillis > 0.01d) {
            this.jankFrameCount++;
        }
        computeMetrics(elapsedRealtimeNanos - metric, this.endTimestamp, metric, i);
    }

    private void computeMetrics(long j, long j2, long j3, int i) {
        float f;
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e6d25f89e97c4b4b628b5288b548753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e6d25f89e97c4b4b628b5288b548753");
            return;
        }
        long j4 = j;
        do {
            j4 += this.normalFrameCostNanos;
            if (this.normalFrameCostNanos <= 0) {
                break;
            }
        } while (((float) ((j + j3) - j4)) > 7812.5f);
        if (this.startTimestamp == 0) {
            this.startTimestamp = j;
            f = ((float) j3) / NANOS_IN_MILLIS;
        } else if (i > 0 || ((float) (j - this.lastFrameStartTimestamp)) > 4.1666668E7f) {
            this.recordTime += this.endTimestamp - this.startTimestamp;
            this.secondDeadline -= this.endTimestamp - this.startTimestamp;
            f = ((float) j3) / NANOS_IN_MILLIS;
            this.startTimestamp = j;
        } else {
            f = ((float) (j4 - this.lastFrameEndVsyncTimestamp)) / NANOS_IN_MILLIS;
        }
        computeSlowTimeMetrics(f);
        this.lastFrameStartTimestamp = j2;
        this.lastFrameEndVsyncTimestamp = j4;
        this.endTimestamp = j + j3;
        if (this.endTimestamp - this.startTimestamp > this.secondDeadline) {
            if (this.frameCount - this.frameCountBySecond < this.minFps) {
                this.minFps = this.frameCount - this.frameCountBySecond;
            }
            this.frameCountBySecond = this.frameCount;
            this.secondDeadline += Math.round((float) NANOS_IN_SECOND);
        }
    }

    private void computeSlowTimeMetrics(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb43c7e7d1bb610476611f4c4f7b0de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb43c7e7d1bb610476611f4c4f7b0de4");
            return;
        }
        if (Double.compare(d, 700.0d) > 0) {
            this.freezeFrameCount++;
        }
        if (d > this.normalFrameCostMillis + 0.01d) {
            this.jankTotalTime += d - this.normalFrameCostMillis;
        }
        if (d > this.lastFrameWaitingTime) {
            double d2 = d - this.lastFrameWaitingTime;
            this.slowFrameTime += d2;
            if (d2 > 41.66666793823242d) {
                this.criticalSlowFrameTime += d2;
            }
        }
        if (d > 16.0d) {
            this.lastFrameWaitingTime = d;
        } else {
            this.lastFrameWaitingTime = this.normalFrameCostMillis;
        }
    }

    public void finishRecording() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4f0262d7b805a3b0e9cb2a50dc63063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4f0262d7b805a3b0e9cb2a50dc63063");
            return;
        }
        this.sampleUpdateEnabled = false;
        this.recordTime += this.endTimestamp - this.startTimestamp;
        if (this.recordTime != 0) {
            this.avgFps = (this.frameCount / this.recordTime) * 1.0E9d;
            this.slowTimeRatio = (this.slowFrameTime / this.recordTime) * 1000000.0d;
            this.criticalSlowTimeRatio = (this.criticalSlowFrameTime / this.recordTime) * 1000000.0d;
            this.scrollHitchRatio = (this.jankTotalTime / this.recordTime) * 1000000.0d;
        }
        if (this.frameCount != 0) {
            this.jankFrameRate = (this.jankFrameCount * 1.0f) / this.frameCount;
            this.freezeFrameRate = (this.freezeFrameCount * 1.0f) / this.frameCount;
        }
        if (this.minFps > this.avgFps) {
            this.minFps = this.avgFps;
        } else {
            this.minFps -= 1.0d;
        }
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getPageName() {
        return this.name;
    }

    @Override // com.meituan.metrics.sampler.AbstractSampleEvent, com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d1479dfde5bc661d8af7cac9fa26052", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d1479dfde5bc661d8af7cac9fa26052") : TextUtils.equals("page", this.type) ? Constants.FPS_PAGE_AVG : TextUtils.equals(Constants.FPS_TYPE_SCROLL, this.type) ? Constants.FPS_SCROLL_AVG : (!TextUtils.equals("custom", this.type) || TextUtils.isEmpty(this.name)) ? TextUtils.equals(Constants.FPS_TYPE_SCROLL_N, this.type) ? Constants.FPS_SCROLL_AVG_N : super.getEventType() : Constants.FPS_CUSTOM_AVG;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public double getMetricValue() {
        if (this.avgFps > this.maxFrameCount && this.maxFrameCount > 0) {
            this.avgFps = this.maxFrameCount;
        }
        return this.avgFps;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3481bb380a96cdb3e9ac0493213e7f0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3481bb380a96cdb3e9ac0493213e7f0b");
            return;
        }
        if (this.avgFps > this.maxFrameCount && this.maxFrameCount > 0) {
            this.avgFps = this.maxFrameCount;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (TextUtils.equals("page", this.type)) {
            jSONObject2.put("pageName", this.name);
            jSONArray.put(JSONUtils.buildLogUnit(Constants.FPS_PAGE_AVG, df.format(this.avgFps), jSONObject2, this.ts));
            jSONArray.put(JSONUtils.buildLogUnit(Constants.FPS_PAGE_MIN, df.format(this.minFps), jSONObject2, this.ts));
        } else if (TextUtils.equals(Constants.FPS_TYPE_SCROLL, this.type)) {
            jSONObject2.put("pageName", this.name);
            jSONArray.put(JSONUtils.buildLogUnit(Constants.FPS_SCROLL_AVG, df.format(this.avgFps), jSONObject2, this.ts));
            jSONArray.put(JSONUtils.buildLogUnit(Constants.FPS_SCROLL_MIN, df.format(this.minFps), jSONObject2, this.ts));
        } else if (TextUtils.equals("custom", this.type) && !TextUtils.isEmpty(this.name)) {
            jSONObject2.put("key", this.name);
            jSONArray.put(JSONUtils.buildLogUnit(Constants.FPS_CUSTOM_AVG, df.format(this.avgFps), jSONObject2, this.ts));
            jSONArray.put(JSONUtils.buildLogUnit(Constants.FPS_CUSTOM_MIN, df.format(this.minFps), jSONObject2, this.ts));
        } else if (TextUtils.equals(Constants.FPS_TYPE_SCROLL_N, this.type)) {
            jSONObject2.put("pageName", this.name);
            jSONArray.put(JSONUtils.buildLogUnit(Constants.FPS_SCROLL_AVG_N, df.format(this.avgFps), jSONObject2, this.ts));
        }
        jSONObject.put(Constants.METRICS, jSONArray);
    }
}
