package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface i {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        String A();

        void B();

        void C();

        void D();

        void E();

        void F();

        void a(int i, int i2);

        void a(com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.f fVar);

        void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list);

        void a(Boolean bool);

        void a(String str);

        void a(List<GoodsPoiCategory> list);

        void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

        void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

        void ba_();

        void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

        int d();

        void g(boolean z);

        void h();

        void h(boolean z);

        void i();

        void j();

        long k();

        boolean l();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        public b b;

        public abstract int a(GoodsPoiCategory goodsPoiCategory);

        public abstract int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu);

        public abstract GoodsPoiCategory a();

        public abstract void a(int i, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i2, List<Long> list);

        public abstract void a(long j);

        public abstract void a(long j, long j2, int i);

        public abstract void a(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory);

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

        public abstract boolean c(GoodsPoiCategory goodsPoiCategory);

        public abstract boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu);

        public abstract void d();

        public abstract boolean d(GoodsPoiCategory goodsPoiCategory);

        public abstract int e();

        public abstract int f();

        public abstract boolean g();

        public abstract GoodsPoiCategory h();

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6defecb5dc3309cfaf39685e9b14dc11", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6defecb5dc3309cfaf39685e9b14dc11");
            } else {
                this.b = bVar;
            }
        }
    }
}
