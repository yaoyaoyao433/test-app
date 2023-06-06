package com.sankuai.waimai.foundation.core.service.order;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements IAgainOrderService {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f89e1f5033dafa3f6a852e45ae8f07fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f89e1f5033dafa3f6a852e45ae8f07fa");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.order.IAgainOrderService
    public void orderAgain(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c84ea043687acb21579a86c193baff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c84ea043687acb21579a86c193baff");
            return;
        }
        IAgainOrderService iAgainOrderService = (IAgainOrderService) com.sankuai.waimai.router.a.a(IAgainOrderService.class, IAgainOrderService.KEY);
        if (iAgainOrderService != null) {
            iAgainOrderService.orderAgain(bVar);
        }
    }
}
