package com.meituan.android.cipstorage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a = null;
    static volatile j b = null;
    static volatile boolean c = false;
    static final Runnable d = new Runnable() { // from class: com.meituan.android.cipstorage.j.2
        public static ChangeQuickRedirect a;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f408f56af59d972eada1c6eeb7df57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f408f56af59d972eada1c6eeb7df57");
                return;
            }
            if (v.b) {
                new StringBuilder("judge if idle: ").append(j.c);
            }
            if (!j.c || j.b == null) {
                return;
            }
            j.b.d();
        }
    };
    private static b f;
    private final a e;
    private final ArrayList<c> g;

    public static /* synthetic */ b a(b bVar) {
        f = null;
        return null;
    }

    public static /* synthetic */ void a(j jVar) {
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "cf2292bdb7b145375d27a0ecdbff601a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "cf2292bdb7b145375d27a0ecdbff601a");
            return;
        }
        af afVar = v.f;
        k a2 = k.a();
        Iterator<c> it = jVar.g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            String a3 = next.a();
            if (!next.a(afVar)) {
                PrintStream printStream = System.out;
                printStream.println("::cips:: disable idle task: " + a3);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - a2.a(a3)) >= 86400000) {
                    next.b(afVar);
                    Object[] objArr2 = new Object[2];
                    objArr2[c2] = a3;
                    objArr2[1] = new Long(currentTimeMillis);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "6584d6b1c58d7f3a556bd7b28c1c63e1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "6584d6b1c58d7f3a556bd7b28c1c63e1");
                    } else {
                        HashMap hashMap = new HashMap(2);
                        hashMap.put("category", a3);
                        hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        v.a("cips.timing", hashMap);
                    }
                    a2.a(a3, currentTimeMillis);
                    c2 = 0;
                }
            }
        }
    }

    public static synchronized void a() {
        synchronized (j.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92f185e75ea6e00762ee1e93b46e0a35", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92f185e75ea6e00762ee1e93b46e0a35");
            } else if (b != null) {
            } else {
                j jVar = new j();
                b = jVar;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "dc810aef20b4cdf8bdcfa085ff1944bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "dc810aef20b4cdf8bdcfa085ff1944bd");
                    return;
                }
                boolean z = v.b;
                Context context = v.c;
                if (context instanceof Application) {
                    String a2 = y.a();
                    String packageName = v.c.getPackageName();
                    if (a2.equalsIgnoreCase(packageName) && !packageName.equals("com.sankuai.meituan")) {
                        ((Application) context).registerActivityLifecycleCallbacks(jVar.e);
                    }
                }
                jVar.g.add(new p());
                jVar.g.add(new t());
                jVar.g.add(new o());
                jVar.g.add(new e());
                jVar.g.add(new d());
                jVar.g.add(new g());
            }
        }
    }

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dadf3dbe4ee377228747ed11194f2299", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dadf3dbe4ee377228747ed11194f2299");
            return;
        }
        this.e = new a();
        this.g = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcaeed1567e01898b485b11845999d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcaeed1567e01898b485b11845999d37");
        } else if (f != null) {
        } else {
            af afVar = v.f;
            System.out.println("::cips:: executing idle task");
            f = new b();
            Iterator<c> it = this.g.iterator();
            while (it.hasNext()) {
                c next = it.next();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c.b;
                if (PatchProxy.isSupport(objArr2, next, changeQuickRedirect2, false, "9b96dc50dc3ada08b1ae05588e8e04ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, next, changeQuickRedirect2, false, "9b96dc50dc3ada08b1ae05588e8e04ac");
                } else {
                    next.c = f;
                }
            }
            v.e.b(new Runnable() { // from class: com.meituan.android.cipstorage.j.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:82:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
                /* JADX WARN: Type inference failed for: r1v2 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 195
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cipstorage.j.AnonymousClass1.run():void");
                }
            });
        }
    }

    synchronized void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4036e7be2d8b4850e1583aa4c79c4cee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4036e7be2d8b4850e1583aa4c79c4cee");
            return;
        }
        boolean z = v.b;
        if (f == null) {
            return;
        }
        f.cancel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public final class a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;
        private int c;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974a0016533c30eb18dd11b7b302f1f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974a0016533c30eb18dd11b7b302f1f6");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        private a() {
            Object[] objArr = {j.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce4df4d8b2603c26648ebc7da75ba937", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce4df4d8b2603c26648ebc7da75ba937");
            } else {
                this.c = 0;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1a0cefb88ff6230a851091cb2b82ef7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1a0cefb88ff6230a851091cb2b82ef7");
                return;
            }
            if (this.c <= 0) {
                this.c = 0;
            }
            j jVar = j.this;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "22b21cf96277de77d2b58c1c2c62d841", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "22b21cf96277de77d2b58c1c2c62d841");
            } else if (j.c) {
                j.c = false;
                v.e.a(j.d);
                if (j.b != null) {
                    j.b.cancel();
                }
            }
            this.c++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            long j;
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f8898ca0d14c7bae3481d6de0f0ad51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f8898ca0d14c7bae3481d6de0f0ad51");
                return;
            }
            this.c--;
            if (this.c <= 0) {
                this.c = 0;
                j jVar = j.this;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = j.a;
                if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "af49e265cc6fbe0f1047249f2097704f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "af49e265cc6fbe0f1047249f2097704f");
                    return;
                }
                j.c = true;
                v.e.a(j.d);
                ad adVar = v.e;
                Runnable runnable = j.d;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = j.a;
                if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "f16db4b19194caf6aa25d98a2e002556", RobustBitConfig.DEFAULT_VALUE)) {
                    j = ((Long) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "f16db4b19194caf6aa25d98a2e002556")).longValue();
                } else {
                    af afVar = v.f;
                    j = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
                }
                adVar.a(runnable, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private boolean b;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd7ceecedc37609845ddfb84f53a8c5b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd7ceecedc37609845ddfb84f53a8c5b");
            } else {
                this.b = false;
            }
        }

        public final synchronized void cancel() {
            if (!this.b) {
                this.b = true;
            }
        }

        public final synchronized void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a7dcb155549c063a3c71f6c5f13d99a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a7dcb155549c063a3c71f6c5f13d99a");
            } else if (this.b) {
                throw new com.meituan.android.cipstorage.c((short) 4);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public static ChangeQuickRedirect b;
        b c;

        public abstract String a();

        public abstract boolean a(af afVar);

        public abstract void b(af afVar);

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b65fbe13c2e3b510b6830570832154f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b65fbe13c2e3b510b6830570832154f");
            } else if (this.c != null) {
                this.c.a();
            }
        }
    }
}
