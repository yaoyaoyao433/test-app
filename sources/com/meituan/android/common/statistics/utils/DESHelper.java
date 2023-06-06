package com.meituan.android.common.statistics.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DESHelper {
    private static final String ALGORITHM = "DES/CBC/PKCS5Padding";
    private static final String DES_KEY = "mtNc7zdG";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String encrypt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a0eeff8bd79198b870ebcd166d5b2e8", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a0eeff8bd79198b870ebcd166d5b2e8") : TextUtils.isEmpty(str) ? "" : encrypt(str, DES_KEY);
    }

    public static String decrypt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a659c23e33f5c4382c51b1197fe6f870", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a659c23e33f5c4382c51b1197fe6f870") : TextUtils.isEmpty(str) ? "" : decrypt(str, DES_KEY);
    }

    public static String encrypt(String str, String str2) {
        DESKeySpec dESKeySpec;
        SecretKey secretKey;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6da97c6e9871a6e5e0d5e454c96a39c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6da97c6e9871a6e5e0d5e454c96a39c");
        }
        try {
            dESKeySpec = new DESKeySpec(str2.getBytes());
            try {
                secretKey = SecretKeyFactory.getInstance("DES").generateSecret(dESKeySpec);
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
                secretKey = null;
                return Base64.encodeToString(encryptByte(str.getBytes("UTF8"), secretKey, dESKeySpec), 0);
            }
        } catch (Throwable th2) {
            th = th2;
            dESKeySpec = null;
        }
        try {
            return Base64.encodeToString(encryptByte(str.getBytes("UTF8"), secretKey, dESKeySpec), 0);
        } catch (Throwable th3) {
            th3.printStackTrace();
            return "";
        }
    }

    private static byte[] encryptByte(byte[] bArr, Key key, DESKeySpec dESKeySpec) {
        Object[] objArr = {bArr, key, dESKeySpec};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbf5e44c05ab3680daca2b8ff09c2832", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbf5e44c05ab3680daca2b8ff09c2832");
        }
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(1, key, new IvParameterSpec(dESKeySpec.getKey()));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String str, String str2) {
        DESKeySpec dESKeySpec;
        SecretKey secretKey;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0fd287b612e1490f47c165dd506cd0d5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0fd287b612e1490f47c165dd506cd0d5");
        }
        try {
            dESKeySpec = new DESKeySpec(str2.getBytes());
            try {
                secretKey = SecretKeyFactory.getInstance("DES").generateSecret(dESKeySpec);
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
                secretKey = null;
                return new String(decryptByte(Base64.decode(str.getBytes("UTF8"), 0), secretKey, dESKeySpec));
            }
        } catch (Throwable th2) {
            th = th2;
            dESKeySpec = null;
        }
        try {
            return new String(decryptByte(Base64.decode(str.getBytes("UTF8"), 0), secretKey, dESKeySpec));
        } catch (Throwable th3) {
            th3.printStackTrace();
            return "";
        }
    }

    private static byte[] decryptByte(byte[] bArr, Key key, DESKeySpec dESKeySpec) {
        Object[] objArr = {bArr, key, dESKeySpec};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b1e49bb187cf2fc41a5ddc66ad82db1", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b1e49bb187cf2fc41a5ddc66ad82db1");
        }
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(2, key, new IvParameterSpec(dESKeySpec.getKey()));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getMD5(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.statistics.utils.DESHelper.changeQuickRedirect
            java.lang.String r11 = "5d1bbfb616c28aa3cb445f26b963a9ba"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r12 = 8192(0x2000, float:1.14794E-41)
            byte[] r12 = new byte[r12]     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5e
        L2d:
            int r3 = r1.read(r12)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5e
            r4 = -1
            if (r3 == r4) goto L38
            r0.update(r12, r9, r3)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5e
            goto L2d
        L38:
            byte[] r12 = r0.digest()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5e
            java.lang.String r12 = byteArrayToHex(r12)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5e
            r1.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r0 = move-exception
            r0.printStackTrace()
        L48:
            return r12
        L49:
            r12 = move-exception
            goto L50
        L4b:
            r12 = move-exception
            r1 = r2
            goto L5f
        L4e:
            r12 = move-exception
            r1 = r2
        L50:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L5d
            r1.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r12 = move-exception
            r12.printStackTrace()
        L5d:
            return r2
        L5e:
            r12 = move-exception
        L5f:
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.utils.DESHelper.getMD5(java.io.File):java.lang.String");
    }

    public static String byteArrayToHex(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7d18611bb80e619902debe35046ece1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7d18611bb80e619902debe35046ece1");
        }
        if (bArr == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
