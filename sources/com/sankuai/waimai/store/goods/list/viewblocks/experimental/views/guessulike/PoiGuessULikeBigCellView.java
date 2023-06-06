package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

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
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.AtmosphereMapFrame;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.k;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiGuessULikeBigCellView extends SpuBaseCellView implements com.sankuai.waimai.store.cell.core.a {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private View d;
    private RelativeLayout e;
    private RelativeLayout f;

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public int getLayoutId() {
        return R.layout.wm_st_guess_u_like_big_cell;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final boolean r() {
        return false;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView, com.sankuai.waimai.store.cell.core.a
    public void setGoodDetailResponse(GoodDetailResponse goodDetailResponse) {
    }

    public PoiGuessULikeBigCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a54e004e098d72ccb1166b39e2e4d1c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a54e004e098d72ccb1166b39e2e4d1c3");
        }
    }

    public PoiGuessULikeBigCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6c548d76c5efc627ecf2bcf4523c68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6c548d76c5efc627ecf2bcf4523c68");
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3028d6dd92b9e026a031deac48ef74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3028d6dd92b9e026a031deac48ef74");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9163f53f34ac73d5cf7a0af2225decd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9163f53f34ac73d5cf7a0af2225decd");
            return;
        }
        super.c();
        this.b = (TextView) this.n.findViewById(R.id.month_sales);
        this.c = (TextView) this.n.findViewById(R.id.txt_stickyfood_price_unit);
        this.d = this.n.findViewById(R.id.promotion_layout);
        this.e = (RelativeLayout) this.n.findViewById(R.id.ll_stickysold_count_unit_price_original_price_fix);
        this.f = (RelativeLayout) this.n.findViewById(R.id.rl_add_food_container);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void d() {
        boolean z;
        GoodsSku goodsSku;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b3c7e5b8ac0df52b553439f5a9fdd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b3c7e5b8ac0df52b553439f5a9fdd8");
            return;
        }
        super.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8da0e117d6c6ec5923240f7cef4f0bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8da0e117d6c6ec5923240f7cef4f0bc6");
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
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27aba708ee5d505e198bd3e9e0e84465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27aba708ee5d505e198bd3e9e0e84465");
        } else {
            u.c(this.c);
            if (!p.a(this.ae) && !p.a(this.E)) {
                if (this.ae.hasManySpec()) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "595b55828e95aecd5aa7bb072debeb1e", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "595b55828e95aecd5aa7bb072debeb1e")).booleanValue();
                    } else {
                        if (this.ae != null && com.sankuai.shangou.stone.util.a.a((List) this.ae.getSkus()) > 1 && (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.getSkus(), 0)) != null) {
                            if (goodsSku.price != goodsSku.originPrice) {
                                int a2 = com.sankuai.shangou.stone.util.a.a((List) this.ae.getSkus());
                                for (int i = 0; i < a2; i++) {
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
        f();
        A();
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ad9af5a163891c6a762d2cfa3d2a9eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ad9af5a163891c6a762d2cfa3d2a9eb7");
            return;
        }
        int i2 = q() ? 23 : 0;
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.sankuai.shangou.stone.util.h.a(getContext(), i2);
        }
        this.d.setLayoutParams(layoutParams);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final Drawable a(@NonNull AtmosphereMapFrame.Frame frame) {
        Object[] objArr = {frame};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e9bbaa442a61c2fb0e8498378e84fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e9bbaa442a61c2fb0e8498378e84fa");
        }
        com.sankuai.waimai.store.widgets.drawable.b bVar = new com.sankuai.waimai.store.widgets.drawable.b();
        bVar.c = com.sankuai.shangou.stone.util.d.a(frame.startColor, getResources().getColor(R.color.wm_st_common_transparent));
        bVar.d = com.sankuai.shangou.stone.util.d.a(frame.endColor, getResources().getColor(R.color.wm_st_common_transparent));
        bVar.e = com.sankuai.shangou.stone.util.h.a(getContext(), 12.0f);
        bVar.b = com.sankuai.shangou.stone.util.h.a(getContext(), 2.0f);
        bVar.f = com.sankuai.shangou.stone.util.h.a(getContext(), 20.0f);
        return bVar;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80721d8f2a440c6835c750608933de17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80721d8f2a440c6835c750608933de17");
        } else if (this.af == null || this.ae == null || this.af.t()) {
        } else {
            if (this.e != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                marginLayoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(getContext().getApplicationContext(), 64.0f);
                this.e.setLayoutParams(marginLayoutParams);
            }
            if (this.f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                marginLayoutParams2.topMargin = com.sankuai.shangou.stone.util.h.a(getContext().getApplicationContext(), 50.0f);
                this.f.setLayoutParams(marginLayoutParams2);
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
