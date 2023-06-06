package com.sankuai.waimai.store.drug.home.new_home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements android.arch.lifecycle.l {
    public static ChangeQuickRedirect a;
    private final NewDrugHomeFeedFlowCard b;

    public e(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard) {
        this.b = newDrugHomeFeedFlowCard;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e7cf96540011dcdda1bfa518ea57ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e7cf96540011dcdda1bfa518ea57ae");
        } else {
            NewDrugHomeFeedFlowCard.a(this.b, (com.sankuai.waimai.store.drug.home.new_home.realtime.a) obj);
        }
    }
}
