package com.sankuai.ehcore.util;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.a;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.e;
import com.sankuai.eh.component.service.utils.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static void a(String str, String str2, Map<String, Object> map, Long l) {
        Map map2;
        Log build;
        Object[] objArr = {null, str2, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57a697df72b27f18f292697fe4da6437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57a697df72b27f18f292697fe4da6437");
            return;
        }
        HashMap hashMap = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "eff7889a3a5ddb99b6dd594b7ef53bd7", RobustBitConfig.DEFAULT_VALUE)) {
            map2 = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "eff7889a3a5ddb99b6dd594b7ef53bd7");
        } else {
            d.b a2 = new d.b().a("debug", Boolean.valueOf(f.b())).a("cityId", 0).a("uuid", com.sankuai.eh.component.service.a.c().f()).a("userid", com.sankuai.eh.component.service.a.c().d());
            com.sankuai.eh.component.service.tools.b.a();
            map2 = a2.a("onBackground", com.sankuai.eh.component.service.tools.b.d()).b;
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        if (l != null) {
            build = new Log.Builder(str2).value(l.longValue()).reportChannel(KiteFlyConstants.FE_LOG_REPORT).tag("eh").optional(hashMap).env(a()).build();
        } else {
            build = new Log.Builder(str2).reportChannel(KiteFlyConstants.FE_LOG_REPORT).tag("eh").optional(hashMap).env(a()).build();
        }
        Babel.logRT(build);
        Object[] objArr3 = {hashMap, l};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6ef0d00237c19d064a19c5e9e5e3f99a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6ef0d00237c19d064a19c5e9e5e3f99a");
        } else if (a.C0548a.a.a()) {
            try {
                hashMap.put("value", l);
                Map<String, Object> a3 = a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("env", new JSONObject(a3));
                jSONObject.put("logs", new JSONObject(hashMap));
                com.sankuai.eh.component.service.tools.d.a("babel_log", jSONObject.toString(4));
            } catch (Exception unused) {
            }
        }
    }

    public static Map<String, Object> a(com.sankuai.ehcore.tools.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b25a61c6cb5ec6263483009a9e41d539", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b25a61c6cb5ec6263483009a9e41d539");
        }
        String f = e.f(bVar.k);
        d.b bVar2 = new d.b();
        bVar2.a("utm_source", e.b(bVar.k, "utm_source"));
        JsonArray b = com.sankuai.eh.component.service.utils.b.b(bVar.a().get("searchParams"));
        for (int i = 0; b != null && i < b.size(); i++) {
            String b2 = com.sankuai.eh.component.service.utils.b.b(b.get(i), null);
            String b3 = e.b(bVar.k, b2);
            if (!TextUtils.isEmpty(b2)) {
                bVar2.a(b2, b3);
            }
        }
        return new d.b().a("url", e.a(bVar.k)).a("skeleton", bVar.g).a("hash", e.d(bVar.k)).a(SearchIntents.EXTRA_QUERY, f).a("ehid", bVar.b).a("cacheRead", com.sankuai.ehcore.horn.e.a()).a("cacheWrite", com.sankuai.ehcore.horn.e.b()).a("searchParams", bVar2.b).a("from", bVar.h).a("pattern", bVar.i).a("ttVersion", bVar.c).a(bVar.v).b;
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3958f2222d1b3a192fe8c6ceb3c93b0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3958f2222d1b3a192fe8c6ceb3c93b0d");
        } else {
            a(null, str, map, null);
        }
    }

    public static void a(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ad7e57bbf5f438e2a46e5376b9c3acb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ad7e57bbf5f438e2a46e5376b9c3acb");
        } else {
            a(null, str, map, l);
        }
    }

    private static Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "065e722ebb9c6476c635d0abf257d8e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "065e722ebb9c6476c635d0abf257d8e7");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ehVersion", "8.1.0");
        hashMap.put("ehVersionCode", com.sankuai.ehcore.settings.a.a);
        hashMap.put("container", com.sankuai.eh.component.service.a.c().h());
        hashMap.put("containerVersion", com.sankuai.eh.component.service.a.c().i());
        return hashMap;
    }
}
