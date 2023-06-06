package com.sankuai.waimai.drug.b2c;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartCouponInfo;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.waimai.store.shopping.cart.ui.c {
    public static ChangeQuickRedirect a;
    protected TextView b;
    private com.sankuai.waimai.store.shopping.cart.pre.b c;

    public static /* synthetic */ void h(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "1acf6b6a509b1fb0354760e980c04215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "1acf6b6a509b1fb0354760e980c04215");
            return;
        }
        if (gVar.c == null) {
            gVar.c = com.sankuai.waimai.store.shopping.cart.pre.d.a((Activity) gVar.mContext, gVar.i, gVar.j);
        }
        gVar.c.a(new com.sankuai.waimai.store.shopping.cart.pre.c() { // from class: com.sankuai.waimai.drug.b2c.g.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.shopping.cart.pre.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfe9eef6f87c09caf967a70b56798284", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfe9eef6f87c09caf967a70b56798284");
                } else {
                    g.i(g.this);
                }
            }
        });
    }

    public static /* synthetic */ void i(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "9d9de041f63afd16bee1a53443958e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "9d9de041f63afd16bee1a53443958e06");
        } else if (com.sankuai.waimai.store.manager.order.b.a((Activity) gVar.mContext, gVar.i.g(), gVar.i.h(), a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER)) {
            gVar.b.setEnabled(false);
            gVar.b();
        }
    }

    public g(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(activity, aVar, null);
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08376ee404946fdbbc4e5f2fc83b708", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08376ee404946fdbbc4e5f2fc83b708");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f17688937e524ada68ee9614d0007063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f17688937e524ada68ee9614d0007063");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) this.mView.findViewById(R.id.b2c_poi_dealInfo_submit_txt);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.b2c.g.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b379996d8540223ac3819c8210977e4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b379996d8540223ac3819c8210977e4");
                } else if (g.this.i == null) {
                } else {
                    com.sankuai.waimai.store.manager.judas.b.a(g.this.j.d, com.sankuai.waimai.store.manager.judas.b.a((Object) g.this.mContext), "b_waimai_y9f2cgm4_mc").a("poi_id", g.this.i.d()).a("stid", g.this.g.n()).a("spu_id", Long.valueOf(g.this.j.c == 0 ? -999L : g.this.j.c)).a();
                    g.h(g.this);
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b82aeb51fe631b15431bedcb8eb16db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b82aeb51fe631b15431bedcb8eb16db");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d9b5717ff88f0b75657b4542f4ed6358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d9b5717ff88f0b75657b4542f4ed6358");
        } else {
            this.b.setBackground(com.sankuai.waimai.store.util.e.a().a(new int[]{-16842910}, new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_BCBCBD)).a(h.a(this.mContext, 20.0f)).a()).a(new e.a().a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFE14D), ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFC34D)}).a(h.a(this.mContext, 20.0f)).a()).b);
            this.b.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFFFFF), ContextCompat.getColor(getContext(), R.color.wm_sg_color_333333)}));
        }
        c();
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d791ffc46387be173f4828deb58f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d791ffc46387be173f4828deb58f7e");
        } else {
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a308710eafdafa6ed0cf2c5c744603f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a308710eafdafa6ed0cf2c5c744603f7");
        } else if (this.i == null) {
        } else {
            if (!this.i.A()) {
                this.b.setEnabled(false);
                this.b.setText(R.string.wm_st_dealInfo_submit_rest);
                return;
            }
            double n = this.f.n(this.i.d());
            double s = this.i.s();
            if (i.a(Double.valueOf(n)) > 0.0d && i.e(Double.valueOf(n), Double.valueOf(s))) {
                d();
            } else if (i.a(Double.valueOf(n)) == 0.0d) {
                a(this.mContext.getString(R.string.wm_st_dealInfo_min_fee_to_send, i.a(s)));
            } else if (i.c(Double.valueOf(n), Double.valueOf(s))) {
                a(this.mContext.getString(R.string.wm_st_dealInfo_submit_shortMoney, i.a(s - n)));
            }
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd6a4fd9de355f23cd5a8cce8ab39f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd6a4fd9de355f23cd5a8cce8ab39f8");
            return;
        }
        this.b.setEnabled(false);
        this.b.setText(str);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40090873b4da42896b336de32f4bc68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40090873b4da42896b336de32f4bc68c");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = this.f.k(this.i.d());
        if (k.t != null && k.t.isOverweight()) {
            String string = this.mContext.getString(R.string.wm_st_dealInfo_overweight_b2c);
            a(this.mContext.getString(R.string.wm_st_dealInfo_submit_txt, string, k.t.getOverweightText()), string, false);
        } else if (a(k.u)) {
            String a2 = a(k.u, true);
            a(!TextUtils.isEmpty(k.u.totalPriceAfterRecommendCoupon) ? String.format(this.mContext.getString(R.string.wm_st_dealInfo_submit_txt), a2, k.u.totalPriceAfterRecommendCoupon) : a2, a2, true);
        } else {
            this.b.setEnabled(true);
            this.b.setText(a(null, false));
        }
    }

    private String a(CartCouponInfo cartCouponInfo, boolean z) {
        String c;
        Object[] objArr = {cartCouponInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb093f6b00ee069163af00a569ee07c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb093f6b00ee069163af00a569ee07c");
        }
        String str = "";
        if (this.i != null) {
            com.sankuai.waimai.store.shopping.cart.cache.a aVar = this.f.k(this.i.d()).e;
            if (z && cartCouponInfo != null) {
                c = cartCouponInfo.recommendCouponTitle;
            } else {
                c = aVar.c("pre_order_title_default");
            }
            str = c;
        }
        if (t.a(str)) {
            if (z) {
                return getContext().getString(R.string.wm_st_dealInfo_coupon_info_title);
            }
            return getContext().getString(R.string.wm_st_dealInfo_submit_2);
        }
        return str;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e72afdd6e3eef7255561b4c8cba16ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e72afdd6e3eef7255561b4c8cba16ed");
        } else {
            j();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca48c51ba753c1dcd36f3e1cd3d42415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca48c51ba753c1dcd36f3e1cd3d42415");
        } else {
            aVar.e = this.b;
        }
    }

    private void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4bf6e4e80d80f73117f89158a9d535e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4bf6e4e80d80f73117f89158a9d535e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.setMaxLines(2);
            if (z) {
                this.b.setEnabled(true);
            } else {
                this.b.setEnabled(false);
            }
            int length = t.a(str2) ? 0 : str2.length();
            int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_14);
            Context context = getContext();
            int i = R.color.wm_sg_color_FFFFFF;
            int color = ContextCompat.getColor(context, z ? R.color.wm_sg_color_333333 : R.color.wm_sg_color_FFFFFF);
            int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_12);
            Context context2 = getContext();
            if (z) {
                i = R.color.wm_sg_color_858687;
            }
            int color2 = ContextCompat.getColor(context2, i);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), 0, length, 18);
            spannableString.setSpan(new ForegroundColorSpan(color), 0, length, 18);
            spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize2), length, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(color2), length, str.length(), 33);
            this.b.setText(spannableString);
        }
    }

    private boolean a(CartCouponInfo cartCouponInfo) {
        Object[] objArr = {cartCouponInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ace1656a0a0c7a97599031363eb94dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ace1656a0a0c7a97599031363eb94dd")).booleanValue() : (cartCouponInfo == null || t.a(cartCouponInfo.recommendCouponTitle)) ? false : true;
    }
}
