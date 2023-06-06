package com.sankuai.waimai.store.goods.list.viewblocks.experimental;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.b;
import com.sankuai.waimai.store.goods.list.delegate.c;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter.c;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.PoiGuessULikeContainerBlock;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.PoiGuessULikePagerAdapter;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.d;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.poilist.mach.b;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import com.sankuai.waimai.store.repository.model.PoiGuessULikeSpuTag;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.repository.model.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SuperMarketContentUnionBlock extends b implements View.OnClickListener, com.sankuai.waimai.store.goods.list.viewblocks.content.view.a, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a, n, com.sankuai.waimai.store.observers.a, b.a {
    public static ChangeQuickRedirect a = null;
    private static int f = 11;
    private static int g = 14;
    public final e b;
    public SCRecyclerView c;
    public com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.b d;
    d e;
    private final com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b h;
    private c i;
    private View j;
    private ImageView k;
    private View l;
    private LinearLayout m;
    private PoiGuessULikeContainerBlock n;
    private PrioritySmoothNestedScrollView o;
    private View p;
    private int q;
    private final RestMenuResponse r;
    private final Set s;
    private NetInfoLoadView t;
    private int u;
    private Map<String, Object> v;
    private com.sankuai.waimai.store.goodslist.viewblocks.a w;
    private List<c.a> x;
    private final com.sankuai.waimai.store.pagingload.c<g, g> y;
    private final a.InterfaceC1262a<g, g> z;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    public static /* synthetic */ void a(SuperMarketContentUnionBlock superMarketContentUnionBlock, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, superMarketContentUnionBlock, changeQuickRedirect, false, "dfc23215ab3aaf8215f23ad6f1eb047f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, superMarketContentUnionBlock, changeQuickRedirect, false, "dfc23215ab3aaf8215f23ad6f1eb047f");
        } else if (i > h.b(superMarketContentUnionBlock.mContext)) {
            superMarketContentUnionBlock.k.setVisibility(0);
        } else {
            superMarketContentUnionBlock.k.setVisibility(8);
        }
    }

    public static /* synthetic */ void b(SuperMarketContentUnionBlock superMarketContentUnionBlock, int i) {
        RecyclerView.LayoutManager layoutManager;
        View findViewByPosition;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, superMarketContentUnionBlock, changeQuickRedirect, false, "c0fcf84328ddd98d67217474fd259e14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, superMarketContentUnionBlock, changeQuickRedirect, false, "c0fcf84328ddd98d67217474fd259e14");
            return;
        }
        if (i > 0 && (layoutManager = superMarketContentUnionBlock.c.getLayoutManager()) != null && (findViewByPosition = layoutManager.findViewByPosition(i)) != null) {
            final int top = findViewByPosition.getTop();
            Object[] objArr2 = {Integer.valueOf(top)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, superMarketContentUnionBlock, changeQuickRedirect2, false, "96da92339f494f233843e7aca04ab922", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, superMarketContentUnionBlock, changeQuickRedirect2, false, "96da92339f494f233843e7aca04ab922");
            } else if (top > 0) {
                superMarketContentUnionBlock.o.fullScroll(33);
                superMarketContentUnionBlock.o.post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketContentUnionBlock.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2fee3ba80d87fd669513b1bf6290c220", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2fee3ba80d87fd669513b1bf6290c220");
                        } else if (com.sankuai.waimai.store.util.b.a(SuperMarketContentUnionBlock.this.getContext())) {
                        } else {
                            SuperMarketContentUnionBlock.this.o.scrollTo(0, top);
                            SuperMarketContentUnionBlock.this.o.clearFocus();
                        }
                    }
                });
            }
        }
        if (superMarketContentUnionBlock.r.poiTags != null) {
            superMarketContentUnionBlock.w.a(superMarketContentUnionBlock.r.poiTags.b, superMarketContentUnionBlock.r.poiTags.c);
            superMarketContentUnionBlock.w.a(8);
        }
        if (p.a(superMarketContentUnionBlock.r.mPoiShoppingCart) || TextUtils.isEmpty(superMarketContentUnionBlock.r.mPoiShoppingCart.promptText)) {
            return;
        }
        superMarketContentUnionBlock.m.setPadding(0, 0, 0, h.a(superMarketContentUnionBlock.mContext, 30.0f));
    }

    public SuperMarketContentUnionBlock(@NonNull Context context, @NonNull RestMenuResponse restMenuResponse, e eVar) {
        super(context);
        Object[] objArr = {context, restMenuResponse, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d4a8f294578aa12dbf0e16dfaad3fb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d4a8f294578aa12dbf0e16dfaad3fb9");
            return;
        }
        this.s = new HashSet();
        this.u = f;
        this.x = new ArrayList();
        this.y = new com.sankuai.waimai.store.pagingload.c<>();
        this.z = new a.InterfaceC1262a<g, g>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketContentUnionBlock.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.InterfaceC1262a
            public final /* synthetic */ g a(@NonNull g gVar) {
                g gVar2 = gVar;
                Object[] objArr2 = {gVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbbbc0aba9d3834a6f01af5aa0ee88bb", RobustBitConfig.DEFAULT_VALUE)) {
                    return (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbbbc0aba9d3834a6f01af5aa0ee88bb");
                }
                if (gVar2.b == 11) {
                    gVar2.o = SuperMarketContentUnionBlock.this.e.a(gVar2.n, gVar2.d);
                }
                return gVar2;
            }
        };
        this.b = eVar;
        this.r = restMenuResponse;
        this.h = new com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c324269db92c155591eb8ba95c1d342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c324269db92c155591eb8ba95c1d342");
        } else if (g.b(this.r)) {
            this.u = g;
        } else {
            this.u = f;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "86771686dbb44d2c37ad0d1ecb4468d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "86771686dbb44d2c37ad0d1ecb4468d6");
        } else {
            this.e = new d(this.b.k(), new com.sankuai.waimai.store.poilist.mach.g(this.b.k(), this.b.b(), this.s), "supermarket", new com.sankuai.waimai.mach.recycler.b("supermarket"), i());
            this.e.b = this.b;
            this.e.a((b.a) this);
        }
        com.sankuai.waimai.store.order.a.e().a(this);
        com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b bVar = this.h;
        int i = this.u;
        Object[] objArr4 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b.a;
        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "8c30515b806d6c49d6330409c676c08a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "8c30515b806d6c49d6330409c676c08a");
        } else {
            bVar.c.b = i;
        }
    }

    @Override // com.sankuai.waimai.store.poilist.mach.b.a
    public final void a(com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99965cffc7315a0f447755f80d4745af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99965cffc7315a0f447755f80d4745af");
        } else if (cVar == null || cVar.l() == null) {
        } else {
            cVar.l().sendJsEvent("goods_detail_update_shopcart_account", f());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final Map<String, Object> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59fde43b737d83d8eaba6ee613cfb9c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59fde43b737d83d8eaba6ee613cfb9c4");
        }
        if (i() == null) {
            return null;
        }
        if (this.v == null) {
            this.v = com.sankuai.waimai.store.shopping.cart.util.a.a(i().d());
        }
        return this.v;
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad1d8f113942158d337afa2021d0bf7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad1d8f113942158d337afa2021d0bf7") : layoutInflater.inflate(R.layout.wm_st_goods_list_market_content_union_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        final int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10314f4e6576a97c83881772f25563b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10314f4e6576a97c83881772f25563b2");
            return;
        }
        super.onViewCreated();
        this.t = (NetInfoLoadView) findView(R.id.wm_st_main_load_view);
        this.o = (PrioritySmoothNestedScrollView) findView(R.id.root_smooth_view);
        this.w = new com.sankuai.waimai.store.goodslist.viewblocks.a(this.b);
        this.w.a(getView());
        this.k = (ImageView) findView(R.id.main_back_to_top);
        this.k.setOnClickListener(this);
        this.c = (SCRecyclerView) findView(R.id.poi_dish_goods);
        this.j = LayoutInflater.from(this.mContext).inflate(R.layout.wm_st_view_poi_shop_footer, (ViewGroup) null, false);
        this.l = LayoutInflater.from(this.mContext).inflate(R.layout.wm_st_poi_market_layout_footer_no_more, (ViewGroup) null, false);
        this.m = (LinearLayout) this.l.findViewById(R.id.ll_footer_container);
        u.c(this.j, this.l);
        this.i = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter.c(this, this.b);
        this.c.setAdapter((f<?, ?>) this.i);
        this.c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.c.setOnScrollToBottomOrTopListener(this);
        this.c.a(0, this.j);
        this.c.a(1, this.l);
        this.o.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketContentUnionBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
                Object[] objArr2 = {nestedScrollView, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdd6b8aba67a8ef656df6c24a0f2aa18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdd6b8aba67a8ef656df6c24a0f2aa18");
                    return;
                }
                SuperMarketContentUnionBlock.a(SuperMarketContentUnionBlock.this, i3);
                g h = SuperMarketContentUnionBlock.this.i.h(0);
                if (h == null) {
                    return;
                }
                if (h.b == 4 || h.b == 5) {
                    if (SuperMarketContentUnionBlock.this.c.getChildAt(0) == null || i3 <= SuperMarketContentUnionBlock.this.c.getChildAt(0).getMeasuredHeight() || i3 > i5) {
                        SuperMarketContentUnionBlock.this.w.a(8);
                    } else {
                        SuperMarketContentUnionBlock.this.w.a(0);
                    }
                }
            }
        });
        this.p = findView(R.id.poi_guess_u_like_container);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd1301a290bee15202711b3553c4e3bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd1301a290bee15202711b3553c4e3bd");
        } else {
            ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
            layoutParams.height = h.b(this.mContext);
            this.p.setLayoutParams(layoutParams);
            u.c(this.m);
        }
        this.n = new PoiGuessULikeContainerBlock(getContext(), this.b, this);
        this.n.createAndReplaceView(getView(), R.id.poi_guess_u_like_container);
        com.meituan.android.bus.a.a().a(this);
        this.h.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f07dded35412a82821a49c99d947da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f07dded35412a82821a49c99d947da7");
            return;
        }
        this.t.b();
        List<g> a2 = g.a(this.r);
        Object[] objArr4 = {a2};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9fb09f95455cc251f52a183bb279a83d", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9fb09f95455cc251f52a183bb279a83d")).intValue();
        } else {
            int size = a2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                g gVar = a2.get(i2);
                if (gVar != null && gVar.e) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        a.b bVar = new a.b<g, g>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketContentUnionBlock.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void b(List<g> list, int i3) {
                Object[] objArr5 = {list, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "228eb6dc47fd4837ef4d1c5a3ccd5cf7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "228eb6dc47fd4837ef4d1c5a3ccd5cf7");
                } else {
                    super.b(list, i3);
                }
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dc70c50d8a039dd6fc824933012ca518", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dc70c50d8a039dd6fc824933012ca518");
                    return;
                }
                super.a();
                if (com.sankuai.waimai.store.util.b.a(SuperMarketContentUnionBlock.this.getContext())) {
                    return;
                }
                c();
                SuperMarketContentUnionBlock.this.o.post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketContentUnionBlock.3.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "810ae6f67acd215048bdecba8f5ce78b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "810ae6f67acd215048bdecba8f5ce78b");
                        } else {
                            SuperMarketContentUnionBlock.b(SuperMarketContentUnionBlock.this, i);
                        }
                    }
                });
            }

            private void c() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "796f61bc012a81c3a06aff7224011ea8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "796f61bc012a81c3a06aff7224011ea8");
                } else {
                    SuperMarketContentUnionBlock.this.t.e();
                }
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(List<g> list, int i3) {
                Object[] objArr5 = {list, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0f810bd2c7763571ae8c4caf9a4bcd6f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0f810bd2c7763571ae8c4caf9a4bcd6f");
                    return;
                }
                super.a(list, i3);
                if (com.sankuai.waimai.store.util.b.a(SuperMarketContentUnionBlock.this.getContext())) {
                    return;
                }
                c();
                SuperMarketContentUnionBlock.this.i.c_(list);
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(int i3, @Nullable Throwable th, List<g> list) {
                Object[] objArr5 = {Integer.valueOf(i3), th, list};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "43b7df257e7b2bf2fdfa3cee60509cd3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "43b7df257e7b2bf2fdfa3cee60509cd3");
                } else {
                    super.a(i3, th, list);
                }
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void b() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8ac6988d3acd8b580355c26071a36b7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8ac6988d3acd8b580355c26071a36b7c");
                } else {
                    super.b();
                }
            }
        };
        com.sankuai.waimai.store.pagingload.c<g, g> cVar = this.y;
        cVar.g = this.z;
        cVar.h = bVar;
        cVar.a(a2);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMachAddEvent(a.C1218a c1218a) {
        Object[] objArr = {c1218a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf530e8637dc1676021aba1abae6d1d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf530e8637dc1676021aba1abae6d1d6");
        } else if (c1218a == null || this.b.k() != c1218a.b || com.sankuai.waimai.store.util.b.a(this.b.k()) || c1218a.d != i().f() || c1218a.f == null || c1218a.c == null) {
        } else {
            View view = c1218a.c;
            GoodsSpu goodsSpu = c1218a.f;
            Context context = view.getContext();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f559e44a87597bdbf7bc39050c92d44", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f559e44a87597bdbf7bc39050c92d44");
            } else if (com.sankuai.waimai.store.shopping.cart.f.a().b != null) {
                ImageView imageView = com.sankuai.waimai.store.shopping.cart.f.a().b.get(Integer.valueOf(this.b.k().hashCode()));
                int hashCode = context.hashCode();
                if (!com.sankuai.waimai.store.shopping.cart.f.a().b.containsKey(Integer.valueOf(hashCode))) {
                    com.sankuai.waimai.store.shopping.cart.f.a().b.put(Integer.valueOf(hashCode), imageView);
                    this.q = hashCode;
                }
            }
            this.b.a(view.getContext(), view, com.sankuai.waimai.store.platform.domain.manager.poi.a.a(c1218a.e, c1218a.d), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5540d30dfb46d07652a42127ef1c98d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5540d30dfb46d07652a42127ef1c98d2");
            return;
        }
        super.onResume();
        this.s.clear();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void a(MarketGuessResponse marketGuessResponse) {
        Object[] objArr = {marketGuessResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a62161193048f1af3d7fffb00a23d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a62161193048f1af3d7fffb00a23d1");
        } else if (marketGuessResponse != null) {
            PoiGuessULikeContainerBlock poiGuessULikeContainerBlock = this.n;
            Object[] objArr2 = {marketGuessResponse};
            ChangeQuickRedirect changeQuickRedirect2 = PoiGuessULikeContainerBlock.a;
            if (PatchProxy.isSupport(objArr2, poiGuessULikeContainerBlock, changeQuickRedirect2, false, "92c40c840966d3926fed6ff28d1a2617", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiGuessULikeContainerBlock, changeQuickRedirect2, false, "92c40c840966d3926fed6ff28d1a2617");
                return;
            }
            poiGuessULikeContainerBlock.e.e();
            Object[] objArr3 = {marketGuessResponse};
            ChangeQuickRedirect changeQuickRedirect3 = PoiGuessULikeContainerBlock.a;
            if (PatchProxy.isSupport(objArr3, poiGuessULikeContainerBlock, changeQuickRedirect3, false, "163ddbdae1dc81311903006e709b36b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, poiGuessULikeContainerBlock, changeQuickRedirect3, false, "163ddbdae1dc81311903006e709b36b6");
            } else if (marketGuessResponse != null) {
                ArrayList arrayList = new ArrayList();
                PoiGuessULikeSpuTag poiGuessULikeSpuTag = new PoiGuessULikeSpuTag(poiGuessULikeContainerBlock.getContext().getString(R.string.wm_sc_shop_guess_like));
                poiGuessULikeSpuTag.index = 0;
                arrayList.add(poiGuessULikeSpuTag);
                int i = 1;
                for (int i2 = 0; i2 < com.sankuai.shangou.stone.util.a.c(marketGuessResponse.h); i2++) {
                    PoiGuessULikeSpuTag poiGuessULikeSpuTag2 = (PoiGuessULikeSpuTag) com.sankuai.shangou.stone.util.a.a((List<Object>) marketGuessResponse.h, i2);
                    if (poiGuessULikeSpuTag2 != null) {
                        poiGuessULikeSpuTag2.index = i;
                        i++;
                        arrayList.add(poiGuessULikeSpuTag2);
                    }
                }
                PoiGuessULikePagerAdapter poiGuessULikePagerAdapter = poiGuessULikeContainerBlock.c;
                Object[] objArr4 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect4 = PoiGuessULikePagerAdapter.a;
                if (PatchProxy.isSupport(objArr4, poiGuessULikePagerAdapter, changeQuickRedirect4, false, "edb23933cfb16e849d998b9205d9ccaa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, poiGuessULikePagerAdapter, changeQuickRedirect4, false, "edb23933cfb16e849d998b9205d9ccaa");
                } else {
                    poiGuessULikePagerAdapter.b.clear();
                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                        poiGuessULikePagerAdapter.b.addAll(arrayList);
                    }
                    poiGuessULikePagerAdapter.notifyDataSetChanged();
                }
                if (poiGuessULikeContainerBlock.b.getCurrentItem() != poiGuessULikeContainerBlock.d) {
                    poiGuessULikeContainerBlock.b.setCurrentItem(poiGuessULikeContainerBlock.d);
                }
                poiGuessULikeContainerBlock.a(marketGuessResponse, arrayList);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cfc2e94abddecc719a0f65c1c0f1274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cfc2e94abddecc719a0f65c1c0f1274");
        } else {
            this.b.a(goodsSpu, i().b);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final d g() {
        return this.e;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final int h() {
        return this.u;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bh_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b417cbc83c2df8c1298a4e81eb3af65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b417cbc83c2df8c1298a4e81eb3af65");
        } else {
            this.j.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bi_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47da82b88a56bbb7e569c1edf86aaf7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47da82b88a56bbb7e569c1edf86aaf7a");
        } else {
            this.j.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bj_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e068ed810623df0980b38fb2751eb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e068ed810623df0980b38fb2751eb9");
        } else {
            this.l.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final com.sankuai.waimai.store.goods.list.delegate.d d() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e79e02dd455b74e572d0362268c5bf2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e79e02dd455b74e572d0362268c5bf2");
        } else if (view.getId() == R.id.main_back_to_top) {
            this.b.c();
            view.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketContentUnionBlock.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19e4fad0763fec72367e76afee4f097e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19e4fad0763fec72367e76afee4f097e");
                        return;
                    }
                    SuperMarketContentUnionBlock.this.o.fullScroll(33);
                    SuperMarketContentUnionBlock.this.o.scrollTo(0, 0);
                    SuperMarketContentUnionBlock.this.o.clearFocus();
                    SuperMarketContentUnionBlock.this.c.a();
                }
            }, 20L);
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.a());
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8e35e3f542092fa64c6f7bf105b5aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8e35e3f542092fa64c6f7bf105b5aa");
            return;
        }
        this.y.c();
        this.x.clear();
        com.sankuai.waimai.store.order.a.e().b(this);
        com.meituan.android.bus.a.a().b(this);
        if (this.n != null) {
            this.n.onDestroy();
        }
        com.sankuai.waimai.store.shopping.cart.f.a().a(this.q);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4592a952fa0390a22d8c5d63d79c70f0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4592a952fa0390a22d8c5d63d79c70f0") : this.b.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final SCBaseActivity j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6853aa95586e6fe372962cd902fd09f7", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6853aa95586e6fe372962cd902fd09f7") : this.b.k();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
        Object[] objArr = {context, view, str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631d061f9880f102ee4e7bbdec56ccb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631d061f9880f102ee4e7bbdec56ccb4");
        } else {
            this.b.a(context, view, str, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
        Object[] objArr = {activity, goodsSpu, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7222f6efbb609acfdd297678e3a4d6c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7222f6efbb609acfdd297678e3a4d6c8");
        } else {
            this.b.a(activity, goodsSpu, null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final void a(com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a93494815e7dbd198b3ff132acbebe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a93494815e7dbd198b3ff132acbebe2");
            return;
        }
        com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.b bVar = this.d;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c85b2b47ee629423644505c9c2ad7a66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c85b2b47ee629423644505c9c2ad7a66");
        } else if (bVar.b == null || bVar.b.contains(aVar)) {
        } else {
            bVar.b.add(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eb6bfc32f92ec36be7c51d232912059", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eb6bfc32f92ec36be7c51d232912059") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final void a(@NonNull RestMenuResponse.NavigateItem navigateItem) {
        Object[] objArr = {navigateItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5079341009eb3130aadf67a18cf3aa04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5079341009eb3130aadf67a18cf3aa04");
        } else {
            this.b.a(navigateItem);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final void a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f617ecbd0bc7054c855259480a34543e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f617ecbd0bc7054c855259480a34543e");
        } else {
            this.x.add(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final RestMenuResponse l() {
        return this.r;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a
    public final com.sankuai.shangou.stone.whiteboard.e m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263dd149ca301207d5ef197b54ea0db9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263dd149ca301207d5ef197b54ea0db9") : this.b.m();
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072817a8a4d90f37db68b48d87c10916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072817a8a4d90f37db68b48d87c10916");
            return;
        }
        this.v = null;
        for (c.a aVar : this.x) {
            if (aVar != null) {
                aVar.bn_();
            }
        }
    }
}
