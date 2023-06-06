package com.sankuai.waimai.store.controller;

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
    public ImageView b;

    public e(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08986dc0021fef9c5fecacd1884ecf92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08986dc0021fef9c5fecacd1884ecf92");
        }
    }

    @Override // com.sankuai.waimai.store.controller.g
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7926afe4c52399fe6c1f89f12a6e1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7926afe4c52399fe6c1f89f12a6e1b");
            return;
        }
        super.a(view);
        this.b = (ImageView) view.findViewById(R.id.coupon_action_area);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.controller.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b17307e05c2f9a8e420841651f7295de", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b17307e05c2f9a8e420841651f7295de");
                    return;
                }
                e eVar = e.this;
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "1e45ca4bc1113b75e767a892d77bde26", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "1e45ca4bc1113b75e767a892d77bde26");
                } else if (!p.a(eVar.m)) {
                    com.sankuai.waimai.store.manager.judas.b.a(view2.getContext(), "b_waimai_sg_znkpr0b0_mc").a("poi_id", eVar.m.d()).a();
                }
                com.sankuai.waimai.store.coupons.a.a().a(e.this.n, e.this.m);
            }
        });
    }
}
