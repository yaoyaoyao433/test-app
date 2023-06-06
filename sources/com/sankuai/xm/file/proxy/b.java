package com.sankuai.xm.file.proxy;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends com.sankuai.xm.base.service.a {
    public static ChangeQuickRedirect a = null;
    public static long b = 3600000;
    public static String c = "file_cdn";
    private static b n;
    public com.sankuai.xm.network.setting.e d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean j;
    public volatile String k;
    public long l;
    public HashMap<String, String> m;
    private q o;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "accc7ab212254ebf895ff7b501d25706", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "accc7ab212254ebf895ff7b501d25706");
            return;
        }
        this.d = com.sankuai.xm.network.setting.e.ENV_RELEASE;
        this.e = false;
        this.f = false;
        this.j = false;
        this.k = "";
        this.l = 0L;
        this.m = new HashMap<>();
        this.o = new q();
    }

    public static /* synthetic */ void a(b bVar, String str) {
        com.sankuai.xm.network.setting.e eVar;
        JSONArray optJSONArray;
        int i = 1;
        char c2 = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ab2d0457679e01f427de9dfa0bdbe936", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ab2d0457679e01f427de9dfa0bdbe936");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                com.sankuai.xm.file.util.b.b("FileCdn::dealRequestMatrixConfigSuc result:%s", str);
                HashMap hashMap = new HashMap();
                JSONArray optJSONArray2 = new JSONObject(str).optJSONArray("cdn_config");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    int i2 = 0;
                    while (i2 < optJSONArray2.length()) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject.optString("env");
                        Object[] objArr2 = new Object[i];
                        objArr2[c2] = optString;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "21592c0a365d0e562712b8a1a625257c", 6917529027641081856L)) {
                            eVar = (com.sankuai.xm.network.setting.e) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "21592c0a365d0e562712b8a1a625257c");
                        } else if (TextUtils.equals(optString, "test")) {
                            eVar = com.sankuai.xm.network.setting.e.ENV_TEST;
                        } else if (TextUtils.equals(optString, "staging")) {
                            eVar = com.sankuai.xm.network.setting.e.ENV_STAGING;
                        } else {
                            eVar = com.sankuai.xm.network.setting.e.ENV_RELEASE;
                        }
                        if (eVar == bVar.d && (optJSONArray = jSONObject.optJSONArray("cdnEnabledDomains")) != null && optJSONArray.length() > 0) {
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                                String optString2 = jSONObject2.optString("raw");
                                String optString3 = jSONObject2.optString("cdn");
                                if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                                    hashMap.put(optString2, optString3);
                                }
                            }
                        }
                        i2++;
                        i = 1;
                        c2 = 0;
                    }
                }
                synchronized (bVar) {
                    bVar.m.clear();
                    bVar.m.putAll(hashMap);
                }
            } catch (Exception e) {
                com.sankuai.xm.file.util.b.a(e);
            }
        }
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "b396458a01c4ada422e20d210812aa58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "b396458a01c4ada422e20d210812aa58");
        } else if (jSONObject == null) {
            com.sankuai.xm.file.util.b.d("FileCdn::dealRequestCdnTokenSuc param error", new Object[0]);
        } else {
            try {
                com.sankuai.xm.file.util.b.b("FileCdn::dealRequestCdnTokenSuc result:%s", jSONObject.toString());
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject == null) {
                    return;
                }
                bVar.k = optJSONObject.optString("xmtk");
                bVar.j = true;
            } catch (Exception e) {
                com.sankuai.xm.file.util.b.a(e);
            }
        }
    }

    public static /* synthetic */ void b(b bVar, final Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "7f1746a55f3edfd89a8702d3cdfc4793", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "7f1746a55f3edfd89a8702d3cdfc4793");
        } else if (bVar.e) {
            bVar.o.a(c, false, false, new q.a() { // from class: com.sankuai.xm.file.proxy.b.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.q.a
                public final void a(String str, JSONObject jSONObject, JSONArray jSONArray) {
                    Object[] objArr2 = {str, jSONObject, jSONArray};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d105ae04846f017661918a723e82993f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d105ae04846f017661918a723e82993f");
                    } else {
                        callback.onSuccess(str);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void b(b bVar, JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "5904495df92d57b9b5a09adc5742115b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "5904495df92d57b9b5a09adc5742115b");
            return;
        }
        try {
            com.sankuai.xm.file.util.b.b("FileCdn::dealRequestCdnConfigSuc result:%s", jSONObject.toString());
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("setting")) == null) {
                return;
            }
            bVar.f = optJSONObject.optInt("file_cdn", 0) != 0;
        } catch (Exception e) {
            com.sankuai.xm.file.util.b.a(e);
        }
    }

    public static b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "303b0a51b59bd94ac978c118285824c0", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "303b0a51b59bd94ac978c118285824c0");
        }
        if (n == null) {
            synchronized (b.class) {
                if (n == null) {
                    n = (b) m.a(b.class);
                }
            }
        }
        return n;
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f009b42b677f8cbe46a93fff75d1efe", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f009b42b677f8cbe46a93fff75d1efe")).intValue();
        }
        if (com.sankuai.xm.base.f.m().c() != 1) {
            this.e = false;
        }
        return super.a();
    }

    public final String a(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9374e4215d22b406eb22eadf10cf48d5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9374e4215d22b406eb22eadf10cf48d5");
        }
        if (this.e && this.f && !TextUtils.isEmpty(str)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b35b78d1007a9a9900c5942436969ed9", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b35b78d1007a9a9900c5942436969ed9")).booleanValue();
            } else if (!this.e || !this.f || !this.j || TextUtils.isEmpty(this.k)) {
                z = false;
            }
            if (z) {
                String b2 = com.sankuai.xm.base.util.net.e.b(str);
                synchronized (this) {
                    String str2 = this.m.get(b2);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str.replace(b2, str2);
                    }
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public final boolean b(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26620abda176f69114fe3132746ffe7c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26620abda176f69114fe3132746ffe7c")).booleanValue();
        }
        if (this.e && this.f && !TextUtils.isEmpty(str)) {
            String b2 = com.sankuai.xm.base.util.net.e.b(str);
            synchronized (this) {
                Iterator<Map.Entry<String, String>> it = this.m.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (TextUtils.equals(it.next().getValue(), b2)) {
                        break;
                    }
                }
            }
            return z;
        }
        return false;
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497052f22330b489e3d508a02e757369", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497052f22330b489e3d508a02e757369");
            return;
        }
        final Callback<JSONObject> callback = new Callback<JSONObject>() { // from class: com.sankuai.xm.file.proxy.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                Object[] objArr2 = {jSONObject2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b37477ef5e63ba0ea3efc3c540f38be", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b37477ef5e63ba0ea3efc3c540f38be");
                } else {
                    b.a(b.this, jSONObject2);
                }
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "132568351f682c93b0a6736a32f5fd8a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "132568351f682c93b0a6736a32f5fd8a");
                } else {
                    com.sankuai.xm.file.util.b.d("FileCdn::requestConfig onFailure token code:%d message:%s", Integer.valueOf(i), str);
                }
            }
        };
        final Callback<String> callback2 = new Callback<String>() { // from class: com.sankuai.xm.file.proxy.b.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a02cb98d0b60f18369c983c9f3cb62b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a02cb98d0b60f18369c983c9f3cb62b");
                    return;
                }
                b.a(b.this, str2);
                if (b.this.f) {
                    b.this.a(callback);
                }
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b5d477b1eeb8a70b801fe862159b9ef", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b5d477b1eeb8a70b801fe862159b9ef");
                } else {
                    com.sankuai.xm.file.util.b.d("FileCdn::requestConfig onFailure matrix code:%d message:%s", Integer.valueOf(i), str);
                }
            }
        };
        b(new Callback<JSONObject>() { // from class: com.sankuai.xm.file.proxy.b.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                Object[] objArr2 = {jSONObject2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24ebf8b7f91e20aef34589d282c5f44c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24ebf8b7f91e20aef34589d282c5f44c");
                    return;
                }
                b.b(b.this, jSONObject2);
                if (b.this.f) {
                    b.b(b.this, callback2);
                }
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f0c5fddeb4efd507c6bfab424eadba8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f0c5fddeb4efd507c6bfab424eadba8");
                } else {
                    com.sankuai.xm.file.util.b.d("FileCdn::requestConfig onFailure cdn code:%d message:%s", Integer.valueOf(i), str);
                }
            }
        });
    }

    private void b(final Callback<JSONObject> callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7342e2382fa3c13d423f194df735a2b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7342e2382fa3c13d423f194df735a2b9");
        } else if (this.e) {
            try {
                com.sankuai.xm.network.httpurlconnection.e eVar = new com.sankuai.xm.network.httpurlconnection.e(d());
                Map<String, String> c2 = f.c();
                c2.put("os", "android");
                c2.put("version", f.a());
                eVar.a(f.a(eVar.j(), c2));
                eVar.a(new JSONObject("{}"));
                eVar.a(new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.file.proxy.b.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.network.httpurlconnection.d
                    public final void a(JSONObject jSONObject) throws Exception {
                        Object[] objArr2 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6cabc911d08326d1243ee3359a7b829", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6cabc911d08326d1243ee3359a7b829");
                        } else {
                            callback.onSuccess(jSONObject);
                        }
                    }

                    @Override // com.sankuai.xm.network.httpurlconnection.d
                    public final void a(int i, String str) throws Exception {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ebddaf114f81d522e1bf01056ec6ead", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ebddaf114f81d522e1bf01056ec6ead");
                            return;
                        }
                        com.sankuai.xm.file.util.b.d("FileCdn::requestCdnConfig onFailure cdn code:%d message:%s", Integer.valueOf(i), str);
                        callback.onFailure(i, str);
                    }
                });
                eVar.b(1);
                com.sankuai.xm.network.httpurlconnection.g.a().a(eVar, 0L);
            } catch (Exception e) {
                com.sankuai.xm.file.util.b.a(e);
            }
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ee224cd4a022e1c7cbb3e2a218bd41", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ee224cd4a022e1c7cbb3e2a218bd41");
        }
        return com.sankuai.xm.network.setting.f.a().b().a(false) + "/user_app_setting/api/v1/getUserAppSetting";
    }

    public void a(final Callback<JSONObject> callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a3e6d1987971bb5b6a6b885a537fa92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a3e6d1987971bb5b6a6b885a537fa92");
        } else if (this.e) {
            com.sankuai.xm.network.httpurlconnection.e eVar = new com.sankuai.xm.network.httpurlconnection.e(e());
            eVar.a(f.a(eVar.j(), f.c()));
            HashMap hashMap = new HashMap();
            hashMap.put("region", com.sankuai.xm.base.util.net.d.c());
            eVar.b(hashMap);
            eVar.a(new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.file.proxy.b.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(JSONObject jSONObject) throws Exception {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47c98ea1882bca3fa1912776147b3815", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47c98ea1882bca3fa1912776147b3815");
                    } else {
                        callback.onSuccess(jSONObject);
                    }
                }

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(int i, String str) throws Exception {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95c402c15ae6440d7dc5a6b97fe51e32", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95c402c15ae6440d7dc5a6b97fe51e32");
                        return;
                    }
                    com.sankuai.xm.file.util.b.d("FileCdn::requestCdnToken onFailure cdn code:%d message:%s", Integer.valueOf(i), str);
                    callback.onFailure(i, str);
                }
            });
            com.sankuai.xm.network.httpurlconnection.g.a().a(eVar, 0L);
        }
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd4aa938c318d553d31cdf1f8dd953a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd4aa938c318d553d31cdf1f8dd953a");
        }
        return com.sankuai.xm.network.setting.f.a().b().a(false) + "/pan/base/7/im/chatfile/query_xmtk.json";
    }
}
