package com.sankuai.waimai.foundation.utils;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.DimenRes;
import android.support.annotation.MainThread;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ImageQualityUtil {
    public static ChangeQuickRedirect a = null;
    private static int b = 60;
    private static int c = 80;
    private static int d = 100;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public @interface Type {
    }

    public static String a(Context context, String str, @Type int i) {
        Object[] objArr = {context, str, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2f5e75bfc555aff3ea2c9269552bafd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2f5e75bfc555aff3ea2c9269552bafd") : a(context, str, 2, 0, 0);
    }

    public static String a(Context context, String str, @Type int i, @DimenRes int i2) {
        Object[] objArr = {context, str, 0, Integer.valueOf((int) R.dimen.wm_comment_avatar_size)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84531038e39b0a2734040c9f51c139ef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84531038e39b0a2734040c9f51c139ef") : a(context, str, 0, context.getResources().getDimensionPixelSize(R.dimen.wm_comment_avatar_size), 0);
    }

    public static String b(Context context, String str, @Type int i, int i2) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e634cf230aace5c38224c2045aa5e5c0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e634cf230aace5c38224c2045aa5e5c0") : a(context, str, i, i2, 0);
    }

    public static String a(Context context, String str, @Type int i, int i2, int i3) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71765e39016259f6e17326d1e3e7303b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71765e39016259f6e17326d1e3e7303b") : a(str, i2, i3, a(i));
    }

    public static int a() {
        return d;
    }

    public static int b() {
        return c;
    }

    public static int c() {
        return b;
    }

    @MainThread
    public static int a(@Type int i) {
        switch (i) {
            case 1:
                return c;
            case 2:
                return d;
            default:
                return b;
        }
    }

    public static void a(int i, int i2, int i3) {
        b = i;
        c = i2;
        d = i3;
    }

    private static String a(String str, int i, int i2, int i3) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab17de5559b12126d66744eec27579d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab17de5559b12126d66744eec27579d6");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.isEmpty(host) || !host.matches("(p[0-9])\\.(meituan)\\.(net)")) {
            return str;
        }
        return str.replace(host, host + b(i, i2, i3));
    }

    private static String b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec60801fd13acfd7dbbda467b5a8799b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec60801fd13acfd7dbbda467b5a8799b");
        }
        if (i3 <= 0 || i3 > 100) {
            i3 = b;
        }
        if (i > 720) {
            i = 720;
        }
        return "/" + i + CommonConstant.Symbol.DOT + i2 + CommonConstant.Symbol.DOT + i3;
    }
}
