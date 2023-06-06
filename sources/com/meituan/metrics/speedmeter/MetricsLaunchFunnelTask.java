package com.meituan.metrics.speedmeter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.metrics.SeqIdFactory;
import com.meituan.metrics.net.report.MetricsReportManager;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsLaunchFunnelTask {
    private static final String BABEL_TYPE_PREFIX = "LostSummary_";
    private static final String CIPS_LAUNCH_FUNNEL_DIMENSION_PREFIX = "cips_launch_funnel_dimension_prefix_";
    private static final String CIPS_LAUNCH_FUNNEL_STEP_PREFIX = "cips_launch_funnel_step_prefix_";
    private static final String CIPS_TASK_ID = "cips_task_id";
    private static final String KEY_TASK_ID = "key_task_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isReported = false;
    private static AtomicBoolean isReporting = new AtomicBoolean(false);
    private static volatile MetricsLaunchFunnelTask sInstance;
    private ConcurrentHashMap<String, String> dimensionCache;
    private volatile boolean enable;
    private final Executor executor;
    private q funnelDimensionCenter;
    private q funnelStepCenter;
    private volatile boolean isInit;
    private Context mContext;
    private final long startTime;
    private ConcurrentHashMap<String, Long> stepCache;
    private int taskId;
    private q taskIdCenter;

    public MetricsLaunchFunnelTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b2591a31b011cfe38e9f6f50fee9aba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b2591a31b011cfe38e9f6f50fee9aba");
            return;
        }
        this.stepCache = new ConcurrentHashMap<>();
        this.dimensionCache = new ConcurrentHashMap<>();
        this.executor = c.a("LaunchFunnel-Worker");
        this.isInit = false;
        this.enable = true;
        this.startTime = TimeUtil.processStartElapsedTimeMillis();
    }

    public static MetricsLaunchFunnelTask getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72d0841edaf46c44838c7787b1845fe7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLaunchFunnelTask) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72d0841edaf46c44838c7787b1845fe7");
        }
        if (sInstance == null) {
            synchronized (MetricsLaunchFunnelTask.class) {
                if (sInstance == null) {
                    sInstance = new MetricsLaunchFunnelTask();
                }
            }
        }
        return sInstance;
    }

    public void init(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d43f068e70f5d56914a5a9015f2e4581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d43f068e70f5d56914a5a9015f2e4581");
        } else if (this.isInit) {
        } else {
            synchronized (MetricsLaunchFunnelTask.class) {
                if (!this.isInit) {
                    this.mContext = context;
                    this.taskIdCenter = q.a(context, CIPS_TASK_ID, 1);
                    this.taskId = this.taskIdCenter.b(KEY_TASK_ID, -1) + 1;
                    this.taskIdCenter.a(KEY_TASK_ID, this.taskId);
                    this.funnelStepCenter = q.a(context, CIPS_LAUNCH_FUNNEL_STEP_PREFIX + this.taskId, 1);
                    this.funnelDimensionCenter = q.a(context, CIPS_LAUNCH_FUNNEL_DIMENSION_PREFIX + this.taskId, 1);
                    saveCacheData();
                    this.isInit = true;
                    recordDimension("sessionId", SeqIdFactory.getInstance(this.mContext).getSessionId());
                }
            }
        }
    }

    private void saveCacheData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad14ecd0939ad3c1544aa6be028802f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad14ecd0939ad3c1544aa6be028802f8");
        } else if (this.enable) {
            if (this.stepCache.size() > 0) {
                for (Map.Entry<String, Long> entry : this.stepCache.entrySet()) {
                    this.funnelStepCenter.a(entry.getKey(), entry.getValue().longValue());
                }
            }
            if (this.dimensionCache.size() > 0) {
                for (Map.Entry<String, String> entry2 : this.dimensionCache.entrySet()) {
                    this.funnelDimensionCenter.a(entry2.getKey(), entry2.getValue());
                }
            }
        }
    }

    @Deprecated
    public MetricsLaunchFunnelTask cacheStepBeforeInit(String str, String str2) {
        return sInstance;
    }

    public MetricsLaunchFunnelTask cacheStepBeforeInit(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6644193ce572236dabbbc51a1c8a4b78", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLaunchFunnelTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6644193ce572236dabbbc51a1c8a4b78");
        }
        if (!this.enable) {
            return sInstance;
        }
        if (!this.isInit) {
            this.stepCache.put(str, Long.valueOf(j));
        } else {
            recordStep(str, j);
        }
        return sInstance;
    }

    public MetricsLaunchFunnelTask cacheDimensionBeforeInit(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33559bb72f066e3fa0adca9c5c839e7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLaunchFunnelTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33559bb72f066e3fa0adca9c5c839e7c");
        }
        if (!this.enable) {
            return sInstance;
        }
        if (!this.isInit) {
            this.dimensionCache.put(str, str2);
        } else {
            recordDimension(str, str2);
        }
        return sInstance;
    }

    @Deprecated
    public MetricsLaunchFunnelTask recordStep(String str, String str2) {
        return sInstance;
    }

    public MetricsLaunchFunnelTask recordStep(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1452400f41450eeb190b9d7f4b188f87", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLaunchFunnelTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1452400f41450eeb190b9d7f4b188f87");
        }
        if (!this.isInit || !this.enable || isReported || isReporting.get()) {
            return sInstance;
        }
        if (this.enable) {
            this.funnelStepCenter.a(str, j);
        }
        return sInstance;
    }

    public MetricsLaunchFunnelTask recordDimension(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3911ecdfe33a53b2935ba1ea769519ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLaunchFunnelTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3911ecdfe33a53b2935ba1ea769519ed");
        }
        if (!this.isInit || !this.enable || isReported || isReporting.get()) {
            return sInstance;
        }
        if (this.enable) {
            this.funnelDimensionCenter.a(str, str2);
        }
        return sInstance;
    }

    public void report() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "672b59565a4b410a549142d7e48732c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "672b59565a4b410a549142d7e48732c2");
        } else if (!isReported && this.isInit && isReporting.compareAndSet(false, true)) {
            b.a(this.executor, new Runnable() { // from class: com.meituan.metrics.speedmeter.MetricsLaunchFunnelTask.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "87bcd037095ea1df498d9b05de29a5fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "87bcd037095ea1df498d9b05de29a5fa");
                    } else {
                        MetricsLaunchFunnelTask.this.reportAsync();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportAsync() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8fe29d3e8545375366cfc4e4723ff75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8fe29d3e8545375366cfc4e4723ff75");
        } else if (!isReported) {
            ArrayList arrayList = new ArrayList();
            int b = this.taskIdCenter.b(KEY_TASK_ID, -1);
            if (b == -1) {
                return;
            }
            if (!this.enable && b == this.taskId) {
                b--;
                q.a(this.mContext, CIPS_LAUNCH_FUNNEL_STEP_PREFIX + this.taskId, 1).h();
                q.a(this.mContext, CIPS_LAUNCH_FUNNEL_DIMENSION_PREFIX + this.taskId, 1).h();
            }
            int i = b;
            for (int i2 = 0; i2 <= i; i2++) {
                q a = q.a(this.mContext, CIPS_LAUNCH_FUNNEL_STEP_PREFIX + i2, 1);
                q a2 = q.a(this.mContext, CIPS_LAUNCH_FUNNEL_DIMENSION_PREFIX + i2, 1);
                Map<String, ?> b2 = a2.b();
                Map<String, ?> b3 = a.b();
                for (String str : b3.keySet()) {
                    try {
                        j = Long.parseLong(String.valueOf(b3.get(str)));
                    } catch (Throwable unused) {
                        j = 1;
                    }
                    addLog(str, j, arrayList, b2);
                }
                StoreUtils.removeCIPStorageObject(a, this.mContext, CIPS_LAUNCH_FUNNEL_STEP_PREFIX + i2);
                StoreUtils.removeCIPStorageObject(a2, this.mContext, CIPS_LAUNCH_FUNNEL_DIMENSION_PREFIX + i2);
            }
            Babel.logRT(arrayList);
            this.taskIdCenter.b(KEY_TASK_ID);
            isReported = true;
        }
    }

    private void addLog(String str, long j, List<Log> list, Map<String, Object> map) {
        Object[] objArr = {str, new Long(j), list, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2082d581921f59ce56ae7f3c065bed6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2082d581921f59ce56ae7f3c065bed6b");
            return;
        }
        String category = MetricsReportManager.getInstance().getCategory();
        Log.Builder value = new Log.Builder("").value(j);
        list.add(value.tag(BABEL_TYPE_PREFIX + str).optional(map).reportChannel(category).lv4LocalStatus(true).build());
    }

    public void setEnable(boolean z) {
        sInstance.enable = z;
    }

    public boolean ifEnable() {
        return sInstance.enable;
    }

    public void clearCurrentData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d9e7b73daf22273167c37e1af73e6e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d9e7b73daf22273167c37e1af73e6e7");
        } else if (this.isInit) {
            b.a(this.executor, new Runnable() { // from class: com.meituan.metrics.speedmeter.MetricsLaunchFunnelTask.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4049f0d8b920d81ed3520055e2b4f3e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4049f0d8b920d81ed3520055e2b4f3e5");
                    } else {
                        MetricsLaunchFunnelTask.this.clearAsync();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAsync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe8842386eb4c29139b7ffb7f183a3c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe8842386eb4c29139b7ffb7f183a3c6");
            return;
        }
        int b = this.taskIdCenter.b(KEY_TASK_ID, -1);
        if (b == -1) {
            return;
        }
        if (b == this.taskId) {
            this.taskIdCenter.a(KEY_TASK_ID, b - 1);
        }
        q qVar = this.funnelStepCenter;
        Context context = this.mContext;
        StoreUtils.removeCIPStorageObject(qVar, context, CIPS_LAUNCH_FUNNEL_STEP_PREFIX + this.taskId);
        q qVar2 = this.funnelDimensionCenter;
        Context context2 = this.mContext;
        StoreUtils.removeCIPStorageObject(qVar2, context2, CIPS_LAUNCH_FUNNEL_DIMENSION_PREFIX + this.taskId);
    }

    public long getStartTime() {
        return this.startTime;
    }
}
