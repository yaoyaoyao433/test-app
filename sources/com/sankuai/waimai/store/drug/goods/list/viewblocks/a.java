package com.sankuai.waimai.store.drug.goods.list.viewblocks;

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
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a implements c.a, c.a {
    public static ChangeQuickRedirect c;
    ViewGroup d;
    com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a e;
    private final com.sankuai.waimai.store.drug.goods.list.delegate.c f;
    private String g;
    @Nullable
    private b h;
    private PrioritySmoothNestedScrollView i;

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49221567d7f2015ae329671531895fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49221567d7f2015ae329671531895fb5");
        }
    }

    public a(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d309fdb3d48746b75e560e74f503f65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d309fdb3d48746b75e560e74f503f65");
            return;
        }
        this.f = cVar;
        this.g = this.f.l();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38f9863cf18ea07a904aa98d344a53c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38f9863cf18ea07a904aa98d344a53c");
        }
        this.mView = layoutInflater.inflate(R.layout.wm_drug_goods_list_market_second_layout, viewGroup, false);
        this.d = (ViewGroup) this.mView.findViewById(R.id.layout_content_container);
        this.i = (PrioritySmoothNestedScrollView) this.mView.findViewById(R.id.container_scrollview);
        ViewGroup viewGroup2 = (ViewGroup) this.mView.findViewById(R.id.layout_header_container);
        ViewGroup viewGroup3 = (ViewGroup) this.mView.findViewById(R.id.shop_action_bar_container);
        View findViewById = this.mView.findViewById(R.id.gradient_helper_layout);
        Object[] objArr2 = {findViewById};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3978c7dd755b17a4d5685edcf37f577c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3978c7dd755b17a4d5685edcf37f577c");
        } else if (findViewById != null && k.b(this.f.k())) {
            findViewById.getLayoutParams().height = u.a(this.mContext);
            u.a(findViewById);
        }
        this.h = new b(this.f, null, this);
        this.d.addView(this.h.a(layoutInflater, this.d));
        this.e = new com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.a(this.f);
        this.i.a(this.e);
        this.i.a(this.h);
        this.e.a(viewGroup3, findViewById);
        this.e.createAndReplaceView(viewGroup2);
        this.i.a(this.d, this.e.b());
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        return this.mView;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd9d9559d45221e67c0851169e228a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd9d9559d45221e67c0851169e228a5");
            return;
        }
        super.onDestroy();
        if (this.h != null) {
            this.h.a();
        }
        if (this.e != null) {
            this.e.onDestroy();
        }
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160ef45e093f6ec59adee6b7a0b9299c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160ef45e093f6ec59adee6b7a0b9299c");
            return;
        }
        super.a(restMenuResponse);
        this.e.a(restMenuResponse);
        this.d.post(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2abae31a9e7a5c13d780367dd3120492", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2abae31a9e7a5c13d780367dd3120492");
                } else if (com.sankuai.waimai.store.util.b.a(a.this.mContext)) {
                } else {
                    a.this.d.getLayoutParams().height = h.d(a.this.mContext) - a.this.e.a();
                }
            }
        });
        if (this.h != null) {
            this.h.a(restMenuResponse);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c2b70fe6f54d17caeb9040b140585df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c2b70fe6f54d17caeb9040b140585df")).booleanValue() : (this.h != null && this.h.b()) || super.h();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc706242c869b1724b2c877e0c8e2d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc706242c869b1724b2c877e0c8e2d6");
        } else if (this.h != null) {
            this.h.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6bc0a9cd0f57a81c3d57b1c81be36f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6bc0a9cd0f57a81c3d57b1c81be36f2");
            return;
        }
        this.i.fullScroll(33);
        this.i.scrollTo(0, 0);
        this.i.clearFocus();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8058c3b9cfcc0579c5254b8849dceed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8058c3b9cfcc0579c5254b8849dceed");
            return;
        }
        this.i.fullScroll(130);
        this.i.clearFocus();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final PrioritySmoothNestedScrollView e() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0b6e9ecdc0ec21d1f2df9b896e3f503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0b6e9ecdc0ec21d1f2df9b896e3f503");
        } else {
            this.f.d().a(poiCouponItem);
        }
    }
}
