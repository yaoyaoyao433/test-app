package com.sankuai.waimai.bussiness.order.confirm.request.preview;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import com.dianping.titans.js.JsHandlerFactory;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends b {
    public static ChangeQuickRedirect q;

    public static /* synthetic */ void a(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "b85cb32876da19f4239c04788639fae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "b85cb32876da19f4239c04788639fae5");
        } else if (fVar.g == null) {
            try {
                JsHandlerFactory.publish(new JSONObject().put("action", "com.sankuai.meituan.globalcart.action_refresh"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public f(Activity activity, @NonNull b.C0904b c0904b, com.sankuai.waimai.platform.domain.manager.order.a aVar, com.sankuai.waimai.bussiness.order.confirm.extra.a aVar2) {
        super(activity, c0904b, aVar);
        Object[] objArr = {activity, c0904b, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64622ac7e30e25e5dd46ee3ce828f11d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64622ac7e30e25e5dd46ee3ce828f11d");
        } else {
            this.o = aVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    @Override // com.sankuai.waimai.bussiness.order.confirm.request.preview.a.InterfaceC0905a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse r26) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.request.preview.f.a(com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse):boolean");
    }

    private boolean b(final OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9415bca01efea036da23db1d95510ece", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9415bca01efea036da23db1d95510ece")).booleanValue();
        }
        if (orderResponse.e == 3 || orderResponse.e == 66) {
            JsonObject jsonObject = new JsonObject();
            try {
                Gson a = com.sankuai.waimai.mach.utils.b.a();
                jsonObject.add("missingfoods", a.toJsonTree(orderResponse.i));
                jsonObject.add("code", a.toJsonTree(Integer.valueOf(orderResponse.e)));
            } catch (Exception unused) {
            }
            if (jsonObject.has("missingfoods")) {
                com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(this.b).a("waimai_order_order_confirm_soldout_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.f.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                    public final void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog) {
                        Object[] objArr2 = {str, map, dynamicDialog};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "beccfda131b6a0f6bbd2573d4b6653ac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "beccfda131b6a0f6bbd2573d4b6653ac");
                        } else if ("alert_confirm".equals(str)) {
                            if (orderResponse.i != null) {
                                GlobalCartManager.getInstance().clearErrorFood(f.this.d, orderResponse.i, SubmitOrderManager.getInstance().getSourceType());
                            }
                            f.a(f.this);
                            dynamicDialog.dismiss();
                            if (f.this.o != null) {
                                f.this.o.c();
                            }
                        }
                    }
                }).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.f.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr2 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebbf48831fc7830bd100cf143203dcb7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebbf48831fc7830bd100cf143203dcb7");
                        } else if (f.this.o != null) {
                            f.this.o.c();
                        }
                    }
                }).a();
                this.o.a();
                return true;
            }
            return false;
        }
        return false;
    }
}
