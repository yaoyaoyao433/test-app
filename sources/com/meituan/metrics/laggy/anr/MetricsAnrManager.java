package com.meituan.metrics.laggy.anr;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.kitefly.KiteFly;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.PreloadInjection;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.metricx.sliver.Sliver;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.LogcatUtil;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Environment;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.SeqIdFactory;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.laggy.ThreadStackEntity;
import com.meituan.metrics.laggy.anr.AnrCallback;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.metrics.util.ThreadStackUtils;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.metrics.util.thread.Task;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.NativeCrashHandler;
import com.meituan.snare.b;
import com.meituan.snare.d;
import com.meituan.snare.k;
import com.meituan.snare.l;
import com.meituan.snare.m;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.xm.im.message.bean.Message;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsAnrManager implements AnrCallback {
    public static final long ANR_THRESHOLD = 5000;
    private static final String CIPS_CHANNEL_ANR_TS = "metricx_anr_occur_ts";
    private static final String CIPS_KEY_ANR_TS = "anrOccurTs";
    private static final String CIPS_KEY_USE_SIGNAL = "useSignalAnr";
    private static final String ON_BACKGROUND = "onBackground";
    private static final String ON_FOREGROUND = "onForeground";
    public static final String TAG = "MetricsAnrManager";
    private static final String TRACE_PATH = "/data/anr/";
    private static final String TRACE_PATH_FILE = "/data/anr/traces.txt";
    private static final long VALIDATE_TIME = 3600000;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean reportEmptyErrorInfoAnr = false;
    private static MetricsAnrManager sInstance = new MetricsAnrManager();
    private q anrOccurTsStorage;
    private String anrPath;
    private Context context;
    private d exceptionHandler;
    private AnrFileObserver fileObserver;
    private boolean init;
    private volatile boolean lastAnrHasTrace;
    private volatile String lastAnrInfo;
    private long lastAnrOccurTs;
    private volatile long lastAnrTime;
    private boolean lastUseSignal;
    private CopyOnWriteArrayList<AnrCallback> mCallbacks;
    private volatile boolean needBreak;

    public static MetricsAnrManager getInstance() {
        return sInstance;
    }

    public MetricsAnrManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81f2e5be919555b79672a721145dda86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81f2e5be919555b79672a721145dda86");
            return;
        }
        this.init = false;
        this.needBreak = false;
        this.mCallbacks = new CopyOnWriteArrayList<>();
        this.anrOccurTsStorage = null;
    }

    public void init(Context context) {
        d dVar;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2577bb1b75abf7a275a850fe835ffd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2577bb1b75abf7a275a850fe835ffd2");
        } else if (this.init || context == null) {
        } else {
            this.context = context;
            if (ProcessUtils.isMainProcess(context)) {
                this.anrOccurTsStorage = q.a(context, CIPS_CHANNEL_ANR_TS);
                this.lastAnrOccurTs = this.anrOccurTsStorage.b(CIPS_KEY_ANR_TS, -1L);
                this.lastUseSignal = this.anrOccurTsStorage.b(CIPS_KEY_USE_SIGNAL, false);
                this.anrOccurTsStorage.a(CIPS_KEY_ANR_TS, -1L);
                this.anrOccurTsStorage.a(CIPS_KEY_USE_SIGNAL, Metrics.getInstance().getAppConfig().isSignalAnrDetectorEnable());
                AnrSLA.getInstance().init(context);
                AnrSLA.getInstance().setAnrCIPS(CIPS_KEY_USE_SIGNAL, Metrics.getInstance().getAppConfig().isSignalAnrDetectorEnable());
            }
            d.a aVar = new d.a(context, new l() { // from class: com.meituan.metrics.laggy.anr.MetricsAnrManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                public void report(k kVar) {
                }
            });
            aVar.b = Constants.METRICS;
            aVar.c = Metrics.getInstance().getAppConfig().getReportStrategy();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "04cb7990f282a44350bdc136550503bc", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (d) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "04cb7990f282a44350bdc136550503bc");
            } else if (aVar.f == null) {
                throw new RuntimeException("need set reporter!!!");
            } else {
                if ((aVar.c instanceof b) && TextUtils.isEmpty(aVar.b)) {
                    throw new RuntimeException("DefaultStrategy need set name!!!");
                }
                dVar = new d(aVar.e, aVar.b, aVar.c, aVar.d, aVar.f);
            }
            this.exceptionHandler = dVar;
            this.init = true;
            if (this.fileObserver == null) {
                fetchObserverPath();
                this.fileObserver = new AnrFileObserver(this.anrPath, this);
                this.fileObserver.startWatching();
                AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_MONITOR_AVAILABLE_COUNT);
            }
        }
    }

    private void fetchObserverPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf64d51c661cb5f0160157828518c27b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf64d51c661cb5f0160157828518c27b");
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.anrPath = TRACE_PATH_FILE;
        } else if (Build.VERSION.SDK_INT >= 21) {
            File[] listFiles = new File("/proc/").listFiles(new FilenameFilter() { // from class: com.meituan.metrics.laggy.anr.MetricsAnrManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    Object[] objArr2 = {file, str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "38faaa1ade20aa90d9e11e8d3cbdebfb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "38faaa1ade20aa90d9e11e8d3cbdebfb")).booleanValue() : str.toLowerCase().startsWith("mtk_");
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                this.anrPath = "/data/anr/";
            } else {
                this.anrPath = TRACE_PATH_FILE;
            }
        } else {
            this.anrPath = "/data/anr/";
        }
    }

    @Override // com.meituan.metrics.laggy.anr.AnrCallback
    public void onAnrEvent(final long j, final String str, final List<ThreadStackEntity> list, final AnrCallback.ANR_DETECT_TYPE anr_detect_type, final JSONObject jSONObject) {
        Object[] objArr = {new Long(j), str, list, anr_detect_type, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b38eefcb6130be21a537232ce4c8b94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b38eefcb6130be21a537232ce4c8b94");
            return;
        }
        this.needBreak = !TextUtils.isEmpty(str);
        Logger.getMetricsLogger().d(TAG, "onAnrEvent", str, "detectType", anr_detect_type);
        ThreadManager.getInstance().postIO(new Task() { // from class: com.meituan.metrics.laggy.anr.MetricsAnrManager.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.util.thread.Task
            public void schedule() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "35e67bdf0aebcac83cfc1304b75f95c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "35e67bdf0aebcac83cfc1304b75f95c6");
                    return;
                }
                Iterator it = MetricsAnrManager.this.mCallbacks.iterator();
                while (it.hasNext()) {
                    ((AnrCallback) it.next()).onAnrEvent(j, str, list, anr_detect_type, jSONObject);
                }
                MetricsAnrManager.this.collectAnr(j, str, list, anr_detect_type, jSONObject);
            }
        });
    }

    public void registerCallback(@NonNull AnrCallback anrCallback) {
        Object[] objArr = {anrCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b93765a573411ae34d594c805d949f47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b93765a573411ae34d594c805d949f47");
        } else {
            this.mCallbacks.add(anrCallback);
        }
    }

    public void removeCallback(@NonNull AnrCallback anrCallback) {
        Object[] objArr = {anrCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7bdda179b686f88cccf7b9673e4e75a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7bdda179b686f88cccf7b9673e4e75a");
        } else {
            this.mCallbacks.remove(anrCallback);
        }
    }

    private boolean needReport(AnrCallback.ANR_DETECT_TYPE anr_detect_type, JSONObject jSONObject, boolean z) {
        Object[] objArr = {anr_detect_type, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61bf1b969bf06d96916ff4b98212c7b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61bf1b969bf06d96916ff4b98212c7b4")).booleanValue();
        }
        if (anr_detect_type != AnrCallback.ANR_DETECT_TYPE.SIGNAL) {
            return !z || reportEmptyErrorInfoAnr;
        } else if (z) {
            return jSONObject.optBoolean(AnrConstants.SIGNAL_MAIN_THREAD_BLOCK, false);
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public void collectAnr(long j, String str, List<ThreadStackEntity> list, AnrCallback.ANR_DETECT_TYPE anr_detect_type, JSONObject jSONObject) {
        boolean z;
        int i;
        String allThreadStackTrace;
        Object[] objArr = {new Long(j), str, list, anr_detect_type, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        int i2 = 1;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6b45125d210df013ed5a4a585ca8c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6b45125d210df013ed5a4a585ca8c8f");
            return;
        }
        this.needBreak = false;
        Environment environment = Metrics.getEnvironment();
        String actions = UserActionsProvider.getInstance().getActions(true);
        String str2 = AppBus.getInstance().isForeground() ? ON_FOREGROUND : ON_BACKGROUND;
        List<ActivityManager.ProcessErrorStateInfo> processErrorStateInfo = getProcessErrorStateInfo(anr_detect_type, jSONObject);
        boolean z2 = processErrorStateInfo == null;
        if (!needReport(anr_detect_type, jSONObject, z2)) {
            AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_MAIN_CHECK_FAIL_COUNT);
            return;
        }
        if (z2) {
            processErrorStateInfo = new LinkedList<>();
            addManualProcessErrorInfo(processErrorStateInfo);
        }
        if (this.context == null || environment == null || processErrorStateInfo.size() <= 0) {
            return;
        }
        ILogger metricsLogger = Logger.getMetricsLogger();
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processErrorStateInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ActivityManager.ProcessErrorStateInfo next = it.next();
            if (next == null || next.condition != 2) {
                i2 = 1;
            } else {
                String packageName = this.context.getPackageName();
                if (TextUtils.isEmpty(packageName) || next.pid != Process.myPid()) {
                    AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_OTHER_CHECK_FAIL_COUNT);
                    return;
                }
                AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_CHECK_PASS_COUNT);
                AnrEvent anrEvent = new AnrEvent();
                anrEvent.setGuid(UUID.randomUUID().toString());
                anrEvent.setAnrVersion(Internal.getAppEnvironment().getAppVersion());
                anrEvent.setActivity(next.tag);
                anrEvent.setTimestamp(j);
                anrEvent.setcActivity(actions);
                anrEvent.setErrorMsg(next.longMsg);
                anrEvent.setShortMst(next.shortMsg);
                anrEvent.setCh(environment.getCh());
                anrEvent.setNet(environment.getNet());
                anrEvent.setCity(environment.getCityId());
                anrEvent.setApkHash(environment.getApkHash());
                anrEvent.setUuid(environment.getUuid());
                anrEvent.setPid(MetricsActivityLifecycleManager.getInstance().getPageSessionID());
                anrEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
                anrEvent.setAppState(str2);
                anrEvent.setErrorInfoStatus(z2);
                anrEvent.setDetectType(anr_detect_type);
                if (anr_detect_type == AnrCallback.ANR_DETECT_TYPE.SIGNAL) {
                    int optInt = jSONObject.optInt(AnrConstants.SIGNAL_CODE, -1);
                    anrEvent.setMainThreadBlock(jSONObject.optBoolean(AnrConstants.SIGNAL_MAIN_THREAD_BLOCK, false));
                    anrEvent.setSignal(optInt);
                }
                setStackTrace(anrEvent, list);
                synchronized (this) {
                    long abs = Math.abs(j - this.lastAnrTime);
                    if (abs < ANR_THRESHOLD) {
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = "Anr时间间隔错误";
                        metricsLogger.d(TAG, objArr2);
                        AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_INVALID_THRESHOLD_COUNT);
                        return;
                    }
                    this.lastAnrTime = j;
                    if (TextUtils.isEmpty(str)) {
                        i = 1;
                    } else {
                        i = 1;
                        i = 1;
                        if (!str.contains("..")) {
                            parseTraceFile(new File("/data/anr/" + str), anrEvent, packageName);
                        }
                    }
                    String str3 = anrEvent.getMainThread() + anrEvent.getShortMst();
                    if (abs < 3600000 && TextUtils.equals(this.lastAnrInfo, str3) && (this.lastAnrHasTrace || TextUtils.isEmpty(str))) {
                        metricsLogger.dt(TAG, "相同anr，过滤", new Object[0]);
                        AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_SAME_ANR_COUNT);
                        return;
                    }
                    anrEvent.setSliverTrace(Sliver.getInstance().getAnrUUID());
                    if (TextUtils.isEmpty(anrEvent.getTraceFile()) && Build.VERSION.SDK_INT >= 23 && MetricsRemoteConfigManager.getInstance().isNativeTraceEnable()) {
                        String anrUUID = Sliver.getInstance().getAnrUUID();
                        m a = m.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = m.a;
                        if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "5df2eb64e96afc377efff43ae5e944db", RobustBitConfig.DEFAULT_VALUE)) {
                            allThreadStackTrace = (String) PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "5df2eb64e96afc377efff43ae5e944db");
                        } else {
                            allThreadStackTrace = !a.d ? "" : NativeCrashHandler.getInstance().getAllThreadStackTrace();
                        }
                        if (anrUUID != null) {
                            anrEvent.setTraceFile("SliverTrace: " + anrUUID + "\n" + allThreadStackTrace);
                        } else {
                            anrEvent.setTraceFile(allThreadStackTrace);
                        }
                    }
                    Object[] objArr4 = new Object[3];
                    objArr4[0] = str3;
                    objArr4[i] = "lastAnrInfo";
                    objArr4[2] = this.lastAnrInfo;
                    metricsLogger.dt(TAG, "tempAnrInfo", objArr4);
                    this.lastAnrInfo = str3;
                    if (TextUtils.isEmpty(str)) {
                        this.lastAnrHasTrace = false;
                    } else {
                        this.lastAnrHasTrace = i;
                    }
                    if (TextUtils.isEmpty(anrEvent.getTraceFile())) {
                        setOtherThread(anrEvent);
                    }
                    Object[] objArr5 = new Object[i];
                    objArr5[0] = anrEvent;
                    metricsLogger.dt(TAG, "AnrEvent", objArr5);
                    Metrics.getInstance().getAppConfig().getReportStrategy();
                    Looper.getMainLooper().getThread();
                    new Throwable(anrEvent.getMainThread());
                    metricsLogger.dt(TAG, "reportAnr", new Object[0]);
                    reportAnr(anrEvent);
                    AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_ANR_REPORT_COUNT);
                    cacheAnrOccurTs(anr_detect_type, j);
                    z = true;
                }
            }
        }
        if (z) {
            return;
        }
        AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_OTHER_CHECK_FAIL_COUNT);
    }

    private void reportAnr(AnrEvent anrEvent) {
        Object[] objArr = {anrEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50dcd1ee9d05a20605099d8fc27ed07b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50dcd1ee9d05a20605099d8fc27ed07b");
            return;
        }
        Environment environment = Metrics.getEnvironment();
        if (environment == null) {
            return;
        }
        String token = environment.getToken();
        Log.Builder builder = new Log.Builder(getLog(anrEvent));
        builder.tag("anr");
        builder.reportChannel("c3");
        builder.ts(anrEvent.getTimestamp());
        HashMap hashMap = new HashMap();
        hashMap.put("type", "anr");
        hashMap.put("token", token);
        hashMap.put("platform", environment.os);
        hashMap.put("appVersion", anrEvent.getAnrVersion());
        hashMap.put("os", environment.os);
        hashMap.put("osVersion", environment.osVersion);
        hashMap.put("sdkVersion", environment.sdkVersion);
        hashMap.put("apkHash", anrEvent.getApkHash());
        hashMap.put(NetLogConstants.Environment.BUILD_VERSION, environment.getBuildVersion());
        hashMap.put("occurTime", TimeUtil.formatDateTime(anrEvent.getTimestamp()));
        hashMap.put("uploadTime", TimeUtil.formatDateTime(TimeUtil.currentTimeMillisSNTP()));
        hashMap.put("guid", anrEvent.getGuid());
        hashMap.put("lastPage", anrEvent.getActivity());
        hashMap.put("pageStack", anrEvent.getcActivity());
        hashMap.put("appStore", anrEvent.getCh());
        hashMap.put("city", String.valueOf(anrEvent.getCity()));
        hashMap.put("network", anrEvent.getNet());
        hashMap.put("carrier", environment.getMccmnc());
        hashMap.put("uuid", environment.getUuid());
        hashMap.put("userInfo", getUserInfo());
        hashMap.put(com.dianping.titans.utils.Constants.MULTI_PROCESS_PID, Integer.valueOf(anrEvent.getPid()));
        hashMap.put(Message.SID, anrEvent.getSid());
        hashMap.put("appState", anrEvent.getAppState());
        hashMap.put("isProcessErrorStateInfoEmpty", Boolean.valueOf(anrEvent.getErrorInfoStatus()));
        hashMap.put("sliverTrace", anrEvent.getSliverTrace());
        hashMap.put("signal", Integer.valueOf(anrEvent.getSignal()));
        hashMap.put("detectType", String.valueOf(anrEvent.getDetectType()));
        hashMap.put("isMainThreadBlock", Boolean.valueOf(anrEvent.getMainThreadBlock()));
        SeqIdFactory.getInstance(Metrics.getInstance().getContext()).setSequenceId("anr", hashMap);
        DeviceUtil.addDeviceInfo(hashMap, "anr", this.context);
        String session = environment.getSession();
        if (!TextUtils.isEmpty(session)) {
            hashMap.put("lx_sid", session);
        }
        Logger.getMetricsLogger().d(TAG, "Babel map", hashMap);
        builder.optional(hashMap);
        builder.token(token);
        builder.lv4LocalStatus(true);
        KiteFly.logVIP(builder.build(), 1);
        PrintStream printStream = System.out;
        printStream.println("Anr GUID: " + anrEvent.getGuid());
    }

    private String getLog(AnrEvent anrEvent) {
        Object[] objArr = {anrEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeafc95fba68b1dbfea6b937d381e6a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeafc95fba68b1dbfea6b937d381e6a2");
        }
        if (anrEvent == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(anrEvent.getMainThread())) {
            sb.append(anrEvent.getMainThread());
            sb.append(Constants.SPLITTER);
        }
        if (!TextUtils.isEmpty(anrEvent.getShortMst())) {
            sb.append("ShortMst\n");
            sb.append(anrEvent.getShortMst());
            sb.append(Constants.SPLITTER);
        }
        if (!TextUtils.isEmpty(anrEvent.getErrorMsg())) {
            sb.append("ErrorMsg\n");
            sb.append(anrEvent.getErrorMsg());
            sb.append(Constants.SPLITTER);
        }
        if (!TextUtils.isEmpty(anrEvent.getTraceFile())) {
            sb.append("TracesInfo\n");
            sb.append(anrEvent.getTraceFile());
            sb.append(Constants.SPLITTER);
        }
        if (!TextUtils.isEmpty(anrEvent.allMainThreadStack)) {
            sb.append("AllMainThreadStack\n");
            sb.append(anrEvent.allMainThreadStack);
            sb.append(Constants.SPLITTER);
        }
        if (!TextUtils.isEmpty(anrEvent.getOtherThread())) {
            sb.append("OtherThread\n");
            sb.append(anrEvent.getOtherThread());
            sb.append(Constants.SPLITTER);
        }
        String logcat = LogcatUtil.getLogcat(Process.myPid(), 100);
        if (!TextUtils.isEmpty(logcat)) {
            sb.append("logcat\n");
            sb.append(logcat);
        }
        return sb.toString();
    }

    private String getUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d11a063d3bdf13bf8e1445eae6e3e52a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d11a063d3bdf13bf8e1445eae6e3e52a");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("extra", Metrics.getInstance().getAppConfig().getAnrOption());
            DeviceUtil.getDeviceInfo(jSONObject, Metrics.getInstance().getContext());
            PreloadInjection.appendTags(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void setStackTrace(AnrEvent anrEvent, List<ThreadStackEntity> list) {
        Object[] objArr = {anrEvent, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f491ee19d1728cdaae052949fcae7278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f491ee19d1728cdaae052949fcae7278");
            return;
        }
        try {
            long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (list == null) {
                System.out.println("MetricsAnrManager sampledStacktrace==null");
                list = new ArrayList<>();
            }
            list.add(new ThreadStackEntity(currentTimeMillisSNTP, stackTrace));
            ArrayList arrayList = new ArrayList();
            for (ThreadStackEntity threadStackEntity : list) {
                arrayList.add(threadStackEntity.stackTraceElements);
            }
            anrEvent.setMainThread(ThreadStackUtils.resolveUnionStack(arrayList));
            anrEvent.allMainThreadStack = ThreadStackUtils.getAllStackTrace(list);
        } catch (Throwable unused) {
            System.out.println("MetricsAnrManager setStackTrace Error");
        }
    }

    private void setOtherThread(AnrEvent anrEvent) {
        Object[] objArr = {anrEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190de4ea317d43eedf2e4616d6432c87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190de4ea317d43eedf2e4616d6432c87");
            return;
        }
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                if (entry.getKey() != Looper.getMainLooper().getThread() && entry.getValue().length > 0) {
                    sb.append("#Thread ");
                    sb.append(entry.getKey().getName());
                    sb.append(Constants.SPACE);
                    sb.append(entry.getKey().getId());
                    sb.append('\n');
                    StackTraceElement[] value = entry.getValue();
                    if (value != null && value.length > 0) {
                        for (StackTraceElement stackTraceElement : value) {
                            if (stackTraceElement != null) {
                                sb.append("at ");
                                sb.append(stackTraceElement.toString());
                                sb.append('\n');
                            }
                        }
                    }
                }
            }
            anrEvent.setOtherThread(sb.toString());
        } catch (Throwable unused) {
        }
    }

    private void parseTraceFile(File file, AnrEvent anrEvent, String str) {
        String str2;
        Object[] objArr;
        Object[] objArr2 = {file, anrEvent, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "648f012bb4ef3a2bd51cad4dbfcaa176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "648f012bb4ef3a2bd51cad4dbfcaa176");
            return;
        }
        ILogger metricsLogger = Logger.getMetricsLogger();
        BufferedReader bufferedReader = null;
        StringBuilder sb = null;
        try {
            if (file.exists() && file.canRead()) {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    Pattern compile = Pattern.compile("^\"main\" .*$");
                    boolean z = true;
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (readLine.toLowerCase().contains("cmd line: ")) {
                                String lowerCase = readLine.toLowerCase();
                                if (!lowerCase.contains("cmd line: " + str)) {
                                    break;
                                }
                            }
                            if (readLine.contains("----- end")) {
                                break;
                            } else if (sb == null) {
                                if (compile.matcher(readLine).matches()) {
                                    sb = new StringBuilder();
                                    sb.append(readLine);
                                    sb.append('\n');
                                }
                            } else if (!"".equals(readLine)) {
                                sb.append(readLine);
                                sb.append('\n');
                            } else if (z) {
                                String sb2 = sb.toString();
                                anrEvent.setMainThread(sb2.substring(sb2.indexOf("at ")));
                                z = false;
                            }
                        } else {
                            break;
                        }
                    }
                    if (sb != null) {
                        anrEvent.setTraceFile(sb.toString().trim());
                    }
                    try {
                        bufferedReader2.close();
                        return;
                    } catch (Throwable th) {
                        str2 = TAG;
                        objArr = new Object[]{th.getMessage()};
                        metricsLogger.e(str2, objArr);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        metricsLogger.e(TAG, th.getMessage());
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                return;
                            } catch (Throwable th3) {
                                str2 = TAG;
                                objArr = new Object[]{th3.getMessage()};
                                metricsLogger.e(str2, objArr);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th4) {
                        BufferedReader bufferedReader3 = bufferedReader;
                        if (bufferedReader3 != null) {
                            try {
                                bufferedReader3.close();
                            } catch (Throwable th5) {
                                metricsLogger.e(TAG, th5.getMessage());
                            }
                        }
                        throw th4;
                    }
                }
            }
            metricsLogger.dt(TAG, "invalid path:", file.getAbsolutePath());
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private List<ActivityManager.ProcessErrorStateInfo> getProcessErrorStateInfo(AnrCallback.ANR_DETECT_TYPE anr_detect_type, JSONObject jSONObject) {
        Object[] objArr = {anr_detect_type, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93f5586fabaeefeba7fde5a3b1dd21b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93f5586fabaeefeba7fde5a3b1dd21b0");
        }
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        ILogger metricsLogger = Logger.getMetricsLogger();
        List<ActivityManager.ProcessErrorStateInfo> list = null;
        if (activityManager == null) {
            metricsLogger.d(TAG, "failed to get ActivityManager");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = (m.a().e && anr_detect_type == AnrCallback.ANR_DETECT_TYPE.SIGNAL) ? 15000L : ANR_THRESHOLD;
        boolean z = anr_detect_type == AnrCallback.ANR_DETECT_TYPE.SIGNAL && jSONObject.optBoolean(AnrConstants.SIGNAL_MAIN_THREAD_BLOCK, false);
        List<ActivityManager.ProcessErrorStateInfo> list2 = null;
        while (list2 == null) {
            if (this.needBreak) {
                metricsLogger.dt(TAG, "新的anr来了，处理新的！！", new Object[0]);
                return list;
            }
            try {
                Thread.sleep(200L);
                list2 = activityManager.getProcessesInErrorState();
            } catch (InterruptedException e) {
                metricsLogger.dt(TAG, "InterruptedException", e.getMessage());
            } catch (Throwable unused) {
                return list;
            }
            if (System.currentTimeMillis() - currentTimeMillis > j || z) {
                metricsLogger.dt(TAG, "get processInfo 超时 阈值:", Long.valueOf(j), "getOnceIfMainThreadBlock:", Boolean.valueOf(z));
                break;
            }
            list = null;
        }
        return list2;
    }

    private void addManualProcessErrorInfo(List<ActivityManager.ProcessErrorStateInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "843ea02cf4664505bd6b50ac4c38001d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "843ea02cf4664505bd6b50ac4c38001d");
            return;
        }
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.condition = 2;
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = ProcessUtils.getCurrentProcessName();
        processErrorStateInfo.uid = Process.myUid();
        processErrorStateInfo.tag = UserActionsProvider.getInstance().getLastResumeActivityName();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("condition", processErrorStateInfo.condition);
            jSONObject.put(com.dianping.titans.utils.Constants.MULTI_PROCESS_PID, processErrorStateInfo.pid);
            jSONObject.put("processName", processErrorStateInfo.processName);
            jSONObject.put("uid", processErrorStateInfo.uid);
            jSONObject.put("tag", processErrorStateInfo.tag);
        } catch (Throwable unused) {
        }
        processErrorStateInfo.longMsg = jSONObject.toString();
        processErrorStateInfo.shortMsg = "ProcessStateInfo is actually empty.";
        list.add(processErrorStateInfo);
    }

    public static void setEmptyErrorInfoAnrEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2323479bf5512f8751a371be0294846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2323479bf5512f8751a371be0294846");
            return;
        }
        AnrSLA.getInstance().setAnrCIPS(AnrSLA.CIPS_KEY_ENABLE_EMPTY_PROCESS_INFO, z);
        reportEmptyErrorInfoAnr = z;
    }

    private void cacheAnrOccurTs(AnrCallback.ANR_DETECT_TYPE anr_detect_type, long j) {
        Object[] objArr = {anr_detect_type, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56f0fbfe9862498befc9718ee812b0ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56f0fbfe9862498befc9718ee812b0ee");
        } else if ((anr_detect_type == AnrCallback.ANR_DETECT_TYPE.SIGNAL || anr_detect_type == AnrCallback.ANR_DETECT_TYPE.FILE) && this.anrOccurTsStorage != null) {
            this.anrOccurTsStorage.a(CIPS_KEY_ANR_TS, j);
        }
    }

    public boolean ifLastUseSignal() {
        return this.lastUseSignal;
    }

    public long getLastAnrOccurTs() {
        return this.lastAnrOccurTs;
    }
}
