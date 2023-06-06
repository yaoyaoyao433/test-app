package com.sankuai.waimai.store.search.common.api.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.store.base.net.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends e {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.waimai.store.base.net.e, com.sankuai.waimai.store.base.net.b
    public final ar.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fb28a007d6487f3fa3d0b9792fe02b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fb28a007d6487f3fa3d0b9792fe02b");
        }
        ar.a b = super.b();
        b.a(new com.sankuai.waimai.store.monitor.c(new c()));
        return b;
    }
}
