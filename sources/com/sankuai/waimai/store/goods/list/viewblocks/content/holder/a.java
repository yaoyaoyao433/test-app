package com.sankuai.waimai.store.goods.list.viewblocks.content.holder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.goods.list.views.cell.view.DrugSupportMainCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.j;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    public final int b;
    public DrugSupportMainCellView c;
    public com.sankuai.waimai.store.goods.list.delegate.impl.c d;
    public int e;

    public a(com.sankuai.waimai.store.goods.list.delegate.impl.c cVar, @NonNull com.sankuai.waimai.store.cell.core.b bVar, int i, final int i2) {
        super(new DrugSupportMainCellView(cVar) { // from class: com.sankuai.waimai.store.goods.list.viewblocks.content.holder.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
            public final int getLayoutId() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a42e5b64470d171dcebeb33870b7c83", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a42e5b64470d171dcebeb33870b7c83")).intValue();
                }
                int i3 = i2;
                Object[] objArr2 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = DrugSupportMainCellView.c;
                return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "34554e521c3ff3c841f336f3e809a6d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "34554e521c3ff3c841f336f3e809a6d1")).intValue() : i3 >= 4 ? R.layout.wm_st_poi_market_hot_sale_drug_cell : i3 == 3 ? R.layout.wm_st_poi_market_hot_sale_drug_cell_3 : i3 == 2 ? R.layout.wm_st_poi_market_hot_sale_drug_cell_2 : R.layout.wm_st_poi_market_hot_sale_drug_cell_1;
            }
        });
        Object[] objArr = {cVar, bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3322de9fbcd99f4733141a059afea825", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3322de9fbcd99f4733141a059afea825");
            return;
        }
        this.e = i2;
        this.d = cVar;
        this.b = i;
        this.c = (DrugSupportMainCellView) this.itemView;
        this.c.setPoiHelper(cVar.c());
        this.c.setActionCallback(bVar);
        this.c.setTotalSize(this.e);
    }

    public String a(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2129064c863c3895de7edfd092b341ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2129064c863c3895de7edfd092b341ad");
        }
        String a2 = j.a(goodsSpu.getPicture());
        if (TextUtils.isEmpty(a2)) {
            return a();
        }
        return a2 + ";" + a();
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1033ea4fcecf892f6a0e2d75f7dbfb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1033ea4fcecf892f6a0e2d75f7dbfb") : (this.d == null || this.d.c() == null || this.d.c().b == null || t.a(this.d.c().b.abExpInfo)) ? "" : this.d.c().b.abExpInfo;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.e, android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19b13ded582a526a24c7a815214a138", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19b13ded582a526a24c7a815214a138");
            return;
        }
        super.onClick(view);
        this.c.onClick(view);
    }
}
