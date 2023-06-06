package com.meituan.metrics.sampler.fps;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.android.common.metricx.config.MetricXConfigManager;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.MetricsFrameCallbackManager;
import com.meituan.metrics.cache.MetricsCacheManager;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.config.MetricsLocalSwitchConfigManager;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.util.AppUtils;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.metrics.util.thread.Task;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.metrics.window.callback.ActivityWindowTouchCallbackInterface;
import com.meituan.metrics.window.callback.MetricsActivityWindowCallbackManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes3.dex */
public class MetricsFpsSamplerImpl implements MetricsFpsSampler {
    private static final int DEFAULT_REFRESH_RATE = 60;
    private static final int MAX_SCROLL_GAP_MS = 80;
    private static final String TAG = "metrics FpsSampler";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean isUsingFrameMetrics = false;
    private static int refreshRate = 60;
    private Runnable cancelScrollTask;
    private final CatchException catchException;
    private long currentFrameTotalCostTime;
    private int currentFrameTotalCount;
    private Map<String, FpsEvent> customEvents;
    private boolean customScrolling;
    private Object frameMetricsAvailableListener;
    private long frameStartTime;
    public MetricsFrameCallbackManager.MetricsFrameCallback innerCallback;
    private boolean isRefreshRateGot;
    private volatile boolean isScrolling;
    private final Handler mainHandler;
    private double nowFPS;
    private FpsEvent pageFpsEvent;
    private boolean recording;
    private Callable<Void> registerFrameListener;
    private long sampleTimeInNs;
    private final Handler samplerHandler;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private volatile boolean scrollFpsEnabled;
    private volatile FpsEvent scrollFpsEvent;
    private volatile boolean scrollListenerRegistered;
    private volatile FpsEvent scrollNewFpsEvent;
    private int startSampleFrameCount;
    private long startSampleTimeInNs;
    private Runnable startScrollTask;
    private Runnable stopScrollTask;
    private final ActivityWindowTouchCallbackInterface touchCallbackInterface;
    private boolean userHasOperated;

    public static /* synthetic */ int access$1608(MetricsFpsSamplerImpl metricsFpsSamplerImpl) {
        int i = metricsFpsSamplerImpl.currentFrameTotalCount;
        metricsFpsSamplerImpl.currentFrameTotalCount = i + 1;
        return i;
    }

    public static /* synthetic */ int access$1908(MetricsFpsSamplerImpl metricsFpsSamplerImpl) {
        int i = metricsFpsSamplerImpl.startSampleFrameCount;
        metricsFpsSamplerImpl.startSampleFrameCount = i + 1;
        return i;
    }

    static {
        MetricXConfigManager.getInstance().register(new MetricXConfigManager.ConfigChangedListener() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.metricx.config.MetricXConfigManager.ConfigChangedListener
            public final void onConfigChanged(@NonNull MetricXConfigBean metricXConfigBean) {
                Object[] objArr = {metricXConfigBean};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7820727e2a8b1a62dc2efd9912ac622", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7820727e2a8b1a62dc2efd9912ac622");
                } else {
                    boolean unused = MetricsFpsSamplerImpl.isUsingFrameMetrics = metricXConfigBean.isUsingFrameMetrics;
                }
            }
        });
    }

    public MetricsFpsSamplerImpl(Handler handler) {
        Object[] objArr = {handler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a98dec8eca3bd4d283cf79301c24a64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a98dec8eca3bd4d283cf79301c24a64");
            return;
        }
        this.frameStartTime = 0L;
        this.customEvents = new ConcurrentHashMap();
        this.innerCallback = new MetricsFpsFrameCallback();
        this.catchException = new CatchException("MetricsFpsSampleImpl-NPR", 1, LocationStrategy.LOCATION_TIMEOUT);
        this.registerFrameListener = null;
        this.touchCallbackInterface = new ActivityWindowTouchCallbackInterface() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.window.callback.ActivityWindowTouchCallbackInterface
            public void dispatchTouchEvent(@Nullable Activity activity, MotionEvent motionEvent) {
                Object[] objArr2 = {activity, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9fdeb9a0eb5d61b2d2a6f126bd581feb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9fdeb9a0eb5d61b2d2a6f126bd581feb");
                } else if (motionEvent.getAction() == 2) {
                    MetricsFpsSamplerImpl.this.userHasOperated = true;
                }
            }
        };
        this.stopScrollTask = new Runnable() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.11
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fe80be7d03137d5c91a6dadd0eaa44d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fe80be7d03137d5c91a6dadd0eaa44d4");
                } else {
                    MetricsFpsSamplerImpl.this.stopScrollFPS();
                }
            }
        };
        this.cancelScrollTask = new Runnable() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.12
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a937fee3c13ee29a235dbe6538967199", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a937fee3c13ee29a235dbe6538967199");
                } else {
                    MetricsFpsSamplerImpl.this.cancelScrollFPS();
                }
            }
        };
        this.startScrollTask = new Runnable() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.13
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c01f45e011a5e27258b609046b12354", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c01f45e011a5e27258b609046b12354");
                } else {
                    MetricsFpsSamplerImpl.this.startScrollFPS();
                }
            }
        };
        this.userHasOperated = false;
        this.sampleTimeInNs = TimeUnit.NANOSECONDS.convert(1000L, TimeUnit.MILLISECONDS);
        this.samplerHandler = handler;
        this.scrollChangedListener = new FpsScrollChangeListener();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.isRefreshRateGot = tryToGetRefreshRate();
    }

    public void setScrollEntityCustom(final Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13efc3783755bb2dc4ed804e11e3fd92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13efc3783755bb2dc4ed804e11e3fd92");
            return;
        }
        if (this.scrollListenerRegistered) {
            ThreadManager.getInstance().runOnUiThread(new Callable<Void>() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "de8cc68bc0d2e2675dad793a05ae403d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "de8cc68bc0d2e2675dad793a05ae403d");
                    }
                    MetricsFpsSamplerImpl.this.unRegisterGlobalScrollCallback(activity);
                    return null;
                }
            });
        }
        if (this.scrollFpsEvent == null || !TextUtils.equals(AppUtils.getPageName(activity), this.scrollFpsEvent.getName())) {
            return;
        }
        this.scrollFpsEvent.scrollType = "custom";
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void pageEnter(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b3411ac9300c3d29795fad840b9422f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b3411ac9300c3d29795fad840b9422f");
            return;
        }
        if (!this.isRefreshRateGot) {
            this.isRefreshRateGot = tryToGetRefreshRate();
        }
        if (!MetricsLocalSwitchConfigManager.getInstance().getFPSSw(AppUtils.getPageName(activity))) {
            reset();
            this.scrollFpsEvent = null;
            this.scrollFpsEnabled = false;
            return;
        }
        initFrameListenerRegister(activity);
        if (!this.recording) {
            MetricsFrameCallbackManager.getInstance().register(this.innerCallback);
            this.recording = true;
        }
        String pageName = AppUtils.getPageName(activity, UserActionsProvider.getInstance().getLastResumeActivityName());
        if (MetricsRemoteConfigManager.getInstance().isFpsPageEnable(pageName)) {
            startRecordPageFps(pageName);
        }
        initScrollSampler(activity, pageName);
    }

    private void initFrameListenerRegister(Activity activity) {
        final Window tryGetWindowFromActivity;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6041666b1d451a3d2e40464743fef9cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6041666b1d451a3d2e40464743fef9cc");
        } else if (!isUsingFrameMetrics || Build.VERSION.SDK_INT < 24 || (tryGetWindowFromActivity = tryGetWindowFromActivity(activity)) == null) {
        } else {
            this.registerFrameListener = new Callable<Void>() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                @RequiresApi(api = 24)
                public Void call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e67dd6f33ee3b4230e75c3307bc259b5", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e67dd6f33ee3b4230e75c3307bc259b5");
                    }
                    MetricsFpsSamplerImpl.this.frameMetricsAvailableListener = new MetricsFrameListener(tryGetWindowFromActivity);
                    tryGetWindowFromActivity.addOnFrameMetricsAvailableListener((MetricsFrameListener) MetricsFpsSamplerImpl.this.frameMetricsAvailableListener, MetricsFpsSamplerImpl.this.samplerHandler);
                    if (MetricsFpsSamplerImpl.this.scrollFpsEvent != null) {
                        MetricsFpsSamplerImpl.this.scrollFpsEvent.frameMetricsListenerRegistered = true;
                        return null;
                    }
                    return null;
                }
            };
        }
    }

    private void initScrollSampler(final Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ceb739199c2fc8a6e31affcecdc8f4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ceb739199c2fc8a6e31affcecdc8f4a");
        } else if (MetricsRemoteConfigManager.getInstance().isFpsScrollEnable(str)) {
            initScrollFpsEvent(str);
            if (isUsingFrameMetrics) {
                initScrollNewFpsEvent(activity, str);
            }
            ThreadManager.getInstance().runOnUiThread(new Callable<Void>() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public Void call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "285d93027b81214965a2eb5fd722371b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "285d93027b81214965a2eb5fd722371b");
                    }
                    MetricsFpsSamplerImpl.this.registerGlobalScrollCallback(activity);
                    return null;
                }
            });
        }
    }

    private void initScrollFpsEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3c3d4b5b35cd95b3a4a69b7c4917fa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3c3d4b5b35cd95b3a4a69b7c4917fa0");
            return;
        }
        this.scrollFpsEvent = new FpsEvent(Constants.FPS_TYPE_SCROLL, str, refreshRate);
        this.scrollFpsEvent.setUsedFrameMetrics(isUsingFrameMetrics);
        this.scrollFpsEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        this.scrollFpsEvent.setPid(MetricsActivityLifecycleManager.getInstance().getPageSessionID());
    }

    private void initScrollNewFpsEvent(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29fce5d6aacbb4a598bd82ff65d8ccbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29fce5d6aacbb4a598bd82ff65d8ccbe");
            return;
        }
        this.scrollNewFpsEvent = new FpsEvent(Constants.FPS_TYPE_SCROLL_N, str, refreshRate, activity);
        this.scrollNewFpsEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
        this.scrollNewFpsEvent.setPid(MetricsActivityLifecycleManager.getInstance().getPageSessionID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void registerGlobalScrollCallback(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9729220a855d87b8bb8fbf9a1528f43d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9729220a855d87b8bb8fbf9a1528f43d");
            return;
        }
        Window tryGetWindowFromActivity = tryGetWindowFromActivity(activity);
        if (tryGetWindowFromActivity == null) {
            return;
        }
        try {
            MetricsActivityWindowCallbackManager.getInstance().registerWindowCallback(activity, this.touchCallbackInterface);
            tryGetWindowFromActivity.getDecorView().getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
            this.scrollListenerRegistered = true;
            if (this.scrollFpsEvent != null) {
                this.scrollFpsEvent.scrollListenerRegistered = true;
            }
        } catch (Exception e) {
            Logger.getMetricsLogger().et(TAG, "register global scroll listener failed", e);
        }
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void pageExit(final Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b34a4e33d3f2c0207c8506f8103b0a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b34a4e33d3f2c0207c8506f8103b0a3");
            return;
        }
        this.userHasOperated = false;
        stopRecordPageFps(activity, MetricsActivityLifecycleManager.getInstance().getCurrentFragment());
        MetricsActivityLifecycleManager.getInstance().clearCurrentFragment();
        ThreadManager.getInstance().runOnUiThread(new Callable<Void>() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c15a0847bce6c8de8e8273b12ba6eba0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c15a0847bce6c8de8e8273b12ba6eba0");
                }
                MetricsFpsSamplerImpl.this.unRegisterGlobalScrollCallback(activity);
                if (Build.VERSION.SDK_INT >= 24 && MetricsFpsSamplerImpl.this.frameMetricsAvailableListener != null && (MetricsFpsSamplerImpl.this.frameMetricsAvailableListener instanceof MetricsFrameListener)) {
                    ((MetricsFrameListener) MetricsFpsSamplerImpl.this.frameMetricsAvailableListener).selfUnregister();
                    MetricsFpsSamplerImpl.this.frameMetricsAvailableListener = null;
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void unRegisterGlobalScrollCallback(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79b7f644911108e9fe71712550dfdf01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79b7f644911108e9fe71712550dfdf01");
            return;
        }
        Window tryGetWindowFromActivity = tryGetWindowFromActivity(activity);
        if (tryGetWindowFromActivity == null) {
            return;
        }
        try {
            tryGetWindowFromActivity.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
            this.scrollListenerRegistered = false;
            if (this.scrollFpsEvent == null || this.scrollFpsEvent.frameMetricsListenerRegistered) {
                return;
            }
            this.scrollFpsEvent.scrollListenerRegistered = false;
        } catch (Exception e) {
            Logger.getMetricsLogger().i(TAG, "unregister global scroll listener failed", e);
        }
    }

    @Override // com.meituan.metrics.sampler.fps.MetricsFpsSampler
    public void changeToFragment(Object obj) {
        boolean z = true;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f33493fe265f6f8535c0505f973e24d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f33493fe265f6f8535c0505f973e24d");
            return;
        }
        final Activity activity = null;
        if (obj instanceof Fragment) {
            activity = ((Fragment) obj).getActivity();
        } else if (obj instanceof android.support.v4.app.Fragment) {
            activity = ((android.support.v4.app.Fragment) obj).getActivity();
        } else {
            z = false;
        }
        if (activity == null) {
            if (z) {
                MetricsActivityLifecycleManager.getInstance().setFragment(obj);
            }
        } else if (stopRecordingFpsOfLastFragment(obj, activity)) {
            ThreadManager.getInstance().runOnUiThread(new Callable<Void>() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc42f634ea4a74fcf7bb41dd2c97216d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc42f634ea4a74fcf7bb41dd2c97216d");
                    }
                    MetricsFpsSamplerImpl.this.unRegisterGlobalScrollCallback(activity);
                    return null;
                }
            });
            MetricsActivityLifecycleManager.getInstance().setFragment(obj);
            pageEnter(activity);
        }
    }

    private boolean stopRecordingFpsOfLastFragment(Object obj, Activity activity) {
        Object[] objArr = {obj, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c57ec060539455dd35ed05d6fe5e2cb8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c57ec060539455dd35ed05d6fe5e2cb8")).booleanValue();
        }
        Object currentFragment = MetricsActivityLifecycleManager.getInstance().getCurrentFragment();
        if (currentFragment == obj) {
            return false;
        }
        if (currentFragment == null) {
            MetricsActivityLifecycleManager.getInstance().setFragment(obj);
            return false;
        }
        stopRecordPageFps(activity, currentFragment);
        return true;
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public void doSample() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e0b25df4bff2b151882c430cb7658d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e0b25df4bff2b151882c430cb7658d2");
        } else if (this.nowFPS > 0.0d) {
            if (this.pageFpsEvent != null && this.pageFpsEvent.sampleUpdateEnabled && this.pageFpsEvent.minFps > this.nowFPS) {
                this.pageFpsEvent.minFps = this.nowFPS;
            }
            if (this.scrollFpsEvent != null && this.scrollFpsEnabled && this.scrollFpsEvent.sampleUpdateEnabled && this.scrollFpsEvent.minFps > this.nowFPS) {
                this.scrollFpsEvent.minFps = this.nowFPS;
            }
            for (FpsEvent fpsEvent : this.customEvents.values()) {
                if (fpsEvent != null && fpsEvent.sampleUpdateEnabled && fpsEvent.minFps > this.nowFPS && this.nowFPS > 0.0d) {
                    fpsEvent.minFps = this.nowFPS;
                }
            }
        }
    }

    @Override // com.meituan.metrics.sampler.MetricsSampler
    public double getRealTimeValue() {
        return this.nowFPS;
    }

    public boolean isScrolling() {
        return this.isScrolling;
    }

    private void startRecordPageFps(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afddc5679f15ca2472b946c2a908116e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afddc5679f15ca2472b946c2a908116e");
            return;
        }
        this.pageFpsEvent = new FpsEvent("page", str, refreshRate);
        this.pageFpsEvent.sampleUpdateEnabled = true;
        this.pageFpsEvent.frameTotalCostTime = this.currentFrameTotalCostTime;
        this.pageFpsEvent.frameTotalCount = this.currentFrameTotalCount;
        this.pageFpsEvent.setPid(MetricsActivityLifecycleManager.getInstance().getPageSessionID());
        this.pageFpsEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
    }

    private void stopRecordPageFps(Activity activity, Object obj) {
        Object[] objArr = {activity, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ac7c094cb957b8699f26208f016d7ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ac7c094cb957b8699f26208f016d7ec");
            return;
        }
        String pageName = AppUtils.getPageName(activity, UserActionsProvider.getInstance().getLastResumeActivityName());
        if (MetricsRemoteConfigManager.getInstance().isFpsPageEnable(pageName) && this.pageFpsEvent != null) {
            this.pageFpsEvent.computeAvgFps(this.currentFrameTotalCostTime, this.currentFrameTotalCount);
            this.pageFpsEvent.sampleUpdateEnabled = false;
            if (this.pageFpsEvent.isValid()) {
                this.pageFpsEvent.optionTags = AppUtils.getCustomTags(activity, obj, Constants.FPS_PAGE);
                reportFpsAsync(this.pageFpsEvent);
            }
            this.pageFpsEvent = null;
        }
        if (MetricsRemoteConfigManager.getInstance().isFpsScrollEnable(pageName) && this.scrollFpsEvent != null && this.scrollFpsEnabled) {
            this.scrollFpsEvent.computeScrollAvgFps();
            this.scrollFpsEvent.sampleUpdateEnabled = false;
            ILogger metricsLogger = Logger.getMetricsLogger();
            metricsLogger.dt(TAG, "stopRecordPageFps===", this.scrollFpsEvent);
            if (this.scrollFpsEvent.isValid()) {
                metricsLogger.dt(TAG, "addToCache__________scrollfps", new Object[0]);
                this.scrollFpsEvent.optionTags = AppUtils.getCustomTags(activity, obj, Constants.FPS_SCROLL);
                reportFpsAsync(this.scrollFpsEvent);
            }
            this.scrollFpsEvent = null;
            this.scrollFpsEnabled = false;
            if (!isUsingFrameMetrics || this.scrollNewFpsEvent == null) {
                return;
            }
            this.scrollNewFpsEvent.finishRecording();
            if (this.scrollNewFpsEvent.isValid()) {
                this.scrollNewFpsEvent.optionTags = AppUtils.getCustomTags(activity, obj, Constants.FPS_SCROLL);
                reportFpsAsync(this.scrollNewFpsEvent);
            }
            this.scrollNewFpsEvent = null;
        }
    }

    public void startScrollFPS() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "752a71501b0aa999c51e360ff8842c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "752a71501b0aa999c51e360ff8842c23");
        } else if (this.scrollFpsEvent == null) {
        } else {
            Logger.getMetricsLogger().dt(TAG, "scroll started", new Object[0]);
            if (TextUtils.equals(this.scrollFpsEvent.scrollType, "custom")) {
                return;
            }
            startScrollFpsInner();
        }
    }

    public void stopScrollFPS() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c27aa9217858916c3d13e3ac346cb6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c27aa9217858916c3d13e3ac346cb6d");
        } else if (this.scrollFpsEvent != null && this.scrollFpsEnabled && TextUtils.equals(this.scrollFpsEvent.scrollType, FpsEvent.TYPE_SCROLL_AUTO)) {
            stopScrollFpsInner();
            ILogger metricsLogger = Logger.getMetricsLogger();
            metricsLogger.dt(TAG, "scroll stopped", new Object[0]);
            metricsLogger.dt(TAG, "stopScrollFPS===", this.scrollFpsEvent);
        }
    }

    public void startCustomScrollFPS(final Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a22ca9b13f77807a5887aacf900dd83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a22ca9b13f77807a5887aacf900dd83");
        } else if (this.scrollFpsEvent == null) {
        } else {
            if (this.scrollListenerRegistered) {
                ThreadManager.getInstance().runOnUiThread(new Callable<Void>() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.8
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.util.concurrent.Callable
                    public Void call() throws Exception {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "808ebe5ae51ff001332dcfff938847d8", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "808ebe5ae51ff001332dcfff938847d8");
                        }
                        MetricsFpsSamplerImpl.this.unRegisterGlobalScrollCallback(activity);
                        return null;
                    }
                });
            }
            if (TextUtils.equals(this.scrollFpsEvent.scrollType, FpsEvent.TYPE_SCROLL_AUTO)) {
                this.scrollFpsEvent.reset();
                this.scrollFpsEvent.scrollType = "custom";
            } else if (this.customScrolling && this.scrollFpsEnabled) {
                return;
            }
            Logger.getMetricsLogger().dt(TAG, "scroll started new", new Object[0]);
            startScrollFpsInner();
            this.customScrolling = true;
        }
    }

    public void stopCustomScrollFPS(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "957f9fb50e2197c9d5764425ef3c1f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "957f9fb50e2197c9d5764425ef3c1f29");
            return;
        }
        if (this.scrollFpsEvent != null && this.scrollFpsEnabled && this.customScrolling && TextUtils.equals(this.scrollFpsEvent.scrollType, "custom")) {
            stopScrollFpsInner();
            Logger.getMetricsLogger().dt(TAG, "scroll stopped new ", new Object[0]);
        }
        this.customScrolling = false;
    }

    private void startScrollFpsInner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e46b20c2c16e3c4a9ddb54c2b2bc337f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e46b20c2c16e3c4a9ddb54c2b2bc337f");
            return;
        }
        if (this.registerFrameListener != null) {
            ThreadManager.getInstance().runOnUiThread(this.registerFrameListener);
            this.registerFrameListener = null;
        }
        this.scrollFpsEvent.sampleUpdateEnabled = true;
        this.scrollFpsEnabled = true;
        this.scrollFpsEvent.frameTotalCostTime = this.currentFrameTotalCostTime;
        this.scrollFpsEvent.frameTotalCount = this.currentFrameTotalCount;
        if (isUsingFrameMetrics && this.scrollNewFpsEvent != null) {
            this.scrollNewFpsEvent.sampleUpdateEnabled = true;
        }
        this.isScrolling = true;
    }

    private void stopScrollFpsInner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19fd727dd8dac404cbc23f39bf6971e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19fd727dd8dac404cbc23f39bf6971e2");
            return;
        }
        this.scrollFpsEvent.computeLastTimeAndCount(this.currentFrameTotalCostTime, this.currentFrameTotalCount);
        disableScrollFpsEvents();
        this.isScrolling = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelScrollFPS() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2280098deabaad1f04725bf05fd9c56b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2280098deabaad1f04725bf05fd9c56b");
        } else if (this.scrollFpsEvent == null) {
        } else {
            disableScrollFpsEvents();
            Logger.getMetricsLogger().dt(TAG, "ignore scroll event", new Object[0]);
        }
    }

    private void disableScrollFpsEvents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d17ade330527993e7f7d6690f854c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d17ade330527993e7f7d6690f854c63");
            return;
        }
        this.scrollFpsEvent.sampleUpdateEnabled = false;
        if (!isUsingFrameMetrics || this.scrollNewFpsEvent == null) {
            return;
        }
        this.scrollNewFpsEvent.sampleUpdateEnabled = false;
    }

    @Override // com.meituan.metrics.sampler.fps.MetricsFpsSampler
    public void startCustomRecordFps(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52bfc4a2f5302f2447e5b36ab249f09e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52bfc4a2f5302f2447e5b36ab249f09e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            FpsEvent fpsEvent = new FpsEvent("custom", str, refreshRate);
            fpsEvent.sampleUpdateEnabled = true;
            fpsEvent.frameTotalCostTime = this.currentFrameTotalCostTime;
            fpsEvent.frameTotalCount = this.currentFrameTotalCount;
            fpsEvent.setSid(MetricsActivityLifecycleManager.getInstance().getLaunchSessionID());
            this.customEvents.put(str, fpsEvent);
        }
    }

    @Override // com.meituan.metrics.sampler.fps.MetricsFpsSampler
    public void stopCustomRecordFps(String str, Map<String, Object> map) {
        FpsEvent fpsEvent;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd394c5881b6421e19c56a806b765226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd394c5881b6421e19c56a806b765226");
        } else if (TextUtils.isEmpty(str) || (fpsEvent = this.customEvents.get(str)) == null) {
        } else {
            fpsEvent.computeAvgFps(this.currentFrameTotalCostTime, this.currentFrameTotalCount);
            fpsEvent.sampleUpdateEnabled = false;
            if (fpsEvent.isValid()) {
                fpsEvent.optionTags = map;
                reportFpsAsync(fpsEvent);
            }
            this.customEvents.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFrameCostTime(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae33e5f1cf3b33bcb524ef40945759bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae33e5f1cf3b33bcb524ef40945759bd");
        } else {
            this.samplerHandler.post(new Runnable() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "151b670f37b062ce9c597aa190e763d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "151b670f37b062ce9c597aa190e763d1");
                        return;
                    }
                    try {
                        if (MetricsFpsSamplerImpl.this.pageFpsEvent != null && MetricsFpsSamplerImpl.this.pageFpsEvent.sampleUpdateEnabled) {
                            MetricsFpsSamplerImpl.this.pageFpsEvent.addFrameCost(j);
                        }
                        if (MetricsFpsSamplerImpl.this.scrollFpsEvent != null && MetricsFpsSamplerImpl.this.scrollFpsEnabled && MetricsFpsSamplerImpl.this.scrollFpsEvent.sampleUpdateEnabled) {
                            MetricsFpsSamplerImpl.this.scrollFpsEvent.addFrameCost(j);
                        }
                        if (MetricsFpsSamplerImpl.this.customEvents == null || MetricsFpsSamplerImpl.this.customEvents.isEmpty()) {
                            return;
                        }
                        for (FpsEvent fpsEvent : MetricsFpsSamplerImpl.this.customEvents.values()) {
                            if (fpsEvent != null && fpsEvent.sampleUpdateEnabled) {
                                fpsEvent.addFrameCost(j);
                            }
                        }
                    } catch (NullPointerException e) {
                        MetricsFpsSamplerImpl.this.catchException.reportException(e);
                    }
                }
            });
        }
    }

    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09b1b0a6f3956ba3002ce31e28575efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09b1b0a6f3956ba3002ce31e28575efc");
            return;
        }
        Logger.getMetricsLogger().dt(TAG, "reset=============", new Object[0]);
        this.frameStartTime = 0L;
        this.currentFrameTotalCostTime = 0L;
        this.currentFrameTotalCount = 0;
        this.startSampleTimeInNs = 0L;
        this.startSampleFrameCount = 0;
        this.nowFPS = 0.0d;
        this.recording = false;
        MetricsFrameCallbackManager.getInstance().unregister(this.innerCallback);
        if (Build.VERSION.SDK_INT < 24 || this.frameMetricsAvailableListener == null || !(this.frameMetricsAvailableListener instanceof MetricsFrameListener)) {
            return;
        }
        ((MetricsFrameListener) this.frameMetricsAvailableListener).selfUnregister();
    }

    private static boolean tryToGetRefreshRate() {
        Display defaultDisplay;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f5fe51958aa3b4c08650ce14b8279f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f5fe51958aa3b4c08650ce14b8279f9")).booleanValue();
        }
        try {
            WindowManager windowManager = (WindowManager) Metrics.getInstance().getContext().getSystemService("window");
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                refreshRate = Math.round(defaultDisplay.getRefreshRate());
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int getCurrentRefreshRate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61f229bbaf884a8858960434a70e61b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61f229bbaf884a8858960434a70e61b5")).intValue();
        }
        tryToGetRefreshRate();
        return refreshRate;
    }

    private void reportFpsAsync(final FpsEvent fpsEvent) {
        Object[] objArr = {fpsEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca715a8ec544d88feaf10e09e7ea4b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca715a8ec544d88feaf10e09e7ea4b50");
        } else {
            ThreadManager.getInstance().postIO(new Task() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.util.thread.Task
                public void schedule() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab79e3c6990eed5bd8cb7d6e71a79b4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab79e3c6990eed5bd8cb7d6e71a79b4e");
                    } else {
                        MetricsCacheManager.getInstance().addToCache(fpsEvent);
                    }
                }
            });
        }
    }

    private Window tryGetWindowFromActivity(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02e0d4a5b7bf74f936aaade3a4fb58ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Window) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02e0d4a5b7bf74f936aaade3a4fb58ff");
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @RequiresApi(api = 24)
    /* loaded from: classes3.dex */
    public class MetricsFrameListener implements Window.OnFrameMetricsAvailableListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Window attachedWindow;

        public MetricsFrameListener(Window window) {
            Object[] objArr = {MetricsFpsSamplerImpl.this, window};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27d43a89308cd0147573131e582c3487", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27d43a89308cd0147573131e582c3487");
            } else {
                this.attachedWindow = window;
            }
        }

        public void selfUnregister() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f834ce9c56074e1d509c5611fb20bdf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f834ce9c56074e1d509c5611fb20bdf");
                return;
            }
            try {
                this.attachedWindow.removeOnFrameMetricsAvailableListener(this);
            } catch (IllegalArgumentException unused) {
            }
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            Object[] objArr = {window, frameMetrics, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4248ebcefd663d85bd6d7bd7ba65b91f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4248ebcefd663d85bd6d7bd7ba65b91f");
            } else if (MetricsFpsSamplerImpl.isUsingFrameMetrics) {
                if (MetricsFpsSamplerImpl.this.scrollNewFpsEvent != null && MetricsFpsSamplerImpl.this.scrollFpsEnabled && MetricsFpsSamplerImpl.this.scrollNewFpsEvent.sampleUpdateEnabled) {
                    MetricsFpsSamplerImpl.this.scrollNewFpsEvent.onMetricsAvailable(frameMetrics, i);
                }
            } else {
                selfUnregister();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class MetricsFpsFrameCallback implements MetricsFrameCallbackManager.MetricsFrameCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        public MetricsFpsFrameCallback() {
            Object[] objArr = {MetricsFpsSamplerImpl.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a0616659064494bbc1c843dd0552250", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a0616659064494bbc1c843dd0552250");
            }
        }

        @Override // com.meituan.metrics.MetricsFrameCallbackManager.MetricsFrameCallback
        public void doFrame(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "835eb2ae930081cb8b9fd5e20cfab9dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "835eb2ae930081cb8b9fd5e20cfab9dc");
                return;
            }
            if (MetricsFpsSamplerImpl.this.frameStartTime > 0) {
                long j2 = j - MetricsFpsSamplerImpl.this.frameStartTime;
                MetricsFpsSamplerImpl.this.currentFrameTotalCostTime += j2;
                MetricsFpsSamplerImpl.access$1608(MetricsFpsSamplerImpl.this);
                MetricsFpsSamplerImpl.this.frameStartTime = j;
                MetricsFpsSamplerImpl.this.addFrameCostTime(j2);
            } else {
                MetricsFpsSamplerImpl.this.frameStartTime = j;
            }
            if (MetricsFpsSamplerImpl.this.startSampleTimeInNs == 0) {
                MetricsFpsSamplerImpl.this.startSampleTimeInNs = j;
                MetricsFpsSamplerImpl.this.startSampleFrameCount = 0;
            } else if (j - MetricsFpsSamplerImpl.this.startSampleTimeInNs >= MetricsFpsSamplerImpl.this.sampleTimeInNs) {
                MetricsFpsSamplerImpl.this.nowFPS = MetricsFpsSamplerImpl.this.startSampleFrameCount;
                if (MetricsFpsSamplerImpl.this.nowFPS > MetricsFpsSamplerImpl.refreshRate) {
                    MetricsFpsSamplerImpl.this.nowFPS = MetricsFpsSamplerImpl.refreshRate;
                }
                MetricsFpsSamplerImpl.this.samplerHandler.sendEmptyMessage(2);
                MetricsFpsSamplerImpl.this.startSampleTimeInNs = j;
                MetricsFpsSamplerImpl.this.startSampleFrameCount = 0;
            } else {
                MetricsFpsSamplerImpl.access$1908(MetricsFpsSamplerImpl.this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class FpsScrollChangeListener implements ViewTreeObserver.OnScrollChangedListener {
        private static final int MIN_SCROLLING_STEPS = 5;
        public static ChangeQuickRedirect changeQuickRedirect;
        private long scrollStartStamp;
        private Runnable scrollStopped;
        public boolean scrolling;
        private int scrollingCount;

        public FpsScrollChangeListener() {
            Object[] objArr = {MetricsFpsSamplerImpl.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07b7a13c3dc8a7c87d062f391c9f9f0e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07b7a13c3dc8a7c87d062f391c9f9f0e");
                return;
            }
            this.scrollingCount = 0;
            this.scrollStopped = new Runnable() { // from class: com.meituan.metrics.sampler.fps.MetricsFpsSamplerImpl.FpsScrollChangeListener.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1b617b4f3ff81e5b94d43314031701da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1b617b4f3ff81e5b94d43314031701da");
                        return;
                    }
                    FpsScrollChangeListener.this.scrolling = false;
                    if (TimeUtil.elapsedTimeMillis() - FpsScrollChangeListener.this.scrollStartStamp > 160 && FpsScrollChangeListener.this.scrollingCount >= 5) {
                        MetricsFpsSamplerImpl.this.samplerHandler.post(MetricsFpsSamplerImpl.this.stopScrollTask);
                        Logger.getMetricsLogger().dt(MetricsFpsSamplerImpl.TAG, "stopScrollTask------", new Object[0]);
                    } else if (TimeUtil.elapsedTimeMillis() - FpsScrollChangeListener.this.scrollStartStamp <= 80 || FpsScrollChangeListener.this.scrollingCount <= 2) {
                        MetricsFpsSamplerImpl.this.samplerHandler.post(MetricsFpsSamplerImpl.this.cancelScrollTask);
                        Logger.getMetricsLogger().dt(MetricsFpsSamplerImpl.TAG, "cancelScrollTask------", new Object[0]);
                    } else {
                        MetricsFpsSamplerImpl.this.samplerHandler.post(MetricsFpsSamplerImpl.this.stopScrollTask);
                        Logger.getMetricsLogger().dt(MetricsFpsSamplerImpl.TAG, "test------", new Object[0]);
                    }
                }
            };
            this.scrolling = false;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d46889e45c6b2971c7a70205d0798344", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d46889e45c6b2971c7a70205d0798344");
                return;
            }
            MetricsFpsSamplerImpl.this.mainHandler.removeCallbacks(this.scrollStopped);
            if (!this.scrolling && MetricsFpsSamplerImpl.this.userHasOperated) {
                this.scrolling = true;
                this.scrollingCount = 0;
                this.scrollStartStamp = TimeUtil.elapsedTimeMillis();
                MetricsFpsSamplerImpl.this.samplerHandler.post(MetricsFpsSamplerImpl.this.startScrollTask);
            }
            MetricsFpsSamplerImpl.this.mainHandler.postDelayed(this.scrollStopped, 80L);
            this.scrollingCount++;
            Logger.getMetricsLogger().dt(MetricsFpsSamplerImpl.TAG, "scrollingCount------", Integer.valueOf(this.scrollingCount));
        }
    }

    @VisibleForTesting
    public void testFpsScrollChangeListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f64c78f4ca3e037ec18c550559585551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f64c78f4ca3e037ec18c550559585551");
            return;
        }
        FpsScrollChangeListener fpsScrollChangeListener = new FpsScrollChangeListener();
        fpsScrollChangeListener.scrollStopped.run();
        fpsScrollChangeListener.onScrollChanged();
    }
}
