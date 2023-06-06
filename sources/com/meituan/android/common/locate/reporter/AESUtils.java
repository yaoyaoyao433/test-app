package com.meituan.android.common.locate.reporter;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public class AESUtils {
    private static byte[] a;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes2.dex */
    public static class CryptoProvider extends Provider {
        public static ChangeQuickRedirect changeQuickRedirect;

        public CryptoProvider() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33e9e9fdc82261a7a5ea8ad5c6f39366", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33e9e9fdc82261a7a5ea8ad5c6f39366");
        }
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            return Base64.encodeToString(a(str, str2.getBytes()), 0);
        } catch (Exception e) {
            LogUtils.a(e);
            return null;
        }
    }

    private static byte[] a(String str, byte[] bArr) throws Exception {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51f14922034cfbaa8b2f8af54e788532", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51f14922034cfbaa8b2f8af54e788532");
        }
        if (a == null) {
            a = a(str.toCharArray());
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(a, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr);
    }

    private static byte[] a(char[] cArr) throws Exception {
        Object[] objArr = {cArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00f3851cf84724042d78e5162a4fe041", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00f3851cf84724042d78e5162a4fe041") : SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, new byte[]{1}, 1, 256)).getEncoded();
    }

    public static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25b5cbbfd2ea933fc7cd4d402fd0cf13", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25b5cbbfd2ea933fc7cd4d402fd0cf13");
        }
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            return new String(b(str, Base64.decode(str2, 0)));
        } catch (Exception e) {
            LogUtils.a(e);
            return null;
        }
    }

    private static byte[] b(String str, byte[] bArr) throws Exception {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6402715888dd40bee2ec238b4cc92657", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6402715888dd40bee2ec238b4cc92657");
        }
        if (a == null) {
            a = a(str.toCharArray());
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(a, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr);
    }
}
