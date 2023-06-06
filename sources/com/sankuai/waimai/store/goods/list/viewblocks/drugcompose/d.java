package com.sankuai.waimai.store.goods.list.viewblocks.drugcompose;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.goods.list.viewblocks.header.j;
import com.sankuai.waimai.store.newwidgets.MarketNestedScrollRecyclerView;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.repository.model.g;
import com.sankuai.waimai.store.widgets.recycler.l;
import com.sankuai.waimai.store.widgets.recycler.n;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.base.b implements View.OnClickListener, com.meituan.android.cube.core.pager.a, com.sankuai.waimai.store.goods.list.viewblocks.content.view.a, f {
    public static ChangeQuickRedirect b;
    private final a.InterfaceC1266a a;
    public final com.sankuai.waimai.store.goods.list.delegate.e c;
    public final com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.a d;
    protected com.sankuai.waimai.store.goods.list.adapter.d e;
    @NonNull
    public MarketNestedScrollRecyclerView f;
    public com.sankuai.waimai.store.goodslist.viewblocks.a g;
    public NetInfoLoadView h;
    private View i;
    private com.sankuai.waimai.store.goods.list.viewblocks.header.b j;
    private ImageView k;
    private ViewGroup l;
    private View m;
    private boolean n;
    private final com.sankuai.waimai.store.observers.a o;

    public int b() {
        return R.layout.wm_sc_goods_list_market_drug_content_layout;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final int bl_() {
        return 1;
    }

    public int c() {
        return 1;
    }

    public static /* synthetic */ void a(d dVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "27774993f9dbeff1b0f02d37083c0beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "27774993f9dbeff1b0f02d37083c0beb");
        } else {
            dVar.g.a(z ? 8 : 0);
        }
    }

    public static /* synthetic */ int e(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "fab371fc2c90d19c153e11e97eecc6c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "fab371fc2c90d19c153e11e97eecc6c4")).intValue();
        }
        if (((LinearLayoutManager) dVar.f.getLayoutManager()).findFirstVisibleItemPosition() > 0) {
            return dVar.l.getHeight();
        }
        return u.a(dVar.f, dVar.l);
    }

    public d(@NonNull com.sankuai.waimai.store.goods.list.delegate.e eVar, a.InterfaceC1266a interfaceC1266a) {
        super(eVar.k());
        Object[] objArr = {eVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd5f195edcbd2d87c6da015a1bb6edf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd5f195edcbd2d87c6da015a1bb6edf7");
            return;
        }
        this.o = new com.sankuai.waimai.store.observers.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.observers.a
            public final void ba_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3a194eb2ae42ff9e97339041f098b69", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3a194eb2ae42ff9e97339041f098b69");
                } else {
                    d.this.c.m().a("updateOrderGood", (Object) null);
                }
            }
        };
        this.c = eVar;
        this.a = interfaceC1266a;
        this.d = new com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.a(this);
        com.sankuai.waimai.store.order.a.e().a(this.o);
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd17eab99d9a1a8f7912288d8a8299d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd17eab99d9a1a8f7912288d8a8299d");
        }
        this.mView = layoutInflater.inflate(b(), viewGroup, false);
        this.g = new com.sankuai.waimai.store.goodslist.viewblocks.a(this.c);
        this.g.a(this.mView);
        View view2 = this.mView;
        Object[] objArr2 = {view2};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55925f294939dfbf68861dcad1b17686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55925f294939dfbf68861dcad1b17686");
        } else {
            this.l = (LinearLayout) LayoutInflater.from(this.c.k()).inflate(R.layout.wm_st_goods_list_header_view, (ViewGroup) null);
            this.k = (ImageView) this.c.k().findViewById(R.id.back_to_top);
            this.k.setOnClickListener(this);
            this.j = a(this.c, this.l);
            this.f = (MarketNestedScrollRecyclerView) view2.findViewById(R.id.poi_dish_goods);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b7e6eb0814729d4a26da4677854ee9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b7e6eb0814729d4a26da4677854ee9e");
            } else {
                final com.sankuai.waimai.store.widgets.drawable.a a = a();
                this.f.setBackground(a);
                this.f.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d.4
                    public static ChangeQuickRedirect a;
                    private int d = 0;

                    @Override // android.support.v7.widget.RecyclerView.k
                    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        Object[] objArr4 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c274ce902716e43fb5e4a6dba32e465a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c274ce902716e43fb5e4a6dba32e465a");
                            return;
                        }
                        this.d += i2;
                        a.f = this.d;
                    }
                });
            }
            this.h = (NetInfoLoadView) view2.findViewById(R.id.market_net_info);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bc99de7d96442eec5b3e175d8aec6eac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bc99de7d96442eec5b3e175d8aec6eac");
            } else {
                u.c(this.k);
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "78246381e845adfd4f156b33b1825927", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "78246381e845adfd4f156b33b1825927");
            } else {
                this.i = LayoutInflater.from(this.mContext).inflate(R.layout.wm_st_view_poi_shop_footer, (ViewGroup) null, false);
                this.m = LayoutInflater.from(this.mContext).inflate(R.layout.wm_st_poi_market_layout_footer_no_more, (ViewGroup) null, false);
                this.e = new com.sankuai.waimai.store.goods.list.adapter.d(this.c, this.a);
                this.f.setAdapter(new l(this.e));
                this.f.setFocusableInTouchMode(false);
                this.f.setLayoutManager(new LinearLayoutManager(this.mContext));
                this.f.addOnScrollListener(new n() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.recycler.n
                    public final void a() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "02f538bcd645461da61bc94206e00d3d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "02f538bcd645461da61bc94206e00d3d");
                            return;
                        }
                        com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.a aVar = d.this.d;
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.a.a;
                        if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "5cd66694aac64798924400f8e6d11073", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "5cd66694aac64798924400f8e6d11073");
                        } else if (aVar.b == null || !aVar.e) {
                        } else {
                            aVar.b.bh_();
                            aVar.a();
                        }
                    }
                });
                this.e.c((View) this.l);
                this.e.d(this.i);
                this.e.h(this.i);
                this.e.d(this.m);
                this.e.h(this.m);
                int a2 = h.a(this.mContext, 70.0f);
                Object[] objArr6 = {Integer.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect6 = b;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f0ec9988805d3e1c94756246a324987c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f0ec9988805d3e1c94756246a324987c");
                } else {
                    Object[] objArr7 = {Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "dfe866680fdbb7a8d18a2dfa63b70c14", RobustBitConfig.DEFAULT_VALUE)) {
                        view = (View) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "dfe866680fdbb7a8d18a2dfa63b70c14");
                    } else {
                        view = new View(this.mContext);
                        view.setMinimumHeight(a2);
                    }
                    this.e.d(view);
                    this.e.g(view);
                }
                this.f.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d.6
                    public static ChangeQuickRedirect a;

                    @Override // android.support.v7.widget.RecyclerView.k
                    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        Object[] objArr8 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect8 = a;
                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "06c6f01143740acedb8a605846582db4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "06c6f01143740acedb8a605846582db4");
                            return;
                        }
                        super.onScrolled(recyclerView, i, i2);
                        if (d.this.n) {
                            d.a(d.this, d.this.j.a(d.e(d.this), d.this.j.b()));
                        }
                    }
                });
            }
        }
        this.h.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Object[] objArr8 = {view3};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "f6a5cb9b48de8689674a755a08a3f550", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "f6a5cb9b48de8689674a755a08a3f550");
                } else {
                    d.this.e();
                }
            }
        });
        return this.mView;
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc0272fa8181b6cd7ab1290c6632f26f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc0272fa8181b6cd7ab1290c6632f26f");
            return;
        }
        Intent intent = this.c.k().getIntent();
        String a = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "extra", "extra", "");
        long a2 = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "spu_id", "foodId", -1L);
        long a3 = com.sankuai.waimai.store.router.d.a(intent, "tag_id", -1L);
        com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.a aVar = this.d;
        long f = this.c.d().f();
        String h = this.c.d().h();
        k<RestMenuResponse> kVar = new k<RestMenuResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                RestMenuResponse restMenuResponse = (RestMenuResponse) obj;
                Object[] objArr2 = {restMenuResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94fb36cd6c9a4df83a699352697caba5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94fb36cd6c9a4df83a699352697caba5");
                    return;
                }
                super.a((AnonymousClass3) restMenuResponse);
                if (restMenuResponse == null || d.this.b(restMenuResponse)) {
                    if (d.this.h != null) {
                        d.this.h.b(d.this.c.k().getString(R.string.wm_sc_common_loading_fail_try_afterwhile));
                        return;
                    }
                    return;
                }
                if (d.this.h != null) {
                    d.this.h.e();
                }
                d.this.a(restMenuResponse);
                d.this.d.a();
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82b4a7684e9b53f7e85457dbeda3b943", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82b4a7684e9b53f7e85457dbeda3b943");
                    return;
                }
                super.a();
                if (d.this.h != null) {
                    d.this.h.b();
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b798724c7601bc2828a0b7258e7ae5fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b798724c7601bc2828a0b7258e7ae5fd");
                    return;
                }
                super.a(bVar);
                if (d.this.h != null) {
                    d.this.h.b(bVar.b);
                }
            }
        };
        Object[] objArr2 = {new Long(f), h, new Long(a2), new Long(a3), a, kVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "47e1d69d50a674fc5997b757ca6bb6d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "47e1d69d50a674fc5997b757ca6bb6d7");
        } else if (aVar.b == null || aVar.b.d() == null) {
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) aVar.b.d().l()).a(f, h, a2, a3, a, 1, kVar);
        }
    }

    public final boolean b(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67918b3f45f1ad8d0c31eb9ce56d1ed3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67918b3f45f1ad8d0c31eb9ce56d1ed3")).booleanValue() : restMenuResponse.mContainerTemplate == null || restMenuResponse.getPoi() == null;
    }

    public com.sankuai.waimai.store.goods.list.viewblocks.header.b a(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, ViewGroup viewGroup) {
        Object[] objArr = {dVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58af926c17030f46b357b11fb09b567b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.viewblocks.header.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58af926c17030f46b357b11fb09b567b") : new com.sankuai.waimai.store.goods.list.viewblocks.header.b(dVar, viewGroup);
    }

    public com.sankuai.waimai.store.widgets.drawable.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b0530941ca1a366090cf67f44db0cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.drawable.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b0530941ca1a366090cf67f44db0cd");
        }
        com.sankuai.waimai.store.widgets.drawable.a aVar = new com.sankuai.waimai.store.widgets.drawable.a();
        aVar.d = h.a(this.mContext, 145.0f);
        aVar.e = h.a(this.mContext, 80.0f);
        return aVar;
    }

    public void a(MarketGuessResponse marketGuessResponse) {
        ArrayList<GoodsSpu> arrayList;
        Object[] objArr = {marketGuessResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8476b10f23beadf033ce9d8985612674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8476b10f23beadf033ce9d8985612674");
        } else if (marketGuessResponse == null || (arrayList = marketGuessResponse.c) == null) {
        } else {
            if (marketGuessResponse.e == 0) {
                this.e.a(g.a(marketGuessResponse.b));
            }
            this.e.a(g.a(arrayList, marketGuessResponse.b));
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bh_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979d397979861c7abd2d9aaa6d3a0e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979d397979861c7abd2d9aaa6d3a0e06");
        } else {
            this.e.g(this.i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bi_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd8f2ac7992b63b89358f86fcc9270e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd8f2ac7992b63b89358f86fcc9270e");
        } else {
            this.e.h(this.i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bj_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08d777326e26961ddc0cd4e76995ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08d777326e26961ddc0cd4e76995ec5");
        } else {
            this.e.g(this.m);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final com.sankuai.waimai.store.goods.list.delegate.d d() {
        return this.c;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "182b02be1aaac05070133e525c8a11c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "182b02be1aaac05070133e525c8a11c0");
        } else {
            this.f.getLayoutManager().scrollToPosition(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52f878fc63ad242a8e4f8986476af70", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52f878fc63ad242a8e4f8986476af70");
        } else if (view.getId() == R.id.back_to_top) {
            f();
            if (this.a != null) {
                this.a.b(true);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6567c75e5f72e8f25b62621aa9dc0bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6567c75e5f72e8f25b62621aa9dc0bf");
        } else {
            this.j.c();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2812bffcad1a88263abde3bb1b495b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2812bffcad1a88263abde3bb1b495b6b");
            return;
        }
        com.sankuai.waimai.store.order.a.e().b(this.o);
        this.j.onDestroy();
    }

    public void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5044df64e791308b7086658116eb67cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5044df64e791308b7086658116eb67cb");
            return;
        }
        this.j.a(restMenuResponse, new com.sankuai.waimai.store.goods.list.viewblocks.header.d() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.d
            public final void a(RestMenuResponse.NavigateItem navigateItem) {
                Object[] objArr2 = {navigateItem};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c157ec249b55304efb819b965b83e40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c157ec249b55304efb819b965b83e40");
                } else if (d.this.c instanceof com.sankuai.waimai.store.goods.list.delegate.e) {
                    d.this.c.a(navigateItem);
                }
            }
        });
        this.e.a(g.a(restMenuResponse.getGoodsPoiCategories()));
        this.e.a(restMenuResponse.getChosenSpuId(), restMenuResponse.getChosenSpuNeedAdd());
        this.g.a(c(), restMenuResponse.mNavigateItemList);
        this.g.a(8);
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0faf2b44ba79ca5917367205b342593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0faf2b44ba79ca5917367205b342593");
            return;
        }
        this.n = z;
        if (z) {
            onResume();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f998b153d05c01a62d15ec970d37c868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f998b153d05c01a62d15ec970d37c868");
            return;
        }
        com.sankuai.waimai.store.goods.list.viewblocks.header.b bVar = this.j;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = j.e;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "dae8d0736db543e61165f6e230e18ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "dae8d0736db543e61165f6e230e18ada");
        } else {
            bVar.f.c();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36629d246f8e85732c20aa0886f455a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36629d246f8e85732c20aa0886f455a4");
        } else if (this.f != null) {
            this.f.addOnScrollListener(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final void bk_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59e4a5a8652d8be92b7a3124c4b2050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59e4a5a8652d8be92b7a3124c4b2050");
        } else {
            f();
        }
    }
}
