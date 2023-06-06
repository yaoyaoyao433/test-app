package com.sankuai.waimai.store.drug.home.new_home;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.home.new_home.j;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements j.a {
    public static ChangeQuickRedirect a;
    private final NewDrugHomeFeedFlowCard b;
    private final Pair c;

    public i(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, Pair pair) {
        this.b = newDrugHomeFeedFlowCard;
        this.c = pair;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.j.a
    public final void a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f9fb774a74ef6af68db74258dd142c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f9fb774a74ef6af68db74258dd142c");
        } else {
            NewDrugHomeFeedFlowCard.b(this.b, this.c, list);
        }
    }
}
