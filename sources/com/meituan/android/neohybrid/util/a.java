package com.meituan.android.neohybrid.util;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static JsonElement a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a48125140afb61e152773a1ca5ff9dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a48125140afb61e152773a1ca5ff9dd");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JsonElement jsonElement = (JsonElement) com.meituan.android.neohybrid.util.gson.b.a().fromJson(str, (Class<Object>) JsonElement.class);
            if (jsonElement.isJsonObject()) {
                return ((JsonObject) jsonElement).get("data");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JsonElement a(JsonObject jsonObject, String... strArr) {
        JsonElement jsonElement;
        int i = 0;
        Object[] objArr = {jsonObject, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edddb1ac40c24638300e88d69e995654", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edddb1ac40c24638300e88d69e995654");
        }
        if (jsonObject == null) {
            return null;
        }
        while (true) {
            jsonElement = jsonObject.get(strArr[i]);
            if (jsonElement == null || i == 1) {
                break;
            }
            if (jsonElement instanceof JsonObject) {
                jsonObject = (JsonObject) jsonElement;
            }
            i++;
        }
        return jsonElement;
    }

    public static void a(JsonObject jsonObject, JsonElement jsonElement, String... strArr) {
        Object[] objArr = {jsonObject, jsonElement, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73b1bc23723c62a7d1c3c2bc65a01942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73b1bc23723c62a7d1c3c2bc65a01942");
        } else if (jsonObject == null || jsonObject.get(strArr[0]) == null) {
        } else {
            jsonObject.add(strArr[0], jsonElement);
        }
    }
}
