package com.sankuai.waimai.store.drug.home.new_home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.home.new_home.j;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements j.a {
    public static ChangeQuickRedirect a;
    private final NewDrugHomeFeedFlowCard b;
    private final CategoryInfo c;
    private final PoiVerticalityDataResponse d;

    public g(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, CategoryInfo categoryInfo, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        this.b = newDrugHomeFeedFlowCard;
        this.c = categoryInfo;
        this.d = poiVerticalityDataResponse;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.j.a
    public final void a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b21d589f2a9393e6c8186ede287dc9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b21d589f2a9393e6c8186ede287dc9e");
        } else {
            NewDrugHomeFeedFlowCard.a(this.b, this.c, this.d, list);
        }
    }
}
