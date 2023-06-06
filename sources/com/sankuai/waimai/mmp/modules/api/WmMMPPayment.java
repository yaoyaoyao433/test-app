package com.sankuai.waimai.mmp.modules.api;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.mmp.lib.msi.b;
import com.meituan.mmp.main.e;
import com.meituan.msc.modules.container.router.AppBrandRouterCenter;
import com.meituan.msi.addapter.payment.IMtRequestPayment;
import com.meituan.msi.addapter.payment.MtRequestPaymentParam;
import com.meituan.msi.addapter.payment.a;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.msi.util.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mmp.modules.pay.MPCashierActivity1;
import com.sankuai.waimai.mmp.modules.pay.MPCashierActivity2;
import com.sankuai.waimai.mmp.modules.pay.MPCashierActivity3;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MMP)
/* loaded from: classes5.dex */
public class WmMMPPayment extends IMtRequestPayment implements b {
    public static ChangeQuickRedirect b;
    public e c;

    @Override // com.meituan.msi.addapter.payment.IMtRequestPayment
    public final void a(MsiCustomContext msiCustomContext, MtRequestPaymentParam mtRequestPaymentParam, final i<a> iVar) {
        Object[] objArr = {msiCustomContext, mtRequestPaymentParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0100bd211b87eca0abc48439e411876c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0100bd211b87eca0abc48439e411876c");
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
        if (!TextUtils.isEmpty(mtRequestPaymentParam.callbackUrl)) {
            buildUpon.appendQueryParameter("callback_url", mtRequestPaymentParam.callbackUrl);
        }
        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
        intent.addFlags(603979776);
        intent.setPackage(com.meituan.msi.a.f().getPackageName());
        com.meituan.msc.modules.container.router.a aVar = null;
        if (this.c != null && this.c.a() != null) {
            aVar = AppBrandRouterCenter.a(this.c.a());
        }
        if (aVar != null && aVar != com.meituan.msc.modules.container.router.a.OTHER) {
            switch (aVar) {
                case TASK_1:
                    intent.setClass(com.meituan.msi.a.f(), MPCashierActivity1.class);
                    break;
                case TASK_2:
                    intent.setClass(com.meituan.msi.a.f(), MPCashierActivity2.class);
                    break;
                case TASK_3:
                    intent.setClass(com.meituan.msi.a.f(), MPCashierActivity3.class);
                    break;
            }
        }
        msiCustomContext.startActivityForResult(intent, new com.meituan.msi.context.b() { // from class: com.sankuai.waimai.mmp.modules.api.WmMMPPayment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.context.b
            public final void onActivityResult(int i, Intent intent2) {
                Object[] objArr2 = {Integer.valueOf(i), intent2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b3949915ce61367cc177e6d1055dd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b3949915ce61367cc177e6d1055dd4");
                } else if (i == 0) {
                    iVar.a(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE, "cancel");
                } else if (intent2 == null) {
                    iVar.a(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS, "data is null");
                } else {
                    a aVar2 = new a();
                    aVar2.a = f.a(intent2, "result", -1);
                    aVar2.b = f.a(intent2, "extra_data");
                    com.sankuai.waimai.foundation.utils.log.a.b("wm_mmp_payment", String.format("[payResult] status = %s, extraData = %s", Integer.valueOf(aVar2.a), aVar2.b), new Object[0]);
                    if (aVar2.a == 1) {
                        iVar.a(aVar2);
                    } else {
                        iVar.a(aVar2.a, aVar2.b);
                    }
                }
            }

            @Override // com.meituan.msi.context.b
            public final void onFail(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3ee18386bba184ada4a6ea12b96d137", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3ee18386bba184ada4a6ea12b96d137");
                } else {
                    iVar.a(i, str);
                }
            }
        });
    }

    @Override // com.meituan.mmp.lib.msi.b
    public final void a(e eVar) {
        this.c = eVar;
    }

    private String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4fb15cb1f46916886e074190b8ac5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4fb15cb1f46916886e074190b8ac5a");
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
