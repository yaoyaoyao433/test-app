package com.meituan.android.customerservice.kit.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    public boolean b;
    private List<b> c;
    private WeakReference<Activity> d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed850a1340236458fc35b40de57d6d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed850a1340236458fc35b40de57d6d87");
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

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8ad1acad20e608d565cb0e06ab0a04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8ad1acad20e608d565cb0e06ab0a04");
            return;
        }
        this.c = new CopyOnWriteArrayList();
        this.b = false;
        this.d = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b850c66f3ab35a28f5f39a44310e02a", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b850c66f3ab35a28f5f39a44310e02a") : a.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f39595e4903d8196ce3c62875e4f88f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f39595e4903d8196ce3c62875e4f88f0");
            return;
        }
        this.d = new WeakReference<>(activity);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f04c7478a7452ce355e33fcfdb8f75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f04c7478a7452ce355e33fcfdb8f75");
        } else if (this.d == null || this.d.get() == activity) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "529cc7f114a13a1e6b2c5c0312a63eb2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "529cc7f114a13a1e6b2c5c0312a63eb2");
            } else if (this.b) {
                this.b = false;
                for (b bVar : this.c) {
                    try {
                        bVar.b();
                    } catch (Exception e) {
                        Class<?> cls = getClass();
                        com.meituan.android.customerservice.kit.utils.b.a(cls, "Listener threw exception:" + e);
                    }
                }
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8572fb23211dc35b5777292e1292450b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8572fb23211dc35b5777292e1292450b");
        } else if (!this.b) {
            this.b = true;
            for (b bVar : this.c) {
                try {
                    bVar.a();
                } catch (Exception e) {
                    Class<?> cls = getClass();
                    com.meituan.android.customerservice.kit.utils.b.a(cls, "Listener threw exception:" + e);
                }
            }
        }
    }

    public final synchronized void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba38bb34b407fd20495d5884d9d02548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba38bb34b407fd20495d5884d9d02548");
            return;
        }
        if (bVar != null && !this.c.contains(bVar)) {
            this.c.add(bVar);
        }
    }

    public final synchronized void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9018aa4022092a4ac4640fdf023639d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9018aa4022092a4ac4640fdf023639d5");
        } else if (bVar == null) {
        } else {
            this.c.remove(bVar);
        }
    }
}
