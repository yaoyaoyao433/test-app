package com.sankuai.waimai.store.goods.list.views.sale.sub.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a;
import com.sankuai.waimai.store.platform.shop.model.SaleCampaignGather;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.c implements com.sankuai.waimai.store.goods.list.views.sale.sub.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a b;

    @Override // com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.c
    public final int a() {
        return R.layout.wm_sg_on_sale_one_view;
    }

    public b(@NonNull ViewGroup viewGroup, @Nullable com.sankuai.waimai.store.base.statistic.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e3422dd0c344832f74dd8198258c32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e3422dd0c344832f74dd8198258c32");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e713ba87e44b3249f552c92770dcfad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e713ba87e44b3249f552c92770dcfad2");
            return;
        }
        super.onViewCreated();
        this.b = new com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a(this.d);
        com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a aVar = this.b;
        View view = getView();
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "fb7e8c7ffeceafac88d0fe9992f3e0ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "fb7e8c7ffeceafac88d0fe9992f3e0ad");
        } else {
            aVar.b = new a.C1201a(view);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.views.sale.sub.a
    public final void a(List<SaleCampaignGather> list) {
        boolean z;
        SaleCampaignGather saleCampaignGather;
        com.sankuai.waimai.store.expose.v2.entity.b a2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe43f820880be50c922cbe05b07db80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe43f820880be50c922cbe05b07db80");
            return;
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "411e1a0c81263ea5c054a3b7f072f402", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "411e1a0c81263ea5c054a3b7f072f402")).booleanValue();
        } else {
            z = com.sankuai.shangou.stone.util.a.a((List) list) == 1 && (saleCampaignGather = (SaleCampaignGather) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0)) != null && com.sankuai.shangou.stone.util.a.a((List) saleCampaignGather.mDrugFactoryProcuctList) == 4;
        }
        if (z) {
            final com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a aVar = this.b;
            SaleCampaignGather saleCampaignGather2 = (SaleCampaignGather) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
            Object[] objArr3 = {saleCampaignGather2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "25c829f12b087349b9a485e95a4d1b9a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "25c829f12b087349b9a485e95a4d1b9a");
                return;
            } else if (aVar.b == null || saleCampaignGather2 == null) {
                return;
            } else {
                final HashMap hashMap = new HashMap();
                hashMap.put("activity_type", t.a(saleCampaignGather2.activityType) ? "-999" : saleCampaignGather2.activityType);
                hashMap.put("index", 0);
                aVar.b.c = new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3fa7d61ef34d595874f5b5fc55c37ee7", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3fa7d61ef34d595874f5b5fc55c37ee7");
                        } else if (aVar.c != null) {
                            aVar.c.a(hashMap);
                        }
                    }
                };
                if (aVar.c != null && (a2 = aVar.c.a(aVar.b.getView())) != null) {
                    aVar.c.a(a2, 0, hashMap);
                }
                aVar.b.a(saleCampaignGather2);
                return;
            }
        }
        hide();
    }
}
