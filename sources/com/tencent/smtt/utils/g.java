package com.tencent.smtt.utils;

import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
/* loaded from: classes6.dex */
public class g {
    private static String b = "";
    private static byte[] c;
    private static String g;
    private Cipher d;
    private Cipher e;
    protected static final char[] a = "0123456789abcdef".toCharArray();
    private static g f = null;

    private g() throws Exception {
        this.d = null;
        this.e = null;
        g = String.valueOf(new Random().nextInt(89999999) + 10000000) + String.valueOf(new Random().nextInt(89999999) + 10000000) + String.valueOf(new Random().nextInt(89999999) + 10000000);
        String str = "00000000";
        for (int i = 0; i < 12; i++) {
            str = str + String.valueOf(new Random().nextInt(89999999) + 10000000);
        }
        c = (str + g).getBytes();
        this.d = Cipher.getInstance("RSA/ECB/NoPadding");
        this.d.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(android.util.Base64.decode((d() + e()).getBytes(), 0))));
        b = b(this.d.doFinal(c));
        SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(g.getBytes()));
        this.e = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        this.e.init(1, generateSecret);
    }

    public static g a() {
        try {
            if (f == null) {
                f = new g();
            }
            return f;
        } catch (Exception e) {
            f = null;
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte[] bArr, String str) throws Exception {
        SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(str.getBytes()));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        cipher.init(1, generateSecret);
        return cipher.doFinal(bArr);
    }

    public static String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = a[i2 >>> 4];
            cArr[i3 + 1] = a[i2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] b(byte[] bArr, String str) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(str.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, generateSecret);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String c() {
        return g;
    }

    private String d() {
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDcEQ3TCNWPBqgIiY7WQ/IqTOTTV2w8aZ/GPm68FK0";
    }

    private String e() {
        return "fAJBemZKtYR3Li46VJ+Hwnor7ZpQnblGWPFaLv5JoPqvavgB0GInuhm+T+syPs1mw0uPLWaqwvZsCfoaIvUuxy5xHJgmWARrK4/9pHyDxRlZte0PCIoR1ko5B8lVVH1X1dQIDAQAB";
    }

    public byte[] a(byte[] bArr) throws Exception {
        return this.e.doFinal(bArr);
    }

    public String b() {
        return b;
    }

    public byte[] c(byte[] bArr) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(g.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, generateSecret);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            TbsLog.i(e);
            return null;
        }
    }
}
