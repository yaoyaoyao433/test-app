package com.meituan.metrics;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.android.common.metricx.config.MetricXConfigManager;
import com.meituan.android.common.metricx.fileuploader.FileUpLoader;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.helpers.SysDateAlarm;
import com.meituan.android.common.metricx.koom.Koom;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.cache.MetricsCacheManager;
import com.meituan.metrics.config.MetricsConfig;
import com.meituan.metrics.config.MetricsLocalSwitchConfig;
import com.meituan.metrics.config.MetricsLocalSwitchConfigManager;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.config.MetricsRemoteConfigV2;
import com.meituan.metrics.interceptor.MetricsInterceptor;
import com.meituan.metrics.laggy.MetricsLaggyManager;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.laggy.anr.SignalAnrDetector;
import com.meituan.metrics.laggy.respond.RespondLaggyManager;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.net.report.MetricsReportManager;
import com.meituan.metrics.sampler.MetricSampleManager;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.traffic.MetricsNetworkInterceptor;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.OnTrafficInterceptedListener;
import com.meituan.metrics.traffic.OnTrafficReportListener;
import com.meituan.metrics.traffic.TrafficListenerProxy;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.TrafficTrace;
import com.meituan.metrics.traffic.report.ReportDetailManager;
import com.meituan.metrics.traffic.trace.MetricsTrafficListener;
import com.meituan.metrics.util.AppUtils;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.q;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Metrics {
    public static final String TAG = "Metrics";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static boolean debug = false;
    private static Environment environment = null;
    private static boolean hasInit = false;
    private static boolean logEnable = false;
    private static Metrics sInstance;
    private Context context;
    private final MetricsInterceptorChain interceptorChain;
    private MetricsSpeedMeterTask launchSpeedTask;
    private MetricsConfig mLocalConfig;
    private MetricsMrnJSMemoryCollectCallBack metricsMrnJSMemoryCollectCallBack;

    public static void setOpenFsp(boolean z) {
    }

    @Deprecated
    public void addTrafficTrace(@NonNull TrafficTrace trafficTrace) {
    }

    @Deprecated
    public void setTraceEnable(@NonNull String str, boolean z) {
    }

    public Metrics() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71de5e21867bc4ab6b678a6233e77085", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71de5e21867bc4ab6b678a6233e77085");
            return;
        }
        this.interceptorChain = new MetricsInterceptorChain();
        this.launchSpeedTask = MetricsSpeedMeterTask.createLaunchSpeedMeterTask();
    }

    public static Metrics getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4943d5118179a48c406f0bef381feeb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4943d5118179a48c406f0bef381feeb8");
        }
        if (sInstance == null) {
            synchronized (Metrics.class) {
                if (sInstance == null) {
                    sInstance = new Metrics();
                }
            }
        }
        return sInstance;
    }

    @Deprecated
    public Context getContext() {
        return this.context;
    }

    @Deprecated
    public static Environment getEnvironment() {
        return environment;
    }

    public MetricsInterceptorChain getInterceptorChain() {
        return this.interceptorChain;
    }

    public Metrics init(final Context context, @NonNull MetricsConfig metricsConfig) {
        Object[] objArr = {context, metricsConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62927001d845b72505eb884fb4c51166", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62927001d845b72505eb884fb4c51166");
        }
        if (this.context != null) {
            Logger.getMetricsLogger().e("Metrics already initialized.");
            return this;
        }
        Internal.sMetricsConfig = metricsConfig;
        Logger.getMetricsLogger().d("Metrics Init");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.context = context;
        ContextProvider.getInstance().updateContext(this.context);
        ThreadManager.getInstance().prepare();
        MetricsActivityLifecycleManager.getInstance().prepare();
        this.mLocalConfig = metricsConfig;
        environment = new Environment(context, metricsConfig);
        MetricsCacheManager.getInstance().init(context);
        b.a(c.a(), new Runnable() { // from class: com.meituan.metrics.Metrics.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a31f7d35bb7e65ebf801d65a4ed56765", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a31f7d35bb7e65ebf801d65a4ed56765");
                    return;
                }
                SysDateAlarm.getInstance().init(context);
                Koom.getInstance().start();
                Metrics.this.initMetricWithRemoteConfig();
                MetricsTrafficManager.getInstance().init(context);
                DeviceUtil.prepareDeviceLevelFromRemote(context);
                Metrics.this.initMetricXConfig();
                Context context2 = context;
                Object[] objArr3 = {context2};
                ChangeQuickRedirect changeQuickRedirect4 = PrivacyUtil.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "3ce4bfce51f7f1f8334c18fb49da0c3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "3ce4bfce51f7f1f8334c18fb49da0c3d");
                } else {
                    PrivacyUtil.c = context2.getPackageName();
                    Horn.register("backup_privacy_config", new HornCallback() { // from class: com.meituan.privacy.PrivacyUtil.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.common.horn.HornCallback
                        public final void onChanged(boolean z, String str) {
                            Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "e2a550f37dff968c563c60037e382a50", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "e2a550f37dff968c563c60037e382a50");
                            } else if (z) {
                                try {
                                    PrivacyUtil.b = (a) new Gson().fromJson(str, (Class<Object>) a.class);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    });
                }
                RespondLaggyManager.getInstance();
                FileUpLoader.getInstance().init(context);
            }
        });
        c.c("metricx-delay-task").schedule(new Runnable() { // from class: com.meituan.metrics.Metrics.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "45b211ead5caa1119310eb77eee9e46f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "45b211ead5caa1119310eb77eee9e46f");
                } else {
                    Metrics.this.executeHeavyTasks();
                }
            }
        }, MetricsAnrManager.ANR_THRESHOLD, TimeUnit.MILLISECONDS);
        hasInit = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeHeavyTasks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca29764b927986e9db3f1953515f5c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca29764b927986e9db3f1953515f5c6b");
        } else {
            NativeToolsHandler.getInstance().init();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMetricWithRemoteConfig() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "149b1222f41f22e3cec5798e75b74218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "149b1222f41f22e3cec5798e75b74218");
            return;
        }
        ILogger metricsLogger = Logger.getMetricsLogger();
        MetricsRemoteConfigV2 remoteConfigV2 = MetricsRemoteConfigManager.getInstance().getRemoteConfigV2();
        if (remoteConfigV2 == null) {
            return;
        }
        metricsLogger.d("MetricsRemoteConfigV2", remoteConfigV2);
        MetricsCacheManager.getInstance().setConfig(remoteConfigV2);
        boolean z2 = this.mLocalConfig.isLagEnable() && remoteConfigV2.isLagEnable();
        boolean z3 = this.mLocalConfig.isAnrEnable() && remoteConfigV2.isAnrEnable();
        boolean isSignalAnrDetectorEnable = this.mLocalConfig.isSignalAnrDetectorEnable();
        if (z3 && isSignalAnrDetectorEnable) {
            MetricsAnrManager.getInstance().init(this.context);
            SignalAnrDetector.getInstance().init(this.context);
        }
        boolean z4 = z3 && !isSignalAnrDetectorEnable;
        if (z2 || z4) {
            metricsLogger.d("Metrics start lag monitor");
            MetricsLaggyManager.getInstance().init(z2, remoteConfigV2.lagThreshold, remoteConfigV2.maxReportCallstackTimes, z4);
        } else {
            metricsLogger.d("Metrics start other thread lag monitor");
            MetricsLaggyManager metricsLaggyManager = MetricsLaggyManager.getInstance();
            if (this.mLocalConfig.isLagEnable() && remoteConfigV2.isLagEnable()) {
                z = true;
            }
            metricsLaggyManager.setLagConfig(z, remoteConfigV2.lagThreshold, remoteConfigV2.maxReportCallstackTimes);
        }
        if ((!this.mLocalConfig.isStartupTimerEnable() || !MetricsRemoteConfigManager.getInstance().isAppStartupEnable()) && this.launchSpeedTask != null) {
            this.launchSpeedTask.disable();
        }
        if (this.mLocalConfig.isSampleEnable()) {
            metricsLogger.d("Metrics start sample monitor");
            MetricSampleManager.getInstance().init(this.mLocalConfig.isNativeFPSSampleEnable());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMetricXConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dbbf84eeabbac685cc0c98c03b4a990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dbbf84eeabbac685cc0c98c03b4a990");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("babelToken", Babel.getBabelConfig() != null ? Babel.getBabelConfig().getToken() : "-1");
        Horn.register("metricx", new HornCallback() { // from class: com.meituan.metrics.Metrics.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34dc52506e9b96b3d9ab32d94d7ce5cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34dc52506e9b96b3d9ab32d94d7ce5cd");
                } else if (z) {
                    Metrics.this.parseMetricXConfig(str);
                } else {
                    ILogger metricsLogger = Logger.getMetricsLogger();
                    metricsLogger.d("Error in Horn config metricx: " + str);
                }
            }
        }, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseMetricXConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d475ea361c0e100987681eb8bfa93c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d475ea361c0e100987681eb8bfa93c6b");
            return;
        }
        ILogger metricsLogger = Logger.getMetricsLogger();
        metricsLogger.d("Horn config metricx: " + str);
        try {
            MetricXConfigManager.metricXConfigBean = (MetricXConfigBean) new Gson().fromJson(str, (Class<Object>) MetricXConfigBean.class);
        } catch (Exception e) {
            Logger.getMetricxLogger().e("initMetricsWithHornConfig() failed to get metricx config: ", e.getMessage());
            MetricXConfigManager.metricXConfigBean = new MetricXConfigBean();
        }
        if (MetricXConfigManager.metricXConfigBean == null) {
            MetricXConfigManager.metricXConfigBean = new MetricXConfigBean();
        }
        ReportDetailManager.getInstance().setConfig(MetricXConfigManager.metricXConfigBean);
        for (MetricXConfigManager.ConfigChangedListener configChangedListener : MetricXConfigManager.getInstance().getMetricXConfigListeners()) {
            configChangedListener.onConfigChanged(MetricXConfigManager.metricXConfigBean);
        }
    }

    public static void setLogEnable(boolean z) {
        if (hasInit && z) {
            return;
        }
        logEnable = z;
    }

    public static boolean isLogEnable() {
        return logEnable;
    }

    public Metrics setDebug(boolean z) {
        debug = z;
        return this;
    }

    @Deprecated
    public Metrics addNetworkInterceptor(MetricsNetworkInterceptor metricsNetworkInterceptor) {
        Object[] objArr = {metricsNetworkInterceptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1bf3baf3e212258ff80444ce6801f5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1bf3baf3e212258ff80444ce6801f5f");
        }
        TrafficListenerProxy.getInstance().register(metricsNetworkInterceptor);
        return this;
    }

    public Metrics addInterceptor(MetricsInterceptor metricsInterceptor) {
        Object[] objArr = {metricsInterceptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13034dab7caaef1d4f1879ee0b12d555", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13034dab7caaef1d4f1879ee0b12d555");
        }
        if (metricsInterceptor != null) {
            this.interceptorChain.addInterceptor(metricsInterceptor);
        }
        return this;
    }

    @Deprecated
    public Metrics addTrafficReporterListener(OnTrafficReportListener onTrafficReportListener) {
        Object[] objArr = {onTrafficReportListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a98fd4caa4f2fc4baf585395f82fac4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a98fd4caa4f2fc4baf585395f82fac4b");
        }
        if (onTrafficReportListener != null) {
            TrafficListenerProxy.getInstance().register(onTrafficReportListener);
        }
        return this;
    }

    @Deprecated
    public Metrics addTrafficInterceptedListener(@NonNull OnTrafficInterceptedListener onTrafficInterceptedListener) {
        Object[] objArr = {onTrafficInterceptedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef309d301da74f686f24065af31e945f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef309d301da74f686f24065af31e945f");
        }
        TrafficListenerProxy.getInstance().register(onTrafficInterceptedListener);
        return this;
    }

    public MetricsConfig getAppConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ceac6c88cd9befaba9ebf01c7531b248", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ceac6c88cd9befaba9ebf01c7531b248");
        }
        if (this.mLocalConfig == null) {
            this.mLocalConfig = new MetricsConfig() { // from class: com.meituan.metrics.Metrics.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.config.MetricsConfig
                public q getReportStrategy() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "788116419e9330d4fc0a2f0396a4f347", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "788116419e9330d4fc0a2f0396a4f347") : new com.meituan.snare.b();
                }
            };
        }
        return this.mLocalConfig;
    }

    public void reportSpeedMeterTask(MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e75503e3a6a476a264fd590a31d25c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e75503e3a6a476a264fd590a31d25c7b");
        } else {
            h.a(metricsSpeedMeterTask);
        }
    }

    public void resetLaunchTask(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "785bf3a7ea9e54da17963f8250babaf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "785bf3a7ea9e54da17963f8250babaf2");
        } else {
            this.launchSpeedTask = MetricsSpeedMeterTask.createLaunchSpeedMeterTask(j);
        }
    }

    public Metrics reportLaunchSteps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffb2bc64bfce5d55826de269bae6764d", RobustBitConfig.DEFAULT_VALUE) ? (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffb2bc64bfce5d55826de269bae6764d") : reportLaunchSteps(null, null);
    }

    public Metrics reportLaunchSteps(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed7e1bae26fbd36b34f4eb6141a15d86", RobustBitConfig.DEFAULT_VALUE) ? (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed7e1bae26fbd36b34f4eb6141a15d86") : reportLaunchSteps(map, null);
    }

    public Metrics reportLaunchSteps(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2388deedd8fea9684d8ab9fd4bf726f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2388deedd8fea9684d8ab9fd4bf726f");
        }
        if (this.launchSpeedTask != null) {
            h.a(this.launchSpeedTask, map, str);
        }
        return this;
    }

    public Metrics recordLaunchStep(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4ae6dcdf9cdf8e4a3a6a291d83588c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4ae6dcdf9cdf8e4a3a6a291d83588c4");
        }
        if (this.launchSpeedTask != null) {
            this.launchSpeedTask.recordStep(str);
        }
        return this;
    }

    public Metrics recordLaunchStep(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67cb95a9e7ed318ef2c2728f6bc57289", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67cb95a9e7ed318ef2c2728f6bc57289");
        }
        if (this.launchSpeedTask != null) {
            this.launchSpeedTask.recordStep(str, j);
        }
        return this;
    }

    public Metrics launchIfFirst(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4863619b6b314a222e706ae01f0f8568", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4863619b6b314a222e706ae01f0f8568");
        }
        if (this.launchSpeedTask != null) {
            this.launchSpeedTask.setStartupIfFirst(z ? 1 : 0);
        }
        return this;
    }

    public Metrics launchType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22c60c45db63fa5620fa1bddee95ec4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22c60c45db63fa5620fa1bddee95ec4e");
        }
        if (this.launchSpeedTask != null) {
            this.launchSpeedTask.setStartupLunchType(str);
        }
        return this;
    }

    public Metrics launchIfAdvert(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de627f68e886bf3d4aa34418b299acd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de627f68e886bf3d4aa34418b299acd1");
        }
        if (this.launchSpeedTask != null) {
            this.launchSpeedTask.setStartupAdvert(z ? 1 : 0);
        }
        return this;
    }

    public Metrics disableLaunchSpeedMeter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8685b508fc956c9507f1b16d9a15f71a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8685b508fc956c9507f1b16d9a15f71a");
        }
        if (this.launchSpeedTask != null) {
            this.launchSpeedTask.disable();
        }
        return this;
    }

    public Metrics startCustomFPS(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25a665fa4cd8ed720d8f05e1c0a3e25c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25a665fa4cd8ed720d8f05e1c0a3e25c");
        }
        MetricSampleManager.getInstance().startCustomFPS(str);
        return this;
    }

    public Metrics stopCustomFPS(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b244ce68ad03bd963405857d5a722845", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b244ce68ad03bd963405857d5a722845");
        }
        MetricSampleManager.getInstance().stopCustomFPS(str, null);
        return this;
    }

    public Metrics stopCustomFPS(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b03f2a2ae58b144bf5cf35cd65c9f19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b03f2a2ae58b144bf5cf35cd65c9f19");
        }
        MetricSampleManager.getInstance().stopCustomFPS(str, map);
        return this;
    }

    public void setScrollCustom(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e5d64d56af401fae76ededaa0ba7128", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e5d64d56af401fae76ededaa0ba7128");
        } else {
            MetricSampleManager.getInstance().setScrollEntityCustom(activity);
        }
    }

    public void startCustomScrollFPS(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ec9a094f91098410f05ab2a573952b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ec9a094f91098410f05ab2a573952b8");
        } else {
            MetricSampleManager.getInstance().startCustomScrollFPS(activity);
        }
    }

    public void stopCustomScrollFPS(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e81de21e35c4be571352a9b62c0e45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e81de21e35c4be571352a9b62c0e45");
        } else {
            MetricSampleManager.getInstance().stopCustomScrollFPS(activity);
        }
    }

    public void changeToFragment(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8e67072624e6d5d7f90377b51db181f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8e67072624e6d5d7f90377b51db181f");
        } else {
            MetricSampleManager.getInstance().changeToFragment(fragment);
        }
    }

    public void changeToFragment(android.support.v4.app.Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dc7f16c9b4c7254778a2a7ab3e5ceaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dc7f16c9b4c7254778a2a7ab3e5ceaa");
        } else {
            MetricSampleManager.getInstance().changeToFragment(fragment);
        }
    }

    public void startProcessCpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a631619fb6184bf76d22266afb67c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a631619fb6184bf76d22266afb67c7b");
        } else {
            MetricSampleManager.getInstance().startProcessCpu();
        }
    }

    public void stopProcessCpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98699546e4496f44ea62bf86256e4ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98699546e4496f44ea62bf86256e4ad0");
        } else {
            MetricSampleManager.getInstance().stopProcessCpu();
        }
    }

    public void startProcessMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02a95727a51b0b8702ef00510a5ad69a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02a95727a51b0b8702ef00510a5ad69a");
        } else {
            MetricSampleManager.getInstance().startProcessMemory();
        }
    }

    public void stopProcessMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a761bf5cc66efdff626f3824c6a0028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a761bf5cc66efdff626f3824c6a0028");
        } else {
            MetricSampleManager.getInstance().stopProcessMemory();
        }
    }

    public void enableRealTimeMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cfdd844ded3cdfe2f9722f383b86ac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cfdd844ded3cdfe2f9722f383b86ac3");
        } else {
            MetricSampleManager.getInstance().enableRealTimeMonitor(true);
        }
    }

    public void disableRealTimeMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f43b1927a80d1ce98b93a1f46193ad16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f43b1927a80d1ce98b93a1f46193ad16");
        } else {
            MetricSampleManager.getInstance().enableRealTimeMonitor(false);
        }
    }

    @Deprecated
    public static void storeCrash(Throwable th, int i, String str, boolean z) {
        Object[] objArr = {th, Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c244ac31d4b795d0e23f7d9b4c8ab12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c244ac31d4b795d0e23f7d9b4c8ab12");
        } else {
            com.meituan.crashreporter.c.a(th, i, str, z);
        }
    }

    @Deprecated
    public static void storeCrash(String str, int i, String str2, boolean z, boolean z2) {
        Object[] objArr = {str, Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d27a5d3295595805754673f845e1fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d27a5d3295595805754673f845e1fcd");
        } else {
            com.meituan.crashreporter.c.a(str, i, str2, z, z2);
        }
    }

    public Metrics setReportCategory(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a43fbd09f75ca91783149a3216fb9e23", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a43fbd09f75ca91783149a3216fb9e23");
        }
        MetricsReportManager.getInstance().setCategory(str);
        return this;
    }

    public Metrics setLocalSwitch(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2afb02e034d339ba3545113323886922", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2afb02e034d339ba3545113323886922");
        }
        MetricsLocalSwitchConfigManager.getInstance().setLocalSwitch(z);
        return this;
    }

    public MetricsLocalSwitchConfig createLocalSwitchConfig(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d4bd00dfe025fa3a378c50d63c0ef0b", RobustBitConfig.DEFAULT_VALUE) ? (MetricsLocalSwitchConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d4bd00dfe025fa3a378c50d63c0ef0b") : new MetricsLocalSwitchConfig(AppUtils.getPageName(activity), MetricsLocalSwitchConfigManager.getInstance().getCommonLocalSw());
    }

    public void setMetricsMrnJSMemoryCollectCallBack(MetricsMrnJSMemoryCollectCallBack metricsMrnJSMemoryCollectCallBack) {
        this.metricsMrnJSMemoryCollectCallBack = metricsMrnJSMemoryCollectCallBack;
    }

    public Map<String, Long> collectMrnJsMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "039db46337e46f1fe0644f98633e6500", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "039db46337e46f1fe0644f98633e6500");
        }
        if (this.metricsMrnJSMemoryCollectCallBack == null) {
            return null;
        }
        try {
            return this.metricsMrnJSMemoryCollectCallBack.collectMrnJSMemory();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void reportImageMonitor(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ab9b85d9d4c82fc235247cfc47f2ff1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ab9b85d9d4c82fc235247cfc47f2ff1");
        } else {
            MetricsImageMonitor.getInstance().reportImageMap(map);
        }
    }

    @CheckResult
    @Nullable
    public BasicTrafficUnit getTodayTotalTraffic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ac12d4909560ccb156043c9e11aa76b", RobustBitConfig.DEFAULT_VALUE) ? (BasicTrafficUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ac12d4909560ccb156043c9e11aa76b") : MetricsTrafficManager.getInstance().getTodayTotalTraffic();
    }

    public void interceptCustomTraffic(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193d307c916049b7d83b289c794634ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193d307c916049b7d83b289c794634ef");
            return;
        }
        TrafficRecord trafficRecord = new TrafficRecord(str);
        trafficRecord.rxBytes = j;
        trafficRecord.txBytes = j2;
        MetricsTrafficManager.getInstance().addCustomTraffic(trafficRecord);
    }

    public Metrics registerTrafficListener(@NonNull MetricsTrafficListener metricsTrafficListener) {
        Object[] objArr = {metricsTrafficListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb4a2a87ea94ea49a9f770f21eb6fb41", RobustBitConfig.DEFAULT_VALUE)) {
            return (Metrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb4a2a87ea94ea49a9f770f21eb6fb41");
        }
        TrafficListenerProxy.getInstance().register(metricsTrafficListener);
        return this;
    }

    public void interceptCustomTraffic(@NonNull TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f77586d5dd1432e559c85b7ef5ac0945", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f77586d5dd1432e559c85b7ef5ac0945");
        } else {
            MetricsTrafficManager.getInstance().addCustomTraffic(trafficRecord);
        }
    }

    public static void reportTodayTraceAsync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0bb271f8b6bebef30fb3aefb6c8a543", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0bb271f8b6bebef30fb3aefb6c8a543");
        } else if (debug) {
            MetricsTrafficManager.reportTodayTraceAsync();
        }
    }
}
