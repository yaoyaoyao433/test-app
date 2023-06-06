package com.alipay.sdk.app;

import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static boolean a = false;
    public static String b;

    public static String a() {
        e a2 = e.a(e.CANCELED.i);
        return a(a2.i, a2.j, "");
    }

    public static String a(int i, String str, String str2) {
        return "resultStatus={" + i + "};memo={" + str + "};result={" + str2 + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
