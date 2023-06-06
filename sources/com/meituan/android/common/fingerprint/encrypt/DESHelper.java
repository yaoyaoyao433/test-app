package com.meituan.android.common.fingerprint.encrypt;

import android.util.Base64;
import com.meituan.android.common.fingerprint.utils.StringUtils;
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
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String encryptByPublic(String str, String str2) {
        DESKeySpec dESKeySpec;
        SecretKey secretKey;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a496752aaa826e1ea95850763cefbb4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a496752aaa826e1ea95850763cefbb4");
        }
        try {
            dESKeySpec = new DESKeySpec(str2.getBytes());
            try {
                secretKey = SecretKeyFactory.getInstance("DES").generateSecret(dESKeySpec);
            } catch (Throwable th) {
                th = th;
                StringUtils.setErrorLogan(th);
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
            StringUtils.setErrorLogan(th3);
            return "";
        }
    }

    private static byte[] encryptByte(byte[] bArr, Key key, DESKeySpec dESKeySpec) {
        Object[] objArr = {bArr, key, dESKeySpec};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4f0cfecddfb80ac7ace23e225ae66fd", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4f0cfecddfb80ac7ace23e225ae66fd");
        }
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(1, key, new IvParameterSpec(dESKeySpec.getKey()));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            th.printStackTrace();
            return null;
        }
    }
}
