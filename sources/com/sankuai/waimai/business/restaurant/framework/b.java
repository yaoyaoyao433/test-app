package com.sankuai.waimai.business.restaurant.framework;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends Lifecycle {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.business.restaurant.framework.Lifecycle
    public final void a(i iVar, a aVar) {
        Object[] objArr = {iVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95c67984831219d2157dd7d95a7999a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95c67984831219d2157dd7d95a7999a");
        } else {
            super.a(iVar, aVar);
        }
    }
}
