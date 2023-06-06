package com.sankuai.waimai.store.goods.list.viewblocks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.goods.list.viewblocks.base.a implements d.a, c.a {
    public static ChangeQuickRedirect c;
    ViewGroup d;
    com.sankuai.waimai.store.goods.list.viewblocks.header.a e;
    private final com.sankuai.waimai.store.goods.list.delegate.d f;
    private String g;
    @Nullable
    private b h;
    private PrioritySmoothNestedScrollView i;

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "133d6afaea875f39aac1b3fa7c75ff12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "133d6afaea875f39aac1b3fa7c75ff12");
        }
    }

    public a(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, String str) {
        super(dVar);
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453e7792f5cc035c41f9ffa14e3bf513", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453e7792f5cc035c41f9ffa14e3bf513");
            return;
        }
        this.f = dVar;
        this.g = str;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aacd60eb3e6bea1fdcd57e3faea3fa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aacd60eb3e6bea1fdcd57e3faea3fa3");
        }
        this.mView = layoutInflater.inflate(R.layout.wm_sc_goods_list_market_second_layout, viewGroup, false);
        this.d = (ViewGroup) this.mView.findViewById(R.id.layout_content_container);
        this.i = (PrioritySmoothNestedScrollView) this.mView.findViewById(R.id.container_scrollview);
        ViewGroup viewGroup2 = (ViewGroup) this.mView.findViewById(R.id.layout_header_container);
        ViewGroup viewGroup3 = (ViewGroup) this.mView.findViewById(R.id.shop_action_bar_container);
        View findViewById = this.mView.findViewById(R.id.gradient_helper_layout);
        Object[] objArr2 = {findViewById};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cfcd12483d81b8272404b9245a2e056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cfcd12483d81b8272404b9245a2e056");
        } else if (findViewById != null && com.sankuai.shangou.stone.util.k.b(this.f.k())) {
            findViewById.getLayoutParams().height = u.a(this.mContext);
            u.a(findViewById);
        }
        this.h = new b(this.f, null, this);
        this.d.addView(this.h.a(layoutInflater, this.d));
        this.e = new com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.a(this.f);
        this.i.a(this.e);
        this.i.a(this.h);
        this.e.a(viewGroup3, findViewById);
        this.e.createAndReplaceView(viewGroup2);
        this.i.a(this.d, this.e.b());
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        return this.mView;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f54ed2fe5b034c9ec0173a20e2ce71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f54ed2fe5b034c9ec0173a20e2ce71");
            return;
        }
        super.onDestroy();
        if (this.h != null) {
            this.h.b();
        }
        if (this.e != null) {
            this.e.onDestroy();
        }
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7aaa1d469af0996d7f574c410e29657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7aaa1d469af0996d7f574c410e29657");
            return;
        }
        super.a(restMenuResponse);
        this.e.a(restMenuResponse);
        this.d.post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "418dbd1b6f7debcf0ab74df0288cc398", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "418dbd1b6f7debcf0ab74df0288cc398");
                } else if (com.sankuai.waimai.store.util.b.a(a.this.mContext)) {
                } else {
                    a.this.d.getLayoutParams().height = com.sankuai.shangou.stone.util.h.d(a.this.mContext) - a.this.e.a();
                }
            }
        });
        if (this.h != null) {
            this.h.a(restMenuResponse);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34899a645ed26d048fbaefc751eebc7e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34899a645ed26d048fbaefc751eebc7e")).booleanValue() : (this.h != null && this.h.c()) || super.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76c0aa864e04b48d678bf56bc35865d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76c0aa864e04b48d678bf56bc35865d");
        } else if (this.h != null) {
            this.h.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21078d296789250e08dc45c1a054c3b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21078d296789250e08dc45c1a054c3b0");
            return;
        }
        this.i.fullScroll(33);
        this.i.scrollTo(0, 0);
        this.i.clearFocus();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a75ed636fe9721733ac42d2527b0958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a75ed636fe9721733ac42d2527b0958");
            return;
        }
        this.i.fullScroll(130);
        this.i.clearFocus();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final PrioritySmoothNestedScrollView e() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f07b8e8c5498da3c4c72ad9479ecd65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f07b8e8c5498da3c4c72ad9479ecd65");
        } else {
            this.f.d().a(poiCouponItem);
        }
    }
}
