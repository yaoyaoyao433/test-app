package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    static Context a;

    public static void a(Context context) {
        if (context == null || a != null) {
            return;
        }
        a = context.getApplicationContext();
    }
}
