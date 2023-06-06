package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed;

import android.app.Activity;
import android.graphics.drawable.Drawable;
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
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.goods.list.viewblocks.header.a implements f, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    private c d;
    private View l;
    private com.sankuai.waimai.store.goods.list.helper.e m;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_st_goods_list_drug_layout_extensible_header;
    }

    public d(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f61a4dd6466ec8df0042a82b4823b6cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f61a4dd6466ec8df0042a82b4823b6cd");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3202410cd054045bf31cbca514eb2172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3202410cd054045bf31cbca514eb2172");
            return;
        }
        k.c((Activity) this.mContext, true);
        view.findViewById(R.id.layout_divider_line).setVisibility(8);
        this.d = new c(this, (LinearLayout) view.findViewById(R.id.layout_header_view));
        this.m = new com.sankuai.waimai.store.goods.list.helper.e(this.f);
        this.l = view.findViewById(R.id.v_space_tab_bottom);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73b2cbae2a360bedd0b166babd13a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73b2cbae2a360bedd0b166babd13a4b");
            return;
        }
        super.onViewCreated();
        com.sankuai.waimai.store.viewblocks.i iVar = this.g;
        Object[] objArr2 = {Integer.valueOf((int) R.drawable.sc_wm_super_drugstore_cart)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.viewblocks.i.d;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "aca9b004583b094f4b8e5b87f396308f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "aca9b004583b094f4b8e5b87f396308f");
        } else if (iVar.f != null) {
            iVar.f.setCompoundDrawablesWithIntrinsicBounds(com.sankuai.waimai.store.util.b.d(iVar.getContext(), R.drawable.sc_wm_super_drugstore_cart), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a4b505e76111bad3425437dce099ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a4b505e76111bad3425437dce099ada");
        } else {
            this.d.a(list);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14776475a9fc882c57083754587ff6d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14776475a9fc882c57083754587ff6d1")).intValue() : this.d.a() + d();
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6374638aac18a17d0e1f06743678df6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6374638aac18a17d0e1f06743678df6")).intValue() : com.sankuai.shangou.stone.util.h.a(this.mContext, 48.0f) + u.a(this.h.getContext());
    }

    private int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b07d9073aa5dfda0ef8d0cb430942ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b07d9073aa5dfda0ef8d0cb430942ea")).intValue();
        }
        if (this.l == null) {
            return 0;
        }
        return this.l.getHeight();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33bd64cf29e8e80b83ca60dd95f83de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33bd64cf29e8e80b83ca60dd95f83de0");
            return;
        }
        float a = n.a((i * 1.0f) / b(), 0.0f, 1.0f);
        this.g.b(a);
        this.h.setAlpha(a);
        k.c((Activity) this.mContext, ((double) a) < 0.5d);
        this.m.a(this.g, this.d.c(), b());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "766c506e21c10d7432a87a9afd425de9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "766c506e21c10d7432a87a9afd425de9") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.goods.list.delegate.d f() {
        return this.a;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b476a8730eb6140abeb730c9f2e4e425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b476a8730eb6140abeb730c9f2e4e425");
            return;
        }
        super.onDestroy();
        if (this.d != null) {
            this.d.b();
        }
        if (this.m != null) {
            this.m.a();
        }
    }
}
