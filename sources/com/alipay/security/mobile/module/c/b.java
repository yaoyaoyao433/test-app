package com.alipay.security.mobile.module.c;

import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static String a(String str) {
        String str2 = "";
        try {
            str2 = f.a(str);
        } catch (Throwable unused) {
        }
        if (com.alipay.security.mobile.module.a.a.a(str2)) {
            return c.a(".SystemConfig" + File.separator + str);
        }
        return str2;
    }
}
