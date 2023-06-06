package com.sankuai.waimai.imbase.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean a(String str, String str2) {
        int parseInt;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cb8145d05588308bdde024fe1e74d19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cb8145d05588308bdde024fe1e74d19")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            String[] split = str2.replaceAll(CommonConstant.Symbol.COLON, "").split(CommonConstant.Symbol.MINUS);
            if (split != null && split.length == 2 && (parseInt = Integer.parseInt(str.replace(CommonConstant.Symbol.COLON, ""))) >= Integer.parseInt(split[0])) {
                if (parseInt <= Integer.parseInt(split[1])) {
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        return false;
    }
}
