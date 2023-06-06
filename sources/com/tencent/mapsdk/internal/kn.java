package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.kv;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kn implements km {
    private static final HashSet<String> Y = new HashSet<>();
    private static final kv.g<a> Z;
    private static final AtomicInteger aa;
    private static final Map<String, Map<String, c>> ab;
    private static Pair<String, StringBuilder> ac;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    private static String i(String str) {
        return str;
    }

    private static String l(String str) {
        return str;
    }

    static {
        g(ki.p);
        g(ki.b);
        g(ki.r);
        g("GD");
        Z = kv.a(30, new kv.e<a>() { // from class: com.tencent.mapsdk.internal.kn.1
            private static a b() {
                return new a();
            }

            @Override // com.tencent.mapsdk.internal.kv.e
            public final /* synthetic */ a a() {
                return new a();
            }
        });
        aa = new AtomicInteger();
        ab = Collections.synchronizedMap(new Hashtable());
    }

    private static boolean d() {
        return kj.d(ki.d);
    }

    private static boolean h(String str) {
        return kj.d(ki.d) && !Y.contains(str);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || sd.d) {
            return str;
        }
        String str2 = null;
        List<String> d = kc.d(new File(kj.a(), "kv"));
        if (d == null || d.isEmpty() || TextUtils.isEmpty(d.get(0))) {
            try {
                String a2 = ko.a(gy.a() + sd.j + sd.i + sd.c + sd.b);
                try {
                    kj.f("kv", a2);
                } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
                }
                str2 = a2;
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused2) {
            }
        } else {
            str2 = d.get(0);
        }
        try {
            return !TextUtils.isEmpty(str2) ? ko.a(str2, str) : "";
        } catch (GeneralSecurityException unused3) {
            return "";
        }
    }

    public static void b(String str) {
        if (h(str)) {
            a(str, str, (b) null);
        }
    }

    public static void c(String str) {
        if (h(str)) {
            a(str, str, (b) null);
        }
    }

    public static void a(String str, String str2) {
        if (h(str)) {
            a(str, str2, (b) null);
        }
    }

    public static void b(String str, String str2) {
        if (h(str)) {
            a(str, str2, (b) null);
        }
    }

    private static void a(String str, b bVar) {
        if (h(str)) {
            a(str, str, bVar);
        }
    }

    private static void a(String str, String str2, b bVar) {
        c cVar;
        if (h(str)) {
            Map<String, c> map = ab.get(str);
            if (map == null) {
                HashMap hashMap = new HashMap();
                cVar = new c(str, str2);
                hashMap.put(str2, cVar);
                ab.put(str, hashMap);
            } else {
                cVar = map.get(str2);
                if (cVar == null) {
                    cVar = new c(str, str2);
                    map.put(str2, cVar);
                } else {
                    cVar.b();
                }
            }
            cVar.b = str2;
            cVar.d = bVar;
            cVar.c.add(Long.valueOf(System.currentTimeMillis()));
            cVar.g = "Begin";
            a(cVar);
        }
    }

    public static void a(String str, String str2, Object obj) {
        if (h(str)) {
            a(str, str, str2, obj);
        }
    }

    public static void a(String str, String str2, String str3, Object obj) {
        if (h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str2) : null;
            if (cVar != null) {
                cVar.a(str3, obj);
                cVar.g = "Set";
                k(cVar.a() + CommonConstant.Symbol.COLON + str3 + "=>" + obj + "\n");
            }
        }
    }

    public static Object c(String str, String str2) {
        if (h(str) && h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                return cVar.b(str2);
            }
        }
        return null;
    }

    private static Object a(String str, String str2, String str3) {
        if (h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str2) : null;
            if (cVar != null) {
                return cVar.b(str3);
            }
            return null;
        }
        return null;
    }

    public static int d(String str, String str2) {
        if (h(str) && h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                Object b2 = cVar.b(str2);
                if (b2 instanceof AtomicInteger) {
                    return ((AtomicInteger) b2).get();
                }
            }
        }
        return 0;
    }

    private static int b(String str, String str2, String str3) {
        if (h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str2) : null;
            if (cVar != null) {
                Object b2 = cVar.b(str3);
                if (b2 instanceof AtomicInteger) {
                    return ((AtomicInteger) b2).get();
                }
            }
            return 0;
        }
        return 0;
    }

    public static int e(String str, String str2) {
        if (h(str) && h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                Object b2 = cVar.b(str2);
                if (b2 instanceof AtomicInteger) {
                    return ((AtomicInteger) b2).incrementAndGet();
                }
                cVar.a(str2, new AtomicInteger(1));
                return 1;
            }
        }
        return -1;
    }

    private static int c(String str, String str2, String str3) {
        if (h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str2) : null;
            if (cVar != null) {
                Object b2 = cVar.b(str3);
                if (b2 instanceof AtomicInteger) {
                    return ((AtomicInteger) b2).incrementAndGet();
                }
                cVar.a(str3, new AtomicInteger(1));
                return 1;
            }
            return -1;
        }
        return -1;
    }

    private static int a(String str, String str2, String str3, int i) {
        if (h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str2) : null;
            if (cVar != null) {
                Object b2 = cVar.b(str3);
                if (b2 instanceof AtomicInteger) {
                    if (i <= 0) {
                        i = 1;
                    }
                    AtomicInteger atomicInteger = (AtomicInteger) b2;
                    int i2 = atomicInteger.get() + i;
                    atomicInteger.set(i2);
                    return i2;
                }
                cVar.a(str3, new AtomicInteger(1));
                return 1;
            }
            return -1;
        }
        return -1;
    }

    private static int g(String str, String str2) {
        if (h(str) && h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                Object b2 = cVar.b(str2);
                if (b2 instanceof AtomicInteger) {
                    AtomicInteger atomicInteger = (AtomicInteger) b2;
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet < 0) {
                        atomicInteger.set(0);
                        return 0;
                    }
                    return decrementAndGet;
                }
            }
        }
        return -1;
    }

    private static int d(String str, String str2, String str3) {
        if (h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str2) : null;
            if (cVar != null) {
                Object b2 = cVar.b(str3);
                if (b2 instanceof AtomicInteger) {
                    AtomicInteger atomicInteger = (AtomicInteger) b2;
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet < 0) {
                        atomicInteger.set(0);
                        return 0;
                    }
                    return decrementAndGet;
                }
            }
            return -1;
        }
        return -1;
    }

    public static long d(String str) {
        if (h(str)) {
            return f(str, str);
        }
        return 0L;
    }

    public static long f(String str, String str2) {
        if (h(str)) {
            c i = i(str, str2);
            if (i != null) {
                i.g = "End";
            }
            long a2 = a(i);
            if (a2 != -1) {
                ab.remove(str);
            }
            return a2;
        }
        return 0L;
    }

    public static long e(String str) {
        if (h(str) && h(str)) {
            return a(str, str, str, "", null);
        }
        return 0L;
    }

    public static long b(String str, String str2, Object obj) {
        if (h(str)) {
            return a(str, str, "", str2, obj);
        }
        return 0L;
    }

    private static long h(String str, String str2) {
        if (h(str)) {
            return a(str, str, str2, "", null);
        }
        return 0L;
    }

    private static long a(String str, String str2, String str3, String str4, Object obj) {
        if (h(str)) {
            a(str, str2, str4, obj);
            c i = i(str, str2);
            if (i != null) {
                i.g = "Log";
                i.a.incrementAndGet();
                i.f = str3;
                i.c.add(Long.valueOf(System.currentTimeMillis()));
            }
            return a(i);
        }
        return 0L;
    }

    private static long a(c cVar) {
        long j;
        long j2 = -1;
        if (cVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (cVar.c.size() > 0) {
                j2 = currentTimeMillis - cVar.c.get(0).longValue();
                j = currentTimeMillis - cVar.c.get(cVar.c.size() - 1).longValue();
            } else {
                j = -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.a());
            sb.append("\n");
            if (cVar.a.get() != 0) {
                sb.append("idx:");
                sb.append(cVar.a.get());
                sb.append("\n");
            }
            if (j2 > 0) {
                sb.append("ut:");
                sb.append(j2);
                sb.append("ms\n");
            }
            if (j > 0) {
                sb.append("it:");
                sb.append(j);
                sb.append("ms\n");
            }
            if (cVar.e != null && !cVar.e.isEmpty()) {
                sb.append("val:");
                sb.append(cVar.e);
                sb.append("\n");
            }
            String sb2 = sb.toString();
            kj.c(ki.d, sb2);
            k(sb2);
        }
        return j2;
    }

    private static c i(String str, String str2) {
        Map<String, c> map = ab.get(str);
        c cVar = map != null ? map.get(str2) : null;
        if (cVar == null || !cVar.a(str2)) {
            return null;
        }
        return cVar;
    }

    private static a a(int i) {
        aa.incrementAndGet();
        a a2 = Z.a();
        a2.a = i;
        return a2;
    }

    private static boolean j(String str, String str2) {
        return i(str, str2) != null;
    }

    public static a f(String str) {
        aa.incrementAndGet();
        a a2 = Z.a();
        a2.b = str;
        return a2;
    }

    public static void g(String str) {
        Y.add(str);
    }

    private static void k(String str) {
        String d = kl.d();
        if (ac != null && !((String) ac.first).equals(d)) {
            e();
        }
        if (ac == null) {
            ac = new Pair<>(d, new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) ac.second;
        synchronized (ac) {
            sb.append(System.currentTimeMillis());
            sb.append(" : ");
            sb.append(str);
        }
        if (sb.length() >= 10240) {
            kj.f(ki.d, sb.toString());
            ac = null;
        }
    }

    private static void e() {
        if (ac == null || ac.second == null || ((StringBuilder) ac.second).length() == 0) {
            return;
        }
        String d = kl.d();
        StringBuilder sb = (StringBuilder) ac.second;
        String str = ki.d;
        if (!((String) ac.first).equals(d)) {
            str = "TT-" + ((String) ac.first);
        }
        synchronized (ac) {
            sb.append("\n ============= \n");
        }
        kj.f(str, sb.toString());
        ac = null;
    }

    private static void a(Throwable th) {
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            try {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                    cause.printStackTrace(printWriter);
                }
                printWriter.close();
                sb.append(stringWriter.toString());
                sb.append("\n =============== ");
            } catch (Throwable unused) {
            }
            kj.f("CRASH", sb.toString());
        }
    }

    public static void a() {
        e();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements kv.h {
        int a = 3;
        String b = ki.d;

        private a a(String str) {
            kn.aa.incrementAndGet();
            this.b = str;
            return this;
        }

        private a a(int i) {
            kn.aa.incrementAndGet();
            this.a = i;
            return this;
        }

        public final void a(Object... objArr) {
            kn.aa.incrementAndGet();
            kn.b(this.a, this.b, objArr);
            kn.Z.a(this);
        }

        @Override // com.tencent.mapsdk.internal.kv.h
        public final kv.l a() {
            return new kv.d();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c {
        String b;
        b d;
        Map<String, Object> e;
        String f;
        String g;
        private String h;
        List<Long> c = new CopyOnWriteArrayList();
        AtomicInteger a = new AtomicInteger(0);

        c(String str, String str2) {
            this.h = str;
            this.b = str2;
        }

        final boolean a(String str) {
            return this.b.equals(str);
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            if (!TextUtils.isEmpty(this.g)) {
                sb.append(this.g);
            }
            if (!this.h.equals(this.b)) {
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb.append(this.h);
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb.append(this.b);
            } else {
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb.append(this.h);
            }
            if (!TextUtils.isEmpty(this.f)) {
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb.append(this.f);
            }
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb.toString();
        }

        public final void a(String str, Object obj) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.e == null) {
                this.e = new Hashtable();
            }
            this.e.put(str, obj);
        }

        public final Object b(String str) {
            if (this.e != null) {
                return this.e.get(str);
            }
            return null;
        }

        public final String toString() {
            return "TraceInfo{id='" + this.b + "', values=" + this.e + '}';
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void b() {
            this.a.set(0);
            this.c.clear();
            this.d = null;
            if (this.e != null) {
                this.e.clear();
            }
        }
    }

    public static void a(Object... objArr) {
        if (kj.d(ki.d)) {
            aa.incrementAndGet();
            b(3, ki.d, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        r4 = r8.getParameterTypes();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(int r11, java.lang.String r12, java.lang.Object... r13) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.kn.b(int, java.lang.String, java.lang.Object[]):void");
    }

    public static int a(String str, String str2, int i) {
        if (h(str)) {
            Map<String, c> map = ab.get(str);
            c cVar = map != null ? map.get(str) : null;
            if (cVar != null) {
                Object b2 = cVar.b(str2);
                if (b2 instanceof AtomicInteger) {
                    if (i <= 0) {
                        i = 1;
                    }
                    AtomicInteger atomicInteger = (AtomicInteger) b2;
                    int i2 = atomicInteger.get() + i;
                    atomicInteger.set(i2);
                    return i2;
                }
                cVar.a(str2, new AtomicInteger(1));
                return 1;
            }
            return -1;
        }
        return -1;
    }

    private static boolean j(String str) {
        return i(str, str) != null;
    }
}
