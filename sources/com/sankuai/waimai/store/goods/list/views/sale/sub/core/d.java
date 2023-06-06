package com.sankuai.waimai.store.goods.list.views.sale.sub.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.SaleCampaignGather;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.c implements com.sankuai.waimai.store.goods.list.views.sale.sub.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.b b;

    @Override // com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.c
    public final int a() {
        return R.layout.wm_sg_on_sale_two_view;
    }

    public d(@NonNull ViewGroup viewGroup, @Nullable com.sankuai.waimai.store.base.statistic.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842db0811b09544e7d3301badc19d1d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842db0811b09544e7d3301badc19d1d9");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06c4a2e7f903595f848485cb85993cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06c4a2e7f903595f848485cb85993cb");
            return;
        }
        super.onViewCreated();
        this.b = new com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.b(this.d);
        this.b.a(getView(), new int[]{R.id.inc_left, R.id.inc_right});
    }

    @Override // com.sankuai.waimai.store.goods.list.views.sale.sub.a
    public final void a(List<SaleCampaignGather> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a6fd88adac286ad3a8604408b8c898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a6fd88adac286ad3a8604408b8c898");
        } else {
            this.b.a(list);
        }
    }
}
