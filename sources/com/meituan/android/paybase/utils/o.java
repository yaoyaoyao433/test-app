package com.meituan.android.paybase.utils;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import com.unionpay.tsmservice.data.Constant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"11", "12", "13", Constants.VIA_REPORT_TYPE_MAKE_FRIEND, Constants.VIA_REPORT_TYPE_WPA_STATE, "21", Constants.VIA_REPORT_TYPE_DATALINE, Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR, "31", "32", "33", "34", "35", "36", "37", "41", "42", "43", "44", "45", "46", "50", "51", "52", "53", "54", "61", "62", Constant.TRANS_TYPE_CASH_LOAD, "64", "65", "71", "81", "82", "91"};
    private static final int[] c = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1};
    private static final String[] d = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};

    public static boolean a(String str) {
        boolean matches;
        boolean z = true;
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7fc05f65d0e16d3c6f55e73abdae311", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7fc05f65d0e16d3c6f55e73abdae311")).booleanValue();
        }
        Object[] objArr2 = {str, "^((\\d{17}|\\d{14})(\\d|x|X))$"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ef53e4ad22a29c307de461008491adc5", RobustBitConfig.DEFAULT_VALUE)) {
            matches = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ef53e4ad22a29c307de461008491adc5")).booleanValue();
        } else {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "58040d0c76e2b343346ed948f5995f12", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "58040d0c76e2b343346ed948f5995f12")).booleanValue();
            } else if (str != null && !str.trim().isEmpty()) {
                z = false;
            }
            matches = z ? false : Pattern.matches("^((\\d{17}|\\d{14})(\\d|x|X))$", str);
        }
        if (matches && str.length() == 18 && Arrays.asList(b).contains(str.substring(0, 2)) && b(str.substring(6, 14))) {
            int i2 = 0;
            while (i < 17) {
                int i3 = i + 1;
                i2 += Integer.parseInt(str.substring(i, i3)) * c[i];
                i = i3;
            }
            return str.substring(17).equalsIgnoreCase(d[i2 % 11]);
        }
        return false;
    }

    private static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        Date date = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d12d4fe3763603e5731dcace5e620278", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d12d4fe3763603e5731dcace5e620278")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            date = new SimpleDateFormat("yyyyMMdd").parse(str);
        } catch (ParseException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "IdentityNoCheck_isBirthday").a("message", e.getMessage()).b);
        }
        return date != null && new SimpleDateFormat("yyyyMMdd").format(date).equals(str) && date.getTime() <= new Date().getTime();
    }
}
