package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
import com.sankuai.waimai.store.drug.goods.list.interfaces.b;
import com.sankuai.waimai.store.drug.newwidgets.DrugNetInfoLoadView;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.w;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends ShopContentRootBlock implements PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect d;
    private DrugNetInfoLoadView a;
    private View b;
    private boolean c;
    @NonNull
    protected final com.sankuai.waimai.store.drug.goods.list.delegate.d e;
    protected RestMenuResponse f;

    public void b(long j) {
    }

    public b(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.d dVar, b.a aVar) {
        super(dVar, aVar);
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4fba6a8c25c73bd24ac705c5ee1d9c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4fba6a8c25c73bd24ac705c5ee1d9c4");
            return;
        }
        this.c = true;
        this.e = dVar;
    }

    public void a(RestMenuResponse restMenuResponse) {
        this.f = restMenuResponse;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.a
    public View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c74c1c3e3504e0a4c9e3495c96cdb0dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c74c1c3e3504e0a4c9e3495c96cdb0dd");
        }
        this.b = super.a(layoutInflater, viewGroup);
        this.b.setVisibility(8);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.wm_drug_shop_content_fragment_layout, viewGroup, false);
        this.a = (DrugNetInfoLoadView) viewGroup2.findViewById(R.id.wm_st_shop_content_load_view);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        layoutParams.height = com.sankuai.shangou.stone.util.h.d(this.k) - this.e.f();
        this.a.setLayoutParams(layoutParams);
        this.a.setReloadClickListener(c.a(this));
        if (this.e.k() != null) {
            SCBaseActivity k = this.e.k();
            TextView reloadButtonView = this.a.getReloadButtonView();
            com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(reloadButtonView, String.valueOf(System.identityHashCode(reloadButtonView)));
            Object[] objArr2 = {this, k};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            aVar.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cfaee44bc62123c4e50a3e944f7dd0c9", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cfaee44bc62123c4e50a3e944f7dd0c9") : new d(this, k));
            com.sankuai.waimai.store.expose.v2.b.a().a(k, aVar);
        }
        if (this.e.e() != null) {
            this.e.e().a(this);
        }
        viewGroup2.addView(this.b);
        return viewGroup2;
    }

    public static /* synthetic */ void c(b bVar, View view) {
        Object[] objArr = {bVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e1cd2ae5bfa040920624355d6914254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e1cd2ae5bfa040920624355d6914254");
        } else {
            bVar.a(-1L);
        }
    }

    public static /* synthetic */ void a(b bVar, SCBaseActivity sCBaseActivity) {
        Object[] objArr = {bVar, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70cfb8e12a35a4a3cbf1a47a823eb4e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70cfb8e12a35a4a3cbf1a47a823eb4e0");
        } else if (bVar.c) {
            DrugShopStatusViewModel.b(bVar.e.d() == null ? "" : bVar.e.d().h(), 1, sCBaseActivity.d());
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387e94a87ff65273d429ed2bf57dc195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387e94a87ff65273d429ed2bf57dc195");
        } else {
            this.e.a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ee51df4fa37418b1f36c970dac876f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ee51df4fa37418b1f36c970dac876f");
        } else {
            this.e.c();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb3165c8b789fa027a1e559b3163677", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb3165c8b789fa027a1e559b3163677") : com.sankuai.waimai.store.manager.judas.b.a(this.k);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd84655c3c2b5f6d2e15eda1863a142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd84655c3c2b5f6d2e15eda1863a142");
            return;
        }
        this.c = false;
        this.a.a();
        this.b.setVisibility(8);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7cf7cfd44bcdfaeb1ef1f5289290d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7cf7cfd44bcdfaeb1ef1f5289290d33");
            return;
        }
        this.c = false;
        this.a.c();
        this.b.setVisibility(0);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ee238b0fe9f087b7e8b68f687ffacf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ee238b0fe9f087b7e8b68f687ffacf6");
            return;
        }
        this.b.setVisibility(8);
        this.c = true;
        this.a.setReloadClickListener(e.a(this));
        this.a.setReloadButtonText(R.string.drug_shop_no_merchandise_button_text);
        this.a.a(this.a.getContext().getString(R.string.drug_shop_no_merchandise_pager_tip), "", false);
    }

    public static /* synthetic */ void b(b bVar, View view) {
        Object[] objArr = {bVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2454517383fcad36163d87d6dba86b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2454517383fcad36163d87d6dba86b83");
            return;
        }
        SCBaseActivity k = bVar.e.k();
        if (com.sankuai.waimai.store.util.b.a(k)) {
            return;
        }
        String str = ((DrugShopStatusViewModel) q.a((FragmentActivity) k).a(DrugShopStatusViewModel.class)).g;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.sankuai.waimai.store.router.d.a(k, str);
        DrugShopStatusViewModel.a(bVar.e.d() == null ? "" : bVar.e.d().h(), 1, k.d());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a6a631d5e3a1b8ae98f166a437f900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a6a631d5e3a1b8ae98f166a437f900");
            return;
        }
        this.c = false;
        this.b.setVisibility(8);
        this.a.setReloadClickListener(f.a(this));
        this.a.setReloadButtonText(R.string.wm_sc_common_reload);
        this.a.a(str, "");
    }

    public static /* synthetic */ void a(b bVar, View view) {
        Object[] objArr = {bVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59a0f50d8e7d237ad67897f15d97cbf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59a0f50d8e7d237ad67897f15d97cbf3");
        } else {
            bVar.a(-1L);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab141cbb572fd53b0847caf8a463acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab141cbb572fd53b0847caf8a463acf");
        } else if (this.e.e() != null) {
            this.e.e().setNestedScrollEnabled(z);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a3e80ff81de5440bd863fcdc00b29ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a3e80ff81de5440bd863fcdc00b29ed");
        } else if (this.e.e() != null) {
            this.e.e().setForbidScroll(z);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final void a(com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d31cfdcfb60bac258edbfc6298cc03f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d31cfdcfb60bac258edbfc6298cc03f");
        } else if (this.e.d() == null || this.e.d().b == null) {
        } else {
            if (w.e(this.e.d().b) || w.f(this.e.d().b) || w.g(this.e.d().b)) {
                super.a(fVar);
            }
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5aadf90c0f187e284f949b2c68cf309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5aadf90c0f187e284f949b2c68cf309");
        } else {
            this.j.a(this.f != null ? this.f.extra : "", j);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe22859b906a485b6460f5967327998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe22859b906a485b6460f5967327998");
        } else {
            this.i.a(false);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final long k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5270283292c003f8a46a3652055fb18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5270283292c003f8a46a3652055fb18")).longValue();
        }
        if (this.f != null) {
            return this.f.getChosenSpuId();
        }
        return -1L;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7325b60081fa6489202f9fc8e0c7930", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7325b60081fa6489202f9fc8e0c7930")).booleanValue() : this.f != null && this.f.getChosenSpuNeedAdd();
    }
}
