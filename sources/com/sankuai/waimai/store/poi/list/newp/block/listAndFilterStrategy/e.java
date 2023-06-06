package com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy;

import android.graphics.Color;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.VisibleChangeEvent;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.h;
import com.sankuai.waimai.store.repository.model.CardScenes;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.SpuInfo;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.i;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.layoutmanager.FixedStaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends a {
    public static ChangeQuickRedirect s;
    private com.sankuai.waimai.store.poilist.a A;
    com.sankuai.waimai.store.poi.list.newp.adapter.c t;
    ImageView u;
    com.sankuai.waimai.store.poi.list.newp.block.a v;
    com.sankuai.waimai.store.poilist.mach.d w;
    private Space x;
    private int y;
    private com.sankuai.waimai.store.pagingload.c<f, f> z;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    public static /* synthetic */ void a(e eVar, List list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "a3795c42ae5b6541f729f81685aa4f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "a3795c42ae5b6541f729f81685aa4f39");
            return;
        }
        int min = Math.min(50, com.sankuai.shangou.stone.util.a.a(list));
        int a = z ? eVar.t.a() : 0;
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                f fVar = (f) list.get(i);
                if (a(fVar)) {
                    fVar.j = eVar.w.a(fVar.i, i + a);
                }
            }
        }
    }

    public static /* synthetic */ void a(e eVar, boolean z, PoiVerticalityDataResponse poiVerticalityDataResponse, FilterConditionResponse filterConditionResponse, List list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), poiVerticalityDataResponse, filterConditionResponse, list};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "2803e5cb32c5ff259ebc500d11d271d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "2803e5cb32c5ff259ebc500d11d271d7");
            return;
        }
        if (z) {
            eVar.f.e();
            eVar.a(poiVerticalityDataResponse, list, filterConditionResponse);
            if (!eVar.c.l()) {
                eVar.a(poiVerticalityDataResponse, (i.a) null);
            }
        } else {
            eVar.t.b((List<f>) list);
        }
        u.c(eVar.g);
    }

    public e(com.sankuai.waimai.store.widgets.filterbar.home.controller.c cVar, com.sankuai.waimai.store.param.a aVar, int i) {
        super(cVar, aVar, 1);
        Object[] objArr = {cVar, aVar, 1};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611e16bb7ddbcb977bf9bf054afe21eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611e16bb7ddbcb977bf9bf054afe21eb");
            return;
        }
        this.z = new com.sankuai.waimai.store.pagingload.c<>();
        this.A = new com.sankuai.waimai.store.poilist.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poilist.a
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "918e9de6232e325d4cecdb6dd4bac736", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "918e9de6232e325d4cecdb6dd4bac736");
                    return;
                }
                int a2 = q.a((RecyclerView) e.this.d);
                if (e.this.v.isVisible()) {
                    if (a2 > 1) {
                        e.this.e.b(i2);
                    }
                } else if (a2 > 0) {
                    e.this.e.b(i2);
                }
            }

            @Override // com.sankuai.waimai.store.poilist.a
            public final void b(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "baf101fd032b74cbf51e8d542fd97fea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "baf101fd032b74cbf51e8d542fd97fea");
                } else {
                    e.this.e.b(-i2);
                }
            }

            @Override // com.sankuai.waimai.store.poilist.a, android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "944ed19e28a06c1b3e54842fbbddb0e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "944ed19e28a06c1b3e54842fbbddb0e4");
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                    int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                    int[] findFirstCompletelyVisibleItemPositions = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(null);
                    if (e.this.v.isVisible()) {
                        e.this.e.b(findFirstVisibleItemPositions[0] > 0);
                        if (findFirstVisibleItemPositions[0] > 0) {
                            e.this.u.setVisibility(4);
                        } else {
                            e.this.u.setVisibility(0);
                            ViewGroup.LayoutParams layoutParams = e.this.u.getLayoutParams();
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && e.this.v.getView().getParent() != null) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((View) e.this.v.getView().getParent()).getTop();
                                e.this.u.setLayoutParams(layoutParams);
                            }
                        }
                    }
                    View childAt = recyclerView.getChildAt(0);
                    e.this.b.a(new h(findFirstVisibleItemPositions[0] / 2, findLastVisibleItemPositions[0] / 2, findFirstCompletelyVisibleItemPositions[0] / 2, childAt != null ? childAt.getTop() : 0));
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33819a66a9c30edaaae77dbbe3cf03b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33819a66a9c30edaaae77dbbe3cf03b7");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                e.this.b.a(new com.sankuai.waimai.store.poi.list.newp.block.rxevent.i(i2));
                if (i2 == 0) {
                    com.meituan.android.bus.a.a().c(new VisibleChangeEvent(0, true, e.this.c.y, false, true));
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e726e5c681d8c9fbf77480a6485da15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e726e5c681d8c9fbf77480a6485da15");
            return;
        }
        super.a(view);
        if (this.c.u()) {
            this.y = j.h().a(SCConfigPath.AGILE_DATA_PROCESSOR_HOME_FLOWER_SPU, 0);
        } else {
            this.y = j.h().a(SCConfigPath.AGILE_DATA_PROCESSOR_CHANNEL_FLOWER_SPU, 0);
        }
        if (w()) {
            com.sankuai.waimai.store.pagingload.c<f, f> cVar = this.z;
            cVar.e = "home_flower_spu";
            cVar.f = this.y;
        }
        this.u = (ImageView) view.findViewById(R.id.top_bg);
        if (this.c.ac != null) {
            this.w = new com.sankuai.waimai.store.poilist.mach.d(this.b.h(), this.c, this.c.ac);
            this.c.ac = null;
        } else {
            this.w = new com.sankuai.waimai.store.poilist.mach.d(this.b.h(), this.c, this.p);
        }
        this.x = new Space(this.b.h());
        this.v = new com.sankuai.waimai.store.poi.list.newp.block.a(this.b.h());
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(com.sankuai.waimai.store.param.a aVar, @NonNull final PoiVerticalityDataResponse poiVerticalityDataResponse, boolean z) {
        final ArrayList arrayList;
        Object[] objArr = {aVar, poiVerticalityDataResponse, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127be1ba0c7a4a35d5c45e5515fbe47a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127be1ba0c7a4a35d5c45e5515fbe47a");
            return;
        }
        Object[] objArr2 = {poiVerticalityDataResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0030128d84a75660338226ab7f319598", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0030128d84a75660338226ab7f319598");
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((this.c.K == 1 || this.c.K == 3 || this.c.m()) && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) {
                a(poiVerticalityDataResponse, poiVerticalityDataResponse.poiCardInfos, poiVerticalityDataResponse.spuQuickFilter, arrayList2, aVar);
            }
            arrayList = arrayList2;
        }
        a(arrayList);
        u.c(this.f);
        Object[] objArr3 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect3 = s;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff888a006ca3964f58f4747036a7f63d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff888a006ca3964f58f4747036a7f63d");
        } else if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.spuQuickFilter != null && poiVerticalityDataResponse.spuQuickFilter.filterData != null) {
            this.c.az.put(this.c.f, Boolean.valueOf(!com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.spuQuickFilter.filterData.favourItems)));
        } else {
            this.c.az.put(this.c.f, Boolean.FALSE);
        }
        final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("supermarket_mach_preload_tag");
        if (this.b.b(aVar)) {
            if (this.c.l()) {
                a(poiVerticalityDataResponse, new i.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.i.a
                    public final void a(final FilterConditionResponse filterConditionResponse) {
                        Object[] objArr4 = {filterConditionResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5ac983fc5f05b182fa5d7a6eaab1be8e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5ac983fc5f05b182fa5d7a6eaab1be8e");
                            return;
                        }
                        if (filterConditionResponse != null && filterConditionResponse.cardScenes != null && com.sankuai.shangou.stone.util.a.a((List) filterConditionResponse.cardScenes.scenes) >= 4) {
                            e eVar = e.this;
                            List list = arrayList;
                            Object[] objArr5 = {list, filterConditionResponse};
                            ChangeQuickRedirect changeQuickRedirect5 = e.s;
                            if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "f2b8f5840014da5dbd1a8f96d133d2ce", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "f2b8f5840014da5dbd1a8f96d133d2ce");
                            } else {
                                CardScenes cardScenes = filterConditionResponse.cardScenes;
                                List<CardScenes.Position> list2 = cardScenes.positions;
                                int a2 = com.sankuai.shangou.stone.util.a.a(list);
                                for (int size = list2.size() - 1; size >= 0; size--) {
                                    CardScenes.Position position = list2.get(size);
                                    if (position != null && position.cardIndex < a2) {
                                        f fVar = new f();
                                        fVar.f = position.cardTitle;
                                        fVar.h = cardScenes.scenes;
                                        fVar.g = cardScenes.sceneScheme;
                                        fVar.d = 8;
                                        list.add(position.cardIndex, fVar);
                                    }
                                }
                            }
                        }
                        if (e.this.w()) {
                            createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v1");
                            e.this.a(true, (List<f>) arrayList, poiVerticalityDataResponse, filterConditionResponse);
                        } else {
                            createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v2");
                            e.this.w.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "76177d214e0fdac07f96acc4bedcaa9f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "76177d214e0fdac07f96acc4bedcaa9f");
                                    } else {
                                        e.a(e.this, arrayList, false);
                                    }
                                }
                            }, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.1.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "641b6c52de67debb1e9032b5d5c8cd73", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "641b6c52de67debb1e9032b5d5c8cd73");
                                        return;
                                    }
                                    e.this.f.e();
                                    u.c(e.this.g);
                                    e.this.a(poiVerticalityDataResponse, arrayList, filterConditionResponse);
                                }
                            });
                        }
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                    }
                });
            } else {
                if (w()) {
                    createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v1");
                    a(true, arrayList, poiVerticalityDataResponse, poiVerticalityDataResponse.spuQuickFilter);
                } else {
                    createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v2");
                    this.w.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "41dae0492d245f153a0cadb3bad7ddab", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "41dae0492d245f153a0cadb3bad7ddab");
                            } else {
                                e.a(e.this, arrayList, false);
                            }
                        }
                    }, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cba8bbb2ff200089d16b6d76506a9943", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cba8bbb2ff200089d16b6d76506a9943");
                                return;
                            }
                            e.this.f.e();
                            u.c(e.this.g);
                            e.this.a(poiVerticalityDataResponse, arrayList, poiVerticalityDataResponse.spuQuickFilter);
                            e.this.a(poiVerticalityDataResponse, (i.a) null);
                        }
                    });
                }
                com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
            }
        } else if (w()) {
            a(false, arrayList, poiVerticalityDataResponse, (FilterConditionResponse) null);
        } else {
            this.w.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0ecd82ea41648fb33f1b73675fd73a7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0ecd82ea41648fb33f1b73675fd73a7e");
                    } else {
                        e.a(e.this, arrayList, true);
                    }
                }
            }, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "458a78baafffb122f3828444ae2554cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "458a78baafffb122f3828444ae2554cc");
                        return;
                    }
                    e.this.t.b(arrayList);
                    u.c(e.this.g);
                }
            });
        }
        g();
        a(poiVerticalityDataResponse, false);
        a(this.t, poiVerticalityDataResponse);
    }

    boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d19127b4391ebf613f2c7c9aff2e30fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d19127b4391ebf613f2c7c9aff2e30fe")).booleanValue() : this.y > 0 && com.sankuai.waimai.store.pagingload.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z, List<f> list, final PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull final FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list, poiVerticalityDataResponse, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1011d83b2169c2a2d2ce31e64f4bcfe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1011d83b2169c2a2d2ce31e64f4bcfe9");
            return;
        }
        if (this.c != null) {
            if (this.c.av != null) {
                this.c.av.recordStep("agile_process_start");
            }
            if (this.c.ax != null) {
                this.c.ax.recordStep("agile_process_start");
            }
        }
        int min = Math.min(50, com.sankuai.shangou.stone.util.a.a((List) list));
        ArrayList arrayList = new ArrayList();
        int a = z ? 0 : this.t.a();
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                if (a(fVar)) {
                    fVar.e = i + a;
                    arrayList.add(fVar);
                }
            }
        }
        com.sankuai.waimai.store.pagingload.c<f, f> cVar = this.z;
        cVar.g = new a.InterfaceC1262a<f, f>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.InterfaceC1262a
            public final /* synthetic */ f a(@NonNull @NotNull f fVar2) {
                f fVar3 = fVar2;
                Object[] objArr2 = {fVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0f3009e75e93229db65b42f55eb902f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0f3009e75e93229db65b42f55eb902f");
                }
                fVar3.j = e.this.w.a(fVar3.i, fVar3.e);
                return fVar3;
            }
        };
        cVar.h = new a.b<f, f>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(List<f> list2, int i2) {
                boolean z2 = false;
                Object[] objArr2 = {list2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e098f843d15c5843cdf26a9fd464f31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e098f843d15c5843cdf26a9fd464f31");
                    return;
                }
                super.a(list2, i2);
                if (i2 == 1 && e.this.c != null) {
                    if (e.this.c.av != null) {
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(e.this.c.av.recordStep("agile_process_complete"));
                    }
                    if (e.this.c.ax != null) {
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(e.this.c.ax.recordStep("agile_process_complete"));
                    }
                }
                if (z && i2 == 1) {
                    z2 = true;
                }
                e.a(e.this, z2, poiVerticalityDataResponse, filterConditionResponse, list2);
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(int i2, @Nullable @org.jetbrains.annotations.Nullable Throwable th, List<f> list2) {
                Object[] objArr2 = {Integer.valueOf(i2), th, list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4222f2ce9bc557de153cb1edd3c2fdc7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4222f2ce9bc557de153cb1edd3c2fdc7");
                    return;
                }
                super.a(i2, th, list2);
                e.a(e.this, z, poiVerticalityDataResponse, filterConditionResponse, list2);
            }
        };
        cVar.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, i.a aVar) {
        Object[] objArr = {poiVerticalityDataResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7547614b3e398585488daf5b4f1108ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7547614b3e398585488daf5b4f1108ca");
            return;
        }
        this.e.a(this.c.l());
        this.e.c();
        if (poiVerticalityDataResponse.spuQuickFilter != null && poiVerticalityDataResponse.spuQuickFilter.hasValuedFilterData()) {
            this.e.a(poiVerticalityDataResponse.spuQuickFilter, aVar);
        }
        this.e.a(poiVerticalityDataResponse.newUserCouponInfo);
        this.e.a(aVar);
        this.e.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, List<f> list, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {poiVerticalityDataResponse, list, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3824e9cf21cb6abfd3669a85150ea05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3824e9cf21cb6abfd3669a85150ea05");
            return;
        }
        this.t.a(list);
        a(list, filterConditionResponse);
        a(this.c.n != 3);
        this.h.a();
        if (this.r != null) {
            this.r.a();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42c467a54eafa947b8d7818d4386e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42c467a54eafa947b8d7818d4386e21");
            return;
        }
        c(z);
        c();
    }

    private static boolean a(@Nullable f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38cc118d33e32a7c08c09aa8cfad1bd8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38cc118d33e32a7c08c09aa8cfad1bd8")).booleanValue() : (fVar == null || fVar.i == null || fVar.i.moduleDesc == null || fVar.i.cardType != 2 || !"mach".equals(fVar.i.moduleDesc.nativeId) || t.a(fVar.i.moduleDesc.templateId)) ? false : true;
    }

    private void a(List<f> list, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {list, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ff5add095e9c0f8f6cf0a14070175b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ff5add095e9c0f8f6cf0a14070175b");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.b(list) && TextUtils.isEmpty(this.j) && TextUtils.isEmpty(this.k)) {
            this.f.a(this.b.h().getString(R.string.wm_sc_common_net_error_5), "", a(1), R.drawable.wm_sc_home_filter_empty, false, "", "");
            u.a(this.f);
            this.f.setBackgroundColor(Color.parseColor("#F5F5F5"));
        } else {
            if (this.t.g().size() == 0) {
                this.e.a(0);
                this.t.c(this.v.createView(this.d));
                LinearLayout linearLayout = new LinearLayout(this.b.h());
                this.x.setLayoutParams(new ViewGroup.LayoutParams(-1, 1000));
                linearLayout.addView(this.x);
                this.t.d(linearLayout);
                this.t.c(this.e.b());
                this.m.getView().setMinimumHeight(com.sankuai.shangou.stone.util.h.a(this.b.h(), 600.0f));
                this.t.c(this.m.getView());
                this.t.f(this.m.getView());
            }
            a(filterConditionResponse);
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                this.m.a(this.c, 1);
                this.t.e(this.m.getView());
                return;
            }
        }
        this.t.f(this.m.getView());
    }

    private void a(FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34264855aef1a808e764708e56677e89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34264855aef1a808e764708e56677e89");
            return;
        }
        if (filterConditionResponse != null && filterConditionResponse.cardScenes != null) {
            this.v.a(filterConditionResponse.cardScenes, this.c);
        } else {
            this.v.hide();
        }
        if (this.v.isVisible()) {
            this.t.e(this.v.getView());
            if (this.t.j() > 2 || this.t.j() == 0) {
                this.t.h((View) this.x.getParent());
            } else {
                ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.d.getLayoutManager();
                View childAt = staggeredGridLayoutManager.getChildAt(2 - staggeredGridLayoutManager.findFirstVisibleItemPositions(null)[0]);
                if (childAt != null) {
                    childAt.measure(0, 0);
                    layoutParams.height = childAt.getMeasuredHeight();
                } else {
                    int measuredHeight = this.d.getMeasuredHeight();
                    if (measuredHeight == 0) {
                        this.d.measure(0, 0);
                        measuredHeight = this.d.getMeasuredHeight();
                    }
                    layoutParams.height = measuredHeight;
                }
                this.x.setLayoutParams(layoutParams);
                this.t.g((View) this.x.getParent());
            }
            this.u.setVisibility(0);
            this.e.b().measure(0, 0);
            this.u.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a4a0192591c22a581b2a19deb7aa4b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a4a0192591c22a581b2a19deb7aa4b1");
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = e.this.u.getLayoutParams();
                    com.sankuai.waimai.store.poi.list.newp.block.a aVar = e.this.v;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.poi.list.newp.block.a.a;
                    layoutParams2.height = (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "038dd309bfdf0c8624d2bc063de2eb24", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "038dd309bfdf0c8624d2bc063de2eb24")).intValue() : ((int) (aVar.d * 0.75d)) + aVar.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_31)) + e.this.e.b().getMeasuredHeight();
                    e.this.u.requestLayout();
                }
            });
            return;
        }
        this.e.b(true);
        this.t.f(this.v.getView());
        this.t.h((View) this.x.getParent());
    }

    private void a(PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull List<PoiCardInfo> list, FilterConditionResponse filterConditionResponse, @NonNull List<f> list2, com.sankuai.waimai.store.param.a aVar) {
        int i;
        int i2 = 2;
        Object[] objArr = {poiVerticalityDataResponse, list, filterConditionResponse, list2, aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd9d53209599b5e1a41583315aff4de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd9d53209599b5e1a41583315aff4de7");
            return;
        }
        int i3 = 0;
        for (PoiCardInfo poiCardInfo : list) {
            if (poiCardInfo != null) {
                f fVar = new f();
                Object a = (poiCardInfo.moduleDesc == null || TextUtils.isEmpty(poiCardInfo.moduleDesc.planKey)) ? null : a(poiVerticalityDataResponse, poiCardInfo.moduleDesc.planKey);
                if (poiCardInfo.moduleDesc != null && 2 == poiCardInfo.cardType && "flower_feed_spu_card_old".equals(poiCardInfo.moduleDesc.nativeId) && poiCardInfo.moduleDesc.jsonData != null) {
                    fVar.b = (SpuInfo) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(poiCardInfo.moduleDesc.jsonData), SpuInfo.class);
                    fVar.c = null;
                    fVar.i = null;
                    fVar.d = 7;
                    if (fVar.b != null) {
                        list2.add(fVar);
                    }
                } else {
                    fVar.b = null;
                    fVar.c = null;
                    fVar.i = poiCardInfo;
                    BaseModuleDesc baseModuleDesc = fVar.i.moduleDesc;
                    com.sankuai.waimai.store.platform.shop.model.a a2 = a(poiVerticalityDataResponse);
                    if (baseModuleDesc != null && baseModuleDesc.jsonData != null && a != null) {
                        baseModuleDesc.jsonData.put("tile_config", a);
                    }
                    if (baseModuleDesc != null && baseModuleDesc.jsonData != null) {
                        baseModuleDesc.jsonData.put("rec_index", Integer.valueOf(baseModuleDesc.recIndex));
                    }
                    if (a(a2, baseModuleDesc, i3)) {
                        list2.add(fVar);
                    }
                    i3++;
                }
            }
        }
        if (this.d.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return;
        }
        if (this.c.m()) {
            i = 1;
            i2 = 1;
        } else {
            i = 1;
        }
        FixedStaggeredGridLayoutManager fixedStaggeredGridLayoutManager = new FixedStaggeredGridLayoutManager(i2, i);
        this.d.setPadding(0, 0, 0, 0);
        this.d.setLayoutManager(fixedStaggeredGridLayoutManager);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void c(boolean z) {
        int i = 1;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c4ce646dc315591f190d68b3afd74f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c4ce646dc315591f190d68b3afd74f9");
            return;
        }
        i = (!this.v.isVisible() || z) ? 0 : 0;
        if (this.d.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) this.d.getLayoutManager()).scrollToPositionWithOffset(i, 0);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb9fd0bca0f6af018e9d399f8f11e343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb9fd0bca0f6af018e9d399f8f11e343");
        } else if (this.v.isVisible() && (this.d.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
            ((StaggeredGridLayoutManager) this.d.getLayoutManager()).scrollToPositionWithOffset(1, 0);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final void a(PoiChannelBackgroundConfig poiChannelBackgroundConfig, PoiVerticalityDataResponse.Promotion promotion) {
        Object[] objArr = {poiChannelBackgroundConfig, promotion};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2524e47924a1c9521c7b88e92734ccaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2524e47924a1c9521c7b88e92734ccaf");
            return;
        }
        this.e.b(com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c, poiChannelBackgroundConfig));
        if (this.c.l()) {
            com.sankuai.waimai.store.widgets.filterbar.home.model.a a = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c, poiChannelBackgroundConfig);
            a.a(promotion, this.c);
            this.e.a(a);
            return;
        }
        com.sankuai.waimai.store.widgets.filterbar.home.model.a a2 = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c.F, poiChannelBackgroundConfig);
        a2.a(promotion, this.c);
        this.e.a(a2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4326dde7f8adf4d1e91a7ffb3d8160bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4326dde7f8adf4d1e91a7ffb3d8160bf");
            return;
        }
        this.t = new com.sankuai.waimai.store.poi.list.newp.adapter.c(this.b.h(), this.c, this.w);
        SCRecyclerView sCRecyclerView = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = s;
        sCRecyclerView.setAdapter(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a62523dcbc18d73321ca4169a87e19ab", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.j) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a62523dcbc18d73321ca4169a87e19ab") : new com.sankuai.waimai.store.widgets.recycler.j<com.sankuai.waimai.store.widgets.recycler.e>(this.t) { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.a
            public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.s sVar) {
                com.sankuai.waimai.store.widgets.recycler.e eVar = (com.sankuai.waimai.store.widgets.recycler.e) sVar;
                Object[] objArr3 = {eVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed9cbf2a4d7e4bccc35800d62cb2db5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed9cbf2a4d7e4bccc35800d62cb2db5a");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
                if (layoutParams instanceof StaggeredGridLayoutManager.b) {
                    StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
                    int itemViewType = eVar.getItemViewType();
                    if (itemViewType == -2147483647 || itemViewType == -2147483646) {
                        bVar.b = true;
                    } else {
                        bVar.b = false;
                    }
                }
            }
        });
        this.t.d(this.h);
        SCRecyclerView sCRecyclerView2 = this.d;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = s;
        sCRecyclerView2.addItemDecoration(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84b6195340cad8938f8af4e7bcaab2d7", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.f) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84b6195340cad8938f8af4e7bcaab2d7") : new RecyclerView.f() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e.11
            public static ChangeQuickRedirect a;
            public int b;
            public int c;

            {
                this.b = e.this.b.h().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
                this.c = e.this.b.h().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_1);
            }

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr4 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "29ca47362b4a04f686754b568947de67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "29ca47362b4a04f686754b568947de67");
                } else if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) view.getLayoutParams();
                    if (bVar.b) {
                        rect.left = 0;
                        rect.right = 0;
                        rect.top = e.this.c.be ? -10 : 0;
                        rect.bottom = 0;
                        return;
                    }
                    if (bVar.b() % 2 == 0) {
                        rect.left = this.b * 3;
                        rect.right = this.c;
                    } else {
                        rect.left = this.c;
                        rect.right = this.b * 3;
                    }
                    int i = this.c;
                    rect.bottom = i;
                    rect.top = i;
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef503a9c92e9414888abc960752c520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef503a9c92e9414888abc960752c520");
        } else {
            this.t.a((com.sankuai.waimai.store.widgets.recycler.c) new com.sankuai.waimai.store.poi.list.logreport.e(this.b.h(), this.c));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "535c69ae3b36c29624619d9737d295c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "535c69ae3b36c29624619d9737d295c3");
        } else {
            this.t.m();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d7ccb6e39c572738d0713b3b75a0e30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d7ccb6e39c572738d0713b3b75a0e30")).booleanValue() : this.t.e();
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final com.sankuai.waimai.store.poilist.a t() {
        return this.A;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820dec58ce585416a6a0980e215f1568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820dec58ce585416a6a0980e215f1568");
        } else {
            this.t.a((List<f>) null);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef8a93336a31a62d48cc2eab13af701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef8a93336a31a62d48cc2eab13af701");
            return;
        }
        super.m();
        if (this.w != null) {
            this.w.a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final /* bridge */ /* synthetic */ com.sankuai.waimai.store.widgets.recycler.a v() {
        return this.t;
    }
}
