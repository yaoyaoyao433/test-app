package com.sankuai.waimai.store.poilist.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.poilist.viewholders.h;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.newwidgets.flowlayout.a<PoiVerticality.RecommendLabel, a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.newwidgets.flowlayout.a
    public final boolean a() {
        return true;
    }

    public b(a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "518fed6d07bcd7d3386334e63e3a9dd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "518fed6d07bcd7d3386334e63e3a9dd0");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d611d7e0a41812ce178f4b7c1a91a2", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d611d7e0a41812ce178f4b7c1a91a2") : new h();
    }
}
