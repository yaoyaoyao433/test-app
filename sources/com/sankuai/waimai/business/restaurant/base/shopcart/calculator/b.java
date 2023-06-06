package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.c;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.f;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b implements Serializable {
    public static ChangeQuickRedirect a;
    private static b b;
    private f.a c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "264de4b990244073062130383450b5b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "264de4b990244073062130383450b5b3");
        } else {
            this.c = new f.a() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.calculator.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.calculator.f.a
                public final void a(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, List<c.a> list, com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
                    Object[] objArr2 = {gVar, bVar, list, eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8547ea9dfc09a9e40737330414a62a88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8547ea9dfc09a9e40737330414a62a88");
                        return;
                    }
                    h.a().d = true;
                    b.this.a(gVar, bVar, list, eVar);
                }
            };
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec1207a42ccfe77f6ca59d36d80f1698", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec1207a42ccfe77f6ca59d36d80f1698");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(@Nullable com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, @NonNull com.sankuai.waimai.business.restaurant.base.manager.order.c cVar, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {gVar, cVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "602d59433fa4d3d3ce4da0b15727a552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "602d59433fa4d3d3ce4da0b15727a552");
            return;
        }
        boolean b2 = h.a().b();
        com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = cVar.a;
        List<c.a> list = cVar.b;
        if (b2) {
            a(gVar, bVar, list, eVar, this.c);
        } else {
            a(gVar, bVar, list, eVar);
        }
    }

    public final void a(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, List<c.a> list, com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {gVar, bVar, list, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "457887da732ef33d1d6f24eb4191ec29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "457887da732ef33d1d6f24eb4191ec29");
        } else {
            new e().a(gVar, bVar, list, eVar);
        }
    }

    private void a(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, List<c.a> list, com.sankuai.waimai.business.restaurant.base.shopcart.e eVar, f.a aVar) {
        Object[] objArr = {gVar, bVar, list, eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3329601b08f2528c0d8641f7e6aacc40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3329601b08f2528c0d8641f7e6aacc40");
        } else {
            new f(aVar).a(gVar, bVar, list, eVar);
        }
    }
}
