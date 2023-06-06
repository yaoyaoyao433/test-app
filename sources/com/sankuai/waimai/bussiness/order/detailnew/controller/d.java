package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    Activity b;
    public String c;
    private String d;

    public d(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cdce6f0aaddad3c9998ba166e628fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cdce6f0aaddad3c9998ba166e628fa");
            return;
        }
        this.b = activity;
        this.d = str;
    }

    public final void a(boolean z, String str) {
        Object[] objArr = {(byte) 1, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c58c29437d21b5b8af12ed10ebb3de03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c58c29437d21b5b8af12ed10ebb3de03");
        } else if (TextUtils.isEmpty(com.sankuai.waimai.platform.domain.manager.user.a.i().e())) {
            ae.a(this.b, (int) R.string.wm_order_base_login_before_pay);
            com.sankuai.waimai.platform.domain.manager.user.a.a((Context) this.b);
        } else if (TextUtils.isEmpty(com.sankuai.waimai.platform.domain.manager.user.a.i().f()) && !com.sankuai.waimai.foundation.core.a.f()) {
            com.sankuai.waimai.foundation.router.a.a(this.b, com.sankuai.waimai.foundation.router.interfaces.c.j, (Bundle) null);
        } else {
            com.sankuai.waimai.bussiness.order.base.utils.e.a(this.b);
            PaymentManager.startPay(this.b, str, "3", 0, this.d, "c_hgowsqb", new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.order.api.model.d>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.d.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4280b9b22925e404e67198b6aa23b735", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4280b9b22925e404e67198b6aa23b735");
                    } else if (baseResponse != null) {
                        int i = baseResponse.code;
                        if (i != 401) {
                            switch (i) {
                                case 0:
                                    com.sankuai.waimai.business.order.api.model.d dVar = (com.sankuai.waimai.business.order.api.model.d) baseResponse.data;
                                    if (dVar != null) {
                                        String str2 = dVar.c;
                                        d.this.c = str2;
                                        if (((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).j == 3) {
                                            SubmitOrderManager.getInstance().updateOrderStatus("MedicalInsurancePayFinish", null);
                                            com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
                                            return;
                                        }
                                        com.sankuai.waimai.platform.capacity.pay.a.a(d.this.b, 112, str2, dVar.g);
                                        return;
                                    }
                                    ae.a(d.this.b, (int) R.string.wm_order_base_server_error_cancel_pay);
                                    return;
                                case 1:
                                    String str3 = baseResponse.msg;
                                    if (TextUtils.isEmpty(str3)) {
                                        ae.a(d.this.b, (int) R.string.wm_order_base_server_error_cancel_pay);
                                        return;
                                    } else {
                                        ae.a(d.this.b, str3);
                                        return;
                                    }
                                default:
                                    return;
                            }
                        }
                        String str4 = baseResponse.msg;
                        if (TextUtils.isEmpty(str4)) {
                            ae.a(d.this.b, (int) R.string.wm_order_base_invalid_token_login_again);
                        } else {
                            ae.a(d.this.b, str4);
                        }
                    } else {
                        ae.a(d.this.b, (int) R.string.takeout_loading_fail_try_afterwhile);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddc027ad464ed80fdc09bbcfe6ed030d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddc027ad464ed80fdc09bbcfe6ed030d");
                    } else if (TextUtils.equals(th.getMessage(), IPaymentManager.NO_ACTION)) {
                    } else {
                        if (TextUtils.isEmpty(th.getMessage())) {
                            ae.a(d.this.b, (int) R.string.wm_order_base_net_error);
                        } else {
                            ae.a(d.this.b, th.getMessage());
                        }
                    }
                }

                @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
                public final void onCompleted() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ba916f687b22b35f7a8b5054d348198", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ba916f687b22b35f7a8b5054d348198");
                    } else {
                        com.sankuai.waimai.bussiness.order.base.utils.e.b(d.this.b);
                    }
                }
            });
        }
    }
}
