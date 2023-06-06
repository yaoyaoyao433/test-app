package com.alipay.sdk.util;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static String a(Context context) {
        if (com.alipay.sdk.app.a.a()) {
            return "https://mobilegw.alipaydev.com/mgw.htm";
        }
        if (context == null) {
            return com.alipay.sdk.cons.a.a;
        }
        String str = com.alipay.sdk.cons.a.a;
        return TextUtils.isEmpty(str) ? com.alipay.sdk.cons.a.a : str;
    }
}
