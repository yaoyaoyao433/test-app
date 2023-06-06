package com.dianping.shield.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/dianping/shield/lifecycle/AppObserver;", "", "()V", "activityCount", "", "callbacks", "", "Lcom/dianping/shield/lifecycle/AppSwitchCallback;", "foreground", "", "mSwitchCount", "getActivityCount", "init", "", "app", "Landroid/app/Application;", "isForeground", "registerAppSwitchCallback", "callback", "unregisterAppSwitchCallback", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AppObserver {
    private static int activityCount;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int mSwitchCount;
    public static final AppObserver INSTANCE = new AppObserver();
    private static final List<AppSwitchCallback> callbacks = new LinkedList();
    private static boolean foreground = true;

    public final void init(@NotNull Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "850534baf96c7d63860d99921949aefe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "850534baf96c7d63860d99921949aefe");
            return;
        }
        h.b(application, "app");
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.dianping.shield.lifecycle.AppObserver$init$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(@Nullable Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(@Nullable Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(@Nullable Activity activity, @Nullable Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(@Nullable Activity activity) {
                int i;
                int i2;
                int i3;
                List list;
                List<AppSwitchCallback> list2;
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "da438b719f8fe88bfe306891ac027cc9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "da438b719f8fe88bfe306891ac027cc9");
                    return;
                }
                AppObserver appObserver = AppObserver.INSTANCE;
                i = AppObserver.mSwitchCount;
                if (i <= 0) {
                    AppObserver appObserver2 = AppObserver.INSTANCE;
                    AppObserver.mSwitchCount = 1;
                } else {
                    AppObserver appObserver3 = AppObserver.INSTANCE;
                    i2 = AppObserver.mSwitchCount;
                    AppObserver.mSwitchCount = i2 + 1;
                }
                AppObserver appObserver4 = AppObserver.INSTANCE;
                i3 = AppObserver.mSwitchCount;
                if (i3 == 1) {
                    AppObserver appObserver5 = AppObserver.INSTANCE;
                    list = AppObserver.callbacks;
                    synchronized (list) {
                        AppObserver appObserver6 = AppObserver.INSTANCE;
                        AppObserver.foreground = true;
                        AppObserver appObserver7 = AppObserver.INSTANCE;
                        list2 = AppObserver.callbacks;
                        for (AppSwitchCallback appSwitchCallback : list2) {
                            appSwitchCallback.onForeground();
                        }
                        r rVar = r.a;
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(@Nullable Activity activity) {
                int i;
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "42ebbc5d5b7a9754b68cacce4c7a8229", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "42ebbc5d5b7a9754b68cacce4c7a8229");
                    return;
                }
                AppObserver appObserver = AppObserver.INSTANCE;
                i = AppObserver.activityCount;
                AppObserver.activityCount = i - 1;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(@Nullable Activity activity) {
                int i;
                int i2;
                int i3;
                List list;
                List<AppSwitchCallback> list2;
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "de748c2329c6402fec6e9f3034e1e524", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "de748c2329c6402fec6e9f3034e1e524");
                    return;
                }
                AppObserver appObserver = AppObserver.INSTANCE;
                i = AppObserver.mSwitchCount;
                if (i <= 0) {
                    AppObserver appObserver2 = AppObserver.INSTANCE;
                    AppObserver.mSwitchCount = 0;
                } else {
                    AppObserver appObserver3 = AppObserver.INSTANCE;
                    i2 = AppObserver.mSwitchCount;
                    AppObserver.mSwitchCount = i2 - 1;
                }
                AppObserver appObserver4 = AppObserver.INSTANCE;
                i3 = AppObserver.mSwitchCount;
                if (i3 == 0) {
                    AppObserver appObserver5 = AppObserver.INSTANCE;
                    list = AppObserver.callbacks;
                    synchronized (list) {
                        AppObserver appObserver6 = AppObserver.INSTANCE;
                        AppObserver.foreground = false;
                        AppObserver appObserver7 = AppObserver.INSTANCE;
                        list2 = AppObserver.callbacks;
                        for (AppSwitchCallback appSwitchCallback : list2) {
                            appSwitchCallback.onBackground();
                        }
                        r rVar = r.a;
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(@Nullable Activity activity, @Nullable Bundle bundle) {
                int i;
                Object[] objArr2 = {activity, bundle};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "71e0433a90d89cd01c81353505c4bd9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "71e0433a90d89cd01c81353505c4bd9a");
                    return;
                }
                AppObserver appObserver = AppObserver.INSTANCE;
                i = AppObserver.activityCount;
                AppObserver.activityCount = i + 1;
            }
        });
    }

    public final void registerAppSwitchCallback(@NotNull AppSwitchCallback appSwitchCallback) {
        Object[] objArr = {appSwitchCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "314b94179386b800144a59fd998b413d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "314b94179386b800144a59fd998b413d");
            return;
        }
        h.b(appSwitchCallback, "callback");
        synchronized (callbacks) {
            callbacks.add(appSwitchCallback);
        }
    }

    public final void unregisterAppSwitchCallback(@NotNull AppSwitchCallback appSwitchCallback) {
        Object[] objArr = {appSwitchCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e14d5da1b1d0e044021ea598bdacc367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e14d5da1b1d0e044021ea598bdacc367");
            return;
        }
        h.b(appSwitchCallback, "callback");
        synchronized (callbacks) {
            callbacks.remove(appSwitchCallback);
        }
    }

    public final boolean isForeground() {
        return foreground;
    }

    public final int getActivityCount() {
        return activityCount;
    }
}
