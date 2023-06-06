package com.sankuai.waimai.foundation.core.service.order;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c implements IOrderSubmitService {
    public static ChangeQuickRedirect a;
    private static volatile c b;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7103cb8df086b7993ca41530fc05eabb", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7103cb8df086b7993ca41530fc05eabb");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.order.IOrderSubmitService
    public boolean checkAccount(Context context, long j, String str, a.EnumC0947a enumC0947a) {
        Object[] objArr = {context, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a8d57478fcec87e4019fd420f812b8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a8d57478fcec87e4019fd420f812b8e")).booleanValue();
        }
        IOrderSubmitService iOrderSubmitService = (IOrderSubmitService) com.sankuai.waimai.router.a.a(IOrderSubmitService.class, "IOrderSubmitService");
        return iOrderSubmitService != null && iOrderSubmitService.checkAccount(context, j, str, enumC0947a);
    }

    @Override // com.sankuai.waimai.foundation.core.service.order.IOrderSubmitService
    public void perOrder(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e0552ebd6be8cfa6ee6e29c47b1e172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e0552ebd6be8cfa6ee6e29c47b1e172");
            return;
        }
        IOrderSubmitService iOrderSubmitService = (IOrderSubmitService) com.sankuai.waimai.router.a.a(IOrderSubmitService.class, "IOrderSubmitService");
        if (iOrderSubmitService != null) {
            iOrderSubmitService.perOrder(dVar);
        }
    }
}
