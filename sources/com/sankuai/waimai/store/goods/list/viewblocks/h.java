package com.sankuai.waimai.store.goods.list.viewblocks;

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
import com.sankuai.shangou.stone.util.q;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.MarketNestedScrollRecyclerView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.base.b implements View.OnClickListener, com.sankuai.waimai.store.goods.list.viewblocks.content.view.a {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.goods.list.adapter.d b;
    com.sankuai.waimai.store.goods.list.viewblocks.header.k c;
    com.sankuai.waimai.store.goodslist.viewblocks.a d;
    int e;
    private final com.sankuai.waimai.store.goods.list.delegate.d f;
    private final com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b g;
    private final a.InterfaceC1266a h;
    @NonNull
    private MarketNestedScrollRecyclerView i;
    private View j;
    private ImageView k;
    private ViewGroup l;
    private View m;
    private final com.sankuai.waimai.store.observers.a n;
    private a o;

    public static /* synthetic */ void a(h hVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "be61c9869dac8b8b036d94393d4acfd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "be61c9869dac8b8b036d94393d4acfd7");
        } else {
            hVar.d.a(z ? 8 : 0);
        }
    }

    public static /* synthetic */ void c(h hVar) {
        int height;
        int findFirstVisibleItemPosition;
        View findViewByPosition;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "fc918bce270497c36aece68b40903660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "fc918bce270497c36aece68b40903660");
            return;
        }
        MarketNestedScrollRecyclerView marketNestedScrollRecyclerView = hVar.i;
        Object[] objArr2 = {marketNestedScrollRecyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "967aa3fb1f208f8e9487596b4918f185", RobustBitConfig.DEFAULT_VALUE)) {
            height = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "967aa3fb1f208f8e9487596b4918f185")).intValue();
        } else {
            LinearLayoutManager h = q.h(marketNestedScrollRecyclerView);
            height = (h == null || (findViewByPosition = h.findViewByPosition((findFirstVisibleItemPosition = h.findFirstVisibleItemPosition()))) == null) ? 0 : (findFirstVisibleItemPosition * findViewByPosition.getHeight()) - findViewByPosition.getTop();
        }
        if (height > com.sankuai.shangou.stone.util.h.b(hVar.mContext)) {
            hVar.k.setVisibility(0);
        } else {
            hVar.k.setVisibility(8);
        }
    }

    public static /* synthetic */ int d(h hVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "1da3fcdeb1a5ce8bba46f314a1b46a7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "1da3fcdeb1a5ce8bba46f314a1b46a7a")).intValue();
        }
        if (((LinearLayoutManager) hVar.i.getLayoutManager()).findFirstVisibleItemPosition() > 0) {
            return hVar.l.getHeight();
        }
        return u.a(hVar.i, hVar.l);
    }

    public h(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, a.InterfaceC1266a interfaceC1266a) {
        super(dVar.k());
        Object[] objArr = {dVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8450c4003274c0faf002eb3cd158dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8450c4003274c0faf002eb3cd158dd");
            return;
        }
        this.n = new com.sankuai.waimai.store.observers.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.observers.a
            public final void ba_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5841c87cc1d2ca5408af90d5cf54cd86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5841c87cc1d2ca5408af90d5cf54cd86");
                } else {
                    h.this.f.m().a("updateOrderGood", (Object) null);
                }
            }
        };
        this.e = -1;
        this.f = dVar;
        this.h = interfaceC1266a;
        this.g = new com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b(this);
        com.sankuai.waimai.store.order.a.e().a(this.n);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70711f21aa0fcd8324a22b7eb9d94bce", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70711f21aa0fcd8324a22b7eb9d94bce");
        }
        this.mView = layoutInflater.inflate(R.layout.wm_st_goods_list_market_content_layout, viewGroup, false);
        this.d = new com.sankuai.waimai.store.goodslist.viewblocks.a(this.f);
        this.d.a(this.mView);
        View view2 = this.mView;
        Object[] objArr2 = {view2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8512d392f7ad59fcb144afe6cac79600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8512d392f7ad59fcb144afe6cac79600");
        } else {
            this.l = (LinearLayout) LayoutInflater.from(this.f.k()).inflate(R.layout.wm_st_goods_list_header_view, (ViewGroup) null);
            this.k = (ImageView) this.f.k().findViewById(R.id.back_to_top);
            this.k.setOnClickListener(this);
            this.c = new com.sankuai.waimai.store.goods.list.viewblocks.header.k(this.f, this.l);
            this.i = (MarketNestedScrollRecyclerView) view2.findViewById(R.id.poi_dish_goods);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7cdfd62b3c25477cd31efb7364231f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7cdfd62b3c25477cd31efb7364231f4");
            } else {
                this.j = LayoutInflater.from(this.mContext).inflate(R.layout.wm_st_view_poi_shop_footer, (ViewGroup) null, false);
                this.m = LayoutInflater.from(this.mContext).inflate(R.layout.wm_st_poi_market_layout_footer_no_more, (ViewGroup) null, false);
                this.b = new com.sankuai.waimai.store.goods.list.adapter.d(this.f, this.h);
                this.i.setAdapter(new com.sankuai.waimai.store.widgets.recycler.l(this.b));
                this.i.setFocusableInTouchMode(false);
                this.i.setLayoutManager(new LinearLayoutManager(this.mContext));
                this.i.addOnScrollListener(new com.sankuai.waimai.store.widgets.recycler.n() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.h.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.recycler.n
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d24630bcd90e22b1f9fbf9bb621fc04c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d24630bcd90e22b1f9fbf9bb621fc04c");
                            return;
                        }
                        com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b bVar = h.this.g;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.goods.list.viewblocks.content.presenter.b.a;
                        if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "1f7b1ac2bfb2aa09e6abd3a90e951cc6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "1f7b1ac2bfb2aa09e6abd3a90e951cc6");
                        } else if (bVar.f) {
                            bVar.b.bh_();
                            bVar.a();
                        }
                    }
                });
                this.b.c((View) this.l);
                this.b.d(this.j);
                this.b.h(this.j);
                this.b.d(this.m);
                this.b.h(this.m);
                int a2 = com.sankuai.shangou.stone.util.h.a(this.mContext, 70.0f);
                Object[] objArr4 = {Integer.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f6726d5fab7775b6cdd965949da8e082", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f6726d5fab7775b6cdd965949da8e082");
                } else {
                    Object[] objArr5 = {Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "86f4a998c277c6a6ecb01c141273003a", RobustBitConfig.DEFAULT_VALUE)) {
                        view = (View) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "86f4a998c277c6a6ecb01c141273003a");
                    } else {
                        view = new View(this.mContext);
                        view.setMinimumHeight(a2);
                    }
                    this.b.d(view);
                    this.b.g(view);
                }
                this.i.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.h.3
                    public static ChangeQuickRedirect a;

                    @Override // android.support.v7.widget.RecyclerView.k
                    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        Object[] objArr6 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "31d074063cc61fd6d54f59f212e84593", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "31d074063cc61fd6d54f59f212e84593");
                            return;
                        }
                        super.onScrolled(recyclerView, i, i2);
                        h.c(h.this);
                        h.a(h.this, h.this.c.a(h.d(h.this), h.this.c.b()));
                    }
                });
            }
        }
        this.g.a();
        return this.mView;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void a(MarketGuessResponse marketGuessResponse) {
        boolean z = false;
        Object[] objArr = {marketGuessResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b32c131c02aaa884639c85b5de49414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b32c131c02aaa884639c85b5de49414");
        } else if (marketGuessResponse == null) {
        } else {
            ArrayList<GoodsSpu> arrayList = marketGuessResponse.c;
            if (arrayList != null) {
                if (marketGuessResponse.e == 0) {
                    this.b.a(com.sankuai.waimai.store.repository.model.g.a(marketGuessResponse.b));
                    int a2 = q.a((RecyclerView) this.i);
                    if (this.e > 0 && this.e > a2) {
                        z = true;
                    }
                }
                this.b.a(com.sankuai.waimai.store.repository.model.g.a(arrayList, marketGuessResponse.b));
            }
            if (z) {
                a(this.e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bh_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9a8d7db95f1469b8e035912fb33ca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9a8d7db95f1469b8e035912fb33ca7");
        } else {
            this.b.g(this.j);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bi_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999918c777645d4df350eeba1e8ca60d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999918c777645d4df350eeba1e8ca60d");
        } else {
            this.b.h(this.j);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final void bj_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e11dfc5bf5c734427323bfdb55fd8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e11dfc5bf5c734427323bfdb55fd8b");
        } else {
            this.b.g(this.m);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    public final com.sankuai.waimai.store.goods.list.delegate.d d() {
        return this.f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce9e42a44592ffe5d56894419534000", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce9e42a44592ffe5d56894419534000");
        } else if (view.getId() == R.id.back_to_top) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa120be7c048d85876df663dcbf20e40", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa120be7c048d85876df663dcbf20e40");
            } else {
                this.i.getLayoutManager().scrollToPosition(0);
                this.k.setVisibility(8);
            }
            if (this.h != null) {
                this.h.b(true);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c774e2a3112b9ffe7ffee276f8ce900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c774e2a3112b9ffe7ffee276f8ce900");
        } else {
            this.c.c();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31333a2b44d26ca22ff91355fd6cb43b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31333a2b44d26ca22ff91355fd6cb43b");
            return;
        }
        com.sankuai.waimai.store.order.a.e().b(this.n);
        this.c.onDestroy();
        if (this.d.c != null) {
            this.d.c.removeCallbacks(this.o);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f7a4e80ea89dd1d52d081eab26adcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f7a4e80ea89dd1d52d081eab26adcb");
        } else if (i < 0 || this.d.c == null) {
        } else {
            if (this.o != null) {
                this.d.c.removeCallbacks(this.o);
            }
            this.o = new a(i);
            this.d.c.post(this.o);
        }
    }

    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "377f1ac91c65bb770d0939a84e3dfbf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "377f1ac91c65bb770d0939a84e3dfbf5");
        } else if (this.i != null) {
            this.i.addOnScrollListener(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        public int b;

        public a(int i) {
            Object[] objArr = {h.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23f29c6716a519eef7f2c3c39244525c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23f29c6716a519eef7f2c3c39244525c");
            } else {
                this.b = i;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa3ab974337f8a392ab1d7281fb588d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa3ab974337f8a392ab1d7281fb588d6");
                return;
            }
            ((LinearLayoutManager) h.this.i.getLayoutManager()).scrollToPositionWithOffset(this.b, h.this.d.c.getMeasuredHeight() + 0);
            if (h.this.h != null) {
                h.this.h.a(true);
            }
        }
    }
}
