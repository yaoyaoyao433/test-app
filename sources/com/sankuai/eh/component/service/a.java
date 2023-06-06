package com.sankuai.eh.component.service;

import android.content.Context;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.eh.component.service.database.d;
import com.sankuai.eh.component.service.env.b;
import com.sankuai.eh.component.service.spi.IEHInit;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static b b = null;
    public static Context c = null;
    public static boolean d = false;
    public static int e = 0;
    public static boolean f = false;

    public static void a(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ead584c338cb93e6de19e8c0835d3a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ead584c338cb93e6de19e8c0835d3a1c");
        } else if (d) {
        } else {
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_init");
            d = true;
            b = bVar;
            c = context;
            f();
            d.a(context);
            createCustomSpeedMeterTask.recordStep("step_data");
            com.sankuai.eh.component.service.tools.d.a(context);
            com.sankuai.eh.component.service.tools.b.a().b();
            createCustomSpeedMeterTask.recordStep("step_trace");
            h.a(createCustomSpeedMeterTask.recordStep("step_component"));
        }
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94a444fe698dabc637ea0c181860081c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94a444fe698dabc637ea0c181860081c");
        } else if (d) {
        } else {
            c = context.getApplicationContext();
            com.sankuai.eh.component.service.tools.d.a(context);
            com.sankuai.eh.component.service.tools.b.a().b();
            f();
            d.a(context);
        }
    }

    public static void a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d4be08a5c5c6b2c5dbac6f81e934fad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d4be08a5c5c6b2c5dbac6f81e934fad");
        } else if (b != null) {
            b.j().putAll(map);
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a5b7345d9ff51b740ba64ac291b0967", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a5b7345d9ff51b740ba64ac291b0967") : (b == null || b.j().get("path_scheme") == null) ? "url" : b.j().get("path_scheme");
    }

    private static void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e6a73b8c69726c54638aad9ea551276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e6a73b8c69726c54638aad9ea551276");
            return;
        }
        for (IEHInit iEHInit : com.sankuai.meituan.serviceloader.b.a(IEHInit.class, (String) null)) {
            iEHInit.a(c);
        }
    }

    public static Context b() {
        return c;
    }

    public static b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec5f6dc13913e9482ef7f93a270b1b7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec5f6dc13913e9482ef7f93a270b1b7b");
        }
        if (b == null) {
            return new b() { // from class: com.sankuai.eh.component.service.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.eh.component.service.env.b
                public final String a() {
                    return "";
                }

                @Override // com.sankuai.eh.component.service.env.b
                public final String b() {
                    return "";
                }

                @Override // com.sankuai.eh.component.service.env.b
                public final String c() {
                    return "";
                }

                @Override // com.sankuai.eh.component.service.env.b
                public final String d() {
                    return "";
                }

                @Override // com.sankuai.eh.component.service.env.b
                public final String e() {
                    return "";
                }

                @Override // com.sankuai.eh.component.service.env.b
                public final String g() {
                    return "";
                }

                @Override // com.sankuai.eh.component.service.env.b
                public final String f() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "869c16dea8c4d68604109a07d6c14ff7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "869c16dea8c4d68604109a07d6c14ff7");
                    }
                    try {
                        return GetUUID.getInstance().getSyncUUID(a.c, null);
                    } catch (Exception unused) {
                        return "";
                    }
                }
            };
        }
        return b;
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96d7b45a3583b7a2c8ee0ff6cf267ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96d7b45a3583b7a2c8ee0ff6cf267ee2")).booleanValue();
        }
        if (f.b()) {
            return !f && e >= 0;
        }
        return true;
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e26876852de3286571cd88a181910709", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e26876852de3286571cd88a181910709")).booleanValue();
        }
        if (f.b()) {
            return !f && e <= 0;
        }
        return true;
    }
}
