package com.sankuai.waimai.store.goods.list.templet.newmarket.soldout;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        String a();

        void a(List<GoodsSpu> list);

        void a(boolean z);

        void b();

        void c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a implements com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e {
        public static ChangeQuickRedirect a;
        protected b b;

        public abstract GoodsPoiCategory a();

        public abstract void a(long j, long j2, int i);

        public abstract void a(GoodsSpu goodsSpu);

        public abstract void a(GoodsPoiCategory goodsPoiCategory);

        public abstract com.sankuai.waimai.store.platform.domain.manager.poi.a b();

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b7bec4b9e5ac98cf4555e2a420ff6c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b7bec4b9e5ac98cf4555e2a420ff6c");
            } else {
                this.b = bVar;
            }
        }
    }
}
