package com.sankuai.waimai.mmp.modules.api;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.msi.addapter.payment.IMtRequestPayment;
import com.meituan.msi.addapter.payment.MtRequestPaymentParam;
import com.meituan.msi.addapter.payment.a;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.msi.util.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmMSCPayment extends IMtRequestPayment {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.payment.IMtRequestPayment
    public final void a(MsiCustomContext msiCustomContext, MtRequestPaymentParam mtRequestPaymentParam, final i<a> iVar) {
        Object[] objArr = {msiCustomContext, mtRequestPaymentParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71a5da1b06edb6e63735bee00e2feadc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71a5da1b06edb6e63735bee00e2feadc");
            return;
        }
        Uri.Builder buildUpon = Uri.parse("meituanpayment://cashier/launch").buildUpon();
        buildUpon.appendQueryParameter("trade_number", mtRequestPaymentParam.tradeno);
        buildUpon.appendQueryParameter("pay_token", mtRequestPaymentParam.payToken);
        buildUpon.appendQueryParameter("cashier_type", mtRequestPaymentParam.cashier_type);
        if (!TextUtils.isEmpty(mtRequestPaymentParam.merchant_no)) {
            buildUpon.appendQueryParameter("merchant_no", mtRequestPaymentParam.merchant_no);
        }
        if (TextUtils.isEmpty(a(mtRequestPaymentParam.extra_data))) {
            mtRequestPaymentParam.extra_data = String.format("tradeNo=%s, payToken=%s", mtRequestPaymentParam.tradeno, mtRequestPaymentParam.payToken);
        }
        buildUpon.appendQueryParameter("extra_data", a(mtRequestPaymentParam.extra_data));
        String a = a(mtRequestPaymentParam.extra_statics);
        if (!TextUtils.isEmpty(a)) {
            buildUpon.appendQueryParameter("extra_statics", a);
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        List a2 = b.a(com.meituan.msi.addapter.mtinterface.a.class, (String) null);
        if (a2 != null && a2.size() > 0) {
            intent = ((com.meituan.msi.addapter.mtinterface.a) a2.get(0)).a(msiCustomContext.getContainerInfo().name, intent, msiCustomContext.getActivity());
        } else {
            intent.setClass(com.meituan.msi.a.f(), MTCashierActivity.class);
        }
        intent.setData(buildUpon.build());
        intent.addFlags(603979776);
        intent.setPackage(com.meituan.msi.a.f().getPackageName());
        msiCustomContext.startActivityForResult(intent, new com.meituan.msi.context.b() { // from class: com.sankuai.waimai.mmp.modules.api.WmMSCPayment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.context.b
            public final void onActivityResult(int i, Intent intent2) {
                Object[] objArr2 = {Integer.valueOf(i), intent2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cba367b5de08d85d2d949c0b05c7567", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cba367b5de08d85d2d949c0b05c7567");
                } else if (i == 0) {
                    iVar.a(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE, "cancel");
                } else if (intent2 == null) {
                    iVar.a(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS, "data is null");
                } else {
                    a aVar = new a();
                    aVar.a = f.a(intent2, "result", -1);
                    aVar.b = f.a(intent2, "extra_data");
                    com.sankuai.waimai.foundation.utils.log.a.b("wm_msc_payment", String.format("[payResult] status = %s, extraData = %s", Integer.valueOf(aVar.a), aVar.b), new Object[0]);
                    if (aVar.a == 1) {
                        iVar.a(aVar);
                    } else {
                        iVar.a(aVar.a, aVar.b);
                    }
                }
            }

            @Override // com.meituan.msi.context.b
            public final void onFail(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b7687abf92e6163cdf393849a90d1d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b7687abf92e6163cdf393849a90d1d6");
                } else {
                    iVar.a(i, str);
                }
            }
        });
    }

    private String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7cc843d01e9a1755529694d0aaac41e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7cc843d01e9a1755529694d0aaac41e");
        }
        if (obj == null) {
            return null;
        }
        try {
            return new Gson().toJson(obj);
        } catch (Exception e) {
            com.meituan.msi.log.a.a(ae.a("mtRequestPayment", e));
            return obj.toString();
        }
    }
}
