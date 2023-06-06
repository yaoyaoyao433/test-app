package com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.templet.market.view.custom.BorderTextView;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.newwidgets.list.f<GoodsPoiCategory, e> {
    public static ChangeQuickRedirect a;

    public h(e eVar) {
        super(eVar);
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893c235ab39eb08e7cda267b99e7c86d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893c235ab39eb08e7cda267b99e7c86d");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70cb96e89b799adfecf67f3008a1eab2", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70cb96e89b799adfecf67f3008a1eab2") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends com.sankuai.waimai.store.newwidgets.list.g<GoodsPoiCategory, e> {
        public static ChangeQuickRedirect a;
        private BorderTextView b;
        private TextView c;
        private View d;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_goods_list_tmp_v6_tab_item;
        }

        public a() {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(GoodsPoiCategory goodsPoiCategory, int i) {
            GoodsPoiCategory goodsPoiCategory2 = goodsPoiCategory;
            Object[] objArr = {goodsPoiCategory2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5656ac4cc76665a4b6f49744e4488fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5656ac4cc76665a4b6f49744e4488fa");
            } else if (goodsPoiCategory2 != null) {
                this.b.setRedPointStatus(((e) this.o).a(new f(goodsPoiCategory2, 0)));
                this.b.setText(goodsPoiCategory2.getTagName());
                this.b.setSelected(goodsPoiCategory2.isSelected());
                boolean isSelected = goodsPoiCategory2.isSelected();
                Object[] objArr2 = {Byte.valueOf(isSelected ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c247844add9f86a272aeec7ffae7d685", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c247844add9f86a272aeec7ffae7d685");
                } else if (isSelected) {
                    this.d.setBackground(com.sankuai.waimai.store.util.e.b(this.d.getContext(), (int) R.color.wm_sg_color_FFF2CC, (int) R.dimen.wm_sc_common_dimen_4));
                } else {
                    this.d.setBackgroundResource(R.drawable.wm_sc_border_text_view_unselect_back_color);
                }
                ((e) this.o).a(goodsPoiCategory2, i, this.p);
                u.a(this.c, goodsPoiCategory2.getSubName());
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e3d680e7ab68d72cf73bdea6a61858", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e3d680e7ab68d72cf73bdea6a61858");
                return;
            }
            this.b = (BorderTextView) view.findViewById(R.id.takeout_txt_tab);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c01dcca36b5dda34fe578f17d960a356", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c01dcca36b5dda34fe578f17d960a356");
            } else {
                this.b.setSelectedBackground(0);
                this.b.setUnselectedBackground(0);
                this.b.setSelectedTextColor(R.color.wm_sg_color_222426);
                this.b.setUnselectedTextColor(R.color.wm_sg_color_575859);
                this.b.setRedPointPaddingTop(com.sankuai.shangou.stone.util.h.a(this.b.getContext(), 2.5f));
            }
            this.c = (TextView) view.findViewById(R.id.tv_sub_title);
            this.d = view.findViewById(R.id.ll_title_container);
        }
    }
}
