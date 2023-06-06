package com.sankuai.waimai.store.poi.list.refactor.card.feed_flow;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.m;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.SCViewPagerCompat;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.k;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.c;
import com.sankuai.waimai.store.poi.list.refactor.event.h;
import com.sankuai.waimai.store.poi.list.refactor.event.i;
import com.sankuai.waimai.store.poi.list.refactor.event.j;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.af;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiPageContainerCard4 extends BaseCard implements l<PoiResult>, com.sankuai.waimai.store.assembler.component.a, m, SGCachePagerAdapter.a {
    public static ChangeQuickRedirect h;
    SCViewPagerCompat i;
    PoiPageListPagerAdapter4 j;
    protected RecyclerView k;
    public a l;
    private int m;
    private FrameLayout n;
    private com.sankuai.waimai.store.param.a o;
    private int p;
    private List<CategoryInfo> q;
    private c r;
    private boolean s;
    private boolean t;
    private boolean u;
    private PoiPageViewModel v;
    private boolean w;
    private NetInfoLoadView x;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    @Override // android.arch.lifecycle.l
    public final /* bridge */ /* synthetic */ void a(@Nullable PoiResult poiResult) {
    }

    public static /* synthetic */ c a(PoiPageContainerCard4 poiPageContainerCard4, c cVar) {
        poiPageContainerCard4.r = null;
        return null;
    }

    public static /* synthetic */ void a(PoiPageContainerCard4 poiPageContainerCard4, k kVar) {
        d dVar;
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiPageContainerCard4, changeQuickRedirect, false, "02f5ae17652d1c7575f0e18308473e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiPageContainerCard4, changeQuickRedirect, false, "02f5ae17652d1c7575f0e18308473e96");
        } else if (kVar != null) {
            poiPageContainerCard4.i.setCurrentItem(kVar.b);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, poiPageContainerCard4, changeQuickRedirect2, false, "b7e81260eb780b74c285b5cf446debc1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiPageContainerCard4, changeQuickRedirect2, false, "b7e81260eb780b74c285b5cf446debc1");
            } else if (!(poiPageContainerCard4.j.a(poiPageContainerCard4.i.getCurrentItem(), poiPageContainerCard4.i) instanceof d) || (dVar = (d) poiPageContainerCard4.j.a(poiPageContainerCard4.i.getCurrentItem(), poiPageContainerCard4.i)) == null) {
            } else {
                Object[] objArr3 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "07ad00f472b3ef537cb2550f295cc665", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "07ad00f472b3ef537cb2550f295cc665");
                } else {
                    dVar.i.b(true);
                }
            }
        }
    }

    public static /* synthetic */ void a(PoiPageContainerCard4 poiPageContainerCard4, final PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiPageContainerCard4, changeQuickRedirect, false, "08f2614b1be81e74843ef0ac2c8c17ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiPageContainerCard4, changeQuickRedirect, false, "08f2614b1be81e74843ef0ac2c8c17ec");
        } else if (poiVerticalityDataResponse != null) {
            poiPageContainerCard4.q = poiVerticalityDataResponse.subNaviInfo != null ? poiVerticalityDataResponse.subNaviInfo.categoryInfos : null;
            ArrayList arrayList = new ArrayList();
            if (!com.sankuai.shangou.stone.util.a.b(poiPageContainerCard4.q)) {
                int i = 0;
                for (CategoryInfo categoryInfo : poiPageContainerCard4.q) {
                    if (categoryInfo != null) {
                        if (categoryInfo.isShow == 1) {
                            poiPageContainerCard4.p = i;
                            poiPageContainerCard4.o.f = categoryInfo.code;
                            poiPageContainerCard4.o.K = categoryInfo.template_code;
                        }
                        categoryInfo.index = i;
                        i++;
                        arrayList.add(new com.sankuai.waimai.store.poi.list.model.c(categoryInfo));
                    }
                }
            } else {
                arrayList.add(new com.sankuai.waimai.store.poi.list.model.c("0", "", poiPageContainerCard4.o.K));
            }
            poiPageContainerCard4.u = true;
            poiPageContainerCard4.j.c();
            PoiPageListPagerAdapter4 poiPageListPagerAdapter4 = poiPageContainerCard4.j;
            Object[] objArr2 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = PoiPageListPagerAdapter4.a;
            if (PatchProxy.isSupport(objArr2, poiPageListPagerAdapter4, changeQuickRedirect2, false, "a9482d6e219038b475521cb53417c204", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiPageListPagerAdapter4, changeQuickRedirect2, false, "a9482d6e219038b475521cb53417c204");
            } else {
                poiPageListPagerAdapter4.b.clear();
                if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                    poiPageListPagerAdapter4.b.addAll(arrayList);
                }
                poiPageListPagerAdapter4.notifyDataSetChanged();
            }
            if (poiPageContainerCard4.o.n == 0 || poiPageContainerCard4.o.n == 1) {
                poiPageContainerCard4.i.setAdapter(poiPageContainerCard4.j);
            }
            if (poiPageContainerCard4.i.getCurrentItem() != poiPageContainerCard4.p) {
                poiPageContainerCard4.i.setCurrentItem(poiPageContainerCard4.p);
            }
            if (poiPageContainerCard4.o.bl) {
                Object[] objArr3 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, poiPageContainerCard4, changeQuickRedirect3, false, "3577ee8460615c8c868f98f203f63552", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, poiPageContainerCard4, changeQuickRedirect3, false, "3577ee8460615c8c868f98f203f63552");
                } else if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.subNaviInfo != null && poiVerticalityDataResponse.subNaviInfo.categoryInfos != null) {
                    poiPageContainerCard4.m = com.sankuai.shangou.stone.util.a.c(poiVerticalityDataResponse.subNaviInfo.categoryInfos);
                }
                new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e5800c11dccf31177e1b2119a2b3562", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e5800c11dccf31177e1b2119a2b3562");
                            return;
                        }
                        try {
                            PoiPageContainerCard4.this.a(poiVerticalityDataResponse.subNaviInfo, poiVerticalityDataResponse.spuQuickFilter);
                        } catch (Exception unused) {
                        }
                    }
                }, 40L);
                return;
            }
            poiPageContainerCard4.a(poiVerticalityDataResponse.subNaviInfo, poiVerticalityDataResponse.spuQuickFilter);
        }
    }

    public static /* synthetic */ void a(PoiPageContainerCard4 poiPageContainerCard4, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiPageContainerCard4, changeQuickRedirect, false, "1df34927765a3053e3fbae53d91d9de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiPageContainerCard4, changeQuickRedirect, false, "1df34927765a3053e3fbae53d91d9de4");
        } else {
            poiPageContainerCard4.a(z, false);
        }
    }

    public static /* synthetic */ void b(PoiPageContainerCard4 poiPageContainerCard4, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        d dVar;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiPageContainerCard4, changeQuickRedirect, false, "2cc64689fa7aa468bbee858675853a48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiPageContainerCard4, changeQuickRedirect, false, "2cc64689fa7aa468bbee858675853a48");
            return;
        }
        try {
            if (poiPageContainerCard4.u && (poiPageContainerCard4.j.a(poiPageContainerCard4.p, poiPageContainerCard4.i) instanceof d) && (dVar = (d) poiPageContainerCard4.j.a(poiPageContainerCard4.p, poiPageContainerCard4.i)) != null) {
                poiPageContainerCard4.u = false;
                dVar.a(poiPageContainerCard4.o, poiVerticalityDataResponse);
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.poi.list.refactor.cat.a.a(poiPageContainerCard4.o.c, poiPageContainerCard4.getClass().getSimpleName(), e);
        }
    }

    public static /* synthetic */ void d(PoiPageContainerCard4 poiPageContainerCard4) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiPageContainerCard4, changeQuickRedirect, false, "81b47a79d0e9ada2d8833a639752e85e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiPageContainerCard4, changeQuickRedirect, false, "81b47a79d0e9ada2d8833a639752e85e");
            return;
        }
        d dVar = (d) com.sankuai.shangou.stone.util.a.a((List<Object>) poiPageContainerCard4.g(), poiPageContainerCard4.r != null ? poiPageContainerCard4.r.b : 0);
        if (dVar != null) {
            dVar.i();
            dVar.c(true);
        }
        if (poiPageContainerCard4.f != null) {
            poiPageContainerCard4.f.a();
        }
    }

    public PoiPageContainerCard4(f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7016356ad77fc9c2b5fcd6adf59e0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7016356ad77fc9c2b5fcd6adf59e0e");
            return;
        }
        this.s = false;
        this.t = false;
        this.u = false;
        this.w = false;
        this.l = new a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3168a65a236c907cfb8fb9795a49919b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3168a65a236c907cfb8fb9795a49919b");
                } else if (PoiPageContainerCard4.this.f != null) {
                    PoiPageContainerCard4.this.f.b(z);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b0e64c3e73c3333bd510b3f37a1aae", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b0e64c3e73c3333bd510b3f37a1aae");
        }
        this.o = ((PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class)).d.a();
        if (!com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).a() && com.sankuai.waimai.store.base.abtest.a.f() && this.o.bh != null) {
            View a2 = this.o.bh.a(this.e, R.layout.wm_sc_home_channel_refactor_page_container);
            viewGroup.addView(a2);
            return a2;
        }
        return LayoutInflater.from(this.e).inflate(R.layout.wm_sc_home_channel_refactor_page_container, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ceaa3f874d1ef79f9f50c4edf602b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ceaa3f874d1ef79f9f50c4edf602b35");
            return;
        }
        super.a(view);
        this.v = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.o = this.v.d.a();
        this.n = (FrameLayout) a(R.id.fl_poi_category_container);
        this.x = (NetInfoLoadView) a(R.id.net_info_load_view);
        this.k = (RecyclerView) view.findViewById(R.id.rv_wm_sc_skeleton);
        this.x.setBackgroundResource(R.color.wm_sg_color_F5F5F6);
        this.i = (SCViewPagerCompat) a(R.id.viewpager_content);
        d();
        this.v.b.a(this.d, this);
        this.v.c.a(this.d, new l<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse) {
                PoiVerticalityDataResponse poiVerticalityDataResponse2 = poiVerticalityDataResponse;
                Object[] objArr2 = {poiVerticalityDataResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a0c4471111198a18f8dd3e019258025", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a0c4471111198a18f8dd3e019258025");
                    return;
                }
                PoiPageContainerCard4.this.x.e();
                u.c(PoiPageContainerCard4.this.k);
                PoiPageContainerCard4.a(PoiPageContainerCard4.this, poiVerticalityDataResponse2);
                PoiPageContainerCard4.b(PoiPageContainerCard4.this, poiVerticalityDataResponse2);
            }
        });
        this.v.f.a(this.d, new l<Boolean>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.7
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable @org.jetbrains.annotations.Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33f62b90d9175c997bf94ccf391a9ea6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33f62b90d9175c997bf94ccf391a9ea6");
                } else if (bool2.booleanValue()) {
                    if (PoiPageContainerCard4.this.r != null) {
                        PoiPageContainerCard4.this.r.a();
                        PoiPageContainerCard4.a(PoiPageContainerCard4.this, (c) null);
                    }
                    PoiPageContainerCard4.this.d();
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f97bb501fc7d44204cf79f466c3d7357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f97bb501fc7d44204cf79f466c3d7357");
        } else {
            a(k.class, new l<k>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.9
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable k kVar) {
                    k kVar2 = kVar;
                    Object[] objArr3 = {kVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3122c969f334d4d57134c277c029537a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3122c969f334d4d57134c277c029537a");
                    } else if (kVar2 != null) {
                        PoiPageContainerCard4.a(PoiPageContainerCard4.this, kVar2);
                        if (kVar2.c) {
                            PoiPageContainerCard4.a(PoiPageContainerCard4.this, false);
                        }
                    }
                }
            });
            a(j.class, new l<j>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.10
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable j jVar) {
                    j jVar2 = jVar;
                    Object[] objArr3 = {jVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85ee3196a2d728a53c13cab3ca45cd4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85ee3196a2d728a53c13cab3ca45cd4f");
                    } else if (jVar2 != null) {
                        PoiPageContainerCard4.a(PoiPageContainerCard4.this, true);
                    }
                }
            });
            a(com.sankuai.waimai.store.poi.list.newp.block.rxevent.j.class, new l<com.sankuai.waimai.store.poi.list.newp.block.rxevent.j>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.11
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.poi.list.newp.block.rxevent.j jVar) {
                    com.sankuai.waimai.store.poi.list.newp.block.rxevent.j jVar2 = jVar;
                    Object[] objArr3 = {jVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "40ad7b798939f995f0e90906e09d7150", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "40ad7b798939f995f0e90906e09d7150");
                    } else if (jVar2 != null) {
                        if (jVar2.a) {
                            PoiPageContainerCard4.d(PoiPageContainerCard4.this);
                        } else {
                            PoiPageContainerCard4.a(PoiPageContainerCard4.this, false);
                        }
                    }
                }
            });
            a(com.sankuai.waimai.store.poi.list.newp.block.rxevent.b.class, new l<com.sankuai.waimai.store.poi.list.newp.block.rxevent.b>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.12
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.poi.list.newp.block.rxevent.b bVar) {
                    com.sankuai.waimai.store.poi.list.newp.block.rxevent.b bVar2 = bVar;
                    Object[] objArr3 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ad2b0ddaeb46f6b39ae7421b92e0447e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ad2b0ddaeb46f6b39ae7421b92e0447e");
                    } else if (bVar2 == null || PoiPageContainerCard4.this.f == null) {
                    } else {
                        PoiPageContainerCard4.this.f.a(bVar2.a);
                    }
                }
            });
            a(com.sankuai.waimai.store.poi.list.refactor.event.d.class, new l<com.sankuai.waimai.store.poi.list.refactor.event.d>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.13
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.poi.list.refactor.event.d dVar) {
                    d dVar2;
                    Object[] objArr3 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ee45057fdcec3a3f95f7785110c0a7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ee45057fdcec3a3f95f7785110c0a7d");
                        return;
                    }
                    PoiPageContainerCard4 poiPageContainerCard4 = PoiPageContainerCard4.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = PoiPageContainerCard4.h;
                    if (PatchProxy.isSupport(objArr4, poiPageContainerCard4, changeQuickRedirect4, false, "cfafeb5c1c8bb4e56badecaecb68dd6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, poiPageContainerCard4, changeQuickRedirect4, false, "cfafeb5c1c8bb4e56badecaecb68dd6d");
                    } else if (!(poiPageContainerCard4.j.a(poiPageContainerCard4.i.getCurrentItem(), poiPageContainerCard4.i) instanceof d) || (dVar2 = (d) poiPageContainerCard4.j.a(poiPageContainerCard4.i.getCurrentItem(), poiPageContainerCard4.i)) == null) {
                    } else {
                        Object[] objArr5 = {(byte) 1};
                        ChangeQuickRedirect changeQuickRedirect5 = d.a;
                        if (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "ec72402281de6a44eeb6ed958042da06", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "ec72402281de6a44eeb6ed958042da06");
                            return;
                        }
                        dVar2.c(true);
                        dVar2.i();
                    }
                }
            });
            a(com.sankuai.waimai.store.poi.list.newp.block.rxevent.f.class, new l<com.sankuai.waimai.store.poi.list.newp.block.rxevent.f>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.2
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.poi.list.newp.block.rxevent.f fVar) {
                    Object[] objArr3 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "70a323924c66e309f04f5084669f44e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "70a323924c66e309f04f5084669f44e7");
                        return;
                    }
                    d h2 = PoiPageContainerCard4.this.h();
                    if (h2 != null) {
                        h2.b(true);
                    }
                }
            });
            a(h.class, new l<h>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.3
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable h hVar) {
                    Object[] objArr3 = {hVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7de1ee992d8ab2b6e4222b6f6bed9090", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7de1ee992d8ab2b6e4222b6f6bed9090");
                    } else {
                        PoiPageContainerCard4.this.a(true, true);
                    }
                }
            });
        }
        view.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.8
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35b75a4d14cd1777c024738616f12702", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35b75a4d14cd1777c024738616f12702");
                    return;
                }
                try {
                    af.a((SCBaseActivity) PoiPageContainerCard4.this.e, "sg.channel.setdataend2.native");
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639f9223c9a4bfcc753d9bc014a5d2b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639f9223c9a4bfcc753d9bc014a5d2b4");
            return;
        }
        this.j = new PoiPageListPagerAdapter4((SCBaseActivity) this.e, this.o);
        this.j.a(this);
        this.j.c = this.l;
        this.i.setAdapter(this.j);
        this.i.setOffscreenPageLimit(1);
        this.i.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f851cbc468255527a17a5d46914cfe1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f851cbc468255527a17a5d46914cfe1");
                } else if (PoiPageContainerCard4.this.r != null) {
                    PoiPageContainerCard4.this.r.a(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d9f579e2c1c3be0853287aa9aaab6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d9f579e2c1c3be0853287aa9aaab6c");
            return;
        }
        c();
        if (!o.d()) {
            this.x.b();
        } else {
            com.sankuai.waimai.store.poi.list.newp.block.helper.b.a(this.o.l() ? 2 : 1, (SCBaseActivity) this.e, this.k);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter.a
    public final void a(int i, com.sankuai.waimai.store.base.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a3bd0aaa27aee3a4e4c5a720bbc66d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a3bd0aaa27aee3a4e4c5a720bbc66d");
            return;
        }
        try {
            if (this.u && this.p == i && (bVar instanceof d) && this.v.b.a() != null && this.v.c.a() != null) {
                this.u = false;
                ((d) bVar).a(this.o, this.v.c.a());
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.poi.list.refactor.cat.a.a(this.o.c, getClass().getSimpleName(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PoiVerticalityDataResponse.SubNaviInfo subNaviInfo, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {subNaviInfo, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ba4ad0b7707070f4260140ca075c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ba4ad0b7707070f4260140ca075c88");
        } else if (subNaviInfo != null && b.b(subNaviInfo.categoryInfos)) {
            if (this.r == null || this.o.v()) {
                this.r = new c(this.e, this.f);
                this.r.createAndReplaceView(this.n);
            }
            c.a aVar = new c.a();
            aVar.a = subNaviInfo.categoryInfos;
            aVar.c = subNaviInfo.subNavStyle;
            aVar.b = this.p;
            if (filterConditionResponse != null && filterConditionResponse.hasValuedFilterData()) {
                aVar.d = true;
            }
            this.r.a(aVar, e(), f());
            a(this.o.v() ? 0 : 9, aVar.c == 5);
        } else {
            if (this.r == null) {
                this.r = new c(this.e, this.f);
                this.r.createAndReplaceView(this.n);
            }
            this.r.a();
        }
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611c8fa9affeccdc9706be2fd09cbb45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611c8fa9affeccdc9706be2fd09cbb45");
        } else if (this.o.y || this.r.getView().getVisibility() != 8) {
            if (z) {
                ((ViewGroup.MarginLayoutParams) this.i.getLayoutParams()).setMargins(0, 0, 0, 0);
            }
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            if (z) {
                i = 0;
            }
            marginLayoutParams.setMargins(0, i, 0, 0);
        }
    }

    private PoiChannelBackgroundConfig e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7006d38e8b67126ea3ed8f6acc73e60", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiChannelBackgroundConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7006d38e8b67126ea3ed8f6acc73e60");
        }
        try {
            PoiResult a2 = this.v.b.a();
            if (a2 == null || a2.response == null) {
                return null;
            }
            return a2.response.getBackgroundConfig();
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return null;
        }
    }

    private PoiVerticalityDataResponse.Promotion f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09551ecad6db43aaa94e415fa6a33d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiVerticalityDataResponse.Promotion) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09551ecad6db43aaa94e415fa6a33d6");
        }
        try {
            PoiResult a2 = this.v.b.a();
            if (a2 == null || a2.response == null) {
                return null;
            }
            return a2.response.getBackgroundPromotion();
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bf63f59642161795e2a93f4b3f811bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bf63f59642161795e2a93f4b3f811bc")).intValue();
        }
        if (this.r == null) {
            if (this.o.bl) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb3c18807fb0ae9f28b56979f75c84fc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb3c18807fb0ae9f28b56979f75c84fc")).intValue() : com.sankuai.shangou.stone.util.h.a(this.e, this.o.a(this.m));
            }
            return super.b();
        }
        return this.r.b();
    }

    @Override // com.sankuai.waimai.store.assembler.component.m
    public final void a(boolean z, boolean z2, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ade3a0fdfaf0cd4f5761db90649634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ade3a0fdfaf0cd4f5761db90649634");
            return;
        }
        if (this.f != null) {
            this.f.a(z, z2);
        }
        if (this.o.f() && this.w != z) {
            this.w = z;
            this.o.X = z;
            if (this.r != null) {
                this.r.b(z);
            }
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.widgets.filterbar.event.a(z, z2, this.e));
        }
        if (this.s != z2) {
            this.s = z2;
            if (this.o.f()) {
                this.i.setNoScroll(z2);
            }
            this.o.W = z2;
            if (this.r != null) {
                this.r.a(z, z2);
                this.r.c = true;
                a((!this.s && (!this.o.v() || this.o.bm)) ? 9 : 0, false);
            }
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.widgets.filterbar.event.a(z, z2, this.e));
        }
        if (b.a(this.o, this.q)) {
            return;
        }
        if (this.o.y || this.o.B) {
            if (z2) {
                if (this.t) {
                    return;
                }
                this.t = true;
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.d(true));
            } else if (this.t) {
                this.t = false;
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.d(false));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2) {
        boolean z3 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41a552acff849e19b54b8fea7c163e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41a552acff849e19b54b8fea7c163e8");
            return;
        }
        if ((!this.s || this.o.y || this.o.bl) ? false : false) {
            return;
        }
        d dVar = (d) com.sankuai.shangou.stone.util.a.a((List<Object>) g(), this.r != null ? this.r.b : 0);
        if (dVar != null) {
            dVar.i();
        }
        if (z && b.a(this.o, this.q)) {
            b((PoiPageContainerCard4) new i(z2));
        } else if (this.f != null) {
            this.f.a(this, z2, this.o.aW);
        }
    }

    private List<d> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d5fae7b78fd17be48c9d641bf649a98", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d5fae7b78fd17be48c9d641bf649a98");
        }
        if (this.j == null || this.i == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.j.getCount(); i++) {
            com.sankuai.waimai.store.base.b a2 = this.j.a(i, this.i);
            if (a2 instanceof d) {
                arrayList.add((d) a2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6f392a420b222770b86b7e85614eb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6f392a420b222770b86b7e85614eb7");
        }
        return (d) com.sankuai.shangou.stone.util.a.a((List<Object>) g(), this.r != null ? this.r.b : 0);
    }

    @Override // com.sankuai.waimai.store.assembler.component.a
    public final void a(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f2b961fec0c4e5b3962291262d262c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f2b961fec0c4e5b3962291262d262c8");
            return;
        }
        d h2 = h();
        if (h2 != null) {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, h2, changeQuickRedirect2, false, "c8248cfe8761ffba9aff26c3eff32a08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, h2, changeQuickRedirect2, false, "c8248cfe8761ffba9aff26c3eff32a08");
            } else {
                h2.b(false);
            }
        }
    }
}
