package com.tencent.map.tools;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EncryptAesUtils {
    private static final String CipherMode = "AES/CBC/PKCS5Padding";
    private static final String EMPTY_STRING = "";
    private static final byte[] EMPYT_BYTE_ARR = new byte[0];

    private static Cipher getCipher(String str, AlgorithmParameterSpec algorithmParameterSpec, int i) throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
        Cipher cipher = Cipher.getInstance(CipherMode);
        cipher.init(i, secretKeySpec, algorithmParameterSpec);
        return cipher;
    }

    private static String EnDeCryptBase64(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, int i) {
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
                byte[] EnDeCrypt = EnDeCrypt(decode, str2, algorithmParameterSpec, i);
                if (i == 1) {
                    return Base64.encodeToString(EnDeCrypt, 2);
                }
                if (i == 2) {
                    return new String(EnDeCrypt);
                }
                return null;
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static byte[] EnDeCrypt(byte[] bArr, String str, AlgorithmParameterSpec algorithmParameterSpec, int i) {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("wrong mode.");
        }
        if (bArr == null || bArr.length == 0) {
            return EMPYT_BYTE_ARR;
        }
        try {
            Cipher cipher = getCipher(str, algorithmParameterSpec, i);
            if (cipher == null) {
                return EMPYT_BYTE_ARR;
            }
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return EMPYT_BYTE_ARR;
        }
    }

    public static String encryptAes256Base64(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCryptBase64(str, str2, algorithmParameterSpec, 1);
    }

    public static String decryptAes256Base64(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCryptBase64(str, str2, algorithmParameterSpec, 2);
    }

    public static byte[] encryptAes256(byte[] bArr, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCrypt(bArr, str, algorithmParameterSpec, 1);
    }

    public static byte[] decryptAes256(byte[] bArr, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCrypt(bArr, str, algorithmParameterSpec, 2);
    }
}
