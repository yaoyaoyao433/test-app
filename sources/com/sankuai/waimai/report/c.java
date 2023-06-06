package com.sankuai.waimai.report;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.monitor.h;
import com.dianping.monitor.impl.m;
import com.google.gson.JsonObject;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Collections;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final String b = h.b(com.meituan.android.singleton.b.a);
    private static final String c = h.b();
    private static Executor d = com.sankuai.android.jarvis.c.b();

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3de91ba405c02c4595ee8ae285ccf51", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3de91ba405c02c4595ee8ae285ccf51");
        }
        m mVar = new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c());
        mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, b).a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_SYS_VERSION, c).a("platform", "Android").a(NetLogConstants.Tags.NETWORK_TYPE, com.meituan.android.mrn.config.c.a().b());
        return mVar;
    }

    public static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95e62e765893196efbd66aaf97eeeaac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95e62e765893196efbd66aaf97eeeaac");
            return;
        }
        Object[] objArr2 = {str, Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7a28c65cde58b456267bce72adaad39b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7a28c65cde58b456267bce72adaad39b");
        } else if (d == null) {
            Log.e("ADMetric-Reporter", "executor is null!");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(d, new Runnable() { // from class: com.sankuai.waimai.report.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "562d88ab5a97e12d56f78398f245a7ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "562d88ab5a97e12d56f78398f245a7ec");
                        return;
                    }
                    m a2 = c.a();
                    a2.a(str, Collections.singletonList(Float.valueOf(r2)));
                    a2.a();
                }
            });
        }
    }

    public static void a(final String str, final String str2, final String str3, final String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6208c562032fba4c2f524291e01b7a47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6208c562032fba4c2f524291e01b7a47");
        } else if (d == null) {
            Log.e("ADMetric-Reporter", "executor is null!");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(d, new Runnable() { // from class: com.sankuai.waimai.report.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51c2a0b3e333e67d5e1b1ccdee025708", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51c2a0b3e333e67d5e1b1ccdee025708");
                        return;
                    }
                    String str5 = null;
                    try {
                        if (!TextUtils.isEmpty(str4)) {
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("extra_info", str4);
                            str5 = jsonObject.toString();
                        }
                        Sniffer.smell(str, str2, str3, str2, str5, 1L, null);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
