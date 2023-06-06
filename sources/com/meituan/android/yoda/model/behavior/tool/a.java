package com.meituan.android.yoda.model.behavior.tool;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static e b;
    private static Application.ActivityLifecycleCallbacks c;
    private static Application d;
    private static WeakReference<Activity> e;

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a04f90f3a3f85b2f48b223b53a0c3673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a04f90f3a3f85b2f48b223b53a0c3673");
        } else if (y.a(activity)) {
        } else {
            if (d == null) {
                d = activity.getApplication();
            }
            d(activity);
            if (b != null) {
                if (activity.getClass().getName().equalsIgnoreCase(b.b)) {
                    return;
                }
                b.a();
            }
            e eVar = new e();
            b = eVar;
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "3ad0818a50ed7577b8156368c1583a81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "3ad0818a50ed7577b8156368c1583a81");
            } else {
                eVar.c = Privacy.createSensorManager(activity, "jcyf-7f184de1913fbddc");
                if (eVar.c != null) {
                    eVar.d = eVar.c.getDefaultSensor(1);
                    if (eVar.d != null) {
                        eVar.c.registerListener(eVar.e, eVar.d, 3);
                    }
                }
            }
            Application application = d;
            Object[] objArr3 = {application};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5f9cf9954a8f50a605135081150efbac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5f9cf9954a8f50a605135081150efbac");
            } else if (c == null) {
                c = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.yoda.model.behavior.tool.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity2, Bundle bundle) {
                        Object[] objArr4 = {activity2, bundle};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "155ee7cb826f3fa6df809ec9b9c39d64", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "155ee7cb826f3fa6df809ec9b9c39d64");
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity2) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity2) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity2) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity2) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity2) {
                        Object[] objArr4 = {activity2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "71c8bdebb75c7acca9092c64b64e743a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "71c8bdebb75c7acca9092c64b64e743a");
                        } else {
                            a.d(activity2);
                        }
                    }
                };
                application.registerActivityLifecycleCallbacks(c);
            }
        }
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d8a61cda2d27370de98fbfff1212658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d8a61cda2d27370de98fbfff1212658");
        } else if (y.a(activity) || b == null) {
        } else {
            b.a();
        }
    }

    public static Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fdaf501bcb6e0ea06360d68731a5e68", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fdaf501bcb6e0ea06360d68731a5e68");
        }
        if (e != null) {
            return e.get();
        }
        return null;
    }

    public static Application b() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a00f2835ddc9dc615f45f007ae31fa68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a00f2835ddc9dc615f45f007ae31fa68");
            return;
        }
        if (e != null) {
            if (activity == e.get()) {
                return;
            }
            e.clear();
        }
        e = new WeakReference<>(activity);
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c4a4515b06c502283ef7a9003cc4c95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c4a4515b06c502283ef7a9003cc4c95");
            return;
        }
        if (b != null) {
            b.a();
            b = null;
        }
        if (c != null) {
            if (d != null) {
                d.unregisterActivityLifecycleCallbacks(c);
            }
            c = null;
        }
        if (e != null && e.get() != null) {
            e.clear();
            e = null;
        }
        d = null;
    }
}
