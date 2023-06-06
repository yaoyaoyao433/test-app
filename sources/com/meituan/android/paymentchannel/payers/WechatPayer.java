package com.meituan.android.paymentchannel.payers;

import android.app.Activity;
import android.support.constraint.R;
import com.google.gson.annotations.SerializedName;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class WechatPayer implements Payer {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @JsonBean
    /* loaded from: classes3.dex */
    public static class WechatPay implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 3074910658752802865L;
        public String appid;
        public String noncestr;
        @SerializedName("package")
        public String packageValue;
        public String partnerid;
        public String prepayid;
        public String sign;
        public String timestamp;
    }

    public static /* synthetic */ void a(WechatPayer wechatPayer, Activity activity, IWXAPI iwxapi, PayReq payReq) {
        Object[] objArr = {activity, iwxapi, payReq};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, wechatPayer, changeQuickRedirect, false, "67ee00d366f089a8af8e67bef264935b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wechatPayer, changeQuickRedirect, false, "67ee00d366f089a8af8e67bef264935b");
            return;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, wechatPayer, changeQuickRedirect2, false, "3ad28577f50f222f001835a574d19fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, wechatPayer, changeQuickRedirect2, false, "3ad28577f50f222f001835a574d19fd5");
        } else if ((activity instanceof com.meituan.android.paybase.moduleinterface.payment.a) && !activity.isFinishing()) {
            ((com.meituan.android.paybase.moduleinterface.payment.a) activity).x_();
        }
        if (iwxapi.sendReq(payReq)) {
            com.meituan.android.paybase.common.analyse.a.a("b_L3y6M", new a.b().a().b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_weixin", 200);
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_z695A", new a.b().a().a("default", "sendReq_return_false").a("message", "微信调起返回fasle").b);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_weixin", 1140014);
        wechatPayer.a(activity, "send req fail");
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.Payer
    public final void a(final Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db290d1edae8d4d29739ea1959b36cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db290d1edae8d4d29739ea1959b36cde");
            return;
        }
        final IWXAPI a2 = com.meituan.android.paymentchannel.utils.d.a(activity.getApplicationContext());
        final PayReq a3 = a(str, str2);
        if (a3 != null && a2 != null) {
            Object[] objArr2 = {a2, activity, a3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c4180b91af7042e9691c31c958b185f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c4180b91af7042e9691c31c958b185f");
                return;
            } else if (a2.isWXAppInstalled()) {
                if (activity != null) {
                    new com.meituan.android.paybase.asynctask.a<Void, Void, Boolean>() { // from class: com.meituan.android.paymentchannel.payers.WechatPayer.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.paybase.asynctask.b
                        public final /* synthetic */ void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            Object[] objArr3 = {bool};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae093bc143975cbc17a319f546cb9a90", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae093bc143975cbc17a319f546cb9a90");
                            } else if (bool.booleanValue()) {
                                com.meituan.android.paybase.dialog.e.a(activity, (Object) activity.getString(R.string.paymentchannel__wechat__not_supported));
                                com.meituan.android.paybase.common.analyse.a.a("b_z695A", new a.b().a().a("default", "weixin_low_version").a("message", "微信版本过低").b);
                                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_weixin", 1140013);
                                WechatPayer.this.a(activity, "微信版本过低");
                            } else {
                                WechatPayer.a(WechatPayer.this, activity, a2, a3);
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.meituan.android.paybase.asynctask.b
                        public Boolean a(Void... voidArr) {
                            boolean z = true;
                            Object[] objArr3 = {voidArr};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e2a2e9bea6696f380eaf0cc49e24a33", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e2a2e9bea6696f380eaf0cc49e24a33");
                            }
                            try {
                                if (a2.getWXAppSupportAPI() >= 570425345) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            } catch (Exception e) {
                                com.meituan.android.paybase.common.analyse.a.a(e, "WechatPayer_checkWechatPay", (Map<String, Object>) null);
                                return Boolean.FALSE;
                            }
                        }
                    }.b(new Void[0]);
                    return;
                }
                return;
            } else {
                if (activity != null) {
                    com.meituan.android.paybase.dialog.e.a(activity, (Object) activity.getString(R.string.paymentchannel__wechat__not_installed));
                    com.meituan.android.paybase.common.analyse.a.a("b_z695A", new a.b().a().a("default", "uninstall_weixin").a("message", "设备未安装微信").b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_weixin", 1140012);
                }
                a(activity, "未安装微信");
                return;
            }
        }
        String str3 = "";
        if (a3 == null) {
            str3 = "PayApi_";
        }
        if (a2 == null) {
            str3 = str3 + "wxApi_";
        }
        com.meituan.android.paybase.common.analyse.a.a("b_z695A", new a.b().a().a("default", str3 + StringUtil.NULL).a("message", "调用参数错误").b);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_weixin", 1140011);
        a(activity, "req is null");
    }

    private PayReq a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249ead342f75b0dc008f30964b876857", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayReq) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249ead342f75b0dc008f30964b876857");
        }
        try {
            WechatPay wechatPay = (WechatPay) n.a().fromJson(str, (Class<Object>) WechatPay.class);
            if (wechatPay != null) {
                PayReq payReq = new PayReq();
                payReq.appId = wechatPay.appid;
                payReq.partnerId = wechatPay.partnerid;
                payReq.prepayId = wechatPay.prepayid;
                payReq.nonceStr = wechatPay.noncestr;
                payReq.timeStamp = wechatPay.timestamp;
                payReq.packageValue = wechatPay.packageValue;
                payReq.sign = wechatPay.sign;
                payReq.extData = String.valueOf(str2);
                payReq.transaction = "meituanpayment";
                return payReq;
            }
            return null;
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "WechatPayer_genWechatPayRequest").a("message", e.getMessage()).b);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d970ddb7ebbb0888a53bf60cd8239e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d970ddb7ebbb0888a53bf60cd8239e4");
            return;
        }
        PayFailInfo payFailInfo = new PayFailInfo();
        payFailInfo.setMsg(str);
        com.meituan.android.paymentchannel.b.a().a(activity, "wxpay", 12, payFailInfo);
    }
}
