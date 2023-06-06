package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.sankuai.waimai.store.goods.list.viewblocks.header.a implements f, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    private g d;
    private com.sankuai.waimai.store.goods.list.helper.e l;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_st_goods_list_market_layout_extensible_header;
    }

    public i(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3227fc974e3ae0a5f8eaef6aa34d523a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3227fc974e3ae0a5f8eaef6aa34d523a");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2103c05bad31dd55bd57a94c769f9330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2103c05bad31dd55bd57a94c769f9330");
            return;
        }
        k.c((Activity) this.mContext, true);
        this.d = new g(this, (LinearLayout) view.findViewById(R.id.layout_header_view), com.sankuai.waimai.store.config.i.h().a(SCConfigPath.SGC_POI_HEADER_MACH_SYNC, false));
        this.l = new com.sankuai.waimai.store.goods.list.helper.e(this.f);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final com.sankuai.waimai.store.viewblocks.i a(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44b573885d757eebd8e506e444c45fa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.viewblocks.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44b573885d757eebd8e506e444c45fa") : new com.sankuai.waimai.store.viewblocks.i(dVar) { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i.1
            @Override // com.sankuai.waimai.store.viewblocks.i
            public final int a() {
                return R.layout.wm_sc_goods_list_standard_shop_action_bar;
            }
        };
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a3dd897fed514377d22af7148d8163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a3dd897fed514377d22af7148d8163");
            return;
        }
        if (this.a.j() != null) {
            this.a.j().recordStep("standard_feeds_render_start");
        }
        this.d.a(list);
        if (this.a.j() != null) {
            this.a.j().recordStep("standard_feeds_render_end");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f86a7567861199192fe81812e5c47bd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f86a7567861199192fe81812e5c47bd")).intValue() : getView().getHeight();
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7ca9850fca971226f16dfc124dc8bd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7ca9850fca971226f16dfc124dc8bd")).intValue() : com.sankuai.shangou.stone.util.h.a(getContext(), 48.0f) + u.a(getContext());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aead5aa2ed17676c24bcc6bb0453b909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aead5aa2ed17676c24bcc6bb0453b909");
            return;
        }
        float a = n.a((i * 1.0f) / b(), 0.0f, 1.0f);
        this.g.b(a);
        this.h.setAlpha(a);
        k.c((Activity) this.mContext, ((double) a) < 0.5d);
        this.l.a(this.g, this.d.c(), b());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3748e7f064fba72eaf9d0d8db51650", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3748e7f064fba72eaf9d0d8db51650") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.goods.list.delegate.d f() {
        return this.a;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e949c63e644bc4fd27841df3a9154917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e949c63e644bc4fd27841df3a9154917");
            return;
        }
        super.onDestroy();
        if (this.d != null) {
            this.d.b();
        }
        if (this.l != null) {
            this.l.a();
        }
    }
}
