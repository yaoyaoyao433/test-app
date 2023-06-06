package dianping.com.remoteshark;

import java.io.InputStream;
import java.net.Proxy;
import java.util.HashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public String a;
    public HashMap<String, String> b;
    public InputStream c;
    private String d;
    private String e;
    private int f;
    private String g;
    @Deprecated
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    @Deprecated
    private Proxy l;
    private Object m;
    private boolean n;
    private HostnameVerifier o;
    private SSLSocketFactory p;
    private String q;

    public b(a aVar) {
        this.k = 100;
        this.a = aVar.b;
        this.d = aVar.a;
        this.e = aVar.c;
        this.b = aVar.d;
        this.f = aVar.e;
        this.c = aVar.f;
        this.h = aVar.h;
        this.i = aVar.i;
        this.l = aVar.l;
        this.k = aVar.k;
        this.j = aVar.j;
        this.q = aVar.o;
        this.o = aVar.m;
        this.p = aVar.n;
        this.m = aVar.p;
        this.g = aVar.g;
        this.n = aVar.q;
    }

    public final void a(String str, String str2) {
        if (this.b == null) {
            this.b = new HashMap<>();
        }
        this.b.put(str, str2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        String a;
        public String b;
        HashMap<String, String> d;
        int e;
        public InputStream f;
        String g;
        boolean h;
        boolean i;
        Proxy l;
        HostnameVerifier m;
        SSLSocketFactory n;
        String o;
        Object p;
        public boolean q;
        public boolean j = true;
        int k = 100;
        String c = "GET";

        public final b a() {
            this.c = "POST";
            return new b(this);
        }
    }
}
