package com.huawei.hms.hatool;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e {
    public static String a(String str, String str2) {
        try {
            return a(str, str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            y.c("hmsSdk", "Unsupported encoding exception,utf-8");
            return "";
        }
    }

    public static String a(String str, byte[] bArr) {
        String str2;
        String str3;
        if (bArr == null || bArr.length == 0) {
            y.f("hmsSdk", "encrypt: content is empty or null");
            return "";
        }
        try {
            return com.huawei.secure.android.common.encrypt.utils.c.a(a(bArr, a(com.huawei.secure.android.common.encrypt.utils.c.a(str))));
        } catch (NoSuchAlgorithmException unused) {
            str2 = "hmsSdk";
            str3 = "encrypt(): getInstance - No such algorithm,transformation";
            y.f(str2, str3);
            return "";
        } catch (InvalidKeySpecException unused2) {
            str2 = "hmsSdk";
            str3 = "encrypt(): Invalid key specification";
            y.f(str2, str3);
            return "";
        }
    }

    public static PublicKey a(byte[] bArr) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) {
        String str;
        String str2;
        try {
            if (publicKey != null) {
                Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING");
                cipher.init(1, publicKey);
                return cipher.doFinal(bArr);
            }
            throw new UnsupportedEncodingException("The loaded public key is null");
        } catch (UnsupportedEncodingException unused) {
            str = "hmsSdk";
            str2 = "rsaEncrypt(): getBytes - Unsupported coding format!";
            y.f(str, str2);
            return new byte[0];
        } catch (InvalidKeyException unused2) {
            str = "hmsSdk";
            str2 = "rsaEncrypt(): init - Invalid key!";
            y.f(str, str2);
            return new byte[0];
        } catch (NoSuchAlgorithmException unused3) {
            str = "hmsSdk";
            str2 = "rsaEncrypt(): getInstance - No such algorithm,transformation";
            y.f(str, str2);
            return new byte[0];
        } catch (BadPaddingException unused4) {
            str = "hmsSdk";
            str2 = "rsaEncrypt():False filling parameters!";
            y.f(str, str2);
            return new byte[0];
        } catch (IllegalBlockSizeException unused5) {
            str = "hmsSdk";
            str2 = "rsaEncrypt(): doFinal - The provided block is not filled with";
            y.f(str, str2);
            return new byte[0];
        } catch (NoSuchPaddingException unused6) {
            str = "hmsSdk";
            str2 = "rsaEncrypt():  No such filling parameters ";
            y.f(str, str2);
            return new byte[0];
        }
    }
}
