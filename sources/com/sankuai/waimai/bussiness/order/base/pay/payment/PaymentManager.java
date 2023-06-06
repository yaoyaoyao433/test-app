package com.sankuai.waimai.bussiness.order.base.pay.payment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.d;
import com.sankuai.waimai.business.order.api.model.i;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.business.order.api.pay.c;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.base.utils.e;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.bussiness.order.confirm.submit.SubmitOrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.submit.g;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.l;
import java.util.Map;
import org.json.JSONObject;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class PaymentManager implements IPaymentManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void startPay(Context context, String str, String str2, int i, String str3, String str4, i iVar, int i2, j<BaseResponse<d>> jVar, c cVar) {
        Object[] objArr = {context, str, str2, Integer.valueOf(i), str3, str4, iVar, Integer.valueOf(i2), jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95f260b9b5585cae3c74546d4d8697d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95f260b9b5585cae3c74546d4d8697d6");
            return;
        }
        a aVar = new a();
        aVar.a = str;
        aVar.b = str2;
        aVar.c = str3;
        aVar.e = i;
        aVar.d = str4;
        aVar.f = i2;
        startPay(context, aVar, iVar, jVar, cVar);
    }

    public static void startPay(Context context, String str, String str2, int i, String str3, String str4, j<BaseResponse<d>> jVar) {
        Object[] objArr = {context, str, str2, Integer.valueOf(i), str3, str4, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a8176ba80432e30702733e774073b3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a8176ba80432e30702733e774073b3b");
        } else {
            startPay(context, str, str2, i, str3, str4, null, 2, jVar, null);
        }
    }

    public static void startPay(Context context, String str, String str2, int i, String str3, String str4, j<BaseResponse<d>> jVar, c cVar) {
        Object[] objArr = {context, str, str2, Integer.valueOf(i), str3, str4, jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e199a6f9dc0bf1cd8092251954d69d84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e199a6f9dc0bf1cd8092251954d69d84");
        } else {
            startPay(context, str, str2, i, str3, str4, null, 2, jVar, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startPay(Context context, @NonNull a aVar, i iVar, j<BaseResponse<d>> jVar, c cVar) {
        Object[] objArr = {context, aVar, iVar, jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "950aa561edf6e4f502f9946732b69c24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "950aa561edf6e4f502f9946732b69c24");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).genPay(aVar.a, aVar.b, aVar.e, verifyParamToMap(iVar), aVar.f), new b(jVar, aVar, context, cVar), aVar.c);
        }
    }

    public static void continuePay(Context context, String str, String str2, String str3, i iVar, j<BaseResponse<d>> jVar, c cVar) {
        Object[] objArr = {context, str, str2, str3, iVar, jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ed6f1029f68bc9f7687c3e224e3b75c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ed6f1029f68bc9f7687c3e224e3b75c");
            return;
        }
        a aVar = new a();
        aVar.a = str;
        aVar.b = str2;
        aVar.c = str3;
        aVar.e = 1;
        startPay(context, aVar, iVar, jVar, cVar);
    }

    public static void payPlatformVerify(final Context context, final String str, final String str2, final int i, final i iVar, final String str3, final String str4, final b.AbstractC1042b<BaseResponse<d>> abstractC1042b, final c cVar) {
        Object[] objArr = {context, str, str2, Integer.valueOf(i), iVar, str3, str4, abstractC1042b, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aab3e3f8ee826cfea9b9db996855041a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aab3e3f8ee826cfea9b9db996855041a");
            return;
        }
        IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
        if (iOrderBusinessService != null) {
            iOrderBusinessService.registerOnPayTypeListener(new com.sankuai.waimai.business.order.api.pay.d() { // from class: com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.order.api.pay.d
                public final void b(JSONObject jSONObject) {
                }

                @Override // com.sankuai.waimai.business.order.api.pay.d
                public final void a(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7bbbb676fdd8af04d01f773898a68e03", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7bbbb676fdd8af04d01f773898a68e03");
                        return;
                    }
                    int optInt = jSONObject.optInt("pay_pattern");
                    i.this.c = jSONObject.optString("authorization_code");
                    if (optInt == 1) {
                        PaymentManager.continuePay(context, str, str2, str3, null, abstractC1042b, cVar);
                    } else {
                        PaymentManager.startPay(context, str, str2, 0, str3, str4, i.this, i, abstractC1042b, cVar);
                    }
                }
            });
            com.sankuai.waimai.foundation.router.a.a(context, iVar.i, (Bundle) null, 27);
        } else if (abstractC1042b != null) {
            abstractC1042b.onError(new Throwable());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends j<BaseResponse<SubmitOrderResponse>> {
        public static ChangeQuickRedirect a;
        final j<BaseResponse<d>> b;
        final c c;
        @NonNull
        final a d;
        @Nullable
        final Context e;

        @Override // rx.e
        public final void onCompleted() {
        }

        /* JADX WARN: Type inference failed for: r0v76, types: [D, java.lang.Object] */
        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            boolean z;
            boolean z2;
            BaseResponse baseResponse = (BaseResponse) obj;
            boolean z3 = true;
            Object[] objArr = {baseResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a971afdbc370058a7b0b2429a45b958", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a971afdbc370058a7b0b2429a45b958");
            } else if (baseResponse != null && baseResponse.code == 44 && (this.e instanceof Activity)) {
                final Activity activity = (Activity) this.e;
                Object[] objArr2 = {activity, baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "615a6b2d4e6811412719445f572d798d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "615a6b2d4e6811412719445f572d798d");
                    return;
                }
                com.sankuai.waimai.bussiness.order.confirm.submit.b bVar = new com.sankuai.waimai.bussiness.order.confirm.submit.b() { // from class: com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a(int i) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a(int i, boolean z4) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a(BaseResponse baseResponse2) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a(BaseResponse baseResponse2, double d) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a(BaseResponse baseResponse2, DialogInterface dialogInterface) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a(JSONObject jSONObject) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a(boolean z4) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void b(int i) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void b(BaseResponse baseResponse2) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void c() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void c(int i) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void c(BaseResponse baseResponse2) {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void d() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void e() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void f() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void g() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void h() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void i() {
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void a(PreviewSubmitModel.ExtraParam extraParam) {
                        Object[] objArr3 = {extraParam};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea8c2cae896f12d007f6d35ebccd2906", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea8c2cae896f12d007f6d35ebccd2906");
                            return;
                        }
                        b.this.a();
                        PaymentManager.cancelCurrentOrder(b.this.d.a, activity, b.this.d.c, b.this.c);
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final void b(PreviewSubmitModel.ExtraParam extraParam) {
                        Object[] objArr3 = {extraParam};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5ab0a6afcb177bbd8840394edaa40cea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5ab0a6afcb177bbd8840394edaa40cea");
                        } else if (extraParam == null) {
                        } else {
                            if (b.this.c != null) {
                                b.this.c.a(extraParam.orderId);
                            }
                            b.this.d.e = 1;
                            PaymentManager.startPay(b.this.e, b.this.d, null, b.this.b, b.this.c);
                        }
                    }

                    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.b
                    public final String j() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bfcc7fdf49c751f740621699586d8745", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bfcc7fdf49c751f740621699586d8745") : TextUtils.isEmpty(b.this.d.d) ? "c_sxr976a" : b.this.d.d;
                    }
                };
                Object[] objArr3 = {activity, baseResponse, bVar, -1L, ""};
                ChangeQuickRedirect changeQuickRedirect3 = g.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b4b15818d861601f5f07556bf2fab6a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b4b15818d861601f5f07556bf2fab6a9");
                } else {
                    g.a(activity, baseResponse, bVar, -1L, "", -1);
                }
            } else {
                BaseResponse<d> baseResponse2 = new BaseResponse<>();
                if (baseResponse != null) {
                    baseResponse2.code = baseResponse.code;
                    baseResponse2.msg = baseResponse.msg;
                    try {
                        baseResponse2.data = com.sankuai.waimai.foundation.location.v2.d.a().fromJson(baseResponse.data.toString(), (Class<??>) d.class);
                    } catch (Exception unused) {
                    }
                }
                Object[] objArr4 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fa2c0bdac3103088b6dcb51b9b9347fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fa2c0bdac3103088b6dcb51b9b9347fe");
                    return;
                }
                Object[] objArr5 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "700fd03e943981d8dfb0625bd4bf7e82", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "700fd03e943981d8dfb0625bd4bf7e82")).booleanValue();
                } else {
                    z = !a(baseResponse2) && baseResponse2.data.j == 1 && baseResponse2.data.i > 0;
                }
                if (z) {
                    int i = baseResponse2.data.i;
                    String str = this.d.c;
                    i iVar = baseResponse2.data.k;
                    Object[] objArr6 = {Integer.valueOf(i), str, iVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "32fb8d52bf7084638cc6fea888403abf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "32fb8d52bf7084638cc6fea888403abf");
                        return;
                    } else if (i <= 0 || TextUtils.isEmpty(str)) {
                        return;
                    } else {
                        l.a(com.sankuai.waimai.bussiness.order.base.pay.payment.b.a(this, iVar), i, str);
                        return;
                    }
                }
                Object[] objArr7 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c1ce8de69727097ab66770259ab2a8b3", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c1ce8de69727097ab66770259ab2a8b3")).booleanValue();
                } else {
                    z2 = (a(baseResponse2) || baseResponse2.data.k == null || baseResponse2.data.j != 4) ? false : true;
                }
                if (!z2) {
                    Object[] objArr8 = {baseResponse2};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "3eddae2ac08138d8e0c5f1e727abfbf2", RobustBitConfig.DEFAULT_VALUE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "3eddae2ac08138d8e0c5f1e727abfbf2")).booleanValue();
                    } else if (a(baseResponse2) || ((baseResponse2.data.j != 0 && baseResponse2.data.j != 3) || TextUtils.isEmpty(baseResponse2.data.h))) {
                        z3 = false;
                    }
                    if (z3) {
                        ae.a(this.e, baseResponse2.data.h);
                    }
                    if (this.b != null) {
                        this.b.onNext(baseResponse2);
                    }
                    a();
                    return;
                }
                Object[] objArr9 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "3caf4aef3aeffdfb5fd8a598649f2f70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "3caf4aef3aeffdfb5fd8a598649f2f70");
                    return;
                }
                final i iVar2 = baseResponse2.data.k;
                if (f.a(this.e) || iVar2 == null || TextUtils.isEmpty(iVar2.i)) {
                    a(this.e != null ? this.e.getString(R.string.wm_order_confirm_pay_verify_jump_failed) : "");
                    return;
                }
                IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                if (iOrderBusinessService != null) {
                    iOrderBusinessService.registerOnPayTypeListener(new com.sankuai.waimai.business.order.api.pay.d() { // from class: com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager.b.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.order.api.pay.d
                        public final void a(JSONObject jSONObject) {
                            Object[] objArr10 = {jSONObject};
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "bb47b1b8e6a4d2c353a8a8c4ac545de1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "bb47b1b8e6a4d2c353a8a8c4ac545de1");
                                return;
                            }
                            int optInt = jSONObject.optInt("pay_pattern");
                            iVar2.c = jSONObject.optString("authorization_code");
                            if (optInt == 1) {
                                PaymentManager.continuePay(b.this.e, b.this.d.a, b.this.d.b, b.this.d.c, null, b.this.b, b.this.c);
                            } else {
                                PaymentManager.startPay(b.this.e, b.this.d, iVar2, b.this.b, b.this.c);
                            }
                        }

                        @Override // com.sankuai.waimai.business.order.api.pay.d
                        public final void b(JSONObject jSONObject) {
                            Object[] objArr10 = {jSONObject};
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "b5037277b69d37d21e8b43b0ebc3b1e1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "b5037277b69d37d21e8b43b0ebc3b1e1");
                            } else if (b.this.e instanceof OrderConfirmActivity) {
                            } else {
                                com.sankuai.waimai.bussiness.order.base.utils.i.a(b.this.e, jSONObject.optString("order_view_id"), true, 0);
                                b.this.a(IPaymentManager.NO_ACTION);
                            }
                        }
                    });
                    e.b(this.e);
                    com.sankuai.waimai.foundation.router.a.a(this.e, iVar2.i, (Bundle) null, 26);
                    return;
                }
                a(IPaymentManager.NO_ACTION);
            }
        }

        private b(j<BaseResponse<d>> jVar, @NonNull a aVar, @Nullable Context context, c cVar) {
            Object[] objArr = {jVar, aVar, context, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9db68e9dd83c67a3d4a7bc9743c10f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9db68e9dd83c67a3d4a7bc9743c10f");
                return;
            }
            this.b = jVar;
            this.d = aVar;
            this.e = context;
            this.c = cVar;
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d0716d33414d8d9976b2ff1273de0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d0716d33414d8d9976b2ff1273de0c");
            } else if (this.b != null) {
                this.b.onError(th);
            }
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae4773b4276f6991452eba811215d3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae4773b4276f6991452eba811215d3c");
            } else if (this.b != null) {
                this.b.onCompleted();
            }
        }

        void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2274f2e9ea0ce3166e8e6f1fc52c62ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2274f2e9ea0ce3166e8e6f1fc52c62ce");
                return;
            }
            a();
            if (this.b != null) {
                this.b.onError(new Throwable(str));
            }
        }

        private <T> boolean a(BaseResponse<T> baseResponse) {
            Object[] objArr = {baseResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ceec851ca8b2608c3cbcbae56f8f1e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ceec851ca8b2608c3cbcbae56f8f1e")).booleanValue() : baseResponse == null || baseResponse.code != 0 || baseResponse.data == null;
        }
    }

    public static void payDelayed(Context context, String str, String str2, String str3, String str4, i iVar, int i, int i2, j<BaseResponse<d>> jVar, c cVar) {
        Object[] objArr = {context, str, str2, str3, str4, iVar, Integer.valueOf(i), Integer.valueOf(i2), jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7488c5cdbde57e008a0f36adfa45feb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7488c5cdbde57e008a0f36adfa45feb0");
        } else {
            l.a(com.sankuai.waimai.bussiness.order.base.pay.payment.a.a(context, str, str2, str3, str4, iVar, i2, jVar, cVar), i, str3);
        }
    }

    public static /* synthetic */ void lambda$payDelayed$3(Context context, String str, String str2, String str3, String str4, i iVar, int i, j jVar, c cVar) {
        Object[] objArr = {context, str, str2, str3, str4, iVar, Integer.valueOf(i), jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "266161e9e3557bcc520187d044859c1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "266161e9e3557bcc520187d044859c1a");
        } else {
            startPay(context, str, str2, 0, str3, str4, iVar, i, jVar, cVar);
        }
    }

    public static void cancelCurrentOrder(final String str, final Activity activity, String str2, final c cVar) {
        Object[] objArr = {str, activity, str2, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04157b627bc4569acf2819214ae0078a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04157b627bc4569acf2819214ae0078a");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).cancelOrder(str), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.bussiness.order.detailnew.network.response.b>>() { // from class: com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "740458c846a94c3d28634e9cd0fb184d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "740458c846a94c3d28634e9cd0fb184d");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                if (baseResponse == null || baseResponse.code != 0) {
                    ae.a(activity, (int) R.string.wm_order_base_net_error);
                    if (cVar != null) {
                        cVar.a(str, false);
                        return;
                    }
                    return;
                }
                ae.a(activity, (int) R.string.wm_order_status_cancel_successful);
                if (cVar != null) {
                    cVar.a(str, true);
                } else {
                    SubmitOrderManager.getInstance().updateOrderStatus();
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3f3c265184c142ee3f1aef21ed19065f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3f3c265184c142ee3f1aef21ed19065f");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                ae.a(activity, (int) R.string.wm_order_base_net_error);
                if (cVar != null) {
                    cVar.a(str, false);
                }
            }
        }, str2);
    }

    @Override // com.sankuai.waimai.business.order.api.pay.IPaymentManager
    public final void startOrderPay(Context context, Map<String, String> map, j<BaseResponse<d>> jVar) {
        Object[] objArr = {context, map, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c1e96093b2856f2af092f5c6defa64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c1e96093b2856f2af092f5c6defa64d");
        } else if (map == null) {
        } else {
            startPay(context, map.get(Constants.EventConstants.KEY_ORDER_ID), map.get("payCode"), valueOfInt(map.get("selfPay")), map.get("tag"), map.get("cid"), jVar);
        }
    }

    private static int valueOfInt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7f31c87416d082bba0d1d11f50c098a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7f31c87416d082bba0d1d11f50c098a")).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String verifyParamToMap(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5312d210a001c4f0d9715869ff184b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5312d210a001c4f0d9715869ff184b7");
        }
        if (iVar == null) {
            return null;
        }
        return com.sankuai.waimai.foundation.location.v2.d.a().toJson(iVar.a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;

        public a() {
        }
    }
}
