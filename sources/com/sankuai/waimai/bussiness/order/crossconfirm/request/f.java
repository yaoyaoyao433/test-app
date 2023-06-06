package com.sankuai.waimai.bussiness.order.crossconfirm.request;

import android.app.Activity;
import android.app.Dialog;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements b<CrossOrderSubmitResponse> {
    public static ChangeQuickRedirect a;
    Activity b;
    public e c;
    protected Dialog d;
    public String e;

    public f(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "049d3d5974da88b39fb7a50c7a0699cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "049d3d5974da88b39fb7a50c7a0699cb");
        } else {
            this.b = activity;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x05ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse r26) {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.crossconfirm.request.f.a(com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse):void");
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfdfffedb5f6dcaee5ae51944f3bc8a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfdfffedb5f6dcaee5ae51944f3bc8a0");
            return;
        }
        this.d = com.sankuai.waimai.platform.widget.dialog.a.a(this.b);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((CrossOrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CrossOrderService.class)).crossOrderSubmit(str), new b.AbstractC1042b<CrossOrderSubmitResponse>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.f.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                CrossOrderSubmitResponse crossOrderSubmitResponse = (CrossOrderSubmitResponse) obj;
                Object[] objArr2 = {crossOrderSubmitResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd49ef0152e343ef5e3b6108d05436ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd49ef0152e343ef5e3b6108d05436ef");
                } else if (com.sankuai.waimai.foundation.utils.f.a(f.this.b)) {
                } else {
                    f.this.a();
                    if (crossOrderSubmitResponse == null) {
                        onError(new Exception());
                    } else {
                        f.this.a(crossOrderSubmitResponse);
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e02b77e2fb8a30731f5abb0095923fb5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e02b77e2fb8a30731f5abb0095923fb5");
                } else if (com.sankuai.waimai.foundation.utils.f.a(f.this.b)) {
                } else {
                    f.this.a();
                    f fVar = f.this;
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "dc5015065e050da58918d9bbe50da13a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "dc5015065e050da58918d9bbe50da13a");
                        return;
                    }
                    if (!p.f(fVar.b.getApplicationContext())) {
                        com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(fVar.b, (Throwable) null);
                    } else {
                        com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(fVar.b, (Throwable) null);
                    }
                    if (fVar.c != null) {
                        fVar.c.a();
                    }
                }
            }
        }, this.e);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a209929d5026fd0296789e8729da53aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a209929d5026fd0296789e8729da53aa")).booleanValue();
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.d);
        this.d = null;
        return true;
    }

    private boolean b(CrossOrderSubmitResponse crossOrderSubmitResponse) {
        Object[] objArr = {crossOrderSubmitResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d2f5e543a2a587074029ae968f0ec2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d2f5e543a2a587074029ae968f0ec2")).booleanValue();
        }
        if (crossOrderSubmitResponse.a != 71) {
            return false;
        }
        try {
            if (crossOrderSubmitResponse.q != null) {
                com.sankuai.waimai.business.order.submit.b.b(this.b, crossOrderSubmitResponse.q, crossOrderSubmitResponse.o, crossOrderSubmitResponse.p, crossOrderSubmitResponse.h);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private void c(final CrossOrderSubmitResponse crossOrderSubmitResponse) {
        Object[] objArr = {crossOrderSubmitResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a89473d106cbba4c9258e1de6e5906b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a89473d106cbba4c9258e1de6e5906b");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        try {
            Gson a2 = com.sankuai.waimai.mach.utils.b.a();
            jsonObject.add("missingfoods", a2.toJsonTree(crossOrderSubmitResponse.f));
            jsonObject.add("code", a2.toJsonTree(Integer.valueOf(crossOrderSubmitResponse.a)));
        } catch (Exception unused) {
        }
        if (jsonObject.has("missingfoods")) {
            com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(this.b).a("waimai_order_order_confirm_soldout_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.f.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                public final void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog) {
                    Object[] objArr2 = {str, map, dynamicDialog};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7239e800e4e2eebe7a9e5e52f26bc4ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7239e800e4e2eebe7a9e5e52f26bc4ed");
                    } else if ("alert_confirm".equals(str)) {
                        if (crossOrderSubmitResponse.f != null && !com.sankuai.waimai.foundation.utils.d.a(crossOrderSubmitResponse.f)) {
                            GlobalCartManager.getInstance().clearErrorFood(crossOrderSubmitResponse.h, crossOrderSubmitResponse.f, SubmitOrderManager.getInstance().getSourceType());
                            f.this.b.finish();
                        }
                        dynamicDialog.dismiss();
                    }
                }
            }).a();
        }
    }
}
