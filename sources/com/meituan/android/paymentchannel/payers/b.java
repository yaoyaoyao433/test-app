package com.meituan.android.paymentchannel.payers;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.app.PayTask;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements Payer {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.moduleinterface.payment.Payer
    @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
    public final void a(final Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f7cb54e030ca67df17b2b79d828801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f7cb54e030ca67df17b2b79d828801");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), c.a(activity, str, new Handler() { // from class: com.meituan.android.paymentchannel.payers.b.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b13f5a9c0813c7243a84bebe0c01569", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b13f5a9c0813c7243a84bebe0c01569");
                    } else if (message.what != 1) {
                    } else {
                        if (message.obj instanceof HashMap) {
                            HashMap hashMap = (HashMap) message.obj;
                            String str3 = (String) hashMap.get("resultStatus");
                            String str4 = (String) hashMap.get("memo");
                            if ("9000".equals(str3)) {
                                com.meituan.android.paybase.common.analyse.a.a("b_MSWZu", new a.b().a().b);
                                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay", 200);
                                com.meituan.android.paymentchannel.b.a().a(activity, "alipaysimple", 1, (PayFailInfo) null);
                                return;
                            } else if ("6001".equals(str3)) {
                                com.meituan.android.paybase.common.analyse.a.a("b_viL6c", new a.b().a().a("code", str3).a("message", str4).b);
                                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay", -9854);
                                com.meituan.android.paymentchannel.b.a().a(activity, "alipaysimple", -1, (PayFailInfo) null);
                                return;
                            } else {
                                com.meituan.android.paybase.common.analyse.a.a("b_sHzOt", new a.b().a().a("code", str3).a("message", str4).b);
                                int i = -9753;
                                try {
                                    i = Integer.parseInt(str3);
                                } catch (Exception e) {
                                    com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "AlipayMiniPayer_handleMessage").a("message", e.getMessage()).b);
                                }
                                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay", i);
                                PayFailInfo payFailInfo = new PayFailInfo();
                                payFailInfo.setMsg(str4);
                                payFailInfo.setErrorCodeString(str3);
                                com.meituan.android.paymentchannel.b.a().a(activity, "alipaysimple", 0, payFailInfo);
                                return;
                            }
                        }
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_tdbv4e6u_mv", new a.c().a(CommonConstant.File.CLASS, message.obj == null ? "obj_is_null" : message.obj.getClass().getName()).b);
                    }
                }
            }));
        }
    }

    public static /* synthetic */ void a(Activity activity, String str, Handler handler) {
        Object[] objArr = {activity, str, handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "958dcf007d192e9b92a6722c5650ab09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "958dcf007d192e9b92a6722c5650ab09");
            return;
        }
        try {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_wwcbahko_mv", new a.c().a(KnbConstants.PARAMS_SCENE, "AlipayMiniPayer_payRunnable").b);
            Map<String, String> payV2 = new PayTask(activity).payV2(str, false);
            Message message = new Message();
            message.what = 1;
            message.obj = payV2;
            handler.sendMessage(message);
            com.meituan.android.paybase.common.analyse.a.a("b_FWlyq", new a.b().a().b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_alipay", 200);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "AlipayMiniPayer_execute").a("message", e.getMessage()).b);
            com.meituan.android.paybase.common.analyse.a.b("b_xfa7C", new a.b().a().a("message", e.getMessage()).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_alipay", -9753);
        }
    }
}
