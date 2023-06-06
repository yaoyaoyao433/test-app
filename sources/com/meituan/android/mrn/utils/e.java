package com.meituan.android.mrn.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    private static String a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd37cd793c0fb19e7abca995490bde64", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd37cd793c0fb19e7abca995490bde64");
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i2 = -1;
        while (true) {
            if (i >= length) {
                break;
            } else if (Character.isDigit(str.charAt(i))) {
                i2 = i;
                break;
            } else {
                i++;
            }
        }
        if (i2 < 0) {
            return null;
        }
        int i3 = i2 + 1;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = str.charAt(i3);
            if (!Character.isDigit(charAt) && charAt != '.') {
                length = i3;
                break;
            }
            i3++;
        }
        return str.substring(i2, length);
    }

    public static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b6af0f938c2ab46e82995909687d308", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b6af0f938c2ab46e82995909687d308")).intValue();
        }
        if (TextUtils.equals(str, str2)) {
            return 0;
        }
        String a2 = a(str);
        String a3 = a(str2);
        if (TextUtils.equals(a2, a3)) {
            return 0;
        }
        if (TextUtils.isEmpty(a2)) {
            return -1;
        }
        if (TextUtils.isEmpty(a3)) {
            return 1;
        }
        String[] split = a2.split("\\.");
        String[] split2 = a3.split("\\.");
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            int parseInt = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            if (parseInt != 0) {
                return parseInt > 0 ? 1 : -1;
            }
        }
        for (int i2 = min; i2 < split.length; i2++) {
            if (Integer.parseInt(split[i2]) > 0) {
                return 1;
            }
        }
        while (min < split2.length) {
            if (Integer.parseInt(split2[min]) > 0) {
                return -1;
            }
            min++;
        }
        return 0;
    }
}
