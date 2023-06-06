package com.sankuai.waimai.addrsdk.retrofit;

import android.support.annotation.NonNull;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static JsonObject a(@NonNull JsonObject jsonObject, String str, JsonObject jsonObject2) {
        Object[] objArr = {jsonObject, str, jsonObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "685b639485d79e7733ac904246ce2448", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "685b639485d79e7733ac904246ce2448");
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsJsonObject();
            } catch (Exception unused) {
            }
        }
        return jsonObject2;
    }

    public static int a(@NonNull JsonObject jsonObject, String str, int i) {
        Object[] objArr = {jsonObject, str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42c4a53729b6c73a53112c3132b43395", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42c4a53729b6c73a53112c3132b43395")).intValue();
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsInt();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static String a(@NonNull JsonObject jsonObject, String str, String str2) {
        Object[] objArr = {jsonObject, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4c7226b5c93205ca9f5b5db826d2a9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4c7226b5c93205ca9f5b5db826d2a9e");
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsString();
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
