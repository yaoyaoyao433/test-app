package com.meituan.metrics.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.metrics.sys.SysStatisticsManager;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsActivityLifecycleManager implements Application.ActivityLifecycleCallbacks, AppBus.OnBackgroundUIListener, AppBus.OnForegroundUIListener {
    private static final long LAUNCH_SESSION_INTERVAL = 30000;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static String currentActivity = "";
    private static MetricsActivityLifecycleManager sInstance;
    private long backgroundTime;
    private WeakReference<Object> currentFragmentRef;
    private int currentPageID;
    private boolean hasPageCreated;
    private String launchSessionID;
    private final List<MetricsActivityLifecycleCallback> mCallbacks;
    private boolean registered;
    private WeakReference<Activity> topActivity;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static MetricsActivityLifecycleManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4484e882e5a63e95428d35a92caf0f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsActivityLifecycleManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4484e882e5a63e95428d35a92caf0f9");
        }
        if (sInstance == null) {
            synchronized (MetricsActivityLifecycleManager.class) {
                if (sInstance == null) {
                    sInstance = new MetricsActivityLifecycleManager();
                }
            }
        }
        return sInstance;
    }

    public MetricsActivityLifecycleManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68916b11d750d9c9e084c635753b5f52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68916b11d750d9c9e084c635753b5f52");
            return;
        }
        this.topActivity = new WeakReference<>(null);
        this.mCallbacks = new CopyOnWriteArrayList();
        this.currentPageID = -1;
        this.hasPageCreated = false;
        this.registered = false;
        if (TextUtils.isEmpty(this.launchSessionID)) {
            this.launchSessionID = UUID.randomUUID().toString();
        }
    }

    public void prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1754f7429ee54a5687b3c8058f16137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1754f7429ee54a5687b3c8058f16137");
        } else if (this.registered) {
        } else {
            AppBus.getInstance().register((Application.ActivityLifecycleCallbacks) this);
            AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
            AppBus.getInstance().register((AppBus.OnForegroundListener) this, false);
            this.registered = true;
        }
    }

    public void register(MetricsActivityLifecycleCallback metricsActivityLifecycleCallback) {
        Object[] objArr = {metricsActivityLifecycleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37e885f751680fc0d477b99c3b859c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37e885f751680fc0d477b99c3b859c35");
        } else if (metricsActivityLifecycleCallback == null) {
        } else {
            this.mCallbacks.add(metricsActivityLifecycleCallback);
        }
    }

    public void unRegister(MetricsActivityLifecycleCallback metricsActivityLifecycleCallback) {
        Object[] objArr = {metricsActivityLifecycleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ad32c681d48fae8ff10d35f0fd531fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ad32c681d48fae8ff10d35f0fd531fd");
        } else {
            this.mCallbacks.remove(metricsActivityLifecycleCallback);
        }
    }

    public void setFragment(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2501abde1cd9b56ef0bd2771cc1b2b78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2501abde1cd9b56ef0bd2771cc1b2b78");
        } else if ((obj instanceof Fragment) || (obj instanceof android.support.v4.app.Fragment)) {
            this.currentFragmentRef = new WeakReference<>(obj);
        }
    }

    public void clearCurrentFragment() {
        this.currentFragmentRef = null;
    }

    public Object getCurrentFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f667ddf722ca96e51edf75ef03513fd", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f667ddf722ca96e51edf75ef03513fd");
        }
        if (this.currentFragmentRef == null) {
            return null;
        }
        return this.currentFragmentRef.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fbd9883a431caceb536b3523fc2e292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fbd9883a431caceb536b3523fc2e292");
            return;
        }
        this.currentPageID++;
        this.hasPageCreated = true;
        SysStatisticsManager.getInstance().checkAndSendSysData();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa09d447584d0dc9d83e56bab24667eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa09d447584d0dc9d83e56bab24667eb");
            return;
        }
        this.topActivity = new WeakReference<>(activity);
        if (!this.hasPageCreated) {
            this.currentPageID++;
        } else {
            this.hasPageCreated = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2753624ecd138346934359cd9ee6d3be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2753624ecd138346934359cd9ee6d3be");
        } else if (this.mCallbacks != null && this.mCallbacks.size() > 0) {
            for (MetricsActivityLifecycleCallback metricsActivityLifecycleCallback : this.mCallbacks) {
                metricsActivityLifecycleCallback.onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89e3276aa6e9fddcb0bdc4417a87a3ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89e3276aa6e9fddcb0bdc4417a87a3ba");
        } else if (this.mCallbacks != null && this.mCallbacks.size() > 0) {
            for (MetricsActivityLifecycleCallback metricsActivityLifecycleCallback : this.mCallbacks) {
                metricsActivityLifecycleCallback.onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a3261ce654bee07e2d1bf0c23d609d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a3261ce654bee07e2d1bf0c23d609d3");
            return;
        }
        if (this.mCallbacks != null && this.mCallbacks.size() > 0) {
            for (MetricsActivityLifecycleCallback metricsActivityLifecycleCallback : this.mCallbacks) {
                metricsActivityLifecycleCallback.onActivityStopped(activity);
            }
        }
        if (this.topActivity == null || this.topActivity.get() != activity) {
            return;
        }
        this.topActivity = null;
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
    public void onForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3993ce5e253ada999e65bfb6a7c07267", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3993ce5e253ada999e65bfb6a7c07267");
        } else if (TextUtils.isEmpty(this.launchSessionID) || (this.backgroundTime > 0 && TimeUtil.currentTimeMillisSNTP() - this.backgroundTime > 30000)) {
            this.launchSessionID = UUID.randomUUID().toString();
            this.currentPageID = -1;
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c74608a9dc3e5c82a1579b6ba4ee144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c74608a9dc3e5c82a1579b6ba4ee144");
        } else {
            this.backgroundTime = TimeUtil.currentTimeMillisSNTP();
        }
    }

    public int getPageSessionID() {
        return this.currentPageID;
    }

    public String getLaunchSessionID() {
        return this.launchSessionID;
    }

    @Deprecated
    public static void logAction(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2c6791222db439e4220a527f7de98e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2c6791222db439e4220a527f7de98e5");
        } else {
            UserActionsProvider.getInstance().logAction(str);
        }
    }

    @Deprecated
    public static String getActions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14fcbe2ee81ded47cd77555d6b6e3217", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14fcbe2ee81ded47cd77555d6b6e3217") : UserActionsProvider.getInstance().getActions(true);
    }
}
