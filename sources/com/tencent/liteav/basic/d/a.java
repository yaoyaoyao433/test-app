package com.tencent.liteav.basic.d;

import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    private static String a = "RSA";

    public static byte[] a(byte[] bArr, PrivateKey privateKey) throws Exception {
        byte[] doFinal;
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            int i2 = length - i;
            if (i2 > 0) {
                if (i2 >= cipher.getBlockSize()) {
                    doFinal = cipher.doFinal(bArr, i, cipher.getBlockSize());
                } else {
                    doFinal = cipher.doFinal(bArr, i, i2);
                }
                byteArrayOutputStream.write(doFinal);
                i += cipher.getBlockSize();
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    public static PrivateKey a(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance(a).generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }
}
