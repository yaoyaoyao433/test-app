package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.common.PackageConstants;
/* loaded from: classes2.dex */
public class b {
    public static String a(Context context) {
        return a(context, "com.huawei.hwid") ? "com.huawei.hwid" : a(context, PackageConstants.SERVICES_PACKAGE_ALL_SCENE) ? PackageConstants.SERVICES_PACKAGE_ALL_SCENE : a(context, "com.huawei.hwid.tv") ? "com.huawei.hwid.tv" : "com.huawei.hwid";
    }

    public static boolean a(Context context, String str) {
        return b(context, str) != null;
    }

    public static PackageInfo b(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(str, 128);
            }
            return null;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return null;
        }
    }
}
