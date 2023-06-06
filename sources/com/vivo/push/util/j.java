package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    public static final boolean a = z.b("ro.vivo.product.overseas", "no").equals("yes");
    public static final String b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final boolean g;
    public static final boolean h;
    private static Method i;
    private static String j;
    private static String k;
    private static String l;
    private static String m;

    public static String a(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    public static synchronized String a() {
        synchronized (j.class) {
            if (j == null && k == null) {
                try {
                    Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
                    i = declaredMethod;
                    declaredMethod.setAccessible(true);
                    j = (String) i.invoke(null, "ro.vivo.rom", "@><@");
                    k = (String) i.invoke(null, "ro.vivo.rom.version", "@><@");
                } catch (Exception unused) {
                    p.b("Device", "getRomCode error");
                }
            }
            p.d("Device", "sRomProperty1 : " + j + " ; sRomProperty2 : " + k);
            String a2 = a(j);
            if (TextUtils.isEmpty(a2)) {
                String a3 = a(k);
                if (TextUtils.isEmpty(a3)) {
                    return null;
                }
                return a3;
            }
            return a2;
        }
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("rom_([\\d]*).?([\\d]*)", 2).matcher(str);
        if (matcher.find()) {
            StringBuilder sb = new StringBuilder();
            sb.append(matcher.group(1));
            sb.append(TextUtils.isEmpty(matcher.group(2)) ? "0" : matcher.group(2).substring(0, 1));
            return sb.toString();
        }
        return null;
    }

    private static boolean b(String str) {
        String b2 = z.b("ro.vivo.rom", "");
        String b3 = z.b("ro.vivo.rom.version", "");
        p.d("Device", "ro.vivo.rom = " + b2 + " ; ro.vivo.rom.version = " + b3);
        if (b2 == null || !b2.contains(str)) {
            return b3 != null && b3.contains(str);
        }
        return true;
    }

    public static boolean b() {
        if (TextUtils.isEmpty(Build.MANUFACTURER)) {
            p.d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        p.d("Device", "Build.MANUFACTURER is " + Build.MANUFACTURER);
        return Build.MANUFACTURER.toLowerCase().contains("bbk") || Build.MANUFACTURER.toLowerCase().startsWith("vivo");
    }

    static {
        String b2;
        if (Build.VERSION.SDK_INT >= 26) {
            b2 = z.b("ro.product.country.region", ErrorCode.ERROR_TYPE_N);
        } else {
            b2 = z.b("ro.product.customize.bbk", ErrorCode.ERROR_TYPE_N);
        }
        b = b2;
        c = "RU".equals(b);
        d = "IN".equals(b);
        e = b("rom_1.0");
        f = b("rom_2.0");
        g = b("rom_2.5");
        h = b("rom_3.0");
        j = null;
        k = null;
        l = "";
        m = "";
    }
}
