package com.sankuai.waimai.store.drug.home.new_home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements android.arch.lifecycle.l {
    public static ChangeQuickRedirect a;
    private final NewDrugHomeFeedFlowCard b;

    public f(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard) {
        this.b = newDrugHomeFeedFlowCard;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c813d8a7fb21be5c5ebe6f3b59da1021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c813d8a7fb21be5c5ebe6f3b59da1021");
        } else {
            this.b.a2((PoiVerticalityDataResponse) obj);
        }
    }
}
