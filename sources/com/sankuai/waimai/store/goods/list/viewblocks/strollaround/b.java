package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1199b {
        RestMenuResponse a();

        void a(int i);

        void a(int i, String str);

        void a(List<PoiCommonMachListItem> list);

        long b();

        void b(List<PoiCommonMachListItem> list);

        SCBaseActivity c();

        com.sankuai.waimai.store.platform.domain.manager.poi.a d();

        void f();

        void g();

        void h();

        void i();

        com.sankuai.waimai.store.goods.list.viewblocks.strollaround.a j();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected InterfaceC1199b b;

        public abstract void a();

        public abstract void a(a.C1218a c1218a);

        public abstract void a(List<PoiCommonMachListItem> list);

        public abstract void b();

        public abstract void b(List<Poi.PoiCouponItem> list);

        public abstract void c();

        public abstract d d();

        public abstract Map<String, Object> e();

        public abstract void f();

        public abstract void g();

        public a(InterfaceC1199b interfaceC1199b) {
            Object[] objArr = {interfaceC1199b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab73054a0afdc9f8316b834f88e62ad8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab73054a0afdc9f8316b834f88e62ad8");
            } else {
                this.b = interfaceC1199b;
            }
        }
    }
}
