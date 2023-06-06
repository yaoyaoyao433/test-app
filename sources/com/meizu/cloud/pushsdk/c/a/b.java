package com.meizu.cloud.pushsdk.c.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.c.b;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.f;
import com.meizu.cloud.pushsdk.c.c.g;
import com.meizu.cloud.pushsdk.c.c.h;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.c.m;
import java.io.File;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.apache.http.entity.mime.MIME;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class b<T extends b> {
    private static final String h = "b";
    private g A;
    private int C;
    private boolean D;
    private int E;
    private com.meizu.cloud.pushsdk.c.d.a F;
    private Bitmap.Config G;
    private int H;
    private int I;
    private ImageView.ScaleType J;
    private final Executor K;
    private Type L;
    public final int a;
    public final int b;
    public int c;
    public String d;
    public String e;
    public com.meizu.cloud.pushsdk.c.c.a f;
    public String g;
    private final com.meizu.cloud.pushsdk.c.a.d i;
    private final String j;
    private int k;
    private final Object l;
    private final HashMap<String, String> m;
    private HashMap<String, String> n;
    private HashMap<String, String> o;
    private HashMap<String, String> p;
    private final HashMap<String, String> q;
    private final HashMap<String, String> r;
    private HashMap<String, File> s;
    private JSONObject t;
    private JSONArray u;
    private String v;
    private byte[] w;
    private File x;
    private static final g y = g.a(HHNetConfig.JSON);
    private static final g z = g.a("text/x-markdown; charset=utf-8");
    private static final Object B = new Object();

    /* renamed from: com.meizu.cloud.pushsdk.c.a.b$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[e.a().length];

        static {
            try {
                a[e.c - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.a - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.e - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.f - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class a<T extends a> {
        final String b;
        Object c;
        final String g;
        final String h;
        Executor j;
        String k;
        com.meizu.cloud.pushsdk.c.a.d a = com.meizu.cloud.pushsdk.c.a.d.MEDIUM;
        final HashMap<String, String> d = new HashMap<>();
        final HashMap<String, String> e = new HashMap<>();
        final HashMap<String, String> f = new HashMap<>();
        int i = 0;

        public a(String str, String str2, String str3) {
            this.b = str;
            this.g = str2;
            this.h = str3;
        }
    }

    /* renamed from: com.meizu.cloud.pushsdk.c.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0525b<T extends C0525b> {
        final String c;
        Object d;
        Bitmap.Config e;
        int f;
        int g;
        ImageView.ScaleType h;
        Executor l;
        String m;
        com.meizu.cloud.pushsdk.c.a.d a = com.meizu.cloud.pushsdk.c.a.d.MEDIUM;
        final HashMap<String, String> i = new HashMap<>();
        final HashMap<String, String> j = new HashMap<>();
        final HashMap<String, String> k = new HashMap<>();
        final int b = 0;

        public C0525b(String str) {
            this.c = str;
        }

        public final T a(HashMap<String, String> hashMap) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                this.j.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final b a() {
            return new b(this);
        }
    }

    /* loaded from: classes3.dex */
    public static class c<T extends c> {
        final String b;
        Object c;
        Executor j;
        String k;
        String l;
        com.meizu.cloud.pushsdk.c.a.d a = com.meizu.cloud.pushsdk.c.a.d.MEDIUM;
        final HashMap<String, String> d = new HashMap<>();
        final HashMap<String, String> e = new HashMap<>();
        final HashMap<String, String> f = new HashMap<>();
        final HashMap<String, String> g = new HashMap<>();
        public final HashMap<String, File> h = new HashMap<>();
        int i = 0;

        public c(String str) {
            this.b = str;
        }

        public final T a(HashMap<String, String> hashMap) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                this.e.put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class d<T extends d> {
        final String c;
        Object d;
        Executor o;
        String p;
        String q;
        com.meizu.cloud.pushsdk.c.a.d a = com.meizu.cloud.pushsdk.c.a.d.MEDIUM;
        JSONObject e = null;
        JSONArray f = null;
        String g = null;
        byte[] h = null;
        File i = null;
        final HashMap<String, String> j = new HashMap<>();
        final HashMap<String, String> k = new HashMap<>();
        final HashMap<String, String> l = new HashMap<>();
        final HashMap<String, String> m = new HashMap<>();
        final HashMap<String, String> n = new HashMap<>();
        final int b = 1;

        public d(String str) {
            this.c = str;
        }

        public final T a(HashMap<String, String> hashMap) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                this.k.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final b a() {
            return new b(this);
        }
    }

    public final com.meizu.cloud.pushsdk.c.a.c a() {
        this.c = e.a;
        return com.meizu.cloud.pushsdk.c.e.c.a(this);
    }

    public final com.meizu.cloud.pushsdk.c.c.c e() {
        c.a aVar = new c.a();
        try {
            for (Map.Entry<String, String> entry : this.m.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aVar.a();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "ANRequest{sequenceNumber='" + this.k + ", mMethod=" + this.a + ", mPriority=" + this.i + ", mRequestType=" + this.b + ", mUrl=" + this.j + '}';
    }

    public b(C0525b c0525b) {
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new HashMap<>();
        this.s = new HashMap<>();
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.A = null;
        this.E = 0;
        this.L = null;
        this.b = 0;
        this.a = c0525b.b;
        this.i = c0525b.a;
        this.j = c0525b.c;
        this.l = c0525b.d;
        this.m = c0525b.i;
        this.G = c0525b.e;
        this.I = c0525b.g;
        this.H = c0525b.f;
        this.J = c0525b.h;
        this.q = c0525b.j;
        this.r = c0525b.k;
        this.K = c0525b.l;
        this.g = c0525b.m;
    }

    public b(d dVar) {
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new HashMap<>();
        this.s = new HashMap<>();
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.A = null;
        this.E = 0;
        this.L = null;
        this.b = 0;
        this.a = dVar.b;
        this.i = dVar.a;
        this.j = dVar.c;
        this.l = dVar.d;
        this.m = dVar.j;
        this.n = dVar.k;
        this.o = dVar.l;
        this.q = dVar.m;
        this.r = dVar.n;
        this.t = dVar.e;
        this.u = dVar.f;
        this.v = dVar.g;
        this.x = dVar.i;
        this.w = dVar.h;
        this.K = dVar.o;
        this.g = dVar.p;
        if (dVar.q != null) {
            this.A = g.a(dVar.q);
        }
    }

    public b(a aVar) {
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new HashMap<>();
        this.s = new HashMap<>();
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.A = null;
        this.E = 0;
        this.L = null;
        this.b = 1;
        this.a = 0;
        this.i = aVar.a;
        this.j = aVar.b;
        this.l = aVar.c;
        this.d = aVar.g;
        this.e = aVar.h;
        this.m = aVar.d;
        this.q = aVar.e;
        this.r = aVar.f;
        this.E = aVar.i;
        this.K = aVar.j;
        this.g = aVar.k;
    }

    public b(c cVar) {
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new HashMap<>();
        this.s = new HashMap<>();
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.A = null;
        this.E = 0;
        this.L = null;
        this.b = 2;
        this.a = 1;
        this.i = cVar.a;
        this.j = cVar.b;
        this.l = cVar.c;
        this.m = cVar.d;
        this.q = cVar.f;
        this.r = cVar.g;
        this.p = cVar.e;
        this.s = cVar.h;
        this.E = cVar.i;
        this.K = cVar.j;
        this.g = cVar.k;
        if (cVar.l != null) {
            this.A = g.a(cVar.l);
        }
    }

    public final String b() {
        String substring;
        String substring2;
        String str = this.j;
        for (Map.Entry<String, String> entry : this.r.entrySet()) {
            str = str.replace(CommonConstant.Symbol.BIG_BRACKET_LEFT + entry.getKey() + CommonConstant.Symbol.BIG_BRACKET_RIGHT, String.valueOf(entry.getValue()));
        }
        f c2 = f.c(str);
        f.a aVar = new f.a();
        aVar.a = c2.a;
        if (c2.b.isEmpty()) {
            substring = "";
        } else {
            int length = c2.a.length() + 3;
            String str2 = c2.h;
            substring = c2.h.substring(length, m.a(str2, length, str2.length(), ":@"));
        }
        aVar.b = substring;
        aVar.c = c2.c.isEmpty() ? "" : c2.h.substring(c2.h.indexOf(58, c2.a.length() + 3) + 1, c2.h.indexOf(64));
        aVar.d = c2.d;
        aVar.e = c2.e != f.a(c2.a) ? c2.e : -1;
        aVar.f.clear();
        aVar.f.addAll(c2.a());
        if (c2.f == null) {
            substring2 = null;
        } else {
            int indexOf = c2.h.indexOf(63) + 1;
            substring2 = c2.h.substring(indexOf, m.a(c2.h, indexOf + 1, c2.h.length(), '#'));
        }
        aVar.g = substring2 != null ? f.b(f.a(substring2, " \"'<>#", true, false, true, true)) : null;
        aVar.h = c2.g == null ? null : c2.h.substring(c2.h.indexOf(35) + 1);
        for (Map.Entry<String, String> entry2 : this.q.entrySet()) {
            String key = entry2.getKey();
            String value = entry2.getValue();
            if (key == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (aVar.g == null) {
                aVar.g = new ArrayList();
            }
            aVar.g.add(f.a(key, " \"'<>#&=", false, false, true, true));
            aVar.g.add(value != null ? f.a(value, " \"'<>#&=", false, false, true, true) : null);
        }
        return aVar.b().toString();
    }

    public final com.meizu.cloud.pushsdk.c.a.c a(k kVar) {
        com.meizu.cloud.pushsdk.c.a.c<Bitmap> a2;
        switch (AnonymousClass2.a[this.c - 1]) {
            case 1:
                try {
                    return com.meizu.cloud.pushsdk.c.a.c.a(new JSONArray(com.meizu.cloud.pushsdk.c.g.g.a(kVar.b.a()).e()));
                } catch (Exception e) {
                    return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.h.b.b(new com.meizu.cloud.pushsdk.c.b.a(e)));
                }
            case 2:
                try {
                    return com.meizu.cloud.pushsdk.c.a.c.a(new JSONObject(com.meizu.cloud.pushsdk.c.g.g.a(kVar.b.a()).e()));
                } catch (Exception e2) {
                    return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.h.b.b(new com.meizu.cloud.pushsdk.c.b.a(e2)));
                }
            case 3:
                try {
                    return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.g.g.a(kVar.b.a()).e());
                } catch (Exception e3) {
                    return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.h.b.b(new com.meizu.cloud.pushsdk.c.b.a(e3)));
                }
            case 4:
                synchronized (B) {
                    try {
                        try {
                            a2 = com.meizu.cloud.pushsdk.c.h.b.a(kVar, this.H, this.I, this.G, this.J);
                        } catch (Exception e4) {
                            return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.h.b.b(new com.meizu.cloud.pushsdk.c.b.a(e4)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return a2;
            case 5:
                return com.meizu.cloud.pushsdk.c.a.c.a(PackageLoadReporter.Source.PREFETCH);
            default:
                return null;
        }
    }

    public static com.meizu.cloud.pushsdk.c.b.a a(com.meizu.cloud.pushsdk.c.b.a aVar) {
        try {
            if (aVar.d != null && aVar.d.b != null && aVar.d.b.a() != null) {
                aVar.a = com.meizu.cloud.pushsdk.c.g.g.a(aVar.d.b.a()).e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aVar;
    }

    public final j c() {
        if (this.t != null) {
            return this.A != null ? j.a(this.A, this.t.toString()) : j.a(y, this.t.toString());
        } else if (this.u != null) {
            return this.A != null ? j.a(this.A, this.u.toString()) : j.a(y, this.u.toString());
        } else if (this.v != null) {
            return this.A != null ? j.a(this.A, this.v) : j.a(z, this.v);
        } else if (this.x != null) {
            return this.A != null ? j.a(this.A, this.x) : j.a(z, this.x);
        } else if (this.w != null) {
            return this.A != null ? j.a(this.A, this.w) : j.a(z, this.w);
        } else {
            b.a aVar = new b.a();
            try {
                for (Map.Entry<String, String> entry : this.n.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        aVar.a.add(f.a(entry.getKey(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
                        aVar.b.add(f.a(entry.getValue(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
                    }
                }
                for (Map.Entry<String, String> entry2 : this.o.entrySet()) {
                    if (!TextUtils.isEmpty(entry2.getKey()) && !TextUtils.isEmpty(entry2.getValue())) {
                        aVar.a.add(f.a(entry2.getKey(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
                        aVar.b.add(f.a(entry2.getValue(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new com.meizu.cloud.pushsdk.c.c.b(aVar.a, aVar.b);
        }
    }

    public final j d() {
        h.a a2 = new h.a().a(h.e);
        try {
            for (Map.Entry<String, String> entry : this.p.entrySet()) {
                a2.a(com.meizu.cloud.pushsdk.c.c.c.a(MIME.CONTENT_DISPOSITION, "form-data; name=\"" + entry.getKey() + CommonConstant.Symbol.DOUBLE_QUOTES), j.a((g) null, entry.getValue()));
            }
            for (Map.Entry<String, File> entry2 : this.s.entrySet()) {
                if (entry2.getValue() != null) {
                    String name = entry2.getValue().getName();
                    String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(name);
                    if (contentTypeFor == null) {
                        contentTypeFor = "application/octet-stream";
                    }
                    j a3 = j.a(g.a(contentTypeFor), entry2.getValue());
                    a2.a(com.meizu.cloud.pushsdk.c.c.c.a(MIME.CONTENT_DISPOSITION, "form-data; name=\"" + entry2.getKey() + "\"; filename=\"" + name + CommonConstant.Symbol.DOUBLE_QUOTES), a3);
                    if (this.A != null) {
                        a2.a(this.A);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (a2.c.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new h(a2.a, a2.b, a2.c);
    }
}
