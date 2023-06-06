package com.meizu.cloud.pushsdk.d.e;

import android.content.Context;
import com.meizu.cloud.pushsdk.PushManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public abstract class a {
    private static final String n = "a";
    protected com.meizu.cloud.pushsdk.d.b.a b;
    protected c c;
    protected b d;
    protected final String e;
    protected final String f;
    protected final boolean g;
    protected final com.meizu.cloud.pushsdk.d.f.b h;
    protected final boolean i;
    protected final long j;
    protected final int k;
    protected final TimeUnit l;
    protected final String a = PushManager.TAG;
    protected final AtomicBoolean m = new AtomicBoolean(true);

    /* renamed from: com.meizu.cloud.pushsdk.d.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0530a {
        protected final com.meizu.cloud.pushsdk.d.b.a a;
        protected final String b;
        protected final String c;
        protected final Context d;
        protected c e = null;
        protected boolean f = false;
        protected com.meizu.cloud.pushsdk.d.f.b g = com.meizu.cloud.pushsdk.d.f.b.OFF;
        protected boolean h = false;
        protected long i = 600;
        protected long j = 300;
        protected long k = 15;
        protected int l = 10;
        protected TimeUnit m = TimeUnit.SECONDS;

        public C0530a(com.meizu.cloud.pushsdk.d.b.a aVar, String str, String str2, Context context, Class<? extends a> cls) {
            this.a = aVar;
            this.b = str;
            this.c = str2;
            this.d = context;
        }

        public final C0530a a(int i) {
            this.l = 4;
            return this;
        }

        public final C0530a a(c cVar) {
            this.e = cVar;
            return this;
        }

        public final C0530a a(com.meizu.cloud.pushsdk.d.f.b bVar) {
            this.g = bVar;
            return this;
        }

        public final C0530a a(Boolean bool) {
            this.f = bool.booleanValue();
            return this;
        }
    }

    public a(C0530a c0530a) {
        this.b = c0530a.a;
        this.f = c0530a.c;
        this.g = c0530a.f;
        this.e = c0530a.b;
        this.c = c0530a.e;
        this.h = c0530a.g;
        this.i = c0530a.h;
        this.j = c0530a.k;
        this.k = c0530a.l >= 2 ? c0530a.l : 2;
        this.l = c0530a.m;
        if (this.i) {
            this.d = new b(c0530a.i, c0530a.j, c0530a.m, c0530a.d);
        }
        com.meizu.cloud.pushsdk.d.f.c.a(c0530a.g);
        com.meizu.cloud.pushsdk.d.f.c.c(n, "Tracker created successfully.", new Object[0]);
    }

    public final void a(c cVar) {
        this.c = cVar;
    }

    private com.meizu.cloud.pushsdk.d.a.b a(List<com.meizu.cloud.pushsdk.d.a.b> list) {
        if (this.i) {
            b bVar = this.d;
            com.meizu.cloud.pushsdk.d.f.c.c(b.a, "Getting session context...", new Object[0]);
            bVar.c = System.currentTimeMillis();
            list.add(new com.meizu.cloud.pushsdk.d.a.b("client_session", bVar.a()));
        }
        if (this.c != null) {
            if (!this.c.b.isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.d.a.b("geolocation", this.c.b));
            }
            if (!this.c.c.isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.d.a.b("mobileinfo", this.c.c));
            }
        }
        LinkedList linkedList = new LinkedList();
        for (com.meizu.cloud.pushsdk.d.a.b bVar2 : list) {
            linkedList.add(bVar2.a);
        }
        return new com.meizu.cloud.pushsdk.d.a.b("push_extra_info", linkedList);
    }

    public void a(com.meizu.cloud.pushsdk.d.c.b bVar, boolean z) {
        if (this.m.get()) {
            ArrayList arrayList = new ArrayList(bVar.a);
            com.meizu.cloud.pushsdk.d.a.c b = bVar.b();
            if (this.c != null) {
                b.a(new HashMap(this.c.a));
                b.a("et", a(arrayList).a);
            }
            com.meizu.cloud.pushsdk.d.f.c.c(n, "Adding new payload to event storage: %s", b);
            this.b.a(b, z);
        }
    }

    public final void a() {
        if (this.m.get()) {
            this.b.a();
        }
    }
}
