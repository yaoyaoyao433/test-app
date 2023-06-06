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
public final class d extends com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a implements e, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    public ViewGroup i;
    private com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a j;
    private View k;
    private f l;
    private com.sankuai.waimai.store.drug.goods.list.helper.d m;

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_drug_goods_list_market_layout_extensible_header;
    }

    public d(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4171f0554a7370653d47c7563c4230dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4171f0554a7370653d47c7563c4230dd");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26f17f1371402f13d9a30936a6f4677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26f17f1371402f13d9a30936a6f4677");
            return;
        }
        k.c((Activity) this.mContext, true);
        this.k = view.findViewById(R.id.layout_divider_line);
        this.i = (ViewGroup) view.findViewById(R.id.basic_poi_info_layout);
        this.l = new f(this, (LinearLayout) view.findViewById(R.id.layout_header_view), i.h().a(SCConfigPath.SGC_POI_HEADER_MACH_SYNC, false));
        this.j = new com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a(this.a);
        this.m = new com.sankuai.waimai.store.drug.goods.list.helper.d(this.e);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c4036bcadef16e13f975b48a91aa09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c4036bcadef16e13f975b48a91aa09");
            return;
        }
        this.i.removeAllViews();
        if (!poi.isUserHeaderInfoModule) {
            Object[] objArr2 = {poi};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "506c6163f2b1fd120252c6d14bd366d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "506c6163f2b1fd120252c6d14bd366d5");
            } else {
                this.i.addView(this.j.createView(this.i));
                this.j.d = new a.InterfaceC1150a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.d.1
                    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a.InterfaceC1150a
                    public final void a() {
                    }
                };
                this.j.a(poi);
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
        }
        this.l.a(list);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a58103644d2144325589cfe7d212f5b0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a58103644d2144325589cfe7d212f5b0")).intValue() : this.l.a();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd549a52fde17fa1a1f6125eba85a4b3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd549a52fde17fa1a1f6125eba85a4b3")).intValue() : com.sankuai.shangou.stone.util.h.a(this.mContext, 48.0f) + u.a(this.g.getContext());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9ee5efab14b122ea74195525295b16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9ee5efab14b122ea74195525295b16");
            return;
        }
        float a = n.a((i * 1.0f) / b(), 0.0f, 1.0f);
        this.f.a(a);
        this.g.setAlpha(a);
        k.c((Activity) this.mContext, ((double) a) < 0.5d);
        this.m.a(this.f, this.l.c(), b());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a0e09443420661558db43e2359fd71", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a0e09443420661558db43e2359fd71") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e
    public final com.sankuai.waimai.store.drug.goods.list.delegate.c f() {
        return this.a;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5471cb3ee8430852539b0736f1a93ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5471cb3ee8430852539b0736f1a93ec");
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
