package com.xiaomi.push.service;

import android.text.TextUtils;
/* loaded from: classes6.dex */
public final class ad {
    private static long a = 0;
    private static String b = "";

    public static String a() {
        if (TextUtils.isEmpty(b)) {
            b = com.xiaomi.push.ar.a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        long j = a;
        a = 1 + j;
        sb.append(j);
        return sb.toString();
    }
}
