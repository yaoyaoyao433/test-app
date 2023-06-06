package com.sankuai.waimai.touchmatrix.monitor;

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
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private static final Executor b = new v();

    public static /* synthetic */ String e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfcc407b1ea36219c3405fed3df35979", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfcc407b1ea36219c3405fed3df35979");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35e7f4d04097257ccc278136f7420a40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35e7f4d04097257ccc278136f7420a40");
        } else {
            a(aVar, "error");
        }
    }

    public static void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74ac89ec25920a2c7acc1de43ec7d82f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74ac89ec25920a2c7acc1de43ec7d82f");
        } else {
            a(aVar, "info");
        }
    }

    private static void a(final a aVar, final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64810c27217c936ecbc7e2d438b1884f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64810c27217c936ecbc7e2d438b1884f");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.touchmatrix.monitor.k.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8bee06b39793b172102d607166f0ef5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8bee06b39793b172102d607166f0ef5");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5be11c76e8b8e45427af134a7483977d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5be11c76e8b8e45427af134a7483977d");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.touchmatrix.monitor.k.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a20c082c88df4dc3bfb280351ccf2f65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a20c082c88df4dc3bfb280351ccf2f65");
                        return;
                    }
                    if (!a.this.h || k.b(com.meituan.android.singleton.b.a)) {
                        Sniffer.normal(a.this.c, a.this.b, a.this.d);
                    }
                    if (a.this.g) {
                        a.this.f = k.e(a.this);
                        k.b(a.this);
                    }
                }
            });
        }
    }

    public static void d(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cd53532a69a830dc53c8315189dd8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cd53532a69a830dc53c8315189dd8f7");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.touchmatrix.monitor.k.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43c7fc7101abd7533d29bc419ce7c465", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43c7fc7101abd7533d29bc419ce7c465");
                        return;
                    }
                    if (!a.this.h || k.b(com.meituan.android.singleton.b.a)) {
                        Sniffer.smell(a.this.c, a.this.b, a.this.d, a.this.e, a.this.f, 1, new HashMap());
                    }
                    if (a.this.g) {
                        a.this.f = k.e(a.this);
                        k.a(a.this);
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa0f2c7b7c6c0fcf909e15fa4015e132", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa0f2c7b7c6c0fcf909e15fa4015e132")).booleanValue();
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
