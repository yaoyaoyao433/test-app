package com.meituan.uuid;

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
/* loaded from: classes3.dex */
public class DESHelper {
    private static final String ALGORITHM = "DES/CBC/PKCS5Padding";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String encrypt(String str, String str2) {
        DESKeySpec dESKeySpec;
        SecretKey secretKey;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "379f9f308b6310d949a37b3830612768", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "379f9f308b6310d949a37b3830612768");
        }
        try {
            dESKeySpec = new DESKeySpec(str2.getBytes());
            try {
                secretKey = SecretKeyFactory.getInstance("DES").generateSecret(dESKeySpec);
            } catch (Throwable th) {
                th = th;
                UUIDHelper.getInstance().getEventLogProvider().throwableReport(th);
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
            UUIDHelper.getInstance().getEventLogProvider().throwableReport(th3);
            return "";
        }
    }

    private static byte[] encryptByte(byte[] bArr, Key key, DESKeySpec dESKeySpec) {
        Object[] objArr = {bArr, key, dESKeySpec};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9184e0b275331b12e88990bc3a9d81c2", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9184e0b275331b12e88990bc3a9d81c2");
        }
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(1, key, new IvParameterSpec(dESKeySpec.getKey()));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            UUIDHelper.getInstance().getEventLogProvider().throwableReport(th);
            return null;
        }
    }

    public static String decrypt(String str, String str2) {
        DESKeySpec dESKeySpec;
        SecretKey secretKey;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb84b59d481c1813dab71e201d32e8c4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb84b59d481c1813dab71e201d32e8c4");
        }
        try {
            dESKeySpec = new DESKeySpec(str2.getBytes());
            try {
                secretKey = SecretKeyFactory.getInstance("DES").generateSecret(dESKeySpec);
            } catch (Throwable th) {
                th = th;
                UUIDHelper.getInstance().getEventLogProvider().throwableReport(th);
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
            UUIDHelper.getInstance().getEventLogProvider().throwableReport(th3);
            return "";
        }
    }

    private static byte[] decryptByte(byte[] bArr, Key key, DESKeySpec dESKeySpec) {
        Object[] objArr = {bArr, key, dESKeySpec};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfb1b8db2520d8d2d78cdc380861d4f3", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfb1b8db2520d8d2d78cdc380861d4f3");
        }
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(2, key, new IvParameterSpec(dESKeySpec.getKey()));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            UUIDHelper.getInstance().getEventLogProvider().throwableReport(th);
            return null;
        }
    }
}
