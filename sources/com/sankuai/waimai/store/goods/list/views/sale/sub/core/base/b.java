package com.sankuai.waimai.store.goods.list.views.sale.sub.core.base;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.platform.shop.model.SaleCampaignGather;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.base.statistic.a b;
    private final List<com.sankuai.waimai.store.goods.list.views.sale.business.a> c;
    private final List<com.sankuai.waimai.store.expose.v2.entity.b> d;

    public b(@Nullable com.sankuai.waimai.store.base.statistic.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb250c244ea5f3dd377e4a507bcfd6df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb250c244ea5f3dd377e4a507bcfd6df");
            return;
        }
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.b = aVar;
    }

    public final void a(View view, @IdRes int[] iArr) {
        Object[] objArr = {view, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a64324fcf8b06d7a438a23b2c6e0d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a64324fcf8b06d7a438a23b2c6e0d6");
        } else if (iArr.length != 0 && view != null) {
            this.c.clear();
            this.d.clear();
            for (int i : iArr) {
                View findViewById = view.findViewById(i);
                if (findViewById != null) {
                    if (this.b != null) {
                        this.d.add(this.b.a(findViewById));
                    }
                    this.c.add(new com.sankuai.waimai.store.goods.list.views.sale.business.a(findViewById));
                }
            }
        }
    }

    public final void a(List<SaleCampaignGather> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66733eb227f7adea4fc69e1ac283ce0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66733eb227f7adea4fc69e1ac283ce0d");
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            com.sankuai.waimai.store.goods.list.views.sale.business.a aVar = (com.sankuai.waimai.store.goods.list.views.sale.business.a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
            SaleCampaignGather saleCampaignGather = (SaleCampaignGather) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (!p.a(aVar, saleCampaignGather)) {
                final HashMap hashMap = new HashMap();
                hashMap.put("activity_type", saleCampaignGather.activityType);
                hashMap.put("index", Integer.valueOf(i));
                aVar.c = new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34d488f781f4febb316d40f8ea1e5bea", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34d488f781f4febb316d40f8ea1e5bea");
                        } else if (b.this.b != null) {
                            b.this.b.a(hashMap);
                        }
                    }
                };
                com.sankuai.waimai.store.expose.v2.entity.b bVar = (com.sankuai.waimai.store.expose.v2.entity.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, i);
                if (bVar != null && this.b != null) {
                    this.b.a(bVar, i, hashMap);
                }
                aVar.a(saleCampaignGather);
            }
        }
    }
}
