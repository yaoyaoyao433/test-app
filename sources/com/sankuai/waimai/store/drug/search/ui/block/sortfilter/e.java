package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.search.ui.block.sortfilter.BrandQuickFilterListView;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.search.model.BrandFilterItem;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements c.a {
    public static ChangeQuickRedirect a;
    private final BrandQuickFilterListView.b b;
    private final SCBaseActivity c;
    private final BrandFilterItem d;
    private final int e;

    public e(BrandQuickFilterListView.b bVar, SCBaseActivity sCBaseActivity, BrandFilterItem brandFilterItem, int i) {
        this.b = bVar;
        this.c = sCBaseActivity;
        this.d = brandFilterItem;
        this.e = i;
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af58b5bee7d38b713ac36d878f6b0a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af58b5bee7d38b713ac36d878f6b0a2c");
            return;
        }
        BrandQuickFilterListView.b bVar = this.b;
        SCBaseActivity sCBaseActivity = this.c;
        BrandFilterItem brandFilterItem = this.d;
        int i = this.e;
        Object[] objArr2 = {bVar, sCBaseActivity, brandFilterItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = BrandQuickFilterListView.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7758233dc5787a4075fb175637e5e659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7758233dc5787a4075fb175637e5e659");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", sCBaseActivity.d(), "b_waimai_med_47o2mzvu_mv").b(bVar.a(brandFilterItem, i)).a();
        }
    }
}
