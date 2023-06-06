package com.huawei.secure.android.common.util;

import android.util.Base64;
import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private static final String a = "c";

    private c() {
    }

    public static byte[] a(String str, int i) {
        try {
            return Base64.decode(str, i);
        } catch (Exception e) {
            String str2 = a;
            Log.e(str2, e.getClass().getSimpleName() + " , message2 : " + e.getMessage());
            return new byte[0];
        }
    }

    public static String a(byte[] bArr, int i) {
        try {
            return Base64.encodeToString(bArr, i);
        } catch (Exception e) {
            String str = a;
            Log.e(str, e.getClass().getSimpleName() + " , message5 : " + e.getMessage());
            return "";
        }
    }
}
