package com.sankuai.waimai.store.drug.monitor.poiid;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.drug.util.monitor.DrugCommonMonitor;
import com.sankuai.waimai.store.util.monitor.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;

    private static List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9369dafe09cc5bb628a9ba7d643d66e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9369dafe09cc5bb628a9ba7d643d66e") : (List) d.h().a("poi_id_monitor/router/exclude_uris", new TypeToken<List<String>>() { // from class: com.sankuai.waimai.store.drug.monitor.poiid.a.1
        }.getType());
    }

    @Override // com.sankuai.waimai.router.core.e
    public final void a(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90065d0d7f9665a45ef1155de7d2d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90065d0d7f9665a45ef1155de7d2d06");
        } else {
            b(jVar);
        }
    }

    @Override // com.sankuai.waimai.router.core.e
    public final void a(@NonNull j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "629d1d3099e3e87840dfc8915bb3d70f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "629d1d3099e3e87840dfc8915bb3d70f");
        } else {
            b(jVar);
        }
    }

    private void b(@NonNull j jVar) {
        Map<String, Object> a2;
        int b;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2452a70bb991d2105ddcbc441229f6c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2452a70bb991d2105ddcbc441229f6c5");
        } else if (b.a("router/switch")) {
            List<String> a3 = a();
            Uri uri = jVar.d;
            String b2 = b(uri);
            if ((a3 == null || !a3.contains(b2)) && (b = b.b((a2 = a(uri)))) != 0) {
                a(uri.getHost() + b2 + a(a2), b);
            }
        }
    }

    private static String a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3010d4f0ea87f7792957b4e833b6ba0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3010d4f0ea87f7792957b4e833b6ba0f");
        }
        if (map == null) {
            return "";
        }
        Object obj = map.get("mrn_component");
        if (obj instanceof String) {
            return "/mrn_component=" + ((String) obj);
        }
        return "";
    }

    private static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a34c510fc90373b78de623f74eb828e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a34c510fc90373b78de623f74eb828e9");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(NetLogConstants.Details.SCHEME, str);
        hashMap.put("error_type", String.valueOf(i));
        c.a(new DrugCommonMonitor(b.a("router/key", "MEDPoiIdRouterV2")), "", "poi id router error!", hashMap);
    }

    private Map<String, Object> a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208bc21ecfc046c148b7ca950db0b92f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208bc21ecfc046c148b7ca950db0b92f");
        }
        HashMap hashMap = new HashMap();
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (com.sankuai.shangou.stone.util.a.b(queryParameterNames)) {
                return hashMap;
            }
            for (String str : queryParameterNames) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
            return hashMap;
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return hashMap;
        }
    }

    private String b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6024dc55ce72461dcd292d7670305b0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6024dc55ce72461dcd292d7670305b0") : uri.getPath();
    }
}
