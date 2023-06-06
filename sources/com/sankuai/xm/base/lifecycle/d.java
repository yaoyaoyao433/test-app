package com.sankuai.xm.base.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.x;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private static volatile d c;
    public int b;
    private List<Activity> d;
    private Application e;
    private final List<com.sankuai.xm.base.lifecycle.a> f;
    private volatile boolean g;
    private volatile boolean h;
    private volatile a i;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        @Nullable
        Activity a();
    }

    private static String b(int i) {
        switch (i) {
            case 0:
                return "前台";
            case 1:
                return "后台";
            default:
                return "未知";
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63a3e8b985b78dd4bae49b2a9841656", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63a3e8b985b78dd4bae49b2a9841656");
            return;
        }
        this.f = new ArrayList();
        this.b = -1;
        this.g = false;
        this.h = false;
        this.d = new ArrayList();
    }

    public final synchronized void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a192c818026d300fe85ff1e6357f4fa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a192c818026d300fe85ff1e6357f4fa5");
        } else if (this.g) {
        } else {
            if (context == null) {
                com.sankuai.xm.log.c.d("LifecycleService", "init, context is null", new Object[0]);
                return;
            }
            if (context.getApplicationContext() instanceof Application) {
                this.e = (Application) context.getApplicationContext();
            } else if (context instanceof Application) {
                this.e = (Application) context;
            }
            if (this.e != null) {
                this.e.registerActivityLifecycleCallbacks(this);
                f.m().a(this.e);
                this.g = true;
                this.h = z;
                return;
            }
            com.sankuai.xm.log.c.d("LifecycleService", "init failed, get application failed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a823ac7cceadccc563c36ef2f02d5a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a823ac7cceadccc563c36ef2f02d5a7");
            return;
        }
        com.sankuai.xm.log.c.b("LifecycleService", "onActivityCreated::" + activity, new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe5bfd50631b908283373d490493c48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe5bfd50631b908283373d490493c48");
            return;
        }
        this.d.add(0, activity);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533a6d2d3ca0eec8e6e1f30837b1eb04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533a6d2d3ca0eec8e6e1f30837b1eb04");
        } else if (this.d.isEmpty() || this.d.get(0) != activity) {
            this.d.remove(activity);
            this.d.add(0, activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60e2bff2ad7855b55bb23ed7cc900940", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60e2bff2ad7855b55bb23ed7cc900940");
            return;
        }
        this.d.remove(activity);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c60385d0763d45207b26e9ace882cd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c60385d0763d45207b26e9ace882cd5");
            return;
        }
        com.sankuai.xm.log.c.b("LifecycleService", "onActivityDestroyed::" + activity, new Object[0]);
    }

    public final Application a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff7356402f89b297fa9b1226fe55a13", 6917529027641081856L)) {
            return (Application) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff7356402f89b297fa9b1226fe55a13");
        }
        if (this.e == null) {
            this.e = (Application) x.a("android.app.ActivityThread", "currentApplication", (Class[]) null, (Object[]) null);
            com.sankuai.xm.log.c.c("LifecycleService", "getApp:: reflect from ActivityThread %s.", this.e);
        }
        return this.e;
    }

    public final Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8a69524ed62f731d815c96425a19cf3", 6917529027641081856L)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8a69524ed62f731d815c96425a19cf3");
        }
        Activity activity = this.d.isEmpty() ? null : this.d.get(0);
        if (activity != null) {
            return activity;
        }
        if (this.i != null) {
            return this.i.a();
        }
        return null;
    }

    public final synchronized void a(com.sankuai.xm.base.lifecycle.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08755908e916dd93cea45e00e235a8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08755908e916dd93cea45e00e235a8a");
            return;
        }
        if (aVar != null) {
            this.f.add(aVar);
        }
    }

    public final synchronized void b(com.sankuai.xm.base.lifecycle.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9792465b100282d38deae69c2d73dc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9792465b100282d38deae69c2d73dc2");
        } else {
            this.f.remove(aVar);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddda8732046ca7d8c23471a9f1b3bfcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddda8732046ca7d8c23471a9f1b3bfcc");
        } else if (e()) {
            f.m().a(this.b);
            a(this.b);
        }
    }

    private void a(int i) {
        ArrayList<com.sankuai.xm.base.lifecycle.a> arrayList;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b7cb322e0f93a25f3fe86d77b93908", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b7cb322e0f93a25f3fe86d77b93908");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.f);
        }
        for (com.sankuai.xm.base.lifecycle.a aVar : arrayList) {
            aVar.a(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc79ab3d41412365b34994ba04c6520", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc79ab3d41412365b34994ba04c6520")).booleanValue();
        }
        boolean isEmpty = this.d.isEmpty();
        ?? r1 = isEmpty;
        r1 = isEmpty;
        if (!this.h && isEmpty) {
            boolean z = !f();
            com.sankuai.xm.log.c.b("LifecycleService", "updateAppStateIfNeed:: appState = %s, trustedAppState = %s", 1, Integer.valueOf(z ? 1 : 0));
            r1 = z;
            if (z) {
                com.sankuai.xm.log.c.b("LifecycleService", "updateAppStateIfNeed:: trust activities size", new Object[0]);
                this.h = true;
                r1 = z;
            }
        }
        if (r1 == this.b) {
            return false;
        }
        com.sankuai.xm.log.c.b("LifecycleService", "updateAppStateIfNeed:: appState[trust: %s] changed: from %s to %s", Boolean.valueOf(this.h), b(this.b), b((int) r1));
        this.b = r1;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:7:0x0020, B:9:0x0037, B:15:0x0043), top: B:22:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean f() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.base.lifecycle.d.a
            java.lang.String r10 = "331628a2911bf23cb6db64bdf42250d9"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            r1 = 1
            java.lang.String r2 = "LifecycleService"
            java.lang.String r3 = "checkIfAppIsRunningInForeground"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L4f
            com.sankuai.xm.log.c.b(r2, r3, r4)     // Catch: java.lang.Exception -> L4f
            android.app.ActivityManager$RunningAppProcessInfo r2 = new android.app.ActivityManager$RunningAppProcessInfo     // Catch: java.lang.Exception -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L4f
            android.app.ActivityManager.getMyMemoryState(r2)     // Catch: java.lang.Exception -> L4f
            int r3 = r2.importance     // Catch: java.lang.Exception -> L4f
            r4 = 100
            if (r3 == r4) goto L40
            int r2 = r2.importance     // Catch: java.lang.Exception -> L4f
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L3e
            goto L40
        L3e:
            r2 = 0
            goto L41
        L40:
            r2 = 1
        L41:
            if (r2 == 0) goto L4e
            android.app.Application r2 = r11.a()     // Catch: java.lang.Exception -> L4f
            boolean r2 = com.sankuai.xm.base.util.w.d(r2)     // Catch: java.lang.Exception -> L4f
            if (r2 != 0) goto L4e
            return r1
        L4e:
            return r0
        L4f:
            r2 = move-exception
            java.lang.String r3 = "LifecycleService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "checkIfAppIsRunningInForeground::"
            r4.<init>(r5)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.sankuai.xm.log.c.d(r3, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.lifecycle.d.f():boolean");
    }

    public static boolean a(final Context context, final b bVar) {
        while (true) {
            Object[] objArr = {context, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cc294d66939db722c5eaf23f2f3abf5", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cc294d66939db722c5eaf23f2f3abf5")).booleanValue();
            }
            if (context == null || bVar == null || (context instanceof Application)) {
                return false;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (ActivityUtils.a(activity)) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        com.sankuai.xm.threadpool.scheduler.a.b().a(new Runnable() { // from class: com.sankuai.xm.base.lifecycle.d.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0205fcac01c3b382bc719de96b2d194e", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0205fcac01c3b382bc719de96b2d194e");
                                } else {
                                    d.a(context, bVar);
                                }
                            }
                        });
                    } else {
                        ActivityUtils.b(activity).a(bVar);
                    }
                    return true;
                }
                return false;
            } else if (!(context instanceof ContextWrapper)) {
                return false;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
    }

    public static d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f74dc89832f2fbb8f5cb902a50ccfa", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f74dc89832f2fbb8f5cb902a50ccfa");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }
}
