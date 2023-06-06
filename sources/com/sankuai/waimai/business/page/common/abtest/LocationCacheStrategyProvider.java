package com.sankuai.waimai.business.page.common.abtest;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.ILocationCacheStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocationCacheStrategyProvider implements ILocationCacheStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.location.v2.ILocationCacheStrategy
    public boolean isNewCacheStrategy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2dbabfdd4e6b9cdecdd968fc72d3dcf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2dbabfdd4e6b9cdecdd968fc72d3dcf")).booleanValue() : a.a().equals(ErrorCode.ERROR_TYPE_B);
    }
}
