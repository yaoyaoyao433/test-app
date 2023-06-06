package com.sankuai.waimai.bussiness.order.crossconfirm.request;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import com.dianping.titans.js.JsHandlerFactory;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements b<CrossOrderResponse> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.platform.domain.manager.order.a b;
    Context c;
    public int d;
    public a.EnumC0947a e;
    protected Dialog f;
    public String g;
    com.sankuai.waimai.bussiness.order.confirm.extra.b h;

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "3f04ca6f66069d438f581a40af6dfe45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "3f04ca6f66069d438f581a40af6dfe45");
        } else if (cVar.b == null) {
            try {
                JsHandlerFactory.publish(new JSONObject().put("action", "com.sankuai.meituan.globalcart.action_refresh"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961810cc249a35abca31ef91ce3830f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961810cc249a35abca31ef91ce3830f9");
            return;
        }
        this.c = context;
        this.h = new com.sankuai.waimai.bussiness.order.confirm.extra.b();
        if (context instanceof TransferActivity) {
            this.h.a((Activity) context);
        }
    }

    boolean a(final CrossOrderResponse crossOrderResponse) {
        Object[] objArr = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53275cdd8cc4c990d4776eed6a0460c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53275cdd8cc4c990d4776eed6a0460c")).booleanValue();
        }
        if (crossOrderResponse.a == 3 || crossOrderResponse.a == 66) {
            JsonObject jsonObject = new JsonObject();
            try {
                Gson a2 = com.sankuai.waimai.mach.utils.b.a();
                jsonObject.add("missingfoods", a2.toJsonTree(crossOrderResponse.d));
                jsonObject.add("code", a2.toJsonTree(Integer.valueOf(crossOrderResponse.a)));
            } catch (Exception unused) {
            }
            if (jsonObject.has("missingfoods")) {
                com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a((Activity) this.c).a("waimai_order_order_confirm_soldout_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                    public final void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog) {
                        Object[] objArr2 = {str, map, dynamicDialog};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d00d1f33048e70cf3a475e4df3b9a31", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d00d1f33048e70cf3a475e4df3b9a31");
                        } else if ("alert_confirm".equals(str)) {
                            if (crossOrderResponse.d != null && !com.sankuai.waimai.foundation.utils.d.a(crossOrderResponse.d)) {
                                GlobalCartManager.getInstance().clearErrorFood(crossOrderResponse.f, crossOrderResponse.d, SubmitOrderManager.getInstance().getSourceType());
                            }
                            c.a(c.this);
                            dynamicDialog.dismiss();
                            if (c.this.h != null) {
                                c.this.h.c();
                            }
                        }
                    }
                }).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr2 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b21205daf7a6b4d295b2c52318498b83", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b21205daf7a6b4d295b2c52318498b83");
                        } else if (c.this.h != null) {
                            c.this.h.c();
                        }
                    }
                }).a();
                this.h.a();
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean b(CrossOrderResponse crossOrderResponse) {
        Object[] objArr = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f14497b8458a7f9d11707ef66f7ab3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f14497b8458a7f9d11707ef66f7ab3")).booleanValue();
        }
        if (crossOrderResponse == null) {
            ae.a(this.c, (int) R.string.wm_order_refresh_success_error);
            return true;
        }
        try {
            new com.sankuai.waimai.platform.capacity.network.errorhanding.d().a(crossOrderResponse.a, crossOrderResponse.b);
            return false;
        } catch (com.sankuai.waimai.platform.capacity.network.errorhanding.e e) {
            com.sankuai.waimai.platform.capacity.network.errorhanding.f.a((Exception) e, (Activity) this.c);
            return true;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93534f9361cdf98df85462bc7b177052", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93534f9361cdf98df85462bc7b177052");
            return;
        }
        this.f = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((CrossOrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CrossOrderService.class)).crossOrderPreview(str), new b.AbstractC1042b<CrossOrderResponse>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.c.8
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:135:0x03da  */
            @Override // rx.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void onNext(java.lang.Object r21) {
                /*
                    Method dump skipped, instructions count: 1042
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.crossconfirm.request.c.AnonymousClass8.onNext(java.lang.Object):void");
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4ab32e6532b2ba72e4b71310725921f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4ab32e6532b2ba72e4b71310725921f");
                } else if (com.sankuai.waimai.foundation.utils.f.a(c.this.c)) {
                } else {
                    c.this.a();
                    c cVar = c.this;
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b9b2fc41cc336a200f6c29b6c626387b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b9b2fc41cc336a200f6c29b6c626387b");
                        return;
                    }
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(cVar.c, (Throwable) null);
                    cVar.h.c();
                }
            }
        }, this.g);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5940939ad7a0a90431da0885b1544ff6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5940939ad7a0a90431da0885b1544ff6")).booleanValue();
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.f);
        this.f = null;
        return true;
    }
}
