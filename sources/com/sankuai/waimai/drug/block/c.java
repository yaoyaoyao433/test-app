package com.sankuai.waimai.drug.block;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.store.shopping.cart.contract.a b;
    final SCPageConfig c;
    long d;
    private TextView e;
    private ImageView f;
    private GoodDetailResponse g;

    public c(@NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodDetailResponse goodDetailResponse) {
        super(aVar.i());
        Object[] objArr = {aVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "787bce5a0f9f9fb3d17c15168009cdb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "787bce5a0f9f9fb3d17c15168009cdb5");
            return;
        }
        this.d = -999L;
        this.b = aVar;
        this.c = aVar.h();
        this.g = goodDetailResponse;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a26ac176ab08aa5463fc3a171c22e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a26ac176ab08aa5463fc3a171c22e5");
            return;
        }
        super.onViewCreated();
        this.e = (TextView) this.mView.findViewById(R.id.announce_content);
        this.f = (ImageView) this.mView.findViewById(R.id.announce_close_iv);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aada26b76dae167f9473310aa87b153d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aada26b76dae167f9473310aa87b153d");
                    return;
                }
                c.this.hide();
                com.sankuai.waimai.store.manager.judas.b.a(c.this.c.d, com.sankuai.waimai.store.manager.judas.b.a((Object) c.this.mContext), "b_waimai_szvy2dgj_mc").a("poi_id", c.this.b.g().d()).a("spu_id", Long.valueOf(c.this.d)).a();
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b063d0ea0cb767f133b114f1740674e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b063d0ea0cb767f133b114f1740674e");
            return;
        }
        if ((this.c.e == 2) && this.g != null && this.g.announcement != null && !t.a(this.g.announcement.content)) {
            show();
            this.d = this.g.mFoodSpu.id;
            this.e.setText(this.g.announcement.content);
            com.sankuai.waimai.store.manager.judas.b.b(this.c.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.mContext), "b_waimai_szvy2dgj_mv").a("poi_id", this.b.g().d()).a("spu_id", Long.valueOf(this.d)).a();
            return;
        }
        hide();
    }
}
