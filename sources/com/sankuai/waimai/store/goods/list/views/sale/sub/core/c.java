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
public final class c extends com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.c implements com.sankuai.waimai.store.goods.list.views.sale.sub.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.b b;

    @Override // com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.c
    public final int a() {
        return R.layout.wm_sg_on_sale_three_view;
    }

    public c(@NonNull ViewGroup viewGroup, @Nullable com.sankuai.waimai.store.base.statistic.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0eef995f618b8e237f3c9475307afd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0eef995f618b8e237f3c9475307afd1");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed1e35b9b79989a344180386b0a1818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed1e35b9b79989a344180386b0a1818");
            return;
        }
        super.onViewCreated();
        this.b = new com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.b(this.d);
        this.b.a(getView(), new int[]{R.id.inc_left, R.id.inc_right, R.id.inc_append});
    }

    @Override // com.sankuai.waimai.store.goods.list.views.sale.sub.a
    public final void a(List<SaleCampaignGather> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374328362e2f62fa2b8fe3e22fdc7315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374328362e2f62fa2b8fe3e22fdc7315");
        } else {
            this.b.a(list);
        }
    }
}
