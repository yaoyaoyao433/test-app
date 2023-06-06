package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes6.dex */
public abstract class gf {
    private static String b;
    private static long c;
    public static final DateFormat o;
    private List<gb> d;
    private final Map<String, Object> e;
    String p;
    String q;
    public String r;
    public String s;
    public String t;
    public String u;
    gj v;
    protected static final String n = Locale.getDefault().getLanguage().toLowerCase();
    private static String a = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        o = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        b = gq.a(5) + CommonConstant.Symbol.MINUS;
        c = 0L;
    }

    public gf() {
        this.p = a;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.d = new CopyOnWriteArrayList();
        this.e = new HashMap();
        this.v = null;
    }

    public gf(Bundle bundle) {
        this.p = a;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.d = new CopyOnWriteArrayList();
        this.e = new HashMap();
        this.v = null;
        this.r = bundle.getString("ext_to");
        this.s = bundle.getString("ext_from");
        this.t = bundle.getString("ext_chid");
        this.q = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.d = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                this.d.add(gb.a((Bundle) parcelable));
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.v = new gj(bundle2);
        }
    }

    private synchronized Object b(String str) {
        if (this.e == null) {
            return null;
        }
        return this.e.get(str);
    }

    public static synchronized String c() {
        String sb;
        synchronized (gf.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b);
            long j = c;
            c = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    public static String f() {
        return n;
    }

    private synchronized Collection<gb> g() {
        if (this.d == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.d));
    }

    private synchronized Collection<String> h() {
        if (this.e == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.e.keySet()));
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.p)) {
            bundle.putString("ext_ns", this.p);
        }
        if (!TextUtils.isEmpty(this.s)) {
            bundle.putString("ext_from", this.s);
        }
        if (!TextUtils.isEmpty(this.r)) {
            bundle.putString("ext_to", this.r);
        }
        if (!TextUtils.isEmpty(this.q)) {
            bundle.putString("ext_pkt_id", this.q);
        }
        if (!TextUtils.isEmpty(this.t)) {
            bundle.putString("ext_chid", this.t);
        }
        if (this.v != null) {
            bundle.putBundle("ext_ERROR", this.v.a());
        }
        if (this.d != null) {
            Bundle[] bundleArr = new Bundle[this.d.size()];
            int i = 0;
            for (gb gbVar : this.d) {
                bundleArr[i] = gbVar.c();
                i++;
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public final void a(gb gbVar) {
        this.d.add(gbVar);
    }

    public abstract String b();

    public final String d() {
        if ("ID_NOT_AVAILABLE".equals(this.q)) {
            return null;
        }
        if (this.q == null) {
            this.q = c();
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String e() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gf.e():java.lang.String");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gf gfVar = (gf) obj;
            if (this.v == null ? gfVar.v != null : !this.v.equals(gfVar.v)) {
                return false;
            }
            if (this.s == null ? gfVar.s != null : !this.s.equals(gfVar.s)) {
                return false;
            }
            if (!this.d.equals(gfVar.d)) {
                return false;
            }
            if (this.q == null ? gfVar.q != null : !this.q.equals(gfVar.q)) {
                return false;
            }
            if (this.t == null ? gfVar.t != null : !this.t.equals(gfVar.t)) {
                return false;
            }
            if (this.e == null ? gfVar.e != null : !this.e.equals(gfVar.e)) {
                return false;
            }
            if (this.r == null ? gfVar.r != null : !this.r.equals(gfVar.r)) {
                return false;
            }
            if (this.p == null ? gfVar.p == null : this.p.equals(gfVar.p)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((this.p != null ? this.p.hashCode() : 0) * 31) + (this.q != null ? this.q.hashCode() : 0)) * 31) + (this.r != null ? this.r.hashCode() : 0)) * 31) + (this.s != null ? this.s.hashCode() : 0)) * 31) + (this.t != null ? this.t.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + (this.v != null ? this.v.hashCode() : 0);
    }

    public final gb a(String str) {
        for (gb gbVar : this.d) {
            if (str.equals(gbVar.a)) {
                return gbVar;
            }
        }
        return null;
    }
}
