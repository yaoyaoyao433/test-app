package com.meituan.android.neohybrid;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    public static LinkedList<WeakReference<Activity>> b = new LinkedList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25fd68e81109fd0ae775a30229de816e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25fd68e81109fd0ae775a30229de816e");
        } else if (com.meituan.android.neohybrid.init.a.d() instanceof Application) {
            Application application = (Application) com.meituan.android.neohybrid.init.a.d();
            application.unregisterActivityLifecycleCallbacks(b());
            application.registerActivityLifecycleCallbacks(b());
        }
    }

    public c() {
    }

    private static c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc558e224bc9471c6e71d74211e6ee23", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc558e224bc9471c6e71d74211e6ee23") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final c a = new c();
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3028e0f2fcc99ead4888a4b4f86d40e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3028e0f2fcc99ead4888a4b4f86d40e0")).booleanValue();
        }
        Iterator<WeakReference<Activity>> it = b.iterator();
        while (it.hasNext()) {
            Activity activity2 = it.next().get();
            if (activity2 != null && !activity2.isFinishing()) {
                return activity2 == activity;
            }
            it.remove();
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4895e779dbba274366c3e09061b05ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4895e779dbba274366c3e09061b05ad0");
            return;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9993f3fcac1b94a1a58d19d68e520c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9993f3fcac1b94a1a58d19d68e520c0");
        } else {
            b.push(new WeakReference<>(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d59326a22c687328cdf6e153c5e430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d59326a22c687328cdf6e153c5e430");
            return;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76c64517fa277a7faf066a13d533ec3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76c64517fa277a7faf066a13d533ec3a");
            return;
        }
        Iterator<WeakReference<Activity>> it = b.iterator();
        while (it.hasNext()) {
            WeakReference<Activity> next = it.next();
            if (next == null) {
                it.remove();
            } else {
                Activity activity2 = next.get();
                if (activity2 == null) {
                    it.remove();
                } else if (activity2 == activity) {
                    it.remove();
                }
            }
        }
    }
}
