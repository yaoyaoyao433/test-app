package com.sankuai.waimai.mach;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static String c = null;
    private static String d = null;
    private static Map<String, Object> e = null;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static String k = "";
    private static boolean l = false;
    private static boolean m = false;
    private static int n = 0;
    private static int o = 2;
    private static int p = 0;
    private static int q = 0;
    private static int r = 1;
    private static boolean s = false;
    private static boolean t = false;
    private static boolean u = false;

    public static int a() {
        return r;
    }

    public static void a(int i2) {
        r = i2;
    }

    public static String b() {
        return c;
    }

    public static void a(String str) {
        c = str;
    }

    public static void a(boolean z) {
        h = z;
    }

    public static boolean c() {
        return h;
    }

    public static void b(boolean z) {
        m = z;
    }

    public static boolean d() {
        return m;
    }

    public static void b(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c94adb3fad3c789a07307ed2255c96ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c94adb3fad3c789a07307ed2255c96ab");
            return;
        }
        n = i2;
        o = Math.max(2, n);
    }

    public static boolean e() {
        return t;
    }

    public static void c(boolean z) {
        t = z;
    }

    public static boolean f() {
        return u;
    }

    public static void d(boolean z) {
        u = z;
    }

    public static int g() {
        return o;
    }

    public static boolean h() {
        return i;
    }

    public static void e(boolean z) {
        i = z;
    }

    public static int i() {
        return p;
    }

    public static void c(int i2) {
        p = i2;
    }

    public static int j() {
        return q;
    }

    public static void d(int i2) {
        q = i2;
    }

    public static boolean k() {
        return f;
    }

    public static void f(boolean z) {
        f = z;
    }

    public static boolean l() {
        return g;
    }

    public static void g(boolean z) {
        g = z;
    }

    public static boolean m() {
        return j;
    }

    public static void h(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9357a4b7cd409e0e767a262f3b7d45f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9357a4b7cd409e0e767a262f3b7d45f4");
            return;
        }
        com.sankuai.waimai.mach.log.b.b("MachConfig", "textViewMeasure:" + z);
        j = z;
    }

    public static boolean n() {
        return l;
    }

    public static void i(boolean z) {
        l = z;
    }

    public static boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb608f4555c471cd278cac5c86e55a29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb608f4555c471cd278cac5c86e55a29")).booleanValue();
        }
        if (TextUtils.isEmpty(k)) {
            return false;
        }
        return k.contains("true");
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "378e18ac8ee9dea737f011a7a307ed5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "378e18ac8ee9dea737f011a7a307ed5d");
            return;
        }
        com.sankuai.waimai.mach.log.b.b("MachConfig", "textMeasureDeviceType : " + str);
        k = str;
    }

    private static Map<String, Object> t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e05e044c87b45a86b20834260945a281", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e05e044c87b45a86b20834260945a281");
        }
        if (e == null) {
            e = com.sankuai.waimai.mach.utils.b.a(d);
        }
        return e;
    }

    public static void c(String str) {
        d = str;
    }

    public static long p() {
        long parseLong;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8854623750068a360c36d572f0cb2105", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8854623750068a360c36d572f0cb2105")).longValue();
        }
        try {
            Object obj = t().get("sync_load_timeout");
            if (obj instanceof Long) {
                parseLong = ((Long) obj).longValue();
            } else if (!(obj instanceof String)) {
                return 0L;
            } else {
                parseLong = Long.parseLong((String) obj);
            }
            return parseLong;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void j(boolean z) {
        s = z;
    }

    public static long q() {
        long parseLong;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9726bda7fdb5f0ffd3c52ab8ea0c45a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9726bda7fdb5f0ffd3c52ab8ea0c45a4")).longValue();
        }
        try {
            Object obj = t().get("sync_async_load_timeout");
            if (obj instanceof Long) {
                parseLong = ((Long) obj).longValue();
            } else if (!(obj instanceof String)) {
                return -1L;
            } else {
                parseLong = Long.parseLong((String) obj);
            }
            return parseLong;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static long r() {
        long parseLong;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2000345e47c14bc25a444e4e3ac25a84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2000345e47c14bc25a444e4e3ac25a84")).longValue();
        }
        try {
            Object obj = t().get("file_move_timeout");
            if (obj instanceof Long) {
                parseLong = ((Long) obj).longValue();
            } else if (!(obj instanceof String)) {
                return -1L;
            } else {
                parseLong = Long.parseLong((String) obj);
            }
            return parseLong;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static long s() {
        long parseLong;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce259a7d5926353eff20d215971f788b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce259a7d5926353eff20d215971f788b")).longValue();
        }
        try {
            Object obj = t().get("file_retry_count");
            if (obj instanceof Long) {
                parseLong = ((Long) obj).longValue();
            } else if (!(obj instanceof String)) {
                return -1L;
            } else {
                parseLong = Long.parseLong((String) obj);
            }
            return parseLong;
        } catch (Exception unused) {
            return -1L;
        }
    }
}
