package com.sankuai.waimai.store.manager.order;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.order.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(com.sankuai.waimai.store.order.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        com.sankuai.waimai.foundation.core.service.order.b bVar2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f5a90184e6ad985167f99d9bc71296a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f5a90184e6ad985167f99d9bc71296a");
            return;
        }
        com.sankuai.waimai.foundation.core.service.order.a a2 = com.sankuai.waimai.foundation.core.service.order.a.a();
        if (bVar != null) {
            b.a aVar = new b.a();
            aVar.b.a = bVar.a;
            aVar.b.b = bVar.b;
            aVar.b.c = bVar.c;
            long j = bVar.d;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "17eeb81e90b20fe36d532e66b8323b62", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (b.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "17eeb81e90b20fe36d532e66b8323b62");
            } else {
                aVar.b.d = j;
            }
            aVar.b.f = bVar.e;
            bVar2 = aVar.b;
        }
        a2.orderAgain(bVar2);
    }
}
