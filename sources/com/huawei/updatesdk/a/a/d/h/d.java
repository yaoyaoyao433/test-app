package com.huawei.updatesdk.a.a.d.h;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    private static int a = -1;

    public static int a() {
        if (a == -1) {
            a = ("zh".equals(c.a("ro.product.locale.language", "")) && "CN".equals(c.a("ro.product.locale.region", ""))) ? 0 : 1;
        }
        return a;
    }
}
