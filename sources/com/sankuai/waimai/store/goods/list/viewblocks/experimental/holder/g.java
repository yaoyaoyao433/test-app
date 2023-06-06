package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
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
public final class g extends j {
    public static ChangeQuickRedirect a;
    private ImageView m;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j, com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_view_three_column_union_operation_floor;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j, com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j, com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j
    public final void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38d9f6c6d599e8a01ee83c21849ce33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38d9f6c6d599e8a01ee83c21849ce33");
        } else if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.view.a.a(textView.getContext(), R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.white, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT), (Drawable) null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j
    public final void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b968d2abc57e1a2ddf4eacb323808a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b968d2abc57e1a2ddf4eacb323808a");
        } else if (p.a(goodsPoiCategory) || p.a(goodsPoiCategory.floorBgPicUrl)) {
        } else {
            b.C0608b a2 = m.a(goodsPoiCategory.floorBgPicUrl);
            a2.g = false;
            a2.f = ImageQualityUtil.a();
            a2.a(new TopScaleBitmapTransformation()).a(this.e);
            u.a(this.g);
            if (this.j != null) {
                this.h.setBackground(this.j);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j
    public final void c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "935e2d7b60c33675b18b3b5500a4b1cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "935e2d7b60c33675b18b3b5500a4b1cb");
        } else {
            m.b(goodsPoiCategory.titlePic).a(new b.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a3d04a3f82c03b6bd2a3b1ec4cef369", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a3d04a3f82c03b6bd2a3b1ec4cef369");
                        return;
                    }
                    g.this.m.setImageBitmap(bitmap);
                    g.this.m.getLayoutParams().width = (bitmap.getWidth() * com.sankuai.shangou.stone.util.h.a(g.this.e.getContext(), 18.0f)) / bitmap.getHeight();
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j
    public final void a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3748ad17f58e8ba3d38ce13f8b7048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3748ad17f58e8ba3d38ce13f8b7048");
            return;
        }
        super.a(goodsPoiCategory);
        this.d.setTextColor(com.sankuai.waimai.store.util.b.b(this.m.getContext(), R.color.white));
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e4578cf807a5471a21a6c24d837d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e4578cf807a5471a21a6c24d837d49");
            return;
        }
        super.a(view);
        this.m = (ImageView) view.findViewById(R.id.wm_sc_img_floor_title);
    }
}
