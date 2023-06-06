package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.base.net.PaymentApi;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.GenerateRefundResponse;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.xm.base.util.ad;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c b;
    public Activity c;
    a d;
    private String e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(ButtonItem buttonItem);
    }

    public static /* synthetic */ void a(c cVar, GenerateRefundResponse generateRefundResponse, String str, int i, int i2, String str2, boolean z) {
        Object[] objArr = {generateRefundResponse, str, Integer.valueOf(i), Integer.valueOf(i2), str2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "c6545a5d52cd2d9801fb59585139d152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "c6545a5d52cd2d9801fb59585139d152");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("biz_type", i);
        bundle.putSerializable("refund_response", generateRefundResponse);
        bundle.putBoolean("is_from_refund_h5", false);
        bundle.putString("view_id", str);
        bundle.putInt("arg_resp_code", i2);
        bundle.putString("arg_resp_msg", str2);
        if (com.sankuai.waimai.platform.capacity.abtest.f.a(cVar.c, "order_h5_applyrefund_android")) {
            com.sankuai.waimai.foundation.router.a.a(cVar.c, com.sankuai.waimai.platform.capacity.abtest.f.a() + "/c/applyrefund.html?view_id=" + str + "&refund_response=" + generateRefundResponse + "&is_from_refund_h5=false&arg_resp_code=" + i2 + "&arg_resp_msg=" + str2, (Bundle) null);
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(cVar.c, cVar.c.getResources().getString(R.string.wm_order_apply_refund_scheme), bundle);
    }

    public static /* synthetic */ void a(c cVar, String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "70e8315ff3cbc1948c6254618546121d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "70e8315ff3cbc1948c6254618546121d");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("orderViewId", str);
        bundle.putInt("orderStatus", i);
        if (com.sankuai.waimai.platform.capacity.abtest.f.a(cVar.c, "order_h5_cancel_reason_android")) {
            com.sankuai.waimai.foundation.router.a.a(cVar.c, com.sankuai.waimai.platform.capacity.abtest.f.a() + "/c/cancelReason.html?orderViewId=" + str + "&orderStatus=" + i + "&requestForResult=true");
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(cVar.c, cVar.c.getString(R.string.wm_order_cancel_reason_feedback_scheme), bundle);
    }

    public static /* synthetic */ void a(c cVar, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {str, str2, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "1d9dd001bc5384371e9d7757d1800b5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "1d9dd001bc5384371e9d7757d1800b5a");
        } else if (cVar.c == null || cVar.c.isFinishing()) {
        } else {
            new CustomDialog.a(cVar.c).c(R.string.wm_order_base_remind).b(str).a(R.string.wm_order_status_wait, (DialogInterface.OnClickListener) null).b(str2, onClickListener).a(false).b();
        }
    }

    public c(Activity activity, String str, a aVar) {
        Object[] objArr = {activity, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c09fd47782f63aa974f7db7d33fb18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c09fd47782f63aa974f7db7d33fb18");
            return;
        }
        this.c = activity;
        this.e = str;
        this.d = aVar;
    }

    public c(Activity activity, String str, a aVar, com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c cVar) {
        Object[] objArr = {activity, str, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c190378e3993a1f154bb2e9ac483c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c190378e3993a1f154bb2e9ac483c1");
            return;
        }
        this.c = activity;
        this.e = str;
        this.d = aVar;
        this.b = cVar;
    }

    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c cVar, final com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569dd201f6a1054ac94858ce296afd9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569dd201f6a1054ac94858ce296afd9d");
            return;
        }
        this.b = cVar;
        if (this.b == null) {
            i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_cancel_order_before_accepted").c("response_data_empty").b());
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(this.c, 2131558962)).a(R.string.wm_order_status_suggest_contact_poi).b(R.string.wm_order_status_contact_poi_easier_get_refund).b(R.string.wm_order_btn_cancel_order_and_refund, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f6ac326932be3b3c48246a8f86edfbc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f6ac326932be3b3c48246a8f86edfbc");
                    } else {
                        c.this.a((String) null);
                    }
                }
            }).a(R.string.wm_order_base_contact_poi, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98ef3ba02657187a8607513196569635", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98ef3ba02657187a8607513196569635");
                        return;
                    }
                    c cVar2 = c.this;
                    if (!(cVar2.b != null && cVar2.b.h.p == 1)) {
                        com.sankuai.waimai.bussiness.order.base.utils.i.b(c.this.c, bVar.u);
                        return;
                    }
                    Activity activity = c.this.c;
                    c cVar3 = c.this;
                    String str = cVar3.b != null ? cVar3.b.e : "";
                    c cVar4 = c.this;
                    com.sankuai.waimai.bussiness.order.base.utils.i.a(activity, str, cVar4.b != null ? cVar4.b.d : "", 1, bVar.w);
                }
            }).a(true).b();
        }
    }

    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c cVar, com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar, ButtonItem buttonItem) {
        Object[] objArr = {cVar, bVar, buttonItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bcec45eb3cce46fd5e0db845c9cd781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bcec45eb3cce46fd5e0db845c9cd781");
            return;
        }
        this.b = cVar;
        if (this.b == null) {
            i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_refund_quickly").c("response_data_empty").b());
            return;
        }
        String str = com.sankuai.waimai.foundation.router.interfaces.b.c;
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "imeituan://www.meituan.com";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str = "dianping://waimai.dianping.com";
        }
        JsonObject jsonObject = bVar.y;
        jsonObject.add("pop_up_info", com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJsonTree(buttonItem.mPopUpInfo));
        jsonObject.addProperty("code", Integer.valueOf(buttonItem.code));
        jsonObject.addProperty("action", Integer.valueOf(buttonItem.action));
        com.sankuai.waimai.foundation.router.a.a(this.c, str + "/machalertview?template_id=supermarket_order_status_fast_refund_modal_style_1&data=" + Uri.encode(jsonObject.toString()));
    }

    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c cVar, ButtonItem buttonItem) {
        Object[] objArr = {cVar, buttonItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1192f9ff0542f920ed7c78e58c82900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1192f9ff0542f920ed7c78e58c82900");
            return;
        }
        this.b = cVar;
        if (this.b == null) {
            i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_refund_quickly").c("response_data_empty").b());
        } else {
            a(buttonItem.clickUrl);
        }
    }

    void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea8a7e48d623988c3dd432a9816ed27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea8a7e48d623988c3dd432a9816ed27");
            return;
        }
        String str2 = this.b.e;
        com.sankuai.waimai.business.order.api.detail.model.a aVar = this.b.h;
        final int i = aVar != null ? aVar.o : 0;
        final int i2 = aVar != null ? aVar.z : 0;
        if (com.sankuai.waimai.bussiness.order.base.utils.i.a(i)) {
            a(str2, false, false);
        } else if (!aa.a(str)) {
            com.sankuai.waimai.foundation.router.a.a(this.c, str + "&request_code=25&aftersale_request_source=2", new Bundle(), 25);
        } else {
            final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((PaymentApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) PaymentApi.class)).refundPreview(str2), new b.AbstractC1042b<BaseResponse<GenerateRefundResponse>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.3
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf2b775bde8896d685525786aaffeb3e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf2b775bde8896d685525786aaffeb3e");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    int i3 = baseResponse.code;
                    String str3 = baseResponse.msg;
                    if (c.this.d != null) {
                        c.this.d.a();
                    }
                    if (i3 == 3) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = c.this.c.getString(R.string.wm_order_status_server_error_quit_retry);
                        }
                        ae.a(c.this.c, str3);
                    } else if (i3 == 2) {
                        final GenerateRefundResponse generateRefundResponse = (GenerateRefundResponse) baseResponse.data;
                        if (i != 2 || c.this.c == null || c.this.c.isFinishing()) {
                            return;
                        }
                        new CustomDialog.a(c.this.c).c(R.string.wm_order_base_remind).b(generateRefundResponse.failuerDesc).a(R.string.wm_order_status_wait, (DialogInterface.OnClickListener) null).b(R.string.wm_order_status_dial_phone_num, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.3.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i4)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "466bde0340ad94f92374259d8ed242f0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "466bde0340ad94f92374259d8ed242f0");
                                } else {
                                    com.sankuai.waimai.bussiness.order.base.utils.i.c(c.this.c, generateRefundResponse.poiPhone);
                                }
                            }
                        }).a(false).b();
                    } else if (i3 == 0) {
                        GenerateRefundResponse generateRefundResponse2 = (GenerateRefundResponse) baseResponse.data;
                        if (generateRefundResponse2 == null) {
                            ae.a(c.this.c, (int) R.string.wm_order_status_server_error_quit_retry_1);
                            return;
                        }
                        List<Object> list = generateRefundResponse2.refundReasonList;
                        List<GenerateRefundResponse.c> list2 = generateRefundResponse2.foodInfoList;
                        if (list.isEmpty()) {
                            ae.a(c.this.c, (int) R.string.wm_order_status_server_error_quit_retry_2);
                        } else if ((list2 == null || list2.isEmpty()) && (generateRefundResponse2.biz_tag != 1 || generateRefundResponse2.cycleFoodList == null || generateRefundResponse2.cycleFoodList.isEmpty())) {
                            ae.a(c.this.c, (int) R.string.wm_order_status_server_error_quit_retry_3);
                        } else {
                            c.a(c.this, generateRefundResponse2, c.this.b.e, i2, i3, str3, false);
                        }
                    } else if (!TextUtils.isEmpty(str3)) {
                        ae.a(c.this.c, str3);
                    } else {
                        ae.a(c.this.c, (int) R.string.wm_order_status_server_error_quit_retry);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81a75f86ea616a3b94f250c81399fc62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81a75f86ea616a3b94f250c81399fc62");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    ae.a(c.this.c, (int) R.string.wm_order_base_net_error);
                    if (c.this.d != null) {
                        c.this.d.a();
                    }
                }
            }, this.e);
        }
    }

    public final void a(String str, boolean z, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c5e16d65e3a917da92debf9fc9450d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c5e16d65e3a917da92debf9fc9450d4");
        } else {
            a(str, z, false, false);
        }
    }

    public final void a(final String str, final boolean z, final boolean z2, final boolean z3) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ee48065a492f88b36b50eeb1f7c374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ee48065a492f88b36b50eeb1f7c374");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).cancelOrder(str), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.bussiness.order.detailnew.network.response.b>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.4
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d7f33015d2e0382c12b5346551d5a94", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d7f33015d2e0382c12b5346551d5a94");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                if (baseResponse == null) {
                    ae.a(c.this.c, (int) R.string.wm_order_status_cancel_failed);
                    if (c.this.d != null) {
                        c.this.d.a();
                    }
                } else if (baseResponse.code == 0) {
                    ae.a(c.this.c, (int) R.string.wm_order_status_cancel_successful);
                    SubmitOrderManager.getInstance().updateOrderStatus();
                    if (!c.a(c.this) && !z3) {
                        c.a(c.this, str, c.b(c.this));
                    }
                    if (c.this.d != null) {
                    }
                } else {
                    if (c.this.d != null) {
                        c.this.d.a();
                    }
                    if (baseResponse.code == 1) {
                        ae.a(c.this.c, baseResponse.msg);
                    } else if (baseResponse.data == 0) {
                        ae.a(c.this.c, (int) R.string.wm_order_status_cancel_failed);
                    } else {
                        com.sankuai.waimai.bussiness.order.detailnew.network.response.b bVar = (com.sankuai.waimai.bussiness.order.detailnew.network.response.b) baseResponse.data;
                        String str2 = bVar.a;
                        final String str3 = baseResponse.code == 2 ? bVar.b : bVar.c;
                        if (TextUtils.isEmpty(str2)) {
                            ae.a(c.this.c, (int) R.string.wm_order_status_cancel_failed);
                            return;
                        }
                        switch (baseResponse.code) {
                            case 2:
                                if (!z) {
                                    c.a(c.this, str2, c.this.c.getString(R.string.wm_order_base_contact_poi), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.4.1
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21c46c3f3bd4bda354174fb1d1dcd066", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21c46c3f3bd4bda354174fb1d1dcd066");
                                            } else if (c.this.d == null) {
                                            } else {
                                                c.this.d.a(new ButtonItem(2006));
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    ae.a(c.this.c, str2);
                                    return;
                                }
                            case 3:
                                c.a(c.this, str2, c.this.c.getString(R.string.wm_order_status_dial_phone_num), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.4.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db274a6b1da6d8142a75f1421d07d82e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db274a6b1da6d8142a75f1421d07d82e");
                                        } else {
                                            com.sankuai.waimai.bussiness.order.base.utils.i.c(c.this.c, str3);
                                        }
                                    }
                                });
                                return;
                            default:
                                return;
                        }
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c44b72a57b1ac3369533e6926e5e424", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c44b72a57b1ac3369533e6926e5e424");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                if (c.this.d != null) {
                    c.this.d.a();
                }
                ae.a(c.this.c, (int) R.string.wm_order_base_net_error);
            }
        }, this.e);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21244906cf44d6a8ffc98f6bf086fd80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21244906cf44d6a8ffc98f6bf086fd80");
        } else {
            a(str, false, 1, false, false);
        }
    }

    public final void a(final String str, final boolean z, int i, final boolean z2, final boolean z3) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1495554c286bfd8b89adfc5e7352fdcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1495554c286bfd8b89adfc5e7352fdcc");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).cancelTogetherOrder(str, i), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.bussiness.order.detailnew.network.response.d>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.5
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c339c293341f733f9ea64dacec2adfe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c339c293341f733f9ea64dacec2adfe");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                if (baseResponse == null) {
                    ae.a(c.this.c, (int) R.string.wm_order_status_cancel_failed);
                    if (c.this.d != null) {
                        c.this.d.a();
                    }
                } else if (baseResponse.code == 0) {
                    ae.a(c.this.c, (int) R.string.wm_order_status_cancel_successful);
                    SubmitOrderManager.getInstance().updateOrderStatus();
                    if (!c.a(c.this) && !z3) {
                        c.a(c.this, str, c.b(c.this));
                    }
                    if (c.this.d != null) {
                    }
                } else {
                    if (c.this.d != null) {
                        c.this.d.a();
                    }
                    if (baseResponse.code == 1) {
                        ae.a(c.this.c, baseResponse.msg);
                    } else if (baseResponse.data == 0) {
                        ad.a(c.this.c, (int) R.string.wm_order_status_cancel_failed);
                    } else {
                        com.sankuai.waimai.bussiness.order.detailnew.network.response.d dVar = (com.sankuai.waimai.bussiness.order.detailnew.network.response.d) baseResponse.data;
                        String str2 = dVar.a;
                        final String str3 = baseResponse.code == 2 ? dVar.b : dVar.c;
                        if (TextUtils.isEmpty(str2) && baseResponse.code != 6) {
                            ae.a(c.this.c, (int) R.string.wm_order_status_cancel_failed);
                            return;
                        }
                        int i2 = baseResponse.code;
                        if (i2 != 6) {
                            switch (i2) {
                                case 2:
                                    if (!z) {
                                        c.a(c.this, str2, c.this.c.getString(R.string.wm_order_base_contact_poi), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.5.1
                                            public static ChangeQuickRedirect a;

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i3)};
                                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "56cb4ca798f03c0be526501bea6ca253", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "56cb4ca798f03c0be526501bea6ca253");
                                                } else if (c.this.d == null) {
                                                } else {
                                                    c.this.d.a(new ButtonItem(2006));
                                                }
                                            }
                                        });
                                        return;
                                    } else {
                                        ae.a(c.this.c, str2);
                                        return;
                                    }
                                case 3:
                                    c.a(c.this, str2, c.this.c.getString(R.string.wm_order_status_dial_phone_num), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.5.2
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i3) {
                                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i3)};
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02ba5e4f40f85b85a9a55d5b6a0634fe", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02ba5e4f40f85b85a9a55d5b6a0634fe");
                                            } else {
                                                com.sankuai.waimai.bussiness.order.base.utils.i.c(c.this.c, str3);
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    return;
                            }
                        }
                        RooAlertDialog.a aVar = new RooAlertDialog.a(new ContextThemeWrapper(c.this.c, 2131558963));
                        aVar.a(dVar.d.a).b(dVar.d.b);
                        if (dVar.d.c.size() == 2) {
                            int i3 = !dVar.d.c.get(0).b.equals("1");
                            aVar.b(dVar.d.c.get(i3).a, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.5.3
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i4)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "86eead4ca743b7353731b8c92b06608c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "86eead4ca743b7353731b8c92b06608c");
                                    } else {
                                        c.this.a(str, z, 0, z2, z3);
                                    }
                                }
                            });
                            aVar.a(dVar.d.c.get(1 - i3).a, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.5.4
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i4)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b7090e8ac26c9ed93c1b6c4487af96cd", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b7090e8ac26c9ed93c1b6c4487af96cd");
                                    }
                                }
                            });
                        } else {
                            aVar.a(dVar.d.c.get(0).a, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.c.5.5
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i4)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e9dac888454ec21e815583d6ea267021", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e9dac888454ec21e815583d6ea267021");
                                    }
                                }
                            });
                        }
                        aVar.a(false);
                        aVar.a().show();
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "470b96ca55dda8b042283ab96442e6e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "470b96ca55dda8b042283ab96442e6e4");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                if (c.this.d != null) {
                    c.this.d.a();
                }
                ae.a(c.this.c, (int) R.string.wm_order_base_net_error);
            }
        }, this.e);
    }

    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79da447a858f6996b815b13f09139252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79da447a858f6996b815b13f09139252");
        } else {
            a(bVar, true, 0);
        }
    }

    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar, boolean z, int i) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3110627e62dab491ecf0b889d06ebea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3110627e62dab491ecf0b889d06ebea1");
            return;
        }
        String str = com.sankuai.waimai.foundation.router.interfaces.b.c;
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "imeituan://www.meituan.com";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str = "dianping://waimai.dianping.com";
        }
        JsonObject jsonObject = bVar.y;
        jsonObject.addProperty("alert_cancel_code", Integer.valueOf(z ? 2002 : 2045));
        jsonObject.addProperty("dialog_from", Integer.valueOf(i));
        com.sankuai.waimai.foundation.router.a.a(this.c, str + "/machalertview?template_id=waimai_order_status_cancel_order_dialog_style_1&data=" + Uri.encode(jsonObject.toString()));
    }

    public static /* synthetic */ boolean a(c cVar) {
        return (cVar.b == null || cVar.b.b == null || cVar.b.b.a == null) ? false : true;
    }

    public static /* synthetic */ int b(c cVar) {
        if (cVar.b == null || cVar.b.h == null) {
            return 0;
        }
        return cVar.b.h.e;
    }
}
