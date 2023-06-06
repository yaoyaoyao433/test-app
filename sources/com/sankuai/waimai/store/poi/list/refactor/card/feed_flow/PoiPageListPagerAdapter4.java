package com.sankuai.waimai.store.poi.list.refactor.card.feed_flow;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiPageListPagerAdapter4 extends SGCachePagerAdapter {
    public static ChangeQuickRedirect a;
    final List<com.sankuai.waimai.store.poi.list.model.c> b;
    PoiPageContainerCard4.a c;
    private final com.sankuai.waimai.store.param.a d;
    private final SCBaseActivity e;

    public PoiPageListPagerAdapter4(SCBaseActivity sCBaseActivity, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {sCBaseActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8fec4f6ba46fc3650bc6e752fb93005", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8fec4f6ba46fc3650bc6e752fb93005");
            return;
        }
        this.b = new ArrayList();
        this.d = aVar;
        this.e = sCBaseActivity;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70d54f8c1f3473c382756260fbc290b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70d54f8c1f3473c382756260fbc290b2");
        }
        d dVar = new d(this.e, this.d, (com.sankuai.waimai.store.poi.list.model.c) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i));
        dVar.j = this.c;
        return dVar;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final void a(com.sankuai.waimai.store.base.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f158c9cccb046efa2b71d930ee7f705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f158c9cccb046efa2b71d930ee7f705");
        } else if (bVar instanceof d) {
            d dVar = (d) bVar;
            com.sankuai.waimai.store.poi.list.model.c cVar = (com.sankuai.waimai.store.poi.list.model.c) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
            Object[] objArr2 = {cVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "346cf2af046f4c6d96b90ac43e08c418", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "346cf2af046f4c6d96b90ac43e08c418");
                return;
            }
            dVar.f = i;
            dVar.g = cVar;
            if (dVar.e != null) {
                com.sankuai.waimai.store.poi.list.newp.presenter.c cVar2 = dVar.e;
                cVar2.g = i;
                cVar2.f = cVar;
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter, android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        boolean z = false;
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee96472d67b65750fc836b578f71e652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee96472d67b65750fc836b578f71e652");
        } else if (this.j != obj) {
            if (this.j instanceof com.meituan.android.cube.core.pager.a) {
                ((com.meituan.android.cube.core.pager.a) this.j).a(false);
            }
            if (obj instanceof com.meituan.android.cube.core.pager.a) {
                ((com.meituan.android.cube.core.pager.a) obj).a((i != 0 || a() == 0) ? true : true);
            }
            this.j = (com.sankuai.waimai.store.base.b) obj;
        }
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "831660c2e4bd30405d85776f519c7e74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "831660c2e4bd30405d85776f519c7e74")).intValue();
        }
        String str = this.d == null ? "0" : this.d.f;
        for (int i = 0; i < this.b.size(); i++) {
            com.sankuai.waimai.store.poi.list.model.c cVar = this.b.get(i);
            if (cVar != null && !t.a(cVar.b) && cVar.b.equals(str)) {
                return i;
            }
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd4143484f559ef86ed0393b155d37a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd4143484f559ef86ed0393b155d37a8")).intValue();
        }
        com.sankuai.waimai.store.poi.list.model.c cVar = (com.sankuai.waimai.store.poi.list.model.c) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (this.d.g()) {
            return 2;
        }
        if (this.d.h()) {
            return 1;
        }
        if (cVar == null || !cVar.a()) {
            return (cVar == null || !cVar.b()) ? 0 : 4;
        }
        return 3;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc5b8792545e8a11627dc7b35771fb19", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc5b8792545e8a11627dc7b35771fb19")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }
}
