package com.meituan.android.common.unionid.oneid.util;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AESUtils {
    private static final String AES_KEY = "mHeDq0uu6wFT1RIF";
    public static final String AES_TYPE = "AES/ECB/PKCS5Padding";
    public static final String CODE_TYPE = "UTF-8";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String encrypt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc38f8f7ba1b7ec63eb37f2502ea3224", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc38f8f7ba1b7ec63eb37f2502ea3224");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(AES_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(AES_TYPE);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes("UTF-8")), 11);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String decrypt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c43e8e71328c5351605b488b2e8f5b89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c43e8e71328c5351605b488b2e8f5b89");
        }
        if (TextUtils.isEmpty(str) || AppUtil.DEFAULT_IMEI.equals(str)) {
            return "";
        }
        try {
            byte[] decode = Base64.decode(str, 11);
            SecretKeySpec secretKeySpec = new SecretKeySpec(AES_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(AES_TYPE);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(decode), "UTF-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
