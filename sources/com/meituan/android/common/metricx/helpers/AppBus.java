package com.meituan.android.common.metricx.helpers;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.AnyThread;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AppBus {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile String currentPageName = "";
    private static volatile boolean isForeground = false;
    private final Executor lifeCycleCallbackExecutor;
    private int mActivityVisibleCount;
    private ConcurrentLinkedQueue<OnBackgroundListener> mBgListeners;
    private ConcurrentLinkedQueue<OnBackgroundListener> mBgUIListeners;
    private ConcurrentLinkedQueue<OnForegroundListener> mFgListeners;
    private ConcurrentLinkedQueue<OnForegroundListener> mFgUIListeners;
    private AtomicBoolean mInit;
    private CopyOnWriteArrayList<Application.ActivityLifecycleCallbacks> mRawCallbackListeners;
    private ConcurrentLinkedQueue<OnStopListener> mStopListeners;
    private ConcurrentLinkedQueue<OnStopListener> mStopUIListener;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnBackgroundListener {
        void onBackground();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnBackgroundUIListener extends OnBackgroundListener {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnForegroundListener {
        void onForeground();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnForegroundUIListener extends OnForegroundListener {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnStopListener {
        void onStopped(Activity activity);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnStopUIListener extends OnStopListener {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class _Inner {
        public static AppBus _instance = new AppBus();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public AppBus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1c36e4f65bff8c958ce2cbfefe24caa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1c36e4f65bff8c958ce2cbfefe24caa");
            return;
        }
        this.mBgListeners = new ConcurrentLinkedQueue<>();
        this.mBgUIListeners = new ConcurrentLinkedQueue<>();
        this.mStopListeners = new ConcurrentLinkedQueue<>();
        this.mStopUIListener = new ConcurrentLinkedQueue<>();
        this.mFgListeners = new ConcurrentLinkedQueue<>();
        this.mFgUIListeners = new ConcurrentLinkedQueue<>();
        this.mRawCallbackListeners = new CopyOnWriteArrayList<>();
        this.mActivityVisibleCount = 0;
        this.mInit = new AtomicBoolean(false);
        this.lifeCycleCallbackExecutor = c.a("MetricX-AppBus");
    }

    @AnyThread
    public void register(@NonNull OnBackgroundListener onBackgroundListener) {
        Object[] objArr = {onBackgroundListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2edfe353baab11642a04107b57f4d3cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2edfe353baab11642a04107b57f4d3cc");
        } else {
            register(onBackgroundListener, true);
        }
    }

    @AnyThread
    public void register(@NonNull OnBackgroundListener onBackgroundListener, boolean z) {
        Object[] objArr = {onBackgroundListener, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bef68316675ee045959ce6241321a14c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bef68316675ee045959ce6241321a14c");
            return;
        }
        if (onBackgroundListener instanceof OnBackgroundUIListener) {
            this.mBgUIListeners.add(onBackgroundListener);
        } else {
            this.mBgListeners.add(onBackgroundListener);
        }
        if (z) {
            stickyCallbackBgIfNeed(onBackgroundListener);
        }
    }

    public void register(@NonNull OnStopListener onStopListener) {
        Object[] objArr = {onStopListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9104cabde648db9799139309cb2332d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9104cabde648db9799139309cb2332d0");
        } else if (onStopListener instanceof OnStopUIListener) {
            this.mStopUIListener.add(onStopListener);
        } else {
            this.mStopListeners.add(onStopListener);
        }
    }

    public void register(@NonNull OnForegroundListener onForegroundListener) {
        Object[] objArr = {onForegroundListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75df2c56198b516dea24effc3452e461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75df2c56198b516dea24effc3452e461");
        } else {
            register(onForegroundListener, true);
        }
    }

    public void register(@NonNull OnForegroundListener onForegroundListener, boolean z) {
        Object[] objArr = {onForegroundListener, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42bd76430e510c69675464c207f72c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42bd76430e510c69675464c207f72c2c");
            return;
        }
        if (onForegroundListener instanceof OnForegroundUIListener) {
            this.mFgUIListeners.add(onForegroundListener);
        } else {
            this.mFgListeners.add(onForegroundListener);
        }
        if (z) {
            stickyCallbackFgIfNeed(onForegroundListener);
        }
    }

    public void register(@NonNull Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Object[] objArr = {activityLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a439902429297fc239d45f3934797a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a439902429297fc239d45f3934797a0e");
        } else {
            this.mRawCallbackListeners.add(activityLifecycleCallbacks);
        }
    }

    public void unregister(@NonNull OnBackgroundListener onBackgroundListener) {
        Object[] objArr = {onBackgroundListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4e906751065f4b050e482aa576d2482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4e906751065f4b050e482aa576d2482");
        } else if (onBackgroundListener instanceof OnBackgroundUIListener) {
            this.mBgUIListeners.remove(onBackgroundListener);
        } else {
            this.mBgListeners.remove(onBackgroundListener);
        }
    }

    public void unregister(@NonNull OnForegroundListener onForegroundListener) {
        Object[] objArr = {onForegroundListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b361e0e1fe60459a05008acaf1103f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b361e0e1fe60459a05008acaf1103f0");
        } else if (onForegroundListener instanceof OnForegroundUIListener) {
            this.mFgUIListeners.remove(onForegroundListener);
        } else {
            this.mFgListeners.remove(onForegroundListener);
        }
    }

    public void unregister(@NonNull Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Object[] objArr = {activityLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76302cedd216dd01e10473007bbdf116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76302cedd216dd01e10473007bbdf116");
        } else {
            this.mRawCallbackListeners.remove(activityLifecycleCallbacks);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void notifyBg() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f904d9f9c2676bdb9aefb6b72633b6cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f904d9f9c2676bdb9aefb6b72633b6cc");
            return;
        }
        isForeground = false;
        Iterator<OnBackgroundListener> it = this.mBgUIListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onBackground();
            } catch (Throwable th) {
                ILogger metricxLogger = Logger.getMetricxLogger();
                metricxLogger.e("notifyPostUIBg failed: " + th.getMessage(), th);
            }
        }
        b.a(this.lifeCycleCallbackExecutor, new Runnable() { // from class: com.meituan.android.common.metricx.helpers.AppBus.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "777d6b140fd44759ffa40b863c98ca8b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "777d6b140fd44759ffa40b863c98ca8b");
                    return;
                }
                Logger.getMetricxLogger().d("notifyPostAsyncBg");
                Iterator it2 = AppBus.this.mBgListeners.iterator();
                while (it2.hasNext()) {
                    try {
                        ((OnBackgroundListener) it2.next()).onBackground();
                    } catch (Throwable th2) {
                        ILogger metricxLogger2 = Logger.getMetricxLogger();
                        metricxLogger2.e("notifyPostAsyncBg failed: " + th2.getMessage(), th2);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void notifyStop(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b66dbe3d63769503d50f016ab4e162ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b66dbe3d63769503d50f016ab4e162ab");
            return;
        }
        Iterator<OnStopListener> it = this.mStopUIListener.iterator();
        while (it.hasNext()) {
            try {
                it.next().onStopped(activity);
            } catch (Throwable th) {
                ILogger metricxLogger = Logger.getMetricxLogger();
                metricxLogger.e("notifyUIStop failed: " + th.getMessage(), th);
            }
        }
        final WeakReference weakReference = new WeakReference(activity);
        b.a(this.lifeCycleCallbackExecutor, new Runnable() { // from class: com.meituan.android.common.metricx.helpers.AppBus.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1658fc09f494ee7449822f99ff9715fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1658fc09f494ee7449822f99ff9715fe");
                    return;
                }
                Logger.getMetricxLogger().d("notifyAsyncStop");
                Iterator it2 = AppBus.this.mStopListeners.iterator();
                while (it2.hasNext()) {
                    OnStopListener onStopListener = (OnStopListener) it2.next();
                    try {
                        if (weakReference.get() != null) {
                            onStopListener.onStopped((Activity) weakReference.get());
                        }
                    } catch (Throwable th2) {
                        ILogger metricxLogger2 = Logger.getMetricxLogger();
                        metricxLogger2.e("notifyAsyncStop failed: " + th2.getMessage(), th2);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void notifyForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c26d9d2428bbcea0d9f0433d89650489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c26d9d2428bbcea0d9f0433d89650489");
            return;
        }
        isForeground = true;
        Iterator<OnForegroundListener> it = this.mFgUIListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onForeground();
            } catch (Throwable th) {
                ILogger metricxLogger = Logger.getMetricxLogger();
                metricxLogger.e("notifyUIForeground failed: " + th.getMessage(), th);
            }
        }
        b.a(this.lifeCycleCallbackExecutor, new Runnable() { // from class: com.meituan.android.common.metricx.helpers.AppBus.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "066b179fe690444368e2bb6c4f915648", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "066b179fe690444368e2bb6c4f915648");
                    return;
                }
                Logger.getMetricxLogger().d("notifyAsyncForeground");
                Iterator it2 = AppBus.this.mFgListeners.iterator();
                while (it2.hasNext()) {
                    try {
                        ((OnForegroundListener) it2.next()).onForeground();
                    } catch (Throwable th2) {
                        ILogger metricxLogger2 = Logger.getMetricxLogger();
                        metricxLogger2.e("notifyAsyncForeground failed: " + th2.getMessage(), th2);
                    }
                }
            }
        });
    }

    @AnyThread
    public void init(@NonNull Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "721272be4b6e06cdb6e3d47d217870b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "721272be4b6e06cdb6e3d47d217870b2");
        } else if (this.mInit.compareAndSet(false, true)) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.common.metricx.helpers.AppBus.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    Object[] objArr2 = {activity, bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "583be27145ad62acb3706d8bc32cab2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "583be27145ad62acb3706d8bc32cab2e");
                        return;
                    }
                    Iterator it = AppBus.this.mRawCallbackListeners.iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityCreated(activity, bundle);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5b74e76f9dda692fa6f31818b34f68f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5b74e76f9dda692fa6f31818b34f68f1");
                        return;
                    }
                    AppBus.this.mActivityVisibleCount++;
                    if (AppBus.this.mActivityVisibleCount == 1) {
                        AppBus.this.notifyForeground();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7f8225c0c7fd541c3f2561f2f4761942", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7f8225c0c7fd541c3f2561f2f4761942");
                        return;
                    }
                    String unused = AppBus.currentPageName = activity.getClass().getName();
                    Iterator it = AppBus.this.mRawCallbackListeners.iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityResumed(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "047645b8782761222ab492268b05e310", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "047645b8782761222ab492268b05e310");
                        return;
                    }
                    Iterator it = AppBus.this.mRawCallbackListeners.iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityPaused(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5926c32514eb3377686a46a8e806da16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5926c32514eb3377686a46a8e806da16");
                        return;
                    }
                    Iterator it = AppBus.this.mRawCallbackListeners.iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityStopped(activity);
                    }
                    AppBus.this.mActivityVisibleCount--;
                    AppBus.this.notifyStop(activity);
                    if (AppBus.this.mActivityVisibleCount <= 0) {
                        AppBus.this.mActivityVisibleCount = 0;
                        AppBus.this.notifyBg();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    Object[] objArr2 = {activity, bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f746dce17d465d461f7a2a3908b7607", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f746dce17d465d461f7a2a3908b7607");
                        return;
                    }
                    Iterator it = AppBus.this.mRawCallbackListeners.iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivitySaveInstanceState(activity, bundle);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "262c4386368572014811c3b04d618aa9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "262c4386368572014811c3b04d618aa9");
                        return;
                    }
                    Iterator it = AppBus.this.mRawCallbackListeners.iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityDestroyed(activity);
                    }
                }
            });
        }
    }

    public static AppBus getInstance() {
        return _Inner._instance;
    }

    public String getCurrentPageName() {
        return currentPageName;
    }

    public boolean isForeground() {
        return isForeground;
    }

    private void stickyCallbackBgIfNeed(final OnBackgroundListener onBackgroundListener) {
        Object[] objArr = {onBackgroundListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "719899b63fbc8462749aaf2d5b6f6115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "719899b63fbc8462749aaf2d5b6f6115");
        } else if (isForeground) {
        } else {
            Runnable runnable = new Runnable() { // from class: com.meituan.android.common.metricx.helpers.AppBus.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "09fac5ebb5471dc399954ec79f48e4be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "09fac5ebb5471dc399954ec79f48e4be");
                    } else {
                        onBackgroundListener.onBackground();
                    }
                }
            };
            if (onBackgroundListener instanceof OnBackgroundUIListener) {
                ThreadManager.getInstance().runInMainThread(runnable);
            } else {
                b.a(this.lifeCycleCallbackExecutor, runnable);
            }
        }
    }

    private void stickyCallbackFgIfNeed(final OnForegroundListener onForegroundListener) {
        Object[] objArr = {onForegroundListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afa6fcb61bd98126af70b8186a070ac4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afa6fcb61bd98126af70b8186a070ac4");
        } else if (isForeground) {
            Runnable runnable = new Runnable() { // from class: com.meituan.android.common.metricx.helpers.AppBus.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "060ff83934fd017fadd5c8cfae5e0a17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "060ff83934fd017fadd5c8cfae5e0a17");
                    } else {
                        onForegroundListener.onForeground();
                    }
                }
            };
            if (onForegroundListener instanceof OnForegroundUIListener) {
                ThreadManager.getInstance().runInMainThread(runnable);
            } else {
                b.a(this.lifeCycleCallbackExecutor, runnable);
            }
        }
    }
}
