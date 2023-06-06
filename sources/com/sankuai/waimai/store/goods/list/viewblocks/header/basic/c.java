package com.sankuai.waimai.store.goods.list.viewblocks.header.basic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f;
import com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b implements f {
    public static ChangeQuickRedirect a;
    public d b;
    public g c;

    public c(Context context, d dVar) {
        super(context);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4bb7538ff62a0b1aa5a6e2af208d7cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4bb7538ff62a0b1aa5a6e2af208d7cb");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db96968907aba2f38a492155575d9bc", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db96968907aba2f38a492155575d9bc") : layoutInflater.inflate(R.layout.wm_st_goods_list_market_layout_mach, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed01c36ba716a616fcfe1279eeaab51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed01c36ba716a616fcfe1279eeaab51");
            return;
        }
        super.onViewCreated();
        this.c = new g(this, (LinearLayout) this.mView.findViewById(R.id.layout_header_view), i.h().a(SCConfigPath.SGC_POI_HEADER_MACH_SYNC, false));
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0977504d0dd5b7e72a651d2aeb699225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0977504d0dd5b7e72a651d2aeb699225");
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            this.c.b();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a03157b9c981c13b0369d8009b66176e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a03157b9c981c13b0369d8009b66176e") : this.b.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final d f() {
        return this.b;
    }
}
