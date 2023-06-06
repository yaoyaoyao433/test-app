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
public final class a extends com.sankuai.waimai.store.goods.list.viewblocks.header.a implements f, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    private View d;
    private g l;
    private com.sankuai.waimai.store.goods.list.helper.e m;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_st_goods_list_market_layout_basic_header;
    }

    public a(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9e2063d10f8f57639c2143a52e5c9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9e2063d10f8f57639c2143a52e5c9a");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99cce38d3eb7843c13b259f57937ed82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99cce38d3eb7843c13b259f57937ed82");
            return;
        }
        k.c((Activity) this.mContext, true);
        this.d = view.findViewById(R.id.layout_divider_line);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_header_view);
        u.c(linearLayout, 0, b() - this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_5), 0, 0);
        this.l = new g(this, linearLayout, com.sankuai.waimai.store.config.i.h().a(SCConfigPath.SGC_POI_HEADER_MACH_SYNC, false));
        this.m = new com.sankuai.waimai.store.goods.list.helper.e(this.f);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4453e62677231871e7ce104cae9e230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4453e62677231871e7ce104cae9e230");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
        this.l.a(list);
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "facf9c29d1f903918b0f27686f0dfcd3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "facf9c29d1f903918b0f27686f0dfcd3")).intValue() : this.l.a();
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62692411552f8b5ca75e22abacc46249", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62692411552f8b5ca75e22abacc46249")).intValue() : com.sankuai.shangou.stone.util.h.a(this.mContext, 48.0f) + u.a(this.h.getContext());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53858d9bdd921c388b2950e6e534354", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53858d9bdd921c388b2950e6e534354");
            return;
        }
        float a = n.a((i * 1.0f) / b(), 0.0f, 1.0f);
        this.g.b(a);
        this.h.setAlpha(a);
        k.c((Activity) this.mContext, ((double) a) < 0.5d);
        this.m.a(this.g, this.l.c(), b());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870a7d84a4b2b1a7727e9b5fc076b0bb", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870a7d84a4b2b1a7727e9b5fc076b0bb") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.goods.list.delegate.d f() {
        return this.a;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9f73d050233cfb5bab2ab0095029df6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9f73d050233cfb5bab2ab0095029df6");
            return;
        }
        super.onDestroy();
        if (this.l != null) {
            this.l.b();
        }
        if (this.m != null) {
            this.m.a();
        }
    }
}
