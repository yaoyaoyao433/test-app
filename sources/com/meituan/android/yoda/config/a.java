package com.meituan.android.yoda.config;

import android.text.TextUtils;
import com.meituan.android.yoda.data.b;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.passport.api.VerifyApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final int[] b = {121001, 121002, 121003, 121005, 121006, 121007, 121018, 121044, 121045, 121049, 121070, 121114, 121071, 121099, 121000, 1211111, 121123, 121124, 121125, 121126};
    private static final int[] c = {121004, 121009, 121010, 121011, 121036, 121040, 121042, 121043, VerifyApi.CODE_VERIFY_TOO_MANY_TIMES, 121050, 121051, 121052, 121053, VerifyApi.CODE_VERIFY_TIMES_OVER_LIMIT, 121056, 121114, 121057, 121058, VerifyApi.CODE_REFRESH_TOO_MANY_TIMES, VerifyApi.CODE_PAY_PASSWORD_ERROR_TOO_MANY_TIMES, VerifyApi.CODE_VERIFY_FAILED_TOO_MANY_TIMES, VerifyApi.user_err_voice_failed, 121067, 121086, 121087, 121088, 121098, 121099, 121094, 121103, 121104, VerifyApi.user_err_too_many_sms_code};
    private static final int[] d = {121080, 121081, 121090, 121091, 121079, 121084, 121095, VerifyApi.CODE_VERIFY_ERROR, 121100, 121101, 121102, 121116, 121122, 121141, 121143};
    private static final int[] e = {121084, 121100, 121101, 121102, 121079};

    public static boolean d(int i) {
        return i == 0;
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c22be6c8880488d702fc36732234c234", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c22be6c8880488d702fc36732234c234")).booleanValue();
        }
        for (int i2 : e) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be44884479f011a0289851cb92924f36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be44884479f011a0289851cb92924f36")).booleanValue();
        }
        for (int i2 : d) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "521d3e09ede5f21c6ab8853b56faa2f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "521d3e09ede5f21c6ab8853b56faa2f8")).booleanValue();
        }
        for (int i2 : b) {
            if (i2 == i) {
                return true;
            }
        }
        for (int i3 : c) {
            if (i3 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb333a73eeff3e1b9994daf7d1ab4686", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb333a73eeff3e1b9994daf7d1ab4686")).booleanValue();
        }
        for (int i2 : b) {
            if (i2 == i) {
                return true;
            }
        }
        if (b.a(str) != null && b.a(str).c.data != null && !"GROUP".equals((String) b.a(str).c.data.get("category"))) {
            for (int i3 : c) {
                if (i3 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Error error) {
        return error != null && error.code == 1210000;
    }

    public static boolean b(Error error) {
        Object[] objArr = {error};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "263054e96153bb4827d0d210b988475d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "263054e96153bb4827d0d210b988475d")).booleanValue() : (error == null || TextUtils.isEmpty(error.requestCode) || error.code != 121117) ? false : true;
    }
}
