package com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.goods.list.templet.newmarket.e;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.k;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.o;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a implements com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter.b, k {
    public static ChangeQuickRedirect b;
    @NonNull
    e c;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter.a d;
    private SCRecyclerView e;

    public b(@NonNull Context context, @NonNull e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764493c137e900ab2c80b0fcdfc147b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764493c137e900ab2c80b0fcdfc147b8");
        } else {
            this.c = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f37d92039c8c4c2262b35a5de398c94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f37d92039c8c4c2262b35a5de398c94");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4aeafb97fcde4bb7ffc237d04563bd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4aeafb97fcde4bb7ffc237d04563bd4");
            return;
        }
        this.e = (SCRecyclerView) findView(R.id.poi_dish_categories);
        this.e.setBottomMargin(h.a(this.mContext, 80.0f));
        this.e.addOnScrollListener(new o(new o.a() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.o.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35b6c267cb62d6e2244920ec9c4f2fec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35b6c267cb62d6e2244920ec9c4f2fec");
                } else {
                    b.this.c.D().a();
                }
            }
        }));
        this.e.setLayoutManager(new ExtendedLinearLayoutManager(this.mContext));
        this.d = new com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter.a(this);
        this.e.setOnItemClickListener(this);
        this.e.setAdapter((f<?, ?>) this.d);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.a
    public final void a(List<GoodsPoiCategory> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d0a7dc28b334fa27979e6a8742ac6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d0a7dc28b334fa27979e6a8742ac6d");
            return;
        }
        this.d.b_(list);
        if (a() == null || a().d != 3) {
            return;
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b16a526eb33d8e292c23184f1c03137f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b16a526eb33d8e292c23184f1c03137f");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            Object[] objArr3 = {list};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c9510407327b08e92c6ebd7f0c3d7bf", RobustBitConfig.DEFAULT_VALUE)) {
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
                i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c9510407327b08e92c6ebd7f0c3d7bf")).intValue();
            }
            if (i > 0) {
                b(i);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8bcdf9649f7103a8c3ca73245c48f3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8bcdf9649f7103a8c3ca73245c48f3d");
            return;
        }
        this.d.notifyDataSetChanged();
        b(i);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f13c91dbe74ad9c3dd973761099e3c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f13c91dbe74ad9c3dd973761099e3c4a");
        } else if (i < 0) {
        } else {
            try {
                ((ExtendedLinearLayoutManager) this.e.getLayoutManager()).b(i);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter.b
    public final int a(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0354521862e62ad8083d7150ab05164c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0354521862e62ad8083d7150ab05164c")).intValue() : this.c.a(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter.b
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cdb2042005e560721f6fbc9f981dcd7", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cdb2042005e560721f6fbc9f981dcd7") : this.c.x();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.adapter.b
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7802f1dcf9b6d1f840ee91b4d7eea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7802f1dcf9b6d1f840ee91b4d7eea4");
        } else if (goodsPoiCategory == null) {
        } else {
            this.c.D().a(goodsPoiCategory, i, view);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.k
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa372268a550eb1b1fade00237b595a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa372268a550eb1b1fade00237b595a");
            return;
        }
        GoodsPoiCategory h = this.d.h(i);
        if (h == this.c.s() || h == null) {
            return;
        }
        this.c.D().a(h, i);
        this.c.a(true);
        this.c.a(h, (GoodsPoiCategory) null);
        this.c.A();
        this.c.e(true);
    }
}
