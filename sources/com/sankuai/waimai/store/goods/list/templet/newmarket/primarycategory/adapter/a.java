package com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends f<GoodsPoiCategory, b> {
    public static ChangeQuickRedirect a;

    public a(@NonNull b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc0b58998bdbd70cc5a528f094317bb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc0b58998bdbd70cc5a528f094317bb0");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9025d9ad3060c4aee8f56a8e2d16c1e", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9025d9ad3060c4aee8f56a8e2d16c1e") : new c();
    }
}
