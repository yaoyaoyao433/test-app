package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public k b;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a c;
    Map<String, Object> d;

    public b(com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ea276334c04d55a83ecc37bbe3c0280", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ea276334c04d55a83ecc37bbe3c0280");
            return;
        }
        this.d = new HashMap();
        this.c = aVar;
        this.b = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(com.sankuai.waimai.bussiness.order.detailnew.event.a.class).c(new rx.functions.b<com.sankuai.waimai.bussiness.order.detailnew.event.a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.b.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(com.sankuai.waimai.bussiness.order.detailnew.event.a aVar2) {
                com.sankuai.waimai.bussiness.order.detailnew.event.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d5d839e1f4b49dad03a27340623dfc8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d5d839e1f4b49dad03a27340623dfc8");
                } else if (aVar3.e == com.sankuai.waimai.bussiness.order.detailnew.event.a.b) {
                    b.this.d.put("content", Long.valueOf(aVar3.c));
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a("trigger_timer_response_event", b.this.d);
                }
            }
        });
    }
}
