package com.sankuai.waimai.launcher.init.core;

import android.app.Application;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.launcher.config.WaimaiLauncherSP;
import com.sankuai.waimai.launcher.init.e;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect b;
    private static final boolean f = com.sankuai.meituan.takeoutnew.a.j;
    private final List<AbsInit> a;
    protected final List<String> c;
    @NonNull
    private final Executor d;
    private int e;

    public abstract void a(Application application);

    public void b(Application application) {
    }

    public a(@NonNull Executor executor) {
        Object[] objArr = {executor};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb7c76f8b4628113425269ae274f22a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb7c76f8b4628113425269ae274f22a1");
            return;
        }
        this.c = new LinkedList();
        this.a = new LinkedList();
        this.e = -1;
        this.d = executor;
    }

    public final void a(AbsInit absInit) {
        Object[] objArr = {absInit};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7cdc63eaf77dfa94348a63d5089812d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7cdc63eaf77dfa94348a63d5089812d");
        } else if (absInit == null || !b.a(this.e, absInit)) {
        } else {
            synchronized (this.a) {
                this.a.add(absInit);
            }
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e528f829f67bd045909e7e1915be6053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e528f829f67bd045909e7e1915be6053");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c.add(str);
        }
    }

    public final void c(Application application) {
        boolean z = true;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e758e3725922d790bc73a666ae6adb1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e758e3725922d790bc73a666ae6adb1e");
            return;
        }
        long b2 = com.sankuai.waimai.launcher.init.b.b();
        this.e = b.b(application);
        b(application);
        a(application);
        int a = Privacy.createPermissionGuard().a(com.meituan.android.singleton.b.a, "Locate.once", "dj-d87f7795c50352fa");
        int a2 = Privacy.createPermissionGuard().a(com.meituan.android.singleton.b.a, PermissionGuard.PERMISSION_PHONE_READ, "dj-d87f7795c50352fa");
        com.sankuai.waimai.foundation.utils.log.a.b("gxb", "InitManager locateCode:" + a + " phoneCode:" + a2, new Object[0]);
        z = (a <= 0 || a2 <= 0) ? false : false;
        com.sankuai.waimai.launcher.init.b.a("prepare", com.sankuai.waimai.launcher.init.b.a(b2));
        for (AbsInit absInit : this.a) {
            if (b(z, absInit)) {
                if (f) {
                    Trace.beginSection(absInit.tag());
                }
                absInit.performInit(application);
                if (f) {
                    Trace.endSection();
                }
                com.sankuai.waimai.launcher.init.b.a(absInit.tag(), absInit.getInitTime());
            }
        }
        com.sankuai.waimai.launcher.util.aop.b.a(this.d, new RunnableC0987a(z, application));
    }

    public final void d(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e18c32dcef4efbe6930ce5a080db0935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e18c32dcef4efbe6930ce5a080db0935");
            return;
        }
        for (AbsInit absInit : this.a) {
            if (absInit.needPermission()) {
                absInit.performInit(application);
            }
        }
        com.sankuai.waimai.launcher.util.aop.b.a(this.d, new Runnable() { // from class: com.sankuai.waimai.launcher.init.core.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1862b55883f43922efed28a542d715a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1862b55883f43922efed28a542d715a");
                    return;
                }
                for (AbsInit absInit2 : a.this.a) {
                    if (absInit2.needPermission()) {
                        absInit2.performAsyncInit(application);
                    }
                }
            }
        });
    }

    public final void e(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7e7c24ee2c6ce0b187cde3fac06b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7e7c24ee2c6ce0b187cde3fac06b45");
            return;
        }
        for (AbsInit absInit : this.a) {
            if (f) {
                Trace.beginSection(absInit.tag());
            }
            absInit.performIdleInit(application);
            if (f) {
                Trace.endSection();
            }
        }
        com.sankuai.waimai.launcher.util.aop.b.a(this.d, new Runnable() { // from class: com.sankuai.waimai.launcher.init.core.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccc502487435fee2f381de597c3e115a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccc502487435fee2f381de597c3e115a");
                    return;
                }
                for (AbsInit absInit2 : a.this.a) {
                    if (a.f) {
                        Trace.beginSection(absInit2.tag());
                    }
                    absInit2.performAsyncIdleInit(application);
                    if (a.f) {
                        Trace.endSection();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(boolean z, AbsInit absInit) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), absInit};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7976ea4190b52d0df3719f33ff3821e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7976ea4190b52d0df3719f33ff3821e")).booleanValue() : z || !absInit.needPermission();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.init.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC0987a implements Runnable {
        public static ChangeQuickRedirect a;
        private final boolean c;
        private final Application d;

        public RunnableC0987a(boolean z, Application application) {
            Object[] objArr = {a.this, Byte.valueOf(z ? (byte) 1 : (byte) 0), application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507feedf908d5f449e1e9b56f4cba9e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507feedf908d5f449e1e9b56f4cba9e8");
                return;
            }
            this.c = z;
            this.d = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            char c = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d7e4d74b216985dcce3f652cd1dbe2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d7e4d74b216985dcce3f652cd1dbe2");
                return;
            }
            int h = WaimaiLauncherSP.h();
            if (h > 0 && (a.this instanceof com.sankuai.waimai.launcher.init.c)) {
                try {
                    Thread.sleep(h);
                } catch (InterruptedException unused) {
                }
            }
            try {
                for (AbsInit absInit : a.this.a) {
                    if (a.b(this.c, absInit)) {
                        if (a.f) {
                            Trace.beginSection(absInit.tag());
                        }
                        absInit.performAsyncInit(this.d);
                        if (a.f) {
                            Trace.endSection();
                        }
                        String tag = absInit.tag();
                        long asyncInitTime = absInit.getAsyncInitTime();
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = tag;
                        objArr2[1] = new Long(asyncInitTime);
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.init.b.a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "822ba3a729d42f553378facc3a1813a6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "822ba3a729d42f553378facc3a1813a6");
                        } else if (!TextUtils.isEmpty(tag)) {
                            com.sankuai.waimai.launcher.init.b a2 = com.sankuai.waimai.launcher.init.b.a();
                            Object[] objArr3 = {tag, new Long(asyncInitTime)};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.launcher.init.b.a;
                            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "5c6dc8a8dd0ea2da9b7c10b643f7a679", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "5c6dc8a8dd0ea2da9b7c10b643f7a679");
                            } else if (asyncInitTime > 0) {
                                a2.c.put(tag, Long.valueOf(asyncInitTime));
                            }
                        }
                    }
                    c = 0;
                }
                if (a.this instanceof e) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.launcher.init.b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9d0efb6da67da448e93d19d98268b7d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9d0efb6da67da448e93d19d98268b7d8");
                        return;
                    }
                    com.sankuai.waimai.launcher.init.b a3 = com.sankuai.waimai.launcher.init.b.a();
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.launcher.init.b.a;
                    if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "298c55e20f7a1ba01605fc6bfc5c9eb9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "298c55e20f7a1ba01605fc6bfc5c9eb9");
                    } else {
                        a3.a("WaimaiStartupAsyncInit", a3.c);
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
                if (com.sankuai.meituan.takeoutnew.a.a || com.sankuai.meituan.takeoutnew.a.f) {
                    throw e;
                }
            }
        }
    }
}
