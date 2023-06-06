package com.sankuai.mesh.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.provider.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static JsonObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0a3248e1e8ed020cbe4c7874cff2e0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0a3248e1e8ed020cbe4c7874cff2e0d");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.b.a;
            return (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6ecbf88058445013456067b9a0d1903f", RobustBitConfig.DEFAULT_VALUE) ? (JsonParser) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6ecbf88058445013456067b9a0d1903f") : a.b.C0660a.a()).parse(str).getAsJsonObject();
        } catch (Exception unused) {
            return null;
        }
    }

    private static JsonArray b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "594bc344d30233f2652c1ef7023ec128", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "594bc344d30233f2652c1ef7023ec128");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JsonParser().parse(str).getAsJsonArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public static JsonObject a(JsonObject jsonObject, JsonObject jsonObject2) {
        Object[] objArr = {jsonObject, jsonObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e728f11bf95d406990b9a74f8b7f5b81", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e728f11bf95d406990b9a74f8b7f5b81");
        }
        if (jsonObject == null) {
            return jsonObject2;
        }
        if (jsonObject2 == null) {
            return jsonObject;
        }
        JsonObject jsonObject3 = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : jsonObject2.entrySet()) {
            jsonObject3.add(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, JsonElement> entry2 : jsonObject.entrySet()) {
            jsonObject3.add(entry2.getKey(), entry2.getValue());
        }
        return jsonObject3;
    }

    public static <T> T a(Class<T> cls, String str, String str2) {
        JsonArray b;
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "690bb3ceba7475ad31727106b69ed26d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "690bb3ceba7475ad31727106b69ed26d");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (b = b(str)) == null) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add(str2, b);
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.C0658a.a;
            return (T) (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5c0be84a64e3208bacc98fec0220d6d6", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5c0be84a64e3208bacc98fec0220d6d6") : a.C0658a.C0659a.a()).fromJson((JsonElement) jsonObject, (Class<Object>) cls);
        } catch (Exception unused) {
            return null;
        }
    }
}
