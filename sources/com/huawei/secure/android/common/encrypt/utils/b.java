package com.huawei.secure.android.common.encrypt.utils;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    private static boolean a = false;
    private static boolean b = true;

    public static byte[] a(int i) {
        if (a) {
            if (Build.VERSION.SDK_INT >= 26) {
                SecureRandom a2 = a();
                if (a2 == null) {
                    return new byte[0];
                }
                byte[] bArr = new byte[i];
                a2.nextBytes(bArr);
                return bArr;
            }
        }
        try {
            byte[] bArr2 = new byte[i];
            new SecureRandom().nextBytes(bArr2);
            return bArr2;
        } catch (Exception e) {
            e.a("EncryptUtil", "generate secure random error" + e.getMessage());
            return new byte[0];
        }
    }

    public static String b(int i) {
        return c.a(a(i));
    }

    private static SecureRandom a() {
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            AESEngine aESEngine = new AESEngine();
            byte[] bArr = new byte[32];
            instanceStrong.nextBytes(bArr);
            return new SP800SecureRandomBuilder(instanceStrong, true).setEntropyBitsRequired(384).buildCTR(aESEngine, 256, bArr, false);
        } catch (NoSuchAlgorithmException unused) {
            e.a("EncryptUtil", "NoSuchAlgorithmException");
            return new SecureRandom();
        } catch (Throwable th) {
            if (b) {
                e.a("EncryptUtil", "exception : " + th.getMessage() + " , you should implementation bcprov-jdk15on library");
                b = false;
            }
            return new SecureRandom();
        }
    }
}
