package com.meituan.android.neohybrid.v2.neo.http.encrypt;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.payguard.RequestCryptUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) throws IOException {
        String[] strArr;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5121d1384f130ca09e1f5545ffbbb66", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5121d1384f130ca09e1f5545ffbbb66");
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
            throw new PayException(-1, "数据加载繁忙，请稍后再试", 2, "");
        }
        return strArr[0];
    }

    public static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77a676ec6d43d251af6f839a98e95829", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77a676ec6d43d251af6f839a98e95829");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            JsonObject jsonObject = (JsonObject) com.meituan.android.neohybrid.util.gson.b.a().fromJson(str2, (Class<Object>) JsonObject.class);
            JsonElement a2 = com.meituan.android.neohybrid.util.a.a(jsonObject, "data", "encrypt_res");
            if (a2 instanceof JsonPrimitive) {
                com.meituan.android.neohybrid.util.a.a(jsonObject, (JsonObject) com.meituan.android.neohybrid.util.gson.b.a().fromJson(a(str, a2.getAsString()), (Class<Object>) JsonObject.class), "data");
                return com.meituan.android.neohybrid.util.gson.b.a().toJson((JsonElement) jsonObject);
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }
}
