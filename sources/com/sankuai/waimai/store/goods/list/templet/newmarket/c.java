package com.sankuai.waimai.store.goods.list.templet.newmarket;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.w;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends ShopContentRootBlock implements g, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect d;
    private NetInfoLoadView a;
    private View b;
    private boolean c;
    @NonNull
    protected final com.sankuai.waimai.store.goods.list.delegate.e e;
    public RestMenuResponse f;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final boolean q() {
        return true;
    }

    public c(@NonNull com.sankuai.waimai.store.goods.list.delegate.e eVar, a.InterfaceC1266a interfaceC1266a) {
        super(eVar, interfaceC1266a);
        Object[] objArr = {eVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd3b1004127d06480872be4d878de5a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd3b1004127d06480872be4d878de5a2");
            return;
        }
        this.c = true;
        this.e = eVar;
    }

    public void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c26e0ce970386ba2aca7ca42b0e6737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c26e0ce970386ba2aca7ca42b0e6737");
            return;
        }
        this.f = restMenuResponse;
        if (this.f.mGoodPoiCategoryList == null || this.e.d() == null || this.e.d().t()) {
            return;
        }
        this.c = false;
        for (GoodsPoiCategory goodsPoiCategory : this.f.mGoodPoiCategoryList) {
            if (goodsPoiCategory != null && goodsPoiCategory.aggregationActivityTags) {
                this.c = true;
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.a, com.sankuai.waimai.store.goods.list.templet.newmarket.g
    public View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b31578b9e394871dc1a8e6012134c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b31578b9e394871dc1a8e6012134c7");
        }
        this.b = super.a(layoutInflater, viewGroup);
        this.b.setVisibility(8);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.wm_sc_shop_content_fragment_layout, viewGroup, false);
        this.a = (NetInfoLoadView) viewGroup2.findViewById(R.id.wm_st_shop_content_load_view);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        layoutParams.height = com.sankuai.shangou.stone.util.h.d(this.k) - this.e.f();
        this.a.setLayoutParams(layoutParams);
        this.a.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52195d4f917fbcd2d9bb627f9a8ccd23", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52195d4f917fbcd2d9bb627f9a8ccd23");
                } else {
                    c.this.a(-1L);
                }
            }
        });
        if (this.e.e() != null) {
            this.e.e().a(this);
        }
        viewGroup2.addView(this.b);
        S();
        return viewGroup2;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342c770765b1fe90b42a082b0778afc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342c770765b1fe90b42a082b0778afc2");
        } else {
            this.e.a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b575f5cfb49103e9827f425800c5bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b575f5cfb49103e9827f425800c5bc");
        } else {
            this.e.c();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ad0f5dbe614b9650bc35395b9b9bf3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ad0f5dbe614b9650bc35395b9b9bf3") : com.sankuai.waimai.store.manager.judas.b.a(this.k);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c18669f59999742474b96984212c3e71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c18669f59999742474b96984212c3e71");
            return;
        }
        this.a.b();
        this.b.setVisibility(8);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "777e07165366c0fa28b76e2f78ed672d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "777e07165366c0fa28b76e2f78ed672d");
            return;
        }
        this.a.e();
        this.b.setVisibility(0);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401a2ac87f8d6e72decd7aff44100ffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401a2ac87f8d6e72decd7aff44100ffd");
            return;
        }
        this.b.setVisibility(8);
        this.a.a(str);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4059ff8027ab6fcd892cc8bb7140838e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4059ff8027ab6fcd892cc8bb7140838e");
        } else if (this.e.e() != null) {
            this.e.e().setNestedScrollEnabled(z);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc5b111c11645a194ff32a21c91af8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc5b111c11645a194ff32a21c91af8c");
        } else if (this.e.e() != null) {
            this.e.e().setForbidScroll(z);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void a(com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9213159a56420bc97e67d85689e70040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9213159a56420bc97e67d85689e70040");
        } else if (this.e.d() == null || this.e.d().b == null) {
        } else {
            if (w.e(this.e.d().b) || w.f(this.e.d().b) || w.g(this.e.d().b)) {
                super.a(fVar);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.g
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24cf75d24b6c7d9b071c3fedeee90348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24cf75d24b6c7d9b071c3fedeee90348");
        } else {
            this.j.a(this.f != null ? this.f.extra : "", j);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddfe0274cf4869cdcd084e06f34f6e02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddfe0274cf4869cdcd084e06f34f6e02");
        } else {
            this.i.a(false);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final long n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b844ddec5ca082107a227428452fb1f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b844ddec5ca082107a227428452fb1f1")).longValue();
        }
        if (this.f != null) {
            return this.f.getChosenSpuId();
        }
        return -1L;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2d0898527a470a1efdba1aa65ee350", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2d0898527a470a1efdba1aa65ee350")).booleanValue() : this.f != null && this.f.getChosenSpuNeedAdd();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65fe09f8391116f4aa5e50033c7c12d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65fe09f8391116f4aa5e50033c7c12d")).booleanValue();
        }
        if (this.c) {
            return super.p();
        }
        return true;
    }
}
