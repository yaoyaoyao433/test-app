package com.sankuai.waimai.store.goods.list.templet.newmarket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a {
    public static ChangeQuickRedirect a;
    public final g b;
    private final RestMenuResponse c;

    public h(@NonNull Context context, @NonNull com.sankuai.waimai.store.goods.list.delegate.e eVar, @NonNull RestMenuResponse restMenuResponse) {
        super(context);
        Object[] objArr = {context, eVar, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5307bf2417a99feff499b1fe77f6a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5307bf2417a99feff499b1fe77f6a0");
            return;
        }
        this.b = new c(eVar, null);
        this.b.Q();
        this.c = restMenuResponse;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d1286a5b294fb0aa1b2a37826df1b7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d1286a5b294fb0aa1b2a37826df1b7") : this.b.a(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ccba26b81ff05cf717578132544673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ccba26b81ff05cf717578132544673");
            return;
        }
        super.onViewCreated();
        this.b.a(this.c);
        if (this.c != null) {
            if (com.sankuai.shangou.stone.util.a.b(this.c.mGoodPoiCategoryList)) {
                this.b.a(-1L);
                this.b.b(this.c);
                return;
            }
            this.b.a((IMarketResponse) this.c);
            this.b.m();
        }
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79467da97d79301d38f562535aa5f91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79467da97d79301d38f562535aa5f91");
        } else if (this.b instanceof com.meituan.android.cube.core.pager.a) {
            ((com.meituan.android.cube.core.pager.a) this.b).a(z);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ab3e5fba902f1661a07f43609ab490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ab3e5fba902f1661a07f43609ab490");
            return;
        }
        this.b.b();
        super.onDestroy();
    }
}
