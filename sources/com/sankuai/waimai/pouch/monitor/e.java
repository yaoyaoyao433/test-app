package com.sankuai.waimai.pouch.monitor;

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
import com.sankuai.waimai.foundation.utils.v;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Executor b = new v();

    public static /* synthetic */ String d(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "643c926b4b5df979e3411aa861f0d6c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "643c926b4b5df979e3411aa861f0d6c9");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f85f79e3a82bf8ccd6eb1efa9f69f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f85f79e3a82bf8ccd6eb1efa9f69f3c");
        } else {
            a(aVar, "error");
        }
    }

    public static void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28575d3d33d2883960275b3cbeda2e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28575d3d33d2883960275b3cbeda2e8e");
        } else {
            a(aVar, "info");
        }
    }

    private static void a(final a aVar, final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "404b14f074e1f8af755740882c43b0dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "404b14f074e1f8af755740882c43b0dc");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.pouch.monitor.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "003bf90d63727aeb0dc4b306f89cd3e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "003bf90d63727aeb0dc4b306f89cd3e0");
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
                        com.dianping.networklog.c.a(jSONObject.toString(), 3);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static void c(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71bebed6791a5996f60ad28b02b4763d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71bebed6791a5996f60ad28b02b4763d");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.pouch.monitor.e.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "130ebbcf2fb45098dcbaf77e6fd7a6c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "130ebbcf2fb45098dcbaf77e6fd7a6c0");
                        return;
                    }
                    if ((!a.this.h || e.b(com.meituan.android.singleton.b.a)) && a.this.i) {
                        Sniffer.normal(a.this.c, a.this.b, a.this.d);
                    }
                    if (a.this.g) {
                        a.this.f = e.d(a.this);
                        e.b(a.this);
                    }
                }
            });
        }
    }

    public static void a(final a aVar, final Map<String, String> map) {
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7404e92deb4b5c40b87c4df657590d6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7404e92deb4b5c40b87c4df657590d6c");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.pouch.monitor.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c8eb907b569f1cbde0229fa0036b105", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c8eb907b569f1cbde0229fa0036b105");
                        return;
                    }
                    if (!a.this.h || e.b(com.meituan.android.singleton.b.a)) {
                        Sniffer.smell(a.this.c, a.this.b, a.this.d, a.this.e, a.this.f, 1L, map);
                    }
                    a.this.f = e.d(a.this);
                    e.a(a.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b90d39ec44ba859a46d634242120393", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b90d39ec44ba859a46d634242120393")).booleanValue();
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
