package com.meituan.metrics.fsp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.Window;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.metrics.fsp.finder.FspFinderFactory;
import com.meituan.metrics.fsp.finder.FspFinderImpl;
import com.meituan.metrics.fsp.sampler.FspViewSampleFactory;
import com.meituan.metrics.fsp.sampler.FspViewSamplerCallBack;
import com.meituan.metrics.fsp.sampler.FspViewSamplerImpl;
import com.meituan.metrics.util.AppUtils;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsFspDetector {
    private static final String KEY_HORN;
    private static final Set<String> activitySet = new HashSet();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MetricsFspDetector instance;
    private int currentActivityHashCode;
    private WeakReference<Activity> currentActivityReference;
    private Window currentWindow;
    private long execStartActivityTime;
    private final ScheduledExecutorService executorService;
    private volatile FspConfig fspConfig;
    private List<FspDetectCallBack> fspDetectCallBackList;
    private FspFinderImpl fspStableFinder;
    private FspViewSamplerImpl fspViewSampler;
    private boolean isFinish;
    private volatile boolean isInit;
    private volatile boolean isWifi;
    private long newActivityTime;
    private long onCreateTime;
    private long onTouchDownTime;

    static {
        KEY_HORN = FspIniter.isDebug() ? "metrics_fmp_debug" : "metrics_fmp";
    }

    public MetricsFspDetector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d46084f0d9d0e29eb22dc4b963c16d55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d46084f0d9d0e29eb22dc4b963c16d55");
            return;
        }
        this.executorService = c.c("fsp_detector");
        this.currentActivityHashCode = -1;
        this.isFinish = true;
        this.isInit = false;
        this.execStartActivityTime = 0L;
        this.newActivityTime = 0L;
        this.onCreateTime = 0L;
        this.onTouchDownTime = 0L;
        this.isWifi = true;
        this.fspDetectCallBackList = new ArrayList();
    }

    private void initConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed8bb735e73dfe91388743db174d67da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed8bb735e73dfe91388743db174d67da");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceLevel", DeviceUtil.getDeviceLevel(FspIniter.getContext()));
        if (FspIniter.isDebug()) {
            Horn.debug(FspIniter.getContext(), KEY_HORN, true);
        }
        Horn.register(KEY_HORN, new HornCallback() { // from class: com.meituan.metrics.fsp.MetricsFspDetector.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c339c2e62ced202a66b1e511b50c5f57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c339c2e62ced202a66b1e511b50c5f57");
                } else if (z) {
                    MetricsFspDetector.this.initConfig(str);
                }
            }
        }, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "993fd24dc0573f4f2d22567d75cd31b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "993fd24dc0573f4f2d22567d75cd31b1");
        } else {
            this.fspConfig = FspConfig.parse(str);
        }
    }

    private FspConfig getFspConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5cde9ec4ab4d82f7822e46422dace3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (FspConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5cde9ec4ab4d82f7822e46422dace3d");
        }
        if (this.fspConfig == null) {
            this.executorService.execute(new ScheduleRunnableDelegate(new Runnable() { // from class: com.meituan.metrics.fsp.MetricsFspDetector.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                @RequiresApi(api = 18)
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a2b55388306e74ea23543e49b046f5d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a2b55388306e74ea23543e49b046f5d8");
                    } else {
                        MetricsFspDetector.this.initConfig(Horn.accessCache(MetricsFspDetector.KEY_HORN));
                    }
                }
            }));
            this.fspConfig = FspConfig.getDefaultConfig();
        }
        return this.fspConfig;
    }

    public boolean isFspOpen() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "119ac259d2e8c673de08e77988486250", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "119ac259d2e8c673de08e77988486250")).booleanValue() : this.fspConfig != null && this.fspConfig.isOpen();
    }

    public boolean isWifi() {
        return this.isWifi;
    }

    public static MetricsFspDetector getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "703a4c8dadeabbb6fb7fe94fcd5a8f35", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsFspDetector) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "703a4c8dadeabbb6fb7fe94fcd5a8f35");
        }
        if (instance == null) {
            synchronized (MetricsFspDetector.class) {
                if (instance == null) {
                    instance = new MetricsFspDetector();
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onActivityCreated(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "529b544e69b0fae152ffaf5d7a5f4a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "529b544e69b0fae152ffaf5d7a5f4a0c");
            return;
        }
        onDetectFinish(this.currentActivityHashCode, 5);
        if (FspUtils.isNeedDetect(activity, getFspConfig())) {
            String pageName = AppUtils.getPageName(activity);
            this.fspStableFinder.setFspConfig(getFspConfig());
            this.fspViewSampler.setFmpConfig(getFspConfig());
            this.currentActivityHashCode = activity.hashCode();
            this.currentActivityReference = new WeakReference<>(activity);
            this.isFinish = false;
            this.onTouchDownTime = 0L;
            this.currentWindow = activity.getWindow();
            FspBean fspBean = new FspBean();
            fspBean.setExecStartActivityTime(this.execStartActivityTime);
            fspBean.setNewActivityTime(this.newActivityTime);
            fspBean.setOnCreateTime(this.onCreateTime);
            fspBean.setActivityName(pageName);
            fspBean.setDetectReachBottom(getFspConfig().isDetectReachBottom());
            this.fspViewSampler.onActivityCreated(activity, fspBean);
            FspLogger.reportOnCreateByBabel(pageName);
            for (FspDetectCallBack fspDetectCallBack : this.fspDetectCallBackList) {
                fspDetectCallBack.onDetectStart(pageName);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDetectFinish(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19ff9107e38a97cc8b224a8066360f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19ff9107e38a97cc8b224a8066360f90");
        } else if (this.isFinish || i != this.currentActivityHashCode) {
        } else {
            this.isFinish = true;
            resetWindowCallBack();
            outputFspBean(this.fspViewSampler.onDetectFinish(i2));
        }
    }

    private void outputFspBean(final FspBean fspBean) {
        Object[] objArr = {fspBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa3825bbf061c65b64d68fdf006a7ded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa3825bbf061c65b64d68fdf006a7ded");
        } else if (fspBean == null || fspBean.getReason() == 4) {
        } else {
            fspBean.setTouchDownTime(this.onTouchDownTime);
            fspBean.setAllRect();
            if (this.currentActivityReference != null && (this.currentActivityReference.get() instanceof MetricsFspExtraInfoProvider)) {
                fspBean.setExtraInfo(((MetricsFspExtraInfoProvider) this.currentActivityReference.get()).getExtraFspInfo());
            }
            this.executorService.execute(new Runnable() { // from class: com.meituan.metrics.fsp.MetricsFspDetector.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                @RequiresApi(api = 18)
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a43f827eb2ecf7321187876beaf94f29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a43f827eb2ecf7321187876beaf94f29");
                        return;
                    }
                    MetricsFspDetector.this.fspStableFinder.process(fspBean);
                    fspBean.setFirstLaunch(!MetricsFspDetector.activitySet.contains(fspBean.getActivityName()));
                    MetricsFspDetector.activitySet.add(fspBean.getActivityName());
                    FspLogger.log(fspBean);
                    FspLogger.reportByBabel(fspBean);
                    MetricsFspDetector.this.callDetectFinish(fspBean);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDetectFinish(FspBean fspBean) {
        Object[] objArr = {fspBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "209054db756455013994cf460d48f983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "209054db756455013994cf460d48f983");
            return;
        }
        for (FspDetectCallBack fspDetectCallBack : this.fspDetectCallBackList) {
            fspDetectCallBack.onDetectFinish(fspBean, this.currentActivityReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWindowCallback(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23d26375c1e0085726c4693dabe7ed04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23d26375c1e0085726c4693dabe7ed04");
            return;
        }
        Window.Callback callback = this.currentWindow.getCallback();
        if (callback instanceof WindowCallback) {
            return;
        }
        final int hashCode = activity.hashCode();
        Window window = activity.getWindow();
        if (callback != null) {
            activity = callback;
        }
        window.setCallback(new WindowCallback(activity, new WindowTouchCallBack() { // from class: com.meituan.metrics.fsp.MetricsFspDetector.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.fsp.WindowTouchCallBack
            public void onClick() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67f995f1a8ed1455259e7b67f8864169", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67f995f1a8ed1455259e7b67f8864169");
                } else {
                    MetricsFspDetector.this.onDetectFinish(hashCode, 2);
                }
            }

            @Override // com.meituan.metrics.fsp.WindowTouchCallBack
            public void onDown() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4358a1e02d4f42426f0edb3eb0962e49", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4358a1e02d4f42426f0edb3eb0962e49");
                } else if (MetricsFspDetector.this.isFinish || hashCode != MetricsFspDetector.this.currentActivityHashCode) {
                } else {
                    MetricsFspDetector.this.onTouchDownTime = System.currentTimeMillis();
                    MetricsFspDetector.this.fspViewSampler.onDown();
                }
            }

            @Override // com.meituan.metrics.fsp.WindowTouchCallBack
            public void onScroll() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b0f88dfdc86b34fd70af1d67fd9c32e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b0f88dfdc86b34fd70af1d67fd9c32e8");
                } else if (!MetricsFspDetector.this.isFinish && hashCode == MetricsFspDetector.this.currentActivityHashCode && MetricsFspDetector.this.fspViewSampler.onScroll()) {
                    MetricsFspDetector.this.onDetectFinish(hashCode, 3);
                }
            }
        }));
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b5365eeaf8a7ff5f7dc5a79650115da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b5365eeaf8a7ff5f7dc5a79650115da");
        } else if (this.isInit) {
        } else {
            initConfig();
            this.fspViewSampler = FspViewSampleFactory.getFspViewSampler();
            this.fspViewSampler.setCallBack(new FspViewSamplerCallBack() { // from class: com.meituan.metrics.fsp.MetricsFspDetector.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.fsp.sampler.FspViewSamplerCallBack
                public void detectFinish(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "599713abc1c86933be35949a5e88ee79", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "599713abc1c86933be35949a5e88ee79");
                    } else {
                        MetricsFspDetector.this.onDetectFinish(i, i2);
                    }
                }
            });
            this.fspStableFinder = FspFinderFactory.getFmpStableFinder();
            registerLifecycleService(new MetricsFspLifeCycle() { // from class: com.meituan.metrics.fsp.MetricsFspDetector.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.fsp.MetricsFspLifeCycle
                public void execStartActivity() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "507d948dcf41f9a2066986cef6c61dd2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "507d948dcf41f9a2066986cef6c61dd2");
                        return;
                    }
                    MetricsFspDetector.this.execStartActivityTime = System.currentTimeMillis();
                }

                @Override // com.meituan.metrics.fsp.MetricsFspLifeCycle
                public void newActivity() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86bad3bad134fa939bbafa0772c22849", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86bad3bad134fa939bbafa0772c22849");
                        return;
                    }
                    MetricsFspDetector.this.newActivityTime = System.currentTimeMillis();
                }

                @Override // com.meituan.metrics.fsp.MetricsFspLifeCycle
                public void callActivityOnCreate(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bec9f2494b71678ccc3af5546347d5fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bec9f2494b71678ccc3af5546347d5fd");
                        return;
                    }
                    MetricsFspDetector.this.onCreateTime = System.currentTimeMillis();
                    MetricsFspDetector.this.onActivityCreated(activity);
                }

                @Override // com.meituan.metrics.fsp.MetricsFspLifeCycle
                public void callActivityOnResume(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3f9af29ec58534c9b62e0f786136e1d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3f9af29ec58534c9b62e0f786136e1d4");
                    } else if (MetricsFspDetector.this.currentWindow == null || activity.hashCode() != MetricsFspDetector.this.currentActivityHashCode) {
                    } else {
                        MetricsFspDetector.this.setWindowCallback(activity);
                    }
                }

                @Override // com.meituan.metrics.fsp.MetricsFspLifeCycle
                public void callActivityOnPause(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a6226f3ce74b90d14928ef2589f63a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a6226f3ce74b90d14928ef2589f63a4");
                    } else {
                        MetricsFspDetector.this.onDetectFinish(activity.hashCode(), activity.isFinishing() ? 1 : 2);
                    }
                }

                @Override // com.meituan.metrics.fsp.MetricsFspLifeCycle
                public void callActivityOnDestroy(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67d9b0e01885f8913fa5dea820ea846f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67d9b0e01885f8913fa5dea820ea846f");
                    } else if (activity.hashCode() == MetricsFspDetector.this.currentActivityHashCode) {
                        MetricsFspDetector.this.resetWindowCallBack();
                    }
                }
            });
            this.isInit = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetWindowCallBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba010beb969b62c70295d3737f898149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba010beb969b62c70295d3737f898149");
            return;
        }
        if (this.currentWindow != null && (this.currentWindow.getCallback() instanceof WindowCallback)) {
            this.currentWindow.setCallback(((WindowCallback) this.currentWindow.getCallback()).getCallback());
        }
        this.currentWindow = null;
    }

    public void registerLifecycleService(MetricsFspLifeCycle metricsFspLifeCycle) {
        Object[] objArr = {metricsFspLifeCycle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "972dab8bdce95014f865ab54aa7f1e11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "972dab8bdce95014f865ab54aa7f1e11");
            return;
        }
        ILifecycleService iLifecycleService = FspIniter.getILifecycleService();
        if (iLifecycleService == null) {
            iLifecycleService = new ILifecycleService() { // from class: com.meituan.metrics.fsp.MetricsFspDetector.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.fsp.ILifecycleService
                public void register(@NonNull final MetricsFspLifeCycle metricsFspLifeCycle2) {
                    Object[] objArr2 = {metricsFspLifeCycle2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d7f68aa28650d8ddc6e9d5bd2fc0bedc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d7f68aa28650d8ddc6e9d5bd2fc0bedc");
                    } else {
                        AppBus.getInstance().register(new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.metrics.fsp.MetricsFspDetector.7.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityStarted(@NonNull Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityStopped(@NonNull Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
                                Object[] objArr3 = {activity, bundle};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6854dd0fb703badee5c3cb330389d582", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6854dd0fb703badee5c3cb330389d582");
                                } else {
                                    metricsFspLifeCycle2.callActivityOnCreate(activity);
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityResumed(@NonNull Activity activity) {
                                Object[] objArr3 = {activity};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e2c5fee2cefd7fac7fbaf7fd4d7416b5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e2c5fee2cefd7fac7fbaf7fd4d7416b5");
                                } else {
                                    metricsFspLifeCycle2.callActivityOnResume(activity);
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityPaused(@NonNull Activity activity) {
                                Object[] objArr3 = {activity};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0f4d87a9bc3f0903c43f98362ef3c709", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0f4d87a9bc3f0903c43f98362ef3c709");
                                } else {
                                    metricsFspLifeCycle2.callActivityOnPause(activity);
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityDestroyed(@NonNull Activity activity) {
                                Object[] objArr3 = {activity};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9ac17ddd846e0e548f6e7a76283c7008", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9ac17ddd846e0e548f6e7a76283c7008");
                                } else {
                                    metricsFspLifeCycle2.callActivityOnDestroy(activity);
                                }
                            }
                        });
                    }
                }
            };
        }
        iLifecycleService.register(metricsFspLifeCycle);
    }

    public void register(FspDetectCallBack fspDetectCallBack) {
        Object[] objArr = {fspDetectCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e981ebe8eef8ff5a46eb3b0175d2d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e981ebe8eef8ff5a46eb3b0175d2d82");
        } else {
            this.fspDetectCallBackList.add(fspDetectCallBack);
        }
    }
}
