package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.base.BaseRelativeLayout;
import com.sankuai.waimai.store.drug.goods.list.delegate.impl.c;
import com.sankuai.waimai.store.drug.goods.list.interfaces.b;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.g;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.list.m;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopContentRootBlock extends com.sankuai.waimai.store.drug.goods.list.templet.a implements h, i.b, com.sankuai.waimai.store.goods.subscribe.c, c.a, PrioritySmoothNestedScrollView.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect g;
    private View a;
    private com.sankuai.waimai.store.drug.goods.list.delegate.c b;
    private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a c;
    private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.a d;
    private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.b e;
    private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot.c f;
    public boolean h;
    public g i;
    @NonNull
    protected final i.a j;
    protected Context k;
    private b.a l;
    private Runnable m;

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public void a(String str) {
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf437feb97f4abe0af570401184ae85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf437feb97f4abe0af570401184ae85");
        }
    }

    public int c() {
        return R.layout.wm_drug_shop_content_layout;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a830d2baf8ee5f8a2e0f17e31b600a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a830d2baf8ee5f8a2e0f17e31b600a");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public int d() {
        return 0;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public void d(boolean z) {
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public void e(boolean z) {
    }

    public boolean f() {
        return true;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public void h() {
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public void i() {
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public void j() {
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public long k() {
        return -1L;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public boolean l() {
        return false;
    }

    public ShopContentRootBlock(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar, @Nullable b.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16439f7289d2c8825f8d7e9d9da3d2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16439f7289d2c8825f8d7e9d9da3d2d");
            return;
        }
        this.h = true;
        this.b = cVar;
        this.l = aVar;
        this.j = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.i(this, q(), cVar == null ? null : cVar.k());
        com.sankuai.waimai.store.order.a.e().a(this);
        com.meituan.android.bus.a.a().a(this);
        this.m = new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ac199687c1223fd783882fdb3ac8cc9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ac199687c1223fd783882fdb3ac8cc9");
                    return;
                }
                try {
                    ShopContentRootBlock.this.x();
                } catch (Exception unused) {
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.a
    public View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae9da2b360cc7f9b4323bf3595e1aa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae9da2b360cc7f9b4323bf3595e1aa6");
        }
        View inflate = layoutInflater.inflate(c(), viewGroup, false);
        this.k = viewGroup.getContext();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        this.f = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30aa08637a1179d5c9505279f85343b3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30aa08637a1179d5c9505279f85343b3") : new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot.c(this, this.k);
        Context context = this.k;
        com.sankuai.waimai.store.drug.goods.list.delegate.c cVar = this.b;
        Object[] objArr3 = {context, cVar, this};
        ChangeQuickRedirect changeQuickRedirect3 = g;
        this.c = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4cf26a04163cca28495e02e03ca6223e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4cf26a04163cca28495e02e03ca6223e") : new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.b(context, cVar, this) { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
            public final boolean a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "16b0bafce69964f4a318868fadf67b1c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "16b0bafce69964f4a318868fadf67b1c")).booleanValue() : ShopContentRootBlock.this.f();
            }
        };
        this.d = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.b(this.k, this);
        this.i = new g(this.k, this, this.h, this.b);
        this.e = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.b(this.k, this);
        this.c.bindView(inflate);
        this.d.bindView(inflate);
        this.i.bindView(inflate);
        this.e.bindView(inflate);
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a aVar = this.c;
        g gVar = this.i;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = g.a;
        aVar.a(PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "7e37b30eec132a56e7c43b495fc6b8c7", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "7e37b30eec132a56e7c43b495fc6b8c7") : new g.b());
        BaseRelativeLayout baseRelativeLayout = (BaseRelativeLayout) inflate.findViewById(R.id.root_layout);
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a aVar2 = this.c;
        Object[] objArr5 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect5 = BaseRelativeLayout.a;
        if (PatchProxy.isSupport(objArr5, baseRelativeLayout, changeQuickRedirect5, false, "83d648146f510afe10aee2bfa2c04465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, baseRelativeLayout, changeQuickRedirect5, false, "83d648146f510afe10aee2bfa2c04465");
        } else if (aVar2 != null) {
            baseRelativeLayout.b.add(aVar2);
        }
        com.sankuai.waimai.store.goods.subscribe.a.a().a(this);
        com.sankuai.waimai.store.event.h.a().a(this);
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        this.a = inflate;
        return inflate;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "771245ec43fd738a3da3607b71e48c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "771245ec43fd738a3da3607b71e48c0f");
        } else if (this.c != null) {
            this.c.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void a(List<GoodsPoiCategory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a696c0a75e66f86bea0af857ebae3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a696c0a75e66f86bea0af857ebae3a");
        } else {
            this.d.a(list);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d66ead3b30cec80338de7ab1bbebf0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d66ead3b30cec80338de7ab1bbebf0f");
            return;
        }
        this.d.a(i);
        this.c.a(i2);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public void a(com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2fcbe72ddc6d7b9a33491f9bf06927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2fcbe72ddc6d7b9a33491f9bf06927");
        } else {
            this.c.a(fVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a30163e14ef1a8db6b6d6d3dc3b132", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a30163e14ef1a8db6b6d6d3dc3b132");
        } else {
            this.c.a(goodsPoiCategory, list);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc6e8a942395eaf949044fa93eb26a66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc6e8a942395eaf949044fa93eb26a66");
        } else {
            this.c.a(list, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e50d7f939ddf7ab1e257e25d1dbab50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e50d7f939ddf7ab1e257e25d1dbab50");
        } else {
            this.c.b(list, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8828544c39abe008fd2834bc009c264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8828544c39abe008fd2834bc009c264");
        } else {
            this.c.c(list, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad800f4d06a058cdeab54dd81640d15d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad800f4d06a058cdeab54dd81640d15d");
        } else {
            this.c.f();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd4a4c08b3915fd147e1a0addcc2936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd4a4c08b3915fd147e1a0addcc2936");
        } else {
            this.c.g();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd776e06a0ce34a38362c8a397a6e6b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd776e06a0ce34a38362c8a397a6e6b1");
        } else {
            this.c.h();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.a
    public final void a(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "185771983ae921769ccff678529ad3a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "185771983ae921769ccff678529ad3a2");
            return;
        }
        this.j.a(iMarketResponse);
        this.c.a(iMarketResponse);
    }

    public final void b(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9dc3b401c24c0e2e8602b62ebbe6192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9dc3b401c24c0e2e8602b62ebbe6192");
        } else if (this.c != null) {
            this.c.a(iMarketResponse);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final String A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ebbfc42928f9745283495cdc2a9905", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ebbfc42928f9745283495cdc2a9905") : this.k instanceof SCBaseActivity ? ((SCBaseActivity) this.k).w() : "";
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final int a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c501586e2474136570b144f3b32765e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c501586e2474136570b144f3b32765e5")).intValue() : this.j.a(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449b643f472adffdb68f38608fc7f039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449b643f472adffdb68f38608fc7f039");
        } else {
            this.j.a(goodsPoiCategory, goodsPoiCategory2);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe29829f843171b4826618a8789b3993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe29829f843171b4826618a8789b3993");
        } else {
            this.j.b(goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final GoodsPoiCategory m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbbbcf1e329ecb88b0a6de954f960e92", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbbbcf1e329ecb88b0a6de954f960e92") : this.j.a();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final GoodsPoiCategory n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "738a31c6b3eebbf9872f7d04f9af6e04", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "738a31c6b3eebbf9872f7d04f9af6e04") : this.j.b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3458380a0d8d03c6101a2199bcf268c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3458380a0d8d03c6101a2199bcf268c");
        } else {
            this.c.j();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final long p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41266d78ed97d349f3388e22212d368e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41266d78ed97d349f3388e22212d368e")).longValue() : this.j.c();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b5c519fbe81a73ed8cf3acf5a58f2e1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b5c519fbe81a73ed8cf3acf5a58f2e1")).booleanValue() : this.j.a(goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2176215160c9f565128618a1b5c566", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2176215160c9f565128618a1b5c566") : this.b.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void a(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c5b112b74146f2ebda36aad4eb21c81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c5b112b74146f2ebda36aad4eb21c81");
        } else {
            this.j.a(2, goodsPoiCategory, goodsSpu, 1, null);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void b(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9137cb907dd0a1d1d9c64787b8554780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9137cb907dd0a1d1d9c64787b8554780");
        } else {
            this.j.a(4, goodsPoiCategory, goodsSpu, 1, null);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa36c9df7216a74561bcff51de6fc16c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa36c9df7216a74561bcff51de6fc16c");
        } else {
            a(goodsPoiCategory, i, false, list);
        }
    }

    private void a(GoodsPoiCategory goodsPoiCategory, int i, boolean z, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094c0ad1853dfddd5d346591bbbfe23b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094c0ad1853dfddd5d346591bbbfe23b");
        } else {
            this.j.a(z ? 1 : 0, goodsPoiCategory, null, i, list);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void f(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2676b665e558d0f55fd0a38db55c418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2676b665e558d0f55fd0a38db55c418");
        } else {
            a(m(), 1, z, null);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a2e19e0457b1873cfadf06293c46ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a2e19e0457b1873cfadf06293c46ad");
        } else {
            this.c.b();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "806c7cfd0ae34d505bbd97d2d619dda3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "806c7cfd0ae34d505bbd97d2d619dda3");
        } else {
            this.c.i();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48acca7208e8de6029e5b985ace8d5ad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48acca7208e8de6029e5b985ace8d5ad")).booleanValue() : this.j.g();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d43c4652f4feb1aae42731896ff01a02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d43c4652f4feb1aae42731896ff01a02");
        } else {
            this.j.a(-1L);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final int u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b15a47f34dd7ae3769ee1d61e766901", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b15a47f34dd7ae3769ee1d61e766901")).intValue() : this.j.e();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final int v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fca3980d66b60fa9b97814d75594411", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fca3980d66b60fa9b97814d75594411")).intValue() : this.j.f();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    @NonNull
    public final com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot.c w() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249ef22e3ba6b3d545c816f9fed71ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249ef22e3ba6b3d545c816f9fed71ad6");
        } else {
            this.j.d();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8ed743552692d12e6b1d904dd486663", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8ed743552692d12e6b1d904dd486663") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final GoodsPoiCategory y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573fbce1a1be3ea5720a02095b4e0f69", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573fbce1a1be3ea5720a02095b4e0f69") : this.j.h();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final boolean c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd285e3b6754863854fd0c9da1a681b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd285e3b6754863854fd0c9da1a681b")).booleanValue() : this.j.c(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee6c27b34f0b4d4730a1aa813677a30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee6c27b34f0b4d4730a1aa813677a30")).booleanValue() : this.j.b(goodsPoiCategory, goodsPoiCategory2);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final String z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2540a860aff479dd8f801757c1360c1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2540a860aff479dd8f801757c1360c1c");
        }
        Poi poi = q().b;
        return poi == null ? "" : poi.abExpInfo;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final boolean d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6abdb0ff0c505562e4489c3973958761", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6abdb0ff0c505562e4489c3973958761")).booleanValue() : this.j.d(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14f77d932b59eecbf5232bc079d37a0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14f77d932b59eecbf5232bc079d37a0")).intValue() : this.j.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3228478ecbaa66de4e77191d537a94f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3228478ecbaa66de4e77191d537a94f3")).booleanValue() : this.j.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29118a2f6f4517c320d9258bbb8531cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29118a2f6f4517c320d9258bbb8531cf")).booleanValue() : this.j.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void e(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d5ac8b6c98469079fab2a01ccd3040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d5ac8b6c98469079fab2a01ccd3040");
            return;
        }
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.b bVar = this.e;
        Object[] objArr2 = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d439bda52b0cebf53440a0310f0bdfff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d439bda52b0cebf53440a0310f0bdfff");
            return;
        }
        bVar.show();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "ce218b16497958adcdbdd1f05fb106cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "ce218b16497958adcdbdd1f05fb106cf");
        } else {
            bVar.c.b_(null);
        }
        bVar.b.a(goodsPoiCategory);
        bVar.b.a((GoodsSpu) null);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void g(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94087fa3d833ec34ab8ba1bf1daf394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94087fa3d833ec34ab8ba1bf1daf394");
        } else {
            this.c.a(z);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5317e0f5f1f5981741ee67a23d175d23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5317e0f5f1f5981741ee67a23d175d23");
        } else {
            this.c.a(bool);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void h(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb8c45d34d305f56bc5f2160fd02e37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb8c45d34d305f56bc5f2160fd02e37");
        } else {
            this.c.b(z);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b, com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff40c0306df0f83268bb6eeafc09eeac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff40c0306df0f83268bb6eeafc09eeac");
            return;
        }
        if (this.d != null) {
            this.d.a(-1);
        }
        if (this.c != null) {
            this.c.a(-1);
            this.c.c();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c075016baef2ddf91f94cd677126b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c075016baef2ddf91f94cd677126b8");
            return;
        }
        com.sankuai.waimai.store.goods.subscribe.a.a().b(this);
        if (this.c != null) {
            this.c.onDestroy();
        }
        if (this.d != null) {
            this.d.onDestroy();
        }
        if (this.a != null) {
            this.a.removeCallbacks(this.m);
        }
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.event.h.a().b(this);
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        com.meituan.android.bus.a.a().b(this);
    }

    @Override // com.sankuai.waimai.store.goods.subscribe.c
    public final void a(long j, String str, long j2, long j3, int i) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833759d89ad5e1d43ac61b108a108c5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833759d89ad5e1d43ac61b108a108c5e");
        } else if (com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, q().h(), j, q().f())) {
            this.j.a(j2, j3, i);
            this.c.c();
            com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.b bVar = this.e;
            Object[] objArr2 = {new Long(j2), new Long(j3), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "228504c6933d0d141eabe8d3070647c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "228504c6933d0d141eabe8d3070647c0");
                return;
            }
            bVar.b.a(j2, j3, i);
            bVar.c.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687725c22a8c9e6a51cae255b5dd3785", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687725c22a8c9e6a51cae255b5dd3785")).booleanValue();
        }
        if (this.e == null || !this.e.isVisible()) {
            return false;
        }
        this.e.hide();
        return true;
    }

    public void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd03bcf61d4b950f0c4ba6162642fa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd03bcf61d4b950f0c4ba6162642fa3");
        } else if (this.i != null) {
            this.i.a(false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAnchorSecondCategoryEvent(com.sankuai.waimai.store.coupons.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a74f50a4d7fddb887b323021a95f510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a74f50a4d7fddb887b323021a95f510");
        } else if (aVar == null || TextUtils.isEmpty(aVar.a)) {
        } else {
            this.j.b(aVar.a);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRecommendPairEvent(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1248374df9cc9c8e2bb7ad6c34501b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1248374df9cc9c8e2bb7ad6c34501b");
        } else if (aVar == null || aVar.b == null || aVar.b.recommendPair != null || aVar.a != q()) {
        } else {
            this.j.a(aVar.b, aVar.c);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a4cea55de56a3e813e10a634fcb2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a4cea55de56a3e813e10a634fcb2cb");
        } else {
            this.b.a(0L);
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55d4d627480738103c9e4f58c72e04a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55d4d627480738103c9e4f58c72e04a");
        } else if (poiCouponItem == null || this.c == null) {
        } else {
            this.d.a(poiCouponItem);
            this.c.a(poiCouponItem);
        }
    }
}
