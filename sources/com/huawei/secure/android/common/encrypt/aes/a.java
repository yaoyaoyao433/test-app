package com.huawei.secure.android.common.encrypt.aes;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.b;
import com.huawei.secure.android.common.encrypt.utils.c;
import com.huawei.secure.android.common.encrypt.utils.e;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    private static final String a = "a";

    private a() {
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            e.a(a, "cbc encrypt param is not right");
            return "";
        }
        byte[] a2 = c.a(str2);
        if (a2.length < 16) {
            e.a(a, "key length is not right");
            return "";
        }
        return a(str, a2);
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            e.a(a, "content or key is null");
            return "";
        }
        byte[] a2 = c.a(str2);
        if (a2.length < 16) {
            e.a(a, "key length is not right");
            return "";
        }
        return b(str, a2);
    }

    public static String a(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            e.a(a, "cbc encrypt param is not right");
            return "";
        }
        byte[] a2 = b.a(16);
        byte[] a3 = a(str, bArr, a2);
        return (a3 == null || a3.length == 0) ? "" : c(c.a(a2), c.a(a3));
    }

    public static String b(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            return "";
        }
        String a2 = a(str);
        String b = b(str);
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(b)) {
            e.a(a, "ivParameter or encrypedWord is null");
            return "";
        }
        return b(b, bArr, c.a(a2));
    }

    private static byte[] a(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            e.a(a, "cbc encrypt param is not right");
            return new byte[0];
        }
        try {
            return b(str.getBytes("UTF-8"), bArr, bArr2);
        } catch (UnsupportedEncodingException e) {
            String str2 = a;
            e.a(str2, " cbc encrypt data error" + e.getMessage());
            return new byte[0];
        }
    }

    private static String b(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16 || bArr2 == null || bArr2.length < 16) {
            e.a(a, "cbc decrypt param is not right");
            return "";
        }
        try {
            return new String(a(c.a(str), bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String str2 = a;
            e.a(str2, " cbc decrypt data error" + e.getMessage());
            return "";
        }
    }

    private static String c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return str2.substring(0, 6) + str.substring(0, 6) + str2.substring(6, 10) + str.substring(6, 16) + str2.substring(10, 16) + str.substring(16) + str2.substring(16);
        } catch (Exception e) {
            String str3 = a;
            e.a(str3, "mix exception: " + e.getMessage());
            return "";
        }
    }

    private static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16) {
            e.a(a, "cbc encrypt param is not right");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e) {
            String str = a;
            e.a(str, "InvalidAlgorithmParameterException: " + e.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e2) {
            String str2 = a;
            e.a(str2, "InvalidKeyException: " + e2.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e3) {
            String str3 = a;
            e.a(str3, "NoSuchAlgorithmException: " + e3.getMessage());
            return new byte[0];
        } catch (BadPaddingException e4) {
            String str4 = a;
            e.a(str4, "BadPaddingException: " + e4.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e5) {
            String str5 = a;
            e.a(str5, "IllegalBlockSizeException: " + e5.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e6) {
            String str6 = a;
            e.a(str6, "NoSuchPaddingException: " + e6.getMessage());
            return new byte[0];
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16) {
            e.a(a, "cbc decrypt param is not right");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e) {
            String str = a;
            e.a(str, "InvalidAlgorithmParameterException: " + e.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e2) {
            String str2 = a;
            e.a(str2, "InvalidKeyException: " + e2.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e3) {
            String str3 = a;
            e.a(str3, "NoSuchAlgorithmException: " + e3.getMessage());
            return new byte[0];
        } catch (BadPaddingException e4) {
            String str4 = a;
            e.a(str4, "BadPaddingException: " + e4.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e5) {
            String str5 = a;
            e.a(str5, "IllegalBlockSizeException: " + e5.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e6) {
            String str6 = a;
            e.a(str6, "NoSuchPaddingException: " + e6.getMessage());
            return new byte[0];
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = b.a(16);
        byte[] b = b(bArr, bArr2, a2);
        byte[] bArr3 = new byte[a2.length + b.length];
        System.arraycopy(a2, 0, bArr3, 0, a2.length);
        System.arraycopy(b, 0, bArr3, a2.length, b.length);
        return bArr3;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
        } catch (Exception e) {
            String str2 = a;
            e.a(str2, "getIv exception : " + e.getMessage());
            return "";
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
        } catch (Exception e) {
            String str2 = a;
            e.a(str2, "get encryptword exception : " + e.getMessage());
            return "";
        }
    }
}
