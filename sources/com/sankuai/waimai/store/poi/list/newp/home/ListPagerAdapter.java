package com.sankuai.waimai.store.poi.list.newp.home;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ListPagerAdapter extends SGCachePagerAdapter {
    public static ChangeQuickRedirect a;
    final List b;
    private final com.sankuai.waimai.store.param.a c;
    private final SCBaseActivity d;
    private com.sankuai.waimai.store.poi.list.newp.home.callback.b e;
    private com.sankuai.waimai.store.poi.list.newp.home.model.a f;

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final int a(int i) {
        return 0;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final void a(com.sankuai.waimai.store.base.b bVar, int i) {
    }

    public ListPagerAdapter(SCBaseActivity sCBaseActivity, com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.newp.home.model.a aVar2, com.sankuai.waimai.store.poi.list.newp.home.callback.b bVar) {
        Object[] objArr = {sCBaseActivity, aVar, aVar2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e1c976b54484b95ae2535ba1110c95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e1c976b54484b95ae2535ba1110c95");
            return;
        }
        this.b = new ArrayList();
        this.c = aVar;
        this.d = sCBaseActivity;
        this.e = bVar;
        this.f = aVar2;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569c894c192f89acd70805bb8293f358", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569c894c192f89acd70805bb8293f358") : new e(this.d, this.c, this.f, this.e);
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6669e2251278d9e2ed904cab8b6e2d2e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6669e2251278d9e2ed904cab8b6e2d2e")).intValue() : com.sankuai.shangou.stone.util.a.a(this.b);
    }
}
