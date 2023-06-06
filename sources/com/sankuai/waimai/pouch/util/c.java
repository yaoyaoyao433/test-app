package com.sankuai.waimai.pouch.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.GsonTypeAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static JSONObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2426a55ffb67adeb3d489b86b930638", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2426a55ffb67adeb3d489b86b930638");
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            String[] split = str.split("&");
            if (split != null) {
                for (String str2 : split) {
                    String[] split2 = str2.split("=");
                    if (split2 != null && split2.length == 2) {
                        jSONObject.put(split2[0], split2[1]);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static String a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d6460b9c5b51b856010e0d3c03020ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d6460b9c5b51b856010e0d3c03020ce");
        }
        try {
            return new GsonBuilder().registerTypeAdapter(Map.class, new GsonTypeAdapter()).create().toJson(map);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, Object> b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1301f046ec2f0cb3cd0f2a549f53d9d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1301f046ec2f0cb3cd0f2a549f53d9d8");
        }
        try {
            return (Map) new GsonBuilder().registerTypeAdapter(Map.class, new GsonTypeAdapter()).create().fromJson(str, (Class<Object>) Map.class);
        } catch (Exception unused) {
            return new HashMap();
        }
    }
}
