package com.sankuai.waimai.drug.block;

import android.app.Dialog;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.drug.coupon.MemberCouponEntry;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    SCPageConfig b;
    com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    String d;
    com.sankuai.waimai.drug.contract.a e;
    private RelativeLayout f;
    private TextView g;
    private LinearLayout h;
    private TextView i;
    private String j;
    private String k;

    public i(com.sankuai.waimai.drug.contract.a aVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2, SCPageConfig sCPageConfig, String str) {
        super(aVar.i());
        Object[] objArr = {aVar, aVar2, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838f0381c6aeef7c4e66364633b521c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838f0381c6aeef7c4e66364633b521c9");
            return;
        }
        this.j = "";
        this.k = "";
        this.d = "";
        this.e = aVar;
        this.c = aVar2;
        this.b = sCPageConfig;
        this.d = str;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d4e547ea15b27b6a53c97b4a21603e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d4e547ea15b27b6a53c97b4a21603e");
            return;
        }
        super.onViewCreated();
        this.f = (RelativeLayout) this.mView.findViewById(R.id.layout_member_bar);
        this.h = (LinearLayout) this.mView.findViewById(R.id.ll_member_area);
        this.g = (TextView) this.mView.findViewById(R.id.text_member_tag);
        this.i = (TextView) this.mView.findViewById(R.id.text_member_tips);
        ImageView imageView = (ImageView) this.mView.findViewById(R.id.iv_arrow);
        imageView.setImageDrawable(com.sankuai.waimai.store.view.a.a(imageView.getContext(), (int) R.dimen.wm_sc_common_dimen_4, (int) R.dimen.wm_sc_common_dimen_8, (int) R.color.wm_sg_color_5f3f25, a.EnumC1338a.RIGHT));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0aba9366c01abbf4b2656a2b58f1492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0aba9366c01abbf4b2656a2b58f1492");
        } else if (this.f.getVisibility() == 0) {
            com.sankuai.waimai.store.manager.judas.b.b(this.b.d, "b_waimai_nrotvhei_mv").a("poi_id", this.c.d()).a("text", this.k).a("stid", this.j).a("brand_id", this.c.b != null ? this.c.b.brandId : "").a();
        }
    }

    public final void a(final com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "388bd28166fde224bec6c920fea3ee74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "388bd28166fde224bec6c920fea3ee74");
            return;
        }
        final com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.g gVar = bVar.k;
        this.j = bVar.h;
        if (gVar != null && !t.a(gVar.a)) {
            this.f.setVisibility(0);
            this.k = gVar.a;
            this.i.setText(com.sankuai.waimai.store.util.l.a(gVar.a, this.mContext.getString(R.string.wm_st_shop_cart_high_light_color)));
            if (gVar.d == 0) {
                this.h.setVisibility(8);
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.i.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1366fdf351ee40a928f9078d8c7ae65d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1366fdf351ee40a928f9078d8c7ae65d");
                        }
                    }
                });
                return;
            }
            this.h.setVisibility(0);
            this.g.setText(com.sankuai.waimai.store.util.l.a(t.a(gVar.b) ? "" : gVar.b, this.mContext.getString(R.string.wm_st_shop_cart_high_light_color)));
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.i.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f61e4b18f553e703ca02156b4368fb75", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f61e4b18f553e703ca02156b4368fb75");
                        return;
                    }
                    new com.sankuai.waimai.store.drug.coupon.d(new MemberCouponEntry(i.this.mContext)).a(i.this.c.g(), i.this.c.h(), i.this.d, (Dialog) null, 3, bVar.u != null ? bVar.u.recommendCouponInfo : null);
                    if (i.this.e != null) {
                        i.this.e.a();
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(i.this.b.d, "b_waimai_nrotvhei_mc").a("poi_id", i.this.c.d()).a("text", gVar.a).a("stid", bVar.h).a("brand_id", i.this.c.b != null ? i.this.c.b.brandId : "").a();
                }
            });
            return;
        }
        this.f.setVisibility(8);
    }
}
