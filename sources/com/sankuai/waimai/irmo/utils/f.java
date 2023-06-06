package com.sankuai.waimai.irmo.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b40d0e4085627e2bc632a3f01c0615b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b40d0e4085627e2bc632a3f01c0615b")).booleanValue();
        }
        IABTestService iABTestService = (IABTestService) com.sankuai.waimai.router.a.a(IABTestService.class, IABTestService.KEY);
        if (iABTestService == null) {
            d.e("MatrixABUtils 获取AB Service 失败 使用旧方案", new Object[0]);
            return false;
        }
        ABStrategy strategy = iABTestService.getStrategy("irmo_resource_load_strategy_ab", null);
        if (strategy == null) {
            d.e("MatrixABUtils 获取AB strategy == null ", new Object[0]);
            return false;
        }
        boolean equals = TextUtils.equals(strategy.expName, "use_load_sdk");
        d.c("MatrixABUtils 获取AB 使用新方案: " + equals, new Object[0]);
        return equals;
    }
}
