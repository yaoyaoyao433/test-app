package com.meituan.android.common.aidata.utils;

import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.InvalidParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AESUtil {
    private static final String CBC_TRANSFORMATION = "AES/CBC/PKCS5Padding";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String decryptCBC(String str, String str2, String str3) throws Exception {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00154ffc19238f249aebd9fa311c0ef1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00154ffc19238f249aebd9fa311c0ef1") : new String(decryptBase64EncodeData(str.getBytes(), str2.getBytes(), str3.getBytes(), CBC_TRANSFORMATION));
    }

    public static String encryptCBC(String str, String str2, String str3) throws Exception {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1baa445596317d4d6d03bf5adb0d941", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1baa445596317d4d6d03bf5adb0d941") : new String(encryptAndBase64Encode(str.getBytes(), str2.getBytes(), str3.getBytes(), CBC_TRANSFORMATION));
    }

    public static byte[] decryptEncodeData(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws Exception {
        Object[] objArr = {bArr, bArr2, bArr3, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f48eed264607cfb741bd13e689cc1ece", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f48eed264607cfb741bd13e689cc1ece");
        }
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16 || str == null || str.length() == 0) {
            throw new InvalidParameterException();
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public static byte[] decryptBase64EncodeData(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws Exception {
        Object[] objArr = {bArr, bArr2, bArr3, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1842c8463bf8a91eb927b6bb2e9c6568", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1842c8463bf8a91eb927b6bb2e9c6568");
        }
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16 || str == null || str.length() == 0) {
            throw new InvalidParameterException();
        }
        byte[] decode = Base64.decode(bArr, 0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(decode);
    }

    public static byte[] encryptAndBase64Encode(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws Exception {
        Object[] objArr = {bArr, bArr2, bArr3, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42582d5eb88a7311da901858440cf2e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42582d5eb88a7311da901858440cf2e8");
        }
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0 || str == null || str.length() == 0) {
            throw new InvalidParameterException();
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encode(cipher.doFinal(bArr), 0);
    }
}
