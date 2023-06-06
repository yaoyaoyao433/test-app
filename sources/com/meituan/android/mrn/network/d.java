package com.meituan.android.mrn.network;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.archive.DPObject;
import com.dianping.dataservice.mapi.b;
import com.dianping.nvnetwork.Request;
import com.dianping.shield.AgentConfigParser;
import com.meituan.android.mrn.config.w;
import com.meituan.android.mrn.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect a = null;
    private static final String b = "d";
    private com.dianping.dataservice.mapi.g c;

    public static /* synthetic */ String a(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eaaf6c0918e4455a4199def6a19d84c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eaaf6c0918e4455a4199def6a19d84c0");
        }
        if (TextUtils.isEmpty(str)) {
            if (strArr == null || strArr.length <= 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
            }
            return sb.toString();
        }
        return str;
    }

    public static /* synthetic */ String b(d dVar, com.dianping.dataservice.mapi.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "bccc34c65ad3604ef3935f590a438cbd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "bccc34c65ad3604ef3935f590a438cbd") : (fVar == null || fVar.c() == null) ? "" : String.valueOf(fVar.c().a());
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7290246a6e9e3d71699430287ade12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7290246a6e9e3d71699430287ade12");
        } else {
            this.c = w.a(context);
        }
    }

    public final void a(JSONObject jSONObject, com.meituan.android.mrn.module.utils.c cVar) {
        Object[] objArr = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4bf0863b2c5c994fc20910424aa8f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4bf0863b2c5c994fc20910424aa8f40");
            return;
        }
        List<i> a2 = e.b.a(h.a(jSONObject));
        a2.addAll(e.b.a());
        if (a2.size() > 0) {
            a2.add(new i() { // from class: com.meituan.android.mrn.network.d.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.network.i
                public final void a(i.a aVar, com.meituan.android.mrn.module.utils.c cVar2) {
                    Object[] objArr2 = {aVar, cVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ab92e54da993a721ac4fcbdae836911", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ab92e54da993a721ac4fcbdae836911");
                    } else {
                        d.this.b(aVar.a(), cVar2);
                    }
                }
            });
            try {
                new j("mapi", a2, 0, jSONObject, jSONObject).a(jSONObject, cVar);
                return;
            } catch (Throwable th) {
                cVar.a("E_MRN_MAPI_REQUEST", th, a(th.getMessage()));
                return;
            }
        }
        b(jSONObject, cVar);
    }

    public final void b(JSONObject jSONObject, com.meituan.android.mrn.module.utils.c cVar) {
        Object[] objArr = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab641eab4d71117619dcae6a6b843b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab641eab4d71117619dcae6a6b843b3c");
        } else if (cVar == null) {
        } else {
            if (this.c == null) {
                cVar.a("E_MRN_MAPI_REQUEST", new Throwable("mApiService should not be null"), a("mApiService should not be null"));
                return;
            }
            String optString = jSONObject.optString("bin");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (!TextUtils.isEmpty(optString)) {
                a(optString, optJSONObject, cVar);
            } else {
                c(jSONObject, cVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb A[Catch: Throwable -> 0x0114, TryCatch #0 {Throwable -> 0x0114, blocks: (B:6:0x0028, B:8:0x003e, B:25:0x00c0, B:27:0x00de, B:29:0x00e4, B:31:0x00eb, B:33:0x00f7, B:34:0x0102, B:35:0x0105, B:10:0x0047, B:13:0x004e, B:15:0x005d, B:17:0x0065, B:19:0x0085, B:21:0x00b0, B:23:0x00b6, B:20:0x0091, B:24:0x00bb), top: B:40:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r21, org.json.JSONObject r22, @android.support.annotation.NonNull final com.meituan.android.mrn.module.utils.c r23) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.network.d.a(java.lang.String, org.json.JSONObject, com.meituan.android.mrn.module.utils.c):void");
    }

    private void c(JSONObject jSONObject, @NonNull final com.meituan.android.mrn.module.utils.c cVar) {
        Object[] objArr = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabeb72ae8b3ccb040e1d30e90aead0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabeb72ae8b3ccb040e1d30e90aead0d");
            return;
        }
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("method", "GET");
        boolean z = !jSONObject.optBoolean("signature") || jSONObject.optBoolean("signature");
        boolean z2 = jSONObject.optBoolean("fabricate") && jSONObject.optBoolean("fabricate");
        boolean optBoolean = jSONObject.optBoolean("failOver") ? jSONObject.optBoolean("failOver") : "GET".equals(optString2);
        Map<String, Object> b2 = com.meituan.android.mrn.utils.g.b(jSONObject.optJSONObject("params"));
        Map<String, Object> b3 = com.meituan.android.mrn.utils.g.b(jSONObject.optJSONObject("headers"));
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            cVar.a("E_MRN_MAPI_REQUEST", new Throwable("url or method should not be empty"), a("url or method should not be empty"));
            return;
        }
        Uri.Builder buildUpon = Uri.parse(optString).buildUpon();
        com.dianping.dataservice.mapi.b bVar = null;
        if ("GET".equals(optString2)) {
            int optInt = jSONObject.optInt("cacheType", 0);
            if (b2 != null && b2.size() > 0) {
                for (Map.Entry<String, Object> entry : b2.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            bVar = (com.dianping.dataservice.mapi.b) com.dianping.dataservice.mapi.b.a(buildUpon.toString(), optInt == 0 ? com.dianping.dataservice.mapi.c.DISABLED : com.dianping.dataservice.mapi.c.NORMAL);
            ((com.dianping.dataservice.mapi.a) bVar).f = buildUpon.toString();
            bVar.i = optBoolean;
        } else if ("POST".equals(optString2)) {
            ArrayList arrayList = new ArrayList();
            if (b2 != null && b2.size() > 0) {
                for (Map.Entry<String, Object> entry2 : b2.entrySet()) {
                    arrayList.add(entry2.getKey());
                    arrayList.add(String.valueOf(entry2.getValue()));
                }
            }
            bVar = (com.dianping.dataservice.mapi.b) com.dianping.dataservice.mapi.b.a(buildUpon.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
            bVar.h = optBoolean;
        }
        if (bVar == null) {
            cVar.a("E_MRN_MAPI_REQUEST", new Throwable("数据获取失败"), a("数据获取失败"));
            return;
        }
        if (z) {
            bVar.j = new b.a() { // from class: com.meituan.android.mrn.network.d.3
                public static ChangeQuickRedirect a;

                @Override // com.dianping.dataservice.mapi.b.a
                public final Request a(Request request) {
                    Object[] objArr2 = {request};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8ef26a50132ee6256d1fc04e5ba4bda", RobustBitConfig.DEFAULT_VALUE) ? (Request) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8ef26a50132ee6256d1fc04e5ba4bda") : com.dianping.apimodel.a.a(request);
                }
            };
        }
        if (z2) {
            bVar.a(com.dianping.apimodel.a.a());
        }
        if (b3 != null && b3.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, Object> entry3 : b3.entrySet()) {
                arrayList2.add(new com.dianping.apache.http.message.a(entry3.getKey(), String.valueOf(entry3.getValue())));
            }
            bVar.a(arrayList2);
        }
        Object[] objArr2 = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc8e8fe3b9849309f3ab2313185d0baf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc8e8fe3b9849309f3ab2313185d0baf");
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new com.dianping.apache.http.message.a(AgentConfigParser.PICASSO_PREFIX, "no-js"));
        bVar.a(arrayList3);
        this.c.exec(bVar, new com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, com.dianping.dataservice.mapi.f>() { // from class: com.meituan.android.mrn.network.d.4
            public static ChangeQuickRedirect a;

            @Override // com.dianping.dataservice.d
            public final /* synthetic */ void onRequestFailed(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.mapi.f fVar) {
                com.dianping.dataservice.mapi.f fVar2 = fVar;
                Object[] objArr3 = {eVar, fVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4061b254b3448992cfd0846e778fe2f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4061b254b3448992cfd0846e778fe2f2");
                } else {
                    cVar.a("E_MRN_MAPI_REQUEST", new Throwable("mapi request failed"), d.this.a(fVar2));
                }
            }

            @Override // com.dianping.dataservice.d
            public final /* synthetic */ void onRequestFinish(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.mapi.f fVar) {
                com.dianping.dataservice.mapi.f fVar2 = fVar;
                Object[] objArr3 = {eVar, fVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4c711beac5461ac5c95ade7b8666d330", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4c711beac5461ac5c95ade7b8666d330");
                } else if (fVar2 == null || fVar2.a() == null || !(fVar2.a() instanceof DPObject)) {
                    cVar.a("E_MRN_MAPI_REQUEST", new Throwable("mapi resp error"), d.this.a(fVar2));
                } else {
                    DPObject dPObject = (DPObject) fVar2.a();
                    String e = dPObject.e("data");
                    Object[] objArr4 = {"fuck64kdatalist"};
                    ChangeQuickRedirect changeQuickRedirect4 = DPObject.a;
                    String a2 = d.a(e, PatchProxy.isSupport(objArr4, dPObject, changeQuickRedirect4, false, "6e50aadc2795004c9214752f263841b4", 6917529027641081856L) ? (String[]) PatchProxy.accessDispatch(objArr4, dPObject, changeQuickRedirect4, false, "6e50aadc2795004c9214752f263841b4") : dPObject.g(DPObject.a("fuck64kdatalist")));
                    try {
                        if (TextUtils.isEmpty(a2)) {
                            a2 = dPObject.e("datalist");
                        }
                        if (TextUtils.isEmpty(a2)) {
                            cVar.a(d.b(d.this, fVar2), new Throwable("mapi data is empty"), d.this.a(fVar2));
                            return;
                        }
                        Object nextValue = new JSONTokener(a2).nextValue();
                        if (nextValue instanceof String) {
                            cVar.a(com.meituan.android.mrn.module.utils.a.a(nextValue));
                        } else if (nextValue instanceof JSONObject) {
                            cVar.a(com.meituan.android.mrn.module.utils.a.a(new JSONObject(a2)));
                        } else if (nextValue instanceof JSONArray) {
                            cVar.a(com.meituan.android.mrn.module.utils.a.a(new JSONArray(a2)));
                        } else {
                            cVar.a(com.meituan.android.mrn.module.utils.a.a(new JSONObject()));
                        }
                    } catch (Throwable th) {
                        cVar.a(d.b(d.this, fVar2), th, d.this.a(fVar2));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(com.dianping.dataservice.mapi.f fVar) {
        int a2;
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33cf90ae7e8e89da0c11f818e3b6839c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33cf90ae7e8e89da0c11f818e3b6839c");
        }
        String str = "mapi request failed,response message is empty";
        String str2 = "mapi request failed,response message is empty";
        if (fVar != null && fVar.c() != null) {
            str = fVar.c().toString();
            str2 = fVar.c().b();
        }
        JSONObject jSONObject = new JSONObject();
        if (fVar != null) {
            try {
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (fVar.c() != null) {
                a2 = fVar.c().a();
                jSONObject.put("httpStatusCode", a2);
                jSONObject.put("httpStatusMessage", str);
                jSONObject.put("mapiErrorContent", str2);
                return jSONObject;
            }
        }
        a2 = TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBSUCCESS;
        jSONObject.put("httpStatusCode", a2);
        jSONObject.put("httpStatusMessage", str);
        jSONObject.put("mapiErrorContent", str2);
        return jSONObject;
    }

    private JSONObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e2c10d17b71ac825343a734e707f79", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e2c10d17b71ac825343a734e707f79") : a((int) TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBSUCCESS, str);
    }

    public static JSONObject a(int i, String str) {
        Object[] objArr = {Integer.valueOf((int) TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBSUCCESS), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5d218c5bcbf9ba05e00239c4e686643", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5d218c5bcbf9ba05e00239c4e686643");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("httpStatusCode", TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBSUCCESS);
            if (TextUtils.isEmpty(str)) {
                str = "request fail unknown error";
            }
            jSONObject.put("httpStatusMessage", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
