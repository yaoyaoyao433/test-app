package com.sankuai.waimai.launcher.init;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.os.Trace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.foundation.utils.v;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    public static boolean b = PageSP.b();
    private static d c = null;
    private static boolean d = false;
    private boolean e;
    private boolean f;
    private final a g;
    private final c h;
    private final e i;

    public static void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a991326786548ed05ed9a9be0f132b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a991326786548ed05ed9a9be0f132b39");
        } else if (d) {
            a.AbstractC1040a c2 = new com.sankuai.waimai.launcher.log.a().a("app_init_error").b("re_initialization").c("重复初始化");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.log.b.a;
            i.d(c2.d(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "37b3731ef0abe3fe68090e888be73fcf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "37b3731ef0abe3fe68090e888be73fcf") : com.sankuai.waimai.launcher.log.b.a(Thread.currentThread())).a(true).b());
        } else {
            l.a("RootInitManager.initOnApplicationCreate");
            if (c == null) {
                c = new d();
            }
            d dVar = c;
            Object[] objArr3 = {application};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "5539c4d24a62aac07b3d64134a4378e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "5539c4d24a62aac07b3d64134a4378e6");
            } else {
                if (com.sankuai.meituan.takeoutnew.a.j) {
                    Trace.beginSection("MainlyInit");
                }
                dVar.h.c(application);
                if (com.sankuai.meituan.takeoutnew.a.j) {
                    Trace.endSection();
                }
                if (com.sankuai.meituan.takeoutnew.a.j) {
                    Trace.beginSection("SecondaryInit");
                }
                dVar.i.c(application);
                a aVar = dVar.g;
                Object[] objArr4 = {application};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.launcher.init.core.c.b;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "b4d0743bb2402429eeecb08cf3847eee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "b4d0743bb2402429eeecb08cf3847eee");
                } else {
                    aVar.f = com.sankuai.waimai.launcher.init.core.b.b(application);
                    aVar.a(application);
                    aVar.b(application);
                    application.registerActivityLifecycleCallbacks(aVar);
                    for (Lifecycle lifecycle : com.sankuai.waimai.launcher.init.core.c.d.values()) {
                        if (lifecycle instanceof Application.ActivityLifecycleCallbacks) {
                            com.sankuai.waimai.launcher.init.core.c.e.addLast((Application.ActivityLifecycleCallbacks) lifecycle);
                        }
                        if (lifecycle instanceof ComponentCallbacks) {
                            application.registerComponentCallbacks((ComponentCallbacks) lifecycle);
                        }
                        if (lifecycle instanceof com.sankuai.waimai.foundation.core.lifecycle.a) {
                            com.sankuai.waimai.foundation.core.lifecycle.b.a().a((com.sankuai.waimai.foundation.core.lifecycle.a) lifecycle);
                        }
                        if (lifecycle instanceof c.a) {
                            com.sankuai.waimai.foundation.core.lifecycle.c.a((c.a) lifecycle);
                        }
                    }
                }
                if (com.sankuai.meituan.takeoutnew.a.j) {
                    Trace.endSection();
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1fd6327ff731160037232bbeb6de6bcf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1fd6327ff731160037232bbeb6de6bcf");
                } else {
                    b a2 = b.a();
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = b.a;
                    if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "bc45f8cd8995160b4df8ce50cc8a56a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "bc45f8cd8995160b4df8ce50cc8a56a2");
                    } else {
                        a2.a("WaimaiStartupInit", a2.b);
                    }
                }
            }
            if (!com.sankuai.waimai.launcher.init.core.b.a(application)) {
                b(application);
                c(application);
            }
            d = true;
        }
    }

    public static void b(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "827fb45b83742538e60c4560254cbc05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "827fb45b83742538e60c4560254cbc05");
            return;
        }
        l.a("RootInitManager.initOnPermissionGranted");
        if (c == null || c.e) {
            return;
        }
        c.d(application);
        c.e = true;
        c.b();
    }

    public static void c(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ff8f07f76e7de7f26db8feef00e4817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ff8f07f76e7de7f26db8feef00e4817");
            return;
        }
        l.a("RootInitManager.checkIdleInit");
        if (c == null || c.f) {
            return;
        }
        c.e(application);
        c.f = true;
        c.b();
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f50e1da7b0bcefb2337cd5b123a79027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f50e1da7b0bcefb2337cd5b123a79027");
            return;
        }
        this.e = false;
        this.f = false;
        this.g = new a();
        v vVar = new v();
        this.h = new c(vVar);
        this.i = new e(vVar);
        AbsInit.setEnableLog(true);
    }

    private void d(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "686ede4a49a3d7f605f3e4fc7294de26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "686ede4a49a3d7f605f3e4fc7294de26");
            return;
        }
        this.h.d(application);
        this.i.d(application);
    }

    private void e(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb3dab2d4afc882693aacfc21d38d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb3dab2d4afc882693aacfc21d38d92");
            return;
        }
        this.h.e(application);
        this.i.e(application);
    }

    private void b() {
        if (this.e && this.f) {
            c = null;
        }
    }

    public static boolean a() {
        return c == null || c.e;
    }
}
