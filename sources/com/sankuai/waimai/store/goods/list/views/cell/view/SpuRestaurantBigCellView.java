package com.sankuai.waimai.store.goods.list.views.cell.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.cell.core.a;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
import com.sankuai.waimai.store.expose.v2.entity.b;
import com.sankuai.waimai.store.platform.domain.core.goods.AtmosphereMapFrame;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.k;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SpuRestaurantBigCellView extends SpuBaseCellView implements a {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private View d;
    private b e;
    private RelativeLayout f;
    private RelativeLayout g;

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public int getLayoutId() {
        return R.layout.wm_st_view_spu_big_cell;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final boolean r() {
        return false;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView, com.sankuai.waimai.store.cell.core.a
    public void setGoodDetailResponse(GoodDetailResponse goodDetailResponse) {
    }

    public SpuRestaurantBigCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2557c5309831d381828b30b0e5a0da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2557c5309831d381828b30b0e5a0da");
        }
    }

    public SpuRestaurantBigCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e5972f9a548e8ddae13aa2843ef2834", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e5972f9a548e8ddae13aa2843ef2834");
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView, com.sankuai.waimai.store.cell.core.a
    public final void a(@NonNull GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d815ea08be5079d59204707ec8830693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d815ea08be5079d59204707ec8830693");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b a2 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b.a();
        a2.b = 0;
        a2.d = d.FONT_STYLE_36;
        setHandPriceConfig(a2);
        super.a(goodsSpu, i);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void x() {
        View handPriceLabelView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b37e80d006522dea5a17368b512dfb20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b37e80d006522dea5a17368b512dfb20");
            return;
        }
        super.x();
        if (this.A == null || (handPriceLabelView = this.A.getHandPriceLabelView()) == null) {
            return;
        }
        this.e = new b("b_waimai_med_daoshoujia_mv", handPriceLabelView);
        b bVar = this.e;
        bVar.e = this.ae.id + "feedb_waimai_med_daoshoujia_mv";
        this.e.b(new HashMap());
        this.e.e = String.valueOf(this.ae.id);
        if (getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) getContext(), this.e);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745f451b077f68f039201096e065ea5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745f451b077f68f039201096e065ea5d");
            return;
        }
        if (this.E == null || this.af.t()) {
            u.a(this.C, this.B);
            if (this.O != null && this.C != null && (this.O.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.O.getLayoutParams();
                layoutParams.addRule(3, this.C.getId());
                this.O.setLayoutParams(layoutParams);
            }
            u.c(this.E);
        } else {
            u.c(this.C, this.B);
            u.a(this.E);
            if (this.O != null && this.E != null && (this.O.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.O.getLayoutParams();
                layoutParams2.addRule(3, this.E.getId());
                this.O.setLayoutParams(layoutParams2);
            }
        }
        super.a();
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fabc72d2ee6a29b26a59caadaa05d76e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fabc72d2ee6a29b26a59caadaa05d76e");
            return;
        }
        super.c();
        this.b = (TextView) this.n.findViewById(R.id.month_sales);
        this.c = (TextView) this.n.findViewById(R.id.txt_stickyfood_price_unit);
        this.d = this.n.findViewById(R.id.promotion_layout);
        this.f = (RelativeLayout) this.n.findViewById(R.id.ll_stickysold_count_unit_price_original_price_fix);
        this.g = (RelativeLayout) this.n.findViewById(R.id.rl_add_food_container);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cbcbff39050f5fee0f196464ad030da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cbcbff39050f5fee0f196464ad030da");
            return;
        }
        super.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2d0bd11fec842af9ee95ea155fa0479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2d0bd11fec842af9ee95ea155fa0479");
        } else if (p.a(this.ae) || TextUtils.isEmpty(this.ae.getMonthSaledContent())) {
            u.b(this.b);
        } else {
            u.a(this.b);
            if (!p.a(this.b)) {
                this.b.setText(this.ae.getMonthSaledContent());
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5208aeb947185a045871a6c7106b4e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5208aeb947185a045871a6c7106b4e3");
        } else if (!p.a(this.ae)) {
            if (this.af.t()) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bcdec7d20cea6aaa9992804cf1806a5f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bcdec7d20cea6aaa9992804cf1806a5f");
                } else {
                    if (this.E != null) {
                        this.E.setUnitVisibility(8);
                    }
                    if (!p.a(this.c)) {
                        if (!z()) {
                            if (this.ae.hasManySpec()) {
                                if (h()) {
                                    u.a(this.c);
                                    this.c.setText(R.string.wm_sc_common_multi_goods_price_format);
                                    this.c.setTextColor(com.sankuai.waimai.store.util.b.b(this.c.getContext(), R.color.wm_sg_color_BCBCBD));
                                } else if (TextUtils.isEmpty(this.ae.getUnit())) {
                                    u.c(this.c);
                                } else {
                                    u.a(this.c);
                                    this.c.setText(this.c.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                                    this.c.setTextColor(com.sankuai.waimai.store.util.b.b(this.c.getContext(), R.color.wm_sg_color_999999));
                                }
                            } else if (!TextUtils.isEmpty(this.ae.getUnit())) {
                                u.a(this.c);
                                this.c.setText(this.c.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                                this.c.setTextColor(com.sankuai.waimai.store.util.b.b(this.c.getContext(), R.color.wm_sg_color_999999));
                            }
                        }
                        u.c(this.c);
                    }
                }
            } else {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "58480655e8342e6b89b90b2cb6661b94", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "58480655e8342e6b89b90b2cb6661b94");
                } else {
                    u.c(this.c);
                    if (!p.a(this.E)) {
                        if (this.ae.hasManySpec()) {
                            if (h()) {
                                this.E.setUnitVisibility(0);
                                this.E.setUnit(this.E.getContext().getString(R.string.wm_sc_common_multi_goods_price_format));
                            } else if (!TextUtils.isEmpty(this.ae.getUnit())) {
                                this.E.setUnitVisibility(0);
                                this.E.setUnit(this.c.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                            } else {
                                this.E.setUnitVisibility(8);
                            }
                        } else if (!TextUtils.isEmpty(this.ae.getUnit())) {
                            this.E.setUnitVisibility(0);
                            this.E.setUnit(this.c.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                        } else {
                            this.E.setUnitVisibility(8);
                        }
                    }
                }
            }
        }
        f();
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "41e73977eecfdfe0dc545e975f60259b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "41e73977eecfdfe0dc545e975f60259b");
            return;
        }
        int i = q() ? 23 : 0;
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = h.a(getContext(), i);
        }
        this.d.setLayoutParams(layoutParams);
    }

    private boolean h() {
        GoodsSku goodsSku;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2472e0f59588179a3112d429b49758b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2472e0f59588179a3112d429b49758b3")).booleanValue();
        }
        if (this.ae == null || com.sankuai.shangou.stone.util.a.a((List) this.ae.getSkus()) <= 1 || (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.getSkus(), 0)) == null) {
            return false;
        }
        if (goodsSku.price == goodsSku.originPrice) {
            return true;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) this.ae.getSkus());
        for (int i = 0; i < a2; i++) {
            GoodsSku goodsSku2 = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.getSkus(), i);
            if (goodsSku2 != null && (goodsSku2.price != goodsSku.price || goodsSku2.originPrice != goodsSku.originPrice)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final Drawable a(@NonNull AtmosphereMapFrame.Frame frame) {
        Object[] objArr = {frame};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f1b4c733bf7798485d965fd73bc091", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f1b4c733bf7798485d965fd73bc091");
        }
        com.sankuai.waimai.store.widgets.drawable.b bVar = new com.sankuai.waimai.store.widgets.drawable.b();
        bVar.c = com.sankuai.shangou.stone.util.d.a(frame.startColor, getResources().getColor(R.color.wm_st_common_transparent));
        bVar.d = com.sankuai.shangou.stone.util.d.a(frame.endColor, getResources().getColor(R.color.wm_st_common_transparent));
        bVar.e = h.a(getContext(), 12.0f);
        bVar.b = h.a(getContext(), 2.0f);
        bVar.f = h.a(getContext(), 20.0f);
        return bVar;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d46027bceb898375acd7dfa65bdcef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d46027bceb898375acd7dfa65bdcef");
        } else if (this.af == null || this.ae == null || this.af.t()) {
        } else {
            if (this.f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                marginLayoutParams.topMargin = h.a(getContext().getApplicationContext(), 64.0f);
                this.f.setLayoutParams(marginLayoutParams);
            }
            if (this.g != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
                marginLayoutParams2.topMargin = h.a(getContext().getApplicationContext(), 50.0f);
                this.g.setLayoutParams(marginLayoutParams2);
            }
            u.c(this.P, this.R);
            HandPriceInfo b = k.b(this.af.b, this.ae);
            if (b == null || t.a(b.getHandActivityPriceText())) {
                u.b(this.Q);
            } else if (this.Q != null) {
                u.a(this.Q);
                this.Q.a(b, 0);
                u.c(this.O);
            }
        }
    }
}
