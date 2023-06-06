package com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.old;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c;
import com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.d;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect f;
    private TextView g;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_shop_header_preferential_coupon;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489925c48c131b7f682813742d0426cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489925c48c131b7f682813742d0426cc");
            return;
        }
        super.a(view);
        this.g = (TextView) view.findViewById(R.id.poi_universal_coupon_des);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(Poi.PoiCouponItem poiCouponItem, int i) {
        Object[] objArr = {poiCouponItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71fbc74a0212823043a669ac6c450720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71fbc74a0212823043a669ac6c450720");
            return;
        }
        super.a(poiCouponItem, i);
        u.a(this.g, poiCouponItem.mCouponName);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c
    public final void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "577bb4f47f5134d1233a52d2f866d71a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "577bb4f47f5134d1233a52d2f866d71a");
            return;
        }
        this.c.setBackground(e.a(context, new int[]{R.color.wm_sg_color_CCFFFFFF}, (int) R.dimen.wm_sc_common_dimen_11_half));
        this.c.setTextColor(ContextCompat.getColor(context, R.color.wm_sg_color_FF3333));
        this.g.setTextColor(ContextCompat.getColor(context, R.color.white));
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c
    public final void b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7445c1ae8764acfe9ce79ca0249838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7445c1ae8764acfe9ce79ca0249838");
            return;
        }
        this.c.setBackground(new e.a().a(ContextCompat.getColor(context, R.color.wm_sg_color_FFB0B0)).c(ContextCompat.getColor(context, R.color.wm_sg_color_FFF2F2)).b(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_divider_height)).a(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_11_half)).a());
        this.c.setTextColor(ContextCompat.getColor(context, R.color.wm_st_common_FF4A26));
        this.g.setTextColor(ContextCompat.getColor(context, R.color.wm_st_common_FF4A26));
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c
    public final void c(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b111e89ebead1f70cafebcf2c2f19216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b111e89ebead1f70cafebcf2c2f19216");
            return;
        }
        this.c.setBackground(new e.a().a(ContextCompat.getColor(context, R.color.wm_st_common_D3D3D3)).c(ContextCompat.getColor(context, R.color.wm_sg_color_FAFAFA)).b(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_divider_height)).a(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_11_half)).a());
        this.c.setTextColor(ContextCompat.getColor(context, R.color.wm_sg_color_858687));
        this.g.setTextColor(ContextCompat.getColor(context, R.color.wm_sg_color_858687));
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c
    public final void d(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7f7d2a28a2232b65f79418227b4fa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7f7d2a28a2232b65f79418227b4fa0");
            return;
        }
        this.c.setBackground(e.a(context, new int[]{R.color.wm_sg_color_CCFFFFFF}, (int) R.dimen.wm_sc_common_dimen_11_half));
        this.c.setTextColor(ContextCompat.getColor(context, R.color.wm_st_common_563C22));
        this.g.setTextColor(ContextCompat.getColor(context, R.color.wm_st_common_563C22));
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25d35b201faecf671d1ca51905c4df65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25d35b201faecf671d1ca51905c4df65");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            if (((d) this.o).b()) {
                layoutParams.width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = h.a(this.b.getContext(), 12.0f);
                this.g.setMaxWidth(h.a(this.g.getContext(), 250.0f));
                this.b.setRightAreaSize(R.dimen.wm_sc_common_dimen_57);
            } else {
                layoutParams.width = this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_155);
                this.g.setMaxWidth(h.a(this.g.getContext(), 84.0f));
                this.b.setRightAreaSize(R.dimen.wm_sc_common_dimen_57);
            }
            this.b.setLayoutParams(layoutParams);
        }
    }
}
