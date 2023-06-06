package com.sankuai.waimai.drug.o2o;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.drug.j;
import com.sankuai.waimai.store.platform.domain.core.order.ShopCartPrice;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends j {
    public static ChangeQuickRedirect h;
    private LinearLayout i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private com.sankuai.waimai.store.order.a o;
    private TextView p;

    public f(@NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(aVar.i(), aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2453ebddd3f3902ff169b1b433e6887", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2453ebddd3f3902ff169b1b433e6887");
        } else {
            this.o = com.sankuai.waimai.store.order.a.e();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49a10487d617db0c46ebef9f1af6644", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49a10487d617db0c46ebef9f1af6644") : layoutInflater.inflate(R.layout.wm_drug_shopcart_o2o_price_display_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f2f839a39bea29b801250bee60dfe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f2f839a39bea29b801250bee60dfe4");
            return;
        }
        super.onViewCreated();
        this.i = (LinearLayout) findView(R.id.wm_drug_shop_cart_top_layout);
        this.j = (TextView) findView(R.id.wm_drug_shop_cart_shipping_threshold_text);
        this.k = (TextView) findView(R.id.wm_drug_shop_cart_discount_price_text);
        this.p = (TextView) findView(R.id.wm_drug_shop_cart_origin_price_text);
        this.l = (TextView) findView(R.id.wm_drug_shop_cart_shipping_fee_text);
        this.m = (TextView) findView(R.id.wm_drug_shop_cart_estimate_pack_fee);
        this.n = (TextView) findView(R.id.wm_drug_shop_cart_origin_shipping_fee_text);
        this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.o2o.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43e4956895c6eba5d0c869092734f22c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43e4956895c6eba5d0c869092734f22c");
                } else {
                    f.this.b.k();
                }
            }
        });
        b();
    }

    @Override // com.sankuai.waimai.drug.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3523629a86f49eca93737c82408ffeb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3523629a86f49eca93737c82408ffeb6");
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54656d05e799d501d5bfbe92fdec1c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54656d05e799d501d5bfbe92fdec1c65");
        } else if (!this.o.i(this.b.g().d())) {
            if (c()) {
                this.i.setVisibility(0);
                this.j.setVisibility(0);
                this.j.setText(this.mContext.getString(R.string.wm_st_dealInfo_min_fee_to_send, i.a(this.b.g().s())));
            } else {
                this.i.setVisibility(8);
            }
            this.l.setText(this.b.g().k());
            u.a(this.m, this.b.g().l());
            if (i.d(Double.valueOf(this.b.g().b.getOriginShippingFee()), Double.valueOf(0.0d))) {
                this.n.setText(this.mContext.getString(R.string.wm_sc_common_price, String.valueOf(this.b.g().b.getOriginShippingFee())));
            } else {
                this.n.setText("");
            }
            u.a(this.k, "");
            this.p.setText("");
        } else {
            this.j.setVisibility(8);
            this.i.setVisibility(0);
            double o = this.o.o(this.b.g().d());
            double m = this.o.m(this.b.g().d());
            if (i.e(Double.valueOf(o), Double.valueOf(0.0d))) {
                u.a(this.k, com.sankuai.waimai.store.shopping.cart.util.d.a(this.mContext, o, 13));
            }
            if (!i.a(Double.valueOf(m), Double.valueOf(o))) {
                this.p.setText(this.mContext.getString(R.string.wm_sc_common_price, i.a(m)));
            }
            ShopCartPrice shopCartPrice = this.o.k(this.b.g().d()).g;
            if (shopCartPrice != null) {
                u.a(this.l, shopCartPrice.mShippingFeeTxt);
                u.a(this.n, shopCartPrice.mOriginShippingFeeTxt);
                u.a(this.m, shopCartPrice.mEstimatePackFee);
            }
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05903e6568713c128bc5782609c47666", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05903e6568713c128bc5782609c47666")).booleanValue() : this.b.h().e == 2;
    }
}
