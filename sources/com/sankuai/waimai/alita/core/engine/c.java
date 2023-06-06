package com.sankuai.waimai.alita.core.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d2059615379e4a2d617d4d34fb9c6cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d2059615379e4a2d617d4d34fb9c6cb");
        }
        return "Alita_" + str.replaceAll(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE);
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a4a352f2bbcd4b029c6026d6f35012c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a4a352f2bbcd4b029c6026d6f35012c");
        }
        try {
            return str.substring(6);
        } catch (Exception unused) {
            return str;
        }
    }
}
