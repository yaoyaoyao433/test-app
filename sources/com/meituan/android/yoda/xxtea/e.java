package com.meituan.android.yoda.xxtea;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70c7409fd57f10256ea2ff2cc635a4a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70c7409fd57f10256ea2ff2cc635a4a4");
        }
        try {
            return new StringBuffer(f.a(str, new String(b.a(str2.getBytes()).getBytes()).replace("=", CommonConstant.Symbol.BRACKET_RIGHT).replace("+", CommonConstant.Symbol.BRACKET_LEFT)).replace("/", CommonConstant.Symbol.BRACKET_LEFT).replace("+", CommonConstant.Symbol.BRACKET_RIGHT)).reverse().toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
