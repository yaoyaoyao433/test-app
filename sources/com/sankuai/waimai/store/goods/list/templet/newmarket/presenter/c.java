package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c implements com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.b {
    public static ChangeQuickRedirect a;
    private final Queue<g> b;

    public List<Long> a(GoodsPoiCategory goodsPoiCategory) {
        return null;
    }

    public List<Long> a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        return null;
    }

    public List<GoodsSpu> a(GoodsPoiCategory goodsPoiCategory, List<Long> list) {
        return null;
    }

    public void a(long j, long j2, int i) {
    }

    public boolean a(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory, int i) {
        return false;
    }

    public List<Long> b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        return null;
    }

    public boolean b(GoodsPoiCategory goodsPoiCategory) {
        return true;
    }

    public int c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        return -1;
    }

    public abstract void c(@NonNull g gVar);

    public boolean c(GoodsPoiCategory goodsPoiCategory) {
        return true;
    }

    public abstract void d(@NonNull g gVar);

    public abstract void d(GoodsPoiCategory goodsPoiCategory);

    public boolean d(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        return false;
    }

    public boolean e(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        return false;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3def1d7dee8f19b701ee616ebefc27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3def1d7dee8f19b701ee616ebefc27");
        } else {
            this.b = new ArrayDeque();
        }
    }

    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53de03bad721caf6a4f3cd63ed9c992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53de03bad721caf6a4f3cd63ed9c992");
        } else if (this.b.contains(gVar) || gVar.a() == null) {
        } else {
            gVar.n.a(gVar);
            if (gVar.b && !this.b.isEmpty()) {
                this.b.clear();
                this.b.offer(gVar);
                return;
            }
            this.b.offer(gVar);
            if (this.b.size() == 1) {
                b();
            }
        }
    }

    public final boolean b(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37315d312b813876e7f1255b05d21940", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37315d312b813876e7f1255b05d21940")).booleanValue() : gVar != this.b.peek();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62db8c896d6bc5d24f96fdaf835aab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62db8c896d6bc5d24f96fdaf835aab0");
            return;
        }
        this.b.poll();
        b();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6616181104f5d7c1135f2cd7940a63d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6616181104f5d7c1135f2cd7940a63d5");
            return;
        }
        g peek = this.b.peek();
        if (peek != null) {
            e(peek);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.b
    public final void a(@NonNull g gVar, com.sankuai.waimai.store.repository.net.b bVar) {
        boolean z = false;
        Object[] objArr = {gVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "436a55f7160dd730502068fbf2b2a794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "436a55f7160dd730502068fbf2b2a794");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f6a40071fc5d2ec65968bf020244251", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f6a40071fc5d2ec65968bf020244251")).booleanValue();
        } else if (this.b.size() <= 1) {
            z = true;
        }
        if (z) {
            gVar.n.d(gVar);
            gVar.n.e(gVar);
        }
        if (b(gVar)) {
            b();
        } else {
            a();
        }
    }

    public static boolean e(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea17f8a749a00e7027de2598c08e43d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea17f8a749a00e7027de2598c08e43d1")).booleanValue() : goodsPoiCategory != null && goodsPoiCategory.aggregationActivityTags && com.sankuai.shangou.stone.util.a.b(goodsPoiCategory.childGoodPoiCategory);
    }

    private void e(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e80861cf608695afed2b557d0fa686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e80861cf608695afed2b557d0fa686");
        } else if (gVar.p) {
            d(gVar);
        } else {
            c(gVar);
        }
    }
}
