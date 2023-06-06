package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
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
public final class e extends com.sankuai.waimai.store.goods.list.viewblocks.header.a implements f, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    public ViewGroup d;
    private View l;
    private g m;
    private com.sankuai.waimai.store.goods.list.helper.e n;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_st_goods_list_market_layout_extensible_header;
    }

    public e(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be9bac6507679ef60d53a99aa8011a8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be9bac6507679ef60d53a99aa8011a8a");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc7397a81c51dd9419c4185a8b5d858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc7397a81c51dd9419c4185a8b5d858");
            return;
        }
        k.c((Activity) this.mContext, true);
        this.l = view.findViewById(R.id.layout_divider_line);
        this.d = (ViewGroup) view.findViewById(R.id.basic_poi_info_layout);
        this.m = new g(this, (LinearLayout) view.findViewById(R.id.layout_header_view), com.sankuai.waimai.store.config.i.h().a(SCConfigPath.SGC_POI_HEADER_MACH_SYNC, false));
        this.n = new com.sankuai.waimai.store.goods.list.helper.e(this.f);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66a4b1accf4eb6a2ee68f085b119efe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66a4b1accf4eb6a2ee68f085b119efe");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
        }
        this.m.a(list);
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73041251e3c29fe3533ed2c98e5df053", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73041251e3c29fe3533ed2c98e5df053")).intValue() : this.m.a();
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f7c6cb987fef3814337fd1bd3fdc8a9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f7c6cb987fef3814337fd1bd3fdc8a9")).intValue() : com.sankuai.shangou.stone.util.h.a(this.mContext, 48.0f) + u.a(this.h.getContext());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729909b6a23bb6c99ca9ac868f5b87e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729909b6a23bb6c99ca9ac868f5b87e0");
            return;
        }
        float a = n.a((i * 1.0f) / b(), 0.0f, 1.0f);
        this.g.b(a);
        this.h.setAlpha(a);
        k.c((Activity) this.mContext, ((double) a) < 0.5d);
        this.n.a(this.g, this.m.c(), b());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089802528967d0876f4824544b4255b6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089802528967d0876f4824544b4255b6") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.goods.list.delegate.d f() {
        return this.a;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca957aba15c48f9745787dd0ac4a1b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca957aba15c48f9745787dd0ac4a1b03");
            return;
        }
        super.onDestroy();
        if (this.m != null) {
            this.m.b();
        }
        if (this.n != null) {
            this.n.a();
        }
    }
}
