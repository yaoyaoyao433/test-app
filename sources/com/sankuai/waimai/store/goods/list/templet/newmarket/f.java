package com.sankuai.waimai.store.goods.list.templet.newmarket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        String H();

        void J();

        void K();

        void L();

        void M();

        void N();

        boolean O();

        void P();

        void a(int i, int i2);

        void a(com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.f fVar);

        void a(RecommendPair recommendPair, long j);

        void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list);

        void a(Boolean bool);

        void a(String str);

        void a(List<GoodsPoiCategory> list);

        void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

        void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

        void ba_();

        void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

        void f(boolean z);

        void g(boolean z);

        boolean h();

        int i();

        void l();

        void m();

        long n();

        boolean o();

        boolean p();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        public b b;
        protected int c;

        public abstract int a(GoodsPoiCategory goodsPoiCategory);

        public abstract int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu);

        public abstract GoodsPoiCategory a();

        public abstract void a(int i, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i2, List<Long> list);

        public abstract void a(long j);

        public abstract void a(long j, long j2, int i);

        public abstract void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsPoiCategory goodsPoiCategory, String str);

        public abstract void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2);

        public abstract void a(IMarketResponse iMarketResponse);

        public abstract void a(String str);

        public abstract void a(String str, long j);

        public abstract boolean a(GoodsSpu goodsSpu);

        public abstract GoodsPoiCategory b();

        public abstract void b(GoodsPoiCategory goodsPoiCategory);

        public abstract void b(String str);

        public abstract boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu);

        public abstract boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2);

        public abstract long c();

        public abstract GoodsPoiCategory c(GoodsPoiCategory goodsPoiCategory);

        public abstract boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu);

        public abstract GoodsPoiCategory d(GoodsPoiCategory goodsPoiCategory);

        public abstract void d();

        public abstract int e();

        public abstract boolean e(GoodsPoiCategory goodsPoiCategory);

        public abstract GoodsPoiCategory f();

        public abstract boolean f(GoodsPoiCategory goodsPoiCategory);

        public abstract GoodsPoiCategory g();

        public abstract int h();

        public abstract boolean i();

        public abstract GoodsPoiCategory j();

        public a(b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d18c8d6991b2d2268af3494bc6c574c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d18c8d6991b2d2268af3494bc6c574c");
                return;
            }
            this.b = bVar;
            this.c = i;
        }
    }
}
