package com.meituan.msc.common.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ap {
    public static ChangeQuickRedirect a;
    private static String b;
    private static String c;
    private static Class d;
    private static Method e;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76a7f7abc750ae8984ba143cc5f9a268", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76a7f7abc750ae8984ba143cc5f9a268")).booleanValue() : a(RouteSelector.ROM_EMUI);
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9b90a6aeb6aeb01f982fcdae65233ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9b90a6aeb6aeb01f982fcdae65233ea")).booleanValue() : a(RouteSelector.ROM_MIUI);
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0005e74ad6160a165bc61ae01372d136", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0005e74ad6160a165bc61ae01372d136")).booleanValue() : a(RouteSelector.ROM_VIVO);
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ccd2b965f237d481fde42509de51e65", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ccd2b965f237d481fde42509de51e65")).booleanValue() : a(RouteSelector.ROM_OPPO);
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12e92c3baf7b3fc6c4285461cfdc678a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12e92c3baf7b3fc6c4285461cfdc678a")).booleanValue() : a(RouteSelector.ROM_FLYME);
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b9d1814ab94719d88ca908e2163ef7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b9d1814ab94719d88ca908e2163ef7e")).booleanValue();
        }
        if (b != null) {
            return b.equals(str);
        }
        String b2 = b("ro.miui.ui.version.name");
        c = b2;
        if (!TextUtils.isEmpty(b2)) {
            b = RouteSelector.ROM_MIUI;
        } else {
            String b3 = b("ro.build.version.emui");
            c = b3;
            if (!TextUtils.isEmpty(b3)) {
                b = RouteSelector.ROM_EMUI;
            } else {
                String b4 = b("ro.build.version.opporom");
                c = b4;
                if (!TextUtils.isEmpty(b4)) {
                    b = RouteSelector.ROM_OPPO;
                } else {
                    String b5 = b("ro.vivo.os.version");
                    c = b5;
                    if (!TextUtils.isEmpty(b5)) {
                        b = RouteSelector.ROM_VIVO;
                    } else {
                        String b6 = b("ro.smartisan.version");
                        c = b6;
                        if (!TextUtils.isEmpty(b6)) {
                            b = "SMARTISAN";
                        } else {
                            String str2 = Build.DISPLAY;
                            c = str2;
                            if (str2.toUpperCase().contains(RouteSelector.ROM_FLYME)) {
                                b = RouteSelector.ROM_FLYME;
                            } else {
                                c = "unknown";
                                b = Build.MANUFACTURER.toUpperCase();
                            }
                        }
                    }
                }
            }
        }
        return b.equals(str);
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56b81c7bc902e2b1caaa1a94b8286337", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56b81c7bc902e2b1caaa1a94b8286337");
        }
        if (d == null) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                d = cls;
                e = cls.getMethod("get", String.class);
            } catch (Exception e2) {
                com.meituan.msc.modules.reporter.g.a(e2);
            }
        }
        try {
            return (String) e.invoke(null, str);
        } catch (Exception unused) {
            return "";
        }
    }
}
