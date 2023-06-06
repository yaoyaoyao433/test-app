package com.sankuai.waimai.store.goods.list;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCSuperMarketSubActivity extends SCSuperMarketActivity {
    public static ChangeQuickRedirect g;

    @Override // com.sankuai.waimai.store.goods.list.SCSuperMarketActivity
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df6e8dec3f7f11e804242110dc18a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df6e8dec3f7f11e804242110dc18a83");
        } else {
            this.f = new com.sankuai.waimai.store.goods.list.delegate.impl.f(this, 2);
        }
    }
}
