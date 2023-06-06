package com.sankuai.waimai.business.restaurant.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d74e6295ba770b970153a89d4b78671", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d74e6295ba770b970153a89d4b78671");
        }
        try {
            return com.sankuai.waimai.platform.domain.core.poi.b.a(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return str;
        }
    }
}
