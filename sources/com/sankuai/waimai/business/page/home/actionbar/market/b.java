package com.sankuai.waimai.business.page.home.actionbar.market;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Boolean b;

    public static boolean a() {
        ABStrategy strategy;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41fcd1b0249a6555af98d34c1c241f91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41fcd1b0249a6555af98d34c1c241f91")).booleanValue();
        }
        if (b == null) {
            IABTestService iABTestService = (IABTestService) com.sankuai.waimai.router.a.a(IABTestService.class, IABTestService.KEY);
            if (iABTestService == null || (strategy = iABTestService.getStrategy("homepage_weather_float_priority", null)) == null) {
                return false;
            }
            b = Boolean.valueOf(TextUtils.equals(strategy.expName, "activity_h_b1"));
            com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "AB test  market first = " + b, new Object[0]);
        }
        return b.booleanValue();
    }
}
