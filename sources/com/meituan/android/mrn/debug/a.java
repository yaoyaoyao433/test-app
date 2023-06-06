package com.meituan.android.mrn.debug;

import android.content.Context;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.mrn.common.b;
import com.meituan.android.mrn.config.c;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    @Deprecated
    public static boolean b = false;
    @Deprecated
    public static boolean c = false;
    @Deprecated
    public static boolean d = true;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = true;

    public static boolean a() {
        return e;
    }

    public static void a(boolean z) {
        e = z;
        p.b = z;
    }

    public static boolean b() {
        return f;
    }

    public static void b(boolean z) {
        f = z;
    }

    public static boolean c() {
        return g;
    }

    public static void c(boolean z) {
        g = z;
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56e0322e438ffb870811c35a294b5348", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56e0322e438ffb870811c35a294b5348")).booleanValue();
        }
        try {
            return (context.getApplicationContext().getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dc35fd1a5dc7787ff7a582b7d7cb6d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dc35fd1a5dc7787ff7a582b7d7cb6d2")).booleanValue();
        }
        try {
            return (a(context) ^ true) && !c.a().c();
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b06f0b7f5b161bfe64d11b287513d74a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b06f0b7f5b161bfe64d11b287513d74a")).booleanValue();
        }
        try {
            if (!a(context)) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (!(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d90c8d386555627e037c34ca59585e2e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d90c8d386555627e037c34ca59585e2e")).booleanValue() : b.a(context, "mrn_debug_kit", false).booleanValue())) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "088376520a2b393d7be65e7fce6b5199", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "088376520a2b393d7be65e7fce6b5199") : g ? "prod" : GetAppInfoJsHandler.PACKAGE_TYPE_DEV;
    }
}
