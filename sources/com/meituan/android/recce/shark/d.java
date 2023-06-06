package com.meituan.android.recce.shark;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.android.payguard.RequestCryptUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    private static String b(String str, String str2) throws Exception {
        String[] strArr;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9794a6911ee11486eb3caba33e0c8913", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9794a6911ee11486eb3caba33e0c8913");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            strArr = RequestCryptUtils.a(str, new String[]{str2});
        } catch (Exception unused) {
            strArr = null;
        }
        if (strArr == null || strArr.length == 0) {
            throw new Exception("数据加载繁忙，请稍后再试");
        }
        return strArr[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90080169f9a499675d42428cd9a726a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90080169f9a499675d42428cd9a726a1");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            JsonObject jsonObject = (JsonObject) g.a().fromJson(str2, (Class<Object>) JsonObject.class);
            String[] strArr = {"data", "encrypt_res"};
            Object[] objArr2 = {jsonObject, strArr};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e9ab99fbb1ea8e077dadbca336747aa0", RobustBitConfig.DEFAULT_VALUE)) {
                jsonElement2 = (JsonElement) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e9ab99fbb1ea8e077dadbca336747aa0");
            } else if (jsonObject == null) {
                jsonElement2 = null;
            } else {
                JsonObject jsonObject2 = jsonObject;
                int i = 0;
                while (true) {
                    jsonElement = jsonObject2.get(strArr[i]);
                    if (jsonElement == null || i == 1) {
                        break;
                    }
                    if (jsonElement instanceof JsonObject) {
                        jsonObject2 = (JsonObject) jsonElement;
                    }
                    i++;
                }
                jsonElement2 = jsonElement;
            }
            if (jsonElement2 instanceof JsonPrimitive) {
                JsonObject jsonObject3 = (JsonObject) g.a().fromJson(b(str, jsonElement2.getAsString()), (Class<Object>) JsonObject.class);
                String[] strArr2 = {"data"};
                Object[] objArr3 = {jsonObject, jsonObject3, strArr2};
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "bbf7a59f75d22e37299b80d7b34de630", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "bbf7a59f75d22e37299b80d7b34de630");
                } else if (jsonObject != null && jsonObject.get(strArr2[0]) != null) {
                    jsonObject.add(strArr2[0], jsonObject3);
                }
                return g.a().toJson((JsonElement) jsonObject);
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }
}
