package com.huawei.updatesdk.b.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    private static String a;

    public static String a() {
        PackageInfo packageInfo;
        String str = a;
        if (str != null) {
            return str;
        }
        Context a2 = com.huawei.updatesdk.a.b.a.a.c().a();
        try {
            String packageName = a2.getPackageName();
            if (a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0) != null) {
                packageName = packageName + packageInfo.versionName;
            }
            String str2 = packageName + CommonConstant.Symbol.UNDERLINE + (TextUtils.isEmpty(Build.BRAND) ? "other" : Build.BRAND);
            a = str2;
            return str2;
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("ApplicationSession", "getUserAgent() " + e.toString());
            return null;
        }
    }
}
