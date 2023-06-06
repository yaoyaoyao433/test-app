package com.meituan.android.payguard;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.SecureRandom;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RequestCryptUtils {
    public static ChangeQuickRedirect a;

    public static native String[] decryptRequest(String str, String[] strArr);

    public static native String[] encryptRequest(String str, String str2, String[] strArr, int i);

    public static native String[] encryptRequestWithRandom(String str, String str2, String str3, String str4, String str5, String[] strArr, int i);

    public static String[] a(String str, String str2, String[] strArr, int i) {
        Object[] objArr = {str, str2, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "526bc2d21c1d14772b77c778d4a8b7c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "526bc2d21c1d14772b77c778d4a8b7c2");
        }
        try {
            System.loadLibrary("PayRequestCrypt");
            return encryptRequestWithRandom(str, str2, a(16), a(16), a(16), strArr, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String[] b(String str, String str2, String[] strArr, int i) {
        Object[] objArr = {str, str2, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1353407edb7083f050ebc3f52929b8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1353407edb7083f050ebc3f52929b8f");
        }
        try {
            System.loadLibrary("PayRequestCrypt");
            return encryptRequest(str, str2, strArr, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String[] a(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99f494a4ed0b468f41e0944cf3083317", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99f494a4ed0b468f41e0944cf3083317");
        }
        try {
            System.loadLibrary("PayRequestCrypt");
            return decryptRequest(str, strArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String a(int i) {
        Object[] objArr = {16};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb5e767306577e1976b817221be7e962", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb5e767306577e1976b817221be7e962");
        }
        SecureRandom secureRandom = new SecureRandom();
        char[] cArr = new char[16];
        byte[] bArr = new byte[2];
        for (int i2 = 0; i2 < 16; i2++) {
            secureRandom.nextBytes(bArr);
            cArr[i2] = (char) (((bArr[0] & 255) << 8) | (bArr[1] & 255));
        }
        return new String(cArr);
    }
}
