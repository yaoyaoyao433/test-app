package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.newwidgets.pullrefresh.SCNestedPullRefreshView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.z;
import com.sankuai.waimai.store.widgets.layoutmanager.FixedStaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StrollAroundContainerBlock extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a, b.InterfaceC1199b, c, c.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    public SCRecyclerView b;
    public NetInfoLoadView c;
    public b.a d;
    public List<Poi.PoiCouponItem> e;
    private a f;
    private RecyclerView.LayoutManager g;
    private SCNestedPullRefreshView h;
    private com.sankuai.waimai.store.goods.list.delegate.e i;
    private RestMenuResponse j;
    private final RestMenuResponse.b k;
    private boolean l;

    public StrollAroundContainerBlock(@NonNull Context context, com.sankuai.waimai.store.goods.list.delegate.e eVar, RestMenuResponse restMenuResponse, @NonNull RestMenuResponse.b bVar) {
        super(context);
        Object[] objArr = {context, eVar, restMenuResponse, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b202704d9dc8833e1ee3eb8cea9d697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b202704d9dc8833e1ee3eb8cea9d697");
            return;
        }
        this.l = true;
        this.i = eVar;
        this.d = new f(this, this.i);
        this.j = restMenuResponse;
        this.k = bVar;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final RestMenuResponse a() {
        return this.j;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final long b() {
        return this.k.h;
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e812e88f3c8e8c7c9dd163517ef5a416", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e812e88f3c8e8c7c9dd163517ef5a416");
        }
        View a2 = z.a(viewGroup.getContext(), R.layout.wm_sc_shop_stroll_around_container, viewGroup, false);
        this.b = (SCRecyclerView) a2.findViewById(R.id.rc_container);
        this.c = (NetInfoLoadView) a2.findViewById(R.id.wm_sc_mach_net_info);
        this.h = (SCNestedPullRefreshView) a2.findViewById(R.id.pull_to_refresh_view);
        return a2;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7bf6a69ad70602e1c1dda7c5dfa56b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7bf6a69ad70602e1c1dda7c5dfa56b");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f958265e5542206a609ca514d9594de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f958265e5542206a609ca514d9594de4");
            return;
        }
        this.f = new a(this, c());
        this.g = new FixedStaggeredGridLayoutManager(2, 1);
        this.b.setLayoutManager(this.g);
        this.b.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) this.f);
        final int dimensionPixelSize = c().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
        this.b.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.StrollAroundContainerBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr3 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8c00016a1e9e6fd8cbba0d7d0368b81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8c00016a1e9e6fd8cbba0d7d0368b81");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) view.getLayoutParams();
                    if (!bVar.b) {
                        if (bVar.b() % 2 == 0) {
                            rect.left = dimensionPixelSize * 4;
                            rect.right = dimensionPixelSize;
                        } else {
                            rect.left = dimensionPixelSize;
                            rect.right = dimensionPixelSize * 4;
                        }
                        rect.top = 0;
                        rect.bottom = dimensionPixelSize * 2;
                        return;
                    }
                    rect.right = 0;
                    rect.left = 0;
                    rect.bottom = 0;
                    rect.top = 0;
                }
            }
        });
        this.c.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.StrollAroundContainerBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3a01a99775e4626beb09b5b09d45490", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3a01a99775e4626beb09b5b09d45490");
                } else {
                    StrollAroundContainerBlock.this.d.c();
                }
            }
        });
        this.h.setHeaderPullRefreshEnable(false);
        View inflate = LayoutInflater.from(c()).inflate(R.layout.wm_st_view_poi_shop_footer, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.h.setFooterView(inflate);
        this.h.b(new com.sankuai.waimai.store.newwidgets.pullrefresh.c() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.StrollAroundContainerBlock.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.c
            public final void a(com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c0ddd8fd7e82ed3f85e93b459854cb4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c0ddd8fd7e82ed3f85e93b459854cb4");
                } else {
                    StrollAroundContainerBlock.this.d.b();
                }
            }
        });
        int dimensionPixelSize2 = c().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_90);
        View view = new View(this.mContext);
        view.setMinimumHeight(dimensionPixelSize2);
        this.b.b(view);
        this.b.setOnScrollToBottomOrTopListener(new n() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.StrollAroundContainerBlock.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.list.n
            public final void e() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.list.n
            public final void bm_() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37608dd7d0bd075fb039df131d2596b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37608dd7d0bd075fb039df131d2596b2");
                } else {
                    StrollAroundContainerBlock.this.d.b();
                }
            }
        });
        com.sankuai.waimai.store.order.a.e().a(this);
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f91f867b2c895c666eb091b15f15a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f91f867b2c895c666eb091b15f15a5");
        } else if (z && this.l && this.d != null) {
            this.d.a();
            this.l = false;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final SCBaseActivity c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb833783adad32544c21e77aa84b5df", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb833783adad32544c21e77aa84b5df") : this.i.k();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5251f9a3d9ec690ccf8c29aef52d34a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5251f9a3d9ec690ccf8c29aef52d34a7");
        }
        if (this.i != null && this.i.d() != null) {
            return this.i.d();
        }
        return new com.sankuai.waimai.store.platform.domain.manager.poi.a();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final void a(List<PoiCommonMachListItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f44b7f07c7de27438dac9525f3a8f938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f44b7f07c7de27438dac9525f3a8f938");
            return;
        }
        if (this.f != null) {
            this.f.b_(list);
        }
        this.d.a(list);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7004a98d156e2e82fe1e79cf8d811178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7004a98d156e2e82fe1e79cf8d811178");
        } else if (com.sankuai.waimai.store.util.b.a(c())) {
        } else {
            this.i.a(1000L);
            this.b.scrollToPosition(i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final void b(List<PoiCommonMachListItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54a4cc9a9e7d0871207c3cfd3c03042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54a4cc9a9e7d0871207c3cfd3c03042");
            return;
        }
        if (this.f != null) {
            this.f.c_(list);
        }
        this.d.a(list);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a3b5d5dc2f058b6cf479cc7f06d224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a3b5d5dc2f058b6cf479cc7f06d224");
        } else {
            this.c.a(i, str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727a481886483903648c0f00b1a5feb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727a481886483903648c0f00b1a5feb7");
        } else {
            i();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3fe9da53f69e007847b9db5977803c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3fe9da53f69e007847b9db5977803c");
        } else {
            this.h.setFooterPullRefreshEnable(true);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1430d08b2538987c067ee7adf077f14c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1430d08b2538987c067ee7adf077f14c");
        } else {
            this.h.a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d9f70123aa2d4887a9c3cc00976867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d9f70123aa2d4887a9c3cc00976867");
        } else {
            this.h.setFooterPullRefreshEnable(false);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.InterfaceC1199b
    public final a j() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.c
    public final d k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888395d44669e627c4f9c845850cecd3", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888395d44669e627c4f9c845850cecd3") : this.d.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.c
    public final Map<String, Object> l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1d59e40c9cca805dfaf6a13d9d6f19c", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1d59e40c9cca805dfaf6a13d9d6f19c") : this.d.e();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.c
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b70083f6d36fd01f6d509c33b357417e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b70083f6d36fd01f6d509c33b357417e") : d();
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e891ecc142d0899a53e5cd32c9d84f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e891ecc142d0899a53e5cd32c9d84f");
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(poiCouponItem);
        if (this.d != null) {
            this.d.b(this.e);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMachAddEvent(a.C1218a c1218a) {
        Object[] objArr = {c1218a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8afe91e49e5e6bb3fd74b0f1e5391ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8afe91e49e5e6bb3fd74b0f1e5391ac7");
        } else if (this.d == null || com.sankuai.waimai.store.util.b.a(c())) {
        } else {
            this.d.a(c1218a);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aea7cbee41e93d285ec8df7ee216824a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aea7cbee41e93d285ec8df7ee216824a");
            return;
        }
        super.onResume();
        if (this.d != null) {
            this.d.f();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5a48ec6b3ff642cf7849cc6cfa79e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5a48ec6b3ff642cf7849cc6cfa79e18");
            return;
        }
        this.d.g();
        super.onDestroy();
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        com.meituan.android.bus.a.a().b(this);
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67dbdf6b3315e4971c905fc01e62862e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67dbdf6b3315e4971c905fc01e62862e");
        } else if (this.f == null || this.d == null) {
        } else {
            this.d.a((List<PoiCommonMachListItem>) this.f.f);
        }
    }
}
