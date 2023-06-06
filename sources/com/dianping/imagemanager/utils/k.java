package com.dianping.imagemanager.utils;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static ChangeQuickRedirect a = null;
    private static String b = "imagemanager";

    public static boolean a() {
        return com.dianping.imagemanager.base.b.c;
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4b4aca09470f27f0861cc3a27a4e692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4b4aca09470f27f0861cc3a27a4e692");
        } else {
            boolean z = com.dianping.imagemanager.base.b.c;
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34c1ae12ca7d5603b6411badd03f6bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34c1ae12ca7d5603b6411badd03f6bbd");
        } else {
            boolean z = com.dianping.imagemanager.base.b.c;
        }
    }

    public static void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a089032fb46484fef00b1301e46c01a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a089032fb46484fef00b1301e46c01a");
        } else {
            boolean z = com.dianping.imagemanager.base.b.c;
        }
    }

    public static void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fcc98e7f1d03e1bcc63dbd8d53f32a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fcc98e7f1d03e1bcc63dbd8d53f32a6");
        } else if (com.dianping.imagemanager.base.b.c) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37b9b431c4ce4ef75c6dd39576e9b5d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37b9b431c4ce4ef75c6dd39576e9b5d9");
        } else if (com.dianping.imagemanager.base.b.c) {
            Log.e(str, str2, th);
        }
    }
}
