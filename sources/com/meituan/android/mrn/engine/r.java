package com.meituan.android.mrn.engine;

import android.app.Application;
import android.content.Context;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.UiThreadUtil;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.raw.a;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static volatile boolean c = false;
    private static volatile r d;
    private Context e;
    private com.meituan.android.mrn.config.y f;
    private a g;
    private volatile boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        MAIN,
        BOTH;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c320fc3c226b3032c278046a2d0b3d5b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c320fc3c226b3032c278046a2d0b3d5b");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d09d8eb3b493e2a09d64a4ac5d12d8d3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d09d8eb3b493e2a09d64a4ac5d12d8d3") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4a61db6e765b7eaebc3637b26b400a3", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4a61db6e765b7eaebc3637b26b400a3") : (a[]) values().clone();
        }
    }

    private r(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a1756ee6de89ad4f2e0a143d0a192f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a1756ee6de89ad4f2e0a143d0a192f1");
            return;
        }
        this.h = false;
        this.e = context.getApplicationContext();
        this.f = com.meituan.android.mrn.config.y.a();
        this.g = a.MAIN;
        if (context instanceof Application) {
            a((Application) context);
        } else {
            com.facebook.common.logging.a.b("[MRNLauncher@MRNLauncher]", "context is not application");
        }
    }

    public static synchronized r a(Context context) {
        synchronized (r.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3490ccea8c3b524bf877800f5c612611", RobustBitConfig.DEFAULT_VALUE)) {
                return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3490ccea8c3b524bf877800f5c612611");
            } else if (context == null) {
                throw new IllegalArgumentException("mContext is null");
            } else {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.common.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3446d0560bdbf3c523a12c8aa0c98c89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3446d0560bdbf3c523a12c8aa0c98c89");
                } else {
                    com.meituan.android.mrn.common.a.b = new WeakReference<>(context != null ? context.getApplicationContext() : context);
                }
                if (d == null) {
                    d = new r(context);
                }
                return d;
            }
        }
    }

    public final r a(com.meituan.android.mrn.config.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95035fff2d99c912ef4e9d367d0c8a7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95035fff2d99c912ef4e9d367d0c8a7a");
        }
        this.f.b = eVar;
        return this;
    }

    public final r a(a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea0f58e76e01b657c443e3aca991c53", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea0f58e76e01b657c443e3aca991c53");
        }
        com.facebook.infer.annotation.a.a(UiThreadUtil.isOnUiThread());
        if (interfaceC0637a == null) {
            throw new IllegalArgumentException("callFactory is null");
        }
        this.f.e = interfaceC0637a;
        return this;
    }

    public final r a(com.dianping.dataservice.mapi.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc67f6fc38dfaceb1f06b420132e462a", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc67f6fc38dfaceb1f06b420132e462a");
        }
        this.f.h = gVar;
        return this;
    }

    public final r a(com.meituan.android.mrn.config.city.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c82c7edbdeb351839fc4ff0bb26f6616", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c82c7edbdeb351839fc4ff0bb26f6616");
        }
        this.f.g = aVar;
        return this;
    }

    public final synchronized boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbe896d4873fb44a9fb209c062b7d9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbe896d4873fb44a9fb209c062b7d9a")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.meituan.android.mrn.config.v.a();
        com.meituan.android.mrn.config.o.a();
        if (this.g == a.MAIN && !ProcessUtils.isMainProcess(this.e)) {
            com.meituan.android.mrn.utils.p.a("[MRNLauncher@launch]", "不在主进程，退出");
            return false;
        } else if (b) {
            com.meituan.android.mrn.utils.p.a("[MRNLauncher@launch]", "其他线程初始化完成了，直接退出");
            return true;
        } else {
            com.meituan.android.mrn.utils.i.c("mrn", "3.1201.206");
            com.meituan.android.mrn.utils.i.c();
            com.meituan.android.mrn.utils.p.a("[MRNLauncher@launch]", PackageLoadReporter.Source.LAUNCH);
            com.meituan.android.mrn.container.f.e();
            com.facebook.react.config.a.h = true;
            com.meituan.android.soloader.k.a(this.e, false);
            ReactBridge.staticInit();
            com.facebook.common.logging.a.b("[ReactBridge@staticInit]", String.format("staticInit load so cost %d ms", Long.valueOf(ReactBridge.getLoadEndTime() - ReactBridge.getLoadEndTime())));
            com.meituan.android.mrn.utils.p.a("[MRNLauncher@launch]", "ReactBridge.staticInit end");
            com.meituan.android.mrn.config.x.a();
            com.meituan.android.mrn.monitor.b.a(this.e);
            com.meituan.android.mrn.config.p.a();
            n a2 = n.a(this.e);
            if (o.a().b().size() == 0) {
                com.meituan.android.mrn.utils.p.a("[MRNLauncher@launch]", "MRNLOG mrn init new");
                a2.c();
            } else {
                com.meituan.android.mrn.utils.p.a("[MRNLauncher@launch]", "MRNLOG mrn init already");
            }
            com.meituan.android.mrn.config.z.a();
            com.meituan.android.mrn.config.z.a();
            com.meituan.android.mrn.debug.interfaces.b.a();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            com.meituan.android.mrn.utils.p.a("[MRNLauncher@launch]", "ServiceLoader加载IMRNConfigProvider信息完毕，launch 耗时: " + currentTimeMillis2 + " ,soInit 耗时: " + (ReactBridge.getLoadEndTime() - ReactBridge.getLoadStartTime()));
            b = true;
            return true;
        }
    }

    public final synchronized void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d81ec2a2556d69efdecd2a5bad98f21f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d81ec2a2556d69efdecd2a5bad98f21f");
        } else if (application == null) {
        } else {
            if (!this.h) {
                com.meituan.android.mrn.config.s.b.a(application);
                com.meituan.android.mrn.monitor.f a2 = com.meituan.android.mrn.monitor.f.a();
                Object[] objArr2 = {application};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.monitor.f.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "3b7cd90ebe3c340ee59984b17ca07265", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "3b7cd90ebe3c340ee59984b17ca07265");
                } else if (application != null) {
                    application.registerActivityLifecycleCallbacks(a2);
                }
                com.meituan.android.mrn.router.c.a(application);
                this.h = true;
            }
        }
    }

    public static boolean b() {
        return b;
    }
}
