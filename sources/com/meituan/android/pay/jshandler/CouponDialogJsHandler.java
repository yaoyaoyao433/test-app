package com.meituan.android.pay.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.utils.i;
import com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CouponDialogJsHandler extends PayBaseJSHandler implements FinanceJsHandler, a {
    private static final int CAT_PARAMS_ERROR = 9001;
    private static final String NAME = "pay.showCouponDialog";
    private static final String PAYBIZ_CALL_COUPON_DIALOG_BY_H5 = "paybiz_call_coupon_dialog_by_h5";
    public static final int REQUST_CODE_CALL_COUPON_DIALOG = 406;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String tradeNo;
    private String transId;

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler
    public String getBridgeName() {
        return NAME;
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return NAME;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "U6q4gwopgacnLr9AZxvc1RHSo10hUseH2nB7nn347ausLDLX+jIpuXYyp6OVrJUxFtS9ndNvYe5X3ogTcJMVWQ==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4a21841a8450e51680c3c96664911f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4a21841a8450e51680c3c96664911f3");
            return;
        }
        super.exec();
        if (jsBean() != null && jsBean().argsJson != null && jsHost() != null && jsHost().getActivity() != null) {
            Activity activity = jsHost().getActivity();
            String optString = jsBean().argsJson.optString(ICashierJSHandler.KEY_PROMOTION);
            this.tradeNo = jsBean().argsJson.optString("tradeNo");
            this.transId = jsBean().argsJson.optString("transId");
            if (activity instanceof FragmentActivity) {
                showDialog((FragmentActivity) activity, optString, this.tradeNo, this.transId);
            } else {
                jsCallbackPayResult(false);
            }
        } else {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_kfrziyu1_mv", getAnalyseMap());
            jsCallbackPayError();
            com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_COUPON_DIALOG_BY_H5, 9001);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_fz6ywz4m_mv", getAnalyseMap());
    }

    public void showDialog(FragmentActivity fragmentActivity, String str, String str2, String str3) {
        Promotion promotion;
        Object[] objArr = {fragmentActivity, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a2a8d5f739a45072ea7c6ce54e93ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a2a8d5f739a45072ea7c6ce54e93ad7");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_vubbl9gr_mc", getAnalyseMap());
        try {
            promotion = (Promotion) n.a().fromJson(str, (Class<Object>) Promotion.class);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e);
            promotion = null;
        }
        if (promotion != null) {
            if (promotion.getDynamicLayout() != null) {
                try {
                    fragmentActivity.getClass().getMethod("setConfirmCallBack", Object.class).invoke(fragmentActivity, this);
                } catch (Exception e2) {
                    com.meituan.android.paybase.common.analyse.a.a(e2, "CouponDialogJsHandler_showDialog", (Map<String, Object>) null);
                }
                setDialogClickable(true);
                if (i.a(promotion)) {
                    i.a(fragmentActivity, promotion, str3, 100);
                    return;
                } else {
                    PaymentDialogFragment.a(fragmentActivity, promotion.getDynamicLayout(), str2, null, promotion.getHybridUrl(), promotion.getHybridLoadingTime(), this);
                    return;
                }
            }
            com.meituan.android.paybase.common.analyse.a.a("b_pay_a3p60fsa_sc", new a.c().a("location", "hybrid_cashier").b);
        }
        jsCallbackPayResult(false);
    }

    private void jsCallbackPayResult(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f2da2a50a977234f70cc76de6bf70a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f2da2a50a977234f70cc76de6bf70a4");
            return;
        }
        jsCallback();
        if (z) {
            com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_COUPON_DIALOG_BY_H5, 200);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_rn0xexzu_mv", getAnalyseMap());
            return;
        }
        com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_COUPON_DIALOG_BY_H5, -9753);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_nv6yqup9_mv", getAnalyseMap());
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49a9170785b69a0a3469cd86e0f625e6", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49a9170785b69a0a3469cd86e0f625e6") : getClass();
    }

    private HashMap<String, Object> getAnalyseMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9316b6c92eee53bb2ed6e866e4c52522", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9316b6c92eee53bb2ed6e866e4c52522") : new a.c().a("tradeno", this.tradeNo).a("transId", this.transId).b;
    }

    @Override // com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a
    public void onClickCouponDialogConfirm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef5010dd92d3176590cbd1f14114c09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef5010dd92d3176590cbd1f14114c09d");
            return;
        }
        jsCallbackPayResult(true);
        setDialogClickable(false);
    }

    @Override // com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a
    public void showProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cfb50459e7a32e0ce4f7589d21c0b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cfb50459e7a32e0ce4f7589d21c0b4d");
        } else if (jsHost() != null) {
            Activity activity = jsHost().getActivity();
            if (activity instanceof PayBaseActivity) {
                ((PayBaseActivity) activity).showProgress();
            }
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01227b230164f7b245304dfec726b985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01227b230164f7b245304dfec726b985");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            i.a(i2, intent);
            onClickCouponDialogConfirm();
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a
    public void hideProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d673ca9691ebece64fc8d9c8ab8eb9c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d673ca9691ebece64fc8d9c8ab8eb9c3");
        } else if (jsHost() != null) {
            Activity activity = jsHost().getActivity();
            if (activity instanceof PayBaseActivity) {
                ((PayBaseActivity) activity).hideProgress();
            }
        }
    }

    private void setDialogClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "801c67cf314c45d8021dc077adf21bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "801c67cf314c45d8021dc077adf21bb8");
            return;
        }
        try {
            jsHost().getActivity().findViewById(R.id.content).setClickable(z);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e);
        }
    }
}
