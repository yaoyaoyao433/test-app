package com.meituan.mmp.lib.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class as {
    public static ChangeQuickRedirect a;
    private static String b;
    private static String c;
    private static Class d;
    private static Method e;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ea5deca3ff97a34198fb96b99833192", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ea5deca3ff97a34198fb96b99833192")).booleanValue() : a(RouteSelector.ROM_EMUI);
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "914bed186125880ccf1dd90dd1baedf7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "914bed186125880ccf1dd90dd1baedf7")).booleanValue() : a(RouteSelector.ROM_MIUI);
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3af68540dd2a1cb39ba8ab76470412e0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3af68540dd2a1cb39ba8ab76470412e0")).booleanValue() : a(RouteSelector.ROM_VIVO);
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc3859c321ce224ddf5cd0761e761913", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc3859c321ce224ddf5cd0761e761913")).booleanValue() : a(RouteSelector.ROM_OPPO);
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ae46ba64930cfab635f5ace724d353b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ae46ba64930cfab635f5ace724d353b")).booleanValue() : a(RouteSelector.ROM_FLYME);
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55d5f83967eddb757f51fce484f3f828", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55d5f83967eddb757f51fce484f3f828");
        }
        if (c == null) {
            a("");
        }
        return c;
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b44763e67c981c0aa5a521940cb2d36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b44763e67c981c0aa5a521940cb2d36")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a315059027c6f98eb157863043130e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a315059027c6f98eb157863043130e2");
        }
        if (d == null) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                d = cls;
                e = cls.getMethod("get", String.class);
            } catch (Exception e2) {
                com.meituan.mmp.lib.trace.b.a(e2);
            }
        }
        try {
            return (String) e.invoke(null, str);
        } catch (Exception unused) {
            return "";
        }
    }
}
