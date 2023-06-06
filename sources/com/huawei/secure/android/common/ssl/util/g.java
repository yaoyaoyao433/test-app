package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    private static final String a = "h";

    public static String a(String str) {
        Context context = c.a;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = a;
            f.a(str2, "getVersion NameNotFoundException : " + e.getMessage());
            return "";
        } catch (Exception e2) {
            String str3 = a;
            f.a(str3, "getVersion: " + e2.getMessage());
            return "";
        } catch (Throwable unused) {
            f.a(a, "throwable");
            return "";
        }
    }
}
