package com.sankuai.waimai.foundation.utils;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.StringRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ab {
    public static ChangeQuickRedirect a;

    public static String a(Context context, @StringRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4265375142d7015447e4e5a37263f9cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4265375142d7015447e4e5a37263f9cc");
        }
        if (context == null || i == 0) {
            return null;
        }
        try {
            return context.getString(i);
        } catch (Resources.NotFoundException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    private static String a(Context context, @StringRes int i, Object... objArr) {
        Object[] objArr2 = {context, Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "ca36dff3ceed76c3fbaed55ecd85649a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "ca36dff3ceed76c3fbaed55ecd85649a");
        }
        if (context == null || i == 0) {
            return null;
        }
        try {
            return context.getString(i, objArr);
        } catch (Resources.NotFoundException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    public static String a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7715e30e9dbac7a931602eec5a644900", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7715e30e9dbac7a931602eec5a644900");
        }
        if (str == null || i < 0 || str.length() <= i) {
            return str;
        }
        return str.substring(0, i) + "...";
    }

    public static String a(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ae0dc39f0d0c268c717246591c4cdae", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ae0dc39f0d0c268c717246591c4cdae") : a(com.meituan.android.singleton.b.a, i);
    }

    public static String a(@StringRes int i, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "45e1a7f19f7afc4f8c6cb3f1882e87bc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "45e1a7f19f7afc4f8c6cb3f1882e87bc") : a(com.meituan.android.singleton.b.a, i, objArr);
    }
}
