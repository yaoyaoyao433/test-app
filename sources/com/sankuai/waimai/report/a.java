package com.sankuai.waimai.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89f31c73e076ea02b070022c33b49e9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89f31c73e076ea02b070022c33b49e9a")).intValue();
        }
        JSONObject c = c(map);
        if (c != null) {
            return c.optInt("adType");
        }
        return 0;
    }

    public static int b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "509da08894a70ddbb31423412f2bd0f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "509da08894a70ddbb31423412f2bd0f9")).intValue();
        }
        JSONObject c = c(map);
        if (c != null) {
            return c.optInt("chargeInfoSize", 1);
        }
        return 0;
    }

    private static JSONObject c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "381a6170f545043c330e4401748aa57a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "381a6170f545043c330e4401748aa57a");
        }
        if (map != null && !map.isEmpty()) {
            Object obj = map.get("ad");
            if (obj instanceof String) {
                try {
                    return new JSONObject((String) obj);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            } else {
                if (obj instanceof JSONObject) {
                    return (JSONObject) obj;
                }
            }
        }
        return null;
    }

    public static void a(String str, String str2, int i, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9eba8ad4b176cb53f4a4a38dc0a7f52a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9eba8ad4b176cb53f4a4a38dc0a7f52a");
        } else if (map == null || i <= 0) {
        } else {
            int length = new JSONObject(map).toString().length();
            int b = b(map);
            JSONObject c = c(map);
            c.a().a("templateId", str).a("bundleVersion", str2).a("adType", String.valueOf(i)).a("eventId", str3).a("chargeInfoSize", String.valueOf(b)).a("adLength", String.valueOf(((int) Math.ceil((c != null ? c.toString().length() : 0) / 100.0f)) * 100)).a("valLabIsOverlength", String.valueOf(length > 10000 ? 1 : 0)).a(b.s, Collections.singletonList(Float.valueOf(length))).a();
        }
    }
}
