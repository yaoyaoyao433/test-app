package com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.g;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Context b;
    c c;
    c d;
    private String e;

    public a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd40201ec97ec4d2076d6b425e52c11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd40201ec97ec4d2076d6b425e52c11");
            return;
        }
        this.b = context;
        this.e = str;
    }

    public final void a(final String str, final int i, final int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49f82753cd875f5f545960ab65d56a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49f82753cd875f5f545960ab65d56a0");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.b);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).historyStatus(str), new b.AbstractC1042b<BaseResponse<g>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                boolean z;
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "443d2e51670e0c57c2aa1ae1fb4d0af3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "443d2e51670e0c57c2aa1ae1fb4d0af3");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                a aVar = a.this;
                g gVar = (g) baseResponse.data;
                String str2 = str;
                int i3 = i;
                int i4 = i2;
                Object[] objArr3 = {gVar, str2, Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "386cf9fa709a021ff840b41c5d870309", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "386cf9fa709a021ff840b41c5d870309");
                } else if (gVar == null || com.sankuai.waimai.foundation.utils.b.b(gVar.a)) {
                    ae.a(aVar.b, (int) R.string.wm_order_base_request_error);
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "dc05a9618c6f65db0d94957cafd44abf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "dc05a9618c6f65db0d94957cafd44abf")).booleanValue() : ((Activity) aVar.b).isFinishing()) {
                        return;
                    }
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "085f56f84ae161fbd98e0018c8c4b464", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "085f56f84ae161fbd98e0018c8c4b464")).booleanValue();
                    } else {
                        z = Build.VERSION.SDK_INT >= 17 && ((Activity) aVar.b).isDestroyed();
                    }
                    if (z) {
                        return;
                    }
                    if (aVar.c == null || !aVar.c.a()) {
                        if (aVar.d == null || !aVar.d.a()) {
                            if (gVar.b == 1) {
                                if (aVar.d == null) {
                                    aVar.d = b.a(aVar.b, 1);
                                }
                                aVar.d.a(gVar);
                            } else {
                                if (aVar.c == null) {
                                    aVar.c = b.a(aVar.b, 0);
                                }
                                aVar.c.a(gVar);
                            }
                            JudasManualManager.b("b_waimai_8obi02bo_mv").a("c_hgowsqb").a("order_id", str2).a("order_status", i3).a("status_code", i4).a();
                        }
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a0ce05e0cd250e2df857d8aae968685", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a0ce05e0cd250e2df857d8aae968685");
                    return;
                }
                if (th instanceof IOException) {
                    ae.a(a.this.b, a.this.b.getString(R.string.wm_order_confirm_address_error_network));
                } else {
                    ae.a(a.this.b, th.getMessage());
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
            }
        }, this.e);
        JudasManualManager.a("b_QsIvX").a();
    }
}
