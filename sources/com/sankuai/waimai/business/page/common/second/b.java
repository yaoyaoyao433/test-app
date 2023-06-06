package com.sankuai.waimai.business.page.common.second;

import android.util.LongSparseArray;
import com.meituan.android.cube.pga.action.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.kingkong.future.bean.FooterStatusBean;
import com.sankuai.waimai.business.page.kingkong.future.network.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.business.page.kingkong.a b;
    public LongSparseArray<a> c;
    public e d;
    private final com.sankuai.waimai.business.page.kingkong.net.a e;
    private LongSparseArray<com.sankuai.waimai.business.page.common.model.b> f;
    private LongSparseArray<com.sankuai.waimai.platform.widget.filterbar.domain.repository.b> g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public long a;
        public long b;
        public long c;
        public String d;
        public int e;
        public int f;
        public int g;
        public List<com.sankuai.waimai.rocks.view.viewmodel.e> h;
        public FooterStatusBean i;
        public int j;
        public int k;
        public int l;
    }

    public b(com.sankuai.waimai.business.page.kingkong.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5c855b834f392b499df571714aab3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5c855b834f392b499df571714aab3f");
            return;
        }
        this.f = new LongSparseArray<>();
        this.g = new LongSparseArray<>();
        this.c = new LongSparseArray<>();
        this.b = aVar;
        this.d = aVar.u.a().b;
        this.e = this.b.t.a().b;
        aVar.z.b = new d<b>() { // from class: com.sankuai.waimai.business.page.common.second.b.1
            @Override // com.meituan.android.cube.pga.action.d
            public final /* bridge */ /* synthetic */ b a() {
                return b.this;
            }
        };
    }

    public final void a(long j, com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {new Long(j), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d94cf194b92668ba377fa598eff6129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d94cf194b92668ba377fa598eff6129");
        } else {
            this.g.put(j, bVar);
        }
    }

    public final void a(long j, com.sankuai.waimai.business.page.common.model.b bVar) {
        Object[] objArr = {new Long(j), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1447847ba0c4b3944c7e3dd1dee84fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1447847ba0c4b3944c7e3dd1dee84fff");
        } else {
            this.f.put(j, bVar);
        }
    }

    public final com.sankuai.waimai.platform.widget.filterbar.domain.repository.b a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f13cd2934765a959f2b69e4a584d67", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.widget.filterbar.domain.repository.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f13cd2934765a959f2b69e4a584d67") : this.g.get(j);
    }

    public final com.sankuai.waimai.business.page.common.model.b b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e172cc2fa2d1c87a897843e112c0429", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.page.common.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e172cc2fa2d1c87a897843e112c0429") : this.f.get(j);
    }

    public final a c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8471c651fb916c28f5e457e3f014ff10", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8471c651fb916c28f5e457e3f014ff10") : this.c.get(j);
    }
}
