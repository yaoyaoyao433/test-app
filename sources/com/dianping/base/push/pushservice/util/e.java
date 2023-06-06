package com.dianping.base.push.pushservice.util;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e {
    public static ChangeQuickRedirect a = null;
    private static final String b = "e";

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        MIUI_ROM,
        EMUI_ROM,
        FLYME_ROM,
        FUNTOUCH_ROM,
        COLOROS_ROM,
        OTHER_ROM;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1e0614f1805c00407ea5d69fee720d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1e0614f1805c00407ea5d69fee720d");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a98e28825a670dd9dda7a2956a6c587", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a98e28825a670dd9dda7a2956a6c587") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9403b09431d51c5d867a4aaf8c667f49", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9403b09431d51c5d867a4aaf8c667f49") : (a[]) values().clone();
        }
    }

    private static a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8443d6882510d3a3134fd0ec4b3624ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8443d6882510d3a3134fd0ec4b3624ca");
        }
        a aVar = a.OTHER_ROM;
        try {
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d(b, e.toString());
        }
        if (c()) {
            return a.EMUI_ROM;
        }
        if (d()) {
            return a.FUNTOUCH_ROM;
        }
        if (f()) {
            return a.COLOROS_ROM;
        }
        if (b()) {
            return a.MIUI_ROM;
        }
        if (e()) {
            return a.FLYME_ROM;
        }
        String str = b;
        com.dianping.base.push.pushservice.c.b(str, "ROM_TYPE = " + aVar);
        return aVar;
    }

    public static String a() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9dd7117f9a1aa489f16059097198851d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9dd7117f9a1aa489f16059097198851d");
        }
        try {
            switch (g()) {
                case MIUI_ROM:
                    str = "miui " + c("ro.miui.ui.version.name");
                    break;
                case EMUI_ROM:
                    str = c("ro.build.version.emui");
                    break;
                case FLYME_ROM:
                    str = c("ro.build.display.id");
                    break;
                case FUNTOUCH_ROM:
                    str = c("ro.vivo.os.build.display.id");
                    break;
                case COLOROS_ROM:
                    str = c("ro.build.version.opporom");
                    break;
                default:
                    str = "";
                    break;
            }
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d(b, e.toString());
            str = "";
        }
        com.dianping.base.push.pushservice.c.b(b, "ROM_VERSION = " + str);
        return str;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32680d39e06fa08095f84db02c02a05a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32680d39e06fa08095f84db02c02a05a")).booleanValue() : Build.MANUFACTURER.equalsIgnoreCase("xiaomi");
    }

    public static boolean c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47bf0a0cd42eb9bb83806537926d6294", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47bf0a0cd42eb9bb83806537926d6294")).booleanValue();
        }
        if (("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) ? true : true) {
            return true;
        }
        return h();
    }

    private static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd6c2c9a0945adc264155051a963f381", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd6c2c9a0945adc264155051a963f381")).booleanValue() : !TextUtils.isEmpty(c("ro.build.version.emui"));
    }

    private static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f435432696c5e827b558197bb3ba577", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f435432696c5e827b558197bb3ba577")).booleanValue() : !TextUtils.isEmpty(c(str));
    }

    private static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aba412b7cf505503c40f7e3f8743a6e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aba412b7cf505503c40f7e3f8743a6e0");
        }
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            String str2 = b;
            com.dianping.base.push.pushservice.c.b(str2, "getProp: " + e.toString());
            return "";
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b65725e3540ef2c2a157ed8e54382ae9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b65725e3540ef2c2a157ed8e54382ae9")).booleanValue() : Build.MANUFACTURER.equalsIgnoreCase(str);
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5474e13fe8ef3fd454738098d233990d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5474e13fe8ef3fd454738098d233990d")).booleanValue();
        }
        try {
            return Build.BRAND.toLowerCase().contains("vivo");
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d(b, e.toString());
            return false;
        }
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de3fa52083a4821dbad028327a03f07a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de3fa52083a4821dbad028327a03f07a")).booleanValue();
        }
        try {
            if (!b("persist.sys.use.flyme.icon") && !b("ro.meizu.setupwizard.flyme")) {
                if (!b("ro.flyme.published")) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d(b, e.toString());
            return a("Meizu");
        }
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23352ec3c53efd4c20c80ceec01ead55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23352ec3c53efd4c20c80ceec01ead55")).booleanValue();
        }
        try {
            return Build.BRAND.toLowerCase().contains("oppo");
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d(b, e.toString());
            return false;
        }
    }
}
