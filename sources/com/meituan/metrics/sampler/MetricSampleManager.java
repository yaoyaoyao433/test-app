package com.meituan.metrics.sampler;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.CheckResult;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.config.MetricsLocalSwitchConfigManager;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.config.MetricsRemoteConfigV2;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.metrics.net.report.MetricsReportManager;
import com.meituan.metrics.sampler.SamplingHandler;
import com.meituan.metrics.sampler.cpu.MetricsCpuSampler;
import com.meituan.metrics.sampler.cpu.ProcessCpuEvent;
import com.meituan.metrics.sampler.fps.MetricsFpsSampler;
import com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl;
import com.meituan.metrics.sampler.memory.MetricsMemorySampler;
import com.meituan.metrics.sampler.memory.ProcessMemoryEvent;
import com.meituan.metrics.util.AppUtils;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricSampleManager implements AppBus.OnBackgroundUIListener, AppBus.OnForegroundUIListener, MetricsActivityLifecycleCallback, SamplingHandler.SamplingCallback {
    private static final String PROCESS_CPU = "process_cpu_";
    private static final String PROCESS_MEMORY = "process_memory_";
    public static final int SAMPLE_TIME_INTERVAL = 2;
    private static final long THIRTY_MIN_IN_MILLIS = 1800000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MetricSampleManager sInstance;
    private q cipStorageCenter;
    private MetricsCpuSampler cpuSampler;
    private MetricsFpsSampler fpsSampler;
    private Gson gson;
    private boolean initialized;
    private AtomicBoolean isPageEnterSampling;
    private boolean isProcessCpuEnable;
    private boolean isProcessMemoryEnable;
    private long lastProcessReportTime;
    private MetricsMemorySampler memorySampler;
    private RealTimeMonitor monitorImpl;
    private boolean realTimeMonitor;
    private MetricsFpsSampler rnSampler;
    private Collection<MetricsSampler> samplers;
    private SamplingHandler samplingHandler;

    @Deprecated
    public void interceptCustomTraffic(String str, long j, long j2) {
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public void onActivityStopped(Activity activity) {
    }

    public MetricSampleManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f09d1d357f97d04d905181627083ee41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f09d1d357f97d04d905181627083ee41");
            return;
        }
        this.isProcessCpuEnable = true;
        this.isProcessMemoryEnable = true;
        this.gson = new Gson();
        this.isPageEnterSampling = new AtomicBoolean(false);
        this.samplers = new ConcurrentLinkedQueue();
        Context context = Metrics.getInstance().getContext();
        if (context != null) {
            this.cipStorageCenter = q.a(context, "metrics_sampler", 2);
        }
    }

    public static MetricSampleManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a928ebe98c246998087d9fb3c1e509bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricSampleManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a928ebe98c246998087d9fb3c1e509bb");
        }
        if (sInstance == null) {
            synchronized (MetricSampleManager.class) {
                if (sInstance == null) {
                    sInstance = new MetricSampleManager();
                }
            }
        }
        return sInstance;
    }

    public void init(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "531832810548f72abda35380cd20b69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "531832810548f72abda35380cd20b69e");
        } else {
            start(z);
        }
    }

    public synchronized void start(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09b0e75cbe2d0bb911f74d064b4a75ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09b0e75cbe2d0bb911f74d064b4a75ae");
            return;
        }
        ILogger metricsLogger = Logger.getMetricsLogger();
        metricsLogger.d("MetricSampleManager start");
        if (this.samplingHandler == null) {
            this.samplingHandler = new SamplingHandler(ThreadManager.getInstance().getMetricsBgLooper(), this, 2L);
        }
        if (this.samplers == null) {
            this.samplers = new ConcurrentLinkedQueue();
        }
        if (z && MetricsRemoteConfigManager.getInstance().isFpsEnable()) {
            this.fpsSampler = new MetricsFpsSamplerImpl(this.samplingHandler);
            this.samplers.add(this.fpsSampler);
            metricsLogger.d("add MetricsFpsSampler");
        }
        MetricsRemoteConfigV2 remoteConfigV2 = MetricsRemoteConfigManager.getInstance().getRemoteConfigV2();
        this.isProcessMemoryEnable = this.isProcessMemoryEnable && remoteConfigV2.isProcessMemoryEnable(ProcessUtils.getCurrentProcessName());
        if (remoteConfigV2.isMemoryEnable() || this.isProcessMemoryEnable) {
            this.memorySampler = new MetricsMemorySampler(this.isProcessMemoryEnable);
            this.samplers.add(this.memorySampler);
            metricsLogger.d("add MetricsMemorySampler");
        }
        this.isProcessCpuEnable = this.isProcessCpuEnable && remoteConfigV2.isProcessCpuEnable(ProcessUtils.getCurrentProcessName());
        if (remoteConfigV2.isCpuEnable() || this.isProcessCpuEnable) {
            this.cpuSampler = new MetricsCpuSampler(this.isProcessCpuEnable);
            this.samplers.add(this.cpuSampler);
            metricsLogger.d("add MetricsCpuSampler");
        }
        if (this.samplers.size() > 0) {
            this.samplingHandler.startSampleTimerDelayed(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            MetricsActivityLifecycleManager.getInstance().register(this);
            AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
            AppBus.getInstance().register((AppBus.OnForegroundListener) this);
            activatePageEnterSampling();
        }
        if (this.isProcessMemoryEnable || this.isProcessCpuEnable) {
            checkLastProcessInfo();
            this.samplingHandler.startProcessTimer();
        }
        this.initialized = true;
        if (this.realTimeMonitor) {
            startRealTimeMonitor();
        }
    }

    public synchronized void addRNSample(MetricsFpsSampler metricsFpsSampler) {
        Object[] objArr = {metricsFpsSampler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dda2e97cd99bbf25efb6ffb01618cf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dda2e97cd99bbf25efb6ffb01618cf3");
        } else if (metricsFpsSampler == null) {
        } else {
            this.rnSampler = metricsFpsSampler;
            if (this.samplingHandler == null) {
                this.samplingHandler = new SamplingHandler(ThreadManager.getInstance().getMetricsBgLooper(), this, 2L);
            }
            if (this.samplers == null) {
                this.samplers = new ConcurrentLinkedQueue();
            }
            if (MetricsRemoteConfigManager.getInstance().isFpsCustomEnable() && Build.VERSION.SDK_INT >= 16) {
                this.samplers.add(metricsFpsSampler);
            }
            if (this.samplers.size() > 0) {
                this.samplingHandler.startSampleTimer();
                MetricsActivityLifecycleManager.getInstance().register(this);
                AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
                AppBus.getInstance().register((AppBus.OnForegroundListener) this);
                activatePageEnterSampling();
            }
        }
    }

    public void startRNCustomFPS(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "402cba07d912845b3e581b3edfdaa710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "402cba07d912845b3e581b3edfdaa710");
        } else if (!isFpsCustomEnable(str) || this.rnSampler == null) {
        } else {
            this.rnSampler.startCustomRecordFps(str);
        }
    }

    public void stopRNCustomFPS(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae4c619a211809e2d58c7f5b393a9eb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae4c619a211809e2d58c7f5b393a9eb8");
        } else if (!isFpsCustomEnable(str) || this.rnSampler == null) {
        } else {
            this.rnSampler.stopCustomRecordFps(str, null);
        }
    }

    public void startCustomFPS(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "104d66e0a41131347c61c286f9cac260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "104d66e0a41131347c61c286f9cac260");
        } else if (!isFpsCustomEnable(str) || this.fpsSampler == null) {
        } else {
            this.fpsSampler.startCustomRecordFps(str);
        }
    }

    public void stopCustomFPS(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33c31479c9209a847a7533f593745d57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33c31479c9209a847a7533f593745d57");
        } else {
            stopCustomFPS(str, null);
        }
    }

    public void stopCustomFPS(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee585cfcbbeff6ed296e971a54bb6715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee585cfcbbeff6ed296e971a54bb6715");
        } else if (!isFpsCustomEnable(str) || this.fpsSampler == null) {
        } else {
            this.fpsSampler.stopCustomRecordFps(str, map);
        }
    }

    public void startCustomScrollFPS(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2aced45725657be3c8b49bc6f610bfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2aced45725657be3c8b49bc6f610bfb");
        } else if (!isFpsScrollEnable(activity) || this.samplingHandler == null) {
        } else {
            this.samplingHandler.sendMessage(5, activity);
        }
    }

    public void stopCustomScrollFPS(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "155a9ac4d0a2f7c313163e5acfad0f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "155a9ac4d0a2f7c313163e5acfad0f97");
        } else if (!isFpsScrollEnable(activity) || this.samplingHandler == null) {
        } else {
            this.samplingHandler.sendMessage(6, activity);
        }
    }

    public void setScrollEntityCustom(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab660fe6f3b4bbe228df278f1207e572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab660fe6f3b4bbe228df278f1207e572");
        } else if (!isFpsScrollEnable(activity) || this.samplingHandler == null) {
        } else {
            this.samplingHandler.sendMessage(7, activity);
        }
    }

    public boolean isPageScrolling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbdbdf351163a221f34e7ee65cc087d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbdbdf351163a221f34e7ee65cc087d1")).booleanValue() : (this.fpsSampler instanceof MetricsFpsSamplerImpl) && ((MetricsFpsSamplerImpl) this.fpsSampler).isScrolling();
    }

    private boolean isFpsCustomEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3a15da6e06091bf16e71e701d2a3ff7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3a15da6e06091bf16e71e701d2a3ff7")).booleanValue() : MetricsRemoteConfigManager.getInstance().isFpsCustomEnable(str);
    }

    private boolean isFpsScrollEnable(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf4b9f0e59926fd705de3fd6d1ff01c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf4b9f0e59926fd705de3fd6d1ff01c3")).booleanValue() : MetricsRemoteConfigManager.getInstance().isFpsScrollEnable(AppUtils.getPageName(activity, UserActionsProvider.getInstance().getLastResumeActivityName()));
    }

    public void changeToFragment(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "259578bf9e5ee399b12ac625b33687f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "259578bf9e5ee399b12ac625b33687f0");
        } else if (obj == null || this.fpsSampler == null || this.samplingHandler == null) {
        } else {
            this.samplingHandler.sendMessage(8, obj);
        }
    }

    public void startProcessCpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fa613059ef1ccd13d8f2c5a3eb2b66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fa613059ef1ccd13d8f2c5a3eb2b66b");
        } else if (this.cpuSampler == null || !MetricsRemoteConfigManager.getInstance().getRemoteConfigV2().isProcessCpuEnable(ProcessUtils.getCurrentProcessName())) {
        } else {
            this.cpuSampler.enableProcessCpu();
            this.isProcessCpuEnable = true;
            if (this.isProcessMemoryEnable) {
                return;
            }
            this.samplingHandler.startProcessTimer();
        }
    }

    public void stopProcessCpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "853de6d9a20e79769a31d723e48c2d79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "853de6d9a20e79769a31d723e48c2d79");
            return;
        }
        if (this.cpuSampler != null) {
            this.cpuSampler.disableProcessCpu();
            this.isProcessCpuEnable = false;
        }
        if (this.isProcessCpuEnable || this.isProcessMemoryEnable || this.samplingHandler == null) {
            return;
        }
        this.samplingHandler.stopProcessTimer();
    }

    public void startProcessMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b60fe9723aa3c9f8d7d0b184f171504d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b60fe9723aa3c9f8d7d0b184f171504d");
        } else if (this.memorySampler == null || !MetricsRemoteConfigManager.getInstance().getRemoteConfigV2().isProcessMemoryEnable(ProcessUtils.getCurrentProcessName())) {
        } else {
            this.memorySampler.enableProcessMemory();
            this.isProcessMemoryEnable = true;
            if (this.isProcessCpuEnable) {
                return;
            }
            this.samplingHandler.startProcessTimer();
        }
    }

    public void stopProcessMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07229f754312e913f2602bb77ad0d521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07229f754312e913f2602bb77ad0d521");
            return;
        }
        if (this.memorySampler != null) {
            this.memorySampler.disableProcessMemory();
            this.isProcessMemoryEnable = false;
        }
        if (this.isProcessCpuEnable || this.isProcessMemoryEnable || this.samplingHandler == null) {
            return;
        }
        this.samplingHandler.stopProcessTimer();
    }

    @Override // com.meituan.metrics.sampler.SamplingHandler.SamplingCallback
    public void onSamplingEvent(int i, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c81fc2280f4c9ad0079b356db949bc19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c81fc2280f4c9ad0079b356db949bc19");
        } else if (i == 1) {
            if (this.samplers == null || this.samplers.size() <= 0) {
                return;
            }
            for (MetricsSampler metricsSampler : this.samplers) {
                metricsSampler.doSample();
            }
            if (this.monitorImpl == null || this.samplers == null) {
                return;
            }
            for (MetricsSampler metricsSampler2 : this.samplers) {
                if (metricsSampler2 instanceof MetricsCpuSampler) {
                    this.monitorImpl.onCpu(metricsSampler2.getRealTimeValue());
                } else if (metricsSampler2 instanceof MetricsFpsSampler) {
                    this.monitorImpl.onFPS(metricsSampler2.getRealTimeValue());
                } else if (metricsSampler2 instanceof MetricsMemorySampler) {
                    this.monitorImpl.onMemory(metricsSampler2.getRealTimeValue());
                }
            }
        } else if (i == 2) {
            if (this.fpsSampler != null) {
                this.fpsSampler.doSample();
            }
        } else {
            ProcessCpuEvent processCpuEvent = null;
            r1 = null;
            r1 = null;
            Activity activity = null;
            r1 = null;
            r1 = null;
            Activity activity2 = null;
            r1 = null;
            r1 = null;
            Activity activity3 = null;
            r1 = null;
            r1 = null;
            Activity activity4 = null;
            r1 = null;
            r1 = null;
            Activity activity5 = null;
            processCpuEvent = null;
            if (i == 3) {
                if (this.samplers == null || this.samplers.size() <= 0) {
                    return;
                }
                if (objArr != null && objArr.length == 1 && (objArr[0] instanceof Activity)) {
                    activity = (Activity) objArr[0];
                }
                for (MetricsSampler metricsSampler3 : this.samplers) {
                    metricsSampler3.pageEnter(activity);
                    metricsSampler3.doSample();
                }
            } else if (i == 4) {
                if (this.samplers == null || this.samplers.size() <= 0) {
                    return;
                }
                if (objArr != null && objArr.length == 1 && (objArr[0] instanceof Activity)) {
                    activity2 = (Activity) objArr[0];
                }
                for (MetricsSampler metricsSampler4 : this.samplers) {
                    metricsSampler4.pageExit(activity2);
                }
            } else if (i == 5) {
                if (this.fpsSampler instanceof MetricsFpsSamplerImpl) {
                    if (objArr != null && objArr.length == 1 && (objArr[0] instanceof Activity)) {
                        activity3 = (Activity) objArr[0];
                    }
                    if (activity3 == null || !isFpsScrollEnable(activity3)) {
                        return;
                    }
                    ((MetricsFpsSamplerImpl) this.fpsSampler).startCustomScrollFPS(activity3);
                }
            } else if (i == 6) {
                if (this.fpsSampler instanceof MetricsFpsSamplerImpl) {
                    if (objArr != null && objArr.length == 1 && (objArr[0] instanceof Activity)) {
                        activity4 = (Activity) objArr[0];
                    }
                    if (activity4 == null || !isFpsScrollEnable(activity4)) {
                        return;
                    }
                    ((MetricsFpsSamplerImpl) this.fpsSampler).stopCustomScrollFPS(activity4);
                }
            } else if (i == 7) {
                if (this.fpsSampler instanceof MetricsFpsSamplerImpl) {
                    if (objArr != null && objArr.length == 1 && (objArr[0] instanceof Activity)) {
                        activity5 = (Activity) objArr[0];
                    }
                    if (activity5 != null) {
                        ((MetricsFpsSamplerImpl) this.fpsSampler).setScrollEntityCustom(activity5);
                    }
                }
            } else if (i != 8) {
                if (i == 9) {
                    ProcessMemoryEvent processEvent = (!this.isProcessMemoryEnable || this.memorySampler == null) ? null : this.memorySampler.getProcessEvent();
                    if (this.isProcessCpuEnable && this.cpuSampler != null) {
                        processCpuEvent = this.cpuSampler.getProcessEvent();
                    }
                    reportOrStoreProcessEvent(processCpuEvent, processEvent, false);
                }
            } else if (objArr != null && objArr.length == 1 && objArr[0] != null) {
                Object obj = objArr[0];
                if (this.fpsSampler != null) {
                    this.fpsSampler.changeToFragment(obj);
                }
            }
        }
    }

    private void checkLastProcessInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1e66b672ffede9917bfa6a24a10cb90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1e66b672ffede9917bfa6a24a10cb90");
        } else if (this.cipStorageCenter == null) {
        } else {
            try {
                String b = this.cipStorageCenter.b(getProcessKey(PROCESS_MEMORY), (String) null);
                String b2 = this.cipStorageCenter.b(getProcessKey(PROCESS_CPU), (String) null);
                ProcessMemoryEvent processMemoryEvent = !TextUtils.isEmpty(b) ? (ProcessMemoryEvent) this.gson.fromJson(b, (Class<Object>) ProcessMemoryEvent.class) : null;
                ProcessCpuEvent processCpuEvent = TextUtils.isEmpty(b2) ? null : (ProcessCpuEvent) this.gson.fromJson(b2, (Class<Object>) ProcessCpuEvent.class);
                Logger.getMetricsLogger().d("checkLastProcessInfo", processCpuEvent, processMemoryEvent);
                reportOrStoreProcessEvent(processCpuEvent, processMemoryEvent, true);
                this.lastProcessReportTime = TimeUtil.elapsedTimeMillis();
            } catch (Exception unused) {
            }
        }
    }

    private void reportOrStoreProcessEvent(AbstractEvent abstractEvent, AbstractEvent abstractEvent2, boolean z) {
        Object[] objArr = {abstractEvent, abstractEvent2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d5af4442dfbb11b6f7d9b438253cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d5af4442dfbb11b6f7d9b438253cd1");
        } else if (abstractEvent == null && abstractEvent2 == null) {
        } else {
            long elapsedTimeMillis = TimeUtil.elapsedTimeMillis();
            if (elapsedTimeMillis - this.lastProcessReportTime >= 1800000) {
                Logger.getMetricsLogger().d("reportProcessEvent", abstractEvent, abstractEvent2);
                if (abstractEvent != null) {
                    MetricsReportManager.getInstance().reportByBabel(abstractEvent);
                    this.cipStorageCenter.b(getProcessKey(PROCESS_CPU));
                    if (!z && this.cpuSampler != null) {
                        this.cpuSampler.resetProcessCpu();
                    }
                }
                if (abstractEvent2 != null) {
                    MetricsReportManager.getInstance().reportByBabel(abstractEvent2);
                    this.cipStorageCenter.b(getProcessKey(PROCESS_MEMORY));
                    if (!z && this.memorySampler != null) {
                        this.memorySampler.resetProcessMemory();
                    }
                }
                this.lastProcessReportTime = elapsedTimeMillis;
            } else if (this.cipStorageCenter != null) {
                Logger.getMetricsLogger().d("storeProcessEvent", abstractEvent, abstractEvent2);
                if (abstractEvent != null) {
                    this.cipStorageCenter.a(getProcessKey(PROCESS_CPU), this.gson.toJson(abstractEvent));
                }
                if (abstractEvent2 != null) {
                    this.cipStorageCenter.a(getProcessKey(PROCESS_MEMORY), this.gson.toJson(abstractEvent2));
                }
            }
        }
    }

    private String getProcessKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f8d21a869cd655b8a3d7a0470e71e46", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f8d21a869cd655b8a3d7a0470e71e46");
        }
        return str + ProcessUtils.getCurrentProcessName();
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public void onActivityCreated(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8090705c151a33d9523120814b2c9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8090705c151a33d9523120814b2c9d7");
        } else if (MetricsLocalSwitchConfigManager.getInstance().getLocalSwitchConfig(AppUtils.getPageName(activity)).getSampleSw()) {
            startSample();
        } else if (this.isProcessCpuEnable || this.isProcessMemoryEnable) {
        } else {
            stopSample();
        }
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc9162f771085b2e0e6bd2f6988677cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc9162f771085b2e0e6bd2f6988677cc");
        } else if (this.samplingHandler != null) {
            this.samplingHandler.sendMessage(3, activity);
            this.isPageEnterSampling.compareAndSet(false, true);
        }
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f13889e8035fda61f922e91ee7ea12c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f13889e8035fda61f922e91ee7ea12c2");
        } else if (this.samplingHandler != null) {
            this.samplingHandler.sendMessage(4, activity);
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4f57afb22bce36ac5e66a1cb7fe0dc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4f57afb22bce36ac5e66a1cb7fe0dc8");
            return;
        }
        if (this.samplingHandler != null && !this.isProcessCpuEnable && !this.isProcessMemoryEnable) {
            this.samplingHandler.stopSampleTimer();
        }
        if (this.fpsSampler instanceof MetricsFpsSamplerImpl) {
            ((MetricsFpsSamplerImpl) this.fpsSampler).reset();
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
    public void onForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdf7b3339c76c488c90665c540c181be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdf7b3339c76c488c90665c540c181be");
        } else if (this.samplingHandler == null || this.samplers == null || this.samplers.size() <= 0) {
        } else {
            this.samplingHandler.startSampleTimer();
        }
    }

    public void enableRealTimeMonitor(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "291aa6c80d3f3cd89d11a35255cb166e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "291aa6c80d3f3cd89d11a35255cb166e");
            return;
        }
        this.realTimeMonitor = z;
        if (z && this.initialized) {
            startRealTimeMonitor();
        }
        if (z || this.monitorImpl == null) {
            return;
        }
        this.monitorImpl.destroy();
        this.monitorImpl = null;
    }

    private void startRealTimeMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13c788fa81c62fbc8a608ead4250f7e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13c788fa81c62fbc8a608ead4250f7e9");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.metrics.sampler.MetricSampleManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4aa974182b56fc1c429e5610ac7489c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4aa974182b56fc1c429e5610ac7489c6");
                    } else if (MetricSampleManager.this.monitorImpl != null) {
                    } else {
                        Context context = Metrics.getInstance().getContext();
                        try {
                            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.meituan.metrics.sampler.RealTimeMonitor");
                            if (TextUtils.isEmpty(string)) {
                                throw new RuntimeException("Metrics can't find the implementation class of com.meituan.metrics.sampler.RealTimeMonitor in meta-data, please add dependency com.meituan.metrics:realtime-monitor:4.7.24.2-waimai or put your own implementation in AndroidManifest.xml");
                            }
                            MetricSampleManager.this.monitorImpl = (RealTimeMonitor) Class.forName(string).newInstance();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public void startSample() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10588237d536b26188dc4b27f9b5fb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10588237d536b26188dc4b27f9b5fb28");
        } else if (this.samplingHandler == null || this.samplers == null || this.samplers.size() <= 0) {
        } else {
            this.samplingHandler.startSampleTimer();
        }
    }

    public void stopSample() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "919b23ae34b47b5eee99ccf29cadedbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "919b23ae34b47b5eee99ccf29cadedbc");
        } else if (this.samplingHandler != null) {
            this.samplingHandler.stopSampleTimer();
        }
    }

    public void startCustomCpu(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae0821b839802800e98acd68d371fd7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae0821b839802800e98acd68d371fd7d");
            return;
        }
        String str2 = "custom_" + str;
        if (this.cpuSampler == null || !MetricsRemoteConfigManager.getInstance().isCpuEnable(str2)) {
            return;
        }
        this.cpuSampler.startCustomCpu(str2);
    }

    public void stopCustomCpu(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc4e48ef940cae241369b4866aa0c8ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc4e48ef940cae241369b4866aa0c8ef");
            return;
        }
        String str2 = "custom_" + str;
        if (this.cpuSampler == null || !MetricsRemoteConfigManager.getInstance().isCpuEnable(str2)) {
            return;
        }
        this.cpuSampler.stopCustomCpu(str2, map);
    }

    public void startCustomMemory(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43c167b23b1bda5c9db37220b08e726f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43c167b23b1bda5c9db37220b08e726f");
            return;
        }
        String str2 = "custom_" + str;
        if (this.memorySampler == null || !MetricsRemoteConfigManager.getInstance().getRemoteConfigV2().isMemoryEnable(str2)) {
            return;
        }
        this.memorySampler.startCustomMemory(str2);
    }

    public void stopCustomMemory(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8cd20f7b1785860162d886bf2c2476b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8cd20f7b1785860162d886bf2c2476b");
            return;
        }
        String str2 = "custom_" + str;
        if (this.memorySampler == null || !MetricsRemoteConfigManager.getInstance().getRemoteConfigV2().isMemoryEnable(str2)) {
            return;
        }
        this.memorySampler.stopCustomMemory(str2, map);
    }

    @CheckResult
    @Nullable
    @Deprecated
    public BasicTrafficUnit getTodayTotalTraffic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6a0c92d0894402cc8ff411be519ef2e", RobustBitConfig.DEFAULT_VALUE) ? (BasicTrafficUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6a0c92d0894402cc8ff411be519ef2e") : new BasicTrafficUnit();
    }

    private void activatePageEnterSampling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de0d3a79b5afa202cee809fb510e6607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de0d3a79b5afa202cee809fb510e6607");
            return;
        }
        Activity lastResumeActivity = UserActionsProvider.getInstance().getLastResumeActivity();
        if (lastResumeActivity == null || this.samplingHandler == null || this.isPageEnterSampling.get()) {
            return;
        }
        this.samplingHandler.sendMessage(3, lastResumeActivity);
        this.isPageEnterSampling.compareAndSet(false, true);
    }
}
