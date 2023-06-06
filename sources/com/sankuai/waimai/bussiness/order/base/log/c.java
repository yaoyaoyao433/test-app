package com.sankuai.waimai.bussiness.order.base.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.capacity.log.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a.AbstractC1040a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.platform.capacity.log.a.AbstractC1040a
    public final String a() {
        return "sg_order";
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c661aa2a3c2af73e5da4534d4908c88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c661aa2a3c2af73e5da4534d4908c88");
            return;
        }
        String str = "sg_msc_poi_menu_wm";
        if (com.sankuai.waimai.foundation.core.a.d()) {
            str = "sg_msc_poi_menu_wm";
        } else if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "sg_msc_poi_menu_mt";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str = "sg_msc_poi_menu_dp";
        }
        ABStrategy strategy = ABTestManager.getInstance().getStrategy(str, new ABStrategy("FRONT", "AB", str, "A", "X"));
        if (strategy != null) {
            String str2 = strategy.expName;
            b(str + CommonConstant.Symbol.UNDERLINE + str2);
        }
    }
}
