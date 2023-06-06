package com.meituan.android.mrn.network;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.utils.LocalIdUtils;
import com.google.gson.JsonElement;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.android.mrn.network.i;
import com.meituan.android.mrn.utils.ag;
import com.meituan.android.mrn.utils.w;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.n;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.q;
import com.tencent.open.SocialConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static final Executor c;
    private Context b;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.meituan.android.mrn.network.h.1
            public static ChangeQuickRedirect a;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                Object[] objArr = {runnable};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f771cdc390224ec439055fc93d279dc8", RobustBitConfig.DEFAULT_VALUE) ? (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f771cdc390224ec439055fc93d279dc8") : new Thread(new Runnable() { // from class: com.meituan.android.mrn.network.h.1.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb3ed59efadaf4c735a1961d10ada155", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb3ed59efadaf4c735a1961d10ada155");
                            return;
                        }
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                });
            }
        };
        Object[] objArr = {"MRN_REQUEST", threadFactory};
        ChangeQuickRedirect changeQuickRedirect = com.sankuai.android.jarvis.c.a;
        c = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa7caa0ea48eb482523a8da0317417c2", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa7caa0ea48eb482523a8da0317417c2") : com.sankuai.android.jarvis.f.a().b("MRN_REQUEST", threadFactory, (n) null);
    }

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc07193158356214475ac9808e4f3c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc07193158356214475ac9808e4f3c7");
        } else {
            this.b = context;
        }
    }

    private String b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eefc285b8a16015f874a28c5b876d5f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eefc285b8a16015f874a28c5b876d5f8");
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("options");
        if (optJSONObject != null && optJSONObject.has("mrnChannel")) {
            return optJSONObject.optString("mrnChannel");
        }
        return jSONObject.optString("mrnChannel");
    }

    public static List<String> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bca963c22791dfadad1a33ecea9ffa9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bca963c22791dfadad1a33ecea9ffa9a");
        }
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject = jSONObject.optJSONObject("options");
        if (optJSONObject != null && optJSONObject.has("interceptors")) {
            JSONArray optJSONArray = optJSONObject.optJSONArray("interceptors");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString != null) {
                        arrayList.add(optString);
                    }
                }
            }
        } else if (optJSONObject != null && optJSONObject.has("mrnChannel")) {
            arrayList.add(optJSONObject.optString("mrnChannel"));
        } else if (jSONObject.has("mrnChannel")) {
            arrayList.add(jSONObject.optString("mrnChannel"));
        }
        return arrayList;
    }

    public final void a(JSONObject jSONObject, @NonNull com.meituan.android.mrn.module.utils.c cVar) {
        Object[] objArr = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f3ff9daf46479569a2f2cd6b986aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f3ff9daf46479569a2f2cd6b986aa4");
            return;
        }
        List<i> a2 = e.b.a(a(jSONObject));
        JSONObject optJSONObject = jSONObject.optJSONObject("originalParams");
        jSONObject.remove("originalParams");
        a2.addAll(e.b.a());
        if (a2.size() > 0) {
            a2.add(new i() { // from class: com.meituan.android.mrn.network.h.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.network.i
                public final void a(i.a aVar, com.meituan.android.mrn.module.utils.c cVar2) {
                    Object[] objArr2 = {aVar, cVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2108e7659dc9aca9a1919f24b5e8078", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2108e7659dc9aca9a1919f24b5e8078");
                    } else {
                        h.this.b(aVar.a(), cVar2);
                    }
                }
            });
            try {
                new j(SocialConstants.TYPE_REQUEST, a2, 0, jSONObject, optJSONObject).a(jSONObject, cVar);
                return;
            } catch (Throwable th) {
                cVar.a("E_MRN_REQUEST", th, d.a((int) TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBSUCCESS, th.getMessage()));
                return;
            }
        }
        b(jSONObject, cVar);
    }

    public final void b(JSONObject jSONObject, @NonNull com.meituan.android.mrn.module.utils.c cVar) {
        Object[] objArr = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa34a4cf59f0c9dd39590541a05f954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa34a4cf59f0c9dd39590541a05f954");
        } else if (jSONObject == null) {
            cVar.a("E_MRN_REQUEST", new Throwable("request param is null"), d.a((int) TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBSUCCESS, "request param is null"));
        } else {
            String b = b(jSONObject);
            String optString = jSONObject.has("url") ? jSONObject.optString("url") : "";
            String optString2 = jSONObject.has("method") ? jSONObject.optString("method") : "";
            String optString3 = jSONObject.has("baseURL") ? jSONObject.optString("baseURL") : "";
            int optInt = jSONObject.has("timeout") ? jSONObject.optInt("timeout") : -1;
            JSONObject optJSONObject = jSONObject.optJSONObject("headers");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
            JSONObject a2 = a(a(optJSONObject, jSONObject.optJSONObject("options"), optInt), jSONObject);
            String optString4 = jSONObject.has("contentType") ? jSONObject.optString("contentType") : "";
            if (TextUtils.equals(optString2, "POST_JSON")) {
                a(b, optString3, optString, a2, optJSONObject2, optJSONObject3, cVar, "POST_JSON");
            } else if (TextUtils.equals(optString2, "POST")) {
                if ("form".equalsIgnoreCase(optString4)) {
                    a(b, optString3, optString, a2, optJSONObject2, optJSONObject3, cVar, "POST_FORM");
                } else {
                    a(b, optString3, optString, a2, optJSONObject2, optJSONObject3, cVar, "POST_JSON");
                }
            } else if (TextUtils.equals(optString2, "DELETE")) {
                a(b, optString3, optString, a2, optJSONObject2, optJSONObject3, cVar, "DELETE");
            } else if (TextUtils.equals(optString2, OneIdNetworkTool.PUT)) {
                a(b, optString3, optString, a2, optJSONObject2, optJSONObject3, cVar, OneIdNetworkTool.PUT);
            } else {
                a(b, optString3, optString, a2, optJSONObject2, null, cVar, "GET");
            }
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e133deaf6c4e95f4db1ebc2d99edb991", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e133deaf6c4e95f4db1ebc2d99edb991");
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Cat_Extra", "");
        if (!"".equals(optString) && !optString.endsWith(";")) {
            optString = optString + ";";
        }
        try {
            String optString2 = jSONObject2.optString("rn_bundle_name");
            String optString3 = jSONObject2.optString("rn_bundle_version");
            String optString4 = jSONObject2.optString("rn_bundle_component_name");
            jSONObject.put("Cat_Extra", optString + String.format("MRNBundleName=%s;MRNBundleVersion=%s;MRNComponentName=%s", ag.a(optString2), ag.a(optString3), ag.a(optString4)));
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("[MRNRequestModuleImp@addExtraHeaderParams]", th);
        }
        return jSONObject;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        Object[] objArr = {jSONObject, jSONObject2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149aad00b9871a52b0b06c1edd425870", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149aad00b9871a52b0b06c1edd425870");
        }
        if (jSONObject2 != null) {
            try {
                String optString = jSONObject2.optString("catCommand");
                if (!TextUtils.isEmpty(optString)) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("catCmd", optString);
                }
            } catch (Throwable th) {
                com.meituan.android.mrn.utils.c.a("[MRNRequestModuleImp@convertParams]", th);
            }
        }
        if (i > 0) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("retrofit-mt-request-timeout", i * 1000);
        }
        return jSONObject;
    }

    private void a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, com.meituan.android.mrn.module.utils.c cVar, String str4) {
        Object[] objArr = {str, str2, str3, jSONObject, jSONObject2, jSONObject3, cVar, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab7c255f0110b5910cf1380ba96e9b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab7c255f0110b5910cf1380ba96e9b3");
            return;
        }
        String optString = (jSONObject == null || !jSONObject.has("returnFormat")) ? "" : jSONObject.optString("returnFormat");
        try {
            a aVar = new a(this.b, str, str2, str3, com.meituan.android.mrn.utils.g.b(jSONObject2), str4, cVar);
            aVar.b = c(jSONObject);
            aVar.d = optString;
            aVar.c = com.meituan.android.mrn.utils.g.b(jSONObject3);
            com.sankuai.waimai.launcher.util.aop.b.a(aVar, c, new Void[0]);
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("[MRNRequestModuleImp@request]", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a extends AsyncTask<Void, Void, Void> {
        public static ChangeQuickRedirect a;
        Map<String, String> b;
        Map<String, Object> c;
        String d;
        private Context e;
        private com.meituan.android.mrn.module.utils.c f;
        private String g;
        private String h;
        private String i;
        private Map<String, Object> j;
        private String k;

        public a(Context context, String str, @Nullable String str2, @Nullable String str3, Map<String, Object> map, String str4, @Nullable com.meituan.android.mrn.module.utils.c cVar) {
            Object[] objArr = {context, str, str2, str3, map, str4, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f675b54f9ae5855a86746e8d066632", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f675b54f9ae5855a86746e8d066632");
                return;
            }
            this.e = context.getApplicationContext();
            this.f = cVar;
            this.g = str;
            this.h = str2;
            this.i = str3;
            this.j = map;
            this.k = str4;
        }

        private JSONObject a(List<q> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3a3d8123cd7772e0d18f3f8d5b2aeb", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3a3d8123cd7772e0d18f3f8d5b2aeb");
            }
            JSONObject jSONObject = new JSONObject();
            if (!CollectionUtils.isEmpty(list)) {
                for (q qVar : list) {
                    try {
                        jSONObject.put(qVar.b, qVar.c);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            return jSONObject;
        }

        private List<ae.b> a(Map<String, Object> map) throws URISyntaxException {
            ak a2;
            File file;
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74aff18ffd84992792cba867da21345b", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74aff18ffd84992792cba867da21345b");
            }
            ArrayList arrayList = new ArrayList();
            for (Map map2 : (List) map.get("parts")) {
                String str = (String) map2.get("fieldName");
                String str2 = (String) map2.get("mimeType");
                String str3 = (String) map2.get(QuickReportConstants.CONFIG_FILE_NAME);
                if (map2.get(Constants.TRAFFIC_URI) != null) {
                    String str4 = (String) map2.get(Constants.TRAFFIC_URI);
                    if (LocalIdUtils.isValid(str4)) {
                        String str5 = "";
                        try {
                            Uri parse = Uri.parse(str4);
                            if (parse != null) {
                                str5 = parse.getQueryParameter("sceneToken");
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        file = LocalIdUtils.getFile(str4, str5);
                    } else if (Uri.parse(str4).getScheme() == null) {
                        file = new File(str4);
                    } else {
                        file = new File(new URI(str4));
                    }
                    if (file == null) {
                        throw new IllegalArgumentException("Illegal uri string");
                    }
                    a2 = al.a(file, str2);
                } else if (map2.get("value") != null) {
                    a2 = al.a(((String) map2.get("value")).getBytes(), str2);
                } else {
                    throw new IllegalArgumentException("Unrecognized FormData part.");
                }
                arrayList.add(ae.b.a(str, str3, a2));
            }
            return arrayList;
        }

        private Response<JsonElement> a(b bVar, Map<String, String> map, String str, Map<String, Object> map2, Map<String, Object> map3) throws IOException, URISyntaxException {
            Map.Entry<String, String> entry;
            Object[] objArr = {bVar, map, str, map2, map3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90201df5d9f7db64c2b09e274dfeee51", RobustBitConfig.DEFAULT_VALUE)) {
                return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90201df5d9f7db64c2b09e274dfeee51");
            }
            Object[] objArr2 = {map, "Content-Type"};
            ChangeQuickRedirect changeQuickRedirect2 = w.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c90759e543fb5fd96188e9b13994fc47", RobustBitConfig.DEFAULT_VALUE)) {
                entry = (Map.Entry) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c90759e543fb5fd96188e9b13994fc47");
            } else {
                w.a<String> aVar = new w.a<String>() { // from class: com.meituan.android.mrn.utils.w.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.mrn.utils.w.a
                    public final /* synthetic */ boolean a(String str2, String str3) {
                        String str4 = str2;
                        String str5 = str3;
                        Object[] objArr3 = {str4, str5};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aab6fd22feba56de175881841175786c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aab6fd22feba56de175881841175786c")).booleanValue() : str4 != null && str4.equalsIgnoreCase(str5);
                    }
                };
                Object[] objArr3 = {map, "Content-Type", aVar};
                ChangeQuickRedirect changeQuickRedirect3 = w.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1c123d1b016c22b2b378563beda23068", RobustBitConfig.DEFAULT_VALUE)) {
                    entry = (Map.Entry) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1c123d1b016c22b2b378563beda23068");
                } else {
                    if (map != null) {
                        for (Map.Entry<String, String> entry2 : map.entrySet()) {
                            if (entry2 != null && aVar.a("Content-Type", entry2.getKey())) {
                                entry = entry2;
                                break;
                            }
                        }
                    }
                    entry = null;
                }
            }
            String value = entry != null ? entry.getValue() : null;
            if (value != null) {
                String lowerCase = value.toLowerCase();
                if (lowerCase.contains("multipart/form-data")) {
                    map.remove(entry.getKey());
                    return bVar.postMultiPartRequest(map, str, map2, a(map3)).a();
                } else if (lowerCase.contains(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM)) {
                    return bVar.postFormRequest(map, str, map2, map3).a();
                } else {
                    return bVar.postJsonRequest(map, str, map2, map3).a();
                }
            }
            return bVar.postJsonRequest(map, str, map2, map3).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x017b A[Catch: Throwable -> 0x01a1, TryCatch #0 {Throwable -> 0x01a1, blocks: (B:13:0x0047, B:15:0x0053, B:17:0x005d, B:36:0x00df, B:38:0x00e3, B:40:0x00ed, B:42:0x00f3, B:46:0x011c, B:48:0x014a, B:49:0x014e, B:51:0x0154, B:45:0x0113, B:53:0x015a, B:56:0x0163, B:58:0x0169, B:62:0x017d, B:64:0x0193, B:65:0x0197, B:67:0x019d, B:61:0x017b, B:19:0x006f, B:21:0x0079, B:23:0x008c, B:25:0x0096, B:27:0x00a6, B:29:0x00b0, B:31:0x00c1, B:33:0x00cb), top: B:77:0x0047 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0193 A[Catch: Throwable -> 0x01a1, TryCatch #0 {Throwable -> 0x01a1, blocks: (B:13:0x0047, B:15:0x0053, B:17:0x005d, B:36:0x00df, B:38:0x00e3, B:40:0x00ed, B:42:0x00f3, B:46:0x011c, B:48:0x014a, B:49:0x014e, B:51:0x0154, B:45:0x0113, B:53:0x015a, B:56:0x0163, B:58:0x0169, B:62:0x017d, B:64:0x0193, B:65:0x0197, B:67:0x019d, B:61:0x017b, B:19:0x006f, B:21:0x0079, B:23:0x008c, B:25:0x0096, B:27:0x00a6, B:29:0x00b0, B:31:0x00c1, B:33:0x00cb), top: B:77:0x0047 }] */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Void... r12) {
            /*
                Method dump skipped, instructions count: 454
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.network.h.a.doInBackground(java.lang.Void[]):java.lang.Void");
        }
    }

    private static Map<String, String> c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21b36b80ee30df1baa99de4cf8c66d7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21b36b80ee30df1baa99de4cf8c66d7a");
        }
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        if (keys.hasNext()) {
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        }
        return null;
    }
}
