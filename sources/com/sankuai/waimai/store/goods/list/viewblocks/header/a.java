package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.goods.list.base.d implements com.sankuai.waimai.store.goods.list.base.b, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect e;
    private i c;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a f;
    public final com.sankuai.waimai.store.viewblocks.i g;
    public View h;
    public ViewGroup i;
    public l j;
    protected ViewGroup k;

    public abstract void a(View view);

    public abstract void a(@NonNull Poi poi);

    public void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
    }

    @LayoutRes
    public abstract int c();

    public void c_(int i) {
    }

    public a(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9d36d08840d61c46fbfb7f7afbc8ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9d36d08840d61c46fbfb7f7afbc8ae");
            return;
        }
        this.g = a(dVar);
        this.f = dVar.d();
    }

    public com.sankuai.waimai.store.viewblocks.i a(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ebd00cebfbfef131e7b73780db57423", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.viewblocks.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ebd00cebfbfef131e7b73780db57423") : new com.sankuai.waimai.store.viewblocks.i(dVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514cacd21ee14ad8228dac808c57f74b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514cacd21ee14ad8228dac808c57f74b");
        }
        this.k = viewGroup;
        View inflate = layoutInflater.inflate(c(), viewGroup, false);
        a(inflate);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5047ad261fb6b9facabedf20ecafb3e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5047ad261fb6b9facabedf20ecafb3e6");
        } else {
            this.g.createAndReplaceView(this.i);
        }
        this.c = new i(this.a.k(), this.a.b());
        this.c.a(inflate);
        return inflate;
    }

    public final void a(Drawable drawable) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82beb66af851e7c1ae6bfc4236359652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82beb66af851e7c1ae6bfc4236359652");
        } else {
            this.k.setBackground(null);
        }
    }

    public final void a(ViewGroup viewGroup, View view) {
        this.i = viewGroup;
        this.h = view;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849043989cd9ea8f63a499c596a8ae75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849043989cd9ea8f63a499c596a8ae75");
        } else {
            this.g.onDestroy();
        }
    }

    public void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2568708e55a65e6da3e6d481c04a2a3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2568708e55a65e6da3e6d481c04a2a3f");
            return;
        }
        Poi poi = restMenuResponse.getPoi();
        if (poi == null) {
            return;
        }
        a(poi);
        a(poi, restMenuResponse.moduleList);
        this.c.a(poi);
        this.g.a(restMenuResponse);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d5d76d0b1bc0829b16e9ddf6984786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d5d76d0b1bc0829b16e9ddf6984786");
        } else if (this.f.c()) {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", this.f.d());
            hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.f.v()));
            com.sankuai.waimai.store.manager.judas.b.a(this.a.b(), str).b(hashMap).a();
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e22014b87057564d57ceed8126440b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e22014b87057564d57ceed8126440b3");
        } else if (this.f.c()) {
            com.sankuai.waimai.store.router.g.a(this.mContext, this.f.f(), this.f.b.getStringPoiId(), 101, this.f.b, 0, this.a == null ? "" : this.a.b());
        }
    }
}
