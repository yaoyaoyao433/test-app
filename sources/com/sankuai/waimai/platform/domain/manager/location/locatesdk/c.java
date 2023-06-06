package com.sankuai.waimai.platform.domain.manager.location.locatesdk;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.MtLocationConfig;
import com.sankuai.waimai.foundation.location.v2.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect i;

    @Override // com.sankuai.waimai.platform.domain.manager.location.locatesdk.a, com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a(k kVar) {
    }

    public c(Context context, com.sankuai.waimai.foundation.location.c cVar, com.sankuai.waimai.foundation.location.d dVar, MtLocationConfig mtLocationConfig) {
        super(context, cVar, dVar);
        Object[] objArr = {context, cVar, dVar, mtLocationConfig};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae8f4ad4cfe1773b172b8b7b136d1ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae8f4ad4cfe1773b172b8b7b136d1ee");
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.locatesdk.a, com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6a380a8906b89e9d8a6e7413cc7d44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6a380a8906b89e9d8a6e7413cc7d44");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.location.v2.a.a("LocateFailChain", "stopLocate");
        super.a();
    }
}
