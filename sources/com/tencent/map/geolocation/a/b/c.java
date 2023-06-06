package com.tencent.map.geolocation.a.b;

import android.util.Base64;
import com.tencent.map.geolocation.util.SoUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    private static final byte[] a = {84, 101, 110, 99, 101, 110, 116, 76, 111, 99, 97, 116, 105, 111, 110, 49};
    private static final byte[] b = new byte[0];

    private static String a(String str, String str2, int i) {
        byte[] decode;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("wrong mode.");
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            if (i == 1) {
                decode = str.getBytes();
            } else {
                decode = i == 2 ? Base64.decode(str.getBytes(), 2) : null;
            }
            if (decode != null && decode.length != 0) {
                byte[] a2 = a(decode, str2, i);
                if (i == 1) {
                    return Base64.encodeToString(a2, 2);
                }
                if (i == 2) {
                    return new String(a2);
                }
                return null;
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static byte[] a(byte[] bArr, String str, int i) {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("wrong mode.");
        }
        if (bArr == null || bArr.length == 0) {
            return b;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, secretKeySpec, new IvParameterSpec(SoUtils.fun_d("666666").getBytes("UTF-8")));
            if (cipher == null) {
                return b;
            }
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return b;
        }
    }

    public static String a(String str, String str2) {
        return a(str, str2, 1);
    }

    public static String b(String str, String str2) {
        return a(str, str2, 2);
    }

    public static byte[] a(byte[] bArr, String str) {
        return a(bArr, str, 1);
    }

    public static byte[] b(byte[] bArr, String str) {
        return a(bArr, str, 2);
    }
}
