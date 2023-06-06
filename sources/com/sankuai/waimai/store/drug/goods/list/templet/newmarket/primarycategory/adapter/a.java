package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205e3483f6009939ff2ab90c18b67fed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205e3483f6009939ff2ab90c18b67fed");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549c91666c1bf3fc9e4de9ba06d8cde7", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549c91666c1bf3fc9e4de9ba06d8cde7") : new c();
    }
}
