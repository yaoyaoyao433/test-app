package com.sankuai.waimai.platform.capacity.log;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static final Executor b = new v();

    public static /* synthetic */ Map a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac4262078ea574a4e2a19b3610baf514", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac4262078ea574a4e2a19b3610baf514");
        }
        HashMap hashMap = new HashMap();
        com.sankuai.waimai.foundation.location.v2.g a2 = com.sankuai.waimai.foundation.location.v2.g.a();
        WmAddress k = a2.k();
        hashMap.put("poi_address", k == null ? "" : k.getAddress());
        City n = com.sankuai.waimai.foundation.location.v2.g.a().n();
        hashMap.put("poi_city", n == null ? "" : n.getCityName());
        WMLocation p = a2.p();
        hashMap.put("poi_latitude", p == null ? "" : String.valueOf(p.getLatitude()));
        hashMap.put("poi_longitude", p == null ? "" : String.valueOf(p.getLongitude()));
        City m = a2.m();
        hashMap.put("real_city", m == null ? "" : m.getCityName());
        return hashMap;
    }

    public static /* synthetic */ String e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f27ede503698f1308b5b7fe1a282c92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f27ede503698f1308b5b7fe1a282c92");
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(aVar.f)) {
            sb.append(aVar.f);
            sb.append(";");
        }
        if (!TextUtils.isEmpty(aVar.d)) {
            sb.append("type=");
            sb.append(aVar.d);
            sb.append(";");
        }
        if (!TextUtils.isEmpty(aVar.e)) {
            sb.append("description=");
            sb.append(aVar.f);
            sb.append(";");
        }
        return sb.toString();
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecbac464edfaf49f545e7c33977e2e1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecbac464edfaf49f545e7c33977e2e1a");
        } else {
            a(aVar, "error");
        }
    }

    public static void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ea52979f5fe6fa153632d84c20785da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ea52979f5fe6fa153632d84c20785da");
        } else {
            a(aVar, "info");
        }
    }

    private static void a(final a aVar, final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "788598e85b1e4c5d717f0a3850723ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "788598e85b1e4c5d717f0a3850723ecb");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.platform.capacity.log.i.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1f186cfd88b60e89155f101d7ae5f30", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1f186cfd88b60e89155f101d7ae5f30");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("level", str);
                        jSONObject.put(ShieldMonitorKey.TAG_BUSINESS, aVar.c);
                        jSONObject.put("category", aVar.b);
                        if (!TextUtils.isEmpty(aVar.f)) {
                            jSONObject.put(SnifferDBHelper.COLUMN_LOG, aVar.f);
                        } else {
                            jSONObject.put(SnifferDBHelper.COLUMN_LOG, aVar.b);
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

    public static void c(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40bfa8cc284ba34dbc379fe6b7546631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40bfa8cc284ba34dbc379fe6b7546631");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.platform.capacity.log.i.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c034624c2e417a73230b7b5aa865c859", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c034624c2e417a73230b7b5aa865c859");
                        return;
                    }
                    try {
                        if (!a.this.h || i.b(com.meituan.android.singleton.b.a)) {
                            Sniffer.normal(a.this.c, a.this.b, a.this.d);
                        }
                        if (a.this.g) {
                            a.this.f = i.e(a.this);
                            i.b(a.this);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public static void d(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e5825c75e47d5a89279cac78a9c4ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e5825c75e47d5a89279cac78a9c4ff3");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.platform.capacity.log.i.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a007ff232b478c8ec9eebb147eed92b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a007ff232b478c8ec9eebb147eed92b5");
                        return;
                    }
                    try {
                        if (!a.this.h || i.b(com.meituan.android.singleton.b.a)) {
                            Sniffer.smell(a.this.c, a.this.b, a.this.d, a.this.e, a.this.f, 1L, i.a());
                        }
                        a.this.f = i.e(a.this);
                        i.a(a.this);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3289f62e7d60b8a6f981af0406570f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3289f62e7d60b8a6f981af0406570f0")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo().isConnected();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
