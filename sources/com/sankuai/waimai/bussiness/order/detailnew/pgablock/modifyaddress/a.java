package com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.e;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    public static ChangeQuickRedirect a;
    public String b;
    public com.sankuai.waimai.bussiness.order.detailnew.network.response.a c;
    public String d;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b e;
    public e f;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83cc26a310d334a753713a592f4fc54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83cc26a310d334a753713a592f4fc54");
        } else {
            this.e = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b();
        }
    }

    public static a a(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a7137e6fb8e13eabc9b906ea1542622", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a7137e6fb8e13eabc9b906ea1542622");
        }
        a aVar = new a();
        if (orderRocksServerModel == null) {
            return aVar;
        }
        aVar.c = orderRocksServerModel.c.n;
        aVar.d = String.valueOf(orderRocksServerModel.g.get("recipient_phone"));
        aVar.e = orderRocksServerModel.c;
        aVar.f = e.a(orderRocksServerModel);
        return aVar;
    }
}
