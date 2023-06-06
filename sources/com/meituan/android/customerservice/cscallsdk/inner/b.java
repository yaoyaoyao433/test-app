package com.meituan.android.customerservice.cscallsdk.inner;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private List<InterfaceC0245b> b;
    private boolean c;
    private WeakReference<Activity> d;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.cscallsdk.inner.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0245b {
        void a();

        void b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1079d84c7e91ae78edec16ef3df3c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1079d84c7e91ae78edec16ef3df3c9");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82479be4879177a89ef75b0b40c42045", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82479be4879177a89ef75b0b40c42045");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        this.c = false;
        this.d = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        private static b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6e8f0d3fee81eca73c7ce2e68e53d7b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6e8f0d3fee81eca73c7ce2e68e53d7b") : a.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afeaca16b7dd1ea71f6bd83c3e955ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afeaca16b7dd1ea71f6bd83c3e955ef7");
            return;
        }
        this.d = new WeakReference<>(activity);
        if (this.c) {
            return;
        }
        this.c = true;
        for (InterfaceC0245b interfaceC0245b : this.b) {
            try {
                interfaceC0245b.a();
            } catch (Exception e) {
                Class<?> cls = getClass();
                CallLog.e(cls, "Listener threw exception:" + e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92fa4d283a4fa008c89b21ee02f1ef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92fa4d283a4fa008c89b21ee02f1ef9");
        } else if ((this.d == null || this.d.get() == activity) && this.c) {
            this.c = false;
            for (InterfaceC0245b interfaceC0245b : this.b) {
                try {
                    interfaceC0245b.b();
                } catch (Exception e) {
                    Class<?> cls = getClass();
                    CallLog.e(cls, "Listener threw exception:" + e);
                }
            }
        }
    }

    public final synchronized void a(InterfaceC0245b interfaceC0245b) {
        Object[] objArr = {interfaceC0245b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1d0a67721457f9aabcc3e247718d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1d0a67721457f9aabcc3e247718d2a");
        } else if (this.b.contains(interfaceC0245b)) {
        } else {
            this.b.add(interfaceC0245b);
        }
    }

    public final synchronized void b(InterfaceC0245b interfaceC0245b) {
        Object[] objArr = {interfaceC0245b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "529f61b13bd60732aae7d4d1c4906574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "529f61b13bd60732aae7d4d1c4906574");
        } else {
            this.b.remove(interfaceC0245b);
        }
    }
}
