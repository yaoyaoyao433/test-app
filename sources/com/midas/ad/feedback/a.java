package com.midas.ad.feedback;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.midas.ad.network.e;
import com.tencent.open.SocialConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import rx.d;
import rx.functions.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    protected Context e;
    com.midas.ad.network.a g;
    protected Map<String, String> h;
    private Handler j;
    private Runnable k;
    protected String a = "https://m.api.dianping.com";
    protected String b = "/mlog/applog.bin?";
    protected String c = "/mlog/zlog.bin?";
    protected String d = "data=";
    private Map<C0531a, Boolean> i = new ConcurrentHashMap();
    Map<b, List<String>> f = new ConcurrentHashMap();

    public a(@NonNull Context context, Map<String, String> map) {
        try {
            this.e = context.getApplicationContext();
            this.h = null;
            this.j = new Handler();
            this.k = new Runnable() { // from class: com.midas.ad.feedback.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f != null) {
                        for (Map.Entry<b, List<String>> entry : a.this.f.entrySet()) {
                            a.a(a.this, entry.getValue(), entry.getKey().a);
                        }
                        a.this.f.clear();
                    }
                }
            };
        } catch (Exception unused) {
        }
    }

    private boolean a(String str, int i, Boolean bool) {
        if (this.j == null || this.k == null) {
            return false;
        }
        try {
            b bVar = new b(i);
            if (!this.f.containsKey(bVar)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                this.f.put(bVar, arrayList);
            } else {
                List<String> list = this.f.get(bVar);
                list.add(str);
                this.f.put(bVar, list);
            }
            this.j.removeCallbacks(this.k);
            this.j.postDelayed(this.k, 500L);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final void a(String str, int i, List<String> list, Map<String, String> map) {
        try {
            if (TextUtils.isEmpty(str) || i == 0 || !a(str, Integer.valueOf(i))) {
                return;
            }
            if (map != null && map.size() > 0) {
                String a = a(map);
                if (!TextUtils.isEmpty(a)) {
                    str = str + a;
                }
            }
            a(str, i, (Boolean) null);
            a(list);
        } catch (Exception e) {
            Log.e("MidasReport", e.getMessage(), e);
        }
    }

    private void a(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        a(1, jSONArray.getString(i));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    a(1, str);
                }
            }
        }
    }

    private void a(int i, String str, String str2, String str3) {
        com.midas.ad.network.model.b bVar = new com.midas.ad.network.model.b();
        bVar.a = str;
        bVar.b = str2;
        bVar.a("POST");
        if (TextUtils.isEmpty(bVar.b)) {
            return;
        }
        a(0, bVar, str3);
    }

    private void a(int i, String str) {
        com.midas.ad.network.model.b bVar = new com.midas.ad.network.model.b();
        bVar.a = str;
        bVar.a("GET");
        a(1, bVar);
    }

    protected void a(final int i, final com.midas.ad.network.b bVar, final String str) {
        com.dianping.networklog.c.a("{\"report_start_url\":\"" + bVar.a() + "\",\"report_start_content\":\"" + bVar.c() + "\"}", 27);
        d.a(new j<com.midas.ad.network.model.c>() { // from class: com.midas.ad.feedback.a.3
            @Override // rx.e
            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                com.midas.ad.network.model.c cVar = (com.midas.ad.network.model.c) obj;
            }

            @Override // rx.e
            public final void onCompleted() {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.a());
                sb.append("completed");
                com.dianping.networklog.c.a("{\"report_success_url\":\"" + bVar.a() + "\",\"report_success_content\":\"" + bVar.c() + "\"}", 27);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.a());
                sb.append("error");
                com.dianping.networklog.c.a("{\"report_error_url\":\"" + bVar.a() + "\",\"report_error_content\":\"" + bVar.c() + "\"}", 27);
            }
        }, d.a((d.a) new d.a<com.midas.ad.network.model.c>() { // from class: com.midas.ad.feedback.a.2
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                com.midas.ad.network.model.c a;
                j jVar = (j) obj;
                if (i == 1) {
                    e.a();
                    a = e.b().a(bVar, str);
                } else {
                    e.a();
                    a = e.a(a.this.g).a(bVar, str);
                }
                if (a == null) {
                    jVar.onError(new Exception("request failed"));
                } else if (a.a() != null) {
                    jVar.onError(new Exception(a.a().toString()));
                } else {
                    jVar.onNext(a);
                    jVar.onCompleted();
                }
            }
        }).g(new c(3, 1)).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c implements g<d<? extends Throwable>, d<?>> {
        final int a = 3;
        final int b = 1;
        int c;

        @Override // rx.functions.g
        public final /* synthetic */ d<?> call(d<? extends Throwable> dVar) {
            return dVar.c(new g<Throwable, d<?>>() { // from class: com.midas.ad.feedback.a.c.1
                @Override // rx.functions.g
                public final /* synthetic */ d<?> call(Throwable th) {
                    Throwable th2 = th;
                    c cVar = c.this;
                    int i = cVar.c + 1;
                    cVar.c = i;
                    if (i < c.this.a) {
                        return d.b(c.this.b, TimeUnit.MILLISECONDS);
                    }
                    return d.a(th2);
                }
            });
        }

        public c(int i, int i2) {
        }
    }

    private Map<String, String> a(String str, Map<String, String> map) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            if (!decode.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                decode = this.a + this.b + decode;
            }
            int indexOf = decode.indexOf(CommonConstant.Symbol.QUESTION_MARK);
            boolean z = false;
            if (-1 == indexOf) {
                substring = "";
            } else {
                String substring2 = decode.substring(0, indexOf);
                substring = decode.substring(indexOf + 1);
                decode = substring2;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    try {
                        hashMap.put(entry.getKey(), URLEncoder.encode(entry.getValue(), "UTF-8"));
                    } catch (Exception e) {
                        Log.e("MidasReport", "parameter '" + entry.getKey() + "' value [" + entry.getValue() + "] decode failed", e);
                    }
                }
            }
            for (String str2 : substring.split("&")) {
                String[] split = str2.split("=");
                if (2 == split.length) {
                    split[0] = split[0].trim();
                    if (split[0].length() != 0) {
                        hashMap.put(split[0], split[1]);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (z) {
                    sb.append("&");
                } else {
                    z = true;
                }
                sb.append((String) entry2.getKey());
                sb.append("=");
                sb.append((String) entry2.getValue());
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("domain", decode);
            hashMap2.put("param", sb.toString());
            return hashMap2;
        } catch (Exception e2) {
            Log.e("MidasReport", e2.getMessage(), e2);
            return null;
        }
    }

    private boolean a(String str, Integer num) {
        if (2 == num.intValue() || 7 == num.intValue()) {
            return true;
        }
        int indexOf = str.indexOf("&isFirstScreen=");
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        C0531a c0531a = new C0531a(str, num.intValue());
        if (this.i.get(c0531a) == null) {
            synchronized (this.i) {
                if (this.i.get(c0531a) == null) {
                    this.i.put(c0531a, Boolean.TRUE);
                    return true;
                }
            }
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.midas.ad.feedback.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0531a {
        private String b;
        private int c;

        public C0531a(String str, int i) {
            this.b = str;
            this.c = i;
        }

        public final int hashCode() {
            return this.b.hashCode() + this.c;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0531a) {
                C0531a c0531a = (C0531a) obj;
                return c0531a.b.equals(this.b) && c0531a.c == this.c;
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b {
        int a;

        public b(int i) {
            this.a = i;
        }

        public final int hashCode() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof b) && ((b) obj).a == this.a;
        }
    }

    private static String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                sb.append("&");
                sb.append(entry.getKey());
                sb.append("=");
                try {
                    sb.append(URLEncoder.encode(URLDecoder.decode(entry.getValue() != null ? entry.getValue() : "", "UTF-8"), "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return sb.length() > 0 ? sb.toString() : "";
    }

    private void a(int i, com.midas.ad.network.model.b bVar) {
        if (TextUtils.isEmpty(bVar.a)) {
            return;
        }
        a(i, bVar, (String) null);
    }

    static /* synthetic */ void a(a aVar, List list, int i) {
        HashMap hashMap;
        if (list == null || list.size() <= 0 || i == 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!TextUtils.isEmpty((CharSequence) list.get(i2))) {
                if (aVar.h != null) {
                    aVar.h.put(SocialConstants.PARAM_ACT, String.valueOf(i));
                    hashMap = aVar.h;
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(SocialConstants.PARAM_ACT, String.valueOf(i));
                    hashMap = hashMap2;
                }
                Map<String, String> a = aVar.a((String) list.get(i2), hashMap);
                if (a != null && a.size() > 0) {
                    jSONArray.put(a.get("param"));
                }
            }
        }
        if (jSONArray.length() > 0) {
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(aVar.d);
                if (aVar.e != null && TextUtils.equals(aVar.e.getPackageName(), "com.sankuai.meituan")) {
                    sb.append(URLEncoder.encode(jSONArray.toString(), "UTF-8"));
                } else {
                    sb.append(URLEncoder.encode(URLEncoder.encode(jSONArray.toString(), "UTF-8")));
                }
                if (jSONArray.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(aVar.a);
                    sb2.append(aVar.c + "dataCount=");
                    sb2.append(jSONArray.length());
                    sb2.append("&post_id=");
                    sb2.append(UUID.randomUUID());
                    if (aVar.a.length() <= 3 || aVar.a.indexOf("://") == -1 || aVar.a.indexOf("://") + 3 >= aVar.a.length()) {
                        return;
                    }
                    String substring = aVar.a.substring(aVar.a.indexOf("://") + 3, aVar.a.length());
                    if (substring.indexOf("m.api") == -1 && substring.indexOf("mapi") == -1) {
                        aVar.a(0, sb2.toString(), sb.toString(), "http");
                        return;
                    }
                    aVar.a(0, sb2.toString(), sb.toString(), (String) null);
                }
            } catch (Exception e) {
                Log.e("MidasReport", e.getMessage(), e);
            }
        }
    }
}
