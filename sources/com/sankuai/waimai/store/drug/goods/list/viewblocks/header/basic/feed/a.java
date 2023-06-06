package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed;

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
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a implements e, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    private com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a i;
    private View j;
    private f k;
    private com.sankuai.waimai.store.drug.goods.list.helper.d l;
    private ViewGroup m;

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_drug_goods_list_market_layout_basic_header;
    }

    public a(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a097611b8121d9c3b331bffdf9afdb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a097611b8121d9c3b331bffdf9afdb2");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c82f1a66efc7a6ee64ac0bae54595275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c82f1a66efc7a6ee64ac0bae54595275");
            return;
        }
        k.c((Activity) this.mContext, true);
        this.j = view.findViewById(R.id.layout_divider_line);
        this.m = (ViewGroup) view.findViewById(R.id.basic_poi_info_layout);
        u.c(this.m, 0, b() - this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_5), 0, 0);
        this.k = new f(this, (LinearLayout) view.findViewById(R.id.layout_header_view), i.h().a(SCConfigPath.SGC_POI_HEADER_MACH_SYNC, false));
        this.i = new com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a(this.a);
        this.l = new com.sankuai.waimai.store.drug.goods.list.helper.d(this.e);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d29dc8514bd4efa4bc45512e4ffb11a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d29dc8514bd4efa4bc45512e4ffb11a3");
            return;
        }
        this.m.removeAllViews();
        if (!poi.isUserHeaderInfoModule) {
            Object[] objArr2 = {poi};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ab4d873f8a8311574436adb239aadc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ab4d873f8a8311574436adb239aadc8");
            } else {
                this.m.addView(this.i.createView(this.m));
                this.i.d = new a.InterfaceC1150a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a.InterfaceC1150a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7886c77fc5aa09fae5580eecc46d0b5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7886c77fc5aa09fae5580eecc46d0b5");
                        } else {
                            a.this.g();
                        }
                    }
                };
                this.i.a(poi);
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
        this.k.a(list);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6985e5618a69869f3466c10ad724f9cc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6985e5618a69869f3466c10ad724f9cc")).intValue() : this.k.a();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da724c56cc77803fbeb8108779a102b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da724c56cc77803fbeb8108779a102b")).intValue() : com.sankuai.shangou.stone.util.h.a(this.mContext, 48.0f) + u.a(this.g.getContext());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1df13d73b231c9883880771dc3eae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1df13d73b231c9883880771dc3eae9");
            return;
        }
        float a = n.a((i * 1.0f) / b(), 0.0f, 1.0f);
        this.f.a(a);
        this.g.setAlpha(a);
        k.c((Activity) this.mContext, ((double) a) < 0.5d);
        this.l.a(this.f, this.k.c(), b());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2357e318ce652fecaa3b2189dd1b29bb", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2357e318ce652fecaa3b2189dd1b29bb") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e
    public final com.sankuai.waimai.store.drug.goods.list.delegate.c f() {
        return this.a;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df861008d5936e8519ea9591f7596b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df861008d5936e8519ea9591f7596b98");
            return;
        }
        super.onDestroy();
        if (this.k != null) {
            this.k.b();
        }
        if (this.l != null) {
            this.l.a();
        }
    }
}
