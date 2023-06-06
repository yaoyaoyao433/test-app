package com.sankuai.waimai.bussiness.order.refund;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.bussiness.order.base.net.PaymentApi;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.GenerateRefundResponse;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.abtest.f;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends h {
    public static ChangeQuickRedirect a;
    Dialog b;
    private String c;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a0efec1a40c66994d9fe342dceed73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a0efec1a40c66994d9fe342dceed73");
            return;
        }
        this.c = getClass().getSimpleName() + System.currentTimeMillis();
        this.b = null;
    }

    public final boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b40cdcee0ed7e1bab3dce6d6bfa408", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b40cdcee0ed7e1bab3dce6d6bfa408")).booleanValue();
        }
        if (activity.isFinishing()) {
            return false;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.b);
        this.b = null;
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc84a18fe4508739087c7b57703e93cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc84a18fe4508739087c7b57703e93cb");
            return;
        }
        final String queryParameter = jVar.d.getQueryParameter("orderid");
        if (jVar.c instanceof Activity) {
            final Activity activity = (Activity) jVar.c;
            if (queryParameter == null) {
                return;
            }
            Object[] objArr2 = {queryParameter, activity, queryParameter};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ac831397824b7dae7fa8837e5aa024a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ac831397824b7dae7fa8837e5aa024a");
            } else if (activity != null) {
                Object[] objArr3 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca0113fafe9a7930bbd4449c38ca3477", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca0113fafe9a7930bbd4449c38ca3477")).booleanValue();
                } else if (!activity.isFinishing()) {
                    com.sankuai.waimai.platform.widget.dialog.a.b(this.b);
                    this.b = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
                    this.b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.refund.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Object[] objArr4 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9aa4c8fa95ef46316d7e490ae605b0a2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9aa4c8fa95ef46316d7e490ae605b0a2");
                            } else {
                                activity.finish();
                            }
                        }
                    });
                }
                b.a(((PaymentApi) b.a((Class<Object>) PaymentApi.class)).refundPreview(queryParameter), new b.AbstractC1042b<BaseResponse<GenerateRefundResponse>>() { // from class: com.sankuai.waimai.bussiness.order.refund.a.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr4 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c96a99156e40bbd28e875cd50b16e51a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c96a99156e40bbd28e875cd50b16e51a");
                            return;
                        }
                        int i = baseResponse.code;
                        String str = baseResponse.msg;
                        if (i == 2 && a.this.b != null) {
                            a.this.b.setOnDismissListener(null);
                            a.this.a(activity);
                        } else {
                            a.this.a(activity);
                        }
                        if (i == 2) {
                            final GenerateRefundResponse generateRefundResponse = (GenerateRefundResponse) baseResponse.data;
                            new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558962)).a(R.string.wm_order_base_remind).b(generateRefundResponse.failuerDesc).a(R.string.wm_order_status_wait, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.refund.a.1.3
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    Object[] objArr5 = {dialogInterface, Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c7f0beaab78c71e7f9090bf0773b5a67", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c7f0beaab78c71e7f9090bf0773b5a67");
                                    } else {
                                        dialogInterface.dismiss();
                                    }
                                }
                            }).b(R.string.wm_order_status_dial_phone_num, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.refund.a.1.2
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    Object[] objArr5 = {dialogInterface, Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a0633b22f5031f47ccebb95a2d9b94d8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a0633b22f5031f47ccebb95a2d9b94d8");
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    i.c(activity, generateRefundResponse.poiPhone);
                                }
                            }).a(true).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.refund.a.1.1
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    Object[] objArr5 = {dialogInterface};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b392024f7dcd2a78ba477433476b8e5f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b392024f7dcd2a78ba477433476b8e5f");
                                    } else {
                                        activity.finish();
                                    }
                                }
                            }).b();
                        } else if (i == 0 || i == 3) {
                            GenerateRefundResponse generateRefundResponse2 = (GenerateRefundResponse) baseResponse.data;
                            if (generateRefundResponse2 == null) {
                                ae.a(activity, (int) R.string.wm_order_status_server_error_quit_retry_1);
                                return;
                            }
                            List<Object> list = generateRefundResponse2.refundReasonList;
                            if (list == null || list.isEmpty()) {
                                ae.a(activity, (int) R.string.wm_order_status_server_error_quit_retry_2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("refund_response", generateRefundResponse2);
                            bundle.putBoolean("is_from_refund_h5", false);
                            bundle.putString("view_id", queryParameter);
                            bundle.putInt("arg_resp_code", i);
                            bundle.putString("arg_resp_msg", str);
                            if (f.a(activity, "order_h5_applyrefund_android")) {
                                com.sankuai.waimai.foundation.router.a.a(activity, f.a() + "/c/applyrefund.html?view_id=" + queryParameter + "&refund_response=" + generateRefundResponse2 + "&is_from_refund_h5=false&arg_resp_code=" + i + "&arg_resp_msg=" + str, (Bundle) null);
                                return;
                            }
                            com.sankuai.waimai.foundation.router.a.a(activity, activity.getResources().getString(R.string.wm_order_apply_refund_scheme), bundle);
                        } else if (!TextUtils.isEmpty(str)) {
                            ae.a(activity, str);
                        } else {
                            ae.a(activity, (int) R.string.wm_order_status_server_error_quit_retry);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr4 = {th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dff5d9c6e25995c4821c33c3907d477b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dff5d9c6e25995c4821c33c3907d477b");
                            return;
                        }
                        a.this.a(activity);
                        ae.a(activity, (int) R.string.wm_order_base_net_error);
                        activity.finish();
                    }
                }, this.c);
            }
        }
    }
}
