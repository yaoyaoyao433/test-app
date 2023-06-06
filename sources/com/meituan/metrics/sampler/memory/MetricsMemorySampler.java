package com.meituan.metrics.sampler.memory;

import android.app.Activity;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsMemorySampler implements MetricsSampler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ConcurrentHashMap<String, MemoryEvent> customMemoryEvents;
    private int dalvikMax;
    private MemoryEvent event;
    private long lastSampleTime;
    private ProcessMemoryEvent processEvent;
    private long usedMem;

    public MetricsMemorySampler(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8940c763cae269cd184f697c81126c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8940c763cae269cd184f697c81126c3");
            return;
        }
        this.customMemoryEvents = new ConcurrentHashMap<>();
        this.dalvikMax = (int) (Runtime.getRuntime().maxMemory() >> 10);
        if (z) {
            enableProcessMemory();
        }
    }

    public void enableProcessMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1df9cfc2fa39122d2bd1eeeb98ed4b79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1df9cfc2fa39122d2bd1eeeb98ed4b79");
        } else if (this.processEvent == null) {
            this.processEvent = new ProcessMemoryEvent(this.dalvikMax);
            this.processEvent.setProcessName(ProcessUtils.getCurrentProcessName());
            this.processEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        }
    }

    public void disableProcessMemory() {
        this.processEvent = null;
    }

    public ProcessMemoryEvent getProcessEvent() {
        return this.processEvent;
    }

    public void resetProcessMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2db65ea6b929361ab2e6a49da03899ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2db65ea6b929361ab2e6a49da03899ae");
        } else if (this.processEvent != null) {
            this.processEvent = new ProcessMemoryEvent(this.dalvikMax);
            this.processEvent.setProcessName(ProcessUtils.getCurrentProcessName());
            this.processEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        }
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void pageEnter(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c4f57b0a0408ec7df5cdeb40e3985a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c4f57b0a0408ec7df5cdeb40e3985a0");
            return;
        }
        String pageName = AppUtils.getPageName(activity, UserActionsProvider.getInstance().getLastResumeActivityName());
        boolean isMemoryEnable = MetricsRemoteConfigManager.getInstance().isMemoryEnable(pageName);
        if (!MetricsLocalSwitchConfigManager.getInstance().getMemSw(pageName) || !isMemoryEnable) {
            this.usedMem = 0L;
            this.event = null;
            return;
        }
        if (this.dalvikMax <= 0) {
            this.dalvikMax = (int) (Runtime.getRuntime().maxMemory() >> 10);
        }
        this.event = new MemoryEvent(pageName, this.dalvikMax);
        this.event.configFrom = 2;
        this.event.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        this.event.setPid(MetricsActivityLifecycleManager.getInstance().getPageSessionID());
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void pageExit(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c65cd21b7b1a86f82bd1acee1441a2a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c65cd21b7b1a86f82bd1acee1441a2a2");
        } else if (this.event != null) {
            doSample();
            this.event.optionTags = AppUtils.getCustomTags(activity, Constants.MEMORY);
            MetricsCacheManager.getInstance().addToCache(this.event);
            this.event = null;
            this.lastSampleTime = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb A[Catch: Exception -> 0x0151, TryCatch #0 {Exception -> 0x0151, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0023, B:12:0x002b, B:14:0x003a, B:17:0x0049, B:19:0x006c, B:21:0x0077, B:23:0x0086, B:25:0x0089, B:27:0x008d, B:29:0x0093, B:33:0x00f7, B:35:0x00fb, B:36:0x010c, B:38:0x0110, B:39:0x0121, B:41:0x0129, B:42:0x0133, B:44:0x0139, B:30:0x00ea), top: B:49:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110 A[Catch: Exception -> 0x0151, TryCatch #0 {Exception -> 0x0151, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0023, B:12:0x002b, B:14:0x003a, B:17:0x0049, B:19:0x006c, B:21:0x0077, B:23:0x0086, B:25:0x0089, B:27:0x008d, B:29:0x0093, B:33:0x00f7, B:35:0x00fb, B:36:0x010c, B:38:0x0110, B:39:0x0121, B:41:0x0129, B:42:0x0133, B:44:0x0139, B:30:0x00ea), top: B:49:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129 A[Catch: Exception -> 0x0151, TryCatch #0 {Exception -> 0x0151, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0023, B:12:0x002b, B:14:0x003a, B:17:0x0049, B:19:0x006c, B:21:0x0077, B:23:0x0086, B:25:0x0089, B:27:0x008d, B:29:0x0093, B:33:0x00f7, B:35:0x00fb, B:36:0x010c, B:38:0x0110, B:39:0x0121, B:41:0x0129, B:42:0x0133, B:44:0x0139, B:30:0x00ea), top: B:49:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // com.meituan.metrics.sampler.MetricsSampler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doSample() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.sampler.memory.MetricsMemorySampler.doSample():void");
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public double getRealTimeValue() {
        return this.dalvikMax;
    }

    public void startCustomMemory(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7eb9c903cc3370ba378b68d06e0bba55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7eb9c903cc3370ba378b68d06e0bba55");
            return;
        }
        if (this.dalvikMax <= 0) {
            this.dalvikMax = (int) (Runtime.getRuntime().maxMemory() >> 10);
        }
        MemoryEvent memoryEvent = new MemoryEvent(str, this.dalvikMax);
        memoryEvent.configFrom = 2;
        memoryEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        this.customMemoryEvents.put(str, memoryEvent);
    }

    public void stopCustomMemory(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e1217d15801585f8a9824e4b189220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e1217d15801585f8a9824e4b189220");
        } else if (this.customMemoryEvents.containsKey(str)) {
            doSample();
            MemoryEvent memoryEvent = this.customMemoryEvents.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            memoryEvent.optionTags = map;
            MetricsCacheManager.getInstance().addToCache(memoryEvent);
            this.customMemoryEvents.remove(str);
        }
    }
}
