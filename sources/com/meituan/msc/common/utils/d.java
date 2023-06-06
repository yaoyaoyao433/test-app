package com.meituan.msc.common.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final String[] b = new String[0];

    public static String a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca84f3927a0ccb085613a13b81d6c2c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca84f3927a0ccb085613a13b81d6c2c9");
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

    public static boolean a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9238edc3041d4a0bb94edb78e6b026b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9238edc3041d4a0bb94edb78e6b026b")).booleanValue();
        }
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
