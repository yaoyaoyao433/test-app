package com.huawei.secure.android.common.encrypt.utils;

import android.annotation.SuppressLint;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    private static final String a = "a";

    @SuppressLint({"NewApi"})
    public static byte[] a(String str, String str2, String str3, byte[] bArr, boolean z) {
        byte[] a2 = c.a(str);
        byte[] a3 = c.a(str2);
        byte[] a4 = c.a(str3);
        int length = a2.length;
        int length2 = a3.length;
        int length3 = a4.length;
        if (length2 < length) {
            length = length2;
        }
        if (length3 < length) {
            length = length3;
        }
        if (!((length >= 16) & (bArr.length >= 16))) {
            throw new IllegalArgumentException("key length must be more than 128bit.");
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) ((a2[i] ^ a3[i]) ^ a4[i]);
        }
        if (!z) {
            e.a(a);
            return com.huawei.secure.android.common.encrypt.hash.a.a(cArr, bArr, 10000, 128);
        }
        e.a(a);
        return com.huawei.secure.android.common.encrypt.hash.a.b(cArr, bArr, 10000, 128);
    }
}
