package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

import android.content.Context;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter;
import com.sankuai.waimai.store.repository.model.PoiGuessULikeSpuTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiGuessULikePagerAdapter extends SGCachePagerAdapter {
    public static ChangeQuickRedirect a;
    public final List<PoiGuessULikeSpuTag> b;
    List<e> c;
    private final Context d;
    private final com.sankuai.waimai.store.goods.list.delegate.e e;
    private final com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a f;

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final int a(int i) {
        return 0;
    }

    public PoiGuessULikePagerAdapter(Context context, com.sankuai.waimai.store.goods.list.delegate.e eVar, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar, a.InterfaceC1266a interfaceC1266a) {
        Object[] objArr = {context, eVar, aVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bbea1666fc31158a9253741464df11b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bbea1666fc31158a9253741464df11b");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = context;
        this.e = eVar;
        this.f = aVar;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.c)) {
            this.c.clear();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ca365ad03ccd5939767c6c58cf391c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ca365ad03ccd5939767c6c58cf391c");
        }
        e eVar = new e(this.d, this.e, this.f, (PoiGuessULikeSpuTag) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i));
        this.c.add(eVar);
        return eVar;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final void a(com.sankuai.waimai.store.base.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55565618c93fd985ef5c1baf5764ae26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55565618c93fd985ef5c1baf5764ae26");
        } else if (bVar instanceof e) {
            ((e) bVar).f = (PoiGuessULikeSpuTag) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2c747cc73ec171fbfc900b67a64699", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2c747cc73ec171fbfc900b67a64699")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }
}
