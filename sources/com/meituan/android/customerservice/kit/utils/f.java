package com.meituan.android.customerservice.kit.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static String b;
    private static String c;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22af2f31fa7fccd899bc624509852d76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22af2f31fa7fccd899bc624509852d76")).booleanValue() : a(RouteSelector.ROM_FLYME);
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8698d5578b18d7a5a5390bf98a378716", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8698d5578b18d7a5a5390bf98a378716")).booleanValue();
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

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    private static String b(String str) {
        BufferedReader bufferedReader;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedReader bufferedReader2 = null;
        ?? isSupport = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d96404c86d07c0cc1edf33347104640", RobustBitConfig.DEFAULT_VALUE);
        try {
            if (isSupport != 0) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d96404c86d07c0cc1edf33347104640");
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream(), "utf-8"), 1024);
                try {
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        b.a("RomUtil", e.getMessage());
                    }
                    return readLine;
                } catch (IOException e2) {
                    e = e2;
                    b.a("RomUtil", "Unable to read prop " + str + e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            b.a("RomUtil", e3.getMessage());
                        }
                    }
                    return null;
                }
            } catch (IOException e4) {
                e = e4;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e5) {
                        b.a("RomUtil", e5.getMessage());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = isSupport;
        }
    }
}
