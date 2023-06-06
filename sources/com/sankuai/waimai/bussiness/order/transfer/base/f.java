package com.sankuai.waimai.bussiness.order.transfer.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements c {
    public static ChangeQuickRedirect a;
    private j b;
    private com.sankuai.waimai.router.core.g c;

    public f(com.sankuai.waimai.router.core.g gVar, j jVar) {
        Object[] objArr = {gVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1bbd4b187e3ad1756c646c4934c612a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1bbd4b187e3ad1756c646c4934c612a");
            return;
        }
        this.c = gVar;
        this.b = jVar;
    }

    @Override // com.sankuai.waimai.bussiness.order.transfer.base.c
    public final void a(int i, Map<String, Object> map, String str) {
        Object[] objArr = {Integer.valueOf(i), null, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7096939633bc63eb98f437c5ee1a2d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7096939633bc63eb98f437c5ee1a2d8");
            return;
        }
        if (this.b != null) {
            this.b.a("pre_order_code", (String) Integer.valueOf(i));
            this.b.a("pre_order_msg", str);
        }
        if (this.c != null) {
            this.c.a(200);
        }
    }
}
