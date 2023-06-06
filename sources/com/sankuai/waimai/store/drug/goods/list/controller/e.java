package com.sankuai.waimai.store.drug.goods.list.controller;

import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends g {
    public static ChangeQuickRedirect a;
    ImageView b;

    public e(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0deb7a8ce04b2d0cf57f75bec9cb5863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0deb7a8ce04b2d0cf57f75bec9cb5863");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.g
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b82ee1d98720a941fa0a3af59a6aa287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b82ee1d98720a941fa0a3af59a6aa287");
            return;
        }
        super.a(view);
        this.b = (ImageView) view.findViewById(R.id.coupon_action_area);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ea04d65ffe3615b29251acb0bd1c455", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ea04d65ffe3615b29251acb0bd1c455");
                    return;
                }
                e eVar = e.this;
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "6bfea41577322797d636a1c879269d0d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "6bfea41577322797d636a1c879269d0d");
                } else if (!p.a(eVar.l)) {
                    com.sankuai.waimai.store.manager.judas.b.a(view2.getContext(), "b_waimai_sg_znkpr0b0_mc").a("poi_id", eVar.l.d()).a();
                }
                com.sankuai.waimai.store.drug.coupons.b.a(e.this.m, e.this.l);
            }
        });
    }
}
