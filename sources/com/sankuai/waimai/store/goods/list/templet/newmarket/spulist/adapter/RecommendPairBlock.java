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
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.s;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.view.price.SCPriceView;
import com.sankuai.waimai.store.view.standard.FlashPrice;
import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class RecommendPairBlock extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    public static int c = 1;
    public static int d = 2;
    public static int e = 0;
    public static int f = 1;
    public static int g = 2;
    public static int h = 3;
    final j i;
    View j;
    ImageView k;
    ImageView l;
    TextView m;
    TextView n;
    TextView o;
    View p;
    RecyclerView q;
    a r;
    GoodsSpu s;
    com.sankuai.waimai.store.expose.v2.entity.b t;
    com.sankuai.waimai.store.expose.v2.entity.b u;
    com.sankuai.waimai.store.expose.v2.entity.b v;
    com.sankuai.waimai.store.expose.v2.entity.b w;
    com.sankuai.waimai.store.expose.v2.entity.b x;

    public static /* synthetic */ void a(RecommendPairBlock recommendPairBlock) {
        View childAt;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, recommendPairBlock, changeQuickRedirect, false, "c4ae6310365190452757be391751995d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, recommendPairBlock, changeQuickRedirect, false, "c4ae6310365190452757be391751995d");
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recommendPairBlock.q.getLayoutManager();
        if (recommendPairBlock.s == null || recommendPairBlock.s.recommendPair == null || linearLayoutManager == null || (childAt = recommendPairBlock.q.getChildAt(0)) == null) {
            return;
        }
        int position = linearLayoutManager.getPosition(childAt);
        int left = childAt.getLeft();
        recommendPairBlock.s.recommendPair.scrollPosition = position;
        recommendPairBlock.s.recommendPair.scrollOffset = left;
    }

    public RecommendPairBlock(@NonNull Context context, j jVar) {
        super(context);
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e0ef8b3b456b24a86d4e53464bc1176", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e0ef8b3b456b24a86d4e53464bc1176");
        } else {
            this.i = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df1218efa4b7d5d3776b691ef6edca48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df1218efa4b7d5d3776b691ef6edca48");
            return;
        }
        super.onViewCreated();
        this.j = findView(R.id.cl_container_bg);
        this.k = (ImageView) findView(R.id.im_recommend_icon);
        this.l = (ImageView) findView(R.id.im_exchange_icon);
        this.m = (TextView) findView(R.id.txt_title);
        this.n = (TextView) findView(R.id.txt_sub_title);
        this.p = findView(R.id.v_txt_divide_line);
        this.o = (TextView) findView(R.id.tv_more);
        this.o.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.view.a.a(getContext(), R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.wm_sg_color_858687, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT), (Drawable) null);
        this.q = (RecyclerView) findView(R.id.recycler_view);
        final int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_7);
        this.q.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3866f141ffc10d8b770c1843c97e3057", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3866f141ffc10d8b770c1843c97e3057");
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
        this.q.setLayoutManager(linearLayoutManager);
        this.r = new a(this.i);
        this.q.setAdapter(this.r);
        this.q.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1633459d6c978b72454294651f15b21c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1633459d6c978b72454294651f15b21c");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                RecommendPairBlock.a(RecommendPairBlock.this);
            }
        });
        this.t = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_6lbc4u9x_mv", getView());
        this.v = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_7h8upa4l_mv", this.o);
        this.u = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_0tkh65q9_mv", this.n);
        this.w = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_jeoqf3vq_mv", getView());
        this.x = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_x08fxwol_mv", this.o);
        if (getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.a aVar = (com.sankuai.waimai.store.expose.v2.a) getContext();
            com.sankuai.waimai.store.expose.v2.b.a().a(aVar, this.t);
            com.sankuai.waimai.store.expose.v2.b.a().a(aVar, this.v);
            com.sankuai.waimai.store.expose.v2.b.a().a(aVar, this.u);
            com.sankuai.waimai.store.expose.v2.b.a().a(aVar, this.w);
            com.sankuai.waimai.store.expose.v2.b.a().a(aVar, this.x);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends com.sankuai.waimai.store.newwidgets.list.f<GoodsSpu, j> {
        public static ChangeQuickRedirect a;
        private final Map<String, Object> b;
        private int c;
        private int d;
        private GoodsSpu j;

        public a(@NonNull j jVar) {
            super(jVar);
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27633adc73c5e1f92ec2051d26e09e0f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27633adc73c5e1f92ec2051d26e09e0f");
            } else {
                this.b = new HashMap();
            }
        }

        public final void a(GoodsSpu goodsSpu, RecommendPair recommendPair) {
            Object[] objArr = {goodsSpu, recommendPair};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c88b168f7d3db02d792e3e60bf46d031", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c88b168f7d3db02d792e3e60bf46d031");
                return;
            }
            this.b.clear();
            GoodsPoiCategory m = ((j) this.i).m();
            GoodsPoiCategory l = ((j) this.i).l();
            int n = ((j) this.i).n();
            int o = ((j) this.i).o();
            this.b.put("poi_id", f().p().d());
            this.b.put("product_id", Long.valueOf(goodsSpu.getId()));
            this.b.put("scene_id", recommendPair.sceneId);
            this.b.put("sub_title", recommendPair.subTitle);
            this.b.put("trace_id", l == null ? "" : l.traceId);
            this.b.put("category_index", Integer.valueOf(n));
            this.b.put("category_name", m == null ? "" : m.getTagName());
            this.b.put("category_sec_id", l == m ? "" : l.getTagCode());
            this.b.put("category_sec_index", Integer.valueOf(o));
            this.b.put("category_sec_name", l == m ? "" : l.getTagName());
            this.c = recommendPair.moduleType;
            if (this.c == RecommendPairBlock.d) {
                this.b.put("spu_id", Long.valueOf(goodsSpu.getId()));
                this.b.put("index", Long.valueOf(goodsSpu.getId()));
                this.b.put("activity_tag", GoodsSpu.ITEM_COLLECTION_REDEEM);
            }
            this.d = com.sankuai.shangou.stone.util.a.a((List) recommendPair.spus);
            this.j = goodsSpu;
            b_(recommendPair.spus);
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "739768302fd81f0366416fa307ac85c2", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "739768302fd81f0366416fa307ac85c2") : new b(this.b, this.c, this.d, this.j);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eacc8417171af7393a0e81060af6b4d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eacc8417171af7393a0e81060af6b4d")).intValue();
            }
            if (this.c == RecommendPairBlock.d) {
                if (this.d == 1) {
                    return RecommendPairBlock.e;
                }
                if (this.d == 2) {
                    return RecommendPairBlock.f;
                }
                return RecommendPairBlock.g;
            }
            return RecommendPairBlock.h;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends com.sankuai.waimai.store.newwidgets.list.g<GoodsSpu, j> {
        public static ChangeQuickRedirect a;
        public final Map<String, Object> b;
        int c;
        public com.sankuai.waimai.store.expose.v2.entity.b d;
        public com.sankuai.waimai.store.expose.v2.entity.b e;
        public com.sankuai.waimai.store.expose.v2.entity.b f;
        private SGlRecommendPairCell g;
        private int h;
        private GoodsSpu i;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(GoodsSpu goodsSpu, int i) {
            GoodsSpu goodsSpu2 = goodsSpu;
            Object[] objArr = {goodsSpu2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da766b418c85963d8d02a1932071dcc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da766b418c85963d8d02a1932071dcc");
                return;
            }
            this.g.setActionCallback(new com.sankuai.waimai.store.cell.core.b() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.b.1
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "882c000ca4f98c100ca67e222cb6201d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "882c000ca4f98c100ca67e222cb6201d");
                        return;
                    }
                    com.sankuai.waimai.store.router.g.a(((j) b.this.o).getContext(), goodsSpu3, ((j) b.this.o).p().b, hVar);
                    if (b.this.c == RecommendPairBlock.d) {
                        b.this.b.put("spu_id", Long.valueOf(goodsSpu3.getId()));
                        b.this.b.put("index", Integer.valueOf(i2));
                        com.sankuai.waimai.store.manager.judas.b.a(((j) b.this.o).getContext(), "b_waimai_9v5u5z2a_mc").a("spu_id", Long.valueOf(goodsSpu3.id)).b(b.this.b).a(AppUtil.generatePageInfoKey(((j) b.this.o).getContext())).a();
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(((j) b.this.o).getContext(), "b_waimai_4lfrlshp_mc").a("spu_id", Long.valueOf(goodsSpu3.id)).b(b.this.b).a(AppUtil.generatePageInfoKey(((j) b.this.o).getContext())).a();
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu3, int i2) {
                    Object[] objArr2 = {goodsSpu3, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28b624c4d8f1156547b6a3934d04b3d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28b624c4d8f1156547b6a3934d04b3d1");
                        return;
                    }
                    ((j) b.this.o).a(goodsSpu3, i2);
                    if (b.this.c == RecommendPairBlock.d) {
                        b.this.b.put("index", Integer.valueOf(i2));
                        b.this.b.put("activity_tag", GoodsSpu.ITEM_COLLECTION_REDEEM);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(((j) b.this.o).getContext(), "b_waimai_6szx4iuj_mc").a("spu_id", Long.valueOf(goodsSpu3.id)).b(b.this.b).a(AppUtil.generatePageInfoKey(((j) b.this.o).getContext())).a();
                }

                @Override // com.sankuai.waimai.store.cell.core.b
                public final void a(GoodsSpu goodsSpu3, View view, com.sankuai.waimai.store.util.h hVar, int i2) {
                    Object[] objArr2 = {goodsSpu3, view, hVar, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74551c2bc4df6436edaf97d8359b01dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74551c2bc4df6436edaf97d8359b01dd");
                        return;
                    }
                    ((j) b.this.o).a(goodsSpu3, view, i2);
                    if (b.this.c == RecommendPairBlock.d) {
                        b.this.b.put("index", Integer.valueOf(i2));
                        b.this.b.put("activity_tag", GoodsSpu.ITEM_COLLECTION_REDEEM);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(((j) b.this.o).getContext(), "b_waimai_6szx4iuj_mc").a("spu_id", Long.valueOf(goodsSpu3.id)).b(b.this.b).a(AppUtil.generatePageInfoKey(((j) b.this.o).getContext())).a();
                }
            });
            this.g.a(goodsSpu2, i);
            com.sankuai.waimai.store.expose.v2.entity.b bVar = this.d;
            bVar.e = this.d.f + CommonConstant.Symbol.UNDERLINE + i;
            this.d.a("spu_id", Long.valueOf(goodsSpu2.id));
            com.sankuai.waimai.store.expose.v2.entity.b bVar2 = this.e;
            bVar2.e = this.e.f + CommonConstant.Symbol.UNDERLINE + i;
            this.e.a("spu_id", Long.valueOf(goodsSpu2.id));
            if (this.c == RecommendPairBlock.d) {
                this.f.a("spu_id", Long.valueOf(goodsSpu2.id));
                this.f.a("index", Integer.valueOf(i));
                this.e.a("index", Integer.valueOf(i));
                this.e.a("activity_tag", GoodsSpu.ITEM_COLLECTION_REDEEM);
            }
        }

        public b(Map<String, Object> map, int i, int i2, GoodsSpu goodsSpu) {
            Object[] objArr = {map, Integer.valueOf(i), Integer.valueOf(i2), goodsSpu};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a99e1df941b6510f7031a9626013fa8a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a99e1df941b6510f7031a9626013fa8a");
                return;
            }
            this.b = map;
            this.c = i;
            this.h = i2;
            this.i = goodsSpu;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec5e05b69c777e8325b7d1946856c69d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec5e05b69c777e8325b7d1946856c69d");
                return;
            }
            SGlRecommendPairCell sGlRecommendPairCell = this.g;
            CellUiConfig a2 = CellUiConfig.a();
            a2.d = 1;
            sGlRecommendPairCell.setCellConfig(a2);
            this.g.setPoiHelper(((j) this.o).p());
            this.d = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_4lfrlshp_mv", view);
            this.f = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_9v5u5z2a_mv", view);
            this.e = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_6szx4iuj_mv", this.g.h());
            this.f.b(this.b);
            this.e.b(this.b);
            if (((j) this.o).getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                if (this.c == RecommendPairBlock.d) {
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) ((j) this.o).getContext(), this.f);
                } else {
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) ((j) this.o).getContext(), this.d);
                }
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) ((j) this.o).getContext(), this.e);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab68b1a3970776b1228fc86051e4b26", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab68b1a3970776b1228fc86051e4b26");
            }
            int unused = SGlRecommendPairCell.f = this.c;
            int unused2 = SGlRecommendPairCell.g = this.h;
            GoodsSpu unused3 = SGlRecommendPairCell.h = this.i;
            this.g = new SGlRecommendPairCell(viewGroup.getContext());
            if (this.c == RecommendPairBlock.d && this.h == 1) {
                this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            } else {
                this.g.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            return this.g;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class SGlRecommendPairCell extends MultiCellView {
        public static ChangeQuickRedirect a;
        private static int f;
        private static int g;
        private static GoodsSpu h;
        private SCPriceView d;
        private String e;

        public SGlRecommendPairCell(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "053e025526f0ceedd29a2fa8c7009564", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "053e025526f0ceedd29a2fa8c7009564");
            }
        }

        public SGlRecommendPairCell(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508bff5f2e7b6398ca2604b91d0c298d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508bff5f2e7b6398ca2604b91d0c298d");
            }
        }

        public final View h() {
            return this.E;
        }

        @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f456f99469dbbaf614866a5b7863e5ec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f456f99469dbbaf614866a5b7863e5ec");
                return;
            }
            super.c();
            this.E = (FlashPrice) this.n.findViewById(R.id.flash_price);
            this.d = (SCPriceView) this.n.findViewById(R.id.id_sc_price_view);
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
            View findViewById2 = findViewById(R.id.sg_recommend_add_x_product_container);
            int a3 = com.sankuai.shangou.stone.util.h.a(getContext(), 12.0f);
            int a4 = com.sankuai.shangou.stone.util.h.a(getContext(), 4.0f);
            findViewById2.setPadding(a3, a4, a3, a4);
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.SGlRecommendPairCell.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77390ac316b933b3c5c37797fd8df07a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77390ac316b933b3c5c37797fd8df07a");
                    } else {
                        SGlRecommendPairCell.this.b(SGlRecommendPairCell.this.C());
                    }
                }
            });
        }

        @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098948224e348d309f8480eb910e052b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098948224e348d309f8480eb910e052b");
                return;
            }
            super.d();
            if (this.ae.unifyPrice != null && this.d != null) {
                com.sankuai.shangou.stone.util.u.c(this.E, this.O);
                com.sankuai.shangou.stone.util.u.a((View) this.d, 0);
                this.d.a(2, this.ae.unifyPrice, 28, this.ae.getStatus() > 0);
                return;
            }
            com.sankuai.shangou.stone.util.u.a((View) this.d, 8);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa8cd491f07d0236ce9f6d1c893690d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa8cd491f07d0236ce9f6d1c893690d8");
            } else if (com.sankuai.shangou.stone.util.p.a(this.ae, this.E)) {
            } else {
                if (this.ae.unifyPrice == null || this.d == null) {
                    switch (this.ae.getStatus()) {
                        case 1:
                        case 2:
                            this.E.setPriceTheme(2);
                            break;
                        default:
                            this.E.setPriceTheme(0);
                            break;
                    }
                    ImageView imageView = (ImageView) this.n.findViewById(R.id.im_sku_exchange_tag);
                    if (f == RecommendPairBlock.d && this.ae != null && com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.getSkus(), 0) != null) {
                        com.sankuai.shangou.stone.util.u.a(imageView);
                        this.E.setPrice(this.ae.exchangePriceStr);
                        return;
                    }
                    com.sankuai.shangou.stone.util.u.c(imageView);
                    this.E.setPrice(com.sankuai.shangou.stone.util.i.a(this.ae.getMinPrice()));
                }
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "034b7678858a7ac7d96b9c0ecbd2d9f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "034b7678858a7ac7d96b9c0ecbd2d9f8");
            } else if (com.sankuai.shangou.stone.util.p.a(this.ae)) {
            } else {
                if (this.ae.unifyPrice == null || this.d == null) {
                    com.sankuai.waimai.store.util.s.a(this.ae, new s.a<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.SGlRecommendPairCell.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.util.s.a
                        public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                            Object[] objArr2 = {goodsSpu};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6164688c1230380c424e7374ceafebde", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6164688c1230380c424e7374ceafebde");
                                return;
                            }
                            com.sankuai.shangou.stone.util.u.c(SGlRecommendPairCell.this.O);
                            if (com.sankuai.shangou.stone.util.p.a(SGlRecommendPairCell.this.E)) {
                                return;
                            }
                            if (SGlRecommendPairCell.f != RecommendPairBlock.d || SGlRecommendPairCell.this.ae == null || com.sankuai.shangou.stone.util.a.a((List<Object>) SGlRecommendPairCell.this.ae.getSkus(), 0) == null) {
                                if (!com.sankuai.shangou.stone.util.i.e(Double.valueOf(SGlRecommendPairCell.this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
                                    SGlRecommendPairCell.this.E.setOriginPriceVisibility(8);
                                    return;
                                } else {
                                    SGlRecommendPairCell.this.E.setOriginPrice(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(SGlRecommendPairCell.this.ae.getOriginPrice())));
                                    return;
                                }
                            }
                            GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) SGlRecommendPairCell.this.ae.getSkus(), 0);
                            if (goodsSku == null || !com.sankuai.shangou.stone.util.i.e(Double.valueOf(goodsSku.getOriginPrice()), Double.valueOf(0.0d))) {
                                SGlRecommendPairCell.this.E.setOriginPriceVisibility(8);
                            } else {
                                SGlRecommendPairCell.this.E.setOriginPrice(com.sankuai.shangou.stone.util.i.a(goodsSku.getOriginPrice()));
                            }
                        }

                        @Override // com.sankuai.waimai.store.util.s.a
                        public final /* synthetic */ void b(GoodsSpu goodsSpu) {
                            Object[] objArr2 = {goodsSpu};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "556cc70fad26fb3e40ecd1c1902e9af4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "556cc70fad26fb3e40ecd1c1902e9af4");
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
        }

        @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView
        public final void k() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54a3a0144f77efa7fd8ca8f1d3f2d30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54a3a0144f77efa7fd8ca8f1d3f2d30");
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

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void s() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a561d67f3f3e983f9c76d7834f7f8a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a561d67f3f3e983f9c76d7834f7f8a0");
                return;
            }
            super.s();
            if (f == RecommendPairBlock.d) {
                try {
                    m();
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void b(boolean z) {
            int i;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea7da2296fed816f978af4a3aa037107", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea7da2296fed816f978af4a3aa037107");
                return;
            }
            if (f == RecommendPairBlock.d) {
                try {
                    i = m();
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                    i = 0;
                }
            } else {
                i = 1;
            }
            if (i != 1) {
                am.a(getContext(), this.e);
            } else if (z) {
                if (!com.sankuai.shangou.stone.util.p.a(this.aj)) {
                    this.aj.a(this.ae, this.ag);
                }
                if (com.sankuai.shangou.stone.util.p.a(this.ak)) {
                    return;
                }
                this.ak.g(this.ae, this.ag);
            } else {
                if (!com.sankuai.shangou.stone.util.p.a(this.aj) && this.ae.mSaleType == 0) {
                    this.aj.a(this.ae, this.F, getGoodImageRatio(), this.ag);
                }
                if (com.sankuai.shangou.stone.util.p.a(this.ak)) {
                    return;
                }
                this.ak.e(this.ae, this.ag);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x018a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int m() {
            /*
                Method dump skipped, instructions count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.SGlRecommendPairCell.m():int");
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public int getLayoutId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92156736167291cfa24535962b23fa3a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92156736167291cfa24535962b23fa3a")).intValue() : f == RecommendPairBlock.d ? g == 1 ? R.layout.wm_st_goods_list_item_sku_exchange_1 : g == 2 ? R.layout.wm_st_goods_list_item_sku_exchange_2 : R.layout.wm_st_goods_list_item_sku_exchange : R.layout.wm_st_goods_list_item_recommend_pair;
        }
    }
}
