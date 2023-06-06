package com.meituan.metrics.laggy;

import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Printer;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.MetricsFrameCallbackManager;
import com.meituan.metrics.config.MetricsLocalSwitchConfigManager;
import com.meituan.metrics.laggy.anr.AnrCallback;
import com.meituan.metrics.laggy.anr.AnrSLA;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.looper_logging.LooperLoggingManager;
import com.meituan.metrics.util.ProcessCpuTracker;
import com.meituan.metrics.util.ThreadStackUtils;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LaggyMonitor implements Printer, MetricsFrameCallbackManager.MetricsFrameCallback {
    private static final String CHANNEL_GETSTACK_COUNTER = "metrics_getstack_counter";
    private static final String KEY_GETSTACK_COUNT = "getstack_count";
    private static final String KEY_MIN_GETSTACK_THRESHOLD = "min_getstack_threshold";
    private static final String KEY_SAMPLE_INTERVAL = "sample_interval";
    private static final char LOOP_START_TAG = '>';
    public static final int MIN_INTERVAL = 1000;
    public static final int SAMPLE_BY_CHOREOGRAPHER = 1;
    public static final int SAMPLE_BY_PRINTER = 0;
    private static final int SAMPLE_COUNT = 2;
    private static final int VALIDATE_VSYNC_COUNT = 10;
    private static final long VALIDATE_VSYNC_TS = 2000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private AnrCallback anrCallback;
    private boolean anrNeedsLaggyMonitor;
    private ProcessCpuTracker cpuTracker;
    private q getStackMonitorStorage;
    private volatile boolean isLagReportCountLimited;
    private boolean isLagReported;
    private boolean isMainThread;
    private volatile boolean isMonitorBusy;
    protected long lagThreshold;
    protected LaggyCallback laggyCallback;
    private final List<ThreadStackEntity> laggyCheckedSTs;
    private long lastGetStackTs;
    protected final Looper looper;
    protected Handler sampleHandler;
    protected long sampleInterval;
    private int sampleMethod;
    private volatile int sampleTimes;
    private final Runnable stacktraceSampleTask;
    private volatile long startTimeMillis;
    public String targetThreadName;
    protected final Thread thread;
    private int vsyncCount;
    private long vsyncStartTs;

    public static /* synthetic */ int access$208(LaggyMonitor laggyMonitor) {
        int i = laggyMonitor.sampleTimes;
        laggyMonitor.sampleTimes = i + 1;
        return i;
    }

    public LaggyMonitor(long j, Looper looper, String str) {
        Object[] objArr = {new Long(j), looper, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18efc89be51a7b06eebc319afc6c4530", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18efc89be51a7b06eebc319afc6c4530");
            return;
        }
        this.isMonitorBusy = false;
        this.startTimeMillis = 0L;
        this.laggyCheckedSTs = Collections.synchronizedList(new ArrayList());
        this.isLagReportCountLimited = false;
        this.sampleMethod = 0;
        this.stacktraceSampleTask = new Runnable() { // from class: com.meituan.metrics.laggy.LaggyMonitor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                String printCurrentState;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c113d0ad7daf3a509a325ce9271f4e74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c113d0ad7daf3a509a325ce9271f4e74");
                } else if (LaggyMonitor.this.isMonitorBusy && MetricsFrameCallbackManager.getInstance().isForeground()) {
                    LaggyMonitor.this.getStack();
                    LaggyMonitor.access$208(LaggyMonitor.this);
                    long elapsedRealtime = SystemClock.elapsedRealtime() - LaggyMonitor.this.startTimeMillis;
                    Logger.getMetricsLogger().d("LaggyMonitor stacktraceSampleTask costs:", Long.valueOf(elapsedRealtime));
                    if (LaggyMonitor.this.sampleTimes == 1) {
                        LaggyMonitor.this.isLagReported = false;
                        if (LaggyMonitor.this.cpuTracker != null) {
                            LaggyMonitor.this.cpuTracker.update();
                        }
                        if (LaggyMonitor.this.isMainThread && LaggyMonitor.this.anrNeedsLaggyMonitor) {
                            LaggyMonitor.this.sampleHandler.postDelayed(new AnrTask(LaggyMonitor.this.startTimeMillis), MetricsAnrManager.ANR_THRESHOLD - elapsedRealtime);
                        }
                        if (LaggyMonitor.this.isLagReportCountLimited) {
                            Logger.getMetricsLogger().d("LaggyMonitor: lag report limited");
                            return;
                        }
                    }
                    if (LaggyMonitor.this.laggyCallback != null && !LaggyMonitor.this.isLagReported && elapsedRealtime >= LaggyMonitor.this.lagThreshold && !LaggyMonitor.this.laggyCheckedSTs.isEmpty()) {
                        if (LaggyMonitor.this.cpuTracker != null) {
                            try {
                                LaggyMonitor.this.cpuTracker.update();
                                printCurrentState = LaggyMonitor.this.cpuTracker.printCurrentState(SystemClock.uptimeMillis());
                            } catch (Throwable unused) {
                            }
                            LaggyMonitor.this.laggyCallback.onLaggyEvent(elapsedRealtime, LaggyMonitor.this.targetThreadName, printCurrentState, new ArrayList(LaggyMonitor.this.laggyCheckedSTs));
                            LaggyMonitor.this.sampleHandler.removeCallbacks(this);
                            LaggyMonitor.this.isLagReported = true;
                        }
                        printCurrentState = null;
                        LaggyMonitor.this.laggyCallback.onLaggyEvent(elapsedRealtime, LaggyMonitor.this.targetThreadName, printCurrentState, new ArrayList(LaggyMonitor.this.laggyCheckedSTs));
                        LaggyMonitor.this.sampleHandler.removeCallbacks(this);
                        LaggyMonitor.this.isLagReported = true;
                    }
                    if (!LaggyMonitor.this.isMonitorBusy || LaggyMonitor.this.isLagReported) {
                        return;
                    }
                    LaggyMonitor.this.sampleHandler.postDelayed(this, LaggyMonitor.this.sampleInterval);
                }
            }
        };
        this.laggyCallback = MetricsLaggyManager.getInstance();
        this.lagThreshold = j;
        this.sampleInterval = Math.max(j / 2, 1000L);
        this.sampleHandler = MetricsLaggyManager.getInstance().createLaggyDetectHandler();
        this.thread = looper.getThread();
        this.looper = looper;
        this.targetThreadName = str;
        initGetStackMonitorOnceMainProcess();
    }

    public static LaggyMonitor newMainLaggyMonitor(boolean z, long j, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "199fe0611fd2432be96564a300f06d7e", RobustBitConfig.DEFAULT_VALUE) ? (LaggyMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "199fe0611fd2432be96564a300f06d7e") : new LaggyMonitor(z, j, z2);
    }

    public LaggyMonitor(boolean z, long j, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dca595e1deebe72c27aeb68e374df96d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dca595e1deebe72c27aeb68e374df96d");
            return;
        }
        this.isMonitorBusy = false;
        this.startTimeMillis = 0L;
        this.laggyCheckedSTs = Collections.synchronizedList(new ArrayList());
        this.isLagReportCountLimited = false;
        this.sampleMethod = 0;
        this.stacktraceSampleTask = new Runnable() { // from class: com.meituan.metrics.laggy.LaggyMonitor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                String printCurrentState;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c113d0ad7daf3a509a325ce9271f4e74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c113d0ad7daf3a509a325ce9271f4e74");
                } else if (LaggyMonitor.this.isMonitorBusy && MetricsFrameCallbackManager.getInstance().isForeground()) {
                    LaggyMonitor.this.getStack();
                    LaggyMonitor.access$208(LaggyMonitor.this);
                    long elapsedRealtime = SystemClock.elapsedRealtime() - LaggyMonitor.this.startTimeMillis;
                    Logger.getMetricsLogger().d("LaggyMonitor stacktraceSampleTask costs:", Long.valueOf(elapsedRealtime));
                    if (LaggyMonitor.this.sampleTimes == 1) {
                        LaggyMonitor.this.isLagReported = false;
                        if (LaggyMonitor.this.cpuTracker != null) {
                            LaggyMonitor.this.cpuTracker.update();
                        }
                        if (LaggyMonitor.this.isMainThread && LaggyMonitor.this.anrNeedsLaggyMonitor) {
                            LaggyMonitor.this.sampleHandler.postDelayed(new AnrTask(LaggyMonitor.this.startTimeMillis), MetricsAnrManager.ANR_THRESHOLD - elapsedRealtime);
                        }
                        if (LaggyMonitor.this.isLagReportCountLimited) {
                            Logger.getMetricsLogger().d("LaggyMonitor: lag report limited");
                            return;
                        }
                    }
                    if (LaggyMonitor.this.laggyCallback != null && !LaggyMonitor.this.isLagReported && elapsedRealtime >= LaggyMonitor.this.lagThreshold && !LaggyMonitor.this.laggyCheckedSTs.isEmpty()) {
                        if (LaggyMonitor.this.cpuTracker != null) {
                            try {
                                LaggyMonitor.this.cpuTracker.update();
                                printCurrentState = LaggyMonitor.this.cpuTracker.printCurrentState(SystemClock.uptimeMillis());
                            } catch (Throwable unused) {
                            }
                            LaggyMonitor.this.laggyCallback.onLaggyEvent(elapsedRealtime, LaggyMonitor.this.targetThreadName, printCurrentState, new ArrayList(LaggyMonitor.this.laggyCheckedSTs));
                            LaggyMonitor.this.sampleHandler.removeCallbacks(this);
                            LaggyMonitor.this.isLagReported = true;
                        }
                        printCurrentState = null;
                        LaggyMonitor.this.laggyCallback.onLaggyEvent(elapsedRealtime, LaggyMonitor.this.targetThreadName, printCurrentState, new ArrayList(LaggyMonitor.this.laggyCheckedSTs));
                        LaggyMonitor.this.sampleHandler.removeCallbacks(this);
                        LaggyMonitor.this.isLagReported = true;
                    }
                    if (!LaggyMonitor.this.isMonitorBusy || LaggyMonitor.this.isLagReported) {
                        return;
                    }
                    LaggyMonitor.this.sampleHandler.postDelayed(this, LaggyMonitor.this.sampleInterval);
                }
            }
        };
        if (z && j > 0 && z2) {
            this.laggyCallback = MetricsLaggyManager.getInstance();
            this.lagThreshold = j;
            this.sampleInterval = Math.max(Math.min((long) MetricsAnrManager.ANR_THRESHOLD, j) / 2, 1000L);
            this.cpuTracker = new ProcessCpuTracker(Process.myPid());
        } else if (z && j > 0) {
            this.laggyCallback = MetricsLaggyManager.getInstance();
            this.lagThreshold = j;
            this.sampleInterval = Math.max(j / 2, 1000L);
            this.cpuTracker = new ProcessCpuTracker(Process.myPid());
        } else if (z2) {
            this.sampleInterval = Math.max(2500L, 1000L);
        }
        this.anrNeedsLaggyMonitor = z2;
        this.sampleHandler = MetricsLaggyManager.getInstance().createLaggyDetectHandler();
        this.looper = Looper.getMainLooper();
        this.thread = this.looper.getThread();
        this.isMainThread = true;
        this.targetThreadName = "main";
        this.vsyncStartTs = System.currentTimeMillis();
        initGetStackMonitorOnceMainProcess();
    }

    public void setAnrCallback(AnrCallback anrCallback) {
        this.anrCallback = anrCallback;
    }

    @Override // android.util.Printer
    public void println(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3bcd5e9445b62670962e52f2b498f50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3bcd5e9445b62670962e52f2b498f50");
        } else if (Debug.isDebuggerConnected() || str == null || str.length() <= 0 || !isPrinterEnable()) {
        } else {
            boolean z = str.charAt(0) == '>';
            this.isMonitorBusy = z;
            if (z) {
                this.startTimeMillis = SystemClock.elapsedRealtime();
                this.laggyCheckedSTs.clear();
                this.sampleHandler.postDelayed(this.stacktraceSampleTask, this.sampleInterval);
                return;
            }
            this.sampleTimes = 0;
            this.sampleHandler.removeCallbacks(this.stacktraceSampleTask);
        }
    }

    private boolean isPrinterEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d2473bfbd3d9a7c2c9ee05f2d36d24", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d2473bfbd3d9a7c2c9ee05f2d36d24")).booleanValue();
        }
        String lastResumeActivityName = UserActionsProvider.getInstance().getLastResumeActivityName();
        if (this.lagThreshold <= 0 || !MetricsLocalSwitchConfigManager.getInstance().getLagSw(lastResumeActivityName)) {
            return this.isMainThread && this.anrNeedsLaggyMonitor;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getStack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a09720e3ca49dd80dc231ec286b60a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a09720e3ca49dd80dc231ec286b60a6");
            return;
        }
        try {
            if (this.lastGetStackTs > 0) {
                long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP() - this.lastGetStackTs;
                if (currentTimeMillisSNTP < this.sampleInterval) {
                    Logger.getMetricsLogger().e("LaggyMonitor: getStack timeThreshold too short. Return");
                    return;
                }
                updateGetStackMonitor(currentTimeMillisSNTP);
            }
            this.lastGetStackTs = TimeUtil.currentTimeMillisSNTP();
            if (this.laggyCheckedSTs.size() >= 5) {
                this.laggyCheckedSTs.remove(this.laggyCheckedSTs.size() - 1);
            }
            long currentTimeMillisSNTP2 = TimeUtil.currentTimeMillisSNTP();
            StackTraceElement[] stackTrace = this.thread.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                Logger.getMetricsLogger().d("LaggyMonitor getStack: \n", ThreadStackUtils.getStack(stackTrace));
                this.laggyCheckedSTs.add(new ThreadStackEntity(currentTimeMillisSNTP2, stackTrace));
                return;
            }
            Logger.getMetricsLogger().d("LaggyMonitor getStack Error, stackTrace.length<=0");
        } catch (Throwable th) {
            Logger.getMetricsLogger().d("LaggyMonitor getStack Error, clear stack, msg: ", th.getMessage());
            this.laggyCheckedSTs.clear();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class AnrTask implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final long startTime;

        public AnrTask(long j) {
            Object[] objArr = {LaggyMonitor.this, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a34d483c6a1e19e1d8ddc1e630bd3e60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a34d483c6a1e19e1d8ddc1e630bd3e60");
            } else {
                this.startTime = j;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af8d761b128cb6515f47e311631adce2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af8d761b128cb6515f47e311631adce2");
            } else if (MetricsFrameCallbackManager.getInstance().isForeground()) {
                if (this.startTime == LaggyMonitor.this.startTimeMillis) {
                    if (LaggyMonitor.this.isMonitorBusy && LaggyMonitor.this.isMainThread && LaggyMonitor.this.anrNeedsLaggyMonitor && LaggyMonitor.this.anrCallback != null) {
                        AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_ANR_RECORD_COUNT);
                        LaggyMonitor.this.getStack();
                        Logger.getMetricsLogger().d("LaggyMonitor onAnrEvent");
                        LaggyMonitor.this.anrCallback.onAnrEvent(TimeUtil.currentTimeMillisSNTP(), null, new ArrayList(LaggyMonitor.this.laggyCheckedSTs), AnrCallback.ANR_DETECT_TYPE.VSYNC, null);
                        LaggyMonitor.this.sampleHandler.postDelayed(this, MetricsAnrManager.ANR_THRESHOLD);
                        return;
                    }
                    return;
                }
                Logger.getMetricsLogger().d("anrTask startTime != startTimeMillis");
            }
        }
    }

    public void register() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a93feaa8e762fd32150807f66b9f0bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a93feaa8e762fd32150807f66b9f0bf");
        } else if (this.sampleMethod == 0) {
            LooperLoggingManager.getInstance().registerLogging(this.looper, this);
            MetricsFrameCallbackManager.getInstance().register(this);
        } else {
            MetricsFrameCallbackManager.getInstance().register(this);
            startNewChoreographerSample();
        }
    }

    public void unregister() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb0f409d90291b14cc1d488f5e5d7d5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb0f409d90291b14cc1d488f5e5d7d5d");
        } else if (this.sampleMethod == 0) {
            LooperLoggingManager.getInstance().unRegisterLogging(this.looper, this);
        } else {
            MetricsFrameCallbackManager.getInstance().unregister(this);
        }
    }

    @Override // com.meituan.metrics.MetricsFrameCallbackManager.MetricsFrameCallback
    public void doFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e366338b84629d3b2d99a0c8db1c3286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e366338b84629d3b2d99a0c8db1c3286");
            return;
        }
        if (this.sampleMethod == 0) {
            unregister();
            this.sampleMethod = 1;
        }
        startNewChoreographerSample();
        if (!this.anrNeedsLaggyMonitor || this.vsyncCount >= 10 || System.currentTimeMillis() - this.vsyncStartTs >= 2000) {
            return;
        }
        int i = this.vsyncCount + 1;
        this.vsyncCount = i;
        if (i == 10) {
            AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_MONITOR_AVAILABLE_COUNT);
        }
    }

    private void startNewChoreographerSample() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f53d424696033a9d4329bde4e50ab8b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f53d424696033a9d4329bde4e50ab8b7");
            return;
        }
        this.sampleHandler.removeCallbacks(this.stacktraceSampleTask);
        this.laggyCheckedSTs.clear();
        this.sampleTimes = 0;
        this.startTimeMillis = SystemClock.elapsedRealtime();
        this.sampleHandler.postDelayed(this.stacktraceSampleTask, this.sampleInterval);
        this.isMonitorBusy = true;
    }

    public int getSampleMethod() {
        return this.sampleMethod;
    }

    private void initGetStackMonitorOnceMainProcess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0528976605a9dca0c529c76f903199e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0528976605a9dca0c529c76f903199e");
            return;
        }
        Context context = Metrics.getInstance().getContext();
        if (this.getStackMonitorStorage == null && ProcessUtils.isMainProcess(context)) {
            this.getStackMonitorStorage = q.a(context, CHANNEL_GETSTACK_COUNTER);
            reportLastGetStackInfo();
            this.getStackMonitorStorage.a(KEY_SAMPLE_INTERVAL, this.sampleInterval);
        }
    }

    private void updateGetStackMonitor(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4484c5abe119ec77ca96ee9b4ce04e3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4484c5abe119ec77ca96ee9b4ce04e3b");
        } else if (this.getStackMonitorStorage == null) {
        } else {
            long b = this.getStackMonitorStorage.b(KEY_MIN_GETSTACK_THRESHOLD, Long.MAX_VALUE);
            if (j > 0 && j < b) {
                this.getStackMonitorStorage.a(KEY_MIN_GETSTACK_THRESHOLD, j);
            }
            this.getStackMonitorStorage.a(KEY_GETSTACK_COUNT, this.getStackMonitorStorage.b(KEY_GETSTACK_COUNT, 0) + 1);
        }
    }

    private void reportLastGetStackInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2d207d3ee1a085f5b8bef13b3ee70fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2d207d3ee1a085f5b8bef13b3ee70fa");
            return;
        }
        int b = this.getStackMonitorStorage.b(KEY_GETSTACK_COUNT, 0);
        if (b > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("getStackCount", Integer.valueOf(b));
            hashMap.put("minGetStackThreshold", Long.valueOf(this.getStackMonitorStorage.b(KEY_MIN_GETSTACK_THRESHOLD, Long.MAX_VALUE)));
            hashMap.put("sampleInterval", Long.valueOf(this.getStackMonitorStorage.b(KEY_SAMPLE_INTERVAL, Long.MAX_VALUE)));
            final Log build = new Log.Builder("").optional(hashMap).generalChannelStatus(true).tag("metricsGetStackCount").build();
            c.c("metrics-reportGetStackInfo").schedule(new Runnable() { // from class: com.meituan.metrics.laggy.LaggyMonitor.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "584aec05a97603425532ee02b645adbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "584aec05a97603425532ee02b645adbf");
                    } else {
                        Babel.log(build);
                    }
                }
            }, MetricsAnrManager.ANR_THRESHOLD, TimeUnit.MILLISECONDS);
            this.getStackMonitorStorage.c();
        }
    }

    public void setLagReportCountLimited() {
        this.isLagReportCountLimited = true;
    }
}
