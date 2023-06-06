package com.sankuai.waimai.store.poi.list.refactor.card.feed_flow;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.assembler.component.o;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.PoiListFilterStrategy4;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.VisibleChangeEvent;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.i;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4;
import com.sankuai.waimai.store.poilist.viewholders.g;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a, com.sankuai.waimai.store.observers.a, com.sankuai.waimai.store.poi.list.newp.contract.b, com.sankuai.waimai.store.widgets.filterbar.home.controller.c {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.param.a b;
    SCRecyclerView c;
    NetInfoLoadView d;
    com.sankuai.waimai.store.poi.list.newp.presenter.c e;
    int f;
    com.sankuai.waimai.store.poi.list.model.c g;
    boolean h;
    com.sankuai.waimai.store.widgets.filterbar.home.controller.d i;
    PoiPageContainerCard4.a j;
    public a k;
    private View l;
    private TextView m;
    private ImageView n;
    private Dialog o;
    private boolean p;
    private PageEventHandler q;
    private List<SortItem> r;
    private PoiPageViewModel s;
    private RecyclerView t;
    private int u;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final void a(com.sankuai.waimai.store.param.a aVar) {
    }

    public d(@NonNull SCBaseActivity sCBaseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, @NonNull com.sankuai.waimai.store.poi.list.model.c cVar) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82ca0da10fc432906a10ef6321d16414", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82ca0da10fc432906a10ef6321d16414");
            return;
        }
        this.f = -1;
        this.p = false;
        this.h = false;
        this.k = new a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7376dfb67ee48059f3b847a4ac83f495", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7376dfb67ee48059f3b847a4ac83f495");
                } else {
                    d.this.b(false);
                }
            }
        };
        this.b = aVar;
        this.q = (PageEventHandler) q.a((FragmentActivity) sCBaseActivity).a(PageEventHandler.class);
        this.g = cVar;
        this.u = h.b(sCBaseActivity);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcfa76ce7f2f310c56377ded136a84d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcfa76ce7f2f310c56377ded136a84d7");
        }
        if (!com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).a() && com.sankuai.waimai.store.base.abtest.a.f() && this.b != null && this.b.bh != null) {
            return this.b.bh.a(this.mContext, R.layout.wm_sc_home_channel_refactor_page_list);
        }
        return layoutInflater.inflate(R.layout.wm_sc_home_channel_refactor_page_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b62f0b69da0fc8ef4dc51a5a26a827d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b62f0b69da0fc8ef4dc51a5a26a827d");
            return;
        }
        super.onViewCreated();
        o();
        ((SCBaseActivity) this.mContext).getLifecycle().a(new e() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageList4$1
            public static ChangeQuickRedirect a;

            @OnLifecycleEvent(d.a.ON_STOP)
            public void lifecycleStop() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cca522b55719dbb5736b19cab256fa3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cca522b55719dbb5736b19cab256fa3");
                    return;
                }
                d dVar = d.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "860e7476bb38bc75b0b4d4a7b1d8c7a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "860e7476bb38bc75b0b4d4a7b1d8c7a9");
                } else if (dVar.i != null) {
                    dVar.i.c();
                }
            }

            @OnLifecycleEvent(d.a.ON_RESUME)
            public void lifecycleResume() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f15c2a59c9a9e83c032ea0ccb1ef01e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f15c2a59c9a9e83c032ea0ccb1ef01e");
                } else {
                    d.this.onResume();
                }
            }

            @OnLifecycleEvent(d.a.ON_DESTROY)
            public void lifecycleDestroy() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab7003578218ea0649ffc53211c31ac5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab7003578218ea0649ffc53211c31ac5");
                } else {
                    d.this.onDestroy();
                }
            }
        });
        this.s.h.a((SCBaseActivity) this.mContext, new l<PoiLocationAddress>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable PoiLocationAddress poiLocationAddress) {
                PoiLocationAddress poiLocationAddress2 = poiLocationAddress;
                Object[] objArr2 = {poiLocationAddress2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff4a8b54d78f471adfb415562fd766fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff4a8b54d78f471adfb415562fd766fb");
                } else if (poiLocationAddress2 == null || !poiLocationAddress2.isRefreshData) {
                } else {
                    d dVar = d.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "77c913f94c7777810847caea14f86733", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "77c913f94c7777810847caea14f86733");
                        return;
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "7a47da17377e7487d0f48920fd8da632", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "7a47da17377e7487d0f48920fd8da632");
                        return;
                    }
                    dVar.h = false;
                    if (dVar.i != null) {
                        dVar.i.f();
                    }
                }
            }
        });
        this.q.a((SCBaseActivity) this.mContext, com.sankuai.waimai.store.poi.list.newp.block.rxevent.c.class, new l<com.sankuai.waimai.store.poi.list.newp.block.rxevent.c>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.poi.list.newp.block.rxevent.c cVar) {
                com.sankuai.waimai.store.poi.list.newp.block.rxevent.c cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29547168dd45fab12a0666c47c8c412f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29547168dd45fab12a0666c47c8c412f");
                } else if (cVar2 == null || cVar2.a != d.this.mContext.hashCode()) {
                } else {
                    d.this.ba_();
                }
            }
        });
        this.q.a((SCBaseActivity) this.mContext, com.sankuai.waimai.store.poi.list.refactor.event.c.class, new l<com.sankuai.waimai.store.poi.list.refactor.event.c>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable @org.jetbrains.annotations.Nullable com.sankuai.waimai.store.poi.list.refactor.event.c cVar) {
                com.sankuai.waimai.store.poi.list.refactor.event.c cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0fb073b774b831fa84d38793513851c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0fb073b774b831fa84d38793513851c");
                    return;
                }
                d dVar = d.this;
                com.sankuai.waimai.store.param.a aVar = cVar2.a;
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "a3f52a1c1ae00cfad8cbed6a00a63d7a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "a3f52a1c1ae00cfad8cbed6a00a63d7a");
                } else {
                    if (dVar.i != null) {
                        dVar.i.u();
                        dVar.i.f();
                    }
                    dVar.d.d = aVar.E;
                }
                d.this.o();
            }
        });
        this.q.a((SCBaseActivity) this.mContext, o.class, new l<o>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.6
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable o oVar) {
                o oVar2 = oVar;
                Object[] objArr2 = {oVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19649b97876c9c6d4b6e811fdd73d59e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19649b97876c9c6d4b6e811fdd73d59e");
                } else if (oVar2 != null && d.this.b.aW >= 0) {
                    final d dVar = d.this;
                    final int i = oVar2.a;
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "f3c98fc4c933bd07973ce2890379defb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "f3c98fc4c933bd07973ce2890379defb");
                    } else if (dVar.c != null && dVar.b.aW >= 0) {
                        for (int i2 = 0; i2 < 8; i2++) {
                            int i3 = i2 * 200;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect4 = d.a;
                            if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "b14bfce172d6e896debef06c79573486", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "b14bfce172d6e896debef06c79573486");
                            } else {
                                new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8aa1b46bf062e7278f274d51720b8fc3", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8aa1b46bf062e7278f274d51720b8fc3");
                                            return;
                                        }
                                        d dVar2 = d.this;
                                        int i4 = i;
                                        Object[] objArr6 = {Integer.valueOf(i4)};
                                        ChangeQuickRedirect changeQuickRedirect6 = d.a;
                                        if (PatchProxy.isSupport(objArr6, dVar2, changeQuickRedirect6, false, "b7a23ad99292fddc374b0442456344f7", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, dVar2, changeQuickRedirect6, false, "b7a23ad99292fddc374b0442456344f7");
                                            return;
                                        }
                                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) dVar2.c.getLayoutManager();
                                        if (linearLayoutManager != null) {
                                            linearLayoutManager.scrollToPositionWithOffset(i4 + 1, 0);
                                            linearLayoutManager.setStackFromEnd(false);
                                            dVar2.b.aW = -1;
                                        }
                                    }
                                }, i3);
                            }
                        }
                    }
                }
            }
        });
        this.q.a((SCBaseActivity) this.mContext, com.sankuai.waimai.store.poi.list.newp.block.rxevent.b.class, new l<com.sankuai.waimai.store.poi.list.newp.block.rxevent.b>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.7
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.poi.list.newp.block.rxevent.b bVar) {
                com.sankuai.waimai.store.poi.list.newp.block.rxevent.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13eac1dc53c34789db21d8c93e3fc1ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13eac1dc53c34789db21d8c93e3fc1ab");
                } else if (bVar2 != null) {
                    d.this.c.setForbidScroll(bVar2.a);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final SCBaseActivity h() {
        return (SCBaseActivity) this.mContext;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e218abde465e6a6ef104aa8dee5e4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e218abde465e6a6ef104aa8dee5e4b");
            return;
        }
        super.onResume();
        if (this.i != null) {
            this.i.b();
            if (this.p) {
                this.p = false;
                this.i.r();
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9bf0a20cbe37f08e3b0a0e7f8f84d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9bf0a20cbe37f08e3b0a0e7f8f84d6");
            return;
        }
        super.onDestroy();
        f.a().a(getContext().hashCode());
        com.sankuai.waimai.store.order.a.e().b(this);
        if (this.i != null) {
            this.i.m();
        }
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d01193af2904c3992ddb27ecb99e86c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d01193af2904c3992ddb27ecb99e86c");
            return;
        }
        this.c.addOnScrollListener(q());
        this.c.setScrollStopListener(new com.sankuai.waimai.store.widgets.smoothnestedscroll.base.b() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.9
            @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.b
            public final void a() {
            }
        });
    }

    private RecyclerView.k q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f044f76ab5528ba830d3055c84849113", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f044f76ab5528ba830d3055c84849113") : new com.sankuai.waimai.store.poilist.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poilist.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f73cbcb3fa446d7c2372c294768e0e2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f73cbcb3fa446d7c2372c294768e0e2b");
                } else if (d.this.i.t() != null) {
                    d.this.i.t().a(i);
                }
            }

            @Override // com.sankuai.waimai.store.poilist.a
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db1bf07877bc10f1d722034a300d689f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db1bf07877bc10f1d722034a300d689f");
                } else {
                    d.this.i.t().b(i);
                }
            }

            @Override // com.sankuai.waimai.store.poilist.a, android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf3545289dab725d6545e775703563c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf3545289dab725d6545e775703563c8");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                d.this.i.t().onScrolled(recyclerView, i, i2);
                d.this.b(false);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2a8eb09e688025a3bef3aa19f386f72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2a8eb09e688025a3bef3aa19f386f72");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                d.this.b((d) new i(i));
                if (i == 0) {
                    com.meituan.android.bus.a.a().c(new VisibleChangeEvent(0, true, d.this.b.y, false, true));
                }
            }
        };
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ee1b30c4d59d1c93d1b656c5d78b984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ee1b30c4d59d1c93d1b656c5d78b984");
            return;
        }
        com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.mContext, "wm_sc_poi_list_expose");
        this.i.b(z);
        if (z) {
            if (this.b.h() || this.b.g()) {
                if (this.h) {
                    return;
                }
                this.e.c();
                return;
            }
            z2 = (this.g == null || TextUtils.equals(this.g.b, this.b.f)) ? false : false;
            if (z2) {
                this.i.u();
            }
            if (z2 || !this.h) {
                this.e.c();
                return;
            }
            return;
        }
        this.i.c();
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f633e5f91f212dbd15d4cc069adb5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f633e5f91f212dbd15d4cc069adb5a");
        } else if (this.c != null) {
            int f = com.sankuai.shangou.stone.util.q.f(this.c);
            if (f <= 1 && f >= 0 && this.c.getLayoutManager() != null && (this.c.getLayoutManager() instanceof LinearLayoutManager)) {
                for (int i = 0; i <= 1; i++) {
                    RecyclerView.s findViewHolderForAdapterPosition = this.c.findViewHolderForAdapterPosition(i);
                    if (findViewHolderForAdapterPosition instanceof g) {
                        int[] iArr = new int[2];
                        ((g) findViewHolderForAdapterPosition).itemView.getLocationOnScreen(iArr);
                        boolean z2 = iArr[1] < this.u / 3;
                        if (this.j != null) {
                            this.j.a(z2);
                            return;
                        }
                        return;
                    }
                }
            }
            if (!z || f <= 1 || this.j == null) {
                return;
            }
            this.j.a(true);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a87b58df5dde7c7fa1c76774232fa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a87b58df5dde7c7fa1c76774232fa0");
        } else {
            this.i.c();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a7060caf846c9741a0f7abcfaf4a6c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a7060caf846c9741a0f7abcfaf4a6c5");
            return;
        }
        com.sankuai.waimai.store.poi.list.newp.presenter.c cVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.presenter.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9256dfc402ac48c12e9b5c07fff77709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9256dfc402ac48c12e9b5c07fff77709");
            return;
        }
        cVar.d.n = 3;
        cVar.d.b = 0L;
        cVar.d.q();
        cVar.a(cVar.d, false, true);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2700d411c69991cda34153ba06406b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2700d411c69991cda34153ba06406b7");
            return;
        }
        com.sankuai.waimai.store.poi.list.newp.presenter.c cVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.presenter.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "3bbd886cbed75ce2a539c84b35791512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "3bbd886cbed75ce2a539c84b35791512");
        } else if (cVar.e) {
        } else {
            cVar.d.n = 4;
            if (cVar.d.s() && cVar.c != null && !cVar.c.currentTypeHasNextPage) {
                cVar.d.b = 0L;
                cVar.d.k = "";
                com.sankuai.waimai.store.param.a aVar = cVar.d;
                String str = cVar.d.k;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.param.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "5d16b7c191d46c84307b7365931ad6c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "5d16b7c191d46c84307b7365931ad6c6");
                } else {
                    aVar.l.put(aVar.f, str);
                }
                cVar.h = true;
            } else {
                cVar.d.b++;
                cVar.h = false;
            }
            cVar.d.q();
            cVar.a(cVar.d, false, true);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d396ee95159f3dd56d1b5d42c1e9e6d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d396ee95159f3dd56d1b5d42c1e9e6d4")).booleanValue();
        }
        com.sankuai.waimai.store.poi.list.newp.presenter.c cVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.presenter.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "89f9f32a4e1e405b7ef2d163662e3788", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "89f9f32a4e1e405b7ef2d163662e3788")).booleanValue();
        }
        if (cVar.c == null) {
            return cVar.d.u;
        }
        if ((cVar.b.a() == 3 || cVar.b.a() == 1 || cVar.b.a() == 2) && (cVar.b.a() != 1 || cVar.d.K != 3)) {
            return cVar.b();
        }
        return cVar.c.hasNextPage;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final com.sankuai.waimai.store.poi.list.model.c m() {
        return this.g;
    }

    public final void a(com.sankuai.waimai.store.param.a aVar, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Context context;
        int i;
        boolean z = true;
        Object[] objArr = {aVar, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead19fa034bf705b912ac0176813a1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead19fa034bf705b912ac0176813a1b4");
            return;
        }
        this.h = true;
        if (poiVerticalityDataResponse.mSCApiException != null) {
            com.sankuai.waimai.store.repository.net.b bVar = poiVerticalityDataResponse.mSCApiException;
            a(bVar.a((SCBaseActivity) this.mContext), true, bVar.a(), bVar);
            return;
        }
        if (this.b.n != 0 && this.b.n != 2 && this.b.n != 1) {
            z = false;
        }
        if (com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos) && !z) {
            if (poiVerticalityDataResponse.hasNextPage) {
                context = this.mContext;
                i = R.string.wm_sc_common_home_array_list_transition;
            } else {
                context = this.mContext;
                i = R.string.wm_sc_common_home_array_list_empty;
            }
            a(context.getString(i), false, false, new com.sankuai.waimai.store.repository.net.b(""));
            return;
        }
        b(aVar, poiVerticalityDataResponse);
        this.i.a(aVar, poiVerticalityDataResponse, false);
    }

    private void b(com.sankuai.waimai.store.param.a aVar, @NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {aVar, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b154ab91899a35840150fca52440f1af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b154ab91899a35840150fca52440f1af");
            return;
        }
        this.h = true;
        u.c(this.l);
        this.d.e();
        if (aVar != null) {
            aVar.S = poiVerticalityDataResponse.apiListExtra;
        }
        if (poiVerticalityDataResponse.spuQuickFilter != null) {
            this.r = poiVerticalityDataResponse.spuQuickFilter.sortList;
            a(aVar, poiVerticalityDataResponse.spuQuickFilter);
            a(poiVerticalityDataResponse);
        }
        this.e.c = poiVerticalityDataResponse;
        this.l.setBackgroundColor(com.sankuai.shangou.stone.util.d.a(aVar.E, -1));
        this.d.d = this.b.E;
        this.d.a();
        com.sankuai.waimai.store.util.d.a(this.o);
    }

    private void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9719779fd28314a08740898b9b9c965", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9719779fd28314a08740898b9b9c965");
        } else if (poiVerticalityDataResponse == null || poiVerticalityDataResponse.spuQuickFilter == null || poiVerticalityDataResponse.spuQuickFilter.activityFilterData == null || poiVerticalityDataResponse.spuQuickFilter.activityFilterData.jsonData == null) {
        } else {
            poiVerticalityDataResponse.spuQuickFilter.activityFilterData.jsonData.put("poi_number", Integer.valueOf(poiVerticalityDataResponse.poiCardInfos != null ? poiVerticalityDataResponse.poiCardInfos.size() : 0));
        }
    }

    private void a(com.sankuai.waimai.store.param.a aVar, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {aVar, filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1da14e1eb12e1456d5977a61876705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1da14e1eb12e1456d5977a61876705");
        } else if (filterConditionResponse != null && filterConditionResponse.activityFilterData != null) {
            aVar.a(filterConditionResponse.activityFilterData.selectedItemId);
        } else if (aVar.a() == 0 || aVar.a() == 1) {
            aVar.a((String) null);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final boolean b(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "646cf69fb9b6f1872a841d03c926e1ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "646cf69fb9b6f1872a841d03c926e1ac")).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        return aVar.n == 0 || aVar.n == 1 || aVar.n == 2 || aVar.n == 3;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final void a(com.sankuai.waimai.store.param.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2e76feda660bef414f51305bbc251f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2e76feda660bef414f51305bbc251f");
        } else if (aVar.n == 1) {
            if (!this.i.s()) {
                r();
            } else if (com.sankuai.waimai.store.newwidgets.list.o.d()) {
                com.sankuai.waimai.store.poi.list.newp.block.helper.b.a(aVar.l() ? 2 : 1, (SCBaseActivity) this.mContext, this.t);
            } else {
                this.d.b();
            }
        } else if (aVar.n == 0 || aVar.n == 2) {
            if (this.i != null) {
                this.i.u();
            }
            this.d.d = aVar.E;
            if (com.sankuai.waimai.store.newwidgets.list.o.d()) {
                com.sankuai.waimai.store.poi.list.newp.block.helper.b.a(aVar.l() ? 2 : 1, (SCBaseActivity) this.mContext, this.t);
            } else {
                this.d.b();
            }
        } else if (aVar.n != 4) {
            r();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74885078ea2322525caf64dd1382d9b4", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74885078ea2322525caf64dd1382d9b4")).longValue() : this.i.h();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba965739c203955186b1c2d96897f192", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba965739c203955186b1c2d96897f192") : this.i.i();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f08aa3451ee749728eace37c8f67f72", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f08aa3451ee749728eace37c8f67f72") : this.i.j();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d9f0664fb0ebbe36a2f1e0327e6e77", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d9f0664fb0ebbe36a2f1e0327e6e77") : this.i.k();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final void a(String str, boolean z, boolean z2, com.sankuai.waimai.store.repository.net.b bVar) {
        String str2;
        SCBaseActivity sCBaseActivity;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0172defa8157af1eed167f4ad2cb1453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0172defa8157af1eed167f4ad2cb1453");
            return;
        }
        this.d.e();
        com.sankuai.waimai.store.util.d.a(this.o);
        u.c(this.l);
        u.c(this.t);
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        } else if (z2) {
            str2 = ((SCBaseActivity) this.mContext).getString(R.string.wm_sc_common_net_error_info);
        } else if (!this.b.l()) {
            str2 = "当前地址无商家，请切换地址试试~";
        } else if (this.b.h()) {
            str2 = ((SCBaseActivity) this.mContext).getString(R.string.wm_sc_common_poi_list_spu_empty_tip);
        } else {
            str2 = ((SCBaseActivity) this.mContext).getString(R.string.wm_sc_common_poi_list_feed_empty_tip);
        }
        if (this.b.n == 0 || this.b.n == 2 || this.b.n == 1) {
            if (this.i.v().j() == 0) {
                String a2 = bVar != null ? bVar.a((SCBaseActivity) this.mContext) : "";
                this.d.a(t.a(a2) ? str2 : a2, "", a(bVar), bVar != null ? bVar.c() : R.drawable.wm_sc_home_filter_empty, bVar != null && bVar.d(), "", "重新加载");
                this.i.l();
            }
            sCBaseActivity = (SCBaseActivity) this.mContext;
        } else {
            sCBaseActivity = (SCBaseActivity) this.mContext;
            if (this.mContext.getString(R.string.wm_sc_common_home_array_list_transition).equals(str2)) {
                str2 = "";
            }
        }
        am.a((Activity) sCBaseActivity, str2);
        this.i.l();
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a37d419808cbebad9df1a31b151ac12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a37d419808cbebad9df1a31b151ac12");
            return;
        }
        com.sankuai.waimai.store.util.d.a(this.o);
        this.o = com.sankuai.waimai.store.util.d.a((SCBaseActivity) this.mContext);
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        this.p = true;
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea8ad8f1c2c4fb29a26d528ca51e45a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea8ad8f1c2c4fb29a26d528ca51e45a1");
            return;
        }
        this.c.b();
        this.i.c(z);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final void a(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561abbaef777b5a8e02a9aa5ca1200ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561abbaef777b5a8e02a9aa5ca1200ee");
        } else {
            b((d) obj);
        }
    }

    <T> void b(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af2fb122496f0ac09633ea4acf2271a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af2fb122496f0ac09633ea4acf2271a");
        } else {
            this.q.a((PageEventHandler) t);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dda5767d7c1e711d0af7beab9a558d8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dda5767d7c1e711d0af7beab9a558d8")).intValue() : this.i.n();
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.c
    public final List<SortItem> n() {
        return this.r;
    }

    private String a(com.sankuai.waimai.store.repository.net.b bVar) {
        String str;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bcfd77e1c4ba8e31838931d46b60f26", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bcfd77e1c4ba8e31838931d46b60f26");
        }
        if (p.a(bVar) || !com.sankuai.waimai.store.newwidgets.list.o.l()) {
            return "";
        }
        try {
            ErrorCode errorCode = bVar.e() ? new ErrorCode(ErrorCode.ERROR_TYPE_H, String.valueOf(bVar.d), "41SD") : null;
            if (bVar.c != 0 && bVar.d == 0) {
                errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_B, String.valueOf(bVar.c), "41SD");
            }
            if (bVar.a()) {
                errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_N, "201", "41SD");
            }
            ErrorCode errorCode2 = errorCode;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.repository.net.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "67bf1ca96e8e818884fc0f2e6eff71f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "67bf1ca96e8e818884fc0f2e6eff71f1")).booleanValue() : "定位失败，请手动输入地址".equals(bVar.b)) {
                int i = bVar.c;
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6e797c32b7964dfde5b8ee995a5f26d5", RobustBitConfig.DEFAULT_VALUE)) {
                    switch (i) {
                        case 1201:
                            str = "6003";
                            break;
                        case 1202:
                            str = "6002";
                            break;
                        case 1203:
                            str = "6019";
                            break;
                        case 1204:
                            str = "6001";
                            break;
                        case 1205:
                            str = "6012";
                            break;
                        default:
                            str = "";
                            break;
                    }
                } else {
                    str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6e797c32b7964dfde5b8ee995a5f26d5");
                }
                errorCode2 = new ErrorCode("F", str, "41SD");
            }
            if (p.a(errorCode2)) {
                return "";
            }
            String replace = com.sankuai.waimai.store.diting.a.a(errorCode2, getContext().getApplicationContext()).b("28616").b.buildErrorCodeStr().replace('(', Constants.SPACE).replace(')', Constants.SPACE);
            com.sankuai.waimai.store.diting.a.a(errorCode2);
            return replace;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a08997d22bba0d8c703a74cbfe750b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a08997d22bba0d8c703a74cbfe750b");
            return;
        }
        this.s = (PoiPageViewModel) q.a((FragmentActivity) ((SCBaseActivity) this.mContext)).a(PoiPageViewModel.class);
        this.c = (SCRecyclerView) this.mView.findViewById(R.id.wm_st_poi_channel_list);
        this.d = (NetInfoLoadView) this.mView.findViewById(R.id.layout_net_info_sub);
        this.t = (RecyclerView) this.mView.findViewById(R.id.rv_wm_sc_skeleton);
        this.l = this.mView.findViewById(R.id.rl_coming_so);
        this.l.setBackgroundResource(R.color.wm_sg_color_F5F5F6);
        this.n = (ImageView) this.mView.findViewById(R.id.img_empty);
        this.m = (TextView) this.l.findViewById(R.id.tv_empty_tip);
        u.c(this.l);
        this.e = new com.sankuai.waimai.store.poi.list.newp.presenter.c(this, this.b, this.g);
        this.d.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d.8
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e921d988e64214707250c30ecf0ca2f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e921d988e64214707250c30ecf0ca2f");
                } else if (d.this.g == null || "0".equals(d.this.g.b)) {
                    d.this.b((d) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.e());
                } else if (d.this.e != null) {
                    d.this.e.c();
                }
            }
        });
        if (this.b.h()) {
            this.i = new com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.e(this, this.b, 1);
        } else if (this.g != null && this.g.a()) {
            this.i = new com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.b(this, this.b, 3);
        } else if (this.g != null && this.g.b()) {
            this.i = new com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.c(this, this.b, 4);
        } else {
            this.i = new PoiListFilterStrategy4(this, this.b, 0);
        }
        this.i.a(this.mView);
        p();
        com.sankuai.waimai.store.order.a.e().a(this);
        this.i.p();
        this.i.q();
        this.i.a(this.k);
        this.l.setBackgroundColor(com.sankuai.shangou.stone.util.d.a(this.b.E, -1));
        this.d.d = "#F5F5F5";
        this.d.a();
        if (this.b.be) {
            float a2 = h.a(this.mContext, 10.0f);
            e.a c = new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_F5F5F6));
            c.a(a2, a2, 0.0f, 0.0f);
            this.c.setBackground(c.a());
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f850197fc79b0699bfc0dabf218eec9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f850197fc79b0699bfc0dabf218eec9") : ((SCBaseActivity) this.mContext).w();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.param.a aVar, boolean z) {
        Object[] objArr = {poiVerticalityDataResponse, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06021b09970aa76d9a7ef32fc765c000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06021b09970aa76d9a7ef32fc765c000");
        } else if (com.sankuai.waimai.store.util.b.a((SCBaseActivity) this.mContext) || poiVerticalityDataResponse == null) {
        } else {
            a(aVar, poiVerticalityDataResponse);
        }
    }
}
