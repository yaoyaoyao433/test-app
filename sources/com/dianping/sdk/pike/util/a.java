package com.dianping.sdk.pike.util;

import android.text.TextUtils;
import com.dianping.networklog.j;
import com.dianping.sdk.pike.f;
import com.dianping.sdk.pike.i;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "220e6c73ba7b470df2ee3d24c1c2286f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "220e6c73ba7b470df2ee3d24c1c2286f");
        }
        try {
            String str = com.dianping.sdk.pike.f.E;
            if (!com.dianping.sdk.pike.f.D || TextUtils.isEmpty(str)) {
                return "";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ab", str);
            linkedHashMap.put("ty", "pike");
            linkedHashMap.put("rq", Integer.valueOf(i));
            linkedHashMap.put("rp", Integer.valueOf(i2));
            linkedHashMap.put("t", Integer.valueOf(i3));
            return com.dianping.nvtunnelkit.utils.g.a(str, new JSONObject(linkedHashMap).toString());
        } catch (Exception e) {
            i.a("AbTestUtils", "assembleABInfo error", e);
            return "";
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        String b;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59258ec78915dd95faf98f8cd695dfd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59258ec78915dd95faf98f8cd695dfd1");
        }
        if (com.dianping.sdk.pike.f.D && j.a(com.dianping.sdk.pike.f.b())) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5edc32293c3ad776d8398263c93ebf22", RobustBitConfig.DEFAULT_VALUE)) {
                    b = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5edc32293c3ad776d8398263c93ebf22");
                } else {
                    String str = "";
                    if (com.dianping.sdk.pike.f.j == f.a.Beta) {
                        str = "beta/";
                    } else if (com.dianping.sdk.pike.f.j == f.a.Stage) {
                        str = "stage/";
                    }
                    b = q.a(com.dianping.sdk.pike.f.b(), "bfe_pike_ab", 1).b(str + "ab_config", "");
                }
                if (!TextUtils.isEmpty(b)) {
                    JSONObject jSONObject2 = new JSONObject(b);
                    com.dianping.sdk.pike.f.E = jSONObject2.optString("pikeABTest", "");
                    long optLong = jSONObject2.optLong("pikeABTestExpires", 0L);
                    if (optLong > 0 && System.currentTimeMillis() <= optLong) {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!TextUtils.isEmpty(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        }
                    }
                }
            } catch (Exception e) {
                i.a("AbTestUtils", "mergeAB error", e);
            }
        }
        return jSONObject;
    }
}
