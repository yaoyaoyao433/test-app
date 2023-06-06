package com.sankuai.waimai.kit.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f0f24be602e88749bf1ca58fe5f0e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f0f24be602e88749bf1ca58fe5f0e1f");
        } else if (context == null) {
        } else {
            context.getSharedPreferences("takeout", 0).edit().putString(str, str2).apply();
        }
    }

    public static String b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12e26de57aa3e88ab76e69e0018a08e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12e26de57aa3e88ab76e69e0018a08e3");
        }
        if (context == null) {
            return str2;
        }
        try {
            return context.getSharedPreferences("takeout", 0).getString(str, str2);
        } catch (ClassCastException unused) {
            return str2;
        }
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c0ad64a340cb75868a8f5490b294d32", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c0ad64a340cb75868a8f5490b294d32") : b(context, "a_uuid", "");
    }
}
