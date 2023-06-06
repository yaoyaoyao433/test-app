package com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.pagingload.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.d;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.VisibleChangeEvent;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.h;
import com.sankuai.waimai.store.poilist.mach.g;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.util.t;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.i;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.recycler.l;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiListFilterStrategy4 extends a implements d.a {
    public static ChangeQuickRedirect s;
    private d A;
    private com.sankuai.waimai.store.poi.subscribe.e B;
    private com.sankuai.waimai.store.poilist.a C;
    com.sankuai.waimai.store.poi.list.newp.adapter.b t;
    private final Set u;
    private boolean v;
    private int w;
    private com.sankuai.waimai.store.poilist.mach.d x;
    private int y;
    private com.sankuai.waimai.store.pagingload.c<f, f> z;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void o() {
    }

    public static /* synthetic */ void a(PoiListFilterStrategy4 poiListFilterStrategy4, boolean z, PoiVerticalityDataResponse poiVerticalityDataResponse, List list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), poiVerticalityDataResponse, list};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, poiListFilterStrategy4, changeQuickRedirect, false, "b59285cf3c175e3d763ec456bec78f2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiListFilterStrategy4, changeQuickRedirect, false, "b59285cf3c175e3d763ec456bec78f2b");
            return;
        }
        if (z) {
            poiListFilterStrategy4.a(list, poiVerticalityDataResponse.spuQuickFilter, poiVerticalityDataResponse.couponTipFilter);
            poiListFilterStrategy4.a(poiVerticalityDataResponse, (i.a) null);
            if (com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos) && o.l()) {
                u.a(poiListFilterStrategy4.f);
            } else {
                u.c(poiListFilterStrategy4.f);
            }
            if (poiListFilterStrategy4.r != null) {
                poiListFilterStrategy4.r.a();
            }
        } else {
            poiListFilterStrategy4.t.b((List<f>) list);
        }
        poiListFilterStrategy4.g();
        u.c(poiListFilterStrategy4.g);
    }

    public PoiListFilterStrategy4(com.sankuai.waimai.store.widgets.filterbar.home.controller.c cVar, com.sankuai.waimai.store.param.a aVar, int i) {
        super(cVar, aVar, 0);
        Object[] objArr = {cVar, aVar, 0};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3f3e4828654771f061877b21cab6d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3f3e4828654771f061877b21cab6d9");
            return;
        }
        this.u = new HashSet();
        this.v = false;
        this.w = 0;
        this.z = new com.sankuai.waimai.store.pagingload.c<>();
        this.B = new com.sankuai.waimai.store.poi.subscribe.e() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.PoiListFilterStrategy4.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.subscribe.e
            public final void a(long j, int i2) {
                Object[] objArr2 = {new Long(j), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "090d4ac786cbb056c35eeb70e5c07fa5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "090d4ac786cbb056c35eeb70e5c07fa5");
                } else if (PoiListFilterStrategy4.this.t != null) {
                    int a2 = PoiListFilterStrategy4.this.t.a();
                    for (int i3 = 0; i3 < a2; i3++) {
                        f b = PoiListFilterStrategy4.this.t.b(i3);
                        if (b != null) {
                            if (b.a() == null || b.a().id != j) {
                                if (PoiListFilterStrategy4.b(b) && b.i.moduleDesc.jsonData != null) {
                                    try {
                                        if (com.sankuai.waimai.store.poi.list.util.c.a(b.i.moduleDesc.jsonData) == j) {
                                            b.i.moduleDesc.jsonData.put("subscribe", Integer.valueOf(i2));
                                        }
                                    } catch (Exception e) {
                                        com.dianping.judas.util.a.a(e);
                                    }
                                }
                            } else {
                                b.a().subscribe = i2;
                            }
                        }
                    }
                    PoiListFilterStrategy4.this.t.m();
                }
            }
        };
        this.C = new com.sankuai.waimai.store.poilist.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.PoiListFilterStrategy4.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poilist.a
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ef492bdaaa6220817e86b62c9e540f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ef492bdaaa6220817e86b62c9e540f2");
                } else if (q.a((RecyclerView) PoiListFilterStrategy4.this.d) > 0) {
                    PoiListFilterStrategy4.this.e.b(i2);
                }
            }

            @Override // com.sankuai.waimai.store.poilist.a
            public final void b(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ac825bcd8aa127b4b8f779f635592a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ac825bcd8aa127b4b8f779f635592a4");
                } else {
                    PoiListFilterStrategy4.this.e.b(-i2);
                }
            }

            @Override // com.sankuai.waimai.store.poilist.a, android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4960fa335fdbcc429a9fe771631a623a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4960fa335fdbcc429a9fe771631a623a");
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                    int f = q.f(recyclerView);
                    int b = q.b(recyclerView);
                    int e = q.e(recyclerView);
                    View childAt = recyclerView.getChildAt(0);
                    PoiListFilterStrategy4.this.b.a(new h(f, b, e, childAt != null ? childAt.getTop() : 0));
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56c4f922270e586dc10674491d04a68e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56c4f922270e586dc10674491d04a68e");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                PoiListFilterStrategy4.this.b.a(new com.sankuai.waimai.store.poi.list.newp.block.rxevent.i(i2));
                if (i2 == 0) {
                    com.meituan.android.bus.a.a().c(new VisibleChangeEvent(0, true, PoiListFilterStrategy4.this.c.y, false, true));
                }
            }
        };
        if (this.c.u()) {
            this.y = j.h().a(SCConfigPath.AGILE_DATA_PROCESSOR_HOME_POI, 0);
        } else {
            this.y = j.h().a(SCConfigPath.AGILE_DATA_PROCESSOR_CHANNEL_POI, 0);
        }
        if (this.y <= 0 || !com.sankuai.waimai.store.pagingload.c.a()) {
            return;
        }
        com.sankuai.waimai.store.pagingload.c<f, f> cVar2 = this.z;
        cVar2.e = "home_poi";
        cVar2.f = this.y;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329101923bba67179287939fdceeeaf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329101923bba67179287939fdceeeaf1");
            return;
        }
        super.a(view);
        com.sankuai.waimai.store.poi.subscribe.a.a().a(this.B);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fc0e29b1e2aef3df0a1dedc2dfc63a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fc0e29b1e2aef3df0a1dedc2dfc63a5");
        } else if (this.A == null) {
            this.A = new d(this.b.h(), this.d, this.c, this);
        }
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b1daf4e584ba5f7f0ecce4a01d8d839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b1daf4e584ba5f7f0ecce4a01d8d839");
            return;
        }
        super.b();
        this.u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.waimai.store.poilist.mach.d w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e28af6976d36c85f1c8597e87156ee4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.poilist.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e28af6976d36c85f1c8597e87156ee4e");
        }
        if (this.x == null) {
            com.sankuai.waimai.mach.recycler.b bVar = this.c.ad;
            if (bVar == null) {
                bVar = new com.sankuai.waimai.mach.recycler.b("supermarket");
            }
            this.x = new com.sankuai.waimai.store.poilist.mach.d(this.b.h(), this.c, bVar);
            this.x.b = this.p;
            this.x.a((com.sankuai.waimai.mach.d) new g(this.b.h(), this.c.G, this.u));
            this.c.ad = null;
        }
        return this.x;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bf0c4cf267f5f2ec70201d8c5167dfb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bf0c4cf267f5f2ec70201d8c5167dfb")).intValue() : com.sankuai.shangou.stone.util.h.a((Context) this.b.h());
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5375dbc5c07b8e26e7edd1e236619552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5375dbc5c07b8e26e7edd1e236619552");
            return;
        }
        c(z);
        this.b.i();
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(com.sankuai.waimai.store.param.a aVar, @NonNull final PoiVerticalityDataResponse poiVerticalityDataResponse, boolean z) {
        final List<f> arrayList;
        BaseModuleDesc baseModuleDesc;
        Object[] objArr = {aVar, poiVerticalityDataResponse, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad0e8d3bf3d283ad4f666315211b36cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad0e8d3bf3d283ad4f666315211b36cd");
            return;
        }
        com.sankuai.waimai.store.fsp.a.a().a(this.b.h(), "sg_perf_render_start");
        Object[] objArr2 = {poiVerticalityDataResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "494a10754c2e9799206ecfaa9f349247", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "494a10754c2e9799206ecfaa9f349247");
        } else {
            arrayList = new ArrayList<>();
            if (!com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) {
                a(poiVerticalityDataResponse, poiVerticalityDataResponse.poiCardInfos, arrayList);
            } else if (!com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poilist)) {
                a(poiVerticalityDataResponse.poilist, arrayList);
            }
        }
        a(arrayList);
        u.c(this.f);
        if (aVar.s() && poiVerticalityDataResponse.isShelfToFeed && com.sankuai.shangou.stone.util.a.c(arrayList) > 0) {
            poiVerticalityDataResponse.isShelfToFeed = false;
            this.v = true;
            this.w = this.t.a() + 1;
            f fVar = new f();
            fVar.b = null;
            fVar.c = null;
            PoiCardInfo poiCardInfo = new PoiCardInfo();
            poiCardInfo.cardType = 2;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.poi.list.util.c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6f80017f9e4ac6ca6036199e26505f65", RobustBitConfig.DEFAULT_VALUE)) {
                baseModuleDesc = (BaseModuleDesc) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6f80017f9e4ac6ca6036199e26505f65");
            } else {
                baseModuleDesc = new BaseModuleDesc();
                baseModuleDesc.templateId = "supermarket-convenient-feed-title";
                baseModuleDesc.moduleId = "supermarket-convenient-feed-title";
                HashMap hashMap = new HashMap();
                hashMap.put("title", "更多推荐");
                hashMap.put("left_space", "10");
                hashMap.put("top_space", "13");
                hashMap.put("bottom_sapce", "5");
                hashMap.put("font", Constants.VIA_REPORT_TYPE_WPA_STATE);
                hashMap.put("color", DiagnoseLog.COLOR_ERROR);
                hashMap.put("backGroundColor", "#00000000");
                baseModuleDesc.jsonData = hashMap;
            }
            poiCardInfo.moduleDesc = baseModuleDesc;
            fVar.i = poiCardInfo;
            arrayList.add(0, fVar);
        }
        final boolean b = this.b.b(aVar);
        MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("supermarket_mach_preload_tag");
        if (this.y > 0 && com.sankuai.waimai.store.pagingload.c.a()) {
            createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v1");
            a(b, arrayList, poiVerticalityDataResponse);
        } else {
            createCustomSpeedMeterTask.recordStep("mach_data_begin_load_prerender_v2");
            if (this.c != null) {
                if (this.c.aw != null) {
                    this.c.aw.recordStep("normal_process_start");
                }
                if (this.c.ax != null) {
                    this.c.ax.recordStep("normal_process_start");
                }
            }
            a(arrayList, !b, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.PoiListFilterStrategy4.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c88e84e3fab30f1d25d1d504ee53e1d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c88e84e3fab30f1d25d1d504ee53e1d8");
                        return;
                    }
                    if (PoiListFilterStrategy4.this.c != null) {
                        if (PoiListFilterStrategy4.this.c.aw != null) {
                            com.sankuai.meituan.takeoutnew.util.aop.h.a(PoiListFilterStrategy4.this.c.aw.recordStep("normal_process_complete"));
                        }
                        if (PoiListFilterStrategy4.this.c.ax != null) {
                            com.sankuai.meituan.takeoutnew.util.aop.h.a(PoiListFilterStrategy4.this.c.ax.recordStep("normal_process_complete"));
                        }
                    }
                    if (b) {
                        PoiListFilterStrategy4.this.a(arrayList, poiVerticalityDataResponse.spuQuickFilter, poiVerticalityDataResponse.couponTipFilter);
                        PoiListFilterStrategy4.this.a(poiVerticalityDataResponse, (i.a) null);
                        if (PoiListFilterStrategy4.this.r != null) {
                            PoiListFilterStrategy4.this.r.a();
                        }
                    } else {
                        PoiListFilterStrategy4.this.t.b(arrayList);
                    }
                    PoiListFilterStrategy4.this.g();
                    u.c(PoiListFilterStrategy4.this.g);
                }
            });
        }
        com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
        a(poiVerticalityDataResponse, true);
        a(this.t, poiVerticalityDataResponse);
    }

    private void a(List<f> list, boolean z, Runnable runnable) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), runnable};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bdc2ba8156e45b89f8cc5dbebc36fc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bdc2ba8156e45b89f8cc5dbebc36fc7");
            return;
        }
        int min = Math.min(50, com.sankuai.shangou.stone.util.a.a((List) list));
        ArrayList arrayList = new ArrayList();
        int a = z ? this.t.a() : 0;
        if (this.v) {
            a -= this.w;
        }
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                if (b(fVar)) {
                    fVar.e = i + a;
                    arrayList.add(fVar);
                }
            }
        }
        w().a(runnable, (List<f>) arrayList, false);
    }

    private void a(final boolean z, List<f> list, @NonNull final PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cadfdba3fc7aaf6fdb74d28a2e107133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cadfdba3fc7aaf6fdb74d28a2e107133");
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
        if (this.v) {
            a -= this.w;
        }
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                if (b(fVar)) {
                    fVar.e = i + a;
                    arrayList.add(fVar);
                }
            }
        }
        if (this.z.b()) {
            this.z.d = new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.PoiListFilterStrategy4.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.pagingload.c.a
                public final rx.d a(List list2) {
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ffb21e0a8f843740efc67cd39bceac1", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ffb21e0a8f843740efc67cd39bceac1") : PoiListFilterStrategy4.this.w().a(list2).c(new rx.functions.g<List<com.sankuai.waimai.store.poilist.mach.f>, rx.d<?>>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.PoiListFilterStrategy4.3.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.g
                        public final /* synthetic */ rx.d<?> call(List<com.sankuai.waimai.store.poilist.mach.f> list3) {
                            List<com.sankuai.waimai.store.poilist.mach.f> list4 = list3;
                            Object[] objArr3 = {list4};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a324d77846ce019ec2baded434f61c62", RobustBitConfig.DEFAULT_VALUE)) {
                                return (rx.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a324d77846ce019ec2baded434f61c62");
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
        com.sankuai.waimai.store.pagingload.c<f, f> cVar = this.z;
        cVar.g = new a.InterfaceC1262a<f, f>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.PoiListFilterStrategy4.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.InterfaceC1262a
            public final /* synthetic */ f a(@NonNull @NotNull f fVar2) {
                f fVar3 = fVar2;
                Object[] objArr2 = {fVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c46a2c36409fe6aa6941e355d9fd4261", RobustBitConfig.DEFAULT_VALUE)) {
                    return (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c46a2c36409fe6aa6941e355d9fd4261");
                }
                fVar3.j = PoiListFilterStrategy4.this.w().a(fVar3.i, fVar3.e);
                return fVar3;
            }
        };
        cVar.h = new a.b<f, f>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.PoiListFilterStrategy4.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(List<f> list2, int i2) {
                boolean z2 = false;
                Object[] objArr2 = {list2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebbd42a1e9e76a9536233da407b28e99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebbd42a1e9e76a9536233da407b28e99");
                    return;
                }
                super.a(list2, i2);
                if (i2 == 1 && PoiListFilterStrategy4.this.c != null) {
                    if (PoiListFilterStrategy4.this.c.av != null) {
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(PoiListFilterStrategy4.this.c.av.recordStep("agile_process_complete"));
                    }
                    if (PoiListFilterStrategy4.this.c.ax != null) {
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(PoiListFilterStrategy4.this.c.ax.recordStep("agile_process_complete"));
                    }
                }
                if (z && i2 == 1) {
                    z2 = true;
                }
                PoiListFilterStrategy4.a(PoiListFilterStrategy4.this, z2, poiVerticalityDataResponse, list2);
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(int i2, @Nullable @org.jetbrains.annotations.Nullable Throwable th, List<f> list2) {
                Object[] objArr2 = {Integer.valueOf(i2), th, list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddbc7615dfd981d8b6730827a679752e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddbc7615dfd981d8b6730827a679752e");
                    return;
                }
                super.a(i2, th, list2);
                PoiListFilterStrategy4.a(PoiListFilterStrategy4.this, z, poiVerticalityDataResponse, list2);
            }
        };
        cVar.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(@Nullable f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "960233fbb9767f4aa6e1d4e15b8528d7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "960233fbb9767f4aa6e1d4e15b8528d7")).booleanValue() : (fVar == null || fVar.i == null || fVar.i.moduleDesc == null || fVar.i.cardType != 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<f> list, FilterConditionResponse filterConditionResponse, BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {list, filterConditionResponse, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f37f70b17ebc719ad81f0fcde72c320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f37f70b17ebc719ad81f0fcde72c320");
            return;
        }
        this.u.clear();
        this.t.a(list);
        b(list, filterConditionResponse, baseModuleDesc);
        a(this.c.n != 3);
        this.h.a();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final void a(PoiChannelBackgroundConfig poiChannelBackgroundConfig, PoiVerticalityDataResponse.Promotion promotion) {
        Object[] objArr = {poiChannelBackgroundConfig, promotion};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42f4a9aa4685d8859bc947d3b59eac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42f4a9aa4685d8859bc947d3b59eac6");
        } else if (com.sankuai.waimai.store.util.b.a(this.b.h())) {
        } else {
            com.sankuai.waimai.store.widgets.filterbar.home.model.a a = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c, poiChannelBackgroundConfig);
            a.a(promotion, this.c);
            this.e.b(a);
            com.sankuai.waimai.store.widgets.filterbar.home.model.a a2 = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c.F, poiChannelBackgroundConfig);
            a2.a(promotion, this.c);
            this.e.a(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, i.a aVar) {
        Object[] objArr = {poiVerticalityDataResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401ee7acec2c1bacc24bab70c8cdc448", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401ee7acec2c1bacc24bab70c8cdc448");
            return;
        }
        this.e.a(this.c.l());
        this.e.c();
        if (poiVerticalityDataResponse.spuQuickFilter != null && poiVerticalityDataResponse.spuQuickFilter.hasValuedFilterData()) {
            this.e.a(poiVerticalityDataResponse.spuQuickFilter, aVar);
        }
        this.e.a(aVar);
        this.e.a(poiVerticalityDataResponse.newUserCouponInfo);
        this.e.d();
    }

    private void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull List<PoiCardInfo> list, @NonNull List<f> list2) {
        int i = 0;
        Object[] objArr = {poiVerticalityDataResponse, list, list2};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b171eca9242061747a143116a2026fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b171eca9242061747a143116a2026fa");
            return;
        }
        for (PoiCardInfo poiCardInfo : list) {
            if (poiCardInfo != null) {
                f fVar = new f();
                Object obj = null;
                fVar.b = null;
                fVar.c = null;
                fVar.i = poiCardInfo;
                BaseModuleDesc baseModuleDesc = fVar.i.moduleDesc;
                com.sankuai.waimai.store.platform.shop.model.a a = a(poiVerticalityDataResponse);
                if (baseModuleDesc != null && !TextUtils.isEmpty(baseModuleDesc.planKey)) {
                    obj = a(poiVerticalityDataResponse, baseModuleDesc.planKey);
                }
                if (baseModuleDesc != null && !TextUtils.isEmpty(baseModuleDesc.planKey) && baseModuleDesc.jsonData != null && obj != null) {
                    baseModuleDesc.jsonData.put("tile_config", obj);
                }
                if (baseModuleDesc != null && baseModuleDesc.jsonData != null) {
                    baseModuleDesc.jsonData.put("rec_index", Integer.valueOf(baseModuleDesc.recIndex));
                }
                if (a(a, baseModuleDesc, i)) {
                    list2.add(fVar);
                }
                i++;
            }
        }
        x();
    }

    private void a(@NonNull List<PoiVerticality> list, @NonNull List<f> list2) {
        int i = 0;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd4715ff6273dcf50ecb0534b0a46c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd4715ff6273dcf50ecb0534b0a46c41");
            return;
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = t.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "129e9c754f3e3ef9ba4fbd500ec245d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "129e9c754f3e3ef9ba4fbd500ec245d1");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            HashMap hashMap = new HashMap();
            for (PoiVerticality poiVerticality : list) {
                if (poiVerticality != null) {
                    if (((Integer) hashMap.get(Long.valueOf(poiVerticality.getLongPoiId()))) != null) {
                        list.set(i, null);
                    }
                    hashMap.put(Long.valueOf(poiVerticality.getLongPoiId()), Integer.valueOf(i));
                    i++;
                }
            }
            Iterator<PoiVerticality> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    it.remove();
                }
            }
        }
        for (PoiVerticality poiVerticality2 : list) {
            if (poiVerticality2 != null) {
                f fVar = new f();
                fVar.b = null;
                fVar.c = poiVerticality2;
                list2.add(fVar);
            }
        }
        x();
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0432b0726db6c1ac56086df4ce8baa6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0432b0726db6c1ac56086df4ce8baa6b");
        } else if (this.d.getLayoutManager() instanceof LinearLayoutManager) {
        } else {
            this.d.setLayoutManager(new LinearLayoutManager(this.b.h(), 1, false));
            this.d.setPadding(0, 0, 0, 0);
        }
    }

    private void b(List<f> list, FilterConditionResponse filterConditionResponse, BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {list, filterConditionResponse, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae48f9a81a348c5f3fd8bb5ad2e985a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae48f9a81a348c5f3fd8bb5ad2e985a");
        } else if (com.sankuai.shangou.stone.util.a.b(list) && TextUtils.isEmpty(this.j) && TextUtils.isEmpty(this.k)) {
            String string = this.b.h().getString(R.string.wm_sc_common_net_error_5);
            if (filterConditionResponse != null) {
                this.f.a(string, "", a(1), R.drawable.wm_sc_home_filter_empty, false, "", "");
            } else {
                this.f.a("加载失败，请下拉刷新~", "", a(2), R.drawable.wm_sc_home_filter_empty, false, "", "");
            }
            u.a(this.f);
            this.f.setBackgroundColor(Color.parseColor("#F5F5F5"));
            this.t.f(this.m.getView());
            if (this.c.aR) {
                this.c.aR = false;
                com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_9ztgc8n0_mv", this.f);
                bVar.e = "b_waimai_9ztgc8n0_mv";
                bVar.a("cat_id", Long.valueOf(this.c.c));
                com.sankuai.waimai.store.expose.v2.b.a().a(this.b.h(), bVar);
            }
        } else {
            if (this.t.g().size() == 0) {
                this.e.a(0);
                this.t.c(this.e.b());
                this.m.getView().setMinimumHeight(com.sankuai.shangou.stone.util.h.a(this.b.h(), 600.0f));
                this.t.c(this.m.getView());
                this.t.f(this.m.getView());
            }
            boolean z = (baseModuleDesc == null || baseModuleDesc.jsonData == null) ? false : true;
            if (z) {
                this.A.a(baseModuleDesc);
            }
            if (this.t.f().size() == 0 && z) {
                this.t.b(this.A.getView());
                this.t.a(this.A.getView(), 1);
                this.t.e(this.A.getView());
            } else if (!z) {
                if (this.t.f().size() > 0) {
                    this.t.c(0);
                    this.t.d(1);
                }
            } else {
                this.t.d(1);
                this.t.a(this.A.getView(), 1);
                this.t.e(this.A.getView());
            }
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                this.m.a(this.c, 1);
                this.t.e(this.m.getView());
                return;
            }
            this.t.f(this.m.getView());
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd52da84e05f4ae28e89e52cf027ad0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd52da84e05f4ae28e89e52cf027ad0d");
            return;
        }
        this.d.b();
        this.d.scrollToPosition(0);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c47a8343c3ead40a8dc2cea74f8f04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c47a8343c3ead40a8dc2cea74f8f04");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9dfa3c0342dd39a3fd77f9c33c6523f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9dfa3c0342dd39a3fd77f9c33c6523f8")).booleanValue() : j.h().a("optimize/open_fix_size", false)) {
            this.d.setHasFixedSize(true);
            SCRecyclerView sCRecyclerView = this.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = o.a;
            sCRecyclerView.setItemViewCacheSize(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fe3d793733c4128460b79a1d925c0766", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fe3d793733c4128460b79a1d925c0766")).intValue() : j.h().a("optimize/user_preload_view_cachesize", 10));
        }
        this.t = new com.sankuai.waimai.store.poi.list.newp.adapter.b(this.b.h(), this.c, w());
        this.t.d(this.h);
        if (o.b()) {
            this.d.setAdapter(new com.sankuai.waimai.store.widgets.recycler.j(this.t));
        } else {
            this.d.setAdapter(new l(this.t));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14910c437113cf8e7afde2eb86e52747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14910c437113cf8e7afde2eb86e52747");
        } else {
            this.t.a((com.sankuai.waimai.store.widgets.recycler.c) new com.sankuai.waimai.store.poi.list.logreport.e(this.b.h(), this.c));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final com.sankuai.waimai.store.poilist.a t() {
        return this.C;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1505790c1748c12169b75231bc7518d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1505790c1748c12169b75231bc7518d8");
        } else {
            this.t.m();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3b3c22249ee975831397285b9f1e82", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3b3c22249ee975831397285b9f1e82")).booleanValue() : this.t.e();
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f39de02304b1825a535f28c2fdb563e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f39de02304b1825a535f28c2fdb563e2");
        } else {
            this.t.a((List<f>) null);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73141de41e79b0234ff766676f012383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73141de41e79b0234ff766676f012383");
            return;
        }
        super.m();
        com.sankuai.waimai.store.poi.subscribe.a.a().b(this.B);
        if (this.z != null) {
            this.z.c();
        }
        com.meituan.android.bus.a.a().b(this);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.d.a
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d911ee3da9f7a10875e080fdce09953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d911ee3da9f7a10875e080fdce09953");
            return;
        }
        if (z) {
            a(str);
        } else {
            a((String) null);
        }
        this.b.j();
    }

    @Subscribe
    public void onMachHomeSurveyCancelEventReceive(com.sankuai.waimai.store.mach.page.event.c cVar) {
        int i = 1;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c55f94f51ec490a02a7115900a8a829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c55f94f51ec490a02a7115900a8a829");
        } else if (cVar != null) {
            com.sankuai.waimai.store.poi.list.newp.adapter.b bVar = this.t;
            int i2 = cVar.a;
            Object[] objArr2 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.adapter.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "847b883a64d28fd93ac90a73191c6be2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "847b883a64d28fd93ac90a73191c6be2");
            } else if (bVar.b != null) {
                try {
                    bVar.b.remove(i2);
                    if (bVar.b.size() - i2 > 0) {
                        i = bVar.b.size() - i2;
                    }
                    bVar.b(i2, i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final /* bridge */ /* synthetic */ com.sankuai.waimai.store.widgets.recycler.a v() {
        return this.t;
    }
}
