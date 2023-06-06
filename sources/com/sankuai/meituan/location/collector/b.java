package com.sankuai.meituan.location.collector;

import android.content.Context;
import android.os.Handler;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.provider.CollectorDataBuilder;
import com.sankuai.meituan.location.collector.provider.j;
import com.sankuai.meituan.location.collector.provider.m;
import com.sankuai.meituan.location.collector.provider.n;
import com.sankuai.meituan.location.collector.utils.e;
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static Context b = null;
    private static c c = null;
    private static Handler d = null;
    private static volatile boolean e = false;
    private static e f;

    public static e a() {
        return f;
    }

    public static boolean a(Object obj) {
        String str;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e05e9e2d4fa1fe3c8708aeeccaa0f10b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e05e9e2d4fa1fe3c8708aeeccaa0f10b")).booleanValue();
        }
        LogUtils.a("collector start setRetrofitRequester");
        if (e) {
            str = "collector setRetrofitRequester isStarted";
        } else if (!e.a(obj)) {
            LogUtils.a("collector set retrofit failed");
            return false;
        } else {
            f = new e(obj);
            str = "collector set retrofit ok";
        }
        LogUtils.a(str);
        return true;
    }

    public static Handler b() {
        return d;
    }

    public static Context c() {
        return b;
    }

    public static synchronized boolean a(Context context) {
        synchronized (b.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef15a89219926fa1f578587187086380", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef15a89219926fa1f578587187086380")).booleanValue();
            } else if (e) {
                return true;
            } else {
                LogUtils.a("LocationCollector startReport v1 " + ((String) null) + StringUtil.SPACE + CollectorDataBuilder.collectver);
                if (b == null) {
                    b = context.getApplicationContext();
                }
                if (d == null) {
                    d = new Handler();
                }
                com.sankuai.meituan.location.collector.io.a.a(context, d, new com.sankuai.meituan.location.collector.io.b());
                if (c == null) {
                    c = new c();
                }
                c cVar = c;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "137c3e6552cae8199632f24a05443228", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "137c3e6552cae8199632f24a05443228");
                } else {
                    LogUtils.a("LocationCollectorMananger start");
                    com.sankuai.meituan.location.collector.reporter.c a2 = com.sankuai.meituan.location.collector.reporter.c.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.location.collector.reporter.c.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f3ebf0c3ff525c278bae23c090e809db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f3ebf0c3ff525c278bae23c090e809db");
                    } else {
                        a2.c();
                        a2.b = System.currentTimeMillis();
                    }
                    if (cVar.e == null) {
                        cVar.e = new n();
                    }
                    if (cVar.f == null) {
                        cVar.f = new m(b);
                        cVar.e.a(cVar.f);
                    }
                    if (cVar.d == null) {
                        cVar.d = new j(cVar.f);
                    }
                    if (cVar.b == null) {
                        a a3 = a.a();
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        cVar.b = PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "8f272945069c469b0aaf67531b65fa23", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "8f272945069c469b0aaf67531b65fa23")).booleanValue() : f.b().getBoolean("is_open_new_collector", true) ? new com.sankuai.meituan.location.collector.locator.c(cVar.g) : new com.sankuai.meituan.location.collector.locator.e(cVar.g);
                        LogUtils.a("LocationCollectorMananger new passiveGpsLocator");
                    }
                    if (cVar.b != null && cVar.b.d()) {
                        LogUtils.a("passiveGpsLocator is not null");
                        cVar.b.a(cVar.d);
                        cVar.b.b();
                    }
                    if (cVar.h == null) {
                        cVar.h = new com.sankuai.meituan.location.collector.reporter.b();
                        com.sankuai.meituan.location.collector.utils.a.a(b, "com.meituan.android.common.locate.reporter", cVar.h);
                    }
                }
                e = true;
                return true;
            }
        }
    }

    public static synchronized void d() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "796689f764075bf3136b2085ce7184c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "796689f764075bf3136b2085ce7184c1");
                return;
            }
            LogUtils.a("in LocationCollector stopCollector");
            if (c != null) {
                c cVar = c;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "34220dc8689b0356c0dd2b32cd6da457", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "34220dc8689b0356c0dd2b32cd6da457");
                } else {
                    LogUtils.a("LocationCollectorMananger stop");
                    com.sankuai.meituan.location.collector.reporter.c a2 = com.sankuai.meituan.location.collector.reporter.c.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.location.collector.reporter.c.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "89835300cdbeee6f74dc807e0ede1489", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "89835300cdbeee6f74dc807e0ede1489");
                    } else {
                        a2.c = System.currentTimeMillis();
                        a2.b();
                        a2.c();
                    }
                    if (cVar.b != null && cVar.b.d()) {
                        cVar.b.c();
                    }
                    cVar.b = null;
                    if (cVar.c != null && cVar.c.d()) {
                        cVar.c.c();
                    }
                    cVar.c = null;
                    cVar.d = null;
                    if (cVar.f != null) {
                        m mVar = cVar.f;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = m.a;
                        if (PatchProxy.isSupport(objArr4, mVar, changeQuickRedirect4, false, "3d48cc92b942bc602dead64db6069adb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, mVar, changeQuickRedirect4, false, "3d48cc92b942bc602dead64db6069adb");
                        } else {
                            LogUtils.a("CollectorWifiRadioCenter in stop");
                        }
                    }
                    if (cVar.e != null) {
                        cVar.e.b();
                    }
                    if (cVar.h != null) {
                        com.sankuai.meituan.location.collector.utils.a.a(b, cVar.h);
                    }
                }
            }
            c = null;
            b = null;
            e = false;
        }
    }
}
