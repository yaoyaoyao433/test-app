package com.sankuai.waimai.store.drug.home.new_home;

import android.app.Dialog;
import android.arch.lifecycle.q;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.new_home.j;
import com.sankuai.waimai.store.drug.home.new_home.presenter.a;
import com.sankuai.waimai.store.drug.home.new_home.realtime.NewDrugHomeRealtimeViewModel;
import com.sankuai.waimai.store.drug.home.newp.block.listAndFilterStrategy.SafeLinearLayoutManager;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.c;
import com.sankuai.waimai.store.drug.home.widget.skeleon.a;
import com.sankuai.waimai.store.drug.newwidgets.DrugNetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewDrugHomeFeedFlowCard extends BaseCard implements android.arch.lifecycle.l<PoiVerticalityDataResponse>, com.sankuai.waimai.store.assembler.component.m, com.sankuai.waimai.store.drug.home.new_home.filter.d, a.b, com.sankuai.waimai.store.newwidgets.list.n {
    public static ChangeQuickRedirect h;
    private NewDrugHomeRealtimeViewModel A;
    private Dialog B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private LinearLayout i;
    private FrameLayout j;
    private DrugNetInfoLoadView k;
    private SCRecyclerView l;
    private SCRecyclerView m;
    private LoadingFooterView n;
    private LoadingFooterView o;
    private com.sankuai.waimai.store.param.a p;
    private j q;
    private b r;
    private a.InterfaceC1151a s;
    private PoiPageViewModel t;
    private Map<String, List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>> u;
    private CategoryInfo v;
    private LinearLayoutManager w;
    private long x;
    private boolean y;
    private com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.c z;

    public static /* synthetic */ void b(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, CategoryInfo categoryInfo) {
        boolean z = true;
        boolean z2 = false;
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, newDrugHomeFeedFlowCard, changeQuickRedirect, false, "bcc7f59060214f16244664922e1c2649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, newDrugHomeFeedFlowCard, changeQuickRedirect, false, "bcc7f59060214f16244664922e1c2649");
        } else if (!newDrugHomeFeedFlowCard.g() || i(categoryInfo)) {
        } else {
            newDrugHomeFeedFlowCard.h();
            if (categoryInfo.index != newDrugHomeFeedFlowCard.v.index) {
                newDrugHomeFeedFlowCard.m();
                newDrugHomeFeedFlowCard.o();
                com.sankuai.waimai.store.drug.home.new_home.util.b.a(categoryInfo, newDrugHomeFeedFlowCard.v);
                newDrugHomeFeedFlowCard.d(categoryInfo);
                if (categoryInfo.isDataLoadedSuccess) {
                    if (newDrugHomeFeedFlowCard.g(categoryInfo)) {
                        newDrugHomeFeedFlowCard.j();
                        return;
                    }
                    List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list = newDrugHomeFeedFlowCard.u.get(categoryInfo.code);
                    if (newDrugHomeFeedFlowCard.c(categoryInfo, list)) {
                        newDrugHomeFeedFlowCard.l.a();
                        newDrugHomeFeedFlowCard.j();
                        z2 = true;
                    }
                    if (newDrugHomeFeedFlowCard.b(categoryInfo, list)) {
                        newDrugHomeFeedFlowCard.g(categoryInfo);
                        newDrugHomeFeedFlowCard.j();
                    } else {
                        z = z2;
                    }
                    if (com.sankuai.shangou.stone.util.a.b(list) || z) {
                        return;
                    }
                    categoryInfo.requestMode = 3;
                    newDrugHomeFeedFlowCard.a(categoryInfo, list);
                    return;
                }
                categoryInfo.requestMode = 3;
                if (!categoryInfo.isLoading) {
                    newDrugHomeFeedFlowCard.s.a(categoryInfo);
                }
                newDrugHomeFeedFlowCard.e(categoryInfo);
            }
        }
    }

    public static /* synthetic */ void k(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, newDrugHomeFeedFlowCard, changeQuickRedirect, false, "2686bd792641f4d8fd1ed0044442ae07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, newDrugHomeFeedFlowCard, changeQuickRedirect, false, "2686bd792641f4d8fd1ed0044442ae07");
        } else if (newDrugHomeFeedFlowCard.f != null) {
            newDrugHomeFeedFlowCard.f.a();
        }
    }

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse) {
        final CategoryInfo categoryInfo;
        final PoiVerticalityDataResponse poiVerticalityDataResponse2 = poiVerticalityDataResponse;
        Object[] objArr = {poiVerticalityDataResponse2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4ce4db762ce72ef6abab3b96a93e77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4ce4db762ce72ef6abab3b96a93e77");
            return;
        }
        this.E = !com.sankuai.waimai.store.manager.user.a.a().b();
        this.n.setLoadingTipText(this.e.getString(R.string.drug_homepage_user_login_loading_tip));
        if (poiVerticalityDataResponse2 != null && (categoryInfo = this.t.c().get(0)) != null) {
            this.C = false;
            this.A.c();
            d(categoryInfo);
            this.s.a();
            e(categoryInfo);
            Object[] objArr2 = {categoryInfo, poiVerticalityDataResponse2};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c1f1e524c602be36211f195b1b332df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c1f1e524c602be36211f195b1b332df");
            } else {
                if (this.f != null) {
                    this.f.a(true);
                }
                List<BaseModuleDesc> b = b(poiVerticalityDataResponse2);
                o();
                m();
                if (!com.sankuai.shangou.stone.util.a.b(b)) {
                    a(categoryInfo, b, poiVerticalityDataResponse2, b(categoryInfo, poiVerticalityDataResponse2) ? 1 : 0);
                    this.q.a(new j.a() { // from class: com.sankuai.waimai.store.drug.home.new_home.NewDrugHomeFeedFlowCard.6
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.drug.home.new_home.j.a
                        public final void a(@Nullable List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
                            Object[] objArr3 = {list};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9272400606627c5c80fcb167f40a1f6a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9272400606627c5c80fcb167f40a1f6a");
                                return;
                            }
                            categoryInfo.isLoading = false;
                            if (!com.sankuai.shangou.stone.util.a.b(list)) {
                                categoryInfo.isDataLoadedSuccess = true;
                                NewDrugHomeFeedFlowCard.this.a(list, categoryInfo, poiVerticalityDataResponse2);
                                List l = NewDrugHomeFeedFlowCard.this.l();
                                NewDrugHomeFeedFlowCard.this.u.put(categoryInfo.code, list);
                                categoryInfo.cellSize = list.size();
                                NewDrugHomeFeedFlowCard.this.r.a(list);
                                NewDrugHomeFeedFlowCard.this.j();
                                NewDrugHomeFeedFlowCard.this.b((List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>) l);
                                if (NewDrugHomeFeedFlowCard.this.E) {
                                    NewDrugHomeFeedFlowCard.this.n.setLoadingTipText(NewDrugHomeFeedFlowCard.this.e.getString(R.string.drug_homepage_user_un_login_loading_tip));
                                    NewDrugHomeFeedFlowCard.this.n();
                                }
                            }
                            if (NewDrugHomeFeedFlowCard.this.f != null) {
                                NewDrugHomeFeedFlowCard.this.f.a(false);
                            }
                        }
                    }, new ArrayList(b));
                } else {
                    j();
                    categoryInfo.isLoading = false;
                    categoryInfo.isDataLoadedSuccess = true;
                    ArrayList arrayList = new ArrayList();
                    a(arrayList, categoryInfo, poiVerticalityDataResponse2);
                    a(arrayList, categoryInfo, b(categoryInfo, poiVerticalityDataResponse2) ? 1 : 0);
                    List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> l = l();
                    this.u.put(categoryInfo.code, arrayList);
                    categoryInfo.cellSize = arrayList.size();
                    this.r.a((List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>) arrayList);
                    if (this.f != null) {
                        this.f.a(false);
                    }
                    b(l);
                }
            }
            a(poiVerticalityDataResponse2, 0);
            this.C = true;
            com.sankuai.waimai.store.drug.home.new_home.util.b.a(this.t.c());
            com.sankuai.waimai.store.drug.home.new_home.util.b.a(categoryInfo, null);
            return;
        }
        i();
    }

    public NewDrugHomeFeedFlowCard(android.arch.lifecycle.f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2985f424a60580c90f319a8201f7b676", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2985f424a60580c90f319a8201f7b676");
            return;
        }
        this.u = new HashMap();
        this.y = false;
        this.C = false;
        this.D = 0;
        this.E = false;
        this.F = false;
        this.G = com.sankuai.shangou.stone.util.h.b(this.e);
        this.H = com.sankuai.shangou.stone.util.h.a(this.e, 30.0f);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fa6318629b0d486816c7b74902df1e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fa6318629b0d486816c7b74902df1e0");
        }
        this.i = new LinearLayout(this.e);
        this.i.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.i.setLayoutParams(layoutParams);
        this.j = new FrameLayout(this.e);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        this.j.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = new FrameLayout(this.e);
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-1, -1);
        frameLayout.setLayoutParams(layoutParams3);
        this.i.addView(this.j, layoutParams2);
        this.i.addView(frameLayout, layoutParams3);
        this.l = new SCRecyclerView(this.e);
        this.l.setNestedScrollingEnabled(false);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, -1);
        this.l.setLayoutParams(layoutParams4);
        this.k = new DrugNetInfoLoadView(this.e);
        ViewGroup.LayoutParams layoutParams5 = new ViewGroup.LayoutParams(-1, -1);
        this.k.setLayoutParams(layoutParams5);
        this.m = new SCRecyclerView(this.e);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        this.m.setLayoutParams(layoutParams6);
        frameLayout.addView(this.l, layoutParams4);
        frameLayout.addView(this.k, layoutParams5);
        frameLayout.addView(this.m, layoutParams6);
        this.k.setVisibility(8);
        viewGroup.addView(this.i, layoutParams);
        return viewGroup;
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5aa86b9b8e77ee0f4ccf7f5f105978b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5aa86b9b8e77ee0f4ccf7f5f105978b");
            return;
        }
        super.a(view);
        this.A = (NewDrugHomeRealtimeViewModel) q.a(this.e).a(NewDrugHomeRealtimeViewModel.class);
        this.t = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.p = this.t.d.a();
        this.s = new com.sankuai.waimai.store.drug.home.new_home.presenter.b(this, this.p);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52ce4ca84e4b3435f8a0ccdd8e7668a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52ce4ca84e4b3435f8a0ccdd8e7668a2");
        } else {
            this.n = new LoadingFooterView(this.e);
            this.n.setNoMoreViewHeight(R.dimen.wm_sc_common_dimen_60);
            this.n.a();
            this.o = new LoadingFooterView(this.e);
            this.o.setNoMoreViewHeight(R.dimen.wm_sc_common_dimen_40);
            this.o.a();
            this.q = new j((SCBaseActivity) this.e, this.p);
            this.r = new b((SCBaseActivity) this.e, this.q, this, this.p);
            this.r.d(this.n);
            this.r.c((View) this.o);
            this.w = new SafeLinearLayoutManager(this.e, 1, false);
            this.l.setLayoutManager(this.w);
            this.l.setAdapter(new com.sankuai.waimai.store.widgets.recycler.j(this.r));
            this.l.addOnScrollListener(new com.sankuai.waimai.store.drug.home.newp.block.listAndFilterStrategy.a(this, 2));
            this.l.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.drug.home.new_home.NewDrugHomeFeedFlowCard.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e658d9e20205407aaa7840f5a453cd18", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e658d9e20205407aaa7840f5a453cd18");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    NewDrugHomeFeedFlowCard.this.b((NewDrugHomeFeedFlowCard) new com.sankuai.waimai.store.drug.home.newp.block.rxevent.b(i));
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    com.sankuai.waimai.store.poilist.mach.f fVar;
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "94718572c52702e9c71f73a1d7a1564d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "94718572c52702e9c71f73a1d7a1564d");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (NewDrugHomeFeedFlowCard.this.g()) {
                        if (NewDrugHomeFeedFlowCard.this.E) {
                            if (i2 > 0) {
                                NewDrugHomeFeedFlowCard.this.k();
                            }
                            if (!NewDrugHomeFeedFlowCard.this.F || i2 == 0) {
                                return;
                            }
                            NewDrugHomeFeedFlowCard.this.p();
                            return;
                        }
                        int max = Math.max(NewDrugHomeFeedFlowCard.this.w.findLastVisibleItemPosition() - 1, 0);
                        if (i2 > 0) {
                            com.sankuai.waimai.store.poilist.mach.f fVar2 = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) NewDrugHomeFeedFlowCard.this.r.b, Math.max(NewDrugHomeFeedFlowCard.this.w.findFirstVisibleItemPosition() - 1, 0));
                            if (fVar2 == null || fVar2.a == 0 || ((BaseModuleDesc) fVar2.a).categoryInfo == null || ((BaseModuleDesc) fVar2.a).categoryInfo.index <= NewDrugHomeFeedFlowCard.this.v.index) {
                                return;
                            }
                            com.sankuai.waimai.store.drug.home.new_home.util.b.a(((BaseModuleDesc) fVar2.a).categoryInfo, NewDrugHomeFeedFlowCard.this.v);
                            NewDrugHomeFeedFlowCard.this.d(((BaseModuleDesc) fVar2.a).categoryInfo);
                            if (NewDrugHomeFeedFlowCard.this.z != null) {
                                NewDrugHomeFeedFlowCard.this.z.a(NewDrugHomeFeedFlowCard.this.v.index);
                            }
                        } else if (i2 >= 0 || (fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) NewDrugHomeFeedFlowCard.this.r.b, max)) == null || fVar.a == 0 || ((BaseModuleDesc) fVar.a).categoryInfo == null || ((BaseModuleDesc) fVar.a).categoryInfo.index >= NewDrugHomeFeedFlowCard.this.v.index) {
                        } else {
                            com.sankuai.waimai.store.drug.home.new_home.util.b.a(((BaseModuleDesc) fVar.a).categoryInfo, NewDrugHomeFeedFlowCard.this.v);
                            NewDrugHomeFeedFlowCard.this.d(((BaseModuleDesc) fVar.a).categoryInfo);
                            if (NewDrugHomeFeedFlowCard.this.z != null) {
                                NewDrugHomeFeedFlowCard.this.z.a(NewDrugHomeFeedFlowCard.this.v.index);
                            }
                        }
                    }
                }
            });
        }
        this.t.c.a(this.d, this);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9cdab6c6372d20589798ccdb42ef5a73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9cdab6c6372d20589798ccdb42ef5a73");
        } else {
            android.arch.lifecycle.k<com.sankuai.waimai.store.drug.home.new_home.realtime.a<Pair<CategoryInfo, BaseModuleDesc>>> kVar = this.A.m;
            android.arch.lifecycle.f fVar = this.d;
            Object[] objArr4 = {this};
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            kVar.a(fVar, PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "468d93994b35ed69e8ea9df2bd2a41fd", RobustBitConfig.DEFAULT_VALUE) ? (android.arch.lifecycle.l) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "468d93994b35ed69e8ea9df2bd2a41fd") : new d(this));
            android.arch.lifecycle.k<com.sankuai.waimai.store.drug.home.new_home.realtime.a<Pair<CategoryInfo, List<BaseModuleDesc>>>> kVar2 = this.A.n;
            android.arch.lifecycle.f fVar2 = this.d;
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = e.a;
            kVar2.a(fVar2, PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "51ca32b5da187db675defef4507ee749", RobustBitConfig.DEFAULT_VALUE) ? (android.arch.lifecycle.l) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "51ca32b5da187db675defef4507ee749") : new e(this));
            android.arch.lifecycle.k<PoiVerticalityDataResponse> kVar3 = this.A.o;
            android.arch.lifecycle.f fVar3 = this.d;
            Object[] objArr6 = {this};
            ChangeQuickRedirect changeQuickRedirect6 = f.a;
            kVar3.a(fVar3, PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "daec1ee92e2c7c32d623b411235e97ca", RobustBitConfig.DEFAULT_VALUE) ? (android.arch.lifecycle.l) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "daec1ee92e2c7c32d623b411235e97ca") : new f(this));
        }
        this.m.setBackground(new e.a().c(ContextCompat.getColor(this.e, R.color.wm_sg_color_F5F5F6)).a());
        final FragmentActivity fragmentActivity = this.e;
        SCRecyclerView sCRecyclerView = this.m;
        Object[] objArr7 = {1, fragmentActivity, sCRecyclerView};
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.drug.home.widget.skeleon.c.a;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "2566d7c9952d4489f7f805d9fed1622a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "2566d7c9952d4489f7f805d9fed1622a");
        } else if (fragmentActivity != null && sCRecyclerView != null) {
            sCRecyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity, 1, false));
            int c = com.sankuai.shangou.stone.util.h.c(fragmentActivity) / com.sankuai.shangou.stone.util.h.a(fragmentActivity, 180.0f);
            Object[] objArr8 = {sCRecyclerView};
            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.drug.home.widget.skeleon.a.a;
            a.C1160a c1160a = PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "fafbc9566f9c7c873d8e137d94052814", RobustBitConfig.DEFAULT_VALUE) ? (a.C1160a) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "fafbc9566f9c7c873d8e137d94052814") : new a.C1160a(sCRecyclerView);
            c1160a.d = c;
            c1160a.f = new a.b() { // from class: com.sankuai.waimai.store.drug.home.widget.skeleon.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.drug.home.widget.skeleon.a.b
                public final View a() {
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    return PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "58aa7b6a5d49cd2ccd99d984194f0246", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "58aa7b6a5d49cd2ccd99d984194f0246") : new com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.b(fragmentActivity);
                }

                @Override // com.sankuai.waimai.store.drug.home.widget.skeleon.a.b
                public final View b() {
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    return PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "98a22ae1e715b6ef9324ff6859ef02f4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "98a22ae1e715b6ef9324ff6859ef02f4") : new com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.a(fragmentActivity);
                }
            };
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = a.C1160a.a;
            if (PatchProxy.isSupport(objArr9, c1160a, changeQuickRedirect9, false, "d5fb227ac762f797c37f36d98f9a1c22", RobustBitConfig.DEFAULT_VALUE)) {
                com.sankuai.waimai.store.drug.home.widget.skeleon.a aVar = (com.sankuai.waimai.store.drug.home.widget.skeleon.a) PatchProxy.accessDispatch(objArr9, c1160a, changeQuickRedirect9, false, "d5fb227ac762f797c37f36d98f9a1c22");
            } else {
                com.sankuai.waimai.store.drug.home.widget.skeleon.a aVar2 = new com.sankuai.waimai.store.drug.home.widget.skeleon.a(c1160a);
                Object[] objArr10 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.store.drug.home.widget.skeleon.a.a;
                if (PatchProxy.isSupport(objArr10, aVar2, changeQuickRedirect10, false, "9d3938f109cc05d445f80f8529e4a7d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, aVar2, changeQuickRedirect10, false, "9d3938f109cc05d445f80f8529e4a7d4");
                } else {
                    u.a(aVar2.b);
                    if (aVar2.b != null) {
                        aVar2.b.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) aVar2.d);
                        if (aVar2.e != null && aVar2.e.b() != null) {
                            aVar2.b.a(aVar2.e.b());
                        } else if (aVar2.c > 0) {
                            aVar2.b.a(LayoutInflater.from(aVar2.b.getContext()).inflate(aVar2.c, (ViewGroup) aVar2.b, false));
                        }
                    }
                }
            }
        }
        Object[] objArr11 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect11 = h;
        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "8e6d28de814d48c2ad45cbd40d1adb13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "8e6d28de814d48c2ad45cbd40d1adb13");
            return;
        }
        a(com.sankuai.waimai.store.drug.home.newp.block.rxevent.d.class, new android.arch.lifecycle.l<com.sankuai.waimai.store.drug.home.newp.block.rxevent.d>() { // from class: com.sankuai.waimai.store.drug.home.new_home.NewDrugHomeFeedFlowCard.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.newp.block.rxevent.d dVar) {
                com.sankuai.waimai.store.drug.home.newp.block.rxevent.d dVar2 = dVar;
                Object[] objArr12 = {dVar2};
                ChangeQuickRedirect changeQuickRedirect12 = a;
                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "5de5c077c13e46bad9d4ea5d3a5138b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "5de5c077c13e46bad9d4ea5d3a5138b2");
                } else if (dVar2 != null) {
                    NewDrugHomeFeedFlowCard.b(NewDrugHomeFeedFlowCard.this, dVar2.b);
                    NewDrugHomeFeedFlowCard.this.h();
                }
            }
        });
        a(com.sankuai.waimai.store.drug.home.newp.block.rxevent.c.class, new android.arch.lifecycle.l<com.sankuai.waimai.store.drug.home.newp.block.rxevent.c>() { // from class: com.sankuai.waimai.store.drug.home.new_home.NewDrugHomeFeedFlowCard.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.newp.block.rxevent.c cVar) {
                com.sankuai.waimai.store.drug.home.newp.block.rxevent.c cVar2 = cVar;
                Object[] objArr12 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect12 = a;
                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "5602df803ece56b0b01f21c070c5e936", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "5602df803ece56b0b01f21c070c5e936");
                } else if (cVar2 != null) {
                    if (!cVar2.a) {
                        NewDrugHomeFeedFlowCard.this.h();
                    } else {
                        NewDrugHomeFeedFlowCard.k(NewDrugHomeFeedFlowCard.this);
                    }
                }
            }
        });
        a(com.sankuai.waimai.store.drug.home.refactor.event.d.class, new android.arch.lifecycle.l<com.sankuai.waimai.store.drug.home.refactor.event.d>() { // from class: com.sankuai.waimai.store.drug.home.new_home.NewDrugHomeFeedFlowCard.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.refactor.event.d dVar) {
                com.sankuai.waimai.store.drug.home.refactor.event.d dVar2 = dVar;
                Object[] objArr12 = {dVar2};
                ChangeQuickRedirect changeQuickRedirect12 = a;
                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "234d492f3e90fe553f033eefb0d1a173", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "234d492f3e90fe553f033eefb0d1a173");
                } else if (dVar2 != null) {
                    if (NewDrugHomeFeedFlowCard.this.f != null) {
                        NewDrugHomeFeedFlowCard.this.f.a(dVar2.a);
                    }
                    if (dVar2.a) {
                        u.a(NewDrugHomeFeedFlowCard.this.m);
                    }
                }
            }
        });
        a(com.sankuai.waimai.store.drug.home.refactor.event.e.class, new android.arch.lifecycle.l<com.sankuai.waimai.store.drug.home.refactor.event.e>() { // from class: com.sankuai.waimai.store.drug.home.new_home.NewDrugHomeFeedFlowCard.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.refactor.event.e eVar) {
                com.sankuai.waimai.store.drug.home.refactor.event.e eVar2 = eVar;
                Object[] objArr12 = {eVar2};
                ChangeQuickRedirect changeQuickRedirect12 = a;
                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d3478a3d7f82bfa628fa6a99411eb84a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d3478a3d7f82bfa628fa6a99411eb84a");
                } else if (eVar2 != null) {
                    if (eVar2.a) {
                        com.sankuai.waimai.store.drug.home.new_home.util.b.a(NewDrugHomeFeedFlowCard.this.t.c());
                        com.sankuai.waimai.store.drug.home.new_home.util.b.a(NewDrugHomeFeedFlowCard.this.v, null);
                        return;
                    }
                    com.sankuai.waimai.store.drug.home.new_home.util.b.a(NewDrugHomeFeedFlowCard.this.p.G, ((SCBaseActivity) NewDrugHomeFeedFlowCard.this.e).d(), NewDrugHomeFeedFlowCard.this.v, NewDrugHomeFeedFlowCard.this.t.c());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.v != null && this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1015106901f45489eb6d5b07ec923f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1015106901f45489eb6d5b07ec923f");
            return;
        }
        this.v = categoryInfo;
        this.A.i = categoryInfo;
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6aea1c9f732fb74b621d409032f35f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6aea1c9f732fb74b621d409032f35f7");
        } else {
            com.sankuai.waimai.store.drug.home.new_home.util.b.a(this.p.G, ((SCBaseActivity) this.e).d(), this.v, this.t.c());
        }
    }

    public static /* synthetic */ void b(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, com.sankuai.waimai.store.drug.home.new_home.realtime.a aVar) {
        Object[] objArr = {newDrugHomeFeedFlowCard, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "381bf440a149c6d38cb2f57f5ff368eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "381bf440a149c6d38cb2f57f5ff368eb");
        } else if (aVar == null) {
        } else {
            newDrugHomeFeedFlowCard.a2(aVar.b);
            Pair pair = (Pair) aVar.a;
            if (pair == null || pair.first == null || pair.second == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(pair.second);
            j jVar = newDrugHomeFeedFlowCard.q;
            Object[] objArr2 = {newDrugHomeFeedFlowCard, pair};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            jVar.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b7d8471729cb8a399d452896f346fc92", RobustBitConfig.DEFAULT_VALUE) ? (j.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b7d8471729cb8a399d452896f346fc92") : new i(newDrugHomeFeedFlowCard, pair), arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    public static /* synthetic */ void b(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, Pair pair, List list) {
        Object[] objArr = {newDrugHomeFeedFlowCard, pair, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff87b4709c9e57d24b06c2b0e6df0d54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff87b4709c9e57d24b06c2b0e6df0d54");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2 = newDrugHomeFeedFlowCard.u.get(((CategoryInfo) pair.first).code);
            int a = newDrugHomeFeedFlowCard.a(list2);
            if (a >= 0) {
                list2.remove(a);
                list2.add(a, list.get(0));
            }
            int a2 = newDrugHomeFeedFlowCard.a(newDrugHomeFeedFlowCard.r.b);
            if (a2 >= 0) {
                newDrugHomeFeedFlowCard.r.a((List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>) list, a2, true);
            }
        }
    }

    public static /* synthetic */ void a(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, com.sankuai.waimai.store.drug.home.new_home.realtime.a aVar) {
        Object[] objArr = {newDrugHomeFeedFlowCard, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fdf0c798f7a339bfe6dcf3b91c2e8a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fdf0c798f7a339bfe6dcf3b91c2e8a9");
        } else if (aVar == null) {
        } else {
            newDrugHomeFeedFlowCard.a2(aVar.b);
            Pair pair = (Pair) aVar.a;
            if (pair == null || pair.first == null || com.sankuai.shangou.stone.util.a.b((Collection) pair.second)) {
                return;
            }
            j jVar = newDrugHomeFeedFlowCard.q;
            Object[] objArr2 = {newDrugHomeFeedFlowCard, pair};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            jVar.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0db3dfa2f595d04eb94e9be913fdc7d4", RobustBitConfig.DEFAULT_VALUE) ? (j.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0db3dfa2f595d04eb94e9be913fdc7d4") : new h(newDrugHomeFeedFlowCard, pair), (List) pair.second);
        }
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    public static /* synthetic */ void a(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, Pair pair, List list) {
        Object[] objArr = {newDrugHomeFeedFlowCard, pair, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d176ae3a3441179c659ce5478de01a50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d176ae3a3441179c659ce5478de01a50");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            ArrayList arrayList = new ArrayList();
            List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2 = newDrugHomeFeedFlowCard.r.b;
            int i = -1;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar = list2.get(i2);
                com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> a = newDrugHomeFeedFlowCard.a(fVar, list);
                if (a != null) {
                    arrayList.add(a);
                    if (i < 0) {
                        i = i2;
                    }
                } else if (i >= 0) {
                    arrayList.add(fVar);
                }
            }
            if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                newDrugHomeFeedFlowCard.r.a((List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>) arrayList, i, false);
            }
            List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list3 = newDrugHomeFeedFlowCard.u.get(((CategoryInfo) pair.first).code);
            if (com.sankuai.shangou.stone.util.a.b(list3)) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < list3.size(); i3++) {
                com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> a2 = newDrugHomeFeedFlowCard.a(list3.get(i3), list);
                if (a2 != null) {
                    arrayList2.add(Pair.create(Integer.valueOf(i3), a2));
                }
            }
            if (com.sankuai.shangou.stone.util.a.b(arrayList2)) {
                return;
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                Pair pair2 = (Pair) arrayList2.get(i4);
                list3.remove(((Integer) pair2.first).intValue());
                list3.add(pair2.second);
            }
        }
    }

    @Nullable
    private com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> a(com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar, @NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {fVar, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "078ab28ffc625f41959d185d46bbff1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.poilist.mach.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "078ab28ffc625f41959d185d46bbff1b");
        }
        if (fVar == null || fVar.a == null || fVar.a.categoryInfo == null || !com.sankuai.waimai.store.drug.home.realtime.b.a(fVar.a.categoryInfo, fVar.a)) {
            return null;
        }
        for (com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar2 : list) {
            if (fVar2 != null && fVar2.a != null && fVar2.a.categoryInfo != null && fVar2.a.index == fVar.a.index) {
                return fVar2;
            }
        }
        return null;
    }

    private int a(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2908bae97cb88c29c0483f90b8041a9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2908bae97cb88c29c0483f90b8041a9f")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar = list.get(i);
            if (fVar != null && fVar.a != null && com.sankuai.waimai.store.drug.home.util.c.b(fVar.a.templateId)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd55990e2c41f36862395f43f3b7389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd55990e2c41f36862395f43f3b7389");
        } else if (this.f != null) {
            this.f.a(this, false, -1);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a760e0ba92c96bbb6c3c316aecd4ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a760e0ba92c96bbb6c3c316aecd4ca6");
            return;
        }
        u.c(this.m);
        u.a(this.k);
        this.k.c("暂无数据", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203106b4859fd95970e5e816cd84af60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203106b4859fd95970e5e816cd84af60");
            return;
        }
        u.c(this.m);
        this.k.c();
        com.sankuai.waimai.store.util.d.a(this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        CategoryInfo categoryInfo;
        com.sankuai.waimai.store.poilist.mach.f fVar;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3bbff5ce5c33be80d2dbd1b06a3bac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3bbff5ce5c33be80d2dbd1b06a3bac6");
        } else if (poiVerticalityDataResponse == null || com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.categoryInfos) || (categoryInfo = this.t.c().get(0)) == null) {
        } else {
            d(categoryInfo);
            a(poiVerticalityDataResponse, 0);
            Object[] objArr2 = {categoryInfo};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12f6ced61a12cbe3b1441f615ed21af6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12f6ced61a12cbe3b1441f615ed21af6");
            } else {
                int i = -1;
                List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list = this.r.b;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        com.sankuai.waimai.store.poilist.mach.f fVar2 = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2);
                        if (fVar2 != null && fVar2.a != 0 && ((BaseModuleDesc) fVar2.a).categoryInfo != null && a(categoryInfo, ((BaseModuleDesc) fVar2.a).categoryInfo) && (fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2 + 1)) != null && fVar.a != 0 && ((BaseModuleDesc) fVar.a).categoryInfo != null && !a(categoryInfo, ((BaseModuleDesc) fVar.a).categoryInfo)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                int i3 = i >= 0 ? (size - i) - 1 : 0;
                Iterator<String> it = this.u.keySet().iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!TextUtils.equals(categoryInfo.code, next)) {
                        it.remove();
                        List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> remove = this.u.remove(next);
                        if (!com.sankuai.shangou.stone.util.a.b(remove)) {
                            arrayList.addAll(remove);
                        }
                    }
                }
                this.r.a(i + 1, i3);
                b((List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>) arrayList);
            }
            this.s.a();
            bm_();
            com.sankuai.waimai.store.drug.home.new_home.util.b.a(this.t.c());
            com.sankuai.waimai.store.drug.home.new_home.util.b.a(categoryInfo, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca25e99a1709651674ab5167249f78cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca25e99a1709651674ab5167249f78cf");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar : list) {
                if (fVar != null && fVar.b != null && fVar.b.l() != null) {
                    fVar.b.l().onDestroy();
                }
            }
        }
    }

    private boolean a(@NonNull CategoryInfo categoryInfo, @NonNull CategoryInfo categoryInfo2) {
        Object[] objArr = {categoryInfo, categoryInfo2};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e2f671868552a3f1c851d23821cc3ae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e2f671868552a3f1c851d23821cc3ae")).booleanValue() : TextUtils.equals(categoryInfo.code, categoryInfo2.code);
    }

    private void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, int i) {
        Object[] objArr = {poiVerticalityDataResponse, 0};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db6c7472f41c26d3953df001274460c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db6c7472f41c26d3953df001274460c");
            return;
        }
        if (this.z == null) {
            this.z = new com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.c(this.e);
            this.z.createAndReplaceView(this.j);
        }
        c.a aVar = new c.a();
        aVar.a = poiVerticalityDataResponse.categoryInfos;
        aVar.b = poiVerticalityDataResponse.showCategoryTagIcon;
        aVar.c = poiVerticalityDataResponse.showCategoryTagIconStid;
        aVar.d = poiVerticalityDataResponse.showCategoryIcon;
        aVar.e = 0;
        this.z.a(aVar, poiVerticalityDataResponse);
    }

    @Override // com.sankuai.waimai.store.assembler.component.m
    public final void a(boolean z, boolean z2, int i) {
        com.sankuai.waimai.store.poilist.mach.f fVar;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39534dbb5e589bf5dca9b003b0ece644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39534dbb5e589bf5dca9b003b0ece644");
            return;
        }
        if (this.y != z2) {
            this.y = z2;
            this.l.setNestedScrollingEnabled(this.y);
            this.p.W = z2;
            if (this.z != null) {
                com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.c cVar = this.z;
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9e27ee9283cbf1608f3b1837179be07c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9e27ee9283cbf1608f3b1837179be07c");
                } else {
                    if (z2) {
                        cVar.f.setBackgroundResource(R.color.wm_sg_color_FFFFFF);
                    } else {
                        cVar.a();
                    }
                    if (cVar.b != null) {
                        com.sankuai.waimai.store.drug.home.adapter.a aVar = cVar.b;
                        Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.home.adapter.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ec9d07a7e60ebaba65758689339bf8e1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ec9d07a7e60ebaba65758689339bf8e1");
                        }
                    }
                }
                this.z.e = true;
            }
            b((NewDrugHomeFeedFlowCard) new com.sankuai.waimai.store.drug.home.refactor.event.b(this.y));
            if (!this.E && !this.y && (fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.r.b, 0)) != null && fVar.a != 0 && ((BaseModuleDesc) fVar.a).categoryInfo != null) {
                com.sankuai.waimai.store.drug.home.new_home.util.b.a(((BaseModuleDesc) fVar.a).categoryInfo, this.v);
                d(((BaseModuleDesc) fVar.a).categoryInfo);
                if (this.z != null) {
                    this.z.a(this.v.index);
                }
                if (g(this.v)) {
                    m();
                    o();
                    j();
                }
            }
        }
        if (!this.E || !g() || i == 0 || i == this.D) {
            return;
        }
        k();
        if (this.F) {
            p();
        }
        this.D = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaea62bf41df694dca10d61ce55b5319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaea62bf41df694dca10d61ce55b5319");
        } else if (this.F) {
        } else {
            int[] iArr = {0, 0};
            this.n.getLocationOnScreen(iArr);
            if (iArr[1] <= 0 || this.G - iArr[1] <= this.H) {
                return;
            }
            this.F = true;
        }
    }

    private void e(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db55ad97f821203cda7ca1538c3e6c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db55ad97f821203cda7ca1538c3e6c57");
        } else if (this.E) {
        } else {
            CategoryInfo categoryInfo2 = this.t.c().get(categoryInfo.index - 1);
            CategoryInfo categoryInfo3 = this.t.c().get(categoryInfo.index + 1);
            if (categoryInfo2 != null && !categoryInfo2.isDataLoadedSuccess && !categoryInfo2.isLoading) {
                categoryInfo2.requestMode = 0;
                this.s.a(categoryInfo2);
            }
            if (categoryInfo3 == null || categoryInfo3.isDataLoadedSuccess || categoryInfo3.isLoading) {
                return;
            }
            categoryInfo3.requestMode = 0;
            this.s.a(categoryInfo3);
        }
    }

    private List<BaseModuleDesc> b(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fa3f74ed8f5074253068f5fe85e2903", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fa3f74ed8f5074253068f5fe85e2903") : com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.machPoiCardInfos) ? poiVerticalityDataResponse.activityModuleMach : poiVerticalityDataResponse.machPoiCardInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9be83479943e831d752540aace0051", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9be83479943e831d752540aace0051");
        }
        ArrayList arrayList = new ArrayList();
        if (!this.u.isEmpty()) {
            Iterator<String> it = this.u.keySet().iterator();
            while (it.hasNext()) {
                it.remove();
                List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> remove = this.u.remove(it.next());
                if (!com.sankuai.shangou.stone.util.a.b(remove)) {
                    arrayList.addAll(remove);
                }
            }
        }
        if (!this.u.isEmpty()) {
            this.u.clear();
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.b
    public final SCBaseActivity f() {
        return (SCBaseActivity) this.e;
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1baead4d2e367ee078fd591dd733e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1baead4d2e367ee078fd591dd733e6");
        } else {
            this.o.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be0c0b12d95091e287dde7907d547f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be0c0b12d95091e287dde7907d547f4");
        } else {
            this.n.d();
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07110c50c3023bf9eb014b049b623c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07110c50c3023bf9eb014b049b623c83");
        } else {
            this.n.a();
        }
    }

    private void f(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6ded49025574f4b259fb371d675ecc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6ded49025574f4b259fb371d675ecc");
            return;
        }
        categoryInfo.isLoading = false;
        if (categoryInfo.requestMode == 3) {
            i();
        } else if (categoryInfo.requestMode == 2) {
            m();
        } else if (categoryInfo.requestMode == 1) {
            o();
        } else if (categoryInfo.requestMode == 4) {
            j();
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.b
    public final void a(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d173c2a47334889ec46504d47b609d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d173c2a47334889ec46504d47b609d");
            return;
        }
        categoryInfo.isLoading = true;
        if (categoryInfo.requestMode == 3) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "957578b5ecf121ae05f5c37f84354707", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "957578b5ecf121ae05f5c37f84354707");
                return;
            }
            u.c(this.m);
            u.a(this.k);
            this.k.a();
        } else if (categoryInfo.requestMode != 2) {
            if (categoryInfo.requestMode == 1) {
                n();
            } else if (categoryInfo.requestMode == 4) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "87b731b8619abef0f117c37fcf2f7e15", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "87b731b8619abef0f117c37fcf2f7e15");
                    return;
                }
                com.sankuai.waimai.store.util.d.a(this.B);
                this.B = com.sankuai.waimai.store.util.d.a((SCBaseActivity) this.e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.b
    public final void b(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05faa8781c7ccd997abd053c055bbc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05faa8781c7ccd997abd053c055bbc7");
        } else {
            j();
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.filter.d
    public final void a(@NonNull SortItem sortItem, @NonNull CategoryInfo categoryInfo, boolean z) {
        String str;
        String str2;
        Object[] objArr = {sortItem, categoryInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b8a0315f40e597c8846335823a2b31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b8a0315f40e597c8846335823a2b31f");
            return;
        }
        h();
        this.l.a();
        long currentTimeMillis = System.currentTimeMillis();
        this.x = currentTimeMillis;
        com.sankuai.waimai.store.drug.home.util.b.a(this.p, com.sankuai.waimai.store.drug.home.util.b.f, Long.valueOf(z ? sortItem.code : 0L));
        com.sankuai.waimai.store.param.a aVar = this.p;
        String str3 = com.sankuai.waimai.store.drug.home.util.b.e;
        if (z) {
            Object[] objArr2 = {sortItem};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            str = str3;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8eeef5b657b59d95c0d324e6a16ffd6b", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8eeef5b657b59d95c0d324e6a16ffd6b");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("code", Long.valueOf(sortItem.code));
                hashMap.put("name", sortItem.name);
                hashMap.put("type", Integer.valueOf(sortItem.type));
                str2 = com.sankuai.waimai.store.util.i.a(hashMap);
            }
        } else {
            str = str3;
            str2 = "";
        }
        com.sankuai.waimai.store.drug.home.util.b.a(aVar, str, str2);
        categoryInfo.requestMode = 4;
        this.s.a(categoryInfo, currentTimeMillis);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6656c1334947fea44f31adaf50a4549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6656c1334947fea44f31adaf50a4549");
        } else {
            this.w.scrollToPositionWithOffset(i + 1, 0);
        }
    }

    private boolean g(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c95b51f3c6fc0bc8ec34f931d31428", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c95b51f3c6fc0bc8ec34f931d31428")).booleanValue();
        }
        int e = e(categoryInfo, this.r.b);
        if (e >= 0) {
            b(e);
            return true;
        }
        return false;
    }

    private void h(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "771e536a07ad9448bf50ca632f0c17e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "771e536a07ad9448bf50ca632f0c17e9");
        } else if (this.z != null) {
            this.z.a(categoryInfo.index);
        }
    }

    private void a(@NonNull CategoryInfo categoryInfo, @NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {categoryInfo, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5578d040eec08e9c7d20b5fc8b6d0aab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5578d040eec08e9c7d20b5fc8b6d0aab");
            return;
        }
        categoryInfo.isLoading = false;
        if (categoryInfo.requestMode == 3) {
            if (this.v != categoryInfo) {
                return;
            }
            List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2 = this.r.b;
            int size = list2.size();
            if (com.sankuai.shangou.stone.util.a.b(list2)) {
                this.r.a(list);
                h(categoryInfo);
            } else if (this.v == categoryInfo) {
                int d = d(categoryInfo, list2);
                if (d < 0 || d > size) {
                    this.r.a(list);
                    b(0);
                    h(categoryInfo);
                } else {
                    ArrayList arrayList = new ArrayList(list2);
                    arrayList.addAll(d, list);
                    a(a((list.size() + d) - 1, arrayList), b(d, arrayList), arrayList);
                    int e = e(categoryInfo, arrayList);
                    this.r.a((List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>) arrayList);
                    if (e >= 0) {
                        b(e);
                    }
                }
            }
            j();
        } else if (categoryInfo.requestMode == 2) {
            c(categoryInfo, list);
            m();
        } else if (categoryInfo.requestMode == 1) {
            b(categoryInfo, list);
            o();
        } else {
            c(categoryInfo, list);
            b(categoryInfo, list);
        }
    }

    private boolean b(@NonNull CategoryInfo categoryInfo, List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {categoryInfo, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf75de95759b105d7a92c2a903e606e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf75de95759b105d7a92c2a903e606e3")).booleanValue();
        }
        List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2 = this.r.b;
        com.sankuai.waimai.store.poilist.mach.f fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, list2.size() - 1);
        if (fVar == null || fVar.a == 0 || ((BaseModuleDesc) fVar.a).categoryInfo == null || ((BaseModuleDesc) fVar.a).categoryInfo.index - categoryInfo.index != -1) {
            return false;
        }
        this.r.c(list);
        return true;
    }

    private boolean c(@NonNull CategoryInfo categoryInfo, List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {categoryInfo, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0601919bc025c318f61722b0d9b800d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0601919bc025c318f61722b0d9b800d")).booleanValue();
        }
        com.sankuai.waimai.store.poilist.mach.f fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.r.b, 0);
        if (fVar == null || fVar.a == 0 || ((BaseModuleDesc) fVar.a).categoryInfo == null || ((BaseModuleDesc) fVar.a).categoryInfo.index - categoryInfo.index != 1) {
            return false;
        }
        this.r.b(list);
        return true;
    }

    private int d(@NonNull CategoryInfo categoryInfo, @NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {categoryInfo, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3af0a96121c5a0238ab2eb567bee285", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3af0a96121c5a0238ab2eb567bee285")).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar = list.get(i2);
            if (fVar != null && fVar.a != null && fVar.a.categoryInfo != null) {
                int i3 = fVar.a.categoryInfo.index - categoryInfo.index;
                if (i3 == 1) {
                    return i2;
                }
                if (i3 == -1) {
                    i = fVar.a.categoryInfo.cellSize + i2;
                }
            }
        }
        return i;
    }

    private int a(int i, @NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09d7e9624f1ec3adc4f9df4754a83a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09d7e9624f1ec3adc4f9df4754a83a0d")).intValue();
        }
        while (i >= 0) {
            com.sankuai.waimai.store.poilist.mach.f fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (fVar == null || fVar.a == 0 || ((BaseModuleDesc) fVar.a).categoryInfo == null) {
                return -1;
            }
            i -= ((BaseModuleDesc) fVar.a).categoryInfo.cellSize;
            com.sankuai.waimai.store.poilist.mach.f fVar2 = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (fVar2 == null || fVar2.a == 0 || ((BaseModuleDesc) fVar2.a).categoryInfo == null) {
                return -1;
            }
            if (Math.abs(((BaseModuleDesc) fVar.a).categoryInfo.index - ((BaseModuleDesc) fVar2.a).categoryInfo.index) > 1) {
                return ((BaseModuleDesc) fVar2.a).categoryInfo.index;
            }
        }
        return -1;
    }

    private int b(int i, @NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        com.sankuai.waimai.store.poilist.mach.f fVar;
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6a397b51208ddb3e145818afca2a968", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6a397b51208ddb3e145818afca2a968")).intValue();
        }
        while (i < list.size() && (fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i)) != null && fVar.a != 0 && ((BaseModuleDesc) fVar.a).categoryInfo != null) {
            i += ((BaseModuleDesc) fVar.a).categoryInfo.cellSize;
            com.sankuai.waimai.store.poilist.mach.f fVar2 = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (fVar2 == null || fVar2.a == 0 || ((BaseModuleDesc) fVar2.a).categoryInfo == null) {
                return -1;
            }
            if (Math.abs(((BaseModuleDesc) fVar.a).categoryInfo.index - ((BaseModuleDesc) fVar2.a).categoryInfo.index) > 1) {
                return ((BaseModuleDesc) fVar2.a).categoryInfo.index;
            }
        }
        return -1;
    }

    private void a(int i, int i2, @NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3095dd06a8c4a947d7a40a4016b0155a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3095dd06a8c4a947d7a40a4016b0155a");
            return;
        }
        Iterator<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> it = list.iterator();
        while (it.hasNext()) {
            com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> next = it.next();
            if (next != null && next.a != null && next.a.categoryInfo != null && ((i >= 0 && next.a.categoryInfo.index <= i) || (i2 >= 0 && next.a.categoryInfo.index >= i2))) {
                it.remove();
            }
        }
    }

    private int e(@NonNull CategoryInfo categoryInfo, @NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {categoryInfo, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596aa44a53dcb1250efc325ec58cddfd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596aa44a53dcb1250efc325ec58cddfd")).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar = list.get(i);
            if (fVar != null && fVar.a != null && fVar.a.categoryInfo != null && fVar.a.categoryInfo.index == categoryInfo.index) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.b
    public final void c(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4070b36ddaa4a0686772ff40acc562a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4070b36ddaa4a0686772ff40acc562a4");
        } else {
            f(categoryInfo);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.b
    public final void a(@NonNull CategoryInfo categoryInfo, long j) {
        Object[] objArr = {categoryInfo, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb7f96d266a73601b5f0d8b85720be1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb7f96d266a73601b5f0d8b85720be1d");
        } else if (j >= this.x) {
            c(categoryInfo);
        }
    }

    private boolean b(@NonNull CategoryInfo categoryInfo, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {categoryInfo, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03f00fe33a875b1c3a2ba5bf83ab12a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03f00fe33a875b1c3a2ba5bf83ab12a")).booleanValue() : categoryInfo.categoryCodeType == 1 && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.quickFilterList);
    }

    private static void a(@NonNull BaseModuleDesc baseModuleDesc, @NonNull CategoryInfo categoryInfo, String str, int i) {
        baseModuleDesc.categoryInfo = categoryInfo;
        baseModuleDesc.nativeId = str;
        baseModuleDesc.index = i;
    }

    @Nullable
    private com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> c(@NonNull CategoryInfo categoryInfo, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {categoryInfo, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b93bbfd33438138a71a76399dc1f5f40", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.poilist.mach.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b93bbfd33438138a71a76399dc1f5f40");
        }
        if (b(categoryInfo, poiVerticalityDataResponse)) {
            BaseModuleDesc baseModuleDesc = new BaseModuleDesc();
            a(baseModuleDesc, categoryInfo, "quick_filter", 0);
            com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar = new com.sankuai.waimai.store.poilist.mach.f<>(baseModuleDesc, null);
            fVar.c = poiVerticalityDataResponse.quickFilterList;
            return fVar;
        }
        return null;
    }

    private void a(@NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list, @NonNull CategoryInfo categoryInfo, int i) {
        Object[] objArr = {list, categoryInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6880003f1ac5f487bb19485ee4ef77e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6880003f1ac5f487bb19485ee4ef77e9");
            return;
        }
        BaseModuleDesc baseModuleDesc = new BaseModuleDesc();
        a(baseModuleDesc, categoryInfo, "feed_empty_placeholder", i);
        list.add(new com.sankuai.waimai.store.poilist.mach.f<>(baseModuleDesc, null));
    }

    private void a(@NonNull CategoryInfo categoryInfo, @NonNull List<BaseModuleDesc> list, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, int i) {
        boolean z = true;
        Object[] objArr = {categoryInfo, list, poiVerticalityDataResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4cf8cd5276e9f2653184432027c3bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4cf8cd5276e9f2653184432027c3bf");
            return;
        }
        Iterator<BaseModuleDesc> it = list.iterator();
        int i2 = i;
        while (it.hasNext()) {
            BaseModuleDesc next = it.next();
            if (next != null) {
                a(next, categoryInfo, "recycler_mach", i2);
                if (com.sankuai.waimai.store.drug.home.realtime.b.a(categoryInfo, next)) {
                    if (z) {
                        this.A.a(poiVerticalityDataResponse.realtimeTimeout);
                        this.A.c();
                        z = false;
                    }
                    this.A.a(categoryInfo, next);
                }
                i2++;
            } else {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list, @NonNull CategoryInfo categoryInfo, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {list, categoryInfo, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f5e8e16007b0dfc5a3e97733835451c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f5e8e16007b0dfc5a3e97733835451c");
            return;
        }
        com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> c = c(categoryInfo, poiVerticalityDataResponse);
        if (c != null) {
            list.add(0, c);
        }
    }

    private static boolean i(@NonNull CategoryInfo categoryInfo) {
        return categoryInfo.index < 0;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.b
    public final void a(@NonNull CategoryInfo categoryInfo, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {categoryInfo, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7cfee898bd866d6cfb8a6ce267b5203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7cfee898bd866d6cfb8a6ce267b5203");
        } else if (i(categoryInfo)) {
        } else {
            d(categoryInfo, poiVerticalityDataResponse);
            List<BaseModuleDesc> b = b(poiVerticalityDataResponse);
            if (!com.sankuai.shangou.stone.util.a.b(b)) {
                a(categoryInfo, b, poiVerticalityDataResponse, b(categoryInfo, poiVerticalityDataResponse) ? 1 : 0);
                ArrayList arrayList = new ArrayList(b);
                j jVar = this.q;
                Object[] objArr2 = {this, categoryInfo, poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                jVar.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cd0234c1b1f860750d570b80461948e6", RobustBitConfig.DEFAULT_VALUE) ? (j.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cd0234c1b1f860750d570b80461948e6") : new g(this, categoryInfo, poiVerticalityDataResponse), arrayList);
                return;
            }
            f(categoryInfo);
        }
    }

    public static /* synthetic */ void a(NewDrugHomeFeedFlowCard newDrugHomeFeedFlowCard, CategoryInfo categoryInfo, PoiVerticalityDataResponse poiVerticalityDataResponse, List list) {
        Object[] objArr = {newDrugHomeFeedFlowCard, categoryInfo, poiVerticalityDataResponse, list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a247ec43719ef1b36ee604fbc9052146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a247ec43719ef1b36ee604fbc9052146");
            return;
        }
        categoryInfo.isLoading = false;
        if (i(categoryInfo) || com.sankuai.shangou.stone.util.a.b(list)) {
            return;
        }
        categoryInfo.isDataLoadedSuccess = true;
        newDrugHomeFeedFlowCard.a(list, categoryInfo, poiVerticalityDataResponse);
        newDrugHomeFeedFlowCard.u.put(categoryInfo.code, list);
        categoryInfo.cellSize = list.size();
        newDrugHomeFeedFlowCard.a(categoryInfo, list);
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.b
    public final void a(@NonNull final CategoryInfo categoryInfo, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, long j) {
        Object[] objArr = {categoryInfo, poiVerticalityDataResponse, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cfe2ed11500b729dd4dae40a2266adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cfe2ed11500b729dd4dae40a2266adf");
        } else if (!i(categoryInfo) && j >= this.x) {
            d(categoryInfo, poiVerticalityDataResponse);
            List<BaseModuleDesc> b = b(poiVerticalityDataResponse);
            if (!com.sankuai.shangou.stone.util.a.b(b)) {
                a(categoryInfo, b, poiVerticalityDataResponse, 1);
                this.q.a(new j.a() { // from class: com.sankuai.waimai.store.drug.home.new_home.NewDrugHomeFeedFlowCard.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.drug.home.new_home.j.a
                    public final void a(@Nullable List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
                        Object[] objArr2 = {list};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8682b8e6b89a80319ac0eb2700cf8d7e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8682b8e6b89a80319ac0eb2700cf8d7e");
                            return;
                        }
                        categoryInfo.isLoading = false;
                        if (com.sankuai.shangou.stone.util.a.b(list)) {
                            return;
                        }
                        categoryInfo.isDataLoadedSuccess = true;
                        com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) NewDrugHomeFeedFlowCard.this.u.get(categoryInfo.code), 0);
                        if (NewDrugHomeFeedFlowCard.this.a(fVar)) {
                            list.add(0, fVar);
                            NewDrugHomeFeedFlowCard.this.u.put(categoryInfo.code, list);
                            categoryInfo.cellSize = list.size();
                            if (NewDrugHomeFeedFlowCard.this.j(categoryInfo)) {
                                int k = NewDrugHomeFeedFlowCard.this.k(categoryInfo);
                                List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2 = NewDrugHomeFeedFlowCard.this.r.b;
                                if (k >= 0 && k <= list2.size()) {
                                    list2.addAll(k, list);
                                    NewDrugHomeFeedFlowCard.this.r.m();
                                }
                            }
                        }
                        NewDrugHomeFeedFlowCard.this.j();
                    }
                }, new ArrayList(b));
                return;
            }
            a(categoryInfo, j);
            categoryInfo.isLoading = false;
            List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list = this.u.get(categoryInfo.code);
            com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
            if (a(fVar)) {
                list.clear();
                list.add(fVar);
                a(list, categoryInfo, 1);
                categoryInfo.cellSize = list.size();
                if (j(categoryInfo)) {
                    int k = k(categoryInfo);
                    List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2 = this.r.b;
                    if (k < 0 || k > list2.size()) {
                        return;
                    }
                    list2.addAll(k, list);
                    this.r.m();
                }
            }
        }
    }

    private void d(@NonNull CategoryInfo categoryInfo, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {categoryInfo, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f44ead6c5c4835e22a0c0210defc5054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f44ead6c5c4835e22a0c0210defc5054");
            return;
        }
        if (!TextUtils.isEmpty(poiVerticalityDataResponse.traceId)) {
            categoryInfo.traceId = poiVerticalityDataResponse.traceId;
        }
        if (poiVerticalityDataResponse.judasField == null || TextUtils.isEmpty(poiVerticalityDataResponse.judasField.rankTraceId)) {
            return;
        }
        categoryInfo.rankTraceId = poiVerticalityDataResponse.judasField.rankTraceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc22556393a3dfbdc0eec8a3f8477d4e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc22556393a3dfbdc0eec8a3f8477d4e")).booleanValue() : (fVar == null || fVar.a == null || fVar.c == null || !"quick_filter".equals(fVar.a.nativeId)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(@NonNull CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a2a2a84fd770800c5143fab1f6b591", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a2a2a84fd770800c5143fab1f6b591")).booleanValue();
        }
        List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list = this.r.b;
        for (int i = 0; i < list.size(); i++) {
            com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar = list.get(i);
            if (a(fVar) && fVar.a.categoryInfo != null && TextUtils.equals(fVar.a.categoryInfo.code, categoryInfo.code)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(@NonNull CategoryInfo categoryInfo) {
        int i = 0;
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec67a199d710ec9b43c0b208796d146", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec67a199d710ec9b43c0b208796d146")).intValue();
        }
        int i2 = -1;
        Iterator<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> it = this.r.b.iterator();
        while (it.hasNext()) {
            com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> next = it.next();
            if (next != null && next.a != null && next.a.categoryInfo != null && TextUtils.equals(next.a.categoryInfo.code, categoryInfo.code)) {
                if (i2 < 0) {
                    i2 = i;
                }
                it.remove();
            }
            i++;
        }
        return i2;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b8ab16bda9ac6a170158a729dd382f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b8ab16bda9ac6a170158a729dd382f0");
        } else if (g()) {
            if (this.E) {
                this.F = true;
                p();
                return;
            }
            com.sankuai.waimai.store.poilist.mach.f fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.r.b, this.r.b.size() - 1);
            if (fVar == null || fVar.a == 0 || ((BaseModuleDesc) fVar.a).categoryInfo == null) {
                return;
            }
            CategoryInfo categoryInfo = this.t.c().get(((BaseModuleDesc) fVar.a).categoryInfo.index + 1);
            if (categoryInfo != null) {
                if (categoryInfo.isDataLoadedSuccess) {
                    b(categoryInfo, this.u.get(categoryInfo.code));
                } else {
                    if (!categoryInfo.isLoading) {
                        categoryInfo.requestMode = 1;
                        this.s.a(categoryInfo);
                    }
                    e(categoryInfo);
                }
            }
            if (((BaseModuleDesc) fVar.a).categoryInfo.index == this.t.c().size() - 1) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8714449eb5f7f51e6a7d5f6c67321fff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8714449eb5f7f51e6a7d5f6c67321fff");
                } else {
                    this.n.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4293cbbd08951c62fa4cdafb446c921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4293cbbd08951c62fa4cdafb446c921");
        } else if (this.t != null) {
            if (!this.t.n && !com.sankuai.waimai.store.manager.user.a.a().b()) {
                com.sankuai.waimai.store.manager.user.a.a((Context) this.e);
            }
            this.t.n = true;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
        com.sankuai.waimai.store.poilist.mach.f fVar;
        CategoryInfo categoryInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3778cd67c785e88e087d2eb5bbf78716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3778cd67c785e88e087d2eb5bbf78716");
        } else if (this.E || !g() || (fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.r.b, 0)) == null || fVar.a == 0 || ((BaseModuleDesc) fVar.a).categoryInfo == null || (categoryInfo = this.t.c().get(((BaseModuleDesc) fVar.a).categoryInfo.index - 1)) == null) {
        } else {
            if (categoryInfo.isDataLoadedSuccess) {
                c(categoryInfo, this.u.get(categoryInfo.code));
                return;
            }
            if (!categoryInfo.isLoading) {
                categoryInfo.requestMode = 2;
                this.s.a(categoryInfo);
            }
            e(categoryInfo);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.presenter.a.b
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db6b8af778ae122ec7401130107db8c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db6b8af778ae122ec7401130107db8c") : ((SCBaseActivity) this.e).w();
    }
}
