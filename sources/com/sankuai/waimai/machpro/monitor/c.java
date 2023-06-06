package com.sankuai.waimai.machpro.monitor;

import android.support.v4.provider.FontsContractCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.machpro.f;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static c c;
    public a b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2eb6ade5fc3d966d1e7b7b2da2de8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2eb6ade5fc3d966d1e7b7b2da2de8a");
        } else {
            this.b = f.a().j;
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56c4bb70700c5d361b121e80508c2e3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56c4bb70700c5d361b121e80508c2e3c");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d8e1317a54a266ccf74a13e1c52453", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d8e1317a54a266ccf74a13e1c52453");
        }
        if (TextUtils.isEmpty(str) || str.length() < 10) {
            return "";
        }
        String[] split = str.substring(10).split(CommonConstant.Symbol.UNDERLINE);
        return split.length >= 2 ? split[0] : "";
    }

    public final void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79617ec4c1b78731d228a741dcec84c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79617ec4c1b78731d228a741dcec84c2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MPBundleLoadSuccess", 1);
        Map<String, String> b = b();
        b.put("bundle_name", str);
        b.put("bundle_version", str2);
        b.put("biz", str4);
        b.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "0");
        b.put(FontsContractCompat.Columns.RESULT_CODE, str3);
        if (this.b != null) {
            this.b.a(hashMap, b);
        }
    }

    public final void a(String str, String str2, int i, String str3, String str4) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb1b51dcc31c5506e9727237e2cd5c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb1b51dcc31c5506e9727237e2cd5c40");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MPBundleLoadSuccess", 0);
        Map<String, String> b = b();
        b.put("bundle_name", str);
        b.put("bundle_version", str2);
        b.put("biz", str4);
        b.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i));
        b.put(FontsContractCompat.Columns.RESULT_CODE, str3);
        if (this.b != null) {
            this.b.a(hashMap, b);
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc75d4df00081ac28d7eafb6cca00969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc75d4df00081ac28d7eafb6cca00969");
        } else if (this.b != null) {
            this.b.a(bVar);
        }
    }

    public Map<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b8a2218d8e9cfd431f442938a4ae4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b8a2218d8e9cfd431f442938a4ae4d");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        if (f.a().i != null) {
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, f.a().i.d);
            if (f.a().i.i) {
                hashMap.put("env", "test");
            } else {
                hashMap.put("env", "prod");
            }
        }
        return hashMap;
    }
}
