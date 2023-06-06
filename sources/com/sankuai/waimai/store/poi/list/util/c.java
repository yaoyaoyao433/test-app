package com.sankuai.waimai.store.poi.list.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Activity activity, @NonNull Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c746207f20c66a52c311db6099e3a43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c746207f20c66a52c311db6099e3a43");
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null || map.size() == 0) {
            return;
        }
        Uri data = intent.getData();
        Uri.Builder builder = data == null ? new Uri.Builder() : data.buildUpon();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry != null) {
                builder.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        intent.setData(builder.build());
    }

    public static Map<String, Object> a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e45a2701bf5a103fcf29e74d2ee8848a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e45a2701bf5a103fcf29e74d2ee8848a");
        }
        HashMap hashMap = new HashMap();
        try {
            Uri data = activity.getIntent().getData();
            if (data != null) {
                for (String str : data.getQueryParameterNames()) {
                    hashMap.put(str, data.getQueryParameter(str));
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return hashMap;
    }

    public static long a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8f2be713d76ae1865760a3c07d98bf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8f2be713d76ae1865760a3c07d98bf2")).longValue();
        }
        if (map != null) {
            try {
                return ((Double) map.get("id")).longValue();
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
                return -1L;
            }
        }
        return -1L;
    }

    public static String b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d6e08b615eddad6dd729fe71a28a966", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d6e08b615eddad6dd729fe71a28a966");
        }
        if (map != null) {
            try {
                return map.get(FoodDetailNetWorkPreLoader.URI_POI_STR).toString();
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
                return "-1";
            }
        }
        return "-1";
    }

    public static long c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f5a356447bb4ec5f9541e87657a68dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f5a356447bb4ec5f9541e87657a68dc")).longValue();
        }
        if (map != null) {
            try {
                return ((Double) ((Map) map.get("poi_info")).get("id")).longValue();
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
                return -1L;
            }
        }
        return -1L;
    }

    public static String d(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df6f5280ce6364d5afab98813ed1aa56", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df6f5280ce6364d5afab98813ed1aa56");
        }
        if (map != null) {
            try {
                return ((Map) map.get("poi_info")).get(FoodDetailNetWorkPreLoader.URI_POI_STR).toString();
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
                return "-1";
            }
        }
        return "-1";
    }
}
