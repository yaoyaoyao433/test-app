package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.k;
import com.sankuai.waimai.store.platform.domain.core.activities.ReceiveCouponTip;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.o;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a implements com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter.b, k {
    public static ChangeQuickRedirect b;
    @NonNull
    h c;
    private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter.a d;
    private SCRecyclerView e;

    public b(@NonNull Context context, @NonNull h hVar) {
        super(context);
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b1bb76783a0de15963faf968fefd30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b1bb76783a0de15963faf968fefd30");
        } else {
            this.c = hVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb842b53c09f57a7edae51d10cba99b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb842b53c09f57a7edae51d10cba99b3");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c561d9260bb4167b47ba41be11573ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c561d9260bb4167b47ba41be11573ae");
            return;
        }
        this.e = (SCRecyclerView) findView(R.id.poi_dish_categories);
        this.e.setBottomMargin(com.sankuai.shangou.stone.util.h.a(this.mContext, 80.0f));
        this.e.addOnScrollListener(new o(new o.a() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.o.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ccab145879dfdf5b87bb105d07ba114b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ccab145879dfdf5b87bb105d07ba114b");
                } else {
                    b.this.c.w().a();
                }
            }
        }));
        this.e.setLayoutManager(new ExtendedLinearLayoutManager(this.mContext));
        this.d = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter.a(this);
        this.e.setOnItemClickListener(this);
        this.e.setAdapter((f<?, ?>) this.d);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.a
    public final void a(List<GoodsPoiCategory> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eabbc1987242e21b2ec959307db9881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eabbc1987242e21b2ec959307db9881");
            return;
        }
        this.d.b_(list);
        if (a() == null || a().d != 3) {
            return;
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46fed3c23356b0336967f792c5ec9bad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46fed3c23356b0336967f792c5ec9bad");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            Object[] objArr3 = {list};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4290561b214fb4ff02e85647f85696dd", RobustBitConfig.DEFAULT_VALUE)) {
                int c = com.sankuai.shangou.stone.util.a.c(list);
                int i2 = 0;
                while (true) {
                    if (i2 < c) {
                        GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2);
                        if (goodsPoiCategory != null && goodsPoiCategory.isSelected()) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4290561b214fb4ff02e85647f85696dd")).intValue();
            }
            if (i > 0) {
                b(i);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2945156bcde9f53720856536f8e67066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2945156bcde9f53720856536f8e67066");
            return;
        }
        this.d.notifyDataSetChanged();
        b(i);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3318ec11bec6eb43e734bd7b70e2a316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3318ec11bec6eb43e734bd7b70e2a316");
        } else if (i < 0) {
        } else {
            try {
                ((ExtendedLinearLayoutManager) this.e.getLayoutManager()).b(i);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter.b
    public final int a(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70607c945d33ccc0543c14734bea945", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70607c945d33ccc0543c14734bea945")).intValue() : this.c.a(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter.b
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf6326b1d9618f6d80ce1bab650a432", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf6326b1d9618f6d80ce1bab650a432") : this.c.q();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter.b
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7999f8e90b2a32a43ca55288ca0ab77e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7999f8e90b2a32a43ca55288ca0ab77e");
        } else if (goodsPoiCategory == null) {
        } else {
            this.c.w().a(goodsPoiCategory, i, view);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.k
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4dcc037d775dd76b8037fcb0c75fdb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4dcc037d775dd76b8037fcb0c75fdb5");
            return;
        }
        GoodsPoiCategory h = this.d.h(i);
        if (h == this.c.n() || h == null) {
            return;
        }
        this.c.w().a(h, i);
        this.c.b(true);
        this.c.a(h, (GoodsPoiCategory) null);
        this.c.t();
        this.c.f(true);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d91c7dae7083e520c02d8e0b923cd9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d91c7dae7083e520c02d8e0b923cd9f");
            return;
        }
        super.a(poiCouponItem);
        if (poiCouponItem == null || this.d == null || com.sankuai.shangou.stone.util.a.b(this.d.f)) {
            return;
        }
        for (T t : this.d.f) {
            if (t != null) {
                ArrayList<GoodsPoiCategory> arrayList = t.childGoodPoiCategory;
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                    Iterator<GoodsPoiCategory> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a(poiCouponItem, it.next());
                    }
                }
                a(poiCouponItem, t);
            }
        }
        this.d.notifyDataSetChanged();
    }

    private boolean a(@NonNull Poi.PoiCouponItem poiCouponItem, @Nullable GoodsPoiCategory goodsPoiCategory) {
        ReceiveCouponTip receiveCouponTip;
        Object[] objArr = {poiCouponItem, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c061c2d0a3898f7f2f41f4bca5da928", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c061c2d0a3898f7f2f41f4bca5da928")).booleanValue();
        }
        if (goodsPoiCategory == null || (receiveCouponTip = goodsPoiCategory.receiveCouponTip) == null) {
            return true;
        }
        if (poiCouponItem.mCouponId == receiveCouponTip.couponId) {
            receiveCouponTip.couponStatus = poiCouponItem.mCouponStatus;
            receiveCouponTip.couponType = poiCouponItem.mCouponType;
            receiveCouponTip.activityId = poiCouponItem.mActivityId;
            receiveCouponTip.couponButtonText = poiCouponItem.mCouponButtonText;
        }
        return false;
    }
}
