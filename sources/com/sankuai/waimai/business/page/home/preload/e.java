package com.sankuai.waimai.business.page.home.preload;

import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.preload.f;
import com.sankuai.waimai.business.page.home.preload.task.g;
import com.sankuai.waimai.business.page.home.preload.task.h;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static boolean b = true;
    private static volatile boolean c = false;
    private static f d;
    private static f e;
    private static volatile f f;
    private static a g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d77cbe6493bf8d2cca662fd451992a81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d77cbe6493bf8d2cca662fd451992a81");
            return;
        }
        c = true;
        if (b) {
            f a2 = a(null, "ColdBoot").a();
            d = a2;
            a2.b();
        }
    }

    public static void a(MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f053c66b18d4cb1b3278714ad96b3c5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f053c66b18d4cb1b3278714ad96b3c5e");
            return;
        }
        c = true;
        if (b) {
            b = false;
            return;
        }
        b();
        PreloadDataModel.get().setMainLoaded(true);
        PreloadDataModel.get().release();
        f a2 = a(metricsSpeedMeterTask, "HotBot").a();
        e = a2;
        a2.b();
    }

    private static f.b a(MetricsSpeedMeterTask metricsSpeedMeterTask, String str) {
        Object[] objArr = {metricsSpeedMeterTask, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30e0a3f22bfa6dfb9dbcad85fd07827f", RobustBitConfig.DEFAULT_VALUE)) {
            return (f.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30e0a3f22bfa6dfb9dbcad85fd07827f");
        }
        com.sankuai.waimai.business.page.home.preload.task.e eVar = new com.sankuai.waimai.business.page.home.preload.task.e();
        if (metricsSpeedMeterTask != null) {
            eVar.c = metricsSpeedMeterTask;
        }
        com.sankuai.waimai.business.page.home.preload.task.f fVar = new com.sankuai.waimai.business.page.home.preload.task.f();
        g gVar = new g();
        if (metricsSpeedMeterTask != null) {
            gVar.c = metricsSpeedMeterTask;
        }
        com.sankuai.waimai.business.page.home.preload.task.a aVar = new com.sankuai.waimai.business.page.home.preload.task.a();
        h hVar = new h();
        com.sankuai.waimai.business.page.home.preload.task.c cVar = new com.sankuai.waimai.business.page.home.preload.task.c();
        com.sankuai.waimai.business.page.home.preload.task.b bVar = new com.sankuai.waimai.business.page.home.preload.task.b();
        f.b a2 = new f.b().a(str);
        if (com.sankuai.waimai.platform.model.c.a().c()) {
            com.sankuai.waimai.business.page.home.preload.task.d dVar = new com.sankuai.waimai.business.page.home.preload.task.d();
            a2.a(dVar);
            a2.a(eVar).b(dVar);
        } else {
            a2.a(eVar);
        }
        a2.a(fVar).a(gVar).b(eVar).a(aVar).b(eVar).a(hVar).b(eVar).a(cVar).b(eVar).a(bVar).b(eVar);
        return a2;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f427e00ceb02a56e814704bac61e96a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f427e00ceb02a56e814704bac61e96a3");
            return;
        }
        if (d != null) {
            d.cancel();
            d = null;
        }
        if (e != null) {
            e.cancel();
            e = null;
        }
        if (f != null) {
            f.cancel();
            f = null;
        }
        PreloadDataModel.get().setMainLoaded(true);
    }

    public static void a(String str, String str2, int i, Map<String, Object> map) {
        Object[] objArr = {str, str2, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed4de9570ba6b641f289f629abf4bfaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed4de9570ba6b641f289f629abf4bfaf");
        } else if (g == null) {
        }
    }

    public static void b(String str, String str2, int i, Map<String, Object> map) {
        Object[] objArr = {str, str2, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52745498c7f6f3a80473ff01c71a56e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52745498c7f6f3a80473ff01c71a56e4");
        } else if (g == null) {
        }
    }
}
