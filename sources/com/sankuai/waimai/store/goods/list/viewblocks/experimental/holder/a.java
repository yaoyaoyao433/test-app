package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.utils.TopScaleBitmapTransformation;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends j {
    public static ChangeQuickRedirect a;
    private TextView m;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j, com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j
    public final void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4245e50d6a82e8a74596740c89231b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4245e50d6a82e8a74596740c89231b");
        } else if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.view.a.a(textView.getContext(), R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.wm_sg_color_222426, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT), (Drawable) null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j
    public final void a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a83c83820d8067d07fcb0127bf3f302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a83c83820d8067d07fcb0127bf3f302");
            return;
        }
        super.a(goodsPoiCategory);
        if (this.d != null) {
            this.d.setTextColor(com.sankuai.waimai.store.util.b.b(this.d.getContext(), R.color.wm_sg_color_222426));
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j
    public final void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62844e8a14e121b690a8bae0a593d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62844e8a14e121b690a8bae0a593d8b");
        } else if (p.a(goodsPoiCategory) || p.a(goodsPoiCategory.floorBgPicUrl)) {
        } else {
            u.c(this.g);
            if (this.j != null) {
                this.h.setBackground(this.j);
            }
            b.C0608b a2 = m.a(goodsPoiCategory.floorBgPicUrl);
            a2.g = false;
            a2.f = ImageQualityUtil.a();
            a2.a(new TopScaleBitmapTransformation()).a(this.e);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j
    public final void c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305e1982ca5649d6faea69250b0dfb9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305e1982ca5649d6faea69250b0dfb9e");
        } else {
            u.a(this.m, goodsPoiCategory.name);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b27a59e6faef2df4f7c36b3f084b7d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b27a59e6faef2df4f7c36b3f084b7d5");
            return;
        }
        super.a(view);
        this.m = (TextView) view.findViewById(R.id.wm_sc_tv_floor_title);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j, com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cb2addcbb85f7ea798e684dbc32ab42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cb2addcbb85f7ea798e684dbc32ab42");
        } else {
            ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).a(goodsSpu, i);
        }
    }
}
