package com.meizu.cloud.pushsdk.d.b;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.meituan.passport.api.AbsApiFactory;
import com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes3.dex */
public abstract class a {
    protected final Context a;
    protected Uri.Builder b;
    protected final f c;
    protected int d;
    protected b e;
    protected final int f;
    protected final int g;
    protected final int h;
    protected final long i;
    protected final long j;
    protected final TimeUnit k;
    private h o;
    private final SSLSocketFactory p;
    private final HostnameVerifier q;
    private String r;
    private final com.meizu.cloud.pushsdk.c.c.a s;
    private final String m = a.class.getSimpleName();
    private final com.meizu.cloud.pushsdk.c.c.g n = com.meizu.cloud.pushsdk.c.c.g.a(HHNetConfig.JSON);
    public final AtomicBoolean l = new AtomicBoolean(false);

    /* renamed from: com.meizu.cloud.pushsdk.d.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0527a {
        protected final String a;
        protected final Context b;
        protected SSLSocketFactory m;
        protected HostnameVerifier n;
        protected f c = null;
        protected int d = d.b;
        protected b e = b.Single;
        protected h f = h.HTTPS;
        protected int g = 5;
        protected int h = CustomizedScrollView.ANIMATED_SCROLL_GAP;
        protected int i = 5;
        protected long j = 40000;
        protected long k = 40000;
        protected TimeUnit l = TimeUnit.SECONDS;
        protected com.meizu.cloud.pushsdk.c.c.a o = new com.meizu.cloud.pushsdk.c.c.e();

        public C0527a(String str, Context context, Class<? extends a> cls) {
            this.a = str;
            this.b = context;
        }

        public final C0527a a(int i) {
            this.g = 1;
            return this;
        }

        public final C0527a a(com.meizu.cloud.pushsdk.c.c.a aVar) {
            if (aVar != null) {
                this.o = aVar;
                String simpleName = C0527a.class.getSimpleName();
                com.meizu.cloud.pushsdk.d.f.c.c(simpleName, "set new call " + aVar, new Object[0]);
            }
            return this;
        }

        public final C0527a a(b bVar) {
            this.e = bVar;
            return this;
        }

        public final C0527a a(f fVar) {
            this.c = fVar;
            return this;
        }

        public final C0527a b(int i) {
            this.h = i;
            return this;
        }

        public final C0527a c(int i) {
            this.i = 2;
            return this;
        }
    }

    public abstract void a();

    public abstract void a(com.meizu.cloud.pushsdk.d.a.a aVar, boolean z);

    public a(C0527a c0527a) {
        this.d = c0527a.d;
        this.c = c0527a.c;
        this.a = c0527a.b;
        this.e = c0527a.e;
        this.o = c0527a.f;
        this.p = c0527a.m;
        this.q = c0527a.n;
        this.f = c0527a.g;
        this.g = c0527a.i;
        this.h = c0527a.h;
        this.i = c0527a.j;
        this.j = c0527a.k;
        this.r = c0527a.a;
        this.k = c0527a.l;
        this.s = c0527a.o;
        String str = this.m;
        com.meizu.cloud.pushsdk.d.f.c.a(str, "security " + this.o, new Object[0]);
        StringBuilder sb = this.o == h.HTTP ? new StringBuilder(AbsApiFactory.HTTP) : new StringBuilder(AbsApiFactory.HTTPS);
        sb.append(this.r);
        this.b = Uri.parse(sb.toString()).buildUpon();
        if (this.d == d.a) {
            this.b.appendPath("i");
        } else {
            this.b.appendEncodedPath("push_data_report/mobile");
        }
        com.meizu.cloud.pushsdk.d.f.c.c(this.m, "Emitter created successfully!", new Object[0]);
    }

    public final int a(i iVar) {
        k a;
        k kVar = null;
        try {
            try {
                com.meizu.cloud.pushsdk.d.f.c.b(this.m, "Sending request: %s", iVar);
                a = this.s.a(iVar);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            int i = a.a;
            a(a);
            return i;
        } catch (IOException e2) {
            kVar = a;
            e = e2;
            com.meizu.cloud.pushsdk.d.f.c.a(this.m, "Request sending failed: %s", Log.getStackTraceString(e));
            a(kVar);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            kVar = a;
            a(kVar);
            throw th;
        }
    }

    private void a(k kVar) {
        if (kVar != null) {
            try {
                if (kVar.b != null) {
                    kVar.b.close();
                }
            } catch (Exception unused) {
                com.meizu.cloud.pushsdk.d.f.c.b(this.m, "Unable to close source data", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i a(com.meizu.cloud.pushsdk.d.a.a aVar) {
        aVar.a("stm", "".equals("") ? com.meizu.cloud.pushsdk.d.f.e.a() : "");
        this.b.clearQuery();
        HashMap hashMap = (HashMap) aVar.a();
        for (String str : hashMap.keySet()) {
            this.b.appendQueryParameter(str, (String) hashMap.get(str));
        }
        return new i.a().a(this.b.build().toString()).a("GET", (j) null).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i a(ArrayList<com.meizu.cloud.pushsdk.d.a.a> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<com.meizu.cloud.pushsdk.d.a.a> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().a());
        }
        com.meizu.cloud.pushsdk.d.a.b bVar = new com.meizu.cloud.pushsdk.d.a.b("push_group_data", arrayList2);
        String str = this.m;
        com.meizu.cloud.pushsdk.d.f.c.b(str, "final SelfDescribingJson " + bVar, new Object[0]);
        String uri = this.b.build().toString();
        return new i.a().a(uri).a("POST", j.a(this.n, bVar.toString())).a();
    }
}
