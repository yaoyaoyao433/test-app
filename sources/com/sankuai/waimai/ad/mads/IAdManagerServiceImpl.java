package com.sankuai.waimai.ad.mads;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.foundation.core.service.ad.IAdManagerService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IAdManagerServiceImpl implements IAdManagerService {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.service.ad.IAdManagerService
    public final void a(com.sankuai.waimai.foundation.core.service.ad.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9680ee09771c66f14f934db70dc74e08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9680ee09771c66f14f934db70dc74e08");
        } else if (aVar != null) {
            a.a(aVar.e, new b.a(aVar.a, aVar.b, 3).a(aVar.c));
            a.a(aVar.d);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.ad.IAdManagerService
    public final void b(com.sankuai.waimai.foundation.core.service.ad.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f49fffa33464639c09b9bc8c3a2ee59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f49fffa33464639c09b9bc8c3a2ee59");
        } else if (aVar != null) {
            a.a(aVar.e, new b.a(aVar.a, aVar.b, 2).a(aVar.c));
            a.a(aVar.d);
        }
    }
}
