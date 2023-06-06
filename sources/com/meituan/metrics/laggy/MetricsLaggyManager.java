package com.meituan.metrics.laggy;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Environment;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.SeqIdFactory;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.config.MetricsRemoteConfigV2;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.sampler.MetricSampleManager;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.metrics.util.thread.Task;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import com.sankuai.xm.im.message.bean.Message;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsLaggyManager implements LaggyCallback {
    private static final String LAGGY_DURATION = "duration";
    public static final String MAIN = "main";
    private static final String ON_BACKGROUND = "onBackground";
    private static final String ON_FOREGROUND = "onForeground";
    private static final String RN_THREAD_NAME = "rn_thread_name";
    private static final String TAG = "MetricsLaggyManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MetricsLaggyManager sInstance;
    private Handler handler;
    private boolean isLagEnable;
    private int mLagThreshold;
    private int mMaxReportTimes;
    private final Map<String, LaggyMonitor> mMonitorMapp;
    private final Map<String, Integer> mRemainReportCnt;
    private LaggyMonitor mainMonitor;

    public MetricsLaggyManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b9556ac28808b789d40ce02ed86816", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b9556ac28808b789d40ce02ed86816");
            return;
        }
        this.mMaxReportTimes = 0;
        this.mRemainReportCnt = new HashMap();
        this.mMonitorMapp = new HashMap();
    }

    public static MetricsLaggyManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a64f16982a641c31de2b68745fe5971", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLaggyManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a64f16982a641c31de2b68745fe5971");
        }
        if (sInstance == null) {
            synchronized (MetricsLaggyManager.class) {
                if (sInstance == null) {
                    sInstance = new MetricsLaggyManager();
                }
            }
        }
        return sInstance;
    }

    public synchronized void init(boolean z, int i, int i2, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db2f6043ae9250102eb635539861a1a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db2f6043ae9250102eb635539861a1a0");
            return;
        }
        if (Metrics.debug) {
            i2 = Metrics.getInstance().getAppConfig().getDebugMaxLaggyReportTimes();
        }
        this.isLagEnable = z;
        this.mMaxReportTimes = Math.max(0, i2);
        this.mLagThreshold = Math.max(0, i);
        if ((z && i > 0) || z2) {
            this.mainMonitor = LaggyMonitor.newMainLaggyMonitor(z, this.mLagThreshold, z2);
            this.mMonitorMapp.put(this.mainMonitor.targetThreadName, this.mainMonitor);
            this.mRemainReportCnt.put(this.mainMonitor.targetThreadName, Integer.valueOf(this.mMaxReportTimes));
            this.mainMonitor.register();
        }
        if (z2) {
            b.a(c.a(), new Task() { // from class: com.meituan.metrics.laggy.MetricsLaggyManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.util.thread.Task
                public void schedule() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b7f7e028a548fc89d00f2c2f6954b289", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b7f7e028a548fc89d00f2c2f6954b289");
                        return;
                    }
                    MetricsAnrManager.getInstance().init(Metrics.getInstance().getContext());
                    MetricsLaggyManager.this.mainMonitor.setAnrCallback(MetricsAnrManager.getInstance());
                }
            });
        }
    }

    public void setLagConfig(boolean z, int i, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1ad17d5f0c7597d4f79d1d98f825129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1ad17d5f0c7597d4f79d1d98f825129");
            return;
        }
        this.isLagEnable = z;
        this.mLagThreshold = Math.max(0, i);
        this.mMaxReportTimes = Math.max(0, i2);
    }

    public synchronized void addLaggyMonitor(Looper looper, String str) {
        Object[] objArr = {looper, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "589a9e197ba1dd42330fcf16a29c10ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "589a9e197ba1dd42330fcf16a29c10ba");
            return;
        }
        if (this.isLagEnable && looper != null) {
            if (looper == Looper.getMainLooper()) {
                return;
            }
            if (this.mMonitorMapp.containsKey(str)) {
                return;
            }
            if (this.mLagThreshold == 0 && this.mMaxReportTimes == 0) {
                MetricsRemoteConfigV2 remoteConfigV2 = MetricsRemoteConfigManager.getInstance().getRemoteConfigV2();
                if (remoteConfigV2 != null && remoteConfigV2.isLagEnable()) {
                    this.mLagThreshold = Math.max(0, remoteConfigV2.lagThreshold);
                    this.mMaxReportTimes = Math.max(0, remoteConfigV2.maxReportCallstackTimes);
                }
                return;
            }
            if (this.mLagThreshold > 0) {
                LaggyMonitor laggyMonitor = new LaggyMonitor(this.mLagThreshold, looper, str);
                this.mMonitorMapp.put(laggyMonitor.targetThreadName, laggyMonitor);
                this.mRemainReportCnt.put(laggyMonitor.targetThreadName, Integer.valueOf(this.mMaxReportTimes));
                laggyMonitor.register();
            }
        }
    }

    @Deprecated
    public synchronized void addLaggyLopperPrinter(Looper looper, String str) {
        Object[] objArr = {looper, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd10621a7e94ae86047b8f88dfe54800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd10621a7e94ae86047b8f88dfe54800");
            return;
        }
        if (this.isLagEnable && looper != null) {
            if (looper == Looper.getMainLooper()) {
                return;
            }
            if (this.mMonitorMapp.containsKey(str)) {
                return;
            }
            if (this.mLagThreshold == 0 && this.mMaxReportTimes == 0) {
                MetricsRemoteConfigV2 remoteConfigV2 = MetricsRemoteConfigManager.getInstance().getRemoteConfigV2();
                if (remoteConfigV2 != null && remoteConfigV2.isLagEnable()) {
                    this.mLagThreshold = Math.max(0, remoteConfigV2.lagThreshold);
                    this.mMaxReportTimes = Math.max(0, remoteConfigV2.maxReportCallstackTimes);
                }
                return;
            }
            if (this.mLagThreshold > 0) {
                LaggyMonitor laggyMonitor = new LaggyMonitor(this.mLagThreshold, looper, str);
                this.mMonitorMapp.put(laggyMonitor.targetThreadName, laggyMonitor);
                this.mRemainReportCnt.put(laggyMonitor.targetThreadName, Integer.valueOf(this.mMaxReportTimes));
                laggyMonitor.register();
            }
        }
    }

    public Handler createLaggyDetectHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ace1a628ff76290e98861c4bcf92a999", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ace1a628ff76290e98861c4bcf92a999");
        }
        if (this.handler == null) {
            this.handler = new Handler(ThreadManager.getInstance().getMetricsBgLooper());
        }
        return this.handler;
    }

    @Override // com.meituan.metrics.laggy.LaggyCallback
    public void onLaggyEvent(long j, final String str, String str2, List<ThreadStackEntity> list) {
        Object[] objArr = {new Long(j), str, str2, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e545e661a5e9c5650aa9330594bad091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e545e661a5e9c5650aa9330594bad091");
        } else if (list == null || list.isEmpty()) {
        } else {
            final LaggyEvent laggyEvent = new LaggyEvent(UserActionsProvider.getInstance().getLastResumeActivityName(), j, this.mLagThreshold, list, str2);
            laggyEvent.timestamp = TimeUtil.currentTimeMillisSNTP();
            laggyEvent.guid = UUID.randomUUID().toString();
            laggyEvent.isScrolling = MetricSampleManager.getInstance().isPageScrolling();
            String str3 = AppBus.getInstance().isForeground() ? ON_FOREGROUND : ON_BACKGROUND;
            laggyEvent.setPid(MetricsActivityLifecycleManager.getInstance().getPageSessionID());
            laggyEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
            laggyEvent.setAppState(str3);
            Metrics.getInstance().getInterceptorChain().onNewEvent(laggyEvent);
            Integer num = this.mRemainReportCnt.get(str);
            if (num != null) {
                Integer valueOf = Integer.valueOf(num.intValue() - 1);
                if (num.intValue() > 0) {
                    this.mRemainReportCnt.put(str, valueOf);
                    ThreadManager.getInstance().postNet(new Task() { // from class: com.meituan.metrics.laggy.MetricsLaggyManager.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.metrics.util.thread.Task
                        public void schedule() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7ae4f0b3a1d732975af3526c08b72949", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7ae4f0b3a1d732975af3526c08b72949");
                                return;
                            }
                            MetricsLaggyManager.this.reportLagLog(laggyEvent, str);
                            PrintStream printStream = System.out;
                            printStream.println("LagLog GUID: " + laggyEvent.guid);
                            Metrics.getInstance().getInterceptorChain().onReportEvent(laggyEvent);
                        }
                    });
                    return;
                }
            }
            LaggyMonitor laggyMonitor = this.mMonitorMapp.get(str);
            if (laggyMonitor != null) {
                laggyMonitor.setLagReportCountLimited();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportLagLog(LaggyEvent laggyEvent, String str) {
        Environment environment;
        Object[] objArr = {laggyEvent, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05833b646e9b2d8e01d066d27746072d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05833b646e9b2d8e01d066d27746072d");
        } else if (laggyEvent == null || (environment = Metrics.getEnvironment()) == null || TextUtils.isEmpty(environment.getToken())) {
        } else {
            StringBuilder sb = new StringBuilder(laggyEvent.resolveUnionStack());
            String allStack = laggyEvent.getAllStack();
            if (!TextUtils.isEmpty(allStack)) {
                sb.append("\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nAllMainThreadStack");
                sb.append('\n');
                sb.append(allStack);
                sb.append('\n');
            }
            if (!TextUtils.isEmpty(laggyEvent.cpuStat)) {
                sb.append("\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nCpuStat");
                sb.append('\n');
                sb.append(laggyEvent.cpuStat);
                sb.append('\n');
            }
            if (!TextUtils.isEmpty(laggyEvent.pendingWorkFinishers)) {
                sb.append("\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nQueuedWork PendingWorkFinishers");
                sb.append('\n');
                sb.append(laggyEvent.pendingWorkFinishers);
                sb.append('\n');
            }
            Log.Builder builder = new Log.Builder(sb.toString());
            builder.tag("lag_log");
            builder.reportChannel("c4");
            HashMap hashMap = new HashMap();
            hashMap.put("type", "lag_log");
            hashMap.put(Constants.LAG_THRESHOLD, Long.valueOf(laggyEvent.getThreshold()));
            hashMap.put("token", environment.getToken());
            hashMap.put("platform", environment.os);
            hashMap.put("appVersion", Internal.getAppEnvironment().getAppVersion());
            hashMap.put("os", environment.os);
            hashMap.put("osVersion", environment.osVersion);
            hashMap.put("sdkVersion", environment.sdkVersion);
            hashMap.put("apkHash", environment.getApkHash());
            hashMap.put(NetLogConstants.Environment.BUILD_VERSION, environment.getBuildVersion());
            hashMap.put("occurTime", TimeUtil.formatDateTime(laggyEvent.timestamp));
            hashMap.put("uploadTime", TimeUtil.formatDateTime(TimeUtil.currentTimeMillisSNTP()));
            hashMap.put("guid", laggyEvent.guid);
            hashMap.put("lastPage", laggyEvent.getPage());
            hashMap.put("pageStack", UserActionsProvider.getInstance().getActions(true));
            hashMap.put("appStore", environment.getCh());
            hashMap.put("city", String.valueOf(environment.getCityId()));
            hashMap.put("network", environment.getNet());
            hashMap.put("carrier", environment.getMccmnc());
            hashMap.put("uuid", environment.getUuid());
            hashMap.put(com.dianping.titans.utils.Constants.MULTI_PROCESS_PID, Integer.valueOf(laggyEvent.getPid()));
            hashMap.put(Message.SID, laggyEvent.getSid());
            hashMap.put("appState", laggyEvent.getAppState());
            DeviceUtil.addDeviceInfo(hashMap, "lag_log", Metrics.getInstance().getContext());
            String session = environment.getSession();
            if (!TextUtils.isEmpty(session)) {
                hashMap.put("lx_sid", session);
            }
            if (laggyEvent.isScrolling) {
                hashMap.put("uiState", Constants.FPS_TYPE_SCROLL);
            }
            hashMap.put("userInfo", getUserInfo(laggyEvent, str));
            SeqIdFactory.getInstance(Metrics.getInstance().getContext()).setSequenceId("lag_log", hashMap);
            Logger.getMetricsLogger().d("LagLog Babel map", hashMap);
            builder.optional(hashMap);
            builder.token(environment.getToken());
            builder.lv4LocalStatus(true);
            Babel.logRT(builder.build());
        }
    }

    private String getUserInfo(LaggyEvent laggyEvent, String str) {
        Object[] objArr = {laggyEvent, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8545fbe93ee4d22b94ca167fc67b8fdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8545fbe93ee4d22b94ca167fc67b8fdd");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RN_THREAD_NAME, str);
            jSONObject.put("duration", laggyEvent.getDuration());
            DeviceUtil.getDeviceInfo(jSONObject, Metrics.getInstance().getContext());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
