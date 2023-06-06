package com.meituan.android.paybase.utils;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    private static BigDecimal b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cce082ed097e7b250971b736ed0038a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cce082ed097e7b250971b736ed0038a7");
        }
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CashAmountArithUtils_getBigDecimal").a("message", e.getMessage()).a("value", str).b);
            return new BigDecimal("0.00");
        }
    }

    private static BigDecimal c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "187510ce41ed21c9f6a1759a9b19b729", RobustBitConfig.DEFAULT_VALUE) ? (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "187510ce41ed21c9f6a1759a9b19b729") : b(str).setScale(2, 4);
    }

    private static BigDecimal b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca35a4d9e750d4826e3fe662c4f8317e", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca35a4d9e750d4826e3fe662c4f8317e");
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return c("0.00");
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return c(str2);
        }
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return c(str);
        }
        return b(str).add(b(str2)).setScale(2, 4);
    }

    public static BigDecimal a(Number number, Number number2) {
        Object[] objArr = {number, number2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e92a4df5a53e294bbaa78fb021052cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e92a4df5a53e294bbaa78fb021052cc");
        }
        if (number == null && number2 == null) {
            return c("0.00");
        }
        if (number == null || number2 == null) {
            if (number == null) {
                return c(String.valueOf(number2));
            }
            return c(String.valueOf(number));
        }
        return b(String.valueOf(number), String.valueOf(number2));
    }

    private static BigDecimal c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56c44b2e9dbdd7b76443ded9ae5b76b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56c44b2e9dbdd7b76443ded9ae5b76b0");
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return c("0.00");
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return c(str2).negate();
        }
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return c(str);
        }
        return b(str).subtract(b(str2)).setScale(2, 4);
    }

    public static BigDecimal b(Number number, Number number2) {
        Object[] objArr = {number, number2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e022fc1065e23da62d2cd8249bbeddb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e022fc1065e23da62d2cd8249bbeddb3");
        }
        if (number == null && number2 == null) {
            return c("0.00");
        }
        if (number == null || number2 == null) {
            if (number == null) {
                return c(String.valueOf(number2)).negate();
            }
            return c(String.valueOf(number));
        }
        return c(String.valueOf(number), String.valueOf(number2));
    }

    public static BigDecimal a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92300e2498566b266ab6b819c08d3e5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92300e2498566b266ab6b819c08d3e5b");
        }
        if (!TextUtils.isEmpty(str)) {
            return c(str);
        }
        return c("0.00");
    }

    public static BigDecimal a(Number number) {
        Object[] objArr = {number};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0c15dc112eb0d131decf37bccb5dbcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0c15dc112eb0d131decf37bccb5dbcb");
        }
        if (number != null) {
            return a(String.valueOf(number));
        }
        return c("0.00");
    }

    public static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58d8fc25e138b3d342cb0060ab5eb0f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58d8fc25e138b3d342cb0060ab5eb0f6")).intValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new BigDecimal(str).compareTo(new BigDecimal(str2));
        }
        if (!TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? 0 : -1;
        }
        return 1;
    }

    public static int c(Number number, Number number2) {
        Object[] objArr = {number, number2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cf156d14bd380be28a2453049b4c69d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cf156d14bd380be28a2453049b4c69d")).intValue();
        }
        if (number == null || number2 == null) {
            if (number != null) {
                return 1;
            }
            return number2 != null ? -1 : 0;
        }
        return a(String.valueOf(number), String.valueOf(number2));
    }
}
