package com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy;

import android.content.Context;
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
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.pagingload.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.VisibleChangeEvent;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.h;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.i;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.i;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import rx.functions.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect s;
    com.sankuai.waimai.store.poi.list.newp.adapter.c t;
    com.sankuai.waimai.store.poilist.mach.d u;
    int v;
    private RecyclerView.f w;
    private com.sankuai.waimai.store.pagingload.c<f, f> x;
    private com.sankuai.waimai.store.poilist.a y;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    public static /* synthetic */ void a(c cVar, boolean z, List list, PoiVerticalityDataResponse poiVerticalityDataResponse, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list, poiVerticalityDataResponse, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "c6f6079a6b56c96d5fd828bc1cf110b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "c6f6079a6b56c96d5fd828bc1cf110b2");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos) && o.l()) {
            u.a(cVar.f);
        } else {
            u.c(cVar.f);
        }
        u.c(cVar.g);
        if (z) {
            cVar.a(poiVerticalityDataResponse, list, filterConditionResponse);
        } else {
            cVar.t.b((List<f>) list);
        }
    }

    public c(com.sankuai.waimai.store.widgets.filterbar.home.controller.c cVar, com.sankuai.waimai.store.param.a aVar, int i) {
        super(cVar, aVar, 4);
        Object[] objArr = {cVar, aVar, 4};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695a47990cd05fbc89e1c4d1a96f5ab1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695a47990cd05fbc89e1c4d1a96f5ab1");
            return;
        }
        this.w = null;
        this.x = new com.sankuai.waimai.store.pagingload.c<>();
        this.y = new com.sankuai.waimai.store.poilist.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poilist.a
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51d9cdf76955597a26d6f141c09d19bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51d9cdf76955597a26d6f141c09d19bb");
                } else if (q.a((RecyclerView) c.this.d) > 0) {
                    c.this.e.b(i2);
                }
            }

            @Override // com.sankuai.waimai.store.poilist.a
            public final void b(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cad6316a909943136bbc5b9e0ffcd7b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cad6316a909943136bbc5b9e0ffcd7b");
                } else {
                    c.this.e.b(-i2);
                }
            }

            @Override // com.sankuai.waimai.store.poilist.a, android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abd26df02e2b2d40b6f6fcbce1825b77", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abd26df02e2b2d40b6f6fcbce1825b77");
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                    int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                    int[] findFirstCompletelyVisibleItemPositions = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(null);
                    View childAt = recyclerView.getChildAt(0);
                    c.this.b.a(new h(findFirstVisibleItemPositions[0] / 2, findLastVisibleItemPositions[0] / 2, findFirstCompletelyVisibleItemPositions[0] / 2, childAt != null ? childAt.getTop() : 0));
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1312338fa6052aa1949b077c45e40d8d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1312338fa6052aa1949b077c45e40d8d");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                c.this.b.a(new i(i2));
                if (i2 == 0) {
                    com.meituan.android.bus.a.a().c(new VisibleChangeEvent(0, true, c.this.c.y, false, true));
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d56bbe9cd65b66e4989c700b7b6fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d56bbe9cd65b66e4989c700b7b6fb2");
            return;
        }
        super.a(view);
        if (this.c.u()) {
            this.v = j.h().a(SCConfigPath.AGILE_DATA_PROCESSOR_HOME_SPU, 0);
        } else {
            this.v = j.h().a(SCConfigPath.AGILE_DATA_PROCESSOR_CHANNEL_SPU, 0);
        }
        if (this.v > 0 && com.sankuai.waimai.store.pagingload.c.a()) {
            com.sankuai.waimai.store.pagingload.c<f, f> cVar = this.x;
            cVar.e = "home_spu";
            cVar.f = this.v;
        }
        this.p = (com.sankuai.shangou.stone.util.h.a((Context) this.b.h()) - com.sankuai.shangou.stone.util.h.a(this.b.h(), 34.0f)) / 2;
        if (this.c.ac != null) {
            this.u = new com.sankuai.waimai.store.poilist.mach.d(this.b.h(), this.c, this.c.ac, this.p);
            this.c.ac = null;
            return;
        }
        this.u = new com.sankuai.waimai.store.poilist.mach.d(this.b.h(), this.c);
        this.u.b = this.p;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(com.sankuai.waimai.store.param.a aVar, @NonNull final PoiVerticalityDataResponse poiVerticalityDataResponse, boolean z) {
        final List<f> arrayList;
        Object[] objArr = {aVar, poiVerticalityDataResponse, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1c23ce1d3b5f8a7afc48f1b0ce2dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1c23ce1d3b5f8a7afc48f1b0ce2dd5");
            return;
        }
        com.sankuai.waimai.store.fsp.a.a().a(this.b.h(), "sg_perf_render_start");
        Object[] objArr2 = {poiVerticalityDataResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d52a499cd98538b689c03c2e95a10582", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d52a499cd98538b689c03c2e95a10582");
        } else {
            arrayList = new ArrayList<>();
            if (!com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) {
                a(poiVerticalityDataResponse, poiVerticalityDataResponse.poiCardInfos, arrayList);
            }
        }
        a(arrayList);
        u.c(this.f);
        final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("supermarket_mach_preload_tag");
        createCustomSpeedMeterTask.recordStep("feed_mach_data_begin_load_prerender");
        if (this.b.b(aVar)) {
            i.a aVar2 = new i.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.i.a
                public final void a(final FilterConditionResponse filterConditionResponse) {
                    Object[] objArr3 = {filterConditionResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "65e5075695ab0fc42282ac93cad5617b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "65e5075695ab0fc42282ac93cad5617b");
                    } else if (c.this.v > 0 && com.sankuai.waimai.store.pagingload.c.a()) {
                        createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v1");
                        c.this.a((List<f>) arrayList, poiVerticalityDataResponse, filterConditionResponse, true);
                    } else {
                        createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v2");
                        if (c.this.c != null) {
                            if (c.this.c.aw != null) {
                                c.this.c.aw.recordStep("normal_process_start");
                            }
                            if (c.this.c.ax != null) {
                                c.this.c.ax.recordStep("normal_process_start");
                            }
                        }
                        c.this.a(arrayList, false, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cb6a87941ecedd04c72f65d734f3d1ea", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cb6a87941ecedd04c72f65d734f3d1ea");
                                    return;
                                }
                                if (c.this.c != null) {
                                    if (c.this.c.aw != null) {
                                        com.sankuai.meituan.takeoutnew.util.aop.h.a(c.this.c.aw.recordStep("normal_process_complete"));
                                    }
                                    if (c.this.c.ax != null) {
                                        com.sankuai.meituan.takeoutnew.util.aop.h.a(c.this.c.ax.recordStep("normal_process_complete"));
                                    }
                                }
                                c.this.f.e();
                                c.this.a(poiVerticalityDataResponse, arrayList, filterConditionResponse);
                                createCustomSpeedMeterTask.recordStep("feed_mach_data_first_end_load_prerender_two_thread");
                                com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                                u.c(c.this.g);
                            }
                        });
                    }
                }
            };
            Object[] objArr3 = {poiVerticalityDataResponse, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = s;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9c69af1d4f0f2bd1ef9956040d02bbb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9c69af1d4f0f2bd1ef9956040d02bbb");
            } else {
                this.e.a(this.c.l());
                this.e.c();
                if (poiVerticalityDataResponse.spuQuickFilter != null && poiVerticalityDataResponse.spuQuickFilter.hasValuedFilterData()) {
                    this.e.a(poiVerticalityDataResponse.spuQuickFilter, aVar2);
                }
                this.e.a(poiVerticalityDataResponse.newUserCouponInfo);
                this.e.a(aVar2);
                this.e.d();
            }
        } else if (this.v > 0 && com.sankuai.waimai.store.pagingload.c.a()) {
            createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v1");
            a(arrayList, poiVerticalityDataResponse, (FilterConditionResponse) null, false);
        } else {
            createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v2");
            a(arrayList, true, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "98c97d34ee36ea4010f68993c8a8c45b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "98c97d34ee36ea4010f68993c8a8c45b");
                        return;
                    }
                    c.this.f.e();
                    c.this.t.b(arrayList);
                    createCustomSpeedMeterTask.recordStep("feed_mach_data_first_end_load_prerender_two_thread");
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                    u.c(c.this.g);
                }
            });
        }
        g();
        a(poiVerticalityDataResponse, false);
        a(this.t, poiVerticalityDataResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<f> list, @NonNull final PoiVerticalityDataResponse poiVerticalityDataResponse, final FilterConditionResponse filterConditionResponse, final boolean z) {
        Object[] objArr = {list, poiVerticalityDataResponse, filterConditionResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3c2ac4b808cb243fbdfbf506b7ec4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3c2ac4b808cb243fbdfbf506b7ec4c");
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
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                f fVar = list.get(i);
                if (fVar != null && fVar.i != null && fVar.i.cardType == 2 && fVar.i.moduleDesc != null && "mach".equals(fVar.i.moduleDesc.nativeId) && !t.a(fVar.i.moduleDesc.templateId)) {
                    fVar.e = i;
                    arrayList.add(fVar);
                }
            }
        }
        if (this.x.b()) {
            this.x.d = new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.pagingload.c.a
                public final rx.d a(List list2) {
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52bd89c14d084615e8fa794913cfed23", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52bd89c14d084615e8fa794913cfed23") : c.this.u.a(list2).c(new g<List<com.sankuai.waimai.store.poilist.mach.f>, rx.d<?>>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.3.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.g
                        public final /* synthetic */ rx.d<?> call(List<com.sankuai.waimai.store.poilist.mach.f> list3) {
                            List<com.sankuai.waimai.store.poilist.mach.f> list4 = list3;
                            Object[] objArr3 = {list4};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "748b266a6730854786800f0e4a367147", RobustBitConfig.DEFAULT_VALUE)) {
                                return (rx.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "748b266a6730854786800f0e4a367147");
                            }
                            ArrayList arrayList2 = new ArrayList();
                            if (list4 != null) {
                                for (int i2 = 0; i2 < list4.size(); i2++) {
                                    com.sankuai.waimai.store.poilist.mach.f fVar2 = list4.get(i2);
                                    f fVar3 = (f) fVar2.a;
                                    if (fVar3 != null && (fVar3 instanceof f)) {
                                        fVar3.j = new com.sankuai.waimai.store.poilist.mach.f<>(fVar3.i.moduleDesc, fVar2.b);
                                        arrayList2.add(fVar3);
                                    }
                                }
                            }
                            return rx.d.a(arrayList2);
                        }
                    });
                }
            };
        }
        com.sankuai.waimai.store.pagingload.c<f, f> cVar = this.x;
        cVar.g = new a.InterfaceC1262a<f, f>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.InterfaceC1262a
            public final /* synthetic */ f a(@NonNull @NotNull f fVar2) {
                f fVar3 = fVar2;
                Object[] objArr2 = {fVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a40cdc790720ebf6b63521ca1c3aeda7", RobustBitConfig.DEFAULT_VALUE)) {
                    return (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a40cdc790720ebf6b63521ca1c3aeda7");
                }
                fVar3.j = c.this.u.a(fVar3.i, fVar3.e);
                return fVar3;
            }
        };
        cVar.h = new a.b<f, f>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(List<f> list2, int i2) {
                boolean z2 = false;
                Object[] objArr2 = {list2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74580f89cf2733f7d179041135e351fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74580f89cf2733f7d179041135e351fe");
                    return;
                }
                super.a(list2, i2);
                if (c.this.c != null) {
                    if (c.this.c.av != null) {
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(c.this.c.av.recordStep("agile_process_complete"));
                    }
                    if (c.this.c.ax != null) {
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(c.this.c.ax.recordStep("agile_process_complete"));
                    }
                }
                if (z && i2 == 1) {
                    z2 = true;
                }
                c.a(c.this, z2, list2, poiVerticalityDataResponse, filterConditionResponse);
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(int i2, @Nullable @org.jetbrains.annotations.Nullable Throwable th, List<f> list2) {
                Object[] objArr2 = {Integer.valueOf(i2), th, list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e7bdde25e16932afa525878cd6f531e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e7bdde25e16932afa525878cd6f531e");
                    return;
                }
                super.a(i2, th, list2);
                c.a(c.this, z, list2, poiVerticalityDataResponse, filterConditionResponse);
            }
        };
        cVar.a(arrayList);
    }

    void a(List<f> list, boolean z, Runnable runnable) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), runnable};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d1dd7e3eafd38b1b647065cb717b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d1dd7e3eafd38b1b647065cb717b75");
            return;
        }
        int min = Math.min(50, com.sankuai.shangou.stone.util.a.a((List) list));
        ArrayList arrayList = new ArrayList();
        int a = z ? this.t.a() : 0;
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                f fVar = list.get(i);
                if (fVar != null && fVar.i != null && fVar.i.cardType == 2 && fVar.i.moduleDesc != null && "mach".equals(fVar.i.moduleDesc.nativeId) && !t.a(fVar.i.moduleDesc.templateId)) {
                    fVar.e = i + a;
                    arrayList.add(fVar);
                }
            }
        }
        this.u.a(runnable, (List<f>) arrayList, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, List<f> list, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {poiVerticalityDataResponse, list, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99bad40b73f9fdbb00f2aa6a2f588b99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99bad40b73f9fdbb00f2aa6a2f588b99");
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
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb8e394fcbfefa308d00fc519424b80f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb8e394fcbfefa308d00fc519424b80f")).intValue() : (com.sankuai.shangou.stone.util.h.a((Context) this.b.h()) - com.sankuai.shangou.stone.util.h.a(this.b.h(), 34.0f)) / 2;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afda665f3eaf846eaf9547ce73cc2c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afda665f3eaf846eaf9547ce73cc2c04");
            return;
        }
        c(z);
        c();
    }

    private void a(List<f> list, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {list, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3a9691a3a06449d701605b52197f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3a9691a3a06449d701605b52197f34");
            return;
        }
        String string = this.b.h().getString(R.string.wm_sc_common_net_error_5);
        if (com.sankuai.shangou.stone.util.a.b(list) && TextUtils.isEmpty(this.j) && TextUtils.isEmpty(this.k)) {
            this.f.a(string, "", a(1), R.drawable.wm_sc_home_filter_empty, false, "", "");
            u.a(this.f);
            return;
        }
        if (filterConditionResponse != null) {
            if (this.t.g().size() == 0) {
                this.e.a(0);
                this.t.c(this.e.b());
            }
        } else if (this.t.g().size() > 0) {
            this.t.f(this.e.b());
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.f.a(string, "", a(2), R.drawable.wm_sc_home_filter_empty, false, "", "");
            u.a(this.f);
            this.f.setBackgroundColor(Color.parseColor("#F5F5F5"));
        }
    }

    private void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull List<PoiCardInfo> list, @NonNull List<f> list2) {
        int i;
        Object[] objArr = {poiVerticalityDataResponse, list, list2};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfa104603cb11cd156067369d8ef4530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfa104603cb11cd156067369d8ef4530");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.headCardInfoList)) {
            i = 0;
        } else {
            int i2 = 0;
            i = 0;
            for (PoiCardInfo poiCardInfo : poiVerticalityDataResponse.headCardInfoList) {
                if (poiCardInfo != null) {
                    f fVar = new f();
                    fVar.b = null;
                    fVar.c = null;
                    fVar.i = poiCardInfo;
                    fVar.d = PoiVerticality.TEMPLATE_SPU_TYPE_HEADER;
                    list2.add(fVar);
                    i2++;
                    i++;
                }
            }
            this.c.aB = i2;
        }
        for (PoiCardInfo poiCardInfo2 : list) {
            if (poiCardInfo2 != null) {
                f fVar2 = new f();
                fVar2.b = null;
                fVar2.c = null;
                fVar2.i = poiCardInfo2;
                BaseModuleDesc baseModuleDesc = fVar2.i.moduleDesc;
                com.sankuai.waimai.store.platform.shop.model.a a = a(poiVerticalityDataResponse);
                Object a2 = (baseModuleDesc == null || TextUtils.isEmpty(baseModuleDesc.planKey)) ? null : a(poiVerticalityDataResponse, baseModuleDesc.planKey);
                if (baseModuleDesc != null && !TextUtils.isEmpty(baseModuleDesc.planKey) && baseModuleDesc.jsonData != null && a2 != null) {
                    baseModuleDesc.jsonData.put("tile_config", a2);
                }
                if (baseModuleDesc != null && baseModuleDesc.jsonData != null) {
                    baseModuleDesc.jsonData.put("rec_index", Integer.valueOf(baseModuleDesc.recIndex));
                }
                if (a(a, baseModuleDesc, i)) {
                    list2.add(fVar2);
                }
                i++;
            }
        }
        if (this.d.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        int dimensionPixelSize = this.b.h().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_9);
        this.d.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.d.setLayoutManager(staggeredGridLayoutManager);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68d7bcc7418e710043f4df7bb36740f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68d7bcc7418e710043f4df7bb36740f");
        } else if (this.d.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) this.d.getLayoutManager()).scrollToPositionWithOffset(0, 0);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe52335d341e42c3ba035c41afdc9655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe52335d341e42c3ba035c41afdc9655");
        } else if (this.d.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) this.d.getLayoutManager()).scrollToPositionWithOffset(0, 0);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final void a(PoiChannelBackgroundConfig poiChannelBackgroundConfig, PoiVerticalityDataResponse.Promotion promotion) {
        Object[] objArr = {poiChannelBackgroundConfig, promotion};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88bffd85994917add9b0e079f8cf07f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88bffd85994917add9b0e079f8cf07f3");
        } else if (com.sankuai.waimai.store.util.b.a(this.b.h())) {
        } else {
            if (this.c.l()) {
                if (this.c.g()) {
                    this.e.a(com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c.F, poiChannelBackgroundConfig));
                    return;
                }
                com.sankuai.waimai.store.widgets.filterbar.home.model.a a = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c, poiChannelBackgroundConfig);
                a.a(promotion, this.c);
                this.e.a(a);
                return;
            }
            com.sankuai.waimai.store.widgets.filterbar.home.model.a a2 = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c.F, poiChannelBackgroundConfig);
            a2.a(promotion, this.c);
            this.e.a(a2);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9469f03d0cb8a77d9b2b98ab300dca5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9469f03d0cb8a77d9b2b98ab300dca5b");
        } else if (this.t == null) {
            this.t = new com.sankuai.waimai.store.poi.list.newp.adapter.c(this.b.h(), this.c, this.u);
            SCRecyclerView sCRecyclerView = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = s;
            sCRecyclerView.setAdapter(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ab93976d7bce9cf86fd032930f79a20", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.j) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ab93976d7bce9cf86fd032930f79a20") : new com.sankuai.waimai.store.widgets.recycler.j<com.sankuai.waimai.store.widgets.recycler.e>(this.t) { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.7
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.a
                public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.s sVar) {
                    com.sankuai.waimai.store.widgets.recycler.e eVar = (com.sankuai.waimai.store.widgets.recycler.e) sVar;
                    Object[] objArr3 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd15c226217c24c096070ecf96e040a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd15c226217c24c096070ecf96e040a3");
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
                    if (layoutParams instanceof StaggeredGridLayoutManager.b) {
                        StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
                        int itemViewType = eVar.getItemViewType();
                        if (itemViewType == -2147483647 || itemViewType == -2147483646 || itemViewType == -2147483643) {
                            bVar.b = true;
                        } else {
                            bVar.b = false;
                        }
                    }
                }
            });
            this.t.d(this.h);
            if (this.w != null) {
                this.d.removeItemDecoration(this.w);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = s;
            this.w = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf1dfc02fde5fa6e787d513c5b18031e", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.f) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf1dfc02fde5fa6e787d513c5b18031e") : new RecyclerView.f() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c.6
                public static ChangeQuickRedirect a;
                public int b;

                {
                    this.b = c.this.b.h().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_0);
                }

                @Override // android.support.v7.widget.RecyclerView.f
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    Object[] objArr4 = {rect, view, recyclerView, state};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "53c080ded40f6296abbed8b671119f3e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "53c080ded40f6296abbed8b671119f3e");
                    } else if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) view.getLayoutParams();
                        if (bVar.b) {
                            rect.left = 0;
                            rect.right = 0;
                            rect.top = 0;
                            rect.bottom = 0;
                            return;
                        }
                        if (bVar.b() % 2 == 0) {
                            rect.left = 0;
                            rect.right = this.b;
                        } else {
                            rect.left = this.b;
                            rect.right = 0;
                        }
                        int i = this.b;
                        rect.bottom = i;
                        rect.top = i;
                    }
                }
            };
            this.d.addItemDecoration(this.w);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab3ee57b3fe2c52affe8d2d9535c3b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab3ee57b3fe2c52affe8d2d9535c3b24");
        } else {
            this.t.a((com.sankuai.waimai.store.widgets.recycler.c) new com.sankuai.waimai.store.poi.list.logreport.e(this.b.h(), this.c));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa234f462bee997d178f5ee0cdc8733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa234f462bee997d178f5ee0cdc8733");
        } else {
            this.t.m();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db07cc3190b611994651ca620f8bbd27", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db07cc3190b611994651ca620f8bbd27")).booleanValue() : this.t.e();
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final com.sankuai.waimai.store.poilist.a t() {
        return this.y;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d48e4d9c61384daf3b666d7ee1d285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d48e4d9c61384daf3b666d7ee1d285");
        } else {
            this.t.a((List<f>) null);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5987b2f40f2ffc5453e9dfd32dba92e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5987b2f40f2ffc5453e9dfd32dba92e0");
            return;
        }
        super.m();
        if (this.u != null) {
            this.u.a();
        }
        if (this.x != null) {
            this.x.c();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final /* bridge */ /* synthetic */ com.sankuai.waimai.store.widgets.recycler.a v() {
        return this.t;
    }
}
