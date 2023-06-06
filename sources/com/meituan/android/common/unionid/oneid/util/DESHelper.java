package com.meituan.android.common.unionid.oneid.util;

import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
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
    public static final String DES_KEY = "hqNc7zdG";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String encrypt(String str, String str2) {
        DESKeySpec dESKeySpec;
        SecretKey secretKey;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1926eacf504371c43cef601bcb193532", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1926eacf504371c43cef601bcb193532");
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
        } catch (Throwable unused) {
            return "";
        }
    }

    private static byte[] encryptByte(byte[] bArr, Key key, DESKeySpec dESKeySpec) {
        Object[] objArr = {bArr, key, dESKeySpec};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd508aab0252f6461df2b126971859e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd508aab0252f6461df2b126971859e4");
        }
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(1, key, new IvParameterSpec(dESKeySpec.getKey()));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String decrypt(String str, String str2) {
        DESKeySpec dESKeySpec;
        SecretKey secretKey;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4940c3598cc8aa99da892dac6960511e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4940c3598cc8aa99da892dac6960511e");
        }
        try {
            dESKeySpec = new DESKeySpec(str2.getBytes());
        } catch (Throwable unused) {
            dESKeySpec = null;
        }
        try {
            try {
                secretKey = SecretKeyFactory.getInstance("DES").generateSecret(dESKeySpec);
            } catch (Throwable unused2) {
                secretKey = null;
                return new String(decryptByte(Base64.decode(str.getBytes("UTF8"), 0), secretKey, dESKeySpec));
            }
            return new String(decryptByte(Base64.decode(str.getBytes("UTF8"), 0), secretKey, dESKeySpec));
        } catch (Throwable unused3) {
            return "";
        }
    }

    private static byte[] decryptByte(byte[] bArr, Key key, DESKeySpec dESKeySpec) {
        Object[] objArr = {bArr, key, dESKeySpec};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3206171bfbb2987126dbfe6ce0aa42e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3206171bfbb2987126dbfe6ce0aa42e6");
        }
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(2, key, new IvParameterSpec(dESKeySpec.getKey()));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
