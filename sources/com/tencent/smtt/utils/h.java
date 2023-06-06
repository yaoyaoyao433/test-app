package com.tencent.smtt.utils;

import java.security.KeyFactory;
import java.security.Provider;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
/* loaded from: classes6.dex */
public class h {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private static h b;
    private String d;
    private String e = String.valueOf(new Random().nextInt(89999999) + 10000000);
    private String c = this.e + String.valueOf(new Random().nextInt(89999999) + 10000000);

    private h() {
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            if (b == null) {
                b = new h();
            }
            hVar = b;
        }
        return hVar;
    }

    private String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = a[i2 >>> 4];
            cArr[i3 + 1] = a[i2 & 15];
        }
        return new String(cArr);
    }

    public byte[] a(byte[] bArr) throws Exception {
        return com.tencent.smtt.sdk.stat.a.a(this.e.getBytes(), bArr, 1);
    }

    public void b() throws Exception {
        Security.addProvider((Provider) Class.forName("com.android.org.bouncycastle.jce.provider.BouncyCastleProvider", true, ClassLoader.getSystemClassLoader()).newInstance());
    }

    public String c() throws Exception {
        Cipher cipher;
        if (this.d == null) {
            byte[] bytes = this.c.getBytes();
            try {
                try {
                    cipher = Cipher.getInstance("RSA/ECB/NoPadding");
                } catch (Exception e) {
                    e.printStackTrace();
                    cipher = null;
                }
            } catch (Exception unused) {
                b();
                cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            }
            cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(android.util.Base64.decode("MCwwDQYJKoZIhvcNAQEBBQADGwAwGAIRAMRB/Q0hTCD+XtnQhpQJefUCAwEAAQ==".getBytes(), 0))));
            this.d = b(cipher.doFinal(bytes));
        }
        return this.d;
    }
}
