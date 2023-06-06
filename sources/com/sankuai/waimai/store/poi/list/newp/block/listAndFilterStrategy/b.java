package com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy;

import android.graphics.Color;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.VisibleChangeEvent;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.h;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.i;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.i;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.recycler.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect s;
    com.sankuai.waimai.store.poi.list.newp.adapter.c t;
    com.sankuai.waimai.store.poilist.mach.d u;
    private com.sankuai.waimai.store.poilist.a v;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    public static /* synthetic */ void a(b bVar, PoiVerticalityDataResponse poiVerticalityDataResponse, List list, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {poiVerticalityDataResponse, list, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9338ccf63648d31cca27e8a45b953545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9338ccf63648d31cca27e8a45b953545");
            return;
        }
        bVar.t.a((List<f>) list);
        Object[] objArr2 = {list, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "b6e6194f001eed6104935b583126f34d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "b6e6194f001eed6104935b583126f34d");
        } else {
            String string = bVar.b.h().getString(R.string.wm_sc_common_net_error_5);
            if (com.sankuai.shangou.stone.util.a.b(list) && TextUtils.isEmpty(bVar.j) && TextUtils.isEmpty(bVar.k)) {
                bVar.f.a(string, "", bVar.a(1), R.drawable.wm_sc_home_filter_empty, false, "", "");
                u.a(bVar.f);
            } else {
                if (bVar.t.g().size() == 0) {
                    bVar.e.a(0);
                    bVar.t.c(bVar.e.b());
                }
                if (com.sankuai.shangou.stone.util.a.b(list)) {
                    bVar.f.a(string, "", bVar.a(2), R.drawable.wm_sc_home_filter_empty, false, "", "");
                    u.a(bVar.f);
                    bVar.f.setBackgroundColor(Color.parseColor("#F5F5F5"));
                }
            }
        }
        bVar.a(bVar.c.n != 3);
        bVar.h.a();
        if (bVar.r != null) {
            bVar.r.a();
        }
    }

    public static /* synthetic */ void a(b bVar, List list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "8a0192e4efe1e33e7590d580ab015972", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "8a0192e4efe1e33e7590d580ab015972");
            return;
        }
        int min = Math.min(50, com.sankuai.shangou.stone.util.a.a(list));
        int a = z ? bVar.t.a() : 0;
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                f fVar = (f) list.get(i);
                if (fVar != null && fVar.i != null && fVar.i.cardType == 2 && fVar.i.moduleDesc != null && "mach".equals(fVar.i.moduleDesc.nativeId) && !t.a(fVar.i.moduleDesc.templateId)) {
                    fVar.j = bVar.u.a(fVar.i, i + a);
                }
            }
        }
    }

    public b(com.sankuai.waimai.store.widgets.filterbar.home.controller.c cVar, com.sankuai.waimai.store.param.a aVar, int i) {
        super(cVar, aVar, 3);
        Object[] objArr = {cVar, aVar, 3};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e5ce285a39bb3ea9b1463971b19cd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e5ce285a39bb3ea9b1463971b19cd4");
        } else {
            this.v = new com.sankuai.waimai.store.poilist.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.poilist.a
                public final void a(int i2) {
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fa7a21787837b836524e775585df54d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fa7a21787837b836524e775585df54d");
                    } else if (q.a((RecyclerView) b.this.d) > 0) {
                        b.this.e.b(i2);
                    }
                }

                @Override // com.sankuai.waimai.store.poilist.a
                public final void b(int i2) {
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f43863195ba73b46e3c6e66cfda29f2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f43863195ba73b46e3c6e66cfda29f2d");
                    } else {
                        b.this.e.b(-i2);
                    }
                }

                @Override // com.sankuai.waimai.store.poilist.a, android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ce361ac912ad05dbf9da911705fbb44", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ce361ac912ad05dbf9da911705fbb44");
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
                        b.this.b.a(new h(findFirstVisibleItemPositions[0] / 2, findLastVisibleItemPositions[0] / 2, findFirstCompletelyVisibleItemPositions[0] / 2, childAt != null ? childAt.getTop() : 0));
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "996cb077ffe92d9bc77869973310b98b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "996cb077ffe92d9bc77869973310b98b");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i2);
                    b.this.b.a(new i(i2));
                    if (i2 == 0) {
                        com.meituan.android.bus.a.a().c(new VisibleChangeEvent(0, true, b.this.c.y, false, true));
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ce30ad138ed3059e755854b47da3d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ce30ad138ed3059e755854b47da3d6");
            return;
        }
        super.a(view);
        this.u = new com.sankuai.waimai.store.poilist.mach.d(this.b.h(), this.c);
        this.u.b = this.p;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(com.sankuai.waimai.store.param.a aVar, @NonNull final PoiVerticalityDataResponse poiVerticalityDataResponse, boolean z) {
        final List<f> arrayList;
        Object[] objArr = {aVar, poiVerticalityDataResponse, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b3e11a585136a42d2f956b8d39bd9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b3e11a585136a42d2f956b8d39bd9b");
            return;
        }
        Object[] objArr2 = {poiVerticalityDataResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = s;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9d3e5c7d2fa74b04156a521c7545de5", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9d3e5c7d2fa74b04156a521c7545de5");
        } else {
            arrayList = new ArrayList<>();
            if (!com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) {
                a(poiVerticalityDataResponse, poiVerticalityDataResponse.poiCardInfos, arrayList);
            }
        }
        a(arrayList);
        u.c(this.f);
        if (this.b.b(aVar)) {
            i.a aVar2 = new i.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.i.a
                public final void a(final FilterConditionResponse filterConditionResponse) {
                    Object[] objArr3 = {filterConditionResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb4ade6e63b145bbcc129e2b3c9b8331", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb4ade6e63b145bbcc129e2b3c9b8331");
                    } else {
                        b.this.u.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "79f7ae05a689821c25c0d87756a42566", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "79f7ae05a689821c25c0d87756a42566");
                                } else {
                                    b.a(b.this, arrayList, false);
                                }
                            }
                        }, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b.1.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9522058464ee73394b899abdb6fb916c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9522058464ee73394b899abdb6fb916c");
                                    return;
                                }
                                b.this.f.e();
                                u.c(b.this.g);
                                b.a(b.this, poiVerticalityDataResponse, arrayList, filterConditionResponse);
                            }
                        });
                    }
                }
            };
            Object[] objArr3 = {poiVerticalityDataResponse, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = s;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "86d38e0dd48d57e45037b5630b1e0936", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "86d38e0dd48d57e45037b5630b1e0936");
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
        } else {
            this.u.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e23070940289280559f7cdb3ec4cc6f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e23070940289280559f7cdb3ec4cc6f9");
                    } else {
                        b.a(b.this, arrayList, true);
                    }
                }
            }, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7eff1a7a8f004ba5c6e2b01492b19122", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7eff1a7a8f004ba5c6e2b01492b19122");
                        return;
                    }
                    b.this.t.b(arrayList);
                    u.c(b.this.g);
                }
            });
        }
        g();
        a(poiVerticalityDataResponse, false);
        a(this.t, poiVerticalityDataResponse);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc6ba9450f33d11476e32f6cc87c3e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc6ba9450f33d11476e32f6cc87c3e96");
            return;
        }
        c(z);
        c();
    }

    private void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull List<PoiCardInfo> list, @NonNull List<f> list2) {
        Object[] objArr = {poiVerticalityDataResponse, list, list2};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a77633612955d6b9493b0abf07027a51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a77633612955d6b9493b0abf07027a51");
            return;
        }
        int i = 0;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c00a7000e54a425447c28890c9fdf1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c00a7000e54a425447c28890c9fdf1b");
        } else if (this.d.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) this.d.getLayoutManager()).scrollToPositionWithOffset(0, 0);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c364c54176916e13edb2a75659c07a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c364c54176916e13edb2a75659c07a");
        } else if (this.d.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) this.d.getLayoutManager()).scrollToPositionWithOffset(0, 0);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a
    public final void a(PoiChannelBackgroundConfig poiChannelBackgroundConfig, PoiVerticalityDataResponse.Promotion promotion) {
        Object[] objArr = {poiChannelBackgroundConfig, promotion};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589ced46c75f7cc7ee55955a6b32ff9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589ced46c75f7cc7ee55955a6b32ff9a");
        } else if (this.c.l() && !this.c.g()) {
            this.e.a(com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c, poiChannelBackgroundConfig));
        } else {
            com.sankuai.waimai.store.widgets.filterbar.home.model.a a = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(this.b.h(), this.c.F, poiChannelBackgroundConfig);
            a.a(promotion, this.c);
            this.e.a(a);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "743acde0b7dc74840b3760baef411ff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "743acde0b7dc74840b3760baef411ff2");
            return;
        }
        this.t = new com.sankuai.waimai.store.poi.list.newp.adapter.c(this.b.h(), this.c, this.u);
        SCRecyclerView sCRecyclerView = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = s;
        sCRecyclerView.setAdapter(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e733ad97a8c26d76fa5d5c730a8ff2ea", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e733ad97a8c26d76fa5d5c730a8ff2ea") : new j<com.sankuai.waimai.store.widgets.recycler.e>(this.t) { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b.5
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.a
            public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.s sVar) {
                com.sankuai.waimai.store.widgets.recycler.e eVar = (com.sankuai.waimai.store.widgets.recycler.e) sVar;
                Object[] objArr3 = {eVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cac5b7010d924a67644765e61fba6ca4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cac5b7010d924a67644765e61fba6ca4");
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
        sCRecyclerView2.addItemDecoration(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b7a76195015daa719f23d65e80a62d9b", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.f) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b7a76195015daa719f23d65e80a62d9b") : new RecyclerView.f() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b.4
            public static ChangeQuickRedirect a;
            public int b;

            {
                this.b = b.this.b.h().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_1);
            }

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr4 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a10971cf5bba23fa8860a04264095659", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a10971cf5bba23fa8860a04264095659");
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
        });
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b027d93bef2189ec34257fd6bd488901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b027d93bef2189ec34257fd6bd488901");
        } else {
            this.t.a((com.sankuai.waimai.store.widgets.recycler.c) new com.sankuai.waimai.store.poi.list.logreport.e(this.b.h(), this.c));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a2a5e24fe0ac8af61b08d0aa15dcf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a2a5e24fe0ac8af61b08d0aa15dcf6");
        } else {
            this.t.m();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a99157f98f285b143fe282ac96ae69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a99157f98f285b143fe282ac96ae69")).booleanValue() : this.t.e();
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final com.sankuai.waimai.store.poilist.a t() {
        return this.v;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7680d172cd0285625e7bde1eea5f6746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7680d172cd0285625e7bde1eea5f6746");
        } else {
            this.t.a((List<f>) null);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a, com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2067ef1d367ef3e9f82894a963cd749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2067ef1d367ef3e9f82894a963cd749");
            return;
        }
        super.m();
        if (this.u != null) {
            this.u.a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final /* bridge */ /* synthetic */ com.sankuai.waimai.store.widgets.recycler.a v() {
        return this.t;
    }
}
