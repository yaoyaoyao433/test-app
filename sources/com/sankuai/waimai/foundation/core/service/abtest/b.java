package com.sankuai.waimai.foundation.core.service.abtest;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b implements IABTestService {
    public static ChangeQuickRedirect a;
    private static volatile b b;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77420d945f498a1f861812d19b51d1aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77420d945f498a1f861812d19b51d1aa");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.abtest.IABTestService
    public ABStrategy getStrategy(String str, ABStrategy aBStrategy) {
        Object[] objArr = {str, aBStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69ced12a8e32ed097aa7e922f41284b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ABStrategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69ced12a8e32ed097aa7e922f41284b");
        }
        IABTestService iABTestService = (IABTestService) com.sankuai.waimai.router.a.a(IABTestService.class, IABTestService.KEY);
        return iABTestService == null ? aBStrategy : iABTestService.getStrategy(str, aBStrategy);
    }
}
