package com.meituan.mmp.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final String[] b = new String[0];

    public static String[] a(String[] strArr, String[] strArr2) {
        Object[] objArr = {strArr, strArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfd80caab888b9549ba6b178a82c09b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfd80caab888b9549ba6b178a82c09b4");
        }
        int length = strArr != null ? strArr.length : 0;
        int length2 = strArr2 != null ? strArr2.length : 0;
        Object[] objArr2 = {strArr, 0, Integer.valueOf(length), strArr2, 0, Integer.valueOf(length2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "731e47ec4a49729ac80549cf5100183b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "731e47ec4a49729ac80549cf5100183b");
        }
        if (length == 0) {
            return a(strArr2, 0, length2);
        }
        if (length2 == 0) {
            return a(strArr, 0, length);
        }
        String[] strArr3 = new String[length + length2];
        System.arraycopy(strArr, 0, strArr3, 0, length);
        System.arraycopy(strArr2, 0, strArr3, length, length2);
        return strArr3;
    }

    private static String[] a(String[] strArr, int i, int i2) {
        Object[] objArr = {strArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d42c47bd7a0c1551000b7a68a2aefa3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d42c47bd7a0c1551000b7a68a2aefa3f");
        }
        if (i2 == 0) {
            return b;
        }
        if (i == 0 && i2 == strArr.length) {
            return strArr;
        }
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, i, strArr2, 0, i2);
        return strArr2;
    }

    public static String a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1d4c7579660e968cfd50aababc5daf1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1d4c7579660e968cfd50aababc5daf1");
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        for (String str : strArr) {
            sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
            sb.append(str);
            sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }
}
