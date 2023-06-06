package com.sankuai.waimai.bussiness.order.detailnew.pgablock.root;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.i;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public i b;
    public com.sankuai.waimai.bussiness.order.detailnew.network.response.a c;
    public String d;
    public String e;
    public long f;
    public String g;
    public com.sankuai.waimai.business.order.api.detail.model.a h;
    public int i;
    public com.sankuai.waimai.bussiness.order.detailnew.a j;

    public c() {
    }

    public c(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1186e4e802538144236ffe2c45da604d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1186e4e802538144236ffe2c45da604d");
        } else {
            this.j = aVar;
        }
    }

    public static c a(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cabb59afa48d1e7a8cd1ba172b306d5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cabb59afa48d1e7a8cd1ba172b306d5b");
        }
        c cVar = new c();
        Map<String, Object> a2 = orderRocksServerModel.a("wm_order_status_no_rider_receive_order");
        b bVar = orderRocksServerModel.c;
        Object obj = a2.get("no_rider_confirm_info");
        if (obj != null) {
            cVar.b = (i) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(obj), (Class<Object>) i.class);
        }
        cVar.d = String.valueOf(orderRocksServerModel.g.get("recipient_phone"));
        cVar.e = bVar.b;
        cVar.f = bVar.c;
        cVar.g = bVar.d;
        cVar.i = bVar.r;
        cVar.h = bVar.l;
        cVar.c = bVar.n;
        return cVar;
    }
}
