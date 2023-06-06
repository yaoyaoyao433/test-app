package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.goods.list.templet.market.view.custom.BorderTextView;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.newwidgets.list.f<GoodsPoiCategory, d> {
    public static ChangeQuickRedirect a;

    public g(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f325af10732897ee77ffd26dc8a38d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f325af10732897ee77ffd26dc8a38d");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7b161f05255d2dfd0ae39ac539ad99", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7b161f05255d2dfd0ae39ac539ad99") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends com.sankuai.waimai.store.newwidgets.list.g<GoodsPoiCategory, d> {
        public static ChangeQuickRedirect a;
        private BorderTextView b;
        private TextView c;
        private View d;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_drug_goods_list_tmp_v6_tab_item;
        }

        public a() {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(GoodsPoiCategory goodsPoiCategory, int i) {
            GoodsPoiCategory goodsPoiCategory2 = goodsPoiCategory;
            Object[] objArr = {goodsPoiCategory2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472cb19a3ecb87d67fa9e97e4375a2aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472cb19a3ecb87d67fa9e97e4375a2aa");
            } else if (goodsPoiCategory2 != null) {
                this.b.setRedPointStatus(((d) this.o).a(new e(goodsPoiCategory2, 0)));
                this.b.setText(goodsPoiCategory2.getTagName());
                this.b.setSelected(goodsPoiCategory2.isSelected());
                boolean isSelected = goodsPoiCategory2.isSelected();
                Object[] objArr2 = {Byte.valueOf(isSelected ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9995061cdec94c46bba7ab75dedd8bf3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9995061cdec94c46bba7ab75dedd8bf3");
                } else if (isSelected) {
                    this.d.setBackground(com.sankuai.waimai.store.util.e.b(this.d.getContext(), (int) R.color.wm_sg_color_FFF8E1, (int) R.dimen.wm_sc_common_dimen_16));
                } else {
                    this.d.setBackgroundResource(R.drawable.wm_drug_goods_list_border_text_view_unselect_back_color);
                }
                ((d) this.o).a(goodsPoiCategory2, i, this.p);
                u.a(this.c, goodsPoiCategory2.getSubName());
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b1b0133259c6e62e5fa5d5bb16ccbc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b1b0133259c6e62e5fa5d5bb16ccbc");
                return;
            }
            this.b = (BorderTextView) view.findViewById(R.id.takeout_txt_tab);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b52f813f5de119c8c01a1e1e2df2647b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b52f813f5de119c8c01a1e1e2df2647b");
            } else {
                this.b.setSelectedBackground(0);
                this.b.setUnselectedBackground(0);
                this.b.setSelectedTextColor(R.color.wm_sg_color_FF8002);
                this.b.setUnselectedTextColor(R.color.wm_sg_color_575859);
                this.b.setRedPointPaddingTop(h.a(this.b.getContext(), 2.5f));
            }
            this.c = (TextView) view.findViewById(R.id.tv_sub_title);
            this.d = view.findViewById(R.id.ll_title_container);
        }
    }
}
