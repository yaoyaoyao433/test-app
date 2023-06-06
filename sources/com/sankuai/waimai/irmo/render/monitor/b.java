package com.sankuai.waimai.irmo.render.monitor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.dianping.networklog.c;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.v;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Executor b = new v();

    public static /* synthetic */ String e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71549bff4a8ce718dbbb2953566638f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71549bff4a8ce718dbbb2953566638f1");
        }
        StringBuilder sb = new StringBuilder();
        if (aVar != null) {
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
        }
        return sb.toString();
    }

    public static void a(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c6ec190251a1d02d354778ef9c37802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c6ec190251a1d02d354778ef9c37802");
        } else if (aVar == null) {
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.irmo.render.monitor.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a004c93797df80330cd789549c5586a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a004c93797df80330cd789549c5586a");
                        return;
                    }
                    if ((!a.this.h || b.b(com.meituan.android.singleton.b.a)) && a.this.i) {
                        Sniffer.normal(a.this.c, a.this.b, a.this.d);
                    }
                    if (a.this.g) {
                        a.this.f = b.e(a.this);
                        b.d(a.this);
                    }
                }
            });
        }
    }

    public static void b(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a91cdf5ad91001fbeec5c204360c2491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a91cdf5ad91001fbeec5c204360c2491");
        } else if (aVar == null) {
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.irmo.render.monitor.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a6a23f124ebd98a52f20ad3074d2aa2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a6a23f124ebd98a52f20ad3074d2aa2");
                        return;
                    }
                    if (!a.this.h || (b.b(com.meituan.android.singleton.b.a) && a.this.i)) {
                        Sniffer.smell(a.this.c, a.this.b, a.this.d, a.this.e, a.this.f, 1L, a.this.j);
                    }
                    if (a.this.g) {
                        a.this.f = b.e(a.this);
                        b.c(a.this);
                    }
                }
            });
        }
    }

    public static void c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "829b1ac51f230aefb6b2a29b049e4aff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "829b1ac51f230aefb6b2a29b049e4aff");
        } else {
            a(aVar, "error");
        }
    }

    public static void d(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2613ee1d028da69575a310aabfab1cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2613ee1d028da69575a310aabfab1cf");
        } else {
            a(aVar, "info");
        }
    }

    private static void a(final a aVar, final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02732fe1584e86174eea05f955df0229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02732fe1584e86174eea05f955df0229");
        } else if (aVar == null) {
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.irmo.render.monitor.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "380c53d2df3484eae16b34deb0973185", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "380c53d2df3484eae16b34deb0973185");
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
                        c.a(jSONObject.toString(), 3);
                    } catch (Exception unused) {
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "008e4a9f6f8e34973da36ac307570300", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "008e4a9f6f8e34973da36ac307570300")).booleanValue();
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
