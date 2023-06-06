package com.sankuai.waimai.drug.patch.contract;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.drug.model.d;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.patch.contract.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0944b {
        void a(d dVar);

        void a(String str, int i);

        String e();

        void f();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        public InterfaceC0944b b;

        public abstract com.sankuai.waimai.store.platform.domain.manager.poi.a a();

        public abstract void a(double d, int i, GoodsSpu goodsSpu, GoodsSku goodsSku, int i2);

        public abstract void a(GoodsSpu goodsSpu, GoodsSku goodsSku, int i);

        public a(InterfaceC0944b interfaceC0944b) {
            Object[] objArr = {interfaceC0944b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468e4c9c753b0f01d74ec7ca89fec291", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468e4c9c753b0f01d74ec7ca89fec291");
            } else {
                this.b = interfaceC0944b;
            }
        }
    }
}
