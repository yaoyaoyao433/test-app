package com.sankuai.waimai.store.shopping.cart.block;

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
/* loaded from: classes5.dex */
public abstract class i extends com.sankuai.waimai.store.shopping.cart.ui.c {
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

    public static /* synthetic */ void g(i iVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "2c9c15f059841b18f0fae885d1f8708e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "2c9c15f059841b18f0fae885d1f8708e");
            return;
        }
        if (iVar.v == null) {
            iVar.v = com.sankuai.waimai.store.shopping.cart.pre.d.a((Activity) iVar.mContext, iVar.i, iVar.j);
        }
        iVar.v.a(new com.sankuai.waimai.store.shopping.cart.pre.c() { // from class: com.sankuai.waimai.store.shopping.cart.block.i.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.shopping.cart.pre.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d36d96d8f25c2be536281db7bde7c76a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d36d96d8f25c2be536281db7bde7c76a");
                } else {
                    i.h(i.this);
                }
            }
        });
    }

    public static /* synthetic */ void h(i iVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "7e636fadfda908afb2cac9692a9e4762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "7e636fadfda908afb2cac9692a9e4762");
        } else if (com.sankuai.waimai.store.manager.order.b.a((Activity) iVar.mContext, iVar.i.f(), iVar.i.h(), a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER)) {
            iVar.c.setEnabled(false);
            iVar.j();
        }
    }

    public i(@NonNull Activity activity, com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodDetailResponse goodDetailResponse) {
        super(activity, aVar, goodDetailResponse);
        Object[] objArr = {activity, aVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b31adc6cebd863e805cebbb78439f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b31adc6cebd863e805cebbb78439f4");
        } else {
            this.w = new HashSet<>();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0a4d69730fe2ab52137e367295d4fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0a4d69730fe2ab52137e367295d4fc");
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
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f74289fb0ff84a10de6e01aae6071fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f74289fb0ff84a10de6e01aae6071fec");
        } else {
            com.sankuai.shangou.stone.util.log.a.a("time", "init data start " + System.currentTimeMillis(), new Object[0]);
            k();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d095283a31dccb1b49fb119b2013801", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d095283a31dccb1b49fb119b2013801");
            } else if (this.i.b.isCityDelivery()) {
                this.u.setVisibility(0);
                this.t.setVisibility(0);
            } else {
                this.u.setVisibility(8);
                this.t.setVisibility(8);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d0e941541d1b0d2a62df8c14bce6609f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d0e941541d1b0d2a62df8c14bce6609f");
            } else if (!TextUtils.isEmpty(this.i.n())) {
                a(this.mView, com.sankuai.shangou.stone.util.d.a(this.i.n(), this.mContext.getResources().getColor(R.color.wm_st_shopcart_bar_background)));
                int color = this.mContext.getResources().getColor(R.color.wm_st_shopcart_txt_with_bg_color);
                this.a.setTextColor(color);
                this.m.setTextColor(color);
                this.o.setTextColor(color);
                this.p.setTextColor(color);
                this.r.setTextColor(color);
                if (q()) {
                    this.c.setTextColor(this.mContext.getResources().getColorStateList(R.color.wm_st_shopcart_rest_txt_btn_submit_promotion_green));
                } else {
                    this.c.setTextColor(this.mContext.getResources().getColorStateList(R.color.wm_st_shopcart_rest_txt_btn_submit_promotion));
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
                    this.c.setTextColor(this.mContext.getResources().getColorStateList(R.color.wm_st_shopcart_txt_btn_solid_green));
                } else {
                    this.c.setTextColor(this.mContext.getResources().getColorStateList(R.color.wm_st_shopcart_txt_btn_solid));
                }
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0a6fcdf041e520f5c9b58c59f901f1de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0a6fcdf041e520f5c9b58c59f901f1de");
            } else {
                this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.i.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr6 = {view};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "368f83b6f8f1292743926a714379ea93", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "368f83b6f8f1292743926a714379ea93");
                        } else if (i.this.g != null) {
                            i.this.g.k();
                        }
                    }
                });
                this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.i.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr6 = {view};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d7a0355383bbbfd87b851a919166aacc", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d7a0355383bbbfd87b851a919166aacc");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(i.this.j.d, "b_ac7Bs").a("poi_id", String.valueOf(i.this.i.d())).a(KernelConfig.KEY_CONTAINER_TYPE, String.valueOf(i.this.i.v())).a("status", Integer.valueOf(i.this.d)).a("button_code", 1).a("stid", com.sankuai.waimai.store.shopping.cart.util.c.a(i.this.i)).a();
                        i.g(i.this);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "275a96e3c0c838395fcd4367ae541fbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "275a96e3c0c838395fcd4367ae541fbb");
            return;
        }
        k();
        c();
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d29f4eda3d6c8cab3bb56f1ab00349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d29f4eda3d6c8cab3bb56f1ab00349");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e18c129976422bf9cbf0c9b2dab933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e18c129976422bf9cbf0c9b2dab933");
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
            if (com.sankuai.waimai.store.shopping.cart.util.b.a(shopCartPrice.mShippingFeeTxt)) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08210e11f1eff828ccd1cc0b95ff741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08210e11f1eff828ccd1cc0b95ff741");
        } else if (this.i.z()) {
            this.s.setVisibility(8);
            this.q.setVisibility(8);
        } else if (this.f.i(this.i.d())) {
            this.s.setVisibility(8);
            this.q.setVisibility(0);
            double a = a(this.i);
            double m = this.f.m(this.i.d());
            if (this.i.b()) {
                com.sankuai.waimai.store.shopping.cart.util.b.a(this.n, this.a, String.valueOf(a), !com.sankuai.shangou.stone.util.i.a(Double.valueOf(m), Double.valueOf(a)));
            }
            SpannableString spannableString = new SpannableString(this.mContext.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(a)));
            if (this.i.b()) {
                f = com.sankuai.waimai.store.shopping.cart.util.b.a(String.valueOf(a), !com.sankuai.shangou.stone.util.i.a(Double.valueOf(m), Double.valueOf(a)));
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ab8798a1012fe1ff98f01e5b14c85b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ab8798a1012fe1ff98f01e5b14c85b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c63d72cbf41383efa00336077471ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c63d72cbf41383efa00336077471ac")).doubleValue();
        }
        if (aVar == null) {
            return 0.0d;
        }
        return this.f.o(this.i.d());
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "321ffd43487df9344de8e4f362a30075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "321ffd43487df9344de8e4f362a30075");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cf6fe8f3d9ea415216c9d225c19c51c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cf6fe8f3d9ea415216c9d225c19c51c");
            return;
        }
        this.c.setEnabled(false);
        this.c.setText(str);
        this.c.setBackgroundColor(this.mContext.getResources().getColor(R.color.wm_st_common_transparent));
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca58366cd9796b60903f5a40a3ef99e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca58366cd9796b60903f5a40a3ef99e");
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
                this.c.setBackground(this.mContext.getResources().getDrawable(R.drawable.wm_st_shopcart_submit_btn_bg));
            }
            this.c.setTextSize(2, g());
            a(1);
        }
    }

    private String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84e99bb5aee81015256c2c4c76bc719", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84e99bb5aee81015256c2c4c76bc719");
        }
        return com.sankuai.waimai.store.config.j.h().a(SCConfigPath.SHOP_CART_SUPERMARKET_SUBMIT_TEXT, getContext().getString(R.string.wm_st_dealInfo_submit_2));
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "790f12262ac8d53e59d2286f23407e51", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "790f12262ac8d53e59d2286f23407e51") : com.sankuai.waimai.store.config.j.h().a(SCConfigPath.SHOP_CART_COUPON_PURCHASE_SUPERMARKET_TEXT, getContext().getString(R.string.wm_st_dealInfo_coupon_info_title));
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd8735a0edb04e1cf3a5bc289accf37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd8735a0edb04e1cf3a5bc289accf37");
        } else if (this.w.contains(Integer.valueOf(i))) {
        } else {
            this.w.add(Integer.valueOf(i));
            if (this.i == null || this.i.I()) {
                return;
            }
            com.sankuai.waimai.store.manager.judas.b.b(this.j.d, "b_k8jja0es").a("poi_id", String.valueOf(this.i.d())).a(KernelConfig.KEY_CONTAINER_TYPE, String.valueOf(this.i.v())).a("status", Integer.valueOf(i)).a("button_code", 1).a("stid", com.sankuai.waimai.store.shopping.cart.util.c.a(this.i)).a();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe260b98aa934b8515589dbd62dc1ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe260b98aa934b8515589dbd62dc1ab");
        } else {
            aVar.e = this.c;
        }
    }

    private void a(CartCouponInfo cartCouponInfo) {
        String format;
        Object[] objArr = {cartCouponInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c71e6ac689201b94429f54a1bbc1aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c71e6ac689201b94429f54a1bbc1aa");
            return;
        }
        if (TextUtils.isEmpty(cartCouponInfo.totalPriceAfterRecommendCoupon)) {
            format = b(cartCouponInfo.recommendCouponTitle);
        } else {
            format = String.format(this.mContext.getString(R.string.wm_st_dealInfo_coupon_info_new), b(cartCouponInfo.recommendCouponTitle), cartCouponInfo.totalPriceAfterRecommendCoupon);
        }
        a(format, true);
        a(3);
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34714fca0276e8683fc9ff8ae388b9cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34714fca0276e8683fc9ff8ae388b9cd");
            return;
        }
        a(this.mContext.getString(R.string.wm_st_dealInfo_overweight, str), false);
        a(2);
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23389559336ee975fe69bc2e77577715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23389559336ee975fe69bc2e77577715");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c.setMaxLines(2);
            if (z) {
                this.c.setEnabled(true);
                if (q()) {
                    this.c.setBackground(new e.a().a(0.0f, com.sankuai.shangou.stone.util.h.a(getContext(), 25.0f), com.sankuai.shangou.stone.util.h.a(getContext(), 25.0f), 0.0f).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_6CD12E), ContextCompat.getColor(getContext(), R.color.wm_sg_color_39AA23)}).a());
                } else {
                    this.c.setBackground(this.mContext.getDrawable(R.drawable.wm_st_shopcart_submit_btn_bg));
                }
            } else {
                this.c.setEnabled(false);
                this.c.setBackground(this.mContext.getDrawable(R.drawable.wm_st_shopcart_overweight_bg));
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c16895a34b8110b8b9231dd9792c4e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c16895a34b8110b8b9231dd9792c4e")).booleanValue() : (this.i != null && this.i.y()) || !(this.l == null || this.l.poiInformation == null || this.l.poiInformation.mBuzType != 143);
    }
}
