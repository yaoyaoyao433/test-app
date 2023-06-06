package com.sankuai.waimai.store.util.monitor.report;

import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.ac;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static final Executor b;
    private static final ExecutorService c;

    public static /* synthetic */ void a(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b67f023312b8b2dc57e16b34f8726df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b67f023312b8b2dc57e16b34f8726df");
        } else if (c != null) {
            try {
                c.execute(new Runnable() { // from class: com.sankuai.waimai.store.util.monitor.report.d.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91161fa4547a9f2fce504413a64481b7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91161fa4547a9f2fce504413a64481b7");
                        } else {
                            h.a(jSONObject);
                        }
                    }
                });
            } catch (Throwable th) {
                com.sankuai.shangou.stone.util.log.a.a(th);
            }
        }
    }

    static {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ac.a;
        b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d40d0d3f68ebf32d643a5543a1fa47f5", RobustBitConfig.DEFAULT_VALUE) ? (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d40d0d3f68ebf32d643a5543a1fa47f5") : com.sankuai.android.jarvis.c.b();
        Object[] objArr2 = {"Code-LogUploadPool"};
        ChangeQuickRedirect changeQuickRedirect2 = ac.a;
        c = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6783ce106f17d0bfddc3fd498e0426b0", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6783ce106f17d0bfddc3fd498e0426b0") : com.sankuai.android.jarvis.c.a("Code-LogUploadPool");
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc0646a56aaba8f9c0b35064fa17552c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc0646a56aaba8f9c0b35064fa17552c");
        } else {
            a(aVar, "error");
        }
    }

    public static void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e491eadec40f7652a57896586851522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e491eadec40f7652a57896586851522");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c757dce5633783649d9e07f88df9fbec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c757dce5633783649d9e07f88df9fbec");
        } else {
            a(aVar, "info");
        }
    }

    public static void c(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e6a6591c1db463cd83adcf4e343a3f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e6a6591c1db463cd83adcf4e343a3f6");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.store.util.monitor.report.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "550dc92872cf70a290d1a6f91e0a4752", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "550dc92872cf70a290d1a6f91e0a4752");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(a.this.c)) {
                            str = a.this.c + "::" + a.this.b;
                        } else {
                            str = a.this.b;
                        }
                        jSONObject.put("category", str);
                        jSONObject.put("time", a.this.g);
                        jSONObject.put("level", "error");
                        jSONObject.put(SnifferDBHelper.COLUMN_LOG, a.this.f);
                        if (com.sankuai.waimai.store.config.d.h().a("logConfig/codelog", true)) {
                            d.a(jSONObject);
                            d.a(a.this);
                            return;
                        }
                        com.dianping.codelog.b.b(d.class, a.this.b, a.this.f);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static void a(final a aVar, final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eef6d2dfd3b1323d5a9854a4d3d1caf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eef6d2dfd3b1323d5a9854a4d3d1caf5");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.store.util.monitor.report.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3042c7c492b0d39773d588a0e6d9bfe4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3042c7c492b0d39773d588a0e6d9bfe4");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("level", str);
                        jSONObject.put(ShieldMonitorKey.TAG_BUSINESS, aVar.c);
                        jSONObject.put("category", aVar.b);
                        jSONObject.put("time", System.currentTimeMillis());
                        if (!TextUtils.isEmpty(aVar.f)) {
                            jSONObject.put(SnifferDBHelper.COLUMN_LOG, aVar.f);
                        } else {
                            jSONObject.put(SnifferDBHelper.COLUMN_LOG, aVar.b);
                        }
                        if (!TextUtils.isEmpty(aVar.d)) {
                            jSONObject.put("type", aVar.d);
                        }
                        if (!TextUtils.isEmpty(aVar.e)) {
                            jSONObject.put("description", aVar.e);
                        }
                        try {
                            str2 = jSONObject.toString();
                        } catch (OutOfMemoryError unused) {
                            str2 = "[oom]";
                        }
                        com.dianping.networklog.c.a(str2, 3);
                    } catch (Throwable unused2) {
                    }
                }
            });
        }
    }
}
