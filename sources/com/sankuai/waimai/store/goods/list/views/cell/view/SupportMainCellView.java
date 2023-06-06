package com.sankuai.waimai.store.goods.list.views.cell.view;

import android.content.Context;
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
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.shangou.stone.whiteboard.e;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
import com.sankuai.waimai.store.goods.list.delegate.impl.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.manager.poi.a;
import java.util.List;
import rx.functions.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SupportMainCellView extends SpuBaseCellView {
    public static ChangeQuickRedirect c;
    private boolean a;
    private SCBaseActivity b;
    protected a d;
    protected RelativeLayout e;
    protected ViewGroup.LayoutParams f;
    protected RelativeLayout g;
    protected ViewGroup.LayoutParams h;
    private TextView i;
    private TextView j;
    private View k;
    private int l;

    public SupportMainCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8012457e9064f449c674d5bf8524437", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8012457e9064f449c674d5bf8524437");
        }
    }

    public SupportMainCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6d8030e8b1a51dc6b573479730a9cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6d8030e8b1a51dc6b573479730a9cb");
        }
    }

    public SupportMainCellView(@NonNull c cVar) {
        super(cVar.d());
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abcd9a3161154616d5e85f4de139188a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abcd9a3161154616d5e85f4de139188a");
            return;
        }
        e e = cVar.e();
        Object[] objArr2 = {e};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aa93e72012f1067817cac378fe3083d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aa93e72012f1067817cac378fe3083d");
        } else if (e != null) {
            e.b("updateOrderGood", Boolean.class).c(new b<Boolean>() { // from class: com.sankuai.waimai.store.goods.list.views.cell.view.SupportMainCellView.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Boolean bool) {
                    Object[] objArr3 = {bool};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce9cfb5a01016312394204dd55c42769", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce9cfb5a01016312394204dd55c42769");
                    } else {
                        SupportMainCellView.this.ba_();
                    }
                }
            });
        }
        this.b = cVar.d();
        this.d = cVar.c();
        this.a = cVar.b();
    }

    public void setHasLabelOrHandPrice(boolean z) {
        this.a = z;
    }

    public void setTotalSize(int i) {
        this.l = i;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b63596226a0bd134d141d83a7a4d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b63596226a0bd134d141d83a7a4d4c");
        } else if (this.a) {
            if (!p.a(this.g, this.h)) {
                this.g.setLayoutParams(this.h);
            }
            if (p.a(this.e, this.f)) {
                return;
            }
            this.e.setLayoutParams(this.f);
        } else {
            if (this.g != null && (this.h instanceof RelativeLayout.LayoutParams)) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((RelativeLayout.LayoutParams) this.h);
                layoutParams.topMargin = h.a(this.b, i2);
                this.g.setLayoutParams(layoutParams);
            }
            if (this.e == null || !(this.f instanceof RelativeLayout.LayoutParams)) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((RelativeLayout.LayoutParams) this.f);
            layoutParams2.topMargin = h.a(this.b, i);
            this.e.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287eedb8f4f32f86d7c0c6331ddc879b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287eedb8f4f32f86d7c0c6331ddc879b");
            return;
        }
        super.c();
        this.i = (TextView) findViewById(R.id.txt_promotion_month_sale);
        this.j = (TextView) this.n.findViewById(R.id.txt_stickyfood_price_unit);
        this.e = (RelativeLayout) findViewById(R.id.ll_stickysold_count_unit_price_original_price_fix);
        this.k = findViewById(R.id.promotion_layout);
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f46d8eb451b470a6aa6cc237204247b3", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f46d8eb451b470a6aa6cc237204247b3")).floatValue() : super.getAtmosphereBackgroundMapRadius();
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d8403540f6ecb697f14bf972cb5a02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d8403540f6ecb697f14bf972cb5a02");
            return;
        }
        if (this.E == null || this.d.t()) {
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
    public final void d() {
        boolean z;
        GoodsSku goodsSku;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba49739f60c8ff7cb0936f5ff6d63224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba49739f60c8ff7cb0936f5ff6d63224");
            return;
        }
        super.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f5bca8d3238d84dab5d307e827d298a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f5bca8d3238d84dab5d307e827d298a");
        } else if (!p.a(this.ae)) {
            if (this.E == null || this.d.t()) {
                if (this.E != null) {
                    this.E.setUnitVisibility(8);
                }
                if (!p.a(this.j)) {
                    if (this.ae.hasManySpec()) {
                        if (!i.e(Double.valueOf(this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
                            u.a(this.j);
                            this.j.setText(R.string.wm_sc_common_multi_goods_price_format);
                            this.j.setTextColor(com.sankuai.waimai.store.util.b.b(this.j.getContext(), R.color.wm_sg_color_BCBCBD));
                        }
                        u.c(this.j);
                    } else {
                        if (!TextUtils.isEmpty(this.ae.getUnit())) {
                            u.a(this.j);
                            this.j.setText(this.j.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                            this.j.setTextColor(com.sankuai.waimai.store.util.b.b(this.j.getContext(), R.color.wm_sg_color_999999));
                        }
                        u.c(this.j);
                    }
                }
            } else {
                u.c(this.j);
                if (!p.a(this.E)) {
                    if (this.ae.hasManySpec()) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = c;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "518030d053baa66a18a0415d98d6b15c", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "518030d053baa66a18a0415d98d6b15c")).booleanValue();
                        } else {
                            if (this.ae != null && com.sankuai.shangou.stone.util.a.a((List) this.ae.getSkus()) > 1 && (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.getSkus(), 0)) != null) {
                                if (goodsSku.price != goodsSku.originPrice) {
                                    int a = com.sankuai.shangou.stone.util.a.a((List) this.ae.getSkus());
                                    for (int i = 0; i < a; i++) {
                                        GoodsSku goodsSku2 = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.getSkus(), i);
                                        if (goodsSku2 == null || (goodsSku2.price == goodsSku.price && goodsSku2.originPrice == goodsSku.originPrice)) {
                                        }
                                    }
                                }
                                z = true;
                                break;
                            }
                            z = false;
                        }
                        if (z) {
                            this.E.setUnitVisibility(0);
                            this.E.setUnit(this.E.getContext().getString(R.string.wm_sc_common_multi_goods_price_format));
                        } else if (!TextUtils.isEmpty(this.ae.getUnit())) {
                            this.E.setUnitVisibility(0);
                            this.E.setUnit(this.j.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                        } else {
                            this.E.setUnitVisibility(8);
                        }
                    } else if (!TextUtils.isEmpty(this.ae.getUnit())) {
                        this.E.setUnitVisibility(0);
                        this.E.setUnit(this.j.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                    } else {
                        this.E.setUnitVisibility(8);
                    }
                }
            }
        }
        f();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b123f0ce913f5fe3dc10c4fe6df61ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b123f0ce913f5fe3dc10c4fe6df61ec0");
            return;
        }
        int i2 = q() ? 18 : 2;
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = h.a(getContext(), i2);
        }
        this.k.setLayoutParams(layoutParams);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f51a944f53528be7877cee20f45881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f51a944f53528be7877cee20f45881");
            return;
        }
        super.t();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1389b9f096031c04bc0b92d380ed143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1389b9f096031c04bc0b92d380ed143");
        } else if (p.a(this.ae, this.i)) {
        } else {
            if (TextUtils.isEmpty(this.ae.rankNumPic)) {
                u.c(this.i);
                return;
            }
            this.i.setText(this.ae.getMonthSaledContent());
            u.a(this.i);
            u.c(this.w);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764621cea744460fa6a81a351f06efc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764621cea744460fa6a81a351f06efc8");
            return;
        }
        super.u();
        u.c(this.i);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2f703754f20a01e2d79e01b5ca17df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2f703754f20a01e2d79e01b5ca17df");
            return;
        }
        super.v();
        u.c(this.i);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void setSpuSelectedStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa8635749581caad2f96e4531f51a470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa8635749581caad2f96e4531f51a470");
        } else {
            setBackgroundResource(z ? R.drawable.wm_st_spu_base_round_left_select_bg : R.drawable.wm_st_spu_base_round_left_bg);
        }
    }
}
