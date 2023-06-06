package com.meituan.metrics.sampler.cpu;

import android.app.Activity;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.crashreporter.c;
import com.meituan.metrics.cache.MetricsCacheManager;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.config.MetricsLocalSwitchConfigManager;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.sampler.MetricsSampler;
import com.meituan.metrics.util.AppUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsCpuSampler implements MetricsSampler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ConcurrentHashMap<String, CpuEvent> customCpuEvents;
    private CpuEvent event;
    private double lastCpuUsage;
    private ProcessCpuEvent processEvent;
    private ICpuUsageProvider provider;
    private boolean statFileBroke;

    public MetricsCpuSampler(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26ac415c24af9bac7bd6fb7e86a129a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26ac415c24af9bac7bd6fb7e86a129a7");
            return;
        }
        this.statFileBroke = false;
        this.customCpuEvents = new ConcurrentHashMap<>();
        this.provider = CpuUsageProviderFactory.create();
        if (z) {
            enableProcessCpu();
        }
    }

    public void enableProcessCpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "370d61bd54677e81d903f92ef8fb33a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "370d61bd54677e81d903f92ef8fb33a2");
        } else if (this.processEvent == null) {
            this.processEvent = new ProcessCpuEvent(ProcessUtils.getCurrentProcessName());
            this.processEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        }
    }

    public void disableProcessCpu() {
        this.processEvent = null;
    }

    public ProcessCpuEvent getProcessEvent() {
        return this.processEvent;
    }

    public void resetProcessCpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7800f38b0a7e7d5e0ce2517cf0114b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7800f38b0a7e7d5e0ce2517cf0114b8");
        } else if (this.processEvent != null) {
            this.processEvent = new ProcessCpuEvent(ProcessUtils.getCurrentProcessName());
            this.processEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        }
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void pageEnter(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5e50d6176d0c885e4bc5fd306a7b101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5e50d6176d0c885e4bc5fd306a7b101");
            return;
        }
        String pageName = AppUtils.getPageName(activity, UserActionsProvider.getInstance().getLastResumeActivityName());
        boolean isCpuEnable = MetricsRemoteConfigManager.getInstance().isCpuEnable(pageName);
        if (!MetricsLocalSwitchConfigManager.getInstance().getCPUSw(pageName) || !isCpuEnable) {
            this.lastCpuUsage = 0.0d;
            this.event = null;
            return;
        }
        this.event = new CpuEvent(pageName);
        this.event.configFrom = 2;
        this.event.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        this.event.setPid(MetricsActivityLifecycleManager.getInstance().getPageSessionID());
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void pageExit(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2917590655890ee500e20d510027c3cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2917590655890ee500e20d510027c3cb");
        } else if (this.event == null || this.provider == null) {
        } else {
            this.event.optionTags = AppUtils.getCustomTags(activity, Constants.CPU);
            MetricsCacheManager.getInstance().addToCache(this.event);
            this.event = null;
        }
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void doSample() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b5523a328b2ea9a2e3931cb530a8960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b5523a328b2ea9a2e3931cb530a8960");
        } else if (!this.statFileBroke && this.provider != null) {
            if (this.event == null && this.processEvent == null && this.customCpuEvents.size() == 0) {
                return;
            }
            try {
                double cpuUsagePercent = this.provider.getCpuUsagePercent();
                if (cpuUsagePercent < 0.0d) {
                    this.statFileBroke = true;
                    return;
                }
                this.lastCpuUsage = cpuUsagePercent;
                if (this.event != null) {
                    this.event.computeAvg(this.lastCpuUsage);
                }
                if (this.processEvent != null) {
                    this.processEvent.computeAvg(this.lastCpuUsage);
                }
                if (this.customCpuEvents.size() > 0) {
                    for (CpuEvent cpuEvent : this.customCpuEvents.values()) {
                        cpuEvent.computeAvg(this.lastCpuUsage);
                    }
                }
            } catch (Throwable th) {
                if (th instanceof FileNotFoundException) {
                    this.statFileBroke = true;
                }
                c.a(th, 1, "metrics_cpu_sampler", false);
            }
        }
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public double getRealTimeValue() {
        return this.lastCpuUsage;
    }

    public void startCustomCpu(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e9f9bda899d6d76410a5c0f78e5c62a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e9f9bda899d6d76410a5c0f78e5c62a");
            return;
        }
        CpuEvent cpuEvent = new CpuEvent(str);
        cpuEvent.configFrom = 2;
        cpuEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        this.customCpuEvents.put(str, cpuEvent);
    }

    public void stopCustomCpu(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07018d22db084da1d24327dcbd8f7b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07018d22db084da1d24327dcbd8f7b67");
        } else if (this.customCpuEvents.containsKey(str)) {
            CpuEvent cpuEvent = this.customCpuEvents.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            cpuEvent.optionTags = map;
            MetricsCacheManager.getInstance().addToCache(cpuEvent);
            this.customCpuEvents.remove(str);
        }
    }
}
