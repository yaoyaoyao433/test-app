package com.sankuai.xm.base.init;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.m;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static volatile long b = 0;
    private static volatile long c = 0;
    private static volatile long d = 0;
    private static volatile long e = 0;
    private static volatile long f = 0;
    private static volatile long g = 0;
    private static volatile long h = 0;
    private static volatile long i = 0;
    private static volatile long j = 0;
    private static volatile int k = 0;
    private static volatile boolean l = false;
    private static volatile boolean m = false;

    public static void a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "599aa671671bdcff8e893a4c2f27f2ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "599aa671671bdcff8e893a4c2f27f2ba");
        } else if (b == 0) {
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            b = j2;
            a(1);
            m.e().a(11, new Runnable() { // from class: com.sankuai.xm.base.init.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23f5bacbb16f6e0147c557363c0430a2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23f5bacbb16f6e0147c557363c0430a2");
                    } else {
                        b.i();
                    }
                }
            }, 10500L);
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "248faf2f53b557bdfc32d02275a7afd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "248faf2f53b557bdfc32d02275a7afd5");
            return;
        }
        if (c == 0) {
            c = System.currentTimeMillis();
        }
        g();
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51ce7dbf9907f4d9001730ebfcda2c8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51ce7dbf9907f4d9001730ebfcda2c8a");
        } else if (d == 0) {
            d = System.currentTimeMillis();
            h();
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12ad7bfb15ef01241a94d819b5dfb81f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12ad7bfb15ef01241a94d819b5dfb81f");
            return;
        }
        if (e == 0) {
            e = System.currentTimeMillis();
        }
        g();
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97cbe9ca2d1d03b34850b5ec3edcbcf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97cbe9ca2d1d03b34850b5ec3edcbcf2");
        } else if (f == 0) {
            f = System.currentTimeMillis();
            if (z) {
                a(2);
            }
        }
    }

    public static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "532a72ff0121f105a60bf30646f6a241", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "532a72ff0121f105a60bf30646f6a241");
            return;
        }
        if (g == 0) {
            g = System.currentTimeMillis();
        }
        g();
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcf870a76189b02873ad61d702e8db10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcf870a76189b02873ad61d702e8db10");
        } else if (h == 0) {
            h = System.currentTimeMillis();
            m = z;
        }
    }

    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be6356570d43fb904fb20796758a5f4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be6356570d43fb904fb20796758a5f4e");
            return;
        }
        if (i == 0) {
            i = System.currentTimeMillis();
        }
        g();
    }

    private static void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "881820411dc5614df9637da9ccc1ca4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "881820411dc5614df9637da9ccc1ca4d");
        } else if (i == 0 || g == 0 || e == 0 || c == 0) {
        } else {
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            i();
        }
    }

    public static void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01ab334e2978f73d586c87633375f920", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01ab334e2978f73d586c87633375f920");
        } else if (l) {
        } else {
            if ((f > 0 || d > 0) && i2 == 2) {
                return;
            }
            synchronized (b.class) {
                k = i2 | k;
            }
        }
    }

    private static long h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cde23a1031533dd40e4da28b4037afe", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cde23a1031533dd40e4da28b4037afe")).longValue();
        }
        long j2 = f.m().l;
        if (j2 != 0) {
            return j2;
        }
        long j3 = m.b().getLong("startup_stamp", 0L);
        if (j3 <= 0) {
            f.m().b(-1L);
        } else {
            f.m().b(b - j3);
        }
        m.b().a("startup_stamp", b);
        return f.m().l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26ac3165d666131cd19bdc4a81841fe0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26ac3165d666131cd19bdc4a81841fe0");
        } else if (l) {
        } else {
            if (j > 0 && j - b > 0) {
                a(j - b <= 10000 ? 1 : 64);
            } else {
                j = System.currentTimeMillis();
                a(64);
            }
            l = true;
            long h2 = h();
            HashMap hashMap = new HashMap();
            if (c - b >= 0 && b > 0) {
                hashMap.put("time", Long.valueOf(c - b));
            }
            if (e - d >= 0 && d > 0) {
                hashMap.put("l_1", Long.valueOf(e - d));
                hashMap.put("l_3", Long.valueOf(d - b));
            }
            if (g - f >= 0 && f > 0) {
                hashMap.put("login_time", Long.valueOf(g - f));
                hashMap.put("l_4", Long.valueOf(f - b));
            }
            if (i - h >= 0 && h > 0) {
                hashMap.put("l_2", Long.valueOf(i - h));
                hashMap.put("l_5", Long.valueOf(h - b));
            }
            hashMap.put("status", Integer.valueOf(k));
            hashMap.put("totaltime", Long.valueOf(j - b));
            hashMap.put("ts_preset", Long.valueOf(b));
            if (m) {
                hashMap.put("type", 1);
            }
            hashMap.put("interval", Long.valueOf(h2));
            m.d().a("execute_time", hashMap);
        }
    }
}
