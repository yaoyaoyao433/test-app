package com.huawei.hms.framework.network.grs.b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.tencent.mapsdk.internal.ch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d extends a {
    public d(Context context, boolean z) {
        this.e = z;
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerV2", "appConfigName is" + appConfigName);
        if (a(TextUtils.isEmpty(appConfigName) ? "grs_app_global_route_config.json" : appConfigName, context, true) == 0) {
            this.d = true;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.b.a
    public int a(String str) {
        this.a = new com.huawei.hms.framework.network.grs.local.model.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONArray("applications").getJSONObject(0);
            this.a.b(jSONObject.getString("name"));
            JSONArray jSONArray = jSONObject.getJSONArray(ch.a_);
            if (jSONArray == null || jSONArray.length() == 0) {
                return -1;
            }
            if (jSONObject.has("customservices")) {
                b(jSONObject.getJSONArray("customservices"));
            }
            return 0;
        } catch (JSONException e) {
            Logger.w("LocalManagerV2", "parse appbean failed maybe json style is wrong.", e);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: JSONException -> 0x00b9, TryCatch #0 {JSONException -> 0x00b9, blocks: (B:3:0x000a, B:5:0x0011, B:13:0x0025, B:19:0x0036, B:22:0x003e, B:24:0x0044, B:26:0x0050, B:28:0x005a, B:30:0x0063, B:32:0x006c, B:39:0x007f, B:43:0x008c, B:45:0x0093, B:48:0x009a, B:50:0x00a0, B:51:0x00ac, B:36:0x0077, B:42:0x0088, B:10:0x001d, B:16:0x002f), top: B:58:0x000a }] */
    @Override // com.huawei.hms.framework.network.grs.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(java.lang.String r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 16
            r0.<init>(r1)
            r10.b = r0
            r0 = -1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb9
            r2.<init>(r11)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r11 = "countryOrAreaGroups"
            boolean r11 = r2.has(r11)     // Catch: org.json.JSONException -> Lb9
            r3 = 0
            if (r11 == 0) goto L1b
            java.lang.String r11 = "countryOrAreaGroups"
            goto L25
        L1b:
            java.lang.String r11 = "countryGroups"
            boolean r11 = r2.has(r11)     // Catch: org.json.JSONException -> Lb9
            if (r11 == 0) goto L2a
            java.lang.String r11 = "countryGroups"
        L25:
            org.json.JSONArray r11 = r2.getJSONArray(r11)     // Catch: org.json.JSONException -> Lb9
            goto L33
        L2a:
            java.lang.String r11 = "LocalManagerV2"
            java.lang.String r2 = "maybe local config json is wrong because the default countryOrAreaGroups isn't config."
            com.huawei.hms.framework.common.Logger.e(r11, r2)     // Catch: org.json.JSONException -> Lb9
            r11 = r3
        L33:
            if (r11 != 0) goto L36
            return r0
        L36:
            int r2 = r11.length()     // Catch: org.json.JSONException -> Lb9
            r4 = 0
            if (r2 == 0) goto Lb8
            r2 = 0
        L3e:
            int r5 = r11.length()     // Catch: org.json.JSONException -> Lb9
            if (r2 >= r5) goto Lb8
            org.json.JSONObject r5 = r11.getJSONObject(r2)     // Catch: org.json.JSONException -> Lb9
            com.huawei.hms.framework.network.grs.local.model.b r6 = new com.huawei.hms.framework.network.grs.local.model.b     // Catch: org.json.JSONException -> Lb9
            r6.<init>()     // Catch: org.json.JSONException -> Lb9
            java.lang.String r7 = "id"
            java.lang.String r7 = r5.getString(r7)     // Catch: org.json.JSONException -> Lb9
            r6.b(r7)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r7 = "name"
            java.lang.String r7 = r5.getString(r7)     // Catch: org.json.JSONException -> Lb9
            r6.c(r7)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r7 = "description"
            java.lang.String r7 = r5.getString(r7)     // Catch: org.json.JSONException -> Lb9
            r6.a(r7)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r7 = "countriesOrAreas"
            boolean r7 = r5.has(r7)     // Catch: org.json.JSONException -> Lb9
            if (r7 == 0) goto L75
            java.lang.String r7 = "countriesOrAreas"
            goto L7f
        L75:
            java.lang.String r7 = "countries"
            boolean r7 = r5.has(r7)     // Catch: org.json.JSONException -> Lb9
            if (r7 == 0) goto L84
            java.lang.String r7 = "countries"
        L7f:
            org.json.JSONArray r5 = r5.getJSONArray(r7)     // Catch: org.json.JSONException -> Lb9
            goto L8c
        L84:
            java.lang.String r5 = "LocalManagerV2"
            java.lang.String r7 = "current country or area group has not config countries or areas."
            com.huawei.hms.framework.common.Logger.w(r5, r7)     // Catch: org.json.JSONException -> Lb9
            r5 = r3
        L8c:
            java.util.HashSet r7 = new java.util.HashSet     // Catch: org.json.JSONException -> Lb9
            r7.<init>(r1)     // Catch: org.json.JSONException -> Lb9
            if (r5 == 0) goto Lb7
            int r8 = r5.length()     // Catch: org.json.JSONException -> Lb9
            if (r8 == 0) goto Lb7
            r8 = 0
        L9a:
            int r9 = r5.length()     // Catch: org.json.JSONException -> Lb9
            if (r8 >= r9) goto Lac
            java.lang.Object r9 = r5.get(r8)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r9 = (java.lang.String) r9     // Catch: org.json.JSONException -> Lb9
            r7.add(r9)     // Catch: org.json.JSONException -> Lb9
            int r8 = r8 + 1
            goto L9a
        Lac:
            r6.a(r7)     // Catch: org.json.JSONException -> Lb9
            java.util.List<com.huawei.hms.framework.network.grs.local.model.b> r5 = r10.b     // Catch: org.json.JSONException -> Lb9
            r5.add(r6)     // Catch: org.json.JSONException -> Lb9
            int r2 = r2 + 1
            goto L3e
        Lb7:
            return r0
        Lb8:
            return r4
        Lb9:
            r11 = move-exception
            java.lang.String r1 = "LocalManagerV2"
            java.lang.String r2 = "parse countrygroup failed maybe json style is wrong."
            com.huawei.hms.framework.common.Logger.w(r1, r2, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.b.d.b(java.lang.String):int");
    }

    @Override // com.huawei.hms.framework.network.grs.b.a
    public int e(String str) {
        return d(str);
    }
}
