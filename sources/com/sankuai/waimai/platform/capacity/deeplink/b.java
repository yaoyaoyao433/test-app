package com.sankuai.waimai.platform.capacity.deeplink;

import android.app.Activity;
import android.os.SystemClock;
import android.util.Log;
import com.meituan.android.common.kitefly.Log;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static String d;
    private static String f;
    private static String g;
    private static String h;
    private static String i;
    private static String k;
    private static boolean l;
    private static boolean m;
    private static boolean n;
    private static boolean o;
    private static boolean p;
    private static final long b = TimeUtil.processStartElapsedTimeMillis();
    private static final Map<String, Long> c = new ConcurrentHashMap();
    private static boolean e = false;
    private static final Executor j = com.sankuai.android.jarvis.c.b();
    private static int q = 0;

    public static boolean a() {
        return q != 0;
    }

    public static boolean b() {
        return e;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04ccd6aa56781763d57d17a3230a608a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04ccd6aa56781763d57d17a3230a608a");
        } else if (e) {
        } else {
            new StringBuilder("cancelReport: ").append(str);
            f = str;
            e = true;
            d = null;
        }
    }

    public static void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfda2b3ee5f0e249a08dee2110510c79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfda2b3ee5f0e249a08dee2110510c79");
        } else if (e || c.containsKey(str)) {
        } else {
            d = str;
            final long elapsedRealtime = SystemClock.elapsedRealtime() - b;
            c.put(str, Long.valueOf(elapsedRealtime));
            if ("t2".equals(str) && com.sankuai.waimai.foundation.core.a.b()) {
                Log.w("DeepLink", str, new Exception());
            }
            if ("t3".equals(str)) {
                e = true;
                d = null;
                if (com.sankuai.waimai.foundation.core.a.b()) {
                    Log.w("DeepLink", str, new Exception());
                }
            }
            com.sankuai.waimai.launcher.util.aop.b.a(j, new Runnable() { // from class: com.sankuai.waimai.platform.capacity.deeplink.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e50a78a837949bd79838cd2ec9892a6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e50a78a837949bd79838cd2ec9892a6b");
                    } else {
                        b.a(str, elapsedRealtime, (Map<String, Object>) null);
                    }
                }
            });
        }
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a937e56ce75600972565f47379ba8230", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a937e56ce75600972565f47379ba8230")).booleanValue() : c.put(str, 0L) == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150 A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:7:0x0046, B:9:0x005e, B:87:0x0224, B:88:0x0227, B:10:0x0066, B:12:0x008e, B:81:0x01df, B:85:0x021f, B:13:0x0096, B:15:0x009a, B:17:0x00a2, B:19:0x00aa, B:21:0x00b0, B:23:0x00c0, B:25:0x00cf, B:31:0x00f3, B:33:0x0100, B:55:0x014c, B:66:0x018b, B:69:0x0195, B:71:0x019b, B:73:0x01ac, B:75:0x01b8, B:76:0x01be, B:78:0x01ca, B:79:0x01cf, B:57:0x0150, B:59:0x0164, B:60:0x016b, B:61:0x0171, B:62:0x0177, B:42:0x011e, B:45:0x0129, B:48:0x0134, B:51:0x013f, B:63:0x017d, B:65:0x0186, B:26:0x00d6, B:28:0x00de, B:30:0x00ed, B:80:0x01dd), top: B:94:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:7:0x0046, B:9:0x005e, B:87:0x0224, B:88:0x0227, B:10:0x0066, B:12:0x008e, B:81:0x01df, B:85:0x021f, B:13:0x0096, B:15:0x009a, B:17:0x00a2, B:19:0x00aa, B:21:0x00b0, B:23:0x00c0, B:25:0x00cf, B:31:0x00f3, B:33:0x0100, B:55:0x014c, B:66:0x018b, B:69:0x0195, B:71:0x019b, B:73:0x01ac, B:75:0x01b8, B:76:0x01be, B:78:0x01ca, B:79:0x01cf, B:57:0x0150, B:59:0x0164, B:60:0x016b, B:61:0x0171, B:62:0x0177, B:42:0x011e, B:45:0x0129, B:48:0x0134, B:51:0x013f, B:63:0x017d, B:65:0x0186, B:26:0x00d6, B:28:0x00de, B:30:0x00ed, B:80:0x01dd), top: B:94:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171 A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:7:0x0046, B:9:0x005e, B:87:0x0224, B:88:0x0227, B:10:0x0066, B:12:0x008e, B:81:0x01df, B:85:0x021f, B:13:0x0096, B:15:0x009a, B:17:0x00a2, B:19:0x00aa, B:21:0x00b0, B:23:0x00c0, B:25:0x00cf, B:31:0x00f3, B:33:0x0100, B:55:0x014c, B:66:0x018b, B:69:0x0195, B:71:0x019b, B:73:0x01ac, B:75:0x01b8, B:76:0x01be, B:78:0x01ca, B:79:0x01cf, B:57:0x0150, B:59:0x0164, B:60:0x016b, B:61:0x0171, B:62:0x0177, B:42:0x011e, B:45:0x0129, B:48:0x0134, B:51:0x013f, B:63:0x017d, B:65:0x0186, B:26:0x00d6, B:28:0x00de, B:30:0x00ed, B:80:0x01dd), top: B:94:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177 A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:7:0x0046, B:9:0x005e, B:87:0x0224, B:88:0x0227, B:10:0x0066, B:12:0x008e, B:81:0x01df, B:85:0x021f, B:13:0x0096, B:15:0x009a, B:17:0x00a2, B:19:0x00aa, B:21:0x00b0, B:23:0x00c0, B:25:0x00cf, B:31:0x00f3, B:33:0x0100, B:55:0x014c, B:66:0x018b, B:69:0x0195, B:71:0x019b, B:73:0x01ac, B:75:0x01b8, B:76:0x01be, B:78:0x01ca, B:79:0x01cf, B:57:0x0150, B:59:0x0164, B:60:0x016b, B:61:0x0171, B:62:0x0177, B:42:0x011e, B:45:0x0129, B:48:0x0134, B:51:0x013f, B:63:0x017d, B:65:0x0186, B:26:0x00d6, B:28:0x00de, B:30:0x00ed, B:80:0x01dd), top: B:94:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r26, long r27, java.util.Map<java.lang.String, java.lang.Object> r29) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.capacity.deeplink.b.a(java.lang.String, long, java.util.Map):void");
    }

    public static Log.Builder a(String str, String str2, long j2) {
        Object[] objArr = {str, str2, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4e96eb202f17108e377551ac498376f", RobustBitConfig.DEFAULT_VALUE) ? (Log.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4e96eb202f17108e377551ac498376f") : new Log.Builder("").reportChannel(str).tag(str2).newLogStatus(true).lv4LocalStatus(true).generalChannelStatus(true).value(j2);
    }

    public static String c() {
        return d;
    }

    public static void d(String str) {
        g = str;
    }

    public static String d() {
        return g;
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "677fc90a0713f0c2487771208ed2f727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "677fc90a0713f0c2487771208ed2f727");
        } else {
            k = activity.getClass().getName();
        }
    }

    public static void a(int i2) {
        q = i2;
    }

    public static void a(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6a9c3d69e1a70dda5f4a0cd55015254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6a9c3d69e1a70dda5f4a0cd55015254");
            return;
        }
        l = z;
        m = z2;
        n = z3;
        if (!z && !z2 && !z3) {
            z4 = true;
        }
        o = z4;
    }

    public static boolean e() {
        return o;
    }

    public static boolean f() {
        return n;
    }

    public static boolean g() {
        return l;
    }

    public static boolean h() {
        return m;
    }

    public static void i() {
        p = true;
    }
}
