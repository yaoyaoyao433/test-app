package com.sankuai.waimai.drug.block;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.platform.domain.core.order.ShopCartPrice;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartCouponInfo;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.e;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class k extends com.sankuai.waimai.store.shopping.cart.ui.c {
    public static ChangeQuickRedirect b;
    private TextView a;
    protected TextView c;
    int d;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private View q;
    private TextView r;
    private FrameLayout s;
    private ImageView t;
    private ImageView u;
    private com.sankuai.waimai.store.shopping.cart.pre.b v;
    private final HashSet<Integer> w;

    private static boolean b(CartCouponInfo cartCouponInfo) {
        return cartCouponInfo != null;
    }

    public void c() {
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract float g();

    public abstract float h();

    public abstract int i();

    public static /* synthetic */ void g(k kVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "e6c9d2b7b1282d9d5212b7a508f83728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "e6c9d2b7b1282d9d5212b7a508f83728");
            return;
        }
        if (kVar.v == null) {
            kVar.v = com.sankuai.waimai.store.shopping.cart.pre.d.a((Activity) kVar.mContext, kVar.i, kVar.j);
        }
        kVar.v.a(new com.sankuai.waimai.store.shopping.cart.pre.c() { // from class: com.sankuai.waimai.drug.block.k.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.shopping.cart.pre.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e725b249699549a90d95d8a711e73409", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e725b249699549a90d95d8a711e73409");
                } else {
                    k.h(k.this);
                }
            }
        });
    }

    public static /* synthetic */ void h(k kVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "60ce94b068c7fa15a32dffea56d46485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "60ce94b068c7fa15a32dffea56d46485");
        } else if (com.sankuai.waimai.store.manager.order.b.a((Activity) kVar.mContext, kVar.i.g(), kVar.i.h(), a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER)) {
            kVar.c.setEnabled(false);
            kVar.j();
        }
    }

    public k(@NonNull Activity activity, com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodDetailResponse goodDetailResponse) {
        super(activity, aVar, goodDetailResponse);
        Object[] objArr = {activity, aVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1ae7318da96df865bc0dd6278a220a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1ae7318da96df865bc0dd6278a220a");
        } else {
            this.w = new HashSet<>();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b4d115a506111105be284238ba3244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b4d115a506111105be284238ba3244");
            return;
        }
        super.onViewCreated();
        this.n = (TextView) this.mView.findViewById(R.id.txt_dealInfo_price);
        this.s = (FrameLayout) this.mView.findViewById(R.id.ll_empty_shopping_cart);
        this.u = (ImageView) this.mView.findViewById(R.id.iv_city_delivery);
        this.t = (ImageView) this.mView.findViewById(R.id.iv_city_empty_delivery);
        this.r = (TextView) this.mView.findViewById(R.id.txt_empty_shopping_cart);
        this.q = this.mView.findViewById(R.id.layout_price);
        this.a = (TextView) this.mView.findViewById(R.id.txt_dealInfo_original_price);
        this.m = (TextView) this.mView.findViewById(R.id.txt_shipping_fee);
        this.o = (TextView) this.mView.findViewById(R.id.txt_original_shipping_price);
        this.p = (TextView) this.mView.findViewById(R.id.txt_self_deliver);
        this.c = (TextView) this.mView.findViewById(R.id.txt_dealInfo_submit);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f531589472dff58b8d745ea932397246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f531589472dff58b8d745ea932397246");
        } else {
            com.sankuai.shangou.stone.util.log.a.a("time", "init data start " + System.currentTimeMillis(), new Object[0]);
            k();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c549bc24aa3b3a9199cbe0944ab0db2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c549bc24aa3b3a9199cbe0944ab0db2");
            } else if (this.i.b.isCityDelivery()) {
                this.u.setVisibility(0);
                this.t.setVisibility(0);
            } else {
                this.u.setVisibility(8);
                this.t.setVisibility(8);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c56bb5f0a9fce58bb2c90758ea9d74a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c56bb5f0a9fce58bb2c90758ea9d74a3");
            } else if (!TextUtils.isEmpty(this.i.n())) {
                a(this.mView, com.sankuai.shangou.stone.util.d.a(this.i.n(), this.mContext.getResources().getColor(R.color.wm_st_shopcart_bar_background)));
                int color = this.mContext.getResources().getColor(R.color.wm_st_shopcart_txt_with_bg_color);
                this.a.setTextColor(color);
                this.m.setTextColor(color);
                this.o.setTextColor(color);
                this.p.setTextColor(color);
                this.r.setTextColor(color);
                if (q()) {
                    this.c.setTextColor(this.mContext.getResources().getColorStateList(R.color.wm_drug_shopcart_rest_txt_btn_submit_promotion_green));
                } else {
                    this.c.setTextColor(this.mContext.getResources().getColorStateList(R.color.wm_drug_shopcart_rest_txt_btn_submit_promotion));
                }
            } else {
                a(this.mView, this.mContext.getResources().getColor(R.color.wm_st_shopcart_bar_background));
                int color2 = this.mContext.getResources().getColor(R.color.wm_sg_color_999999);
                this.a.setTextColor(color2);
                this.m.setTextColor(color2);
                this.p.setTextColor(color2);
                this.o.setTextColor(color2);
                this.r.setTextColor(color2);
                if (q()) {
                    this.c.setTextColor(this.mContext.getResources().getColorStateList(R.color.wm_drug_shopcart_txt_btn_solid_green));
                } else {
                    this.c.setTextColor(this.mContext.getResources().getColorStateList(R.color.wm_st_shopcart_txt_btn_solid));
                }
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ff6562d68d2b2eaccb0bd0654032be69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ff6562d68d2b2eaccb0bd0654032be69");
            } else {
                this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.k.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr6 = {view};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "06ffa16a530f87467a33cab27bc79248", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "06ffa16a530f87467a33cab27bc79248");
                        } else if (k.this.g != null) {
                            k.this.g.k();
                        }
                    }
                });
                this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.k.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr6 = {view};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d0709ade42190121f591b89711e14a88", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d0709ade42190121f591b89711e14a88");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(k.this.j.d, "b_ac7Bs").a("poi_id", k.this.i.d()).a(KernelConfig.KEY_CONTAINER_TYPE, String.valueOf(k.this.i.v())).a("status", Integer.valueOf(k.this.d)).a("button_code", 1).a("stid", com.sankuai.waimai.drug.util.c.a(k.this.i)).a();
                        k.g(k.this);
                    }
                });
            }
            com.sankuai.shangou.stone.util.log.a.a("time", "init data end " + System.currentTimeMillis(), new Object[0]);
        }
        show();
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66a79dd9509bd1a9c297b9b892523c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66a79dd9509bd1a9c297b9b892523c3");
            return;
        }
        k();
        c();
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a84b40c2a200a3f16586f3d2575c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a84b40c2a200a3f16586f3d2575c31");
        } else if (this.i == null) {
        } else {
            m();
            n();
            l();
        }
    }

    private void l() {
        ShopCartPrice shopCartPrice;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1f5fa1b4627c87755e7b8bca87db44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1f5fa1b4627c87755e7b8bca87db44");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = this.f.k(this.i.d());
        if (k == null || (shopCartPrice = k.g) == null) {
            return;
        }
        if (!this.i.b()) {
            String m = this.i.m();
            if (!TextUtils.isEmpty(m)) {
                m = " | " + this.i.m();
            }
            u.a(this.p);
            u.a(this.o);
            u.a(this.p, m);
            u.a(this.o, shopCartPrice.mOriginShippingFeeTxt);
        } else {
            u.c(this.p);
            this.m.setMaxLines(1);
            u.d(findView(R.id.ll_shipping_fee), 0, com.sankuai.shangou.stone.util.h.a(getContext(), -2.0f), 0, 0);
            if (com.sankuai.waimai.drug.util.b.a(shopCartPrice.mShippingFeeTxt)) {
                u.a(this.o);
                this.o.setMaxLines(1);
                u.d(this.o, com.sankuai.shangou.stone.util.h.a(getContext(), 2.0f), 0, 0, 0);
                this.m.setTextSize(2, 9.0f);
                this.o.setTextSize(2, 9.0f);
                u.a(this.o, shopCartPrice.mOriginShippingFeeTxt);
            } else {
                u.c(this.o);
            }
        }
        u.a(this.m, shopCartPrice.mShippingFeeTxt);
    }

    private void m() {
        int f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c70a794322e8a158634516b29af455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c70a794322e8a158634516b29af455");
        } else if (this.i.z()) {
            this.s.setVisibility(8);
            this.q.setVisibility(8);
        } else if (this.f.i(this.i.d())) {
            this.s.setVisibility(8);
            this.q.setVisibility(0);
            double a = a(this.i);
            double m = this.f.m(this.i.d());
            if (this.i.b()) {
                com.sankuai.waimai.drug.util.b.a(this.n, this.a, String.valueOf(a), !com.sankuai.shangou.stone.util.i.a(Double.valueOf(m), Double.valueOf(a)));
            }
            SpannableString spannableString = new SpannableString(this.mContext.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(a)));
            if (this.i.b()) {
                f = com.sankuai.waimai.drug.util.b.a(String.valueOf(a), !com.sankuai.shangou.stone.util.i.a(Double.valueOf(m), Double.valueOf(a)));
            } else {
                f = f();
            }
            spannableString.setSpan(new AbsoluteSizeSpan(f, true), 0, 1, 33);
            this.n.setText(spannableString);
            if (!com.sankuai.shangou.stone.util.i.a(Double.valueOf(m), Double.valueOf(a))) {
                this.a.setText(this.mContext.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(m)));
            } else {
                this.a.setText("");
            }
        } else {
            this.s.setVisibility(0);
            String k = this.i.k();
            if (!TextUtils.isEmpty(this.i.m())) {
                if (!TextUtils.isEmpty(k)) {
                    k = k + " | ";
                }
                k = k + this.i.m();
                this.r.setTextSize(2, d());
            } else {
                this.r.setTextSize(2, e());
            }
            this.r.setText(k);
            this.q.setVisibility(8);
        }
    }

    private void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc667773b5ce71321d324f4ba6c79e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc667773b5ce71321d324f4ba6c79e1");
        } else if (view == null) {
        } else {
            Drawable background = view.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(i);
            }
        }
    }

    private double a(@Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "898afcb8c83327edac6bbc68774fcac4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "898afcb8c83327edac6bbc68774fcac4")).doubleValue();
        }
        if (aVar == null) {
            return 0.0d;
        }
        return this.f.o(this.i.d());
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb1b5ab336352a9c2cb01032464004d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb1b5ab336352a9c2cb01032464004d");
        } else if (!this.i.A()) {
            this.c.setEnabled(false);
            this.c.setText(R.string.wm_st_dealInfo_submit_rest);
        } else {
            double n = this.f.n(this.i.d());
            double s = this.i.s();
            this.c.setTextSize(2, h());
            this.c.setMaxLines(i());
            if (com.sankuai.shangou.stone.util.i.a(Double.valueOf(n)) > 0.0d && com.sankuai.shangou.stone.util.i.e(Double.valueOf(n), Double.valueOf(s))) {
                o();
            } else if (com.sankuai.shangou.stone.util.i.a(Double.valueOf(n)) == 0.0d) {
                a(this.mContext.getString(R.string.wm_st_dealInfo_min_fee_to_send, com.sankuai.shangou.stone.util.i.a(s)));
            } else if (com.sankuai.shangou.stone.util.i.c(Double.valueOf(n), Double.valueOf(s))) {
                a(this.mContext.getString(R.string.wm_st_dealInfo_submit_shortMoney, com.sankuai.shangou.stone.util.i.a(s - n)));
            }
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e340ad02ca4a5d59efd649d7def689b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e340ad02ca4a5d59efd649d7def689b1");
            return;
        }
        this.c.setEnabled(false);
        this.c.setText(str);
        this.c.setBackgroundColor(this.mContext.getResources().getColor(R.color.wm_st_common_transparent));
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c30db45da0ff459fcf1fbd4adfb5ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c30db45da0ff459fcf1fbd4adfb5ca6");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = this.f.k(this.i.d());
        if (k.t != null && k.t.isOverweight()) {
            c(k.t.getOverweightText());
            this.d = 2;
        } else if (b(k.u)) {
            this.d = 3;
            a(k.u);
        } else {
            this.d = 1;
            this.c.setEnabled(true);
            this.c.setText(p());
            if (q()) {
                this.c.setBackground(new e.a().a(0.0f, com.sankuai.shangou.stone.util.h.a(getContext(), 25.0f), com.sankuai.shangou.stone.util.h.a(getContext(), 25.0f), 0.0f).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_6CD12E), ContextCompat.getColor(getContext(), R.color.wm_sg_color_39AA23)}).a());
            } else {
                this.c.setBackground(this.mContext.getResources().getDrawable(R.drawable.wm_drug_shopcart_submit_btn_bg));
            }
            this.c.setTextSize(2, g());
            a(1);
        }
    }

    private String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728e08c4fdd0f5c72f10d591ee0aa427", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728e08c4fdd0f5c72f10d591ee0aa427");
        }
        return com.sankuai.waimai.store.config.j.h().a(SCConfigPath.SHOP_CART_DRUG_SUBMIT_TEXT, getContext().getString(R.string.wm_st_dealInfo_submit_2));
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee5f76c0fa160e75cead0c29625417be", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee5f76c0fa160e75cead0c29625417be");
        }
        return !TextUtils.isEmpty(str) ? str : com.sankuai.waimai.store.config.j.h().a(SCConfigPath.SHOP_CART_COUPON_PURCHASE_DRUG_TEXT, getContext().getString(R.string.wm_st_dealInfo_coupon_info_title));
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a20c7997f3bde8c1cb37210df963d81e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a20c7997f3bde8c1cb37210df963d81e");
        } else if (this.w.contains(Integer.valueOf(i))) {
        } else {
            this.w.add(Integer.valueOf(i));
            if (this.i == null || this.i.I()) {
                return;
            }
            com.sankuai.waimai.store.manager.judas.b.b(this.j.d, "b_k8jja0es").a("poi_id", this.i.d()).a(KernelConfig.KEY_CONTAINER_TYPE, String.valueOf(this.i.v())).a("status", Integer.valueOf(i)).a("button_code", 1).a("stid", com.sankuai.waimai.drug.util.c.a(this.i)).a();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962b0f9501e497479ca016d16fa245a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962b0f9501e497479ca016d16fa245a5");
        } else {
            aVar.e = this.c;
        }
    }

    private void a(CartCouponInfo cartCouponInfo) {
        String format;
        Object[] objArr = {cartCouponInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e7df0dd7679063e3852e7645fa6a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e7df0dd7679063e3852e7645fa6a0a");
            return;
        }
        if (TextUtils.isEmpty(cartCouponInfo.totalPriceAfterRecommendCoupon)) {
            format = b(cartCouponInfo.recommendCouponTitle);
        } else {
            format = String.format(this.mContext.getString(R.string.wm_drug_dealInfo_coupon_info_new), b(cartCouponInfo.recommendCouponTitle), cartCouponInfo.totalPriceAfterRecommendCoupon);
        }
        a(format, true);
        a(3);
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46f774fd244c98d1cce78f8baa468e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46f774fd244c98d1cce78f8baa468e4");
            return;
        }
        a(this.mContext.getString(R.string.wm_st_dealInfo_overweight, str), false);
        a(2);
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c677f662aea157cbaad752348ebcd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c677f662aea157cbaad752348ebcd9");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c.setMaxLines(2);
            if (z) {
                this.c.setEnabled(true);
                if (q()) {
                    this.c.setBackground(new e.a().a(0.0f, com.sankuai.shangou.stone.util.h.a(getContext(), 25.0f), com.sankuai.shangou.stone.util.h.a(getContext(), 25.0f), 0.0f).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_6CD12E), ContextCompat.getColor(getContext(), R.color.wm_sg_color_39AA23)}).a());
                } else {
                    this.c.setBackground(this.mContext.getDrawable(R.drawable.wm_drug_shopcart_submit_btn_bg));
                }
            } else {
                this.c.setEnabled(false);
                this.c.setBackground(this.mContext.getDrawable(R.drawable.wm_drug_shopcart_overweight_bg));
            }
            int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_13);
            int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_9);
            SpannableString spannableString = new SpannableString(str);
            int min = Math.min(str.length(), 4);
            spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), 0, min, 18);
            spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize2), min, str.length(), 33);
            this.c.setText(spannableString);
        }
    }

    private boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e70ca9a207a3173e0d36d2632d74dc81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e70ca9a207a3173e0d36d2632d74dc81")).booleanValue() : (this.i != null && this.i.y()) || !(this.l == null || this.l.poiInformation == null || this.l.poiInformation.mBuzType != 143);
    }
}
