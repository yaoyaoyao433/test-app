package com.sankuai.waimai.bussiness.order.confirm.request.preview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.GetVerifyCodeResponse;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.confirm.submit.g;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends b {
    public static ChangeQuickRedirect q;

    public static /* synthetic */ void a(e eVar, Context context, long j, String str, String str2, String str3) {
        Object[] objArr = {context, new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "b4d471fa81a34de366e85e88fa09e83b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "b4d471fa81a34de366e85e88fa09e83b");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        bundle.putString("poiName", str2);
        if (com.sankuai.waimai.business.order.api.submit.constants.a.b(eVar.h)) {
            com.sankuai.waimai.foundation.router.a.a(context, com.sankuai.waimai.business.order.api.store.f.a(eVar.h), bundle);
        } else {
            com.sankuai.waimai.business.order.submit.b.a(context, bundle, eVar.k);
        }
    }

    public e(Activity activity, @NonNull b.C0904b c0904b, com.sankuai.waimai.platform.domain.manager.order.a aVar) {
        super(activity, c0904b, aVar);
        Object[] objArr = {activity, c0904b, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa09f1b13ee6a2d9933ee95c8c141d3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa09f1b13ee6a2d9933ee95c8c141d3d");
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.preview.a.InterfaceC0905a
    public final boolean a(OrderResponse orderResponse) {
        boolean z;
        boolean z2;
        String string;
        boolean z3;
        boolean z4;
        String string2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        DialogInterface.OnClickListener onClickListener;
        boolean z9;
        String string3;
        boolean z10;
        String string4;
        boolean z11;
        String string5;
        boolean z12;
        boolean z13;
        boolean z14;
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d72f33118adff3df8e0fb03492635639", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d72f33118adff3df8e0fb03492635639")).booleanValue();
        }
        Object[] objArr2 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect2 = q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "093fbe736b55d8e6d513f9b3fde558c6", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "093fbe736b55d8e6d513f9b3fde558c6")).booleanValue();
        } else if (orderResponse.e != 0) {
            z = false;
        } else {
            if (com.sankuai.waimai.business.order.api.submit.constants.a.b(this.h)) {
                com.sankuai.waimai.business.order.submit.b.a(this.b, orderResponse, this.h, this.c, this.d, this.e);
            } else {
                com.sankuai.waimai.business.order.submit.b.a(this.b, orderResponse, "from_restaurant", this.c, this.d, this.e);
            }
            com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.NONE;
            z = true;
        }
        if (z) {
            return true;
        }
        Object[] objArr3 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect3 = q;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7f929c996c78bc8f2a06f01f4492e31", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7f929c996c78bc8f2a06f01f4492e31")).booleanValue();
        } else if (orderResponse.e != 1) {
            z2 = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                ae.a(this.b, orderResponse.f);
            } else {
                ae.a(this.b, (int) R.string.wm_order_base_server_error);
            }
            z2 = true;
        }
        if (z2 || b(orderResponse)) {
            return true;
        }
        Object[] objArr4 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect4 = q;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0fa5e2e9d98d8b205a741ec1a02f1db6", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0fa5e2e9d98d8b205a741ec1a02f1db6")).booleanValue();
        } else if (orderResponse.e != 4) {
            z3 = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                string = orderResponse.f;
            } else {
                string = this.b.getString(R.string.wm_order_base_poi_not_open);
            }
            new CustomDialog.a(this.b).c(R.string.wm_order_base_remind).b(string).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.e.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cc597e1364ae6d9b149c4b00ecbd91c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cc597e1364ae6d9b149c4b00ecbd91c6");
                    } else {
                        LocalBroadcastManager.getInstance(e.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
                    }
                }
            }).b();
            z3 = true;
        }
        if (z3) {
            return true;
        }
        Object[] objArr5 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect5 = q;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bda8d2b9f2b20d15be61310b58d07098", RobustBitConfig.DEFAULT_VALUE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bda8d2b9f2b20d15be61310b58d07098")).booleanValue();
        } else if (orderResponse.e != 7) {
            z4 = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                ae.a(this.b, orderResponse.f);
            } else {
                ae.a(this.b, (int) R.string.wm_order_base_arrival_time_is_null);
            }
            z4 = true;
        }
        if (z4) {
            return true;
        }
        Object[] objArr6 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect6 = q;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "847f9793123af5e130531d37c047cf0b", RobustBitConfig.DEFAULT_VALUE)) {
            z5 = ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "847f9793123af5e130531d37c047cf0b")).booleanValue();
        } else if (orderResponse.e != 8) {
            z5 = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                string2 = orderResponse.f;
            } else {
                string2 = this.b.getString(R.string.wm_order_base_order_not_reach_min_price);
            }
            new CustomDialog.a(this.b).c(R.string.wm_order_base_remind).b(string2).a(R.string.wm_order_submit_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.e.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr7 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "60403e2ca8f435f81048e24b2362d14b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "60403e2ca8f435f81048e24b2362d14b");
                    } else {
                        e.a(e.this, e.this.b, e.this.c, e.this.d, e.this.i, "");
                    }
                }
            }).b(R.string.wm_order_base_that_is_ok, (DialogInterface.OnClickListener) null).b();
            z5 = true;
        }
        if (z5) {
            return true;
        }
        Object[] objArr7 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect7 = q;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e4791217889d969bff164d613aee665c", RobustBitConfig.DEFAULT_VALUE)) {
            z6 = ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e4791217889d969bff164d613aee665c")).booleanValue();
        } else if (orderResponse.e != 10) {
            z6 = false;
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.LOGOUT);
            SubmitOrderManager.getInstance().showLogin(this.b, this.c, this.d, this.j);
            z6 = true;
        }
        if (z6) {
            return true;
        }
        Object[] objArr8 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect8 = q;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "a4321d7d450746f9e0b84d51be73c3f5", RobustBitConfig.DEFAULT_VALUE)) {
            z7 = ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "a4321d7d450746f9e0b84d51be73c3f5")).booleanValue();
        } else if (orderResponse.e != 5) {
            z7 = false;
        } else {
            if (orderResponse != null) {
                GetVerifyCodeResponse getVerifyCodeResponse = orderResponse.j;
                if (getVerifyCodeResponse != null && !TextUtils.isEmpty(getVerifyCodeResponse.requestCode)) {
                    com.sankuai.waimai.business.order.submit.b.a(this.b, getVerifyCodeResponse, this.c, this.d, this.f, 0);
                } else {
                    ae.a(this.b, (int) R.string.wm_order_base_upload_failed_retry);
                }
            } else {
                ae.a(this.b, (int) R.string.wm_order_base_upload_failed_retry);
            }
            z7 = true;
        }
        if (z7) {
            return true;
        }
        Object[] objArr9 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect9 = q;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "0a12216721c258e586f0a66bacccba8c", RobustBitConfig.DEFAULT_VALUE)) {
            z8 = ((Boolean) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "0a12216721c258e586f0a66bacccba8c")).booleanValue();
        } else if (orderResponse.e != 14) {
            z8 = false;
        } else {
            SubmitOrderManager.getInstance().showBindPhone(this.b, this.c, this.d, this.j);
            z8 = true;
        }
        if (z8) {
            return true;
        }
        Object[] objArr10 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect10 = q;
        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "0cb7f9c5036df17f92feb89ab2ecc6b2", RobustBitConfig.DEFAULT_VALUE)) {
            z9 = ((Boolean) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "0cb7f9c5036df17f92feb89ab2ecc6b2")).booleanValue();
        } else if (orderResponse.e != 19) {
            z9 = false;
        } else {
            if (!"from_restaurant".equals(this.h) || orderResponse == null || orderResponse.l == null) {
                onClickListener = null;
            } else {
                final String str = orderResponse.l;
                onClickListener = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.e.4
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr11 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect11 = a;
                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "f9a0b4faa40266fdf808772d5e502c57", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "f9a0b4faa40266fdf808772d5e502c57");
                        } else {
                            com.sankuai.waimai.platform.domain.manager.poi.a.a().a(e.this.d, str);
                        }
                    }
                };
            }
            new CustomDialog.a(this.b).c(R.string.wm_order_base_remind).b(!TextUtils.isEmpty(orderResponse.f) ? orderResponse.f : this.b.getString(R.string.wm_loading_fail_try_afterwhile)).a(R.string.wm_dialog_common_ok, onClickListener).b();
            z9 = true;
        }
        if (z9) {
            return true;
        }
        Object[] objArr11 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect11 = q;
        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "7bcf7d66109f89f7b65f37288af88ebf", RobustBitConfig.DEFAULT_VALUE)) {
            z10 = ((Boolean) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "7bcf7d66109f89f7b65f37288af88ebf")).booleanValue();
        } else if (orderResponse.e != 36) {
            z10 = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                string3 = orderResponse.f;
            } else {
                string3 = this.b.getString(R.string.wm_order_base_new_customer_sale);
            }
            new CustomDialog.a(this.b).c(R.string.wm_order_base_remind).b(string3).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.e.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr12 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect12 = a;
                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "31507b0126b57807677eb17ca0e6c2e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "31507b0126b57807677eb17ca0e6c2e5");
                    } else {
                        LocalBroadcastManager.getInstance(e.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
                    }
                }
            }).b();
            z10 = true;
        }
        if (z10) {
            return true;
        }
        Object[] objArr12 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect12 = q;
        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "4951f64bd498d82d69814ae3e5a182b7", RobustBitConfig.DEFAULT_VALUE)) {
            z11 = ((Boolean) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "4951f64bd498d82d69814ae3e5a182b7")).booleanValue();
        } else if (orderResponse.e != 50) {
            z11 = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                string4 = orderResponse.f;
            } else {
                string4 = this.b.getString(R.string.wm_order_base_common_sale);
            }
            new CustomDialog.a(this.b).c(R.string.wm_order_base_remind).b(string4).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.e.6
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr13 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect13 = a;
                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "ba039117904f944796579d62ac93b214", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "ba039117904f944796579d62ac93b214");
                    } else if (e.this.b != null) {
                        LocalBroadcastManager.getInstance(e.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
                    }
                }
            }).b();
            z11 = true;
        }
        if (z11) {
            return true;
        }
        Object[] objArr13 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect13 = q;
        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "21031554262bc5ac70473730f758f9da", RobustBitConfig.DEFAULT_VALUE)) {
            z12 = ((Boolean) PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "21031554262bc5ac70473730f758f9da")).booleanValue();
        } else if (orderResponse.e != 37) {
            z12 = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                string5 = orderResponse.f;
            } else {
                string5 = this.b.getString(R.string.wm_order_base_new_customer_not);
            }
            new CustomDialog.a(this.b).c(R.string.wm_order_base_remind).b(string5).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.e.7
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr14 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "d31ca83949b22d0aeb98bfe293955af1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "d31ca83949b22d0aeb98bfe293955af1");
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(e.this.b, com.sankuai.waimai.foundation.router.interfaces.c.B);
                    }
                }
            }).b();
            z12 = true;
        }
        if (z12) {
            return true;
        }
        Object[] objArr14 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect14 = q;
        if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "69686cff9db5b308829ab27bd0340a5b", RobustBitConfig.DEFAULT_VALUE)) {
            z13 = ((Boolean) PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "69686cff9db5b308829ab27bd0340a5b")).booleanValue();
        } else if (orderResponse.e == 44 && orderResponse.r != null && orderResponse.r.isValid()) {
            g.a(this.b, orderResponse.r, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, this.c, this.d, orderResponse.e);
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            return true;
        }
        Object[] objArr15 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect15 = q;
        if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "766b49d200c1558a4328682cae1a5262", RobustBitConfig.DEFAULT_VALUE)) {
            z14 = ((Boolean) PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "766b49d200c1558a4328682cae1a5262")).booleanValue();
        } else if (orderResponse.e == 51 && orderResponse.r != null && orderResponse.r.isValid()) {
            g.a(this.b, orderResponse.r, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, this.c, this.d, orderResponse.e);
            z14 = true;
        } else {
            z14 = false;
        }
        return z14;
    }

    private boolean b(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e7eab10658466539d80c626fbc2fb6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e7eab10658466539d80c626fbc2fb6")).booleanValue();
        }
        if (orderResponse.e == 3 || orderResponse.e == 66) {
            if (orderResponse.e == 66 && !aa.a(orderResponse.m)) {
                com.sankuai.waimai.foundation.router.a.a(this.b, orderResponse.m);
                return true;
            }
            JsonObject jsonObject = new JsonObject();
            try {
                Gson a = com.sankuai.waimai.mach.utils.b.a();
                jsonObject.add("missingfoods", a.toJsonTree(orderResponse.i));
                jsonObject.add("code", a.toJsonTree(Integer.valueOf(orderResponse.e)));
            } catch (Exception unused) {
            }
            if (jsonObject.has("missingfoods")) {
                com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(this.b).a("waimai_order_order_confirm_soldout_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.preview.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                    public final void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog) {
                        Object[] objArr2 = {str, map, dynamicDialog};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54f043bf91285bfbaea166f116f6614d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54f043bf91285bfbaea166f116f6614d");
                        } else if ("alert_confirm".equals(str)) {
                            dynamicDialog.dismiss();
                            LocalBroadcastManager.getInstance(e.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
                        }
                    }
                }).a();
                return true;
            }
            return false;
        }
        return false;
    }
}
