package com.sankuai.waimai.store.drug.home.new_home;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.home.new_home.j;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements j.a {
    public static ChangeQuickRedirect a;
    private final NewDrugHomeFeedFlowCard b;
    private final Pair c;

    public h(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, Pair pair) {
        this.b = newDrugHomeFeedFlowCard;
        this.c = pair;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.j.a
    public final void a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a854b01ac4bdb29e6362a7f5c21e4bde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a854b01ac4bdb29e6362a7f5c21e4bde");
        } else {
            NewDrugHomeFeedFlowCard.a(this.b, this.c, list);
        }
    }
}
