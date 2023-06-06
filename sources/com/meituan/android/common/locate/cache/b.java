package com.meituan.android.common.locate.cache;

import com.meituan.robust.ChangeQuickRedirect;
/* loaded from: classes2.dex */
public class b {
    private static volatile boolean a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(boolean z) {
        a = z;
    }

    public static boolean a() {
        return a;
    }
}
