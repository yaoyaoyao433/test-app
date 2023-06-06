package com.huawei.hms.framework.network.grs.b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.tencent.mapsdk.internal.ch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    protected com.huawei.hms.framework.network.grs.local.model.a a;
    protected List<com.huawei.hms.framework.network.grs.local.model.b> b;
    protected Map<String, String> c = new ConcurrentHashMap(16);
    protected boolean d = false;
    protected boolean e = false;
    protected Set<String> f = new HashSet(16);

    private int a(Context context) {
        int i = -1;
        try {
            String[] list = context.getAssets().list("");
            if (list == null || list.length <= 0) {
                return -1;
            }
            int i2 = -1;
            for (String str : list) {
                try {
                    if (Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str) && g(com.huawei.hms.framework.network.grs.d.c.a(str, context)) == 0) {
                        Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE sucess.");
                        i2 = 0;
                    }
                } catch (IOException unused) {
                    i = i2;
                    Logger.w("AbstractLocalManager", "list assets files fail,please check if according to our standard config json files.");
                    return i;
                }
            }
            return i2;
        } catch (IOException unused2) {
        }
    }

    private int a(String str, Context context) {
        if (f(com.huawei.hms.framework.network.grs.d.c.a(str, context)) == 0) {
            Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success.");
            return 0;
        }
        return -1;
    }

    private Map<String, String> a(List<com.huawei.hms.framework.network.grs.local.model.b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.b());
            }
        }
        return concurrentHashMap;
    }

    private int f(String str) {
        int b;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.e || (b = b(str)) == 0) {
            int a = a(str);
            return a != 0 ? a : e(str);
        }
        return b;
    }

    private int g(String str) {
        List<com.huawei.hms.framework.network.grs.local.model.b> list;
        int c;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.e || !((list = this.b) == null || list.isEmpty()) || (c = c(str)) == 0) ? d(str) : c;
    }

    public abstract int a(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(String str, Context context, boolean z) {
        if (a(str, context) == 0 || !z) {
            a(context);
            return 0;
        }
        return -1;
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.a;
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.a.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        Map<String, String> a = a(context, aVar, grsBaseInfo, str, z);
        if (a == null) {
            Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
            return null;
        }
        return a.get(str2);
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray) {
        String str;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(jSONObject.getString("id"));
                bVar.c(jSONObject.getString("name"));
                bVar.a(jSONObject.getString("description"));
                JSONArray jSONArray2 = null;
                if (jSONObject.has("countriesOrAreas")) {
                    str = "countriesOrAreas";
                } else if (jSONObject.has("countries")) {
                    str = "countries";
                } else {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null || jSONArray2.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        hashSet.add((String) jSONArray2.get(i2));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                jSONArray2 = jSONObject.getJSONArray(str);
                HashSet hashSet2 = new HashSet(16);
                if (jSONArray2 != null) {
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong.", e);
            return new ArrayList();
        }
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.a.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        if (this.d) {
            com.huawei.hms.framework.network.grs.local.model.a aVar2 = this.a;
            if (aVar2 == null) {
                Logger.w("AbstractLocalManager", "application data is null.");
                return null;
            }
            com.huawei.hms.framework.network.grs.local.model.c a = aVar2.a(str);
            if (a == null) {
                Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
                return null;
            }
            String a2 = f.a(context, aVar, a.b(), grsBaseInfo, z);
            if (a2 == null) {
                Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", a.b());
                return null;
            }
            List<com.huawei.hms.framework.network.grs.local.model.b> a3 = a.a();
            com.huawei.hms.framework.network.grs.local.model.d a4 = a.a(((a3 == null || a3.size() == 0) ? this.c : a(a3, grsBaseInfo, a2)).get(a2));
            if (a4 == null) {
                return null;
            }
            return a4.a();
        }
        return null;
    }

    public void a(GrsBaseInfo grsBaseInfo) {
        this.c.put("no_route_country", "no-country");
        List<com.huawei.hms.framework.network.grs.local.model.b> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : this.b) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                this.c.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                this.c.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                this.c.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
        }
        this.b = null;
    }

    public abstract int b(String str);

    public Set<String> b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[LOOP:2: B:24:0x0090->B:26:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(org.json.JSONArray r14) {
        /*
            r13 = this;
            if (r14 == 0) goto Lef
            int r0 = r14.length()
            if (r0 == 0) goto Lef
            r0 = 0
            r1 = 0
        La:
            int r2 = r14.length()
            if (r1 >= r2) goto Lef
            org.json.JSONObject r2 = r14.getJSONObject(r1)
            com.huawei.hms.framework.network.grs.local.model.c r3 = new com.huawei.hms.framework.network.grs.local.model.c
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r4 = r2.getString(r4)
            r3.b(r4)
            java.util.Set<java.lang.String> r5 = r13.f
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Leb
            java.util.Set<java.lang.String> r5 = r13.f
            r5.add(r4)
            boolean r5 = r13.e
            if (r5 == 0) goto Leb
            java.lang.String r5 = "routeBy"
            java.lang.String r5 = r2.getString(r5)
            r3.c(r5)
            java.lang.String r5 = "servings"
            org.json.JSONArray r5 = r2.getJSONArray(r5)
            r6 = 0
        L46:
            int r7 = r5.length()
            if (r6 >= r7) goto Lb1
            java.lang.Object r7 = r5.get(r6)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            com.huawei.hms.framework.network.grs.local.model.d r8 = new com.huawei.hms.framework.network.grs.local.model.d
            r8.<init>()
            java.lang.String r9 = "no-country"
            java.lang.String r10 = "countryOrAreaGroup"
            boolean r10 = r7.has(r10)
            if (r10 == 0) goto L69
            java.lang.String r9 = "countryOrAreaGroup"
        L64:
            java.lang.String r9 = r7.getString(r9)
            goto L7c
        L69:
            java.lang.String r10 = "countryGroup"
            boolean r10 = r7.has(r10)
            if (r10 == 0) goto L74
            java.lang.String r9 = "countryGroup"
            goto L64
        L74:
            java.lang.String r10 = "AbstractLocalManager"
            java.lang.String r11 = "maybe this service routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r10, r11)
        L7c:
            r8.a(r9)
            java.lang.String r9 = "addresses"
            org.json.JSONObject r7 = r7.getJSONObject(r9)
            java.util.HashMap r9 = new java.util.HashMap
            r10 = 16
            r9.<init>(r10)
            java.util.Iterator r10 = r7.keys()
        L90:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La4
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r7.getString(r11)
            r9.put(r11, r12)
            goto L90
        La4:
            r8.a(r9)
            java.lang.String r7 = r8.b()
            r3.a(r7, r8)
            int r6 = r6 + 1
            goto L46
        Lb1:
            r5 = 0
            java.lang.String r6 = "countryOrAreaGroups"
            boolean r6 = r2.has(r6)
            if (r6 == 0) goto Lc5
            java.lang.String r5 = "countryOrAreaGroups"
        Lbc:
            org.json.JSONArray r2 = r2.getJSONArray(r5)
            java.util.List r5 = r13.a(r2)
            goto Ld8
        Lc5:
            java.lang.String r6 = "countryGroups"
            boolean r6 = r2.has(r6)
            if (r6 == 0) goto Ld0
            java.lang.String r5 = "countryGroups"
            goto Lbc
        Ld0:
            java.lang.String r2 = "AbstractLocalManager"
            java.lang.String r6 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.i(r2, r6)
        Ld8:
            r3.a(r5)
            com.huawei.hms.framework.network.grs.local.model.a r2 = r13.a
            if (r2 != 0) goto Le6
            com.huawei.hms.framework.network.grs.local.model.a r2 = new com.huawei.hms.framework.network.grs.local.model.a
            r2.<init>()
            r13.a = r2
        Le6:
            com.huawei.hms.framework.network.grs.local.model.a r2 = r13.a
            r2.a(r4, r3)
        Leb:
            int r1 = r1 + 1
            goto La
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.b.a.b(org.json.JSONArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[Catch: JSONException -> 0x0040, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0040, blocks: (B:3:0x000a, B:5:0x0012, B:12:0x0025, B:18:0x0035, B:9:0x001d, B:15:0x002f), top: B:24:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(java.lang.String r4) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 16
            r0.<init>(r1)
            r3.b = r0
            r0 = -1
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r1.<init>(r4)     // Catch: org.json.JSONException -> L40
            r4 = 0
            java.lang.String r2 = "countryOrAreaGroups"
            boolean r2 = r1.has(r2)     // Catch: org.json.JSONException -> L40
            if (r2 == 0) goto L1b
            java.lang.String r4 = "countryOrAreaGroups"
            goto L25
        L1b:
            java.lang.String r2 = "countryGroups"
            boolean r2 = r1.has(r2)     // Catch: org.json.JSONException -> L40
            if (r2 == 0) goto L2a
            java.lang.String r4 = "countryGroups"
        L25:
            org.json.JSONArray r4 = r1.getJSONArray(r4)     // Catch: org.json.JSONException -> L40
            goto L32
        L2a:
            java.lang.String r1 = "AbstractLocalManager"
            java.lang.String r2 = "maybe local config json is wrong because the default countryOrAreaGroups isn't config."
            com.huawei.hms.framework.common.Logger.e(r1, r2)     // Catch: org.json.JSONException -> L40
        L32:
            if (r4 != 0) goto L35
            return r0
        L35:
            java.util.List<com.huawei.hms.framework.network.grs.local.model.b> r1 = r3.b     // Catch: org.json.JSONException -> L40
            java.util.List r4 = r3.a(r4)     // Catch: org.json.JSONException -> L40
            r1.addAll(r4)     // Catch: org.json.JSONException -> L40
            r4 = 0
            return r4
        L40:
            r4 = move-exception
            java.lang.String r1 = "AbstractLocalManager"
            java.lang.String r2 = "parse countrygroup failed maybe json style is wrong."
            com.huawei.hms.framework.common.Logger.w(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.b.a.c(java.lang.String):int");
    }

    public boolean c() {
        return this.d;
    }

    public int d(String str) {
        try {
            b(new JSONObject(str).getJSONArray(ch.a_));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check!", e);
            return -1;
        }
    }

    public abstract int e(String str);
}
