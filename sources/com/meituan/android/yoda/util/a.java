package com.meituan.android.yoda.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.mtguard.CryptoKeyIndex;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static byte[] a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f1dd1470566af91d32e277e1ebcc2a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f1dd1470566af91d32e277e1ebcc2a0");
        }
        if (TextUtils.isEmpty(str)) {
            com.meituan.android.yoda.monitor.log.a.a("AESUtils", "guardCBCEncrypt, param is null, plainStr = " + str, true);
            return null;
        }
        try {
            com.meituan.android.yoda.monitor.log.a.a("AESUtils", "guardCBCEncrypt, MTGuard.verify = " + MTGuard.verify() + ", plainStr = " + str, true);
            return MTGuard.encrypt(str.getBytes(), CryptoKeyIndex.AESKEY);
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a("AESUtils", "guardCBCEncrypt, exception = " + e.getMessage(), true);
            return null;
        }
    }

    public static byte[] a(@NonNull String str, @NonNull byte[] bArr, @NonNull byte[] bArr2) {
        Object[] objArr = {str, bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "177e46ef91535561e0d2b56939dc1469", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "177e46ef91535561e0d2b56939dc1469");
        }
        if (TextUtils.isEmpty(str) || bArr2 == null) {
            com.meituan.android.yoda.monitor.log.a.a("AESUtils", "cbcEncrypt, param is null, plainStr = " + str, true);
            return null;
        }
        try {
            com.meituan.android.yoda.monitor.log.a.a("AESUtils", "verify suc cbcEncrypt " + System.currentTimeMillis(), false);
            com.meituan.android.yoda.monitor.log.a.a("AESUtils", "cbcEncrypt, plainStr = " + str, true);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(str.getBytes());
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a("AESUtils", "cbcEncrypt, exception = " + e.getMessage(), true);
            return null;
        }
    }

    public static byte[] b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf251adb44343562f98e2c8af7e274d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf251adb44343562f98e2c8af7e274d7");
        }
        String upperCase = str.trim().replace(StringUtil.SPACE, "").toUpperCase(Locale.US);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) (Integer.decode("0x" + upperCase.substring(i2, i3) + upperCase.substring(i3, i3 + 1)).intValue() & 255);
        }
        return bArr;
    }
}
