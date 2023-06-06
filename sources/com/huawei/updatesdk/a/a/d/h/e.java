package com.huawei.updatesdk.a.a.d.h;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e {
    private static String a = "";

    public static boolean a() {
        if ("KidWatch".equals(a)) {
            return true;
        }
        String a2 = c.a("ro.vendor.market.type", "");
        a = a2;
        com.huawei.updatesdk.a.a.a.b("WearDeviceUtil", "Children watch property value is " + a2);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        return "KidWatch".equals(a2);
    }
}
