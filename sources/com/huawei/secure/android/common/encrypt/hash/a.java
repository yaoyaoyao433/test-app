package com.huawei.secure.android.common.encrypt.hash;

import android.os.Build;
import com.huawei.secure.android.common.encrypt.utils.e;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    private static final String a = "a";

    public static byte[] a(char[] cArr, byte[] bArr, int i, int i2) {
        return a(cArr, bArr, 10000, i2, false);
    }

    public static byte[] b(char[] cArr, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[0];
        if (Build.VERSION.SDK_INT < 26) {
            e.a(a, "system version not high than 26");
            return bArr2;
        }
        return a(cArr, bArr, 10000, i2, true);
    }

    private static byte[] a(char[] cArr, byte[] bArr, int i, int i2, boolean z) {
        SecretKeyFactory secretKeyFactory;
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, bArr, i, i2);
            if (z) {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            } else {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            }
            return secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            String str = a;
            e.a(str, "pbkdf exception : " + e.getMessage());
            return new byte[0];
        }
    }
}
