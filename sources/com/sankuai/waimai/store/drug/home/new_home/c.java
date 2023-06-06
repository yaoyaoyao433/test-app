package com.sankuai.waimai.store.drug.home.new_home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.expose.v2.entity.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements c.a {
    public static ChangeQuickRedirect a;
    private final Mach b;
    private final com.sankuai.waimai.mach.node.a c;

    public c(Mach mach, com.sankuai.waimai.mach.node.a aVar) {
        this.b = mach;
        this.c = aVar;
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b8664a9e870b6935aa3e42b7790a29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b8664a9e870b6935aa3e42b7790a29");
            return;
        }
        Mach mach = this.b;
        com.sankuai.waimai.mach.node.a aVar = this.c;
        Object[] objArr2 = {mach, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ea73534775f9afedf54826de91d029af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ea73534775f9afedf54826de91d029af");
        } else {
            mach.triggerViewReport(aVar);
        }
    }
}
