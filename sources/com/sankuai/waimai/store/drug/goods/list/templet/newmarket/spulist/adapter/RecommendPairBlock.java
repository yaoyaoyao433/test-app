package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.drug.goods.list.views.cell.view.MultiCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.HandPriceAdapterView;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.view.standard.FlashButton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class RecommendPairBlock extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final d b;
    TextView c;
    TextView d;
    TextView e;
    RecyclerView f;
    b g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        String a();
    }

    public RecommendPairBlock(@NonNull Context context, d dVar) {
        super(context);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e5430d90fea714a84669cb5baae39ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e5430d90fea714a84669cb5baae39ae");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2eb54e162340b4ca0d377c5ee3391e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2eb54e162340b4ca0d377c5ee3391e7");
            return;
        }
        super.onViewCreated();
        this.c = (TextView) findView(R.id.txt_title);
        this.d = (TextView) findView(R.id.txt_sub_title);
        this.e = (TextView) findView(R.id.txt_tip);
        this.f = (RecyclerView) findView(R.id.recycler_view);
        final int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_7);
        this.f.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a24c7a92624911ead773038f1d07f67b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a24c7a92624911ead773038f1d07f67b");
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
        this.f.setLayoutManager(linearLayoutManager);
        this.g = new b(this.b);
        this.f.setAdapter(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5e63f3f3bc12b80889b9630d2ff7ec2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5e63f3f3bc12b80889b9630d2ff7ec2");
        }
        if (goodsSpu == null) {
            return "";
        }
        return goodsSpu.getId() + goodsSpu.categoryTag;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends com.sankuai.waimai.store.newwidgets.list.f<GoodsSpu, d> implements a {
        public static ChangeQuickRedirect a;
        final Map<String, Object> b;
        GoodsSpu c;

        public b(@NonNull d dVar) {
            super(dVar);
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce737dde4100891a3eea3a7b97bdc5f0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce737dde4100891a3eea3a7b97bdc5f0");
            } else {
                this.b = new HashMap();
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "648aeca238f594db47ac1b885dd0a2ae", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "648aeca238f594db47ac1b885dd0a2ae") : new c(this.b, this);
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.a
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54585cdeb2b828fe03598a8ab44e8029", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54585cdeb2b828fe03598a8ab44e8029") : RecommendPairBlock.a(this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends com.sankuai.waimai.store.newwidgets.list.g<GoodsSpu, d> {
        public static ChangeQuickRedirect a;
        public final Map<String, Object> b;
        public a c;
        public com.sankuai.waimai.store.expose.v2.entity.b d;
        private SGlRecommendPairCell e;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(GoodsSpu goodsSpu, int i) {
            GoodsSpu goodsSpu2 = goodsSpu;
            Object[] objArr = {goodsSpu2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a465266790c14259577fc891641397d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a465266790c14259577fc891641397d3");
            } else if (goodsSpu2 == null) {
            } else {
                this.e.a(goodsSpu2, i);
                com.sankuai.waimai.store.expose.v2.entity.b bVar = this.d;
                bVar.e = this.d.f + goodsSpu2.id + CommonConstant.Symbol.UNDERLINE + this.b.get("pre_spu_id");
                this.d.a("spu_id", Long.valueOf(goodsSpu2.id)).a("product_index", Integer.valueOf(i)).a("content_tag", goodsSpu2.recommendReason);
            }
        }

        public c(Map<String, Object> map, a aVar) {
            Object[] objArr = {map, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fee0d92725920068840efa07c5afbf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fee0d92725920068840efa07c5afbf");
                return;
            }
            this.b = map;
            this.c = aVar;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f239244b7c79d261ac10a023b28004", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f239244b7c79d261ac10a023b28004");
                return;
            }
            SGlRecommendPairCell sGlRecommendPairCell = this.e;
            CellUiConfig a2 = CellUiConfig.a();
            a2.d = 1;
            sGlRecommendPairCell.setCellConfig(a2);
            this.e.setActionCallback(new com.sankuai.waimai.store.cell.core.b() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu, int i) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void b(GoodsSpu goodsSpu, int i) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void b(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void c(GoodsSpu goodsSpu, int i) {
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
                    Object[] objArr2 = {goodsSpu, hVar, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cd08a9273659c013e24c91a7d92777f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cd08a9273659c013e24c91a7d92777f");
                        return;
                    }
                    com.sankuai.waimai.store.drug.util.d.a(((d) c.this.o).getContext(), goodsSpu, ((d) c.this.o).n().b, hVar);
                    com.sankuai.waimai.store.callback.a a3 = com.sankuai.waimai.store.manager.judas.b.a(((d) c.this.o).getContext(), "b_waimai_2kdn7216_mc");
                    if (!t.a(goodsSpu.recommendReason)) {
                        a3.a("content_tag", goodsSpu.recommendReason);
                    }
                    a3.a("spu_id", Long.valueOf(goodsSpu.id)).a("product_index", Integer.valueOf(i)).b(c.this.b).a(AppUtil.generatePageInfoKey(((d) c.this.o).getContext())).a();
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu, View view2, com.sankuai.waimai.store.util.h hVar, int i) {
                    Object[] objArr2 = {goodsSpu, view2, hVar, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "308c7c9a1f9605b3facb424cccb399e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "308c7c9a1f9605b3facb424cccb399e4");
                        return;
                    }
                    ((d) c.this.o).a(goodsSpu, view2, i);
                    com.sankuai.waimai.store.callback.a a3 = com.sankuai.waimai.store.manager.judas.b.a(((d) c.this.o).getContext(), "b_waimai_c0n9a6vl_mc");
                    if (!t.a(goodsSpu.recommendReason)) {
                        a3.a("content_tag", goodsSpu.recommendReason);
                    }
                    a3.a("spu_id", Long.valueOf(goodsSpu.id)).a("product_index", Integer.valueOf(i)).a("content_tag", goodsSpu.recommendReason).b(c.this.b).a(AppUtil.generatePageInfoKey(((d) c.this.o).getContext())).a();
                }
            });
            this.e.setPoiHelper(((d) this.o).n());
            this.d = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_2kdn7216_mv", view) { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.b
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e26803dd9ab28ba18558e53ec6b3d2e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e26803dd9ab28ba18558e53ec6b3d2e") : c.this.c.a();
                }
            };
            this.d.b(this.b);
            if (((d) this.o).getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) ((d) this.o).getContext(), this.d);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd69984a20a0e88307a592dc5c39561c", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd69984a20a0e88307a592dc5c39561c");
            }
            this.e = new SGlRecommendPairCell(viewGroup.getContext());
            return this.e;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class SGlRecommendPairCell extends MultiCellView {
        public static ChangeQuickRedirect a;
        protected TextView b;
        protected View c;
        protected HandPriceAdapterView d;

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public int getLayoutId() {
            return R.layout.wm_drug_goods_list_item_recommend_pair;
        }

        public SGlRecommendPairCell(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9015172605072f6c381de9d1323615", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9015172605072f6c381de9d1323615");
            }
        }

        public SGlRecommendPairCell(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1581753d91879a47343b9f7fe1f1d7b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1581753d91879a47343b9f7fe1f1d7b8");
            }
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3b50e316fb7797782eddac3064f140", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3b50e316fb7797782eddac3064f140");
                return;
            }
            super.c();
            this.b = (TextView) this.n.findViewById(R.id.txt_recommend_reason);
            this.c = this.n.findViewById(R.id.txt_recommend_reason_ll);
            this.d = (HandPriceAdapterView) this.n.findViewById(R.id.price);
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c397c365de522d21ec95dc5a42b02f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c397c365de522d21ec95dc5a42b02f");
                return;
            }
            super.d();
            if (this.ae == null || t.a(this.ae.recommendReason)) {
                u.c(this.c);
            } else {
                u.a(this.b, this.ae.recommendReason);
                u.a(this.c);
            }
            if (this.ae == null || this.d == null) {
                u.c(this.d);
                return;
            }
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b a2 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b.a();
            a2.b = 0;
            a2.d = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_28;
            this.d.a(this.ae, true, a2, "A");
            u.a(this.d);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void H() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69e71ffac562d5caea06c25b9cc85e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69e71ffac562d5caea06c25b9cc85e0");
            } else if (this.af == null || this.ae == null) {
            } else {
                if (com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.skus, 0) == null || this.G == null) {
                    u.a(this.F);
                    u.c(this.G);
                    return;
                }
                int i = ((GoodsSku) Objects.requireNonNull(com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.skus, 0))).minOrderCount;
                if (w.a(this.ae, this.af.d()) != 0 || i <= 1) {
                    u.c(this.G);
                    u.a(this.F);
                    return;
                }
                u.a(this.G);
                u.c(this.F);
                FlashButton flashButton = this.G;
                flashButton.setText(i + getMinOrderCountText());
                this.G.setMidMargin(0);
            }
        }
    }
}
