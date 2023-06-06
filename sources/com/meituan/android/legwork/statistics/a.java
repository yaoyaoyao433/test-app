package com.meituan.android.legwork.statistics;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.legwork.bean.H5OrderInfo;
import com.meituan.android.legwork.utils.b;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static final String b = "a";
    public static final String c = "none";
    public static String d = "none";
    public static String e;
    public static String f;

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94040b5d799f594f0fbc2c544d992efd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94040b5d799f594f0fbc2c544d992efd")).intValue();
        }
        if (i != 1) {
            return i != 3 ? 2 : 0;
        }
        return 1;
    }

    private static Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ea9a60be03ff2f82d1489a17ee011ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ea9a60be03ff2f82d1489a17ee011ac");
        }
        HashMap hashMap = new HashMap();
        b(hashMap);
        return hashMap;
    }

    public static void a(Object obj, String str, Map<String, Object> map, String str2) {
        Object[] objArr = {obj, str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88b3ec1bdcd00517de17bb5c4cc49266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88b3ec1bdcd00517de17bb5c4cc49266");
        } else {
            a(obj, str, map, str2, (Map<String, Object>) null);
        }
    }

    public static void a(Object obj, String str, Map<String, Object> map, String str2, Map<String, Object> map2) {
        Object[] objArr = {obj, str, map, str2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "888a69dc13d4539efcc8d216cee2206b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "888a69dc13d4539efcc8d216cee2206b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("custom", c(map));
        d(hashMap);
        if (map != null && map.containsKey("order_id")) {
            hashMap.put("order_id", map.get("order_id"));
        }
        String generatePageInfoKey = AppUtil.generatePageInfoKey(obj);
        Channel b2 = b();
        if (b2 == null) {
            return;
        }
        b2.writeModelView(generatePageInfoKey, str, hashMap, str2);
    }

    private static JSONObject c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4442fe9d415c4a3dadeca3dc5bc11744", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4442fe9d415c4a3dadeca3dc5bc11744");
        }
        Map<String, Object> a2 = a();
        if (map != null) {
            a2.putAll(map);
        }
        return JsonUtil.mapToJSONObject(a2);
    }

    public static void a(@NonNull Object obj, String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {obj, str, str2, map, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e76f671cb98e26fb0c5b1a3d09dc549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e76f671cb98e26fb0c5b1a3d09dc549");
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null && map.containsKey("order_id")) {
            hashMap.put("order_id", map.get("order_id"));
        }
        hashMap.put("custom", c(map));
        d(hashMap);
        String generatePageInfoKey = AppUtil.generatePageInfoKey(obj);
        Channel b2 = b();
        if (b2 == null) {
            return;
        }
        b2.writeModelClick(generatePageInfoKey, str, hashMap, str2);
    }

    private static Channel b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb11d16cb7503258e1159a02a8dfe2a7", RobustBitConfig.DEFAULT_VALUE) ? (Channel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb11d16cb7503258e1159a02a8dfe2a7") : Statistics.getChannel("banma");
    }

    public static void a(@NonNull Object obj, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {obj, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "463e10d537c873fa8441cda93f6d7fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "463e10d537c873fa8441cda93f6d7fd5");
        } else {
            a(obj, str, str2, map, (Map<String, Object>) null);
        }
    }

    public static void a(@NonNull Object obj, String str, String str2) {
        Object[] objArr = {obj, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "889720f40719b59bf525769c5730c010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "889720f40719b59bf525769c5730c010");
        } else {
            a(obj, str, str2, (Map<String, Object>) null, (Map<String, Object>) null);
        }
    }

    public static void b(@NonNull Object obj, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {obj, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76724112c6abd12d3478b37c34eafa97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76724112c6abd12d3478b37c34eafa97");
            return;
        }
        HashMap hashMap = new HashMap();
        if (map.containsKey("order_id")) {
            hashMap.put("order_id", map.get("order_id"));
        }
        hashMap.put("custom", c(map));
        d(hashMap);
        Channel b2 = b();
        if (b2 == null) {
            return;
        }
        b2.writeBizPay(AppUtil.generatePageInfoKey(obj), str, hashMap, str2);
    }

    public static void a(@NonNull Object obj, String str, Map<String, Object> map) {
        Object[] objArr = {obj, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67ef4373d954326693ee7db68fd3780e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67ef4373d954326693ee7db68fd3780e");
            return;
        }
        Object[] objArr2 = {obj, str, map, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0a72c2c1e3a20e66c8e717d7bb3bcd2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0a72c2c1e3a20e66c8e717d7bb3bcd2e");
            return;
        }
        String generatePageInfoKey = AppUtil.generatePageInfoKey(obj);
        Statistics.setDefaultChannelName(generatePageInfoKey, "banma");
        Statistics.resetPageName(generatePageInfoKey, str);
        HashMap hashMap = new HashMap();
        if (map != null && map.containsKey("order_id")) {
            hashMap.put("order_id", map.get("order_id"));
        }
        hashMap.put("custom", c(map));
        d(hashMap);
        Channel b2 = b();
        if (b2 != null) {
            b2.writePageView(generatePageInfoKey, str, hashMap);
        }
    }

    public static void a(@NonNull Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4aaf93c362179868ecb31943336a0406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4aaf93c362179868ecb31943336a0406");
            return;
        }
        String generatePageInfoKey = AppUtil.generatePageInfoKey(obj);
        Channel b2 = b();
        if (b2 == null) {
            return;
        }
        b2.writePageDisappear(generatePageInfoKey, str, null);
    }

    public static void b(@NonNull Object obj, String str, Map<String, Object> map) {
        Object[] objArr = {obj, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f05bffcdcdf9355237afa8fa0190c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f05bffcdcdf9355237afa8fa0190c59");
            return;
        }
        Object[] objArr2 = {obj, str, map, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f8de5a7dd22113b3d8727f871d88bfc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f8de5a7dd22113b3d8727f871d88bfc9");
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        hashMap.put("custom", c(map));
        d(hashMap);
        Channel b2 = b();
        if (b2 != null) {
            b2.writePageView(AppUtil.generatePageInfoKey(obj), str, hashMap);
        }
    }

    private static void d(Map<String, Object> map) {
        JSONObject jSONObject;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3470c5866363d99e244cc31404161c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3470c5866363d99e244cc31404161c42");
        } else if (map == null) {
        } else {
            Object obj = map.get("abtest");
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = new JSONObject();
            }
            b.a().a(jSONObject);
            map.put("abtest", jSONObject);
        }
    }

    public static void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4330f10f9d8c272590ea4b36ed0d0769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4330f10f9d8c272590ea4b36ed0d0769");
            return;
        }
        map.put("banner_id_url", TextUtils.isEmpty(e) ? c : e);
        map.put("legworkbrand_id", TextUtils.isEmpty(f) ? c : f);
    }

    public static void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aefbdb6b70946fcdc81d9b03c1b1c531", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aefbdb6b70946fcdc81d9b03c1b1c531");
            return;
        }
        map.put("channel", com.meituan.android.legwork.common.hostInfo.b.e().a());
        map.put("legwork_type", "1");
        map.put("channel_activity_id", d);
    }

    public static void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ce0eb1e1d2da5cda7e30aa453651510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ce0eb1e1d2da5cda7e30aa453651510");
        } else if (intent == null || intent.getData() == null) {
        } else {
            String queryParameter = intent.getData().getQueryParameter("orderInfo");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            try {
                H5OrderInfo h5OrderInfo = (H5OrderInfo) com.meituan.android.legwork.net.util.b.a().fromJson(queryParameter, (Class<Object>) H5OrderInfo.class);
                if (!TextUtils.isEmpty(h5OrderInfo.channel)) {
                    com.meituan.android.legwork.common.hostInfo.b.e().b = h5OrderInfo.channel;
                }
                if (!TextUtils.isEmpty(h5OrderInfo.bannerId)) {
                    e = h5OrderInfo.bannerId;
                }
                if (TextUtils.isEmpty(h5OrderInfo.legworkbrandId)) {
                    return;
                }
                f = h5OrderInfo.legworkbrandId;
            } catch (JsonSyntaxException e2) {
                x.e("StatisticsUtil.dealCommonParamsForIntent()", "解析爆款页orderInfo失败,orderInfo:" + queryParameter + ",exception msg:", e2);
                x.a(e2);
            }
        }
    }
}
