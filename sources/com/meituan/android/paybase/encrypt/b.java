package com.meituan.android.paybase.encrypt;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.android.paybase.utils.y;
import com.meituan.android.payguard.RequestCryptUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.raw.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements Interceptor {
    public static ChangeQuickRedirect a;
    private Context b;
    private InterfaceC0332b c;
    private int d;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.encrypt.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0332b {
        String a();
    }

    public b(Context context, InterfaceC0332b interfaceC0332b) {
        Object[] objArr = {context, interfaceC0332b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f697787c92e6a49c46f59fe547248e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f697787c92e6a49c46f59fe547248e0");
            return;
        }
        this.b = context.getApplicationContext();
        this.c = interfaceC0332b;
        this.d = 1;
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a5c61813cf965b4e8679f46462eded", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a5c61813cf965b4e8679f46462eded");
        }
        aj request = aVar.request();
        String str = "";
        try {
            str = Uri.parse(request.b()).getPath();
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "EncryptInterceptor_intercept", (Map<String, Object>) null);
        }
        a a2 = a(request.i(), str);
        return a(aVar.a(request.a().a(a2.b).a()), a2.c, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a a(ak akVar, String str) throws IOException {
        String[] b;
        String str2;
        a aVar;
        String[] b2;
        Object[] objArr = {akVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a23043ff628bd466e7b57dd85117b18", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a23043ff628bd466e7b57dd85117b18");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (com.meituan.android.paybase.utils.b.a(this.b)) {
                Map<String, String> a2 = com.meituan.android.paybase.retrofit.interceptor.a.a(akVar);
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9718ef8422503670ae931bee7b0a201e", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9718ef8422503670ae931bee7b0a201e");
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : a2.entrySet()) {
                        if (entry != null && entry.getValue() != null && ((String) entry.getValue()).startsWith(" **need*q encrypt*qq")) {
                            arrayList.add(entry.getKey());
                            entry.setValue(((String) entry.getValue()).substring(20));
                        }
                    }
                    String a3 = TextUtils.isEmpty(this.c.a()) ? "uuid" : this.c.a();
                    if (!arrayList.isEmpty()) {
                        String[] strArr = new String[arrayList.size()];
                        for (int i = 0; i < arrayList.size(); i++) {
                            strArr[i] = (String) a2.get(arrayList.get(i));
                        }
                        if (a()) {
                            b2 = RequestCryptUtils.a(a3, String.valueOf(System.currentTimeMillis()), strArr, this.d);
                        } else {
                            b2 = RequestCryptUtils.b(a3, String.valueOf(System.currentTimeMillis()), strArr, this.d);
                        }
                        if (b2 == null) {
                            aVar = new a(com.meituan.android.paybase.retrofit.interceptor.a.a(a2), null);
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                a2.put(arrayList.get(i2), b2[i2]);
                                jSONArray.put(arrayList.get(i2));
                            }
                            a2.put("encrypt_key", b2[b2.length - 2]);
                            a2.put("encrypt_params", jSONArray.toString());
                            str2 = b2[b2.length - 1];
                            aVar = new a(com.meituan.android.paybase.retrofit.interceptor.a.a(a2), str2);
                        }
                    } else {
                        if (a()) {
                            b = RequestCryptUtils.a(a3, String.valueOf(System.currentTimeMillis()), new String[0], this.d);
                        } else {
                            b = RequestCryptUtils.b(a3, String.valueOf(System.currentTimeMillis()), new String[0], this.d);
                        }
                        if (b == null) {
                            com.meituan.android.paybase.common.analyse.cat.a.a("dataEncryptError", "数据加密失败");
                            aVar = new a(com.meituan.android.paybase.retrofit.interceptor.a.a(a2), null);
                        } else {
                            a2.put("encrypt_key", b[b.length - 2]);
                            str2 = b[b.length - 1];
                            aVar = new a(com.meituan.android.paybase.retrofit.interceptor.a.a(a2), str2);
                        }
                    }
                }
                return aVar;
            }
            a aVar2 = new a(akVar, null);
            if (!TextUtils.isEmpty(str)) {
                y.b(str, System.currentTimeMillis() - currentTimeMillis);
            }
            return aVar2;
        } finally {
            if (!TextUtils.isEmpty(str)) {
                y.b(str, System.currentTimeMillis() - currentTimeMillis);
            }
        }
    }

    private com.sankuai.meituan.retrofit2.raw.b a(com.sankuai.meituan.retrofit2.raw.b bVar, String str, String str2) throws IOException {
        Object[] objArr = {bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3f2845953b597119edafeed6a4c2b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3f2845953b597119edafeed6a4c2b1");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    y.c(str2, System.currentTimeMillis() - currentTimeMillis);
                }
                return bVar;
            }
            ap body = bVar.body();
            String string = body.string();
            try {
                JSONObject jSONObject = new JSONObject("" + string);
                if (jSONObject.has("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.has("encrypt_res")) {
                        jSONObject2.put("encrypt_key", str);
                        String jSONObject3 = jSONObject.toString();
                        com.sankuai.meituan.retrofit2.raw.b a2 = new b.a().a(bVar.url()).a(bVar.code()).b(bVar.reason()).a(body.newBuilder().a("application/json;charset=UTF-8").a(jSONObject3.getBytes().length).a(new ByteArrayInputStream(jSONObject3.getBytes())).a()).a();
                        if (!TextUtils.isEmpty(str2)) {
                            y.c(str2, System.currentTimeMillis() - currentTimeMillis);
                        }
                        return a2;
                    }
                }
                com.sankuai.meituan.retrofit2.raw.b a3 = new b.a().a(bVar.url()).a(bVar.code()).b(bVar.reason()).a(body.newBuilder().a("application/json;charset=UTF-8").a(string.getBytes().length).a(new ByteArrayInputStream(string.getBytes())).a()).a();
                if (!TextUtils.isEmpty(str2)) {
                    y.c(str2, System.currentTimeMillis() - currentTimeMillis);
                }
                return a3;
            } catch (JSONException e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "EncryptInterceptor_interceptResponse").a("message", e.getMessage()).b);
                com.sankuai.meituan.retrofit2.raw.b a4 = new b.a().a(bVar.url()).a(bVar.code()).b(bVar.reason()).a(body.newBuilder().a("application/json;charset=UTF-8").a(string.getBytes().length).a(new ByteArrayInputStream(string.getBytes())).a()).a();
                if (!TextUtils.isEmpty(str2)) {
                    y.c(str2, System.currentTimeMillis() - currentTimeMillis);
                }
                return a4;
            }
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str2)) {
                y.c(str2, System.currentTimeMillis() - currentTimeMillis);
            }
            throw th;
        }
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92c9c6d47b999d4d39cc9fbf948ef29e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92c9c6d47b999d4d39cc9fbf948ef29e")).booleanValue();
        }
        String a2 = com.meituan.android.paybase.downgrading.a.a().a("dynamic_layout_no_index");
        if ("b".equals(a2)) {
            v.a("b_0pz4mowu", new a.b().a("dynamic_layout_no_index", a2).b);
            return true;
        } else if ("a".equals(a2)) {
            v.a("b_hznokm4z", new a.b().a("dynamic_layout_no_index", a2).b);
            return false;
        } else {
            v.a("b_qa04j7ps", new a.b().a("dynamic_layout_no_index", a2).b);
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        ak b;
        String c;

        public a(ak akVar, String str) {
            Object[] objArr = {akVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd3de0ed18f6bc564a8e0d8f9dc8b6f2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd3de0ed18f6bc564a8e0d8f9dc8b6f2");
                return;
            }
            this.b = akVar;
            this.c = str;
        }
    }
}
