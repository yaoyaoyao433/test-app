package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

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
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.drug.goods.list.views.cell.view.MultiCellView;
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
    private final d b;
    private TextView c;
    private TextView d;
    private TextView e;
    private View f;
    private RecyclerView g;
    private a h;

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8016945e69875ec9aaa537512d8e47d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8016945e69875ec9aaa537512d8e47d");
            return;
        }
        super.onViewCreated();
        this.c = (TextView) findView(R.id.txt_title);
        this.d = (TextView) findView(R.id.txt_sub_title);
        this.f = findView(R.id.v_txt_divide_line);
        this.e = (TextView) findView(R.id.tv_more);
        this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.view.a.a(getContext(), R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.wm_sg_color_858687, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT), (Drawable) null);
        this.g = (RecyclerView) findView(R.id.recycler_view);
        final int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_7);
        this.g.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.SearchRecommendPairBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2497bf1448f13354a8c1b9999063d618", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2497bf1448f13354a8c1b9999063d618");
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
        this.g.setLayoutManager(linearLayoutManager);
        this.h = new a(this.b);
        this.g.setAdapter(this.h);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends com.sankuai.waimai.store.newwidgets.list.f<GoodsSpu, d> {
        public static ChangeQuickRedirect a;
        private final Map<String, Object> b;

        public a(@NonNull d dVar) {
            super(dVar);
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f3ef9830e782cfbe6d4a9141ef8c73", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f3ef9830e782cfbe6d4a9141ef8c73");
            } else {
                this.b = new HashMap();
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa4d62bffffbc981d8dd498fdec56d29", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa4d62bffffbc981d8dd498fdec56d29") : new b(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends com.sankuai.waimai.store.newwidgets.list.g<GoodsSpu, d> {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a036273f42666ba9eb1fc8c6a54996", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a036273f42666ba9eb1fc8c6a54996");
                return;
            }
            this.e.a(goodsSpu2, i);
            this.e.setActionCallback(new com.sankuai.waimai.store.cell.core.b() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.SearchRecommendPairBlock.b.1
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96184b45b50e56fa7d0990bb003bf8e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96184b45b50e56fa7d0990bb003bf8e9");
                        return;
                    }
                    com.sankuai.waimai.store.drug.util.d.a(((d) b.this.o).getContext(), goodsSpu3, ((d) b.this.o).n().b, hVar);
                    com.sankuai.waimai.store.manager.judas.b.a(((d) b.this.o).getContext(), "b_waimai_j3vrli90_mc").a("spu_search_type", Integer.valueOf(goodsSpu3.spuSearchType)).a("item_spu_id", Long.valueOf(goodsSpu3.id)).a(DataConstants.INDEX, Integer.valueOf(i2)).b(b.this.b).a(AppUtil.generatePageInfoKey(((d) b.this.o).getContext())).a();
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu3, int i2) {
                    Object[] objArr2 = {goodsSpu3, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8162b89d97f2906c5eaa3d2c815c5d01", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8162b89d97f2906c5eaa3d2c815c5d01");
                        return;
                    }
                    ((d) b.this.o).a(goodsSpu3, i2);
                    com.sankuai.waimai.store.manager.judas.b.a(((d) b.this.o).getContext(), "b_waimai_j9s25fo6_mc").a("spu_search_type", Integer.valueOf(goodsSpu3.spuSearchType)).a("type", 2).a("item_spu_id", Long.valueOf(goodsSpu3.id)).a(DataConstants.INDEX, Integer.valueOf(i2)).b(b.this.b).a(AppUtil.generatePageInfoKey(((d) b.this.o).getContext())).a();
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu3, View view, com.sankuai.waimai.store.util.h hVar, int i2) {
                    Object[] objArr2 = {goodsSpu3, view, hVar, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b892738eef52ad3b238558687e38c3e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b892738eef52ad3b238558687e38c3e");
                        return;
                    }
                    ((d) b.this.o).a(goodsSpu3, view, i2);
                    com.sankuai.waimai.store.manager.judas.b.a(((d) b.this.o).getContext(), "b_waimai_j9s25fo6_mc").a("spu_search_type", Integer.valueOf(goodsSpu3.spuSearchType)).a("type", 1).a("item_spu_id", Long.valueOf(goodsSpu3.id)).a(DataConstants.INDEX, Integer.valueOf(i2)).b(b.this.b).a(AppUtil.generatePageInfoKey(((d) b.this.o).getContext())).a();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0d9353c54820ef0cc21bc0ad2f2145", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0d9353c54820ef0cc21bc0ad2f2145");
            } else {
                this.b = map;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e6796041506381d737d3314016a68bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e6796041506381d737d3314016a68bf");
                return;
            }
            SGlRecommendPairCell sGlRecommendPairCell = this.e;
            CellUiConfig a2 = CellUiConfig.a();
            a2.d = 1;
            sGlRecommendPairCell.setCellConfig(a2);
            this.e.setPoiHelper(((d) this.o).n());
            this.c = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_j3vrli90_mv", view);
            this.d = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_j9s25fo6_mv", this.e.h());
            this.c.b(this.b);
            this.d.b(this.b);
            if (((d) this.o).getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) ((d) this.o).getContext(), this.c);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) ((d) this.o).getContext(), this.d);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea516a13a65824c104e5e09f41bc984", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea516a13a65824c104e5e09f41bc984");
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
            return R.layout.wm_drug_goods_list_item_recommend_pair;
        }

        public SGlRecommendPairCell(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2635b77dec3068717e5f561c4545905", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2635b77dec3068717e5f561c4545905");
            }
        }

        public SGlRecommendPairCell(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f266d451b90e2e0cfe62a771cd03125e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f266d451b90e2e0cfe62a771cd03125e");
            }
        }

        public final View h() {
            return this.E;
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fadfa4c8e12cc0aebcede69060a9469", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fadfa4c8e12cc0aebcede69060a9469");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15679454cdac2204a45249ed6832ca7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15679454cdac2204a45249ed6832ca7a");
            } else if (p.a(this.ae, this.E)) {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041c75aeba5a78dae08b63b06e06aa41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041c75aeba5a78dae08b63b06e06aa41");
            } else if (p.a(this.ae)) {
            } else {
                s.a(this.ae, new s.a<GoodsSpu>() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.SearchRecommendPairBlock.SGlRecommendPairCell.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.s.a
                    public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                        Object[] objArr2 = {goodsSpu};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "026fa2ab9c16e84aef9c8806be7081ec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "026fa2ab9c16e84aef9c8806be7081ec");
                            return;
                        }
                        u.c(SGlRecommendPairCell.this.O);
                        if (p.a(SGlRecommendPairCell.this.E)) {
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
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "823699930fe3b21d7bd41ec707d7d38d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "823699930fe3b21d7bd41ec707d7d38d");
                            return;
                        }
                        if (SGlRecommendPairCell.this.E != null) {
                            SGlRecommendPairCell.this.E.setOriginPriceVisibility(8);
                        }
                        u.a(SGlRecommendPairCell.this.O);
                        if (p.a(SGlRecommendPairCell.this.O)) {
                            return;
                        }
                        if (!com.sankuai.shangou.stone.util.i.e(Double.valueOf(SGlRecommendPairCell.this.ae.memberPrice), Double.valueOf(0.0d))) {
                            u.c(SGlRecommendPairCell.this.O);
                            return;
                        }
                        SGlRecommendPairCell.this.O.setStrikeThrough(com.sankuai.shangou.stone.util.i.e(Double.valueOf(SGlRecommendPairCell.this.ae.memberPrice), Double.valueOf(SGlRecommendPairCell.this.ae.getMinPrice())));
                        SGlRecommendPairCell.this.O.setText(SGlRecommendPairCell.this.getContext().getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(SGlRecommendPairCell.this.ae.memberPrice)));
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.views.cell.view.MultiCellView
        public final void k() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63296253c1e1adb839e14803cb98047", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63296253c1e1adb839e14803cb98047");
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
