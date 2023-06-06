package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.c.m;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    private static final String a = "a";
    private GrsBaseInfo b;
    private com.huawei.hms.framework.network.grs.a.a c;
    private m d;
    private com.huawei.hms.framework.network.grs.a.c e;

    /* compiled from: ProGuard */
    /* renamed from: com.huawei.hms.framework.network.grs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0174a implements com.huawei.hms.framework.network.grs.b {
        String a;
        Map<String, String> b;
        IQueryUrlsCallBack c;
        Context d;
        GrsBaseInfo e;
        com.huawei.hms.framework.network.grs.a.a f;

        C0174a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.a.a aVar) {
            this.a = str;
            this.b = map;
            this.c = iQueryUrlsCallBack;
            this.d = context;
            this.e = grsBaseInfo;
            this.f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                this.c.onCallBackSuccess(this.b);
            } else if (this.b != null) {
                this.c.onCallBackFail(-3);
            } else {
                Logger.i(a.a, "access local config for return a domain.");
                this.c.onCallBackSuccess(com.huawei.hms.framework.network.grs.b.b.a(this.d.getPackageName(), this.e).a(this.d, this.f, this.e, this.a, true));
            }
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.c.f fVar) {
            Map<String, String> a = a.a(fVar.i(), this.a);
            if (!a.isEmpty()) {
                this.c.onCallBackSuccess(a);
                return;
            }
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                this.c.onCallBackSuccess(this.b);
            } else if (this.b != null) {
                this.c.onCallBackFail(-5);
            } else {
                Logger.i(a.a, "access local config for return a domain.");
                this.c.onCallBackSuccess(com.huawei.hms.framework.network.grs.b.b.a(this.d.getPackageName(), this.e).a(this.d, this.f, this.e, this.a, true));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class b implements com.huawei.hms.framework.network.grs.b {
        String a;
        String b;
        IQueryUrlCallBack c;
        String d;
        Context e;
        GrsBaseInfo f;
        com.huawei.hms.framework.network.grs.a.a g;

        b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.a.a aVar) {
            this.a = str;
            this.b = str2;
            this.c = iQueryUrlCallBack;
            this.d = str3;
            this.e = context;
            this.f = grsBaseInfo;
            this.g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.d)) {
                this.c.onCallBackSuccess(this.d);
            } else if (!TextUtils.isEmpty(this.d)) {
                this.c.onCallBackFail(-3);
            } else {
                Logger.i(a.a, "access local config for return a domain.");
                this.c.onCallBackSuccess(com.huawei.hms.framework.network.grs.b.b.a(this.e.getPackageName(), this.f).a(this.e, this.g, this.f, this.a, this.b, true));
            }
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.c.f fVar) {
            String a = a.a(fVar.i(), this.a, this.b);
            if (!TextUtils.isEmpty(a)) {
                this.c.onCallBackSuccess(a);
            } else if (!TextUtils.isEmpty(this.d)) {
                this.c.onCallBackSuccess(this.d);
            } else if (!TextUtils.isEmpty(this.d)) {
                this.c.onCallBackFail(-5);
            } else {
                Logger.i(a.a, "access local config for return a domain.");
                this.c.onCallBackSuccess(com.huawei.hms.framework.network.grs.b.b.a(this.e.getPackageName(), this.f).a(this.e, this.g, this.f, this.a, this.b, true));
            }
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.a.a aVar, m mVar, com.huawei.hms.framework.network.grs.a.c cVar) {
        this.b = grsBaseInfo;
        this.c = aVar;
        this.d = mVar;
        this.e = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    private String a(String str, String str2, com.huawei.hms.framework.network.grs.a.b bVar, Context context) {
        String a2 = this.c.a(this.b, str, str2, bVar, context);
        if (TextUtils.isEmpty(a2)) {
            return com.huawei.hms.framework.network.grs.b.b.a(context.getPackageName(), this.b).a(context, this.c, this.b, str, str2, false);
        }
        Logger.i(a, "get url from sp is not empty.");
        com.huawei.hms.framework.network.grs.b.b.a(context, this.b);
        return a2;
    }

    public static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).getJSONObject(str2).getString(str3);
        } catch (JSONException e) {
            Logger.w(a, "Method{getServiceNameUrl} query url from SP occur an JSONException", e);
            return "";
        }
    }

    public static Map<String, Map<String, String>> a(String str) {
        HashMap hashMap = new HashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(a, "isSpExpire jsonValue is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, a(jSONObject.getJSONObject(obj)));
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.w(a, "getServicesUrlsMap occur a JSONException", e);
            return hashMap;
        }
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.a.b bVar, Context context) {
        Map<String, String> a2 = this.c.a(this.b, str, bVar, context);
        if (a2 == null || a2.isEmpty()) {
            return com.huawei.hms.framework.network.grs.b.b.a(context.getPackageName(), this.b).a(context, this.c, this.b, str, false);
        }
        Logger.i(a, "get url from sp is not empty.");
        com.huawei.hms.framework.network.grs.b.b.a(context, this.b);
        return a2;
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.v(a, "isSpExpire jsonValue is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(str2);
            if (jSONObject == null) {
                Logger.v(a, "getServiceNameUrls jsObject null.");
                return hashMap;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.get(obj).toString());
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.w(a, "Method{getServiceNameUrls} query url from SP occur an JSONException", e);
            return hashMap;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.get(obj).toString());
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.w(a, "getServiceUrls occur a JSONException", e);
            return hashMap;
        }
    }

    private void a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        this.d.a(new com.huawei.hms.framework.network.grs.c.b.c(this.b, context), new C0174a(str, map, iQueryUrlsCallBack, context, this.b, this.c), str, this.e);
    }

    public String a(Context context, String str) {
        com.huawei.hms.framework.network.grs.c.f a2 = this.d.a(new com.huawei.hms.framework.network.grs.c.b.c(this.b, context), str, this.e);
        return a2 == null ? "" : a2.i();
    }

    public String a(String str, String str2, Context context) {
        com.huawei.hms.framework.network.grs.a.b bVar = new com.huawei.hms.framework.network.grs.a.b();
        String a2 = a(str, str2, bVar, context);
        if (bVar.a() && !TextUtils.isEmpty(a2)) {
            Logger.v(a, "get unexpired cache localUrl{%s}", a2);
            com.huawei.hms.framework.network.grs.b.b.a(context, this.b);
            return a2;
        }
        String a3 = a(a(context, str), str, str2);
        if (!TextUtils.isEmpty(a3)) {
            Logger.i(a, "get url is from remote server");
            com.huawei.hms.framework.network.grs.b.b.a(context, this.b);
            return a3;
        } else if (TextUtils.isEmpty(a2)) {
            Logger.i(a, "access local config for return a domain.");
            return com.huawei.hms.framework.network.grs.b.b.a(context.getPackageName(), this.b).a(context, this.c, this.b, str, str2, true);
        } else {
            return a2;
        }
    }

    public Map<String, String> a(String str, Context context) {
        com.huawei.hms.framework.network.grs.a.b bVar = new com.huawei.hms.framework.network.grs.a.b();
        Map<String, String> a2 = a(str, bVar, context);
        if (bVar.a() && a2 != null && !a2.isEmpty()) {
            com.huawei.hms.framework.network.grs.b.b.a(context, this.b);
            return a2;
        }
        Map<String, String> a3 = a(a(context, str), str);
        if (!a3.isEmpty()) {
            com.huawei.hms.framework.network.grs.b.b.a(context, this.b);
            return a3;
        } else if (a2 == null || !a2.isEmpty()) {
            return a2;
        } else {
            Logger.i(a, "access local config for return a domain.");
            return com.huawei.hms.framework.network.grs.b.b.a(context.getPackageName(), this.b).a(context, this.c, this.b, str, true);
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        com.huawei.hms.framework.network.grs.a.b bVar = new com.huawei.hms.framework.network.grs.a.b();
        Map<String, String> a2 = a(str, bVar, context);
        if (!bVar.a()) {
            a(str, a2, iQueryUrlsCallBack, context);
        } else if (a2 == null || a2.isEmpty()) {
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            com.huawei.hms.framework.network.grs.b.b.a(context, this.b);
            iQueryUrlsCallBack.onCallBackSuccess(a2);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context) {
        com.huawei.hms.framework.network.grs.a.b bVar = new com.huawei.hms.framework.network.grs.a.b();
        String a2 = a(str, str2, bVar, context);
        if (!bVar.a()) {
            this.d.a(new com.huawei.hms.framework.network.grs.c.b.c(this.b, context), new b(str, str2, iQueryUrlCallBack, a2, context, this.b, this.c), str, this.e);
        } else if (TextUtils.isEmpty(a2)) {
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            com.huawei.hms.framework.network.grs.b.b.a(context, this.b);
            iQueryUrlCallBack.onCallBackSuccess(a2);
        }
    }
}
