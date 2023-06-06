package com.sankuai.waimai.bussiness.order.transfer.cross;

import android.app.Activity;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.request.d;
import com.sankuai.waimai.bussiness.order.transfer.base.d;
import com.sankuai.waimai.bussiness.order.transfer.cross.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements d<String, d.a, a.C0927a> {
    public static ChangeQuickRedirect a;
    public Activity b;

    @Override // com.sankuai.waimai.bussiness.order.transfer.base.d
    public final /* synthetic */ void a(String str, d.a aVar, a.C0927a c0927a, com.sankuai.waimai.bussiness.order.transfer.base.c cVar) {
        com.sankuai.waimai.bussiness.order.crossconfirm.request.a aVar2;
        String str2 = str;
        d.a aVar3 = aVar;
        a.C0927a c0927a2 = c0927a;
        Object[] objArr = {str2, aVar3, c0927a2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c03c88d44e248e11204e2742322e2a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c03c88d44e248e11204e2742322e2a04");
            return;
        }
        if (com.sankuai.waimai.business.order.api.submit.constants.a.c(((JsonObject) new Gson().fromJson(str2, (Class<Object>) JsonObject.class)).get("page_from").getAsString())) {
            com.sankuai.waimai.bussiness.order.crossconfirm.request.a aVar4 = new com.sankuai.waimai.bussiness.order.crossconfirm.request.a(this.b);
            aVar4.j = c0927a2.c;
            aVar2 = aVar4;
            if (c0927a2 != null) {
                com.sankuai.waimai.bussiness.order.crossconfirm.request.a aVar5 = aVar4;
                aVar5.g = com.sankuai.waimai.bussiness.order.transfer.single.d.a(c0927a2.b);
                aVar5.f = c0927a2.a;
                aVar5.d = cVar;
                aVar5.j = c0927a2.c;
                aVar2 = aVar4;
            }
        } else {
            com.sankuai.waimai.bussiness.order.crossconfirm.request.c cVar2 = new com.sankuai.waimai.bussiness.order.crossconfirm.request.c(this.b);
            cVar2.g = c0927a2.c;
            aVar2 = cVar2;
            if (c0927a2 != null) {
                com.sankuai.waimai.bussiness.order.crossconfirm.request.c cVar3 = cVar2;
                cVar3.e = com.sankuai.waimai.bussiness.order.transfer.single.d.a(c0927a2.b);
                cVar3.d = c0927a2.a;
                cVar3.g = "pre-order";
                aVar2 = cVar2;
            }
        }
        aVar3.a(aVar2).a().a();
    }

    public c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2578d5b0998c64cc9219c8e29ea22a91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2578d5b0998c64cc9219c8e29ea22a91");
        } else {
            this.b = activity;
        }
    }
}
