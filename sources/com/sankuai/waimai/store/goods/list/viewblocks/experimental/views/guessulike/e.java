package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.d;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.PoiCommonMachListItem;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsLogField;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessTagResponse;
import com.sankuai.waimai.store.repository.model.PoiGuessULikeSpuTag;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.j;
import com.sankuai.waimai.store.util.k;
import com.sankuai.waimai.store.widgets.layoutmanager.FixedStaggeredGridLayoutManager;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a, com.sankuai.waimai.store.cell.core.b, com.sankuai.waimai.store.cell.core.c, com.sankuai.waimai.store.goods.list.viewblocks.content.view.a, c, n, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    SCRecyclerView b;
    NetInfoLoadView c;
    d d;
    f e;
    @NonNull
    PoiGuessULikeSpuTag f;
    final com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a g;
    com.sankuai.waimai.store.platform.domain.manager.poi.a h;
    private View i;
    private View j;
    private com.sankuai.waimai.store.goods.list.delegate.d k;
    private final com.sankuai.waimai.store.pagingload.c<d.a, d.a> l;
    private final a.InterfaceC1262a<d.a, d.a> m;

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
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

    @Override // com.sankuai.waimai.store.cell.core.c
    public final void d(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    @Override // com.sankuai.waimai.store.cell.core.c
    public final void e(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c
    public final com.sankuai.waimai.store.cell.core.b f() {
        return this;
    }

    @Override // com.sankuai.waimai.store.cell.core.c
    public final void f(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c
    public final com.sankuai.waimai.store.cell.core.c g() {
        return this;
    }

    @Override // com.sankuai.waimai.store.cell.core.c
    public final void g(GoodsSpu goodsSpu, int i) {
    }

    public e(@NonNull Context context, com.sankuai.waimai.store.goods.list.delegate.e eVar, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar, @NonNull PoiGuessULikeSpuTag poiGuessULikeSpuTag) {
        super(context);
        Object[] objArr = {context, eVar, aVar, poiGuessULikeSpuTag};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68396cea2e37bdd0d405d9e14da96391", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68396cea2e37bdd0d405d9e14da96391");
            return;
        }
        this.l = new com.sankuai.waimai.store.pagingload.c<>();
        this.m = new a.InterfaceC1262a<d.a, d.a>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.e.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.InterfaceC1262a
            public final /* synthetic */ d.a a(@NonNull d.a aVar2) {
                d.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb82204c1e411d1eab45b49ea5edf9a0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (d.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb82204c1e411d1eab45b49ea5edf9a0");
                }
                if (aVar3.c != null) {
                    if (e.this.h != null) {
                        String a2 = i.a(e.this.h.b.addition);
                        if (!t.a(a2)) {
                            aVar3.c.mBaseModuleDesc.jsonData.put("additional_info", com.sankuai.waimai.mach.utils.b.a(a2));
                        }
                    }
                    aVar3.c.recycleMachDataWrapper = e.this.g.g().a(aVar3.c.mBaseModuleDesc, aVar3.c.index);
                }
                return aVar3;
            }
        };
        this.f = poiGuessULikeSpuTag;
        this.k = eVar;
        this.g = aVar;
        this.h = eVar.d();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e53f8bd5bcc5d31717aa55e584215e32", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e53f8bd5bcc5d31717aa55e584215e32") : layoutInflater.inflate(R.layout.wm_sc_poi_guess_u_like_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9bd5112ba30a1b7b20cb3d92065033b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9bd5112ba30a1b7b20cb3d92065033b");
            return;
        }
        super.onViewCreated();
        this.c = (NetInfoLoadView) findView(R.id.layout_net_info_sub);
        this.b = (SCRecyclerView) findView(R.id.wm_st_poi_channel_list);
        this.c.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbcfdb2b2b9a851bb83acd99ca4cb8a3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbcfdb2b2b9a851bb83acd99ca4cb8a3");
                } else {
                    e.this.e.a(e.this.f);
                }
            }
        });
        this.b.setLayoutManager(l());
        this.d = new d(this.k.k(), this.g, this);
        this.b.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) this.d);
        this.i = LayoutInflater.from(this.mContext).inflate(R.layout.wm_st_view_poi_shop_footer, (ViewGroup) null, false);
        this.j = LayoutInflater.from(this.mContext).inflate(R.layout.wm_st_poi_market_layout_footer_no_more, (ViewGroup) null, false);
        this.j.setPadding(0, com.sankuai.shangou.stone.util.h.a(this.mContext, 5.0f), 0, 0);
        this.b.setBottomMargin(com.sankuai.shangou.stone.util.h.a(this.mContext, 80.0f));
        this.b.setOnScrollToBottomOrTopListener(this);
        this.b.a(0, this.i);
        this.b.a(1, this.j);
        u.c(this.i, this.j);
        final int c = com.sankuai.waimai.store.util.b.c(getContext(), R.dimen.wm_sc_common_dimen_3);
        this.b.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.e.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5965a3f7f2c4c5831fb91461a42fbcf8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5965a3f7f2c4c5831fb91461a42fbcf8");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                if (!(recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager.b) view.getLayoutParams()).b) {
                    return;
                }
                rect.top = 0;
                rect.bottom = c * 2;
            }
        });
        com.sankuai.waimai.store.order.a.e().a(this);
        this.e = new f(this);
        this.e.a(this.f);
        u.a(this.c);
        this.c.b();
    }

    private RecyclerView.LayoutManager k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603200d7e71248c8aa24fec5ce07cc21", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.LayoutManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603200d7e71248c8aa24fec5ce07cc21") : new FixedStaggeredGridLayoutManager(2, 1);
    }

    private RecyclerView.LayoutManager l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e6ca85dd3ab7e3e6c62af1e93e5ee0", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.LayoutManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e6ca85dd3ab7e3e6c62af1e93e5ee0");
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 2);
        gridLayoutManager.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.e.3
            public static ChangeQuickRedirect b;

            @Override // android.support.v7.widget.GridLayoutManager.c
            public final int a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a7ee49b7d30ecef459a86dfb69802fd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a7ee49b7d30ecef459a86dfb69802fd")).intValue() : e.this.b.a(i) < 0 ? 2 : 1;
            }
        };
        return gridLayoutManager;
    }

    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64373e8477bbea60705345eb88a97ab4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64373e8477bbea60705345eb88a97ab4")).intValue() : this.g.h();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5052e3dd70c53e0be105c80864c0f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5052e3dd70c53e0be105c80864c0f8");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void a(MarketGuessResponse marketGuessResponse) {
        Object[] objArr = {marketGuessResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ee1c601d08831c367a919cfa2cb2c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ee1c601d08831c367a919cfa2cb2c3");
        } else if (marketGuessResponse == null) {
        } else {
            a(a(marketGuessResponse.c, marketGuessResponse.d), false);
        }
    }

    private List<d.a> a(List<GoodsSpu> list, List<BaseModuleDesc> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49b1a0a00e65012ba1423851f447a3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49b1a0a00e65012ba1423851f447a3d");
        }
        LinkedList linkedList = new LinkedList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2)) {
            int itemCount = this.d.getItemCount();
            int c = com.sankuai.shangou.stone.util.a.c(list2);
            for (int i = 0; i < c; i++) {
                PoiCommonMachListItem poiCommonMachListItem = new PoiCommonMachListItem();
                poiCommonMachListItem.mBaseModuleDesc = (BaseModuleDesc) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, i);
                poiCommonMachListItem.index = itemCount + i;
                linkedList.add(new d.a(null, poiCommonMachListItem));
            }
            if (!(this.b.getLayoutManager() instanceof FixedStaggeredGridLayoutManager)) {
                this.b.setLayoutManager(k());
            }
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (GoodsSpu goodsSpu : list) {
                linkedList.add(new d.a(goodsSpu, null));
            }
            if (!(this.b.getLayoutManager() instanceof GridLayoutManager)) {
                this.b.setLayoutManager(l());
            }
        }
        return linkedList;
    }

    public final void a(MarketGuessTagResponse marketGuessTagResponse) {
        Object[] objArr = {marketGuessTagResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88f8ea1ea87ad7599165c57397b3d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88f8ea1ea87ad7599165c57397b3d04");
        } else if (marketGuessTagResponse == null) {
        } else {
            a(a(marketGuessTagResponse.g, marketGuessTagResponse.h), false);
        }
    }

    private void a(List<d.a> list, boolean z) {
        Object[] objArr = {list, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf13d142a2999bc0d1e68c72e3e7ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf13d142a2999bc0d1e68c72e3e7ba1");
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            a.b bVar = new a.b<d.a, d.a>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.e.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.pagingload.a.b
                public final void b(List<d.a> list2, int i) {
                    Object[] objArr2 = {list2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1772975925cd3d5fed378b48cb0ee32d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1772975925cd3d5fed378b48cb0ee32d");
                    } else {
                        super.b(list2, i);
                    }
                }

                @Override // com.sankuai.waimai.store.pagingload.a.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e6e819f33949dadf11cea71d073d3ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e6e819f33949dadf11cea71d073d3ff");
                    } else {
                        super.a();
                    }
                }

                @Override // com.sankuai.waimai.store.pagingload.a.b
                public final void a(List<d.a> list2, int i) {
                    Object[] objArr2 = {list2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38ea2f6e508978464b69c028f84299d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38ea2f6e508978464b69c028f84299d5");
                        return;
                    }
                    super.a(list2, i);
                    if (com.sankuai.waimai.store.util.b.a(e.this.getContext())) {
                        return;
                    }
                    e.this.c.e();
                    d dVar = e.this.d;
                    boolean z2 = r2;
                    Object[] objArr3 = {list2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "d197b9904e914fb4de83de8acf38cb4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "d197b9904e914fb4de83de8acf38cb4c");
                    } else if (z2) {
                        dVar.b_(list2);
                    } else {
                        dVar.c_(list2);
                    }
                }

                @Override // com.sankuai.waimai.store.pagingload.a.b
                public final void a(int i, @Nullable Throwable th, List<d.a> list2) {
                    Object[] objArr2 = {Integer.valueOf(i), th, list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "628b88d371d9eb30fdece0b8550ddfd8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "628b88d371d9eb30fdece0b8550ddfd8");
                    } else {
                        super.a(i, th, list2);
                    }
                }
            };
            com.sankuai.waimai.store.pagingload.c<d.a, d.a> cVar = this.l;
            cVar.g = this.m;
            cVar.h = bVar;
            cVar.a(list);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bh_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4208cf692b086d822a6fe3a951b8dbe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4208cf692b086d822a6fe3a951b8dbe1");
        } else {
            u.a(this.i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bi_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50d3acdbd4835f52dbdc58e533fb66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50d3acdbd4835f52dbdc58e533fb66f");
        } else {
            u.c(this.i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bj_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdebddb2e0cb34502056040c458c79dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdebddb2e0cb34502056040c458c79dc");
        } else {
            u.a(this.j);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final com.sankuai.waimai.store.goods.list.delegate.d d() {
        return this.k;
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b065457fbbb5de60895d1e8c67da51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b065457fbbb5de60895d1e8c67da51");
        } else if (p.a(goodsSpu) || this.h == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.k.b(), "b_b166zz9x").a(this.k.k()).a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu)).a("poi_id", this.h.d()).a("spu_id", Long.valueOf(goodsSpu.getId())).a("product_id", Long.valueOf(goodsSpu.getId())).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(k.b(this.h.b, goodsSpu) != null ? 1 : 0)).a("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0)).a("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "").a("food_activity_type", Integer.valueOf(goodsSpu.activityType)).a("tab_name", this.f.tagName).a("stid", j.a(goodsSpu.getPicture())).a();
            com.sankuai.waimai.store.router.g.a(this.mContext, goodsSpu, this.h.b, hVar);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c67746d6392251d2379abdf5aa5d91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c67746d6392251d2379abdf5aa5d91");
            return;
        }
        this.k.a(this.k.k(), goodsSpu, null);
        if (p.a(goodsSpu)) {
            return;
        }
        GoodsLogField goodLogField = goodsSpu.getGoodLogField();
        String str = "-999";
        if (goodLogField != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodLogField.getLabelTypeArrayList())) {
            str = goodLogField.getLabelTypeList();
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.k.k(), "b_waimai_r4fdreqx_mc").a("poi_id", String.valueOf(this.k.d().d())).a("product_id", Long.valueOf(goodsSpu.getId())).a("spu_id", Long.valueOf(goodsSpu.getId())).a("tag", str).a();
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a40da0d6772f4c3c5381d122deca871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a40da0d6772f4c3c5381d122deca871");
        } else if (p.a(goodsSpu) || this.h == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.k.b(), "b_iaj11du9").a(this.k.k()).a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu)).a("poi_id", this.h.d()).a("product_id", Long.valueOf(goodsSpu.getId())).a("spu_id", Long.valueOf(goodsSpu.getId())).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(k.b(this.h.b, goodsSpu) != null ? 1 : 0)).a("tab_name", this.f.tagName).a("stid", j.a(goodsSpu.getPicture())).a();
            this.k.a(this.k.k(), view, this.h.d(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a6345356ea4addc979ef85ffae4b05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a6345356ea4addc979ef85ffae4b05");
            return;
        }
        super.onDestroy();
        this.l.c();
        com.sankuai.waimai.store.order.a.e().b(this);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4de2dc29fdc431073b76310dab4d2596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4de2dc29fdc431073b76310dab4d2596");
            return;
        }
        f fVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "ec7abac327d10502b7e47f14a7bbf397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "ec7abac327d10502b7e47f14a7bbf397");
        } else if (fVar.e) {
            fVar.b.bh_();
            fVar.a();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b30f065fb122475741c9f40c7d84c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b30f065fb122475741c9f40c7d84c6");
        } else if (this.d != null) {
            this.d.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a h() {
        return this.h;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c
    @NonNull
    public final PoiGuessULikeSpuTag i() {
        return this.f;
    }
}
