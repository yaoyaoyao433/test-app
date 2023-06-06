package com.sankuai.waimai.store.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d1f59d3ea136f2b35cc7f6bb1f4eb1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d1f59d3ea136f2b35cc7f6bb1f4eb1d");
        }
        String a2 = an.a(str, "stid");
        return TextUtils.isEmpty(a2) ? "" : a2.replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.COMMA);
    }
}
