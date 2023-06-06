package com.huawei.hms.framework.network.grs.b;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.tencent.mapsdk.internal.ch;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends a {
    public c(Context context, boolean z) {
        this.e = z;
        if (a("grs_sdk_global_route_config.json", context, false) == 0) {
            this.d = true;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.b.a
    public int a(String str) {
        this.a = new com.huawei.hms.framework.network.grs.local.model.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            long j = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray(ch.a_);
            this.a.b(string);
            this.a.a(j);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong.", e);
            return -1;
        }
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray, JSONObject jSONObject) {
        String str;
        if (jSONObject == null || jSONObject.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.c(jSONObject2.getString("name"));
                bVar.a(jSONObject2.getString("description"));
                JSONArray jSONArray2 = null;
                if (jSONObject2.has("countriesOrAreas")) {
                    str = "countriesOrAreas";
                } else if (jSONObject2.has("countries")) {
                    str = "countries";
                } else {
                    Logger.w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null || jSONArray2.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        hashSet.add((String) jSONArray2.get(i));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                jSONArray2 = jSONObject2.getJSONArray(str);
                HashSet hashSet2 = new HashSet(16);
                if (jSONArray2 != null) {
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong.", e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: JSONException -> 0x00b9, TryCatch #0 {JSONException -> 0x00b9, blocks: (B:3:0x000a, B:5:0x0011, B:13:0x0025, B:19:0x0036, B:21:0x003d, B:22:0x0041, B:24:0x0047, B:26:0x005c, B:28:0x0065, B:30:0x006e, B:37:0x0081, B:41:0x008e, B:43:0x0095, B:46:0x009c, B:48:0x00a2, B:49:0x00ae, B:34:0x0079, B:40:0x008a, B:10:0x001d, B:16:0x002f), top: B:56:0x000a }] */
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
            org.json.JSONObject r11 = r2.getJSONObject(r11)     // Catch: org.json.JSONException -> Lb9
            goto L33
        L2a:
            java.lang.String r11 = "LocalManagerV1"
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
            java.util.Iterator r2 = r11.keys()     // Catch: org.json.JSONException -> Lb9
        L41:
            boolean r5 = r2.hasNext()     // Catch: org.json.JSONException -> Lb9
            if (r5 == 0) goto Lb8
            java.lang.Object r5 = r2.next()     // Catch: org.json.JSONException -> Lb9
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> Lb9
            com.huawei.hms.framework.network.grs.local.model.b r6 = new com.huawei.hms.framework.network.grs.local.model.b     // Catch: org.json.JSONException -> Lb9
            r6.<init>()     // Catch: org.json.JSONException -> Lb9
            r6.b(r5)     // Catch: org.json.JSONException -> Lb9
            org.json.JSONObject r5 = r11.getJSONObject(r5)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r7 = "name"
            java.lang.String r7 = r5.getString(r7)     // Catch: org.json.JSONException -> Lb9
            r6.c(r7)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r7 = "description"
            java.lang.String r7 = r5.getString(r7)     // Catch: org.json.JSONException -> Lb9
            r6.a(r7)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r7 = "countriesOrAreas"
            boolean r7 = r5.has(r7)     // Catch: org.json.JSONException -> Lb9
            if (r7 == 0) goto L77
            java.lang.String r7 = "countriesOrAreas"
            goto L81
        L77:
            java.lang.String r7 = "countries"
            boolean r7 = r5.has(r7)     // Catch: org.json.JSONException -> Lb9
            if (r7 == 0) goto L86
            java.lang.String r7 = "countries"
        L81:
            org.json.JSONArray r5 = r5.getJSONArray(r7)     // Catch: org.json.JSONException -> Lb9
            goto L8e
        L86:
            java.lang.String r5 = "LocalManagerV1"
            java.lang.String r7 = "current country or area group has not config countries or areas."
            com.huawei.hms.framework.common.Logger.w(r5, r7)     // Catch: org.json.JSONException -> Lb9
            r5 = r3
        L8e:
            java.util.HashSet r7 = new java.util.HashSet     // Catch: org.json.JSONException -> Lb9
            r7.<init>(r1)     // Catch: org.json.JSONException -> Lb9
            if (r5 == 0) goto Lb7
            int r8 = r5.length()     // Catch: org.json.JSONException -> Lb9
            if (r8 == 0) goto Lb7
            r8 = 0
        L9c:
            int r9 = r5.length()     // Catch: org.json.JSONException -> Lb9
            if (r8 >= r9) goto Lae
            java.lang.Object r9 = r5.get(r8)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r9 = (java.lang.String) r9     // Catch: org.json.JSONException -> Lb9
            r7.add(r9)     // Catch: org.json.JSONException -> Lb9
            int r8 = r8 + 1
            goto L9c
        Lae:
            r6.a(r7)     // Catch: org.json.JSONException -> Lb9
            java.util.List<com.huawei.hms.framework.network.grs.local.model.b> r5 = r10.b     // Catch: org.json.JSONException -> Lb9
            r5.add(r6)     // Catch: org.json.JSONException -> Lb9
            goto L41
        Lb7:
            return r0
        Lb8:
            return r4
        Lb9:
            r11 = move-exception
            java.lang.String r1 = "LocalManagerV1"
            java.lang.String r2 = "parse countrygroup failed maybe json style is wrong."
            com.huawei.hms.framework.common.Logger.w(r1, r2, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.b.c.b(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: JSONException -> 0x00f4, LOOP:2: B:34:0x0095->B:36:0x009b, LOOP_END, TryCatch #0 {JSONException -> 0x00f4, blocks: (B:2:0x0000, B:4:0x0008, B:5:0x0010, B:7:0x0017, B:9:0x002d, B:11:0x0036, B:13:0x003d, B:15:0x0047, B:16:0x004b, B:18:0x0051, B:20:0x0061, B:27:0x0074, B:31:0x0081, B:33:0x0086, B:34:0x0095, B:36:0x009b, B:37:0x00a9, B:24:0x006c, B:30:0x007e, B:40:0x00b8, B:44:0x00c1, B:50:0x00d1, B:54:0x00de, B:56:0x00e5, B:57:0x00ec, B:47:0x00c8, B:53:0x00db), top: B:63:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5 A[Catch: JSONException -> 0x00f4, TryCatch #0 {JSONException -> 0x00f4, blocks: (B:2:0x0000, B:4:0x0008, B:5:0x0010, B:7:0x0017, B:9:0x002d, B:11:0x0036, B:13:0x003d, B:15:0x0047, B:16:0x004b, B:18:0x0051, B:20:0x0061, B:27:0x0074, B:31:0x0081, B:33:0x0086, B:34:0x0095, B:36:0x009b, B:37:0x00a9, B:24:0x006c, B:30:0x007e, B:40:0x00b8, B:44:0x00c1, B:50:0x00d1, B:54:0x00de, B:56:0x00e5, B:57:0x00ec, B:47:0x00c8, B:53:0x00db), top: B:63:0x0000 }] */
    @Override // com.huawei.hms.framework.network.grs.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(java.lang.String r13) {
        /*
            r12 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lf4
            r0.<init>(r13)     // Catch: org.json.JSONException -> Lf4
            java.lang.String r13 = "services"
            org.json.JSONObject r13 = r0.getJSONObject(r13)     // Catch: org.json.JSONException -> Lf4
            java.util.Iterator r0 = r13.keys()     // Catch: org.json.JSONException -> Lf4
        L10:
            boolean r1 = r0.hasNext()     // Catch: org.json.JSONException -> Lf4
            r2 = 0
            if (r1 == 0) goto Lf3
            java.lang.Object r1 = r0.next()     // Catch: org.json.JSONException -> Lf4
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> Lf4
            com.huawei.hms.framework.network.grs.local.model.c r3 = new com.huawei.hms.framework.network.grs.local.model.c     // Catch: org.json.JSONException -> Lf4
            r3.<init>()     // Catch: org.json.JSONException -> Lf4
            r3.b(r1)     // Catch: org.json.JSONException -> Lf4
            java.util.Set<java.lang.String> r4 = r12.f     // Catch: org.json.JSONException -> Lf4
            boolean r4 = r4.contains(r1)     // Catch: org.json.JSONException -> Lf4
            if (r4 != 0) goto L10
            java.util.Set<java.lang.String> r4 = r12.f     // Catch: org.json.JSONException -> Lf4
            r4.add(r1)     // Catch: org.json.JSONException -> Lf4
            boolean r4 = r12.e     // Catch: org.json.JSONException -> Lf4
            if (r4 == 0) goto L10
            org.json.JSONObject r4 = r13.getJSONObject(r1)     // Catch: org.json.JSONException -> Lf4
            java.lang.String r5 = "routeBy"
            java.lang.String r5 = r4.getString(r5)     // Catch: org.json.JSONException -> Lf4
            r3.c(r5)     // Catch: org.json.JSONException -> Lf4
            java.lang.String r5 = "servings"
            org.json.JSONArray r5 = r4.getJSONArray(r5)     // Catch: org.json.JSONException -> Lf4
        L4b:
            int r6 = r5.length()     // Catch: org.json.JSONException -> Lf4
            if (r2 >= r6) goto Lb6
            java.lang.Object r6 = r5.get(r2)     // Catch: org.json.JSONException -> Lf4
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: org.json.JSONException -> Lf4
            com.huawei.hms.framework.network.grs.local.model.d r7 = new com.huawei.hms.framework.network.grs.local.model.d     // Catch: org.json.JSONException -> Lf4
            r7.<init>()     // Catch: org.json.JSONException -> Lf4
            java.lang.String r8 = "no-country"
            java.lang.String r9 = "countryOrAreaGroup"
            boolean r9 = r6.has(r9)     // Catch: org.json.JSONException -> Lf4
            if (r9 == 0) goto L6a
            java.lang.String r8 = "countryOrAreaGroup"
            goto L74
        L6a:
            java.lang.String r9 = "countryGroup"
            boolean r9 = r6.has(r9)     // Catch: org.json.JSONException -> Lf4
            if (r9 == 0) goto L79
            java.lang.String r8 = "countryGroup"
        L74:
            java.lang.String r8 = r6.getString(r8)     // Catch: org.json.JSONException -> Lf4
            goto L81
        L79:
            java.lang.String r9 = "LocalManagerV1"
            java.lang.String r10 = "maybe this service routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r9, r10)     // Catch: org.json.JSONException -> Lf4
        L81:
            r7.a(r8)     // Catch: org.json.JSONException -> Lf4
            java.lang.String r8 = "addresses"
            org.json.JSONObject r6 = r6.getJSONObject(r8)     // Catch: org.json.JSONException -> Lf4
            java.util.HashMap r8 = new java.util.HashMap     // Catch: org.json.JSONException -> Lf4
            r9 = 16
            r8.<init>(r9)     // Catch: org.json.JSONException -> Lf4
            java.util.Iterator r9 = r6.keys()     // Catch: org.json.JSONException -> Lf4
        L95:
            boolean r10 = r9.hasNext()     // Catch: org.json.JSONException -> Lf4
            if (r10 == 0) goto La9
            java.lang.Object r10 = r9.next()     // Catch: org.json.JSONException -> Lf4
            java.lang.String r10 = (java.lang.String) r10     // Catch: org.json.JSONException -> Lf4
            java.lang.String r11 = r6.getString(r10)     // Catch: org.json.JSONException -> Lf4
            r8.put(r10, r11)     // Catch: org.json.JSONException -> Lf4
            goto L95
        La9:
            r7.a(r8)     // Catch: org.json.JSONException -> Lf4
            java.lang.String r6 = r7.b()     // Catch: org.json.JSONException -> Lf4
            r3.a(r6, r7)     // Catch: org.json.JSONException -> Lf4
            int r2 = r2 + 1
            goto L4b
        Lb6:
            java.lang.String r2 = "countryOrAreaGroups"
            boolean r2 = r4.has(r2)     // Catch: org.json.JSONException -> Lf4
            r5 = 0
            if (r2 == 0) goto Lc6
            java.lang.String r2 = "countryOrAreaGroups"
        Lc1:
            org.json.JSONObject r2 = r4.getJSONObject(r2)     // Catch: org.json.JSONException -> Lf4
            goto Ld1
        Lc6:
            java.lang.String r2 = "countryGroups"
            boolean r2 = r4.has(r2)     // Catch: org.json.JSONException -> Lf4
            if (r2 == 0) goto Ld6
            java.lang.String r2 = "countryGroups"
            goto Lc1
        Ld1:
            java.util.List r5 = r12.a(r5, r2)     // Catch: org.json.JSONException -> Lf4
            goto Lde
        Ld6:
            java.lang.String r2 = "LocalManagerV1"
            java.lang.String r4 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.v(r2, r4)     // Catch: org.json.JSONException -> Lf4
        Lde:
            r3.a(r5)     // Catch: org.json.JSONException -> Lf4
            com.huawei.hms.framework.network.grs.local.model.a r2 = r12.a     // Catch: org.json.JSONException -> Lf4
            if (r2 != 0) goto Lec
            com.huawei.hms.framework.network.grs.local.model.a r2 = new com.huawei.hms.framework.network.grs.local.model.a     // Catch: org.json.JSONException -> Lf4
            r2.<init>()     // Catch: org.json.JSONException -> Lf4
            r12.a = r2     // Catch: org.json.JSONException -> Lf4
        Lec:
            com.huawei.hms.framework.network.grs.local.model.a r2 = r12.a     // Catch: org.json.JSONException -> Lf4
            r2.a(r1, r3)     // Catch: org.json.JSONException -> Lf4
            goto L10
        Lf3:
            return r2
        Lf4:
            r13 = move-exception
            java.lang.String r0 = "LocalManagerV1"
            java.lang.String r1 = "parse 1.0 services failed maybe because of json style.please check!"
            com.huawei.hms.framework.common.Logger.w(r0, r1, r13)
            r13 = -1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.b.c.e(java.lang.String):int");
    }
}
