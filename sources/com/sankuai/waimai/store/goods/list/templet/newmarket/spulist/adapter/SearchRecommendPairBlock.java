package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.s;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.view.standard.FlashPrice;
import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SearchRecommendPairBlock extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    TextView d;
    View e;
    a f;
    private final j g;
    private RecyclerView h;

    public SearchRecommendPairBlock(@NonNull Context context, j jVar) {
        super(context);
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70beee6a45949b8891c09acb85758a7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70beee6a45949b8891c09acb85758a7f");
        } else {
            this.g = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a60ddc7b5c99e527ea126bec14885b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a60ddc7b5c99e527ea126bec14885b");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) findView(R.id.txt_title);
        this.c = (TextView) findView(R.id.txt_sub_title);
        this.e = findView(R.id.v_txt_divide_line);
        this.d = (TextView) findView(R.id.tv_more);
        this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.view.a.a(getContext(), R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.wm_sg_color_858687, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT), (Drawable) null);
        this.h = (RecyclerView) findView(R.id.recycler_view);
        final int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_7);
        this.h.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.SearchRecommendPairBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33e1c6fb0d1bf740b60c76222ba7c314", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33e1c6fb0d1bf740b60c76222ba7c314");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (state.c() > 0) {
                    if (childAdapterPosition == state.c() - 1) {
                        rect.right = dimensionPixelSize;
                    } else if (childAdapterPosition == 0) {
                        rect.left = dimensionPixelSize;
                    }
                }
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.h.setLayoutManager(linearLayoutManager);
        this.f = new a(this.g);
        this.h.setAdapter(this.f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends com.sankuai.waimai.store.newwidgets.list.f<GoodsSpu, j> {
        public static ChangeQuickRedirect a;
        final Map<String, Object> b;

        public a(@NonNull j jVar) {
            super(jVar);
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1188c78245f8afeb81ec8472d2bbac61", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1188c78245f8afeb81ec8472d2bbac61");
            } else {
                this.b = new HashMap();
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df70fffc02113fccd12aac503b175678", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df70fffc02113fccd12aac503b175678") : new b(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends com.sankuai.waimai.store.newwidgets.list.g<GoodsSpu, j> {
        public static ChangeQuickRedirect a;
        public final Map<String, Object> b;
        public com.sankuai.waimai.store.expose.v2.entity.b c;
        public com.sankuai.waimai.store.expose.v2.entity.b d;
        private SGlRecommendPairCell e;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(GoodsSpu goodsSpu, int i) {
            GoodsSpu goodsSpu2 = goodsSpu;
            boolean z = false;
            Object[] objArr = {goodsSpu2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2157f35291c6ab2df661f8e1de49c2c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2157f35291c6ab2df661f8e1de49c2c4");
                return;
            }
            this.e.a(goodsSpu2, i);
            this.e.setActionCallback(new com.sankuai.waimai.store.cell.core.b() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.SearchRecommendPairBlock.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu3) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void b(GoodsSpu goodsSpu3, int i2) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void b(GoodsSpu goodsSpu3, com.sankuai.waimai.store.util.h hVar, int i2) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void c(GoodsSpu goodsSpu3, int i2) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu3, com.sankuai.waimai.store.util.h hVar, int i2) {
                    Object[] objArr2 = {goodsSpu3, hVar, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b4db4b36223afe2e19b0ab5ba339354", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b4db4b36223afe2e19b0ab5ba339354");
                        return;
                    }
                    com.sankuai.waimai.store.router.g.a(((j) b.this.o).getContext(), goodsSpu3, ((j) b.this.o).p().b, hVar);
                    com.sankuai.waimai.store.manager.judas.b.a(((j) b.this.o).getContext(), "b_waimai_j3vrli90_mc").a("spu_search_type", Integer.valueOf(goodsSpu3.spuSearchType)).a("item_spu_id", Long.valueOf(goodsSpu3.id)).a(DataConstants.INDEX, Integer.valueOf(i2)).b(b.this.b).a(AppUtil.generatePageInfoKey(((j) b.this.o).getContext())).a();
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu3, int i2) {
                    Object[] objArr2 = {goodsSpu3, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "560b5ecb25177201950f22a843a5aa46", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "560b5ecb25177201950f22a843a5aa46");
                        return;
                    }
                    ((j) b.this.o).a(goodsSpu3, i2);
                    com.sankuai.waimai.store.manager.judas.b.a(((j) b.this.o).getContext(), "b_waimai_j9s25fo6_mc").a("spu_search_type", Integer.valueOf(goodsSpu3.spuSearchType)).a("type", 2).a("item_spu_id", Long.valueOf(goodsSpu3.id)).a(DataConstants.INDEX, Integer.valueOf(i2)).b(b.this.b).a(AppUtil.generatePageInfoKey(((j) b.this.o).getContext())).a();
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu3, View view, com.sankuai.waimai.store.util.h hVar, int i2) {
                    Object[] objArr2 = {goodsSpu3, view, hVar, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53aa5d2c56b7bf3f6b290d17c5d43311", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53aa5d2c56b7bf3f6b290d17c5d43311");
                        return;
                    }
                    ((j) b.this.o).a(goodsSpu3, view, i2);
                    com.sankuai.waimai.store.manager.judas.b.a(((j) b.this.o).getContext(), "b_waimai_j9s25fo6_mc").a("spu_search_type", Integer.valueOf(goodsSpu3.spuSearchType)).a("type", 1).a("item_spu_id", Long.valueOf(goodsSpu3.id)).a(DataConstants.INDEX, Integer.valueOf(i2)).b(b.this.b).a(AppUtil.generatePageInfoKey(((j) b.this.o).getContext())).a();
                }
            });
            com.sankuai.waimai.store.expose.v2.entity.b bVar = this.c;
            bVar.e = this.c.f + CommonConstant.Symbol.UNDERLINE + i;
            this.c.a("spu_search_type", Integer.valueOf(goodsSpu2.spuSearchType));
            this.c.a("item_spu_id", Long.valueOf(goodsSpu2.id));
            this.c.a(DataConstants.INDEX, Integer.valueOf(i));
            com.sankuai.waimai.store.expose.v2.entity.b bVar2 = this.d;
            bVar2.e = this.d.f + CommonConstant.Symbol.UNDERLINE + i;
            this.d.a("spu_search_type", Integer.valueOf(goodsSpu2.spuSearchType));
            Map<String, List<GoodsAttr>> attrList = goodsSpu2.getAttrList();
            List<GoodsSku> skuList = goodsSpu2.getSkuList();
            if ((skuList != null && skuList.size() > 1) || (attrList != null && attrList.size() > 0)) {
                z = true;
            }
            this.d.a("type", Integer.valueOf(z ? 2 : 1));
            this.d.a("item_spu_id", Long.valueOf(goodsSpu2.id));
            this.d.a(DataConstants.INDEX, Integer.valueOf(i));
        }

        public b(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e0670c7985060aef6c4e30fc889013", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e0670c7985060aef6c4e30fc889013");
            } else {
                this.b = map;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0363f469ab5acadb9a28e6a273f09db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0363f469ab5acadb9a28e6a273f09db");
                return;
            }
            SGlRecommendPairCell sGlRecommendPairCell = this.e;
            CellUiConfig a2 = CellUiConfig.a();
            a2.d = 1;
            sGlRecommendPairCell.setCellConfig(a2);
            this.e.setPoiHelper(((j) this.o).p());
            this.c = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_j3vrli90_mv", view);
            this.d = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_j9s25fo6_mv", this.e.h());
            this.c.b(this.b);
            this.d.b(this.b);
            if (((j) this.o).getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) ((j) this.o).getContext(), this.c);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) ((j) this.o).getContext(), this.d);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b32d9f04b43ef7c53887454428c8b0e", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b32d9f04b43ef7c53887454428c8b0e");
            }
            this.e = new SGlRecommendPairCell(viewGroup.getContext());
            return this.e;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class SGlRecommendPairCell extends MultiCellView {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public int getLayoutId() {
            return R.layout.wm_st_goods_list_item_recommend_pair;
        }

        public SGlRecommendPairCell(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d820310ae05849907abef7f6cf4b76ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d820310ae05849907abef7f6cf4b76ee");
            }
        }

        public SGlRecommendPairCell(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3c71e91946eb0ee4b6767c224ba55f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3c71e91946eb0ee4b6767c224ba55f");
            }
        }

        public final View h() {
            return this.E;
        }

        @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "266f5e1799833d475b2d1434d978bc97", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "266f5e1799833d475b2d1434d978bc97");
                return;
            }
            super.c();
            this.E = (FlashPrice) this.n.findViewById(R.id.flash_price);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (layoutParams.width * TbsListener.ErrorCode.STARTDOWNLOAD_9) / TbsListener.ErrorCode.EXCEED_INCR_UPDATE;
            }
            int a2 = com.sankuai.shangou.stone.util.h.a(getContext(), 4.0f);
            View findViewById = findViewById(R.id.img_stickydish_pic_show);
            if (findViewById != null) {
                findViewById.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_08000000)).a(a2).a());
            }
            if (this.s != null) {
                this.s.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_st_common_transparent_half_white)).a(a2).a());
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d24e5dd66184c0f8a09ed077dfebd6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d24e5dd66184c0f8a09ed077dfebd6");
            } else if (com.sankuai.shangou.stone.util.p.a(this.ae, this.E)) {
            } else {
                switch (this.ae.getStatus()) {
                    case 1:
                    case 2:
                        this.E.setPriceTheme(2);
                        break;
                    default:
                        this.E.setPriceTheme(0);
                        break;
                }
                this.E.setPrice(com.sankuai.shangou.stone.util.i.a(this.ae.getMinPrice()));
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b44f0b216d53bf546bb230d20b32050", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b44f0b216d53bf546bb230d20b32050");
            } else if (com.sankuai.shangou.stone.util.p.a(this.ae)) {
            } else {
                com.sankuai.waimai.store.util.s.a(this.ae, new s.a<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.SearchRecommendPairBlock.SGlRecommendPairCell.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.s.a
                    public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                        Object[] objArr2 = {goodsSpu};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "577d450c42d7534383ee77c2f4e2e50a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "577d450c42d7534383ee77c2f4e2e50a");
                            return;
                        }
                        com.sankuai.shangou.stone.util.u.c(SGlRecommendPairCell.this.O);
                        if (com.sankuai.shangou.stone.util.p.a(SGlRecommendPairCell.this.E)) {
                            return;
                        }
                        if (!com.sankuai.shangou.stone.util.i.e(Double.valueOf(SGlRecommendPairCell.this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
                            SGlRecommendPairCell.this.E.setOriginPriceVisibility(8);
                        } else {
                            SGlRecommendPairCell.this.E.setOriginPrice(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(SGlRecommendPairCell.this.ae.getOriginPrice())));
                        }
                    }

                    @Override // com.sankuai.waimai.store.util.s.a
                    public final /* synthetic */ void b(GoodsSpu goodsSpu) {
                        Object[] objArr2 = {goodsSpu};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "765c246361c7a78f1773e10a2921dc1e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "765c246361c7a78f1773e10a2921dc1e");
                            return;
                        }
                        if (SGlRecommendPairCell.this.E != null) {
                            SGlRecommendPairCell.this.E.setOriginPriceVisibility(8);
                        }
                        com.sankuai.shangou.stone.util.u.a(SGlRecommendPairCell.this.O);
                        if (com.sankuai.shangou.stone.util.p.a(SGlRecommendPairCell.this.O)) {
                            return;
                        }
                        if (!com.sankuai.shangou.stone.util.i.e(Double.valueOf(SGlRecommendPairCell.this.ae.memberPrice), Double.valueOf(0.0d))) {
                            com.sankuai.shangou.stone.util.u.c(SGlRecommendPairCell.this.O);
                            return;
                        }
                        SGlRecommendPairCell.this.O.setStrikeThrough(com.sankuai.shangou.stone.util.i.e(Double.valueOf(SGlRecommendPairCell.this.ae.memberPrice), Double.valueOf(SGlRecommendPairCell.this.ae.getMinPrice())));
                        SGlRecommendPairCell.this.O.setText(SGlRecommendPairCell.this.getContext().getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(SGlRecommendPairCell.this.ae.memberPrice)));
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView
        public final void k() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a911e31ac7d518f27a2e2467010d6d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a911e31ac7d518f27a2e2467010d6d9");
                return;
            }
            List<GoodsSku> skuList = this.ae.getSkuList();
            if (skuList != null && skuList.size() > 1) {
                if (!com.sankuai.shangou.stone.util.i.e(Double.valueOf(this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
                    if (this.E != null) {
                        this.E.setUnit(getContext().getString(R.string.wm_sc_common_multi_goods_price_format));
                    }
                } else if (this.E != null) {
                    this.E.setUnitVisibility(8);
                }
            } else if (this.E != null) {
                this.E.setUnitVisibility(8);
            }
        }
    }
}
