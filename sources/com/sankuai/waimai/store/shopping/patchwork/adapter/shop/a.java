package com.sankuai.waimai.store.shopping.patchwork.adapter.shop;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.patchwork.adapter.d;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.shopping.patchwork.adapter.a {
    public static ChangeQuickRedirect c;
    private GoodDetailResponse d;

    public a(@NonNull d dVar, GoodDetailResponse goodDetailResponse) {
        super(dVar);
        Object[] objArr = {dVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66daf4434f5205add9fb3ba061052fc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66daf4434f5205add9fb3ba061052fc7");
        } else {
            this.d = goodDetailResponse;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95559bede387b62e8e5ac3b044f19707", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95559bede387b62e8e5ac3b044f19707") : new com.sankuai.waimai.store.shopping.patchwork.adapter.e(new ShopPatchworkListSpuCell(viewGroup.getContext()), this.b, this.d);
    }
}
