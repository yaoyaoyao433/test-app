package com.meituan.android.mtplayer.video.utils;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    private static String b(String str) {
        return str == null ? StringUtil.NULL : str;
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66dd0a9be2f3c92baffa6ad23c36d10f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66dd0a9be2f3c92baffa6ad23c36d10f");
        } else if (b) {
            b(str2);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17b662f730306d6debe18dcac37b9cc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17b662f730306d6debe18dcac37b9cc9");
        } else if (b) {
            b(str);
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f3bcd6b1f97456d7200835688ee8c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f3bcd6b1f97456d7200835688ee8c68");
        } else if (b) {
            b(str2);
        }
    }

    public static void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "074b7c066ef201e0ad9afe2afe10420c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "074b7c066ef201e0ad9afe2afe10420c");
        } else if (b) {
            Log.e(str, b(str2));
        }
    }

    public static void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c4056be5bd53212c8cbf0d0a83fb49e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c4056be5bd53212c8cbf0d0a83fb49e");
        } else if (b) {
            Log.e(str, b(str2), th);
        }
    }

    public static void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19bd52cf1470da76519daea52e71cb7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19bd52cf1470da76519daea52e71cb7b");
        } else if (b) {
            b(str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb5b723eb43c2421e6e69d7dfc7655af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb5b723eb43c2421e6e69d7dfc7655af");
        } else if (b) {
            Log.w(str, b(str2), th);
        }
    }
}
