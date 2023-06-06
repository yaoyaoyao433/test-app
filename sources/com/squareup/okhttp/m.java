package com.squareup.okhttp;

import com.meituan.robust.common.CommonConstant;
import java.io.UnsupportedEncodingException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m {
    public static String a(String str, String str2) {
        try {
            String b = okio.f.a((str + CommonConstant.Symbol.COLON + str2).getBytes(CommonConstant.Encoding.ISO88591)).b();
            return "Basic " + b;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
