package com.sankuai.waimai.business.order.api.store;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static final String b = com.sankuai.waimai.foundation.router.interfaces.b.d + "/drug_goods_list";

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18f85581ee2d4429b6ebcc7c189ca3af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18f85581ee2d4429b6ebcc7c189ca3af");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.order.api.submit.constants.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "07522dcd8561a38dfefe6ad152aab57e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "07522dcd8561a38dfefe6ad152aab57e")).booleanValue() : "from_drug_restaurant".equals(str)) {
            return b;
        }
        return com.sankuai.waimai.foundation.router.interfaces.a.a;
    }
}
