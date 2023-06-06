package com.heytap.mcssdk.f;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
/* loaded from: classes2.dex */
public final class a {
    private static byte[] b(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                byte[] b = b("com.nearme.mcs");
                int length = b.length % 2 == 0 ? b.length : b.length - 1;
                for (int i = 0; i < length; i += 2) {
                    byte b2 = b[i];
                    int i2 = i + 1;
                    b[i] = b[i2];
                    b[i2] = b2;
                }
                String str2 = b != null ? new String(b, Charset.forName("UTF-8")) : "";
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(Base64.decode(str2, 0))));
                return new String(cipher.doFinal(Base64.decode(str, 0)), Charset.defaultCharset()).trim();
            } catch (Exception e) {
                b.b("desDecrypt-" + e.getMessage());
            }
        }
        return "";
    }
}
