package com.meituan.metrics.window.callback;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MetricsActivityWindowCallbackManager implements ActivityWindowTouchCallbackInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MetricsActivityWindowCallbackManager sInstance;
    private final WeakHashMap<Activity, Set<ActivityWindowTouchCallbackInterface>> windowCallbackArray;

    public MetricsActivityWindowCallbackManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb81c438888f1339e97299b90e71dbbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb81c438888f1339e97299b90e71dbbd");
        } else {
            this.windowCallbackArray = new WeakHashMap<>();
        }
    }

    public static synchronized MetricsActivityWindowCallbackManager getInstance() {
        synchronized (MetricsActivityWindowCallbackManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfc0f88abbfee28bc06cc4efcbe3edcc", RobustBitConfig.DEFAULT_VALUE)) {
                return (MetricsActivityWindowCallbackManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfc0f88abbfee28bc06cc4efcbe3edcc");
            }
            if (sInstance == null) {
                synchronized (MetricsActivityWindowCallbackManager.class) {
                    if (sInstance == null) {
                        sInstance = new MetricsActivityWindowCallbackManager();
                    }
                }
            }
            return sInstance;
        }
    }

    @Override // com.meituan.metrics.window.callback.ActivityWindowTouchCallbackInterface
    public final void dispatchTouchEvent(@Nullable Activity activity, MotionEvent motionEvent) {
        Set<ActivityWindowTouchCallbackInterface> set;
        Object[] objArr = {activity, motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5c31b1172d827e2fcf2d5c29cc17cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5c31b1172d827e2fcf2d5c29cc17cba");
        } else if (activity != null && (set = this.windowCallbackArray.get(activity)) != null && set.size() > 0) {
            for (ActivityWindowTouchCallbackInterface activityWindowTouchCallbackInterface : set) {
                if (activityWindowTouchCallbackInterface != null) {
                    activityWindowTouchCallbackInterface.dispatchTouchEvent(activity, motionEvent);
                }
            }
        }
    }

    @UiThread
    public final void registerWindowCallback(Activity activity, ActivityWindowTouchCallbackInterface activityWindowTouchCallbackInterface) {
        Object[] objArr = {activity, activityWindowTouchCallbackInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf7bb9734bc8c732e5869df394cf3cee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf7bb9734bc8c732e5869df394cf3cee");
        } else if (activity == null || activityWindowTouchCallbackInterface == null) {
        } else {
            Set<ActivityWindowTouchCallbackInterface> set = this.windowCallbackArray.get(activity);
            if (set != null) {
                set.add(activityWindowTouchCallbackInterface);
            } else if (setWindowCallback(activity)) {
                HashSet hashSet = new HashSet();
                hashSet.add(activityWindowTouchCallbackInterface);
                this.windowCallbackArray.put(activity, hashSet);
            }
        }
    }

    private boolean setWindowCallback(Activity activity) {
        Window window;
        Window.Callback callback;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27242a3b5409fad9bc29298cae9afce8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27242a3b5409fad9bc29298cae9afce8")).booleanValue();
        }
        if (activity == null || (window = activity.getWindow()) == null || (callback = window.getCallback()) == null) {
            return false;
        }
        window.setCallback(new WindowTouchCallback(activity, callback, this));
        return true;
    }
}
