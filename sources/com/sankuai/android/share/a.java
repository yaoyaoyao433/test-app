package com.sankuai.android.share;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static com.sankuai.android.share.interfaces.a b;
    private static SparseArray<String> c;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74f7c51b5f838ea570c3e7edd3d27c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74f7c51b5f838ea570c3e7edd3d27c8f");
        } else if (c == null) {
            c = new SparseArray<>();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b74d94e7c94bc985b9efdb9bb4ed1c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b74d94e7c94bc985b9efdb9bb4ed1c34");
        } else {
            a(context.hashCode(), str);
        }
    }

    private static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "116a2d2df7946d33d60d58de88002d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "116a2d2df7946d33d60d58de88002d42");
        } else if (c == null) {
        } else {
            c.put(i, str);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void a(Context context, @StringRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b63b148ce0a8d7963bb2814aa483450", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b63b148ce0a8d7963bb2814aa483450");
        } else {
            a(context, context.getString(i));
        }
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68b869155a9b69a84f2f2daf2ca1de15", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68b869155a9b69a84f2f2daf2ca1de15");
        }
        if (c == null) {
            return "";
        }
        String str = c.get(context.hashCode(), "");
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static void b(Context context) {
        if (c == null) {
            return;
        }
        c = null;
    }
}
