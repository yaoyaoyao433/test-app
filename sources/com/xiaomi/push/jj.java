package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.waimai.foundation.location.locatesdk.LocateSDK;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes6.dex */
public final class jj {
    private static volatile int a = 0;
    private static int b = -1;
    private static Map<String, jn> c;

    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + StringUtil.SPACE + a(intent.getExtras());
    }

    private static String a(Bundle bundle) {
        String a2;
        Object[] objArr;
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append(StringUtil.NULL);
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    a2 = Arrays.toString((int[]) obj);
                } else if (obj instanceof byte[]) {
                    a2 = Arrays.toString((byte[]) obj);
                } else if (obj instanceof boolean[]) {
                    a2 = Arrays.toString((boolean[]) obj);
                } else if (obj instanceof short[]) {
                    a2 = Arrays.toString((short[]) obj);
                } else if (obj instanceof long[]) {
                    a2 = Arrays.toString((long[]) obj);
                } else if (obj instanceof float[]) {
                    a2 = Arrays.toString((float[]) obj);
                } else if (obj instanceof double[]) {
                    a2 = Arrays.toString((double[]) obj);
                } else {
                    if (obj instanceof String[]) {
                        objArr = (String[]) obj;
                    } else if (obj instanceof CharSequence[]) {
                        objArr = (CharSequence[]) obj;
                    } else if (obj instanceof Parcelable[]) {
                        objArr = (Parcelable[]) obj;
                    } else if (obj instanceof Bundle) {
                        a2 = a((Bundle) obj);
                    } else {
                        sb.append(obj);
                        z = false;
                    }
                    a2 = Arrays.toString(objArr);
                }
                sb.append(a2);
                z = false;
            }
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    public static String a(String str) {
        try {
            try {
                return (String) am.a("android.os.SystemProperties", "get", str, "");
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.d("fail to get property. " + e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean a() {
        return j() == 1;
    }

    public static int b(Context context) {
        String a2 = a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(a2) || !TextUtils.isDigitsOnly(a2)) {
            return 0;
        }
        return Integer.parseInt(a2);
    }

    public static boolean b() {
        return j() == 2;
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String c() {
        int b2 = jr.b();
        return (!a() || b2 <= 0) ? "" : b2 < 2 ? "alpha" : b2 < 3 ? "development" : "stable";
    }

    public static boolean d() {
        if (b < 0) {
            b = !k() ? 1 : 0;
        }
        return b > 0;
    }

    public static boolean f() {
        return !jn.China.name().equalsIgnoreCase(b(e()).name());
    }

    public static String g() {
        return a("ro.miui.ui.version.name");
    }

    public static String h() {
        return a("ro.build.characteristics");
    }

    public static String i() {
        return a("ro.product.manufacturer");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int j() {
        /*
            int r0 = com.xiaomi.push.jj.a
            if (r0 != 0) goto L44
            r0 = 0
            java.lang.String r1 = "ro.miui.ui.version.code"
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            r2 = 1
            if (r1 == 0) goto L21
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            if (r1 == 0) goto L25
            goto L26
        L25:
            r2 = 2
        L26:
            com.xiaomi.push.jj.a = r2     // Catch: java.lang.Throwable -> L29
            goto L31
        L29:
            r1 = move-exception
            java.lang.String r2 = "get isMIUI failed"
            com.xiaomi.channel.commonutils.logger.c.a(r2, r1)
            com.xiaomi.push.jj.a = r0
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isMIUI's value is: "
            r0.<init>(r1)
            int r1 = com.xiaomi.push.jj.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.c.b(r0)
        L44:
            int r0 = com.xiaomi.push.jj.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jj.j():int");
    }

    private static boolean k() {
        String str;
        try {
            str = jq.a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
            str = "";
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean a(Context context) {
        return context != null && "com.xiaomi.xmsf".equals(context.getPackageName());
    }

    public static String e() {
        String a2 = jq.a("ro.miui.region", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("ro.product.country.region", "");
            if (!TextUtils.isEmpty(a2)) {
                String[] split = a2.split(CommonConstant.Symbol.MINUS);
                if (split.length > 0) {
                    a2 = split[0];
                }
            }
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = jq.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a2)) {
            com.xiaomi.channel.commonutils.logger.c.a("get region from system, region = " + a2);
        }
        if (TextUtils.isEmpty(a2)) {
            String country = Locale.getDefault().getCountry();
            com.xiaomi.channel.commonutils.logger.c.a("locale.default.country = " + country);
            return country;
        }
        return a2;
    }

    public static jn b(String str) {
        if (c == null) {
            HashMap hashMap = new HashMap();
            c = hashMap;
            hashMap.put("CN", jn.China);
            c.put("FI", jn.Europe);
            c.put("SE", jn.Europe);
            c.put("NO", jn.Europe);
            c.put("FO", jn.Europe);
            c.put("EE", jn.Europe);
            c.put("LV", jn.Europe);
            c.put("LT", jn.Europe);
            c.put("BY", jn.Europe);
            c.put("MD", jn.Europe);
            c.put("UA", jn.Europe);
            c.put("PL", jn.Europe);
            c.put("CZ", jn.Europe);
            c.put("SK", jn.Europe);
            c.put("HU", jn.Europe);
            c.put("DE", jn.Europe);
            c.put("AT", jn.Europe);
            c.put("CH", jn.Europe);
            c.put("LI", jn.Europe);
            c.put("GB", jn.Europe);
            c.put("IE", jn.Europe);
            c.put("NL", jn.Europe);
            c.put("BE", jn.Europe);
            c.put("LU", jn.Europe);
            c.put("FR", jn.Europe);
            c.put("RO", jn.Europe);
            c.put("BG", jn.Europe);
            c.put("RS", jn.Europe);
            c.put("MK", jn.Europe);
            c.put("AL", jn.Europe);
            c.put("GR", jn.Europe);
            c.put("SI", jn.Europe);
            c.put("HR", jn.Europe);
            c.put("IT", jn.Europe);
            c.put("SM", jn.Europe);
            c.put(LocateSDK.MT, jn.Europe);
            c.put("ES", jn.Europe);
            c.put("PT", jn.Europe);
            c.put("AD", jn.Europe);
            c.put("CY", jn.Europe);
            c.put("DK", jn.Europe);
            c.put("RU", jn.Russia);
            c.put("IN", jn.India);
        }
        jn jnVar = c.get(str.toUpperCase());
        return jnVar == null ? jn.Global : jnVar;
    }
}
