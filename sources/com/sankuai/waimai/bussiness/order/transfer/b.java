package com.sankuai.waimai.bussiness.order.transfer;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.transfer.base.f;
import com.sankuai.waimai.bussiness.order.transfer.single.c;
import com.sankuai.waimai.bussiness.order.transfer.single.d;
import com.sankuai.waimai.bussiness.order.transfer.single.e;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        c aVar;
        boolean z = false;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "157ea6fcd5f4799878fb0265d5621c14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "157ea6fcd5f4799878fb0265d5621c14");
            return;
        }
        Activity activity = (Activity) jVar.c;
        Uri uri = jVar.d;
        f fVar = new f(gVar, jVar);
        Object[] objArr2 = {activity, uri, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "57aedef75e2e14d848a4ba6385933f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "57aedef75e2e14d848a4ba6385933f14");
        } else if (!Boolean.parseBoolean(uri.getQueryParameter("is_cross"))) {
            e eVar = new e();
            String queryParameter = uri.getQueryParameter("data");
            Object[] objArr3 = {queryParameter};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            d dVar = PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "205186748d475250eb4d8c6b805effda", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "205186748d475250eb4d8c6b805effda") : (d) new Gson().fromJson(queryParameter, (Class<Object>) d.class);
            com.sankuai.waimai.bussiness.order.transfer.base.h a2 = com.sankuai.waimai.bussiness.order.transfer.base.h.a();
            String str = dVar.g;
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.order.api.submit.constants.a.a;
            if (!(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "4ebc720bcf4453f6cdde8292edbfbae7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "4ebc720bcf4453f6cdde8292edbfbae7")).booleanValue() : "from_shopcart".equals(str))) {
                if (a.a(dVar)) {
                    a2.b = new com.sankuai.waimai.bussiness.order.transfer.single.a();
                    a2.c = new com.sankuai.waimai.bussiness.order.transfer.single.sg.b();
                } else {
                    Object[] objArr5 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1223fb6953dfe8e64ccc4f41e036fc03", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1223fb6953dfe8e64ccc4f41e036fc03")).booleanValue();
                    } else if (14 == dVar.e && dVar.h == 1) {
                        z = true;
                    }
                    if (!z) {
                        if (com.sankuai.waimai.business.order.api.submit.constants.a.e(dVar.g) || com.sankuai.waimai.business.order.api.submit.constants.a.d(dVar.g)) {
                            aVar = new com.sankuai.waimai.bussiness.order.transfer.single.multi.a();
                        } else {
                            aVar = new c();
                        }
                        a2.b = new com.sankuai.waimai.bussiness.order.transfer.single.a();
                        a2.c = aVar;
                    } else {
                        a2.b = new com.sankuai.waimai.bussiness.order.transfer.single.a();
                        a2.c = new com.sankuai.waimai.bussiness.order.transfer.single.sg.c();
                    }
                }
            } else {
                a2.b = new com.sankuai.waimai.bussiness.order.transfer.single.cart.a();
                a2.c = new com.sankuai.waimai.bussiness.order.transfer.single.cart.b();
            }
            if (a.a(dVar)) {
                a2.d = new com.sankuai.waimai.bussiness.order.transfer.single.sg.a(activity);
            } else {
                a2.d = new com.sankuai.waimai.bussiness.order.transfer.single.b(activity);
            }
            a2.e = fVar;
            a2.a(dVar);
        } else {
            com.sankuai.waimai.bussiness.order.transfer.base.h a3 = com.sankuai.waimai.bussiness.order.transfer.base.h.a();
            a3.c = new com.sankuai.waimai.bussiness.order.transfer.cross.b();
            a3.b = new com.sankuai.waimai.bussiness.order.transfer.cross.a();
            a3.e = fVar;
            a3.d = new com.sankuai.waimai.bussiness.order.transfer.cross.c(activity);
            a3.a(uri.getQueryParameter("data"));
        }
    }
}
