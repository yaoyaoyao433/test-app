package com.meituan.met.mercury.load.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.channel.ChannelReader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static volatile Context b = null;
    public static volatile l c = null;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    private static String i = null;
    private static long j = 0;
    private static String k = null;
    private static String l = "";

    public static String f() {
        return "1.3.22";
    }

    public static void a(Context context, l lVar) {
        Object[] objArr = {context, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13ca74ccf0ad0d80c7adf135792f132b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13ca74ccf0ad0d80c7adf135792f132b");
        } else if ((context == null && b == null) || (c == null && lVar == null)) {
            throw new f((short) 1, "init prepare error !");
        } else {
            if (b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                b = context;
                k = context.getPackageName();
            }
            if (c == null && lVar != null) {
                c = lVar;
            }
            com.meituan.met.mercury.load.utils.c.a("DDLoaderContext prepared");
        }
    }

    public static void a() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31450a82672ec2bc3177be327f179e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31450a82672ec2bc3177be327f179e32");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6e63b4178947b6a9f4a26f7d5fcf9aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6e63b4178947b6a9f4a26f7d5fcf9aed");
        } else if (TextUtils.isEmpty(i) || j <= 0) {
            try {
                PackageInfo packageInfo = b.getPackageManager().getPackageInfo(k, 64);
                if (packageInfo != null) {
                    i = packageInfo.versionName;
                    j = packageInfo.versionCode;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5566a2558331a8b298d998341c650b60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5566a2558331a8b298d998341c650b60");
        } else {
            String channelInfo = ChannelReader.getChannelInfo(b, "buildNum");
            if (!TextUtils.isEmpty(channelInfo)) {
                l = channelInfo;
            } else {
                String channelInfo2 = ChannelReader.getChannelInfo(b, "mtbuildtime");
                if (!TextUtils.isEmpty(channelInfo2) && (split = channelInfo2.split("\\.")) != null && split.length >= 3) {
                    l = split[2];
                }
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "1d747e3a475acd33002643364823cdef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "1d747e3a475acd33002643364823cdef");
        } else {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            boolean booleanValue = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "0d3d6da7ea922a27f4c61cc3742e7eb2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "0d3d6da7ea922a27f4c61cc3742e7eb2")).booleanValue() : m().b("dev_tools_mode", false);
            d = booleanValue;
            if (booleanValue) {
                com.meituan.met.mercury.load.utils.c.a("DDLoaderContext setup devToolsMode is true");
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                e = PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "1f7839dc77f14000d7f5129d4d983bb8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "1f7839dc77f14000d7f5129d4d983bb8")).booleanValue() : m().b("enable_debug_log", false);
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                f = PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "5acf0fce68cbabd8b4c6ba0d6819554b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "5acf0fce68cbabd8b4c6ba0d6819554b")).booleanValue() : m().b("test_env", false);
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = a;
                g = PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "55ad22941dc174fc425bedc97de36bab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "55ad22941dc174fc425bedc97de36bab")).booleanValue() : m().b("dev_tools_enable_clean", false);
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = a;
                h = PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "747ab91b7d666557e78110b37beb950f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "747ab91b7d666557e78110b37beb950f")).booleanValue() : m().b("dev_tools_pike_test", false);
            }
        }
        com.meituan.met.mercury.load.utils.c.a("DDLoaderContext setup");
    }

    public static Context b() {
        return b;
    }

    public static l c() {
        return c;
    }

    public static String d() {
        return i;
    }

    public static long e() {
        return j;
    }

    public static String g() {
        return k;
    }

    public static String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9753ef6c619e2e1e49adfdd3a4271a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9753ef6c619e2e1e49adfdd3a4271a4");
        }
        if (c == null) {
            return null;
        }
        return c.getUuid();
    }

    public static String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d03343f9c792474dc7a6c787affff2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d03343f9c792474dc7a6c787affff2e");
        }
        if (c == null) {
            return null;
        }
        return c.getUserId();
    }

    public static String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cef3879b0b0d64587b18ef51c96c9a00", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cef3879b0b0d64587b18ef51c96c9a00");
        }
        if (c == null) {
            return null;
        }
        return c.getCityId();
    }

    public static String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "128d309a9099bac6c2f20f2bed3cfe6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "128d309a9099bac6c2f20f2bed3cfe6d");
        }
        if (c == null) {
            return null;
        }
        return c.getChannel();
    }

    public static boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0d46ea2d82f28eac7ea83dd2e3fc2fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0d46ea2d82f28eac7ea83dd2e3fc2fe")).booleanValue();
        }
        if (c == null) {
            return false;
        }
        return c.enableDebug();
    }

    public static com.meituan.android.cipstorage.q m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e497455c229ca938bb828d8782cb4c7a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e497455c229ca938bb828d8782cb4c7a") : com.meituan.android.cipstorage.q.a(b, "ddload", 2);
    }

    public static com.meituan.android.cipstorage.q a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a24ac46da10dfe8f13decb5927771e4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a24ac46da10dfe8f13decb5927771e4") : com.meituan.android.cipstorage.q.a(b, str, 2);
    }

    public static File a(String str, String str2, String str3, String str4, u uVar) {
        Object[] objArr = {str, str2, str3, str4, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2167f120313ebdad50f75ccf925d6470", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2167f120313ebdad50f75ccf925d6470") : a(null, str, str2, str3, str4, uVar);
    }

    public static File a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcd468276f420ee042d1c4ac1e0a0be3", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcd468276f420ee042d1c4ac1e0a0be3") : a(null, str, str2, str3, str4, u.e);
    }

    public static File b(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b025598e19d4a0724f81f95d2f13bf0d", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b025598e19d4a0724f81f95d2f13bf0d") : a("temp/zip", str, str2, str3, str4, u.b);
    }

    public static File c(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a3dc6c0601e0a31ed2176be3eb0734d", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a3dc6c0601e0a31ed2176be3eb0734d") : a("preload/zip", str, str2, str3, str4, u.b);
    }

    public static File d(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3a9024df05a003777909a5c03325f24", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3a9024df05a003777909a5c03325f24") : a("temp/patch", str, str2, str3, str4, u.b);
    }

    public static File e(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b13582cd7dd06e3b17e0b0b196ec745c", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b13582cd7dd06e3b17e0b0b196ec745c") : a("preload/patch", str, str2, str3, str4, u.b);
    }

    private static File a(String str, String str2, String str3, String str4, String str5, u uVar) {
        Object[] objArr = {str, str2, str3, str4, str5, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6886c780c853ca39f004b6ce25b119b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6886c780c853ca39f004b6ce25b119b0");
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(File.separator);
        }
        if (TextUtils.isEmpty(str2)) {
            return com.meituan.android.cipstorage.q.a(b, "ddload", sb.toString(), uVar);
        }
        sb.append(str2);
        sb.append(File.separator);
        if (TextUtils.isEmpty(str3)) {
            return com.meituan.android.cipstorage.q.a(b, "ddload", sb.toString(), uVar);
        }
        sb.append(str3);
        sb.append(File.separator);
        if (TextUtils.isEmpty(str4)) {
            return com.meituan.android.cipstorage.q.a(b, "ddload", sb.toString(), uVar);
        }
        sb.append(str4);
        sb.append(File.separator);
        if (TextUtils.isEmpty(str5)) {
            return com.meituan.android.cipstorage.q.a(b, "ddload", sb.toString(), uVar);
        }
        sb.append(str5);
        return com.meituan.android.cipstorage.q.a(b, "ddload", sb.toString(), uVar);
    }

    public static File a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1ba8f71523167201aec78c6a0e81159", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1ba8f71523167201aec78c6a0e81159");
        }
        u uVar = u.b;
        if (i2 == 1) {
            uVar = u.e;
        }
        return com.meituan.android.cipstorage.q.a(b, "ddload", "", uVar);
    }

    public static File n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32d143b6a0497ddaebad845d8e45dea3", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32d143b6a0497ddaebad845d8e45dea3");
        }
        File a2 = com.meituan.android.cipstorage.q.a(b, "ddload", "config", u.e);
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    private static String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6973322e2976747de29e76e64940f635", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6973322e2976747de29e76e64940f635");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        if (!TextUtils.isEmpty(l)) {
            sb.append(CommonConstant.Symbol.UNDERLINE);
            sb.append(l);
        }
        if (!TextUtils.isEmpty(sb)) {
            sb.append("+");
        }
        return sb.toString();
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58d1a5937529f03f307f78eb35e87291", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58d1a5937529f03f307f78eb35e87291") : c(str, "");
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "125d42efce61a41beab2e89b28794fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "125d42efce61a41beab2e89b28794fc3");
        } else {
            b(str, str2);
        }
    }

    public static boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84ece2c7a23eda23c0825ade08bda6ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84ece2c7a23eda23c0825ade08bda6ea")).booleanValue();
        }
        String o = o();
        if (TextUtils.isEmpty(o) || TextUtils.isEmpty(str2)) {
            return false;
        }
        com.meituan.android.cipstorage.q m = m();
        return m.a(str, o + str2);
    }

    public static String c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95d806a222add06445c6acba03b8f4e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95d806a222add06445c6acba03b8f4e1");
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            String o = o();
            String b2 = m().b(str, "");
            if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(o) && b2.startsWith(o)) {
                return b2.substring(o.length());
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }
}
