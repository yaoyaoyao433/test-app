package com.tencent.mapsdk.internal;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ko {
    private static final String a = "AESCrypt";
    private static final String b = "AES/CBC/PKCS7Padding";
    private static final String c = "UTF-8";
    private static final String d = "SHA-256";
    private static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static String a(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance(d);
        byte[] bytes = str.getBytes("UTF-8");
        messageDigest.update(bytes, 0, bytes.length);
        return Base64.encodeToString(messageDigest.digest(), 2);
    }

    public static String a(String str, String str2) throws GeneralSecurityException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 2), "AES");
            byte[] bArr = e;
            byte[] bytes = str2.getBytes("UTF-8");
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
            return Base64.encodeToString(cipher.doFinal(bytes), 2);
        } catch (UnsupportedEncodingException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    private static byte[] a(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance(b);
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return cipher.doFinal(bArr2);
    }

    private static String b(String str, String str2) throws GeneralSecurityException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 2), "AES");
            byte[] decode = Base64.decode(str2, 2);
            byte[] bArr = e;
            Cipher cipher = Cipher.getInstance(b);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr));
            return new String(cipher.doFinal(decode), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    private static byte[] b(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance(b);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr));
        return cipher.doFinal(bArr2);
    }

    private static String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr2[i3] = cArr[i2 >>> 4];
            cArr2[i3 + 1] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    private ko() {
    }
}
