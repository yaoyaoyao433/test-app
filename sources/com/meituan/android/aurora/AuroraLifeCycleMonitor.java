package com.meituan.android.aurora;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuroraLifeCycleMonitor implements Application.ActivityLifecycleCallbacks {
    private static final int STATE_BACKGROUND = 2;
    private static final int STATE_FOREGROUND = 1;
    private static final int STATE_INIT = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Application.ActivityLifecycleCallbacks> callbacks;
    private List<String> ignoreNameList;
    private List<Activity> mActivities;
    private int mSwitchCount;
    private int state;

    public AuroraLifeCycleMonitor(AuroraApplication auroraApplication) {
        Object[] objArr = {auroraApplication};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e8f7a26e4a7bfd59ae04e927529e462", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e8f7a26e4a7bfd59ae04e927529e462");
            return;
        }
        this.state = 0;
        this.callbacks = new LinkedList();
        this.mActivities = new LinkedList();
        auroraApplication.realRegisterActivityLifecycleCallbacks(this);
        String[] lifeCycleIgnoreClassNameArray = auroraApplication.getLifeCycleIgnoreClassNameArray();
        if (lifeCycleIgnoreClassNameArray != null) {
            this.ignoreNameList = Arrays.asList(lifeCycleIgnoreClassNameArray);
        }
    }

    public void registerLifecycleCallbacks(final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Object[] objArr = {activityLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b787273fc2828c9162c1caed71904d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b787273fc2828c9162c1caed71904d");
            return;
        }
        synchronized (this) {
            this.callbacks.add(activityLifecycleCallbacks);
        }
        if (this.state == 0 || !(activityLifecycleCallbacks instanceof ActivitySwitchCallbacks)) {
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Thread.currentThread() == mainLooper.getThread()) {
            switch (this.state) {
                case 1:
                    ((ActivitySwitchCallbacks) activityLifecycleCallbacks).onForeground();
                    return;
                case 2:
                    ((ActivitySwitchCallbacks) activityLifecycleCallbacks).onBackground();
                    return;
                default:
                    return;
            }
        }
        new Handler(mainLooper).post(new Runnable() { // from class: com.meituan.android.aurora.AuroraLifeCycleMonitor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db09dae61aad4be94e75fadce890f214", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db09dae61aad4be94e75fadce890f214");
                    return;
                }
                switch (AuroraLifeCycleMonitor.this.state) {
                    case 1:
                        ((ActivitySwitchCallbacks) activityLifecycleCallbacks).onForeground();
                        return;
                    case 2:
                        ((ActivitySwitchCallbacks) activityLifecycleCallbacks).onBackground();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public void unregisterLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Object[] objArr = {activityLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "854836027bc1c94c92598693c726dc1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "854836027bc1c94c92598693c726dc1b");
            return;
        }
        synchronized (this) {
            this.callbacks.remove(activityLifecycleCallbacks);
        }
    }

    @MainThread
    public List<Activity> getActivityStack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41d8551a45fa35080467d9923f345790", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41d8551a45fa35080467d9923f345790") : new ArrayList(this.mActivities);
    }

    private Application.ActivityLifecycleCallbacks[] collectCallbacks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "233d8d2ce65e302f3ce999a0b07506a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Application.ActivityLifecycleCallbacks[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "233d8d2ce65e302f3ce999a0b07506a3");
        }
        synchronized (this) {
            if (this.callbacks.isEmpty()) {
                return null;
            }
            return (Application.ActivityLifecycleCallbacks[]) this.callbacks.toArray(new Application.ActivityLifecycleCallbacks[this.callbacks.size()]);
        }
    }

    private boolean isIgnore(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d6ade196ab28ccce9a4c90074e48b26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d6ade196ab28ccce9a4c90074e48b26")).booleanValue();
        }
        if (this.ignoreNameList == null || activity == null) {
            return false;
        }
        return this.ignoreNameList.contains(activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Application.ActivityLifecycleCallbacks[] collectCallbacks;
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccf2b977e745406ff2fe845af20a929b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccf2b977e745406ff2fe845af20a929b");
        } else if (!isIgnore(activity) && (collectCallbacks = collectCallbacks()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : collectCallbacks) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int startupSection = Aurora.getStartupSection();
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                AuroraReporter.collectLifeCycleData(activityLifecycleCallbacks.getClass().getName(), elapsedRealtime, currentThreadTimeMillis, "lifecycle_created", startupSection);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f2a99ae653a8be865cd71ea527c88bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f2a99ae653a8be865cd71ea527c88bd");
        } else if (!isIgnore(activity)) {
            if (this.mSwitchCount <= 0) {
                this.mSwitchCount = 1;
            } else {
                this.mSwitchCount++;
            }
            if (this.mSwitchCount == 1) {
                this.state = 1;
            }
            this.mActivities.add(0, activity);
            ActivitySwitchMonitor.sTopActivity = activity;
            Application.ActivityLifecycleCallbacks[] collectCallbacks = collectCallbacks();
            if (collectCallbacks != null) {
                for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : collectCallbacks) {
                    long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int startupSection = Aurora.getStartupSection();
                    activityLifecycleCallbacks.onActivityStarted(activity);
                    AuroraReporter.collectLifeCycleData(activityLifecycleCallbacks.getClass().getName(), elapsedRealtime, currentThreadTimeMillis, "lifecycle_started", startupSection);
                    if (this.mSwitchCount == 1 && (activityLifecycleCallbacks instanceof ActivitySwitchCallbacks)) {
                        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        int startupSection2 = Aurora.getStartupSection();
                        ((ActivitySwitchCallbacks) activityLifecycleCallbacks).onForeground();
                        AuroraReporter.collectLifeCycleData(activityLifecycleCallbacks.getClass().getName(), elapsedRealtime2, currentThreadTimeMillis2, "lifecycle_foreground", startupSection2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "010d9d50c665521cc0b285ba14fd28bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "010d9d50c665521cc0b285ba14fd28bc");
        } else if (!isIgnore(activity)) {
            if (this.mActivities.isEmpty() || this.mActivities.get(0) != activity) {
                this.mActivities.remove(activity);
                this.mActivities.add(0, activity);
                ActivitySwitchMonitor.sTopActivity = activity;
            }
            Application.ActivityLifecycleCallbacks[] collectCallbacks = collectCallbacks();
            if (collectCallbacks != null) {
                for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : collectCallbacks) {
                    long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int startupSection = Aurora.getStartupSection();
                    activityLifecycleCallbacks.onActivityResumed(activity);
                    AuroraReporter.collectLifeCycleData(activityLifecycleCallbacks.getClass().getName(), elapsedRealtime, currentThreadTimeMillis, "lifecycle_resumed", startupSection);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Application.ActivityLifecycleCallbacks[] collectCallbacks;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82acdeee88c63172b2ca2a1c1efcf278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82acdeee88c63172b2ca2a1c1efcf278");
        } else if (!isIgnore(activity) && (collectCallbacks = collectCallbacks()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : collectCallbacks) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int startupSection = Aurora.getStartupSection();
                activityLifecycleCallbacks.onActivityPaused(activity);
                AuroraReporter.collectLifeCycleData(activityLifecycleCallbacks.getClass().getName(), elapsedRealtime, currentThreadTimeMillis, "lifecycle_paused", startupSection);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f2fef3af4bfd5cfdaee787806d4ce66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f2fef3af4bfd5cfdaee787806d4ce66");
        } else if (!isIgnore(activity)) {
            if (this.mSwitchCount <= 0) {
                this.mSwitchCount = 0;
            } else {
                this.mSwitchCount--;
            }
            if (this.mSwitchCount == 0) {
                this.state = 2;
                AuroraReporter.onBackground();
            }
            this.mActivities.remove(activity);
            ActivitySwitchMonitor.sTopActivity = this.mActivities.isEmpty() ? null : this.mActivities.get(0);
            Application.ActivityLifecycleCallbacks[] collectCallbacks = collectCallbacks();
            if (collectCallbacks != null) {
                for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : collectCallbacks) {
                    long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int startupSection = Aurora.getStartupSection();
                    activityLifecycleCallbacks.onActivityStopped(activity);
                    AuroraReporter.collectLifeCycleData(activityLifecycleCallbacks.getClass().getName(), elapsedRealtime, currentThreadTimeMillis, "lifecycle_stopped", startupSection);
                    if (this.mSwitchCount == 0 && (activityLifecycleCallbacks instanceof ActivitySwitchCallbacks)) {
                        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        int startupSection2 = Aurora.getStartupSection();
                        ((ActivitySwitchCallbacks) activityLifecycleCallbacks).onBackground();
                        AuroraReporter.collectLifeCycleData(activityLifecycleCallbacks.getClass().getName(), elapsedRealtime2, currentThreadTimeMillis2, "lifecycle_background", startupSection2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Application.ActivityLifecycleCallbacks[] collectCallbacks;
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a04e879abf4740c0f75ff36be9afe133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a04e879abf4740c0f75ff36be9afe133");
        } else if (!isIgnore(activity) && (collectCallbacks = collectCallbacks()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : collectCallbacks) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Application.ActivityLifecycleCallbacks[] collectCallbacks;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29117ede14121abed24adc10e4a45ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29117ede14121abed24adc10e4a45ee9");
        } else if (!isIgnore(activity) && (collectCallbacks = collectCallbacks()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : collectCallbacks) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int startupSection = Aurora.getStartupSection();
                activityLifecycleCallbacks.onActivityDestroyed(activity);
                AuroraReporter.collectLifeCycleData(activityLifecycleCallbacks.getClass().getName(), elapsedRealtime, currentThreadTimeMillis, "lifecycle_destroyed", startupSection);
            }
        }
    }
}
