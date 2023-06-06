package com.sankuai.waimai.store.drug.home.new_home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements android.arch.lifecycle.l {
    public static ChangeQuickRedirect a;
    private final NewDrugHomeFeedFlowCard b;

    public d(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard) {
        this.b = newDrugHomeFeedFlowCard;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6833c2f705add92d196d118d35e1fabf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6833c2f705add92d196d118d35e1fabf");
        } else {
            NewDrugHomeFeedFlowCard.b(this.b, (com.sankuai.waimai.store.drug.home.new_home.realtime.a) obj);
        }
    }
}
