package com.sankuai.waimai.store.drug.mmp.apis;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.msi.api.extension.medicine.IMedicinePay;
import com.meituan.msi.api.extension.medicine.PayParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.d;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.business.order.api.pay.e;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.store.router.c;
import com.sankuai.waimai.store.util.al;
import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MedicinePayImpl extends IMedicinePay {
    public static ChangeQuickRedirect b;

    public static /* synthetic */ String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a59aae1e3d08d7ffce2fc233ffdde0b1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a59aae1e3d08d7ffce2fc233ffdde0b1") : String.valueOf(System.currentTimeMillis());
    }

    public static /* synthetic */ void a(MedicinePayImpl medicinePayImpl, Activity activity, String str, long j, String str2) {
        Object[] objArr = {activity, str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, medicinePayImpl, changeQuickRedirect, false, "ad276d9dfdc0aa5cf5b6a7b3d75c1c6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, medicinePayImpl, changeQuickRedirect, false, "ad276d9dfdc0aa5cf5b6a7b3d75c1c6d");
        } else {
            e.a().handlePayResult(activity, -1, str, j, str2, a.a());
        }
    }

    public static /* synthetic */ void b(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b04a013cc10a05be72cd943a7715e61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b04a013cc10a05be72cd943a7715e61");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Uri.Builder buildUpon = Uri.parse("meituanpayment://cashier/launch").buildUpon();
                buildUpon.appendQueryParameter("trade_number", str);
                buildUpon.appendQueryParameter("pay_token", str2);
                Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                intent.setPackage(activity.getPackageName());
                activity.startActivityForResult(intent, 111);
            }
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.d("PayUtils-startPay", e.getMessage(), new Object[0]);
        }
    }

    @Override // com.meituan.msi.api.extension.medicine.IMedicinePay
    public final void a(final MsiCustomContext msiCustomContext, final PayParam payParam, final i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, payParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d38e3a9f8a6b02baf59728ef65ca2295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d38e3a9f8a6b02baf59728ef65ca2295");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.mmp.apis.MedicinePayImpl.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46063f2709e18751688f325c5a91a323", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46063f2709e18751688f325c5a91a323");
                        return;
                    }
                    IPaymentManager iPaymentManager = (IPaymentManager) com.sankuai.waimai.router.a.a(IPaymentManager.class, IPaymentManager.KEY);
                    if (iPaymentManager != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Constants.EventConstants.KEY_ORDER_ID, payParam.orderId);
                        hashMap.put("payCode", "2");
                        hashMap.put("selfPay", "0");
                        hashMap.put("tag", MedicinePayImpl.a());
                        hashMap.put("cid", "c_waimai_m5pcse9e");
                        iPaymentManager.startOrderPay(msiCustomContext.getActivity(), hashMap, new b.AbstractC1042b<BaseResponse<d>>() { // from class: com.sankuai.waimai.store.drug.mmp.apis.MedicinePayImpl.1.1
                            public static ChangeQuickRedirect a;

                            @Override // rx.e
                            public final /* synthetic */ void onNext(Object obj) {
                                BaseResponse baseResponse = (BaseResponse) obj;
                                Object[] objArr3 = {baseResponse};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef87415abf1fe9cfc1209a0d86df35a8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef87415abf1fe9cfc1209a0d86df35a8");
                                } else if (baseResponse != null) {
                                    if (baseResponse.code == 0 && baseResponse.data != 0) {
                                        String str = ((d) baseResponse.data).c;
                                        String str2 = ((d) baseResponse.data).g;
                                        String str3 = ((d) baseResponse.data).b;
                                        if (((d) baseResponse.data).j == 0) {
                                            MedicinePayImpl.b(msiCustomContext.getActivity(), str, str2);
                                            return;
                                        } else {
                                            MedicinePayImpl.a(MedicinePayImpl.this, msiCustomContext.getActivity(), str3, r.a(payParam.poiId, 0L), str3);
                                            return;
                                        }
                                    }
                                    iVar.a(baseResponse.code + TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS, baseResponse.msg);
                                } else {
                                    iVar.a(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE, "请求失败");
                                }
                            }

                            @Override // rx.e
                            public final void onError(Throwable th) {
                                Object[] objArr3 = {th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d4c072432c8fcd044e6b38df96551ae", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d4c072432c8fcd044e6b38df96551ae");
                                } else if (TextUtils.equals(th.getMessage(), IPaymentManager.NO_ACTION)) {
                                } else {
                                    iVar.a(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE, "请求失败");
                                }
                            }
                        });
                    }
                }
            }, "");
        }
    }

    public static /* synthetic */ void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1d3974ba5c36707d3d43ceaa1dde5c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1d3974ba5c36707d3d43ceaa1dde5c6");
            return;
        }
        if (aa.a(str2)) {
            Object[] objArr2 = {activity, str};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ffe0268440227191d55d485939e6ed6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ffe0268440227191d55d485939e6ed6f");
            } else {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("hash_id", str);
                    bundle.putBoolean("first_time_visist", true);
                    bundle.putBoolean("is_sc_orderlist", true);
                    bundle.putBoolean("from_pay_to_order_detail", true);
                    com.sankuai.waimai.store.router.d.b(activity, c.l, bundle, 113);
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        } else {
            com.sankuai.waimai.foundation.router.a.a(activity, str2);
        }
        com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
    }
}
