package com.sankuai.waimai.foundation.utils;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m {
    public static ChangeQuickRedirect a;

    public static JSONObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58affc695005afc11459326bf947d1e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58affc695005afc11459326bf947d1e6");
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
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(byte[] r11, java.lang.String r12) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.foundation.utils.m.a
            java.lang.String r10 = "51f5c863a9bf68ec246de47f1f4e3479"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L21:
            if (r11 == 0) goto L45
            if (r12 == 0) goto L3a
            com.sankuai.meituan.retrofit2.ad r12 = com.sankuai.meituan.retrofit2.ad.a(r12)     // Catch: java.lang.Throwable -> L45
            if (r12 == 0) goto L3a
            java.nio.charset.Charset r0 = r12.a()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L3a
            java.nio.charset.Charset r12 = r12.a()     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = r12.name()     // Catch: java.lang.Throwable -> L45
            goto L3b
        L3a:
            r12 = r2
        L3b:
            if (r12 != 0) goto L3f
            java.lang.String r12 = "UTF-8"
        L3f:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L45
            r0.<init>(r11, r12)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r0 = r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.foundation.utils.m.a(byte[], java.lang.String):java.lang.String");
    }

    public static JsonElement b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b57a78d92b51f9b4d4261db50cf2ea6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b57a78d92b51f9b4d4261db50cf2ea6");
        }
        if (str == null) {
            return null;
        }
        try {
            return new JsonParser().parse(str);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }
}
