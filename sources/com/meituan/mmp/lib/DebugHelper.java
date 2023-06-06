package com.meituan.mmp.lib;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class DebugHelper {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = true;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean j = false;
    public static Boolean k = null;
    public static Boolean l = null;
    public static boolean m = false;
    public static boolean n = false;
    public static boolean o = false;
    public static boolean p = false;
    public static boolean q = false;
    public static boolean r = false;
    public static String s = null;
    public static boolean t = true;
    public static Long u = null;
    @MultiProcessMode
    public static int v = -1;
    public static boolean w = false;
    public static boolean x = false;
    public static Boolean y = null;
    private static boolean z = false;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface MultiProcessMode {
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14f25b12b0674565c7e53d16c44c7c5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14f25b12b0674565c7e53d16c44c7c5d");
        } else if (MMPEnvHelper.getEnvInfo().isProdEnv()) {
            com.meituan.mmp.lib.trace.b.a("throwNotProd", th);
        } else {
            throw new RuntimeException(th);
        }
    }

    private static SharedPreferences h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7297a3efeda8b49fd2c7bccbbe6dad8", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7297a3efeda8b49fd2c7bccbbe6dad8") : PreferenceManager.getDefaultSharedPreferences(MMPEnvHelper.getContext());
    }

    public static void a() {
        boolean z2 = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "181bf385d308bc22f89accfb8b57a906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "181bf385d308bc22f89accfb8b57a906");
        } else if (z || !MMPEnvHelper.isInited()) {
        } else {
            z = true;
            SharedPreferences h2 = h();
            b = b || h2.getBoolean("mmp_debug", false);
            d = d || h2.getBoolean("debug_webview", false);
            c = c || d;
            m = m || h2.getBoolean("debug_v8", false);
            if (l == null && h2.contains("debug_enable_preload")) {
                l = Boolean.valueOf(h2.getBoolean("debug_enable_preload", true));
            }
            if (u == null && h2.contains("debug_keep_alive_time")) {
                u = Long.valueOf(h2.getLong("debug_keep_alive_time", 0L));
            }
            p = p || h2.getBoolean("debug_navigate_in_widget", false);
            q = q || h2.getBoolean("debug_ignore_widget_api_fail", false);
            h = (h || h2.getBoolean("debug_keep_cached_version", false)) ? true : true;
            r |= PreferenceManager.getDefaultSharedPreferences(MMPEnvHelper.getContext()).getBoolean("debug_replace_mmp_sdk", r);
            if (s == null) {
                s = PreferenceManager.getDefaultSharedPreferences(MMPEnvHelper.getContext()).getString("debug_widget_default_url", null);
            }
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d9362b3966acd119061fac71a5d605a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d9362b3966acd119061fac71a5d605a")).booleanValue();
        }
        a();
        return b;
    }

    public static boolean c() {
        return c;
    }

    public static boolean d() {
        return d;
    }

    public static boolean e() {
        return m;
    }

    public static int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d4bd4cb1fd2f9b9779874cdc3456622", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d4bd4cb1fd2f9b9779874cdc3456622")).intValue();
        }
        if (v == -1) {
            int i2 = h().getInt("debug_multiprocess", 0);
            v = i2;
            if (i2 == 1) {
                bb.b("强制打开多进程", new Object[0]);
            } else if (v == 2) {
                bb.b("强制关闭多进程", new Object[0]);
            }
        }
        return v;
    }

    public static Boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7335df64305bf23410f6ba2e8fe35299", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7335df64305bf23410f6ba2e8fe35299");
        }
        if (y == null) {
            SharedPreferences h2 = h();
            if (h2.contains("useMtWebView")) {
                y = Boolean.valueOf(h2.getBoolean("useMtWebView", false));
                bb.b("force useMtWebView = " + y, new Object[0]);
            }
        }
        return y;
    }
}
