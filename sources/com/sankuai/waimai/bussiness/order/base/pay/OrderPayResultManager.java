package com.sankuai.waimai.bussiness.order.base.pay;

import android.app.Activity;
import android.os.Message;
import android.support.v4.util.Pair;
import android.util.ArrayMap;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IOrderPayResultManager;
import com.sankuai.waimai.business.order.api.pay.f;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderPayResultManager implements IOrderPayResultManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    @Deprecated
    public static void handleResult(Activity activity, int i, String str, long j, String str2, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, new Long(j), str2, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1be574eb6210ec4703540fafb5ad1cc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1be574eb6210ec4703540fafb5ad1cc1");
        } else {
            handleResult(activity, i, str, String.valueOf(j), str2, false, (List<WmOrderedFood>) null, false, fVar);
        }
    }

    public static void handleResult(Activity activity, int i, String str, String str2, String str3, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2, str3, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45891e33da94a024c2d41a782a933a3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45891e33da94a024c2d41a782a933a3b");
        } else {
            handleResult(activity, i, str, str2, str3, false, (List<WmOrderedFood>) null, false, fVar);
        }
    }

    @Deprecated
    public static void handleResult(Activity activity, int i, String str, long j, String str2, boolean z, List<WmOrderedFood> list, boolean z2, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, new Long(j), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "463af591cf0de1d8710fdb951a197990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "463af591cf0de1d8710fdb951a197990");
        } else {
            handleResult(activity, i, str, String.valueOf(j), str2, z, list, z2, fVar);
        }
    }

    public static /* synthetic */ void lambda$handleResult$0(String str, boolean z, List list, f fVar, Activity activity, String str2, boolean z2, String str3) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, fVar, activity, str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a245a08700180664672f25ab1b93078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a245a08700180664672f25ab1b93078");
            return;
        }
        if (!aa.a(str)) {
            if (z && list != null) {
                SubmitOrderManager.getInstance().removeCartData(str, list);
            } else {
                GlobalCartManager.getInstance().clearOrder(str, SubmitOrderManager.getInstance().getSourceType());
                SubmitOrderManager.getInstance().clearOrder();
            }
        }
        SubmitOrderManager.getInstance().updateOrderStatus();
        if (fVar != null) {
            fVar.a(activity, str2, str3);
        }
        Message obtain = Message.obtain();
        obtain.what = 10001;
        com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(obtain);
        publishPaySuccessMessageToKNB();
        if (z2) {
            return;
        }
        com.sankuai.waimai.platform.utils.sharedpreference.a.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager$a] */
    public static void handleResult(Activity activity, int i, String str, String str2, String str3, boolean z, List<WmOrderedFood> list, boolean z2, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3bdcdef246e8b74d998bf8137a8dbad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3bdcdef246e8b74d998bf8137a8dbad3");
        } else if (i == -1 || z2) {
            Object[] objArr2 = {str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, fVar, activity, str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.pay.a.a;
            checkPay(activity, str, str3, PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "ded7b9130c98612b496929e56e837a6c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "ded7b9130c98612b496929e56e837a6c") : new com.sankuai.waimai.bussiness.order.base.pay.a(str2, z, list, fVar, activity, str, z2));
        } else if (i != -1) {
            c.a().a(str);
            i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_pay").b());
        }
    }

    public static /* synthetic */ void lambda$handleResult$1(ArrayMap arrayMap, f fVar, Activity activity, String str, String str2) {
        Object[] objArr = {arrayMap, fVar, activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5cb9d0e4b052e4e101a07aab847d3242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5cb9d0e4b052e4e101a07aab847d3242");
            return;
        }
        if (arrayMap != null && arrayMap.size() > 0) {
            for (int i = 0; i < arrayMap.size(); i++) {
                Pair pair = (Pair) arrayMap.valueAt(i);
                if (pair != null) {
                    SubmitOrderManager.getInstance().removeCartData((String) arrayMap.keyAt(i), (pair.first != 0 ? ((Integer) pair.first).intValue() : 1) == 2 ? 14 : 15, (List) pair.second);
                }
            }
        }
        SubmitOrderManager.getInstance().updateOrderStatus();
        if (fVar != null) {
            fVar.a(activity, str, str2);
        }
        Message obtain = Message.obtain();
        obtain.what = 10001;
        com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(obtain);
        publishPaySuccessMessageToKNB();
    }

    public static void handleResult(Activity activity, int i, String str, String str2, ArrayMap<String, Pair<Integer, List<WmOrderedFood>>> arrayMap, boolean z, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2, arrayMap, Byte.valueOf(z ? (byte) 1 : (byte) 0), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a88a398dd6afaa46cd713b5c0e399dc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a88a398dd6afaa46cd713b5c0e399dc6");
        } else if (i == -1 || z) {
            Object[] objArr2 = {arrayMap, fVar, activity, str};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            checkPay(activity, str, str2, PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "3b7d0ffcffe0a6707c35f7f7f01d1ab6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "3b7d0ffcffe0a6707c35f7f7f01d1ab6") : new b(arrayMap, fVar, activity, str));
        } else if (i != -1) {
            c.a().a(str);
            i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_pay").b());
        }
    }

    private static void checkPay(Activity activity, String str, String str2, final a aVar) {
        Object[] objArr = {activity, str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2a912c44ef52cb2557de517dd5fa53d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2a912c44ef52cb2557de517dd5fa53d");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).checkPay(str, str2), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.bussiness.order.base.model.a>>() { // from class: com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    com.sankuai.waimai.bussiness.order.base.model.a aVar2;
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9b1878addf1dc8bedf7d67170609f830", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9b1878addf1dc8bedf7d67170609f830");
                        return;
                    }
                    String str3 = "";
                    if (baseResponse != null && baseResponse.code == 0 && (aVar2 = (com.sankuai.waimai.bussiness.order.base.model.a) baseResponse.data) != null && com.sankuai.waimai.bussiness.order.base.model.a.a == aVar2.c && !aa.a(aVar2.d)) {
                        str3 = aVar2.d;
                    }
                    if (a.this != null) {
                        a.this.a(str3);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5e243eefd566f65a79ab58b487cee696", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5e243eefd566f65a79ab58b487cee696");
                    } else if (a.this != null) {
                        a.this.a("");
                    }
                }
            }, activity instanceof BaseActivity ? ((BaseActivity) activity).w() : "");
        }
    }

    private static void publishPaySuccessMessageToKNB() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "026d1150db6ff214f1ed1280d34bda9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "026d1150db6ff214f1ed1280d34bda9c");
            return;
        }
        try {
            JsHandlerFactory.publish(new JSONObject().put("action", "com.meituan.waimai.paySuccessfully.notification"));
        } catch (JSONException unused) {
        }
    }

    @Override // com.sankuai.waimai.business.order.api.pay.IOrderPayResultManager
    public void handlePayResult(Activity activity, int i, String str, long j, String str2, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, new Long(j), str2, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5970f3c5da1bb4d21c9607fbe1c5320d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5970f3c5da1bb4d21c9607fbe1c5320d");
        } else {
            handleResult(activity, i, str, j, str2, false, (List<WmOrderedFood>) null, false, fVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.pay.IOrderPayResultManager
    public void handlePayResult(Activity activity, int i, String str, String str2, String str3, f fVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2, str3, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "893ca13c0a42146b39b4a2ae0c2d8d81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "893ca13c0a42146b39b4a2ae0c2d8d81");
        } else {
            handleResult(activity, i, str, str2, str3, false, (List<WmOrderedFood>) null, false, fVar);
        }
    }
}
