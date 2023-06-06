package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class go extends gt {
    @Json(name = "loadSuccess")
    private boolean a;
    @Json(name = "loadSuccessTime")
    private long b;
    @Json(name = "firstLoadTime")
    private long c;
    @Json(name = "configUpdate")
    private b d;
    @Json(name = "tileErrors")
    private Set<e> e;
    @Json(name = "configError")
    private a f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public go(long j) {
        super(j);
        this.a = false;
        this.b = 0L;
        this.c = 0L;
    }

    public final void a(boolean z, long j) {
        this.a = z;
        if (this.c > 0) {
            this.b = j - this.g;
        } else {
            this.c = j - this.g;
        }
        this.b = j;
        HashMap hashMap = new HashMap();
        hashMap.put("success", String.valueOf(z));
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        hashMap.put("startTime", sb.toString());
        hashMap.put("endTime", String.valueOf(j));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.b);
        hashMap.put("duration", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.c);
        hashMap.put("firstDuration", sb3.toString());
        u.a();
        new sb("mapload", hashMap);
    }

    public final void b(boolean z, long j) {
        this.d = new b(q());
        this.d.a = z;
        if (j - this.g > 0) {
            this.d.b = j - this.g;
        }
    }

    public final void a(long j, String str, int i) {
        if (this.e == null) {
            this.e = new CopyOnWriteArraySet();
        }
        if (this.e.size() > 9) {
            return;
        }
        e eVar = new e(j);
        eVar.a = j - this.g;
        eVar.b = str;
        eVar.c = i;
        this.e.add(eVar);
        HashMap hashMap = new HashMap();
        hashMap.put("tid", str);
        hashMap.put("netError", String.valueOf(i));
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        hashMap.put("startTime", sb.toString());
        hashMap.put("endTime", String.valueOf(j));
        u.a();
        new sb("mapload-tile", hashMap);
    }

    public final void a(c cVar) {
        if (this.f == null) {
            this.f = new a(q());
        }
        if (this.f.a == null) {
            this.f.a = new CopyOnWriteArraySet();
        }
        if (this.f.a.size() > 9) {
            return;
        }
        this.f.a.add(cVar);
        HashMap hashMap = new HashMap();
        hashMap.put("name", cVar.a);
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.e);
        hashMap.put("localVer", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f);
        hashMap.put("netError", sb2.toString());
        hashMap.put("expectMd5", cVar.c);
        hashMap.put("actualMd5", cVar.d);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.g);
        hashMap.put("startTime", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g);
        sb4.append(cVar.b);
        hashMap.put("endTime", sb4.toString());
        u.a();
        new sb("mapload-configfile", hashMap);
    }

    public final void a(long j, String str) {
        if (this.f == null) {
            this.f = new a(q());
        }
        if (this.f.b == null) {
            this.f.b = new CopyOnWriteArraySet();
        }
        if (this.f.b.size() > 9) {
            return;
        }
        d dVar = new d(this.g);
        dVar.b = j - this.g;
        dVar.a = str;
        this.f.b.add(dVar);
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        hashMap.put("startTime", sb.toString());
        hashMap.put("endTime", String.valueOf(j));
        u.a();
        new sb("mapload-missfile", hashMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends gt {
        @Json(name = "success")
        boolean a;
        @Json(name = "loadBeginTime")
        long b;

        b(long j) {
            super(j);
            this.a = false;
            this.b = 0L;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class e extends gt {
        @Json(name = "time")
        long a;
        @Json(name = "tid")
        String b;
        @Json(name = "netError")
        int c;

        e(long j) {
            super(j);
        }

        public final int hashCode() {
            if (this.b == null) {
                return super.hashCode();
            }
            return this.b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                return hb.a(this.b, ((e) obj).b);
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends gt {
        @Json(name = "failUpdates")
        Set<c> a;
        @Json(name = "missFiles")
        Set<d> b;

        a(long j) {
            super(j);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c extends gt {
        @Json(name = "name")
        public String a;
        @Json(name = "time")
        public long b;
        @Json(name = "expectMd5")
        public String c;
        @Json(name = "actualMd5")
        public String d;
        @Json(name = "localVer")
        public int e;
        @Json(name = "netError")
        public int f;

        public c() {
            this(0L);
        }

        c(long j) {
            super(j);
        }

        public final int hashCode() {
            if (this.a == null) {
                return super.hashCode();
            }
            return this.a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                return hb.a(this.a, ((c) obj).a);
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class d extends gt {
        @Json(name = "name")
        String a;
        @Json(name = "time")
        long b;

        d(long j) {
            super(j);
        }

        public final int hashCode() {
            if (this.a == null) {
                return super.hashCode();
            }
            return this.a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                return hb.a(this.a, ((d) obj).a);
            }
            return false;
        }
    }
}
