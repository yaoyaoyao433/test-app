package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter;

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
public abstract class c implements com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.b {
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

    public abstract void c(GoodsPoiCategory goodsPoiCategory);

    public abstract void d(@NonNull g gVar);

    public boolean d(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        return false;
    }

    public boolean e(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        return false;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3883825e088155c0b608493e09ae62b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3883825e088155c0b608493e09ae62b5");
        } else {
            this.b = new ArrayDeque();
        }
    }

    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b77eecabf3ff5703f1d30587deb68b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b77eecabf3ff5703f1d30587deb68b2");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66c0ef14c949d1abb58ff1534813231", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66c0ef14c949d1abb58ff1534813231")).booleanValue() : gVar != this.b.peek();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "897d074efbb331748cc93b21d84490e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "897d074efbb331748cc93b21d84490e0");
            return;
        }
        this.b.poll();
        b();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dccc5542cf909f17af1b4e79231ddf32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dccc5542cf909f17af1b4e79231ddf32");
            return;
        }
        g peek = this.b.peek();
        if (peek != null) {
            e(peek);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.b
    public final void a(@NonNull g gVar, com.sankuai.waimai.store.repository.net.b bVar) {
        boolean z = false;
        Object[] objArr = {gVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c503a806b6a75f29bca8bb99951b8ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c503a806b6a75f29bca8bb99951b8ea");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "986a8272a596c22e4db791b1d9e5a0a6", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "986a8272a596c22e4db791b1d9e5a0a6")).booleanValue();
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

    public static boolean d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8ec962a6e556cc1d298b66c1e56d1f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8ec962a6e556cc1d298b66c1e56d1f9")).booleanValue() : goodsPoiCategory != null && goodsPoiCategory.aggregationActivityTags && com.sankuai.shangou.stone.util.a.b(goodsPoiCategory.childGoodPoiCategory);
    }

    private void e(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626086d0323788e8c25bbe5a61762e8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626086d0323788e8c25bbe5a61762e8d");
        } else if (gVar.p) {
            d(gVar);
        } else {
            c(gVar);
        }
    }
}
