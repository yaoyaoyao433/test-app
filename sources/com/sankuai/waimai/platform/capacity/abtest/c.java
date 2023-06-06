package com.sankuai.waimai.platform.capacity.abtest;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e2ea6663fce8cf8b13a3bb492aa5811", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e2ea6663fce8cf8b13a3bb492aa5811")).booleanValue();
        }
        ABStrategy a2 = a("wm_multipletransaction_abtest", null);
        return !com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "global_cart_is_new_user", false) && (a2 != null && "C".equals(a2.expName));
    }
}
