package com.meituan.android.loader.impl;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class g {
    public static ChangeQuickRedirect f;

    public abstract long a(Context context);

    public abstract String b(Context context);

    public abstract String c(Context context);

    public String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287540d6e926fd0b5ad60b02ccd2c493", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287540d6e926fd0b5ad60b02ccd2c493");
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df6b6bb4b60b4b7f19d4c9d7a99887cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df6b6bb4b60b4b7f19d4c9d7a99887cd");
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Throwable unused) {
            return "";
        }
    }
}
