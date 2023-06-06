package com.meituan.android.paymentchannel.bridge;

import android.app.Activity;
import android.content.IntentFilter;
import android.support.constraint.R;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.analyse.cat.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.android.paymentchannel.WXEntryMediator;
import com.meituan.android.paymentchannel.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.utils.ILog;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OpenWeixinScorePay extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String ACTION = "paybiz_pay_open_weixinScorePay";
    public static ChangeQuickRedirect changeQuickRedirect;
    private IWXAPI wxApi;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.openWeixinScorePay";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "APwByAHL8300D3NGxRXBD5OUdX0k4pCTmZCVfKmP2DtYb7OJ5+W/K/jupcf+p1ZfgFyjEkQFgyq0DhLaJWHwtA==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c13dae801b631f9ffbe22f625013450", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c13dae801b631f9ffbe22f625013450");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null && jsBean() != null && jsBean().argsJson != null) {
            String optString = jsBean().argsJson.optString("businessType");
            String optString2 = jsBean().argsJson.optString(SearchIntents.EXTRA_QUERY);
            String optString3 = jsBean().argsJson.optString("extInfo");
            this.wxApi = d.a(jsHost().getContext());
            if (!this.wxApi.isWXAppInstalled()) {
                jsCallbackPayError(activity.getString(R.string.paymentchannel__wechat__not_installed), 11);
                tech("微信未安装");
                a.a(ACTION, -9753);
                return;
            } else if (this.wxApi.getWXAppSupportAPI() >= 620889344) {
                WXOpenBusinessView.Req req = new WXOpenBusinessView.Req();
                req.businessType = optString;
                req.query = optString2;
                req.extInfo = optString3;
                this.wxApi.setLogImpl(new ILog() { // from class: com.meituan.android.paymentchannel.bridge.OpenWeixinScorePay.1
                    public static ChangeQuickRedirect a;

                    @Override // com.tencent.mm.opensdk.utils.ILog
                    public final void v(String str, String str2) {
                        Object[] objArr2 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "23e3872bbd608b88e2aaf38196e659f3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "23e3872bbd608b88e2aaf38196e659f3");
                        } else {
                            OpenWeixinScorePay.this.techMisWeixinLog("v", str2);
                        }
                    }

                    @Override // com.tencent.mm.opensdk.utils.ILog
                    public final void d(String str, String str2) {
                        Object[] objArr2 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60583b0e497df25ebf9e71541e0921c9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60583b0e497df25ebf9e71541e0921c9");
                        } else {
                            OpenWeixinScorePay.this.techMisWeixinLog("d", str2);
                        }
                    }

                    @Override // com.tencent.mm.opensdk.utils.ILog
                    public final void i(String str, String str2) {
                        Object[] objArr2 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "79d23c69319075c8d36269bf6f496ede", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "79d23c69319075c8d36269bf6f496ede");
                        } else {
                            OpenWeixinScorePay.this.techMisWeixinLog("i", str2);
                        }
                    }

                    @Override // com.tencent.mm.opensdk.utils.ILog
                    public final void w(String str, String str2) {
                        Object[] objArr2 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a049fff89a44098ae3bef8903a7fa8d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a049fff89a44098ae3bef8903a7fa8d");
                        } else {
                            OpenWeixinScorePay.this.techMisWeixinLog("w", str2);
                        }
                    }

                    @Override // com.tencent.mm.opensdk.utils.ILog
                    public final void e(String str, String str2) {
                        Object[] objArr2 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "95bea709c4f3c79e762d38d252c73a3f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "95bea709c4f3c79e762d38d252c73a3f");
                        } else {
                            OpenWeixinScorePay.this.techMisWeixinLog("e", str2);
                        }
                    }
                });
                this.wxApi.sendReq(req);
                tech("发起微信签约");
                WXEntryMediator.a().b = new WXEntryMediator.a() { // from class: com.meituan.android.paymentchannel.bridge.OpenWeixinScorePay.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paymentchannel.WXEntryMediator.a
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "41246bb065f54e3846693c7a00c6cd42", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "41246bb065f54e3846693c7a00c6cd42");
                        } else if (i == 0) {
                            OpenWeixinScorePay.this.jsCallback();
                            a.a(OpenWeixinScorePay.ACTION, 200);
                        } else if (i == -2) {
                            OpenWeixinScorePay.this.jsCallbackPayError("", 12);
                            a.a(OpenWeixinScorePay.ACTION, -9854);
                        } else {
                            a.a(OpenWeixinScorePay.ACTION, -9753);
                            OpenWeixinScorePay.this.jsCallbackPayError("微信签约异常", 11);
                        }
                    }
                };
                WXEntryMediator a = WXEntryMediator.a();
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = WXEntryMediator.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "b967b1e25df49a0aa7c47af47a56a8a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "b967b1e25df49a0aa7c47af47a56a8a7");
                    return;
                } else if (a.d == null) {
                    a.c = activity;
                    a.d = new WXEntryMediator.WXEntryResultBroadcast(a.b);
                    a.c.registerReceiver(a.d, new IntentFilter("com.meituan.android.paymentchannel.ACTION_WEIXIN_SCORE_PAY"));
                    return;
                } else {
                    return;
                }
            } else {
                a.a(ACTION, -9753);
                jsCallbackPayError(activity.getString(R.string.paymentchannel__wechat__not_supported), 11);
                tech("微信版本过低");
                return;
            }
        }
        a.a(ACTION, -9753);
        jsCallbackPayError("发生异常请稍后重试", 11);
        tech("桥发生异常");
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b83ccf52a436256f2df15cbef64cb3dd", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b83ccf52a436256f2df15cbef64cb3dd") : getClass();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a57b59b78b18ad4627dc53180b9eac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a57b59b78b18ad4627dc53180b9eac7");
            return;
        }
        super.onDestroy();
        WXEntryMediator a = WXEntryMediator.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = WXEntryMediator.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "6c0f76fcbc4ddc25d4bf9732c1a1b5bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "6c0f76fcbc4ddc25d4bf9732c1a1b5bf");
        } else {
            if (a.c != null) {
                if (a.d != null) {
                    a.c.unregisterReceiver(a.d);
                    a.d = null;
                }
                a.c = null;
            }
            if (a.b != null) {
                a.b = null;
            }
        }
        if (this.mJsHost != null) {
            this.mJsHost = null;
        }
        if (this.wxApi != null) {
            this.wxApi.setLogImpl(null);
            this.wxApi = null;
        }
        tech("退出当前web页面");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void techMisWeixinLog(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4a9f05d8c7c277bf65b6fc5823fd15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4a9f05d8c7c277bf65b6fc5823fd15b");
        } else {
            ae.a("b_pay_t60qfqqr_mc", new a.c().a("tag", str).a(SnifferDBHelper.COLUMN_LOG, str2).b, "com.meituan.android.paymentchannel");
        }
    }

    private void tech(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaa81f05c69e810e093a8a17b272bcd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaa81f05c69e810e093a8a17b272bcd1");
        } else {
            techMisWeixinLog("payment-channel", str);
        }
    }
}
