package com.meituan.metrics.sys;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.kitefly.KiteFly;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.CPUInfoParser;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.metrics.Environment;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.SeqIdFactory;
import com.meituan.metrics.cache.MetricsCacheManager;
import com.meituan.metrics.laggy.anr.AnrSLA;
import com.meituan.metrics.model.ExitInfoEvent;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.metrics.util.NewDeviceLevel;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SysStatisticsManager {
    private static final long COLLECT_DELAY = 8000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile SysStatisticsManager mInstance;
    private final ScheduledExecutorService executor;
    private volatile boolean isReported;
    private AtomicBoolean isReporting;
    private final CommonStatus status;

    public static SysStatisticsManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f04871597b78937fa73e680c156081d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (SysStatisticsManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f04871597b78937fa73e680c156081d5");
        }
        if (mInstance == null) {
            synchronized (SysStatisticsManager.class) {
                if (mInstance == null) {
                    mInstance = new SysStatisticsManager();
                }
            }
        }
        return mInstance;
    }

    public SysStatisticsManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12d3f04b0a2e74a683fa3f5f0564472d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12d3f04b0a2e74a683fa3f5f0564472d");
            return;
        }
        this.isReported = false;
        this.isReporting = new AtomicBoolean(false);
        this.executor = c.c("metrics-sys");
        this.status = new CommonStatus();
    }

    private synchronized void reportSysData(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c003b7fdb61e4668c6de489f3ecda19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c003b7fdb61e4668c6de489f3ecda19");
            return;
        }
        Environment environment = Metrics.getEnvironment();
        if (context != null && environment != null && !TextUtils.isEmpty(environment.getUuid())) {
            if (this.isReported) {
                Logger.getMetricsLogger().d("系统参数已上报成功 不重复上报");
                return;
            }
            Log.Builder builder = new Log.Builder("env");
            builder.tag("env");
            builder.reportChannel("metrics-env-android");
            builder.ts(TimeUtil.currentTimeMillisSNTP());
            HashMap hashMap = new HashMap();
            hashMap.put("cpu_core_nums", Integer.valueOf(DeviceUtil.getNumOfCores()));
            hashMap.put("cpu_max_freq", DeviceUtil.queryCpuMaxFreq());
            hashMap.put("cpu_min_freq", DeviceUtil.queryCpuMinFreq());
            hashMap.put("memory_per_app", DeviceUtil.queryAppMemory(context));
            hashMap.put("memory_per_phone", DeviceUtil.queryPhoneMemory(context));
            hashMap.put("screen_resolution_width", this.status.querySrceenResolutionW());
            hashMap.put("screen_resolution_height", this.status.querySrceenResolutionH());
            hashMap.put("screen_density", this.status.queryDensity());
            hashMap.put("build_manu", this.status.queryBuildManufacturer());
            hashMap.put("build_abi", convert(this.status.queryBuildAbi()));
            hashMap.put("build_brand", this.status.queryBuildBrand());
            hashMap.put("build_root", Boolean.valueOf(this.status.isRoot()));
            hashMap.put("build_arch", Integer.valueOf(this.status.queryBuildArch()));
            hashMap.put("cpu_features", this.status.getCpuFeatures());
            hashMap.put("kernel_version", System.getProperty("os.version", "-1"));
            hashMap.put("is_ohos", Boolean.valueOf(DeviceUtil.isOhos()));
            hashMap.put("network", NetWorkUtils.getNetWorkTypeForCrashAndSniffer(context));
            hashMap.put("metricsSdkVersion", "4.7.24.2-waimai");
            CPUInfoParser cPUInfoParser = new CPUInfoParser();
            cPUInfoParser.parse();
            CPUInfoParser.CPUProcessor largest = cPUInfoParser.getLargest();
            if (largest != null) {
                hashMap.put("cpu_hardware", cPUInfoParser.getHardwareName());
                hashMap.put("cpu_implementer", largest.getImplementerCode());
                hashMap.put("cpu_variant", largest.getVariant());
                hashMap.put("cpu_part", largest.getPart());
                hashMap.put("cpu_revision", largest.getRevision());
            }
            hashMap.put("benchmarkScore", Double.valueOf(NewDeviceLevel.getDeviceScore(context)));
            hashMap.put("benchmarkDetail", NewDeviceLevel.readCpuPart(context));
            String str = null;
            try {
                long internalTotalStorageSize = StorageStatus.getInternalTotalStorageSize();
                long internalAvailableStorageSize = StorageStatus.getInternalAvailableStorageSize();
                hashMap.put("storage_capacity", Long.valueOf(internalTotalStorageSize));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("storage_free", internalAvailableStorageSize);
                str = jSONObject.toString();
            } catch (Throwable unused) {
            }
            Logger.getMetricxLogger().setLogLevel(2);
            Logger.getMetricsLogger().d("上报系统信息", hashMap);
            SeqIdFactory.getInstance(context).setSequenceId("env", hashMap);
            builder.optional(hashMap);
            if (!TextUtils.isEmpty(str)) {
                builder.details(str);
            }
            if (!TextUtils.isEmpty(environment.getToken())) {
                builder.token(environment.getToken());
            }
            builder.lv4LocalStatus(true);
            Logger.getMetricsLogger().d("reportSysData", hashMap);
            KiteFly.logVIP(builder.build(), 0);
            this.isReported = true;
            return;
        }
        Logger.getMetricsLogger().d("没有uuid 不上报系统参数");
    }

    public void checkAndSendSysData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89e0908af49cc9931c536a47768859d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89e0908af49cc9931c536a47768859d6");
        } else if (!this.isReported && this.isReporting.compareAndSet(false, true)) {
            this.executor.schedule(new ScheduleRunnableDelegate(new Runnable() { // from class: com.meituan.metrics.sys.SysStatisticsManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "41fb1c987f93f5a811c4b57e8f8877e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "41fb1c987f93f5a811c4b57e8f8877e9");
                        return;
                    }
                    try {
                        SysStatisticsManager.this.reportSysDataOnce(ContextProvider.getInstance().getContext());
                    } finally {
                        SysStatisticsManager.this.isReporting.set(false);
                    }
                }
            }), COLLECT_DELAY, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportSysDataOnce(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e73972ca47f1790a11f03fb2f11f4426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e73972ca47f1790a11f03fb2f11f4426");
        } else if (this.isReported || context == null || !ProcessUtils.isMainProcess(context)) {
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                uploadExitInfo(context);
            }
            reportSysData(applicationContext);
            AnrSLA.getInstance().reportLastAnrSLA();
        }
    }

    @RequiresApi(30)
    private void uploadExitInfo(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70771a3bec1c610ec520673fac56edb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70771a3bec1c610ec520673fac56edb4");
            return;
        }
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getHistoricalProcessExitReasons(context.getPackageName(), 0, 5);
            if (historicalProcessExitReasons.isEmpty()) {
                return;
            }
            q a = q.a(context, "metrics_exit_info", 2);
            String currentProcessName = ProcessUtils.getCurrentProcessName(context);
            String str = "KEY" + currentProcessName;
            long b = a.b(str, 0L);
            a.a(str, (System.currentTimeMillis() - (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime())) - 1000);
            for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                if (applicationExitInfo != null && TextUtils.equals(currentProcessName, applicationExitInfo.getProcessName()) && applicationExitInfo.getTimestamp() >= b) {
                    String str2 = null;
                    if (applicationExitInfo.getReason() == 6 || applicationExitInfo.getReason() == 5) {
                        str2 = uploadTraceIfExist(applicationExitInfo);
                    }
                    uploadAnrIfNeed(applicationExitInfo);
                    MetricsCacheManager.getInstance().addToCache(new ExitInfoEvent(applicationExitInfo, str2));
                    return;
                }
            }
        } catch (Throwable th) {
            Logger.getMetricsLogger().e("uploadExitInfo failed: ", th);
        }
    }

    private String uploadTraceIfExist(ApplicationExitInfo applicationExitInfo) {
        Object[] objArr = {applicationExitInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40d2255eb13f07d7f20f95928d77734f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40d2255eb13f07d7f20f95928d77734f");
        }
        try {
            final InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                return null;
            }
            final String str = "exitTrace_" + Internal.getAppEnvironment().getUuid() + CommonConstant.Symbol.UNDERLINE + System.currentTimeMillis();
            if (applicationExitInfo.getReason() != 5) {
                str = str + ".txt";
            }
            String str2 = "https://s3plus.meituan.net/v1/mss_9bac99a330e2415d94ee9fa9bbfc83db/simple-perf/" + str;
            Logger.getMetricxLogger().d("Exit Trace url", str2);
            b.a(c.a(), new Runnable() { // from class: com.meituan.metrics.sys.SysStatisticsManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
                    	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
                    	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                    */
                @Override // java.lang.Runnable
                public void run() {
                    /*
                        r11 = this;
                        r0 = 0
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.metrics.sys.SysStatisticsManager.AnonymousClass2.changeQuickRedirect
                        java.lang.String r10 = "7333a4503f44d1c1381cf81ca70e3e99"
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
                        r1 = 0
                        com.meituan.android.common.metricx.helpers.ContextProvider r2 = com.meituan.android.common.metricx.helpers.ContextProvider.getInstance()     // Catch: java.lang.Throwable -> L7a
                        android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L7a
                        java.lang.String r3 = "exitTrace"
                        java.io.File r2 = com.meituan.android.common.metricx.utils.StoreUtils.getFile(r2, r3)     // Catch: java.lang.Throwable -> L7a
                        boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L7a
                        if (r3 != 0) goto L30
                        r2.mkdirs()     // Catch: java.lang.Throwable -> L7a
                    L30:
                        java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L7a
                        java.lang.String r4 = r2     // Catch: java.lang.Throwable -> L7a
                        r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L7a
                        java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L7a
                        java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7a
                        r4.<init>(r3)     // Catch: java.lang.Throwable -> L7a
                        r2.<init>(r4)     // Catch: java.lang.Throwable -> L7a
                        java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L7b
                        java.io.InputStream r5 = r3     // Catch: java.lang.Throwable -> L7b
                        r4.<init>(r5)     // Catch: java.lang.Throwable -> L7b
                        r1 = 8192(0x2000, float:1.14794E-41)
                        byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L6d
                    L4c:
                        int r5 = r4.read(r1)     // Catch: java.lang.Throwable -> L6d
                        if (r5 <= 0) goto L56
                        r2.write(r1, r0, r5)     // Catch: java.lang.Throwable -> L6d
                        goto L4c
                    L56:
                        r2.flush()     // Catch: java.lang.Throwable -> L6d
                        com.meituan.shadowsong.mss.h r0 = com.meituan.shadowsong.mss.h.a.a     // Catch: java.lang.Throwable -> L6d
                        com.meituan.metrics.sys.SysStatisticsManager$2$1 r1 = new com.meituan.metrics.sys.SysStatisticsManager$2$1     // Catch: java.lang.Throwable -> L6d
                        r1.<init>()     // Catch: java.lang.Throwable -> L6d
                        r0.a(r3, r1)     // Catch: java.lang.Throwable -> L6d
                        com.sankuai.common.utils.IOUtils.close(r4)
                    L66:
                        com.sankuai.common.utils.IOUtils.close(r2)
                        return
                    L6a:
                        r0 = move-exception
                        r1 = r4
                        goto L73
                    L6d:
                        r1 = r4
                        goto L7b
                    L6f:
                        r0 = move-exception
                        goto L73
                    L71:
                        r0 = move-exception
                        r2 = r1
                    L73:
                        com.sankuai.common.utils.IOUtils.close(r1)
                        com.sankuai.common.utils.IOUtils.close(r2)
                        throw r0
                    L7a:
                        r2 = r1
                    L7b:
                        com.sankuai.common.utils.IOUtils.close(r1)
                        goto L66
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.sys.SysStatisticsManager.AnonymousClass2.run():void");
                }
            });
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @android.support.annotation.RequiresApi(api = 30)
    private void uploadAnrIfNeed(android.app.ApplicationExitInfo r13) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.sys.SysStatisticsManager.uploadAnrIfNeed(android.app.ApplicationExitInfo):void");
    }

    private String convert(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4601398c18a8592a20f46f60f4bac2db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4601398c18a8592a20f46f60f4bac2db");
        }
        StringBuilder sb = new StringBuilder(64);
        for (String str : strArr) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private boolean mainStackBegin(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aed60a3d9720bf1387b9dbb9230cfcb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aed60a3d9720bf1387b9dbb9230cfcb")).booleanValue() : str.endsWith(String.valueOf(i)) || str.startsWith("\"main\"");
    }
}
