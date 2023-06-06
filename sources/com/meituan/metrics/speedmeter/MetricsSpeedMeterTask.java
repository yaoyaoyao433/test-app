package com.meituan.metrics.speedmeter;

import android.app.Activity;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Environment;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.cache.MetricsCacheManager;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.metrics.util.thread.Task;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsSpeedMeterTask {
    public static final String LUNCH_TYPE = "launch_type";
    public static final String STARTUP_ADVERT = "advert";
    public static final int STARTUP_FIRST = 1;
    public static final int STARTUP_HAS_ADVERT = 1;
    public static final String STARTUP_IF_FIRST = "is_first";
    public static final int STARTUP_NOT_FIRST = 0;
    public static final int STARTUP_NO_ADVERT = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, MetricsSpeedMeterTask> customSpeedMeterTaskMap = new ConcurrentHashMap();
    private int advert;
    private final String id;
    private boolean isInvokeReport;
    private String lunchType;
    private long mLastStepDuration;
    private final Map<String, Long> mMiddleSteps;
    private final long mStartTime;
    private int pid;
    private String sid;
    private final int speedMeterType;
    private int startupIfFirst;

    public MetricsSpeedMeterTask(int i, String str) {
        this(i, str, TimeUtil.elapsedTimeMillis());
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0892060c6dac2f414938c69096d6c78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0892060c6dac2f414938c69096d6c78");
        }
    }

    public MetricsSpeedMeterTask(int i, String str, long j) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34b2fc3fda7fd53d8b93624b6af6c049", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34b2fc3fda7fd53d8b93624b6af6c049");
            return;
        }
        this.mMiddleSteps = new ConcurrentHashMap(10);
        this.startupIfFirst = -1;
        this.advert = -1;
        this.pid = -1;
        this.speedMeterType = i;
        this.mStartTime = j;
        this.id = str;
        if (i != 1 && TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("meterTaskId不能为空，页面和自定义测速必须指定名称");
        }
    }

    public static MetricsSpeedMeterTask createLaunchSpeedMeterTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8153beb020690ad13316263dbdd32446", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8153beb020690ad13316263dbdd32446") : new MetricsSpeedMeterTask(1, null, TimeUtil.processStartElapsedTimeMillis());
    }

    public static MetricsSpeedMeterTask createLaunchSpeedMeterTask(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3593458a2ce471b8d86b1c66a91216d8", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3593458a2ce471b8d86b1c66a91216d8") : new MetricsSpeedMeterTask(1, null, j);
    }

    public static MetricsSpeedMeterTask createCustomSpeedMeterTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3336338ef874720f4a8bc341f3dee4c0", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3336338ef874720f4a8bc341f3dee4c0") : new MetricsSpeedMeterTask(3, str);
    }

    public static MetricsSpeedMeterTask createPageSpeedMeterTask(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c6bb32ad9814887db8b72fdbe59fbce", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c6bb32ad9814887db8b72fdbe59fbce") : _createPageSpeedMeterTask(activity);
    }

    public static MetricsSpeedMeterTask createPageSpeedMeterTask(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "227e99172d90e6f2c886e00a3d5da5b4", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "227e99172d90e6f2c886e00a3d5da5b4") : _createPageSpeedMeterTask(fragment);
    }

    public static MetricsSpeedMeterTask createPageSpeedMeterTask(android.app.Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dc3796762ed00e92a26c508baf5284f", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dc3796762ed00e92a26c508baf5284f") : _createPageSpeedMeterTask(fragment);
    }

    public static MetricsSpeedMeterTask createPageSpeedMeterTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57d1285fc75eca4a2aa73b3d7d382a4d", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57d1285fc75eca4a2aa73b3d7d382a4d") : new MetricsSpeedMeterTask(2, str);
    }

    public static MetricsSpeedMeterTask createPageSpeedMeterTask(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e82ca0e74ac87b0eea1b824ef3a1d9ab", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e82ca0e74ac87b0eea1b824ef3a1d9ab") : new MetricsSpeedMeterTask(2, str, j);
    }

    private static MetricsSpeedMeterTask _createPageSpeedMeterTask(Object obj) {
        return createPageSpeedMeterTask(obj.getClass().getName());
    }

    public static MetricsSpeedMeterTask createCustomSpeedMeterTask(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a111b16117e939d0fa14870f794d5da", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a111b16117e939d0fa14870f794d5da") : new MetricsSpeedMeterTask(3, str, j);
    }

    public static MetricsSpeedMeterTask createPageSpeedMeterTask(Activity activity, long j) {
        Object[] objArr = {activity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0aa6c2681e2ca2bf7543021377f7863", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0aa6c2681e2ca2bf7543021377f7863") : new MetricsSpeedMeterTask(2, activity.getClass().getName(), j);
    }

    public static MetricsSpeedMeterTask createPageSpeedMeterTask(android.app.Fragment fragment, long j) {
        Object[] objArr = {fragment, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6fc06eef3e4032a66e4cf62811e0768", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6fc06eef3e4032a66e4cf62811e0768") : new MetricsSpeedMeterTask(2, fragment.getClass().getName(), j);
    }

    public static MetricsSpeedMeterTask createPageSpeedMeterTask(Fragment fragment, long j) {
        Object[] objArr = {fragment, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4cdfa83b522832a8697a3fba38de7dc", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4cdfa83b522832a8697a3fba38de7dc") : new MetricsSpeedMeterTask(2, fragment.getClass().getName(), j);
    }

    public static MetricsSpeedMeterTask createCustomSpeedMeterTask(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47bfc27094c8bf4361a9ea987e5213fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47bfc27094c8bf4361a9ea987e5213fd");
        }
        MetricsSpeedMeterTask metricsSpeedMeterTask = new MetricsSpeedMeterTask(3, str);
        if (z) {
            customSpeedMeterTaskMap.put(str, metricsSpeedMeterTask);
        }
        return metricsSpeedMeterTask;
    }

    public static MetricsSpeedMeterTask getCustomSpeedMeterTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "859603a407ef13e46218ecf45c19e4e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "859603a407ef13e46218ecf45c19e4e7");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return customSpeedMeterTaskMap.get(str);
    }

    public static MetricsSpeedMeterTask removeCustomSpeedMeterTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64a84bd1b7ea804bcc03fd03c153155c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64a84bd1b7ea804bcc03fd03c153155c");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return customSpeedMeterTaskMap.remove(str);
    }

    public static MetricsSpeedMeterTask recordCustomTaskStep(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76efe1642b9cb00fcb3214245290caa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76efe1642b9cb00fcb3214245290caa3");
        }
        MetricsSpeedMeterTask customSpeedMeterTask = getCustomSpeedMeterTask(str);
        if (customSpeedMeterTask != null) {
            if (j > 0) {
                customSpeedMeterTask.recordStep(str2, j);
            } else {
                customSpeedMeterTask.recordStep(str2);
            }
        }
        return customSpeedMeterTask;
    }

    public static MetricsSpeedMeterTask recordCustomTaskStep(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6cbe91d9f1a181dde992a29b96ead199", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6cbe91d9f1a181dde992a29b96ead199") : recordCustomTaskStep(str, str2, -1L);
    }

    public static void disableCustomTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5cef54a4c735e43f37040bea713ef481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5cef54a4c735e43f37040bea713ef481");
            return;
        }
        MetricsSpeedMeterTask customSpeedMeterTask = getCustomSpeedMeterTask(str);
        if (customSpeedMeterTask != null) {
            customSpeedMeterTask.disable();
        }
    }

    public static void reportCustomTask(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c15af544ac01765fee2c8b9954cf8db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c15af544ac01765fee2c8b9954cf8db0");
            return;
        }
        MetricsSpeedMeterTask customSpeedMeterTask = getCustomSpeedMeterTask(str);
        if (customSpeedMeterTask != null) {
            h.a(customSpeedMeterTask, map, str2);
            removeCustomSpeedMeterTask(str);
        }
    }

    public MetricsSpeedMeterTask recordStep(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0569d1d8124940764b37020a8bfbf78", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0569d1d8124940764b37020a8bfbf78");
        }
        if (this.isInvokeReport || this.mStartTime <= 0) {
            return this;
        }
        addStep(str, TimeUtil.elapsedTimeMillis() - this.mStartTime);
        return this;
    }

    public MetricsSpeedMeterTask recordStepUseDefined(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66fb156a3ec1ca29262af7c3fbb5677f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66fb156a3ec1ca29262af7c3fbb5677f");
        }
        if (this.isInvokeReport || this.mStartTime <= 0 || j < this.mStartTime) {
            return this;
        }
        addStep(str, j - this.mStartTime);
        return this;
    }

    public MetricsSpeedMeterTask recordStep(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b1dc5102f5cb0f0ae9244888d44427c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b1dc5102f5cb0f0ae9244888d44427c");
        }
        if (this.isInvokeReport || this.mStartTime <= 0) {
            return this;
        }
        long elapsedTimeMillis = TimeUtil.elapsedTimeMillis() - this.mStartTime;
        if (elapsedTimeMillis < j) {
            addStep(str, elapsedTimeMillis);
        }
        return this;
    }

    private void addStep(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e09f9e9f95db5152aa9bde2b78bbc073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e09f9e9f95db5152aa9bde2b78bbc073");
        } else if (j < 0) {
            disable();
        } else {
            if (TextUtils.isEmpty(this.sid)) {
                if (this.speedMeterType == 2 && this.pid == -1) {
                    this.pid = MetricsActivityLifecycleManager.getInstance().getPageSessionID();
                }
                this.sid = MetricsActivityLifecycleManager.getInstance().getLaunchSessionID();
            }
            this.mMiddleSteps.put(str, Long.valueOf(j));
            this.mLastStepDuration = j;
        }
    }

    public void setStartupIfFirst(int i) {
        this.startupIfFirst = i;
    }

    public void setStartupLunchType(String str) {
        this.lunchType = str;
    }

    public void setStartupAdvert(int i) {
        this.advert = i;
    }

    public void disable() {
        this.isInvokeReport = true;
    }

    public void report() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f5a6043d3dca98784b1c47e535c7970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f5a6043d3dca98784b1c47e535c7970");
        } else {
            h.a(this, null, null);
        }
    }

    public void report(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e248e011814d1fec266e67fa30b1353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e248e011814d1fec266e67fa30b1353");
        } else {
            h.a(this, map, null);
        }
    }

    public void report(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16922fcf9095f62fba2027a88c8f3f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16922fcf9095f62fba2027a88c8f3f30");
            return;
        }
        Logger.getMetricsLogger().d("MetricsSpeedMeterTask report id", this.id, "report ifDisable", Boolean.valueOf(this.isInvokeReport), "tags:", map, "raw:", str);
        if (this.isInvokeReport) {
            return;
        }
        this.isInvokeReport = true;
        ThreadManager.getInstance().postIO(new SpeedReportTask(map, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportForConfigNew(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43b37c70a88261070c0d4ec435b9716f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43b37c70a88261070c0d4ec435b9716f");
            return;
        }
        Logger.getMetricsLogger().d(this.id, Integer.valueOf(this.speedMeterType), "reportForConfigNew");
        MetricsCacheManager metricsCacheManager = MetricsCacheManager.getInstance();
        SpeedMeterEvent speedMeterEvent = new SpeedMeterEvent("total", this.mLastStepDuration, this.mMiddleSteps, this.speedMeterType, this.id);
        speedMeterEvent.configFrom = 2;
        speedMeterEvent.optionTags = map;
        speedMeterEvent.raw = str;
        speedMeterEvent.setPid(this.pid);
        speedMeterEvent.setSid(this.sid);
        metricsCacheManager.addToCache(speedMeterEvent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class SpeedReportTask extends Task {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String raw;
        public Map<String, Object> tags;

        public SpeedReportTask(Map<String, Object> map, String str) {
            Object[] objArr = {MetricsSpeedMeterTask.this, map, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f22c56b7a8a5af553dd5434c1bb9ec47", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f22c56b7a8a5af553dd5434c1bb9ec47");
                return;
            }
            this.tags = map;
            this.raw = str;
        }

        @Override // com.meituan.metrics.util.thread.Task
        public void schedule() {
            Environment environment;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f30e7be6351c2747d76a79cfe7eafde", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f30e7be6351c2747d76a79cfe7eafde");
                return;
            }
            MetricsRemoteConfigManager metricsRemoteConfigManager = MetricsRemoteConfigManager.getInstance();
            if (MetricsSpeedMeterTask.this.speedMeterType != 2 || metricsRemoteConfigManager.getLoadPageConfig(MetricsSpeedMeterTask.this.id)) {
                if (MetricsSpeedMeterTask.this.speedMeterType != 3 || metricsRemoteConfigManager.getLoadCustomConfig(MetricsSpeedMeterTask.this.id)) {
                    if (MetricsSpeedMeterTask.this.speedMeterType != 1) {
                        if (MetricsSpeedMeterTask.this.mStartTime <= 0 || MetricsSpeedMeterTask.this.speedMeterType != 3) {
                            if (MetricsSpeedMeterTask.this.mStartTime > 0) {
                                MetricsSpeedMeterTask.this.reportForConfigNew(this.tags, this.raw);
                                return;
                            }
                            return;
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime() - TimeUtil.processStartElapsedTimeMillis();
                        if (elapsedRealtime > MetricsAnrManager.ANR_THRESHOLD) {
                            MetricsSpeedMeterTask.this.reportForConfigNew(this.tags, this.raw);
                        } else {
                            c.c("metrics-custom").schedule(new ScheduleRunnableDelegate(new Runnable() { // from class: com.meituan.metrics.speedmeter.MetricsSpeedMeterTask.SpeedReportTask.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "751d2541a4d29b5fb3f259a6119a8759", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "751d2541a4d29b5fb3f259a6119a8759");
                                    } else {
                                        MetricsSpeedMeterTask.this.reportForConfigNew(SpeedReportTask.this.tags, SpeedReportTask.this.raw);
                                    }
                                }
                            }), Math.max(MetricsAnrManager.ANR_THRESHOLD - elapsedRealtime, 100L), TimeUnit.MILLISECONDS);
                        }
                    } else if (metricsRemoteConfigManager.isAppStartupEnable() && (environment = Metrics.getEnvironment()) != null) {
                        if (this.tags == null) {
                            this.tags = new HashMap();
                        }
                        if (!this.tags.containsKey(MetricsSpeedMeterTask.STARTUP_IF_FIRST)) {
                            if (MetricsSpeedMeterTask.this.startupIfFirst >= 0) {
                                this.tags.put(MetricsSpeedMeterTask.STARTUP_IF_FIRST, Integer.valueOf(MetricsSpeedMeterTask.this.startupIfFirst));
                            } else {
                                this.tags.put(MetricsSpeedMeterTask.STARTUP_IF_FIRST, Integer.valueOf(environment.isFirstStartup() ? 1 : 0));
                            }
                        }
                        if (!TextUtils.isEmpty(MetricsSpeedMeterTask.this.lunchType) && !this.tags.containsKey(MetricsSpeedMeterTask.LUNCH_TYPE)) {
                            this.tags.put(MetricsSpeedMeterTask.LUNCH_TYPE, MetricsSpeedMeterTask.this.lunchType);
                        }
                        if (MetricsSpeedMeterTask.this.advert >= 0 && !this.tags.containsKey(MetricsSpeedMeterTask.STARTUP_ADVERT)) {
                            this.tags.put(MetricsSpeedMeterTask.STARTUP_ADVERT, Integer.valueOf(MetricsSpeedMeterTask.this.advert));
                        }
                        if (MetricsSpeedMeterTask.this.mStartTime > 0) {
                            MetricsSpeedMeterTask.this.reportForConfigNew(this.tags, this.raw);
                        }
                    }
                }
            }
        }
    }
}
