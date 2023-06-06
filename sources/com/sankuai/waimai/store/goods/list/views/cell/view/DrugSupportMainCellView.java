package com.sankuai.waimai.store.goods.list.views.cell.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
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
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.shangou.stone.whiteboard.e;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
import com.sankuai.waimai.store.expose.v2.entity.b;
import com.sankuai.waimai.store.goods.list.delegate.impl.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d;
import com.sankuai.waimai.store.platform.domain.manager.poi.a;
import com.sankuai.waimai.store.util.s;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class DrugSupportMainCellView extends SpuBaseCellView {
    public static ChangeQuickRedirect c;
    private boolean a;
    private b ar;
    private SCBaseActivity b;
    public a d;
    protected RelativeLayout e;
    protected ViewGroup.LayoutParams f;
    protected RelativeLayout g;
    protected ViewGroup.LayoutParams h;
    public int i;
    private TextView j;
    private TextView k;
    private View l;

    public DrugSupportMainCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dec39f2d89025e249a45f3a6fe076c22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dec39f2d89025e249a45f3a6fe076c22");
        }
    }

    public DrugSupportMainCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab11737aecc216bc1db4952178a83bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab11737aecc216bc1db4952178a83bd");
        }
    }

    public DrugSupportMainCellView(@NonNull c cVar) {
        super(cVar.d());
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5df208af30401bbc6b17be1719e551", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5df208af30401bbc6b17be1719e551");
            return;
        }
        e e = cVar.e();
        Object[] objArr2 = {e};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fbd9f535ed634c2e4569a6a139b692d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fbd9f535ed634c2e4569a6a139b692d");
        } else if (e != null) {
            e.b("updateOrderGood", Boolean.class).c(new rx.functions.b<Boolean>() { // from class: com.sankuai.waimai.store.goods.list.views.cell.view.DrugSupportMainCellView.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Boolean bool) {
                    Object[] objArr3 = {bool};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a0b6b84549bedf9dcb95caafffb2b4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a0b6b84549bedf9dcb95caafffb2b4a");
                    } else {
                        DrugSupportMainCellView.this.ba_();
                    }
                }
            });
        }
        this.b = cVar.d();
        this.d = cVar.c();
    }

    public void setHasLabelOrHandPrice(boolean z) {
        this.a = z;
    }

    public void setTotalSize(int i) {
        this.i = i;
    }

    public final void a(@NonNull GoodsSpu goodsSpu, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        Object[] objArr = {goodsSpu, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa147fc8becaf7b6132910587dfde17e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa147fc8becaf7b6132910587dfde17e");
            return;
        }
        this.i = i2;
        if (i2 == 1) {
            layoutParams = new ViewGroup.LayoutParams(h.a(getContext()) - h.a(getContext(), 32.0f), -2);
        } else if (i2 == 2) {
            layoutParams = new ViewGroup.LayoutParams(h.a(getContext()) - h.a(getContext(), 98.0f), -2);
        } else if (i2 == 3) {
            a(42, 37);
            layoutParams = new ViewGroup.LayoutParams((h.a(getContext()) - h.a(getContext(), 32.0f)) / 3, -2);
        } else {
            a(42, 37);
            layoutParams = new ViewGroup.LayoutParams(h.a(getContext(), 105.0f), -2);
        }
        setLayoutParams(layoutParams);
        super.a(goodsSpu, i);
    }

    private void a(int i, int i2) {
        Object[] objArr = {42, 37};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f49830926cb64cb8c8f7844350d1cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f49830926cb64cb8c8f7844350d1cdd");
        } else if (!this.a) {
            if (this.h instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((RelativeLayout.LayoutParams) this.h);
                layoutParams.topMargin = h.a(this.b, 37.0f);
                this.g.setLayoutParams(layoutParams);
            }
            if (this.f instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((RelativeLayout.LayoutParams) this.f);
                layoutParams2.topMargin = h.a(this.b, 42.0f);
                this.e.setLayoutParams(layoutParams2);
            }
        } else {
            this.g.setLayoutParams(this.h);
            this.e.setLayoutParams(this.f);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5413f012c1f02e1119cc95da01f4d701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5413f012c1f02e1119cc95da01f4d701");
            return;
        }
        super.c();
        com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b a = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b.a();
        a.b = 1;
        a.d = d.FONT_STYLE_28;
        setHandPriceConfig(a);
        this.j = (TextView) findViewById(R.id.txt_promotion_month_sale);
        this.k = (TextView) this.n.findViewById(R.id.txt_stickyfood_price_unit);
        this.e = (RelativeLayout) findViewById(R.id.ll_stickysold_count_unit_price_original_price_fix);
        this.l = findViewById(R.id.promotion_layout);
        if (this.e != null) {
            this.f = this.e.getLayoutParams();
        }
        this.g = (RelativeLayout) findViewById(R.id.add_good_root_layout);
        if (this.g != null) {
            this.h = this.g.getLayoutParams();
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public float getAtmosphereBackgroundMapRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985b245477be87d4089deccbb42d2d31", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985b245477be87d4089deccbb42d2d31")).floatValue() : super.getAtmosphereBackgroundMapRadius();
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void x() {
        View handPriceLabelView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15385c88904263a0ff97366763226e23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15385c88904263a0ff97366763226e23");
            return;
        }
        super.x();
        if (this.A == null || (handPriceLabelView = this.A.getHandPriceLabelView()) == null) {
            return;
        }
        this.ar = new b("b_waimai_med_daoshoujia_mv", handPriceLabelView);
        b bVar = this.ar;
        bVar.e = this.ae.id + "floorb_waimai_med_daoshoujia_mv";
        this.ar.b(new HashMap());
        if (getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) getContext(), this.ar);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030b55c62bae1f83a63cf927d379ed54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030b55c62bae1f83a63cf927d379ed54");
            return;
        }
        super.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e871a6d6845e62d2f83f62cc8760f8d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e871a6d6845e62d2f83f62cc8760f8d4");
        } else if (p.a(this.k)) {
            u.c(this.k);
        } else if (z()) {
            u.c(this.k);
        } else if (TextUtils.isEmpty(this.ae.getGoodsUnit())) {
            u.c(this.k);
        } else {
            u.a(this.k);
            this.k.setText(this.ae.getGoodsUnit());
            if (this.ae.hasManySpec()) {
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.k.getContext(), R.color.wm_sg_color_BCBCBD));
            } else {
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.k.getContext(), R.color.wm_sg_color_999999));
            }
        }
        f();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20e39794324dab9ae6bc497ad684d8c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20e39794324dab9ae6bc497ad684d8c2");
            return;
        }
        int i = q() ? 18 : 2;
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = h.a(getContext(), i);
        }
        this.l.setLayoutParams(layoutParams);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6d70aee11136788f5e06ef6345447d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6d70aee11136788f5e06ef6345447d");
        } else if (p.a(this.ae)) {
        } else {
            s.a(this.ae, new s.a<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.list.views.cell.view.DrugSupportMainCellView.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                    Object[] objArr2 = {goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79b6b9cf28adfde7d4ff8d98a03ac48e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79b6b9cf28adfde7d4ff8d98a03ac48e");
                        return;
                    }
                    u.c(DrugSupportMainCellView.this.O);
                    u.a(DrugSupportMainCellView.this.D);
                    if (p.a(DrugSupportMainCellView.this.D)) {
                        return;
                    }
                    if (i.e(Double.valueOf(DrugSupportMainCellView.this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
                        DrugSupportMainCellView.this.D.setText(DrugSupportMainCellView.this.getContext().getString(R.string.wm_sc_common_price, i.a(DrugSupportMainCellView.this.ae.getOriginPrice())));
                    } else {
                        u.c(DrugSupportMainCellView.this.D);
                    }
                }

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void b(GoodsSpu goodsSpu) {
                    Object[] objArr2 = {goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af5c85d4ee330cbb560bb663e1749315", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af5c85d4ee330cbb560bb663e1749315");
                    } else if (DrugSupportMainCellView.this.P != null && DrugSupportMainCellView.this.P.getVisibility() == 0) {
                        u.c(DrugSupportMainCellView.this.O);
                    } else if (DrugSupportMainCellView.this.R != null && DrugSupportMainCellView.this.R.getVisibility() == 0) {
                        u.c(DrugSupportMainCellView.this.O);
                    } else {
                        u.a(DrugSupportMainCellView.this.O);
                        u.c(DrugSupportMainCellView.this.D);
                        if (p.a(DrugSupportMainCellView.this.O)) {
                            return;
                        }
                        if (!i.e(Double.valueOf(DrugSupportMainCellView.this.ae.memberPrice), Double.valueOf(0.0d))) {
                            u.c(DrugSupportMainCellView.this.O);
                            return;
                        }
                        DrugSupportMainCellView.this.O.setStrikeThrough(false);
                        DrugSupportMainCellView.this.O.setText(DrugSupportMainCellView.this.getContext().getString(R.string.wm_sc_common_price, i.a(DrugSupportMainCellView.this.ae.memberPrice)));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661d28d323bbc8695ea69bbe1b76e37f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661d28d323bbc8695ea69bbe1b76e37f");
            return;
        }
        super.t();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c546291ee023b32804cf532a7b6bc158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c546291ee023b32804cf532a7b6bc158");
        } else if (p.a(this.ae, this.j)) {
        } else {
            if (TextUtils.isEmpty(this.ae.rankNumPic)) {
                u.c(this.j);
                return;
            }
            this.j.setText(this.ae.getMonthSaledContent());
            u.a(this.j);
            u.c(this.w);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a41e6d7811237d9b961b44427a7aa056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a41e6d7811237d9b961b44427a7aa056");
            return;
        }
        super.u();
        u.c(this.j);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ab6858386d0588e4e191dfb78c649a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ab6858386d0588e4e191dfb78c649a");
            return;
        }
        super.v();
        u.c(this.j);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void setSpuSelectedStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e0f52975ddc78caa281ff2ec71e67e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e0f52975ddc78caa281ff2ec71e67e");
        } else {
            setBackgroundResource(z ? R.drawable.wm_st_spu_base_round_left_select_bg : R.drawable.wm_st_spu_base_round_left_bg);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9699566cef4f0b60d02f97675758f21b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9699566cef4f0b60d02f97675758f21b");
        } else if (p.a(this.ae, this.C)) {
        } else {
            switch (this.ae.getStatus()) {
                case 1:
                case 2:
                    this.C.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_sg_color_999999));
                    if (!p.a(this.B)) {
                        this.B.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_sg_color_999999));
                        break;
                    }
                    break;
                default:
                    this.C.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_text_money));
                    if (!p.a(this.B)) {
                        this.B.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_text_money));
                        break;
                    }
                    break;
            }
            this.C.setText(i.a(this.ae.getMinPrice()));
        }
    }
}
