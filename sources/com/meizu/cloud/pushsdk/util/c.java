package com.meizu.cloud.pushsdk.util;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
/* loaded from: classes3.dex */
public final class c {
    private static final Charset a = Charset.forName("UTF-8");

    public static String a(String str, String str2) {
        if (str != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                byte[] a2 = com.meizu.cloud.pushsdk.c.g.a.a(str2);
                RSAPublicKey a3 = a(str);
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(2, a3);
                return new String(cipher.doFinal(a2), a);
            } catch (Exception e) {
                DebugLogger.e("RSAUtils", "decrypt " + e.getMessage());
                return null;
            }
        }
        return null;
    }

    private static RSAPublicKey a(String str) {
        String str2;
        StringBuilder sb;
        String message;
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(com.meizu.cloud.pushsdk.c.g.a.a(str)));
        } catch (NoSuchAlgorithmException e) {
            str2 = "RSAUtils";
            sb = new StringBuilder("loadPublicKey NoSuchAlgorithmException ");
            message = e.getMessage();
            sb.append(message);
            DebugLogger.e(str2, sb.toString());
            return null;
        } catch (InvalidKeySpecException e2) {
            str2 = "RSAUtils";
            sb = new StringBuilder("loadPublicKey InvalidKeySpecException ");
            message = e2.getMessage();
            sb.append(message);
            DebugLogger.e(str2, sb.toString());
            return null;
        }
    }
}
