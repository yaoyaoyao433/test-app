package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.net.PaymentApi;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    Activity b;
    final String c;
    a d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public f(Activity activity, String str, a aVar) {
        Object[] objArr = {activity, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f01295fd70648f88f1f36b23690d6cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f01295fd70648f88f1f36b23690d6cf");
            return;
        }
        this.b = activity;
        this.c = str;
        this.d = aVar;
    }

    public final void a(final String str, @Nullable String str2, String str3) {
        String string;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa248ea4404f42a44b1b75b8e79dcefe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa248ea4404f42a44b1b75b8e79dcefe");
        } else if (this.b == null || this.b.isFinishing()) {
        } else {
            RooAlertDialog.a a2 = new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558963)).a(TextUtils.isEmpty(str2) ? str2 : this.b.getResources().getString(R.string.wm_order_dialog_refund_appeal_title, str2));
            Object[] objArr2 = {str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d1221c6a691df1c6ee63cc4aed4fbbe", RobustBitConfig.DEFAULT_VALUE)) {
                string = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d1221c6a691df1c6ee63cc4aed4fbbe");
            } else if (TextUtils.isEmpty(str3)) {
                string = !TextUtils.isEmpty(str2) ? this.b.getResources().getString(R.string.wm_order_cancel_refund, str2) : "";
            } else {
                string = str3;
            }
            a2.b(string).a(R.string.wm_order_dialog_btn_confirm_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.f.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4cc83cb5b06bc7ac7c9a85cd30ecf20", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4cc83cb5b06bc7ac7c9a85cd30ecf20");
                        return;
                    }
                    final f fVar = f.this;
                    String str4 = str;
                    Object[] objArr4 = {str4};
                    ChangeQuickRedirect changeQuickRedirect4 = f.a;
                    if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "ffe9af91a8a31e82ccd585b1f3a4ef6e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "ffe9af91a8a31e82ccd585b1f3a4ef6e");
                    } else {
                        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((PaymentApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) PaymentApi.class)).cancelRefundAppeal(str4), new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.f.3
                            public static ChangeQuickRedirect a;

                            @Override // rx.e
                            public final /* synthetic */ void onNext(Object obj) {
                                BaseResponse baseResponse = (BaseResponse) obj;
                                Object[] objArr5 = {baseResponse};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "254f0906838c1af327fc3f74bce20862", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "254f0906838c1af327fc3f74bce20862");
                                } else if (baseResponse.code == 0) {
                                    ae.a(f.this.b, (int) R.string.wm_order_status_cancel_request_successful);
                                    SubmitOrderManager.getInstance().updateOrderStatus();
                                } else if (!TextUtils.isEmpty(baseResponse.msg)) {
                                    ae.a(f.this.b, baseResponse.msg);
                                } else {
                                    ae.a(f.this.b, (int) R.string.wm_order_status_cancel_request_failed);
                                }
                            }

                            @Override // rx.e
                            public final void onError(Throwable th) {
                                Object[] objArr5 = {th};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f08b3ee7a28263c52093e242a87bc0b1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f08b3ee7a28263c52093e242a87bc0b1");
                                } else {
                                    ae.a(f.this.b, (int) R.string.wm_order_status_cancel_request_failed);
                                }
                            }
                        }, fVar.c);
                    }
                    dialogInterface.dismiss();
                    f.this.d.a();
                }
            }).b(R.string.wm_order_dialog_btn_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.f.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a6c451de17d748f5f6f66b2faece5357", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a6c451de17d748f5f6f66b2faece5357");
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).a(false).b();
        }
    }
}
