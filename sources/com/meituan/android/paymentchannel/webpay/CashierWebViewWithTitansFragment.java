package com.meituan.android.paymentchannel.webpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.alipay.sdk.app.H5PayCallback;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.KNBWebViewFragment;
import com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.unionpay.tsmservice.data.Constant;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CashierWebViewWithTitansFragment extends PayBaseWebViewWithTitansFragment implements KNBWebViewFragment {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.moduleinterface.KNBWebViewFragment
    public final PayBaseWebViewWithTitansFragment a() {
        return this;
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda851f3bbe590b0b6d5e3bc9a7746c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda851f3bbe590b0b6d5e3bc9a7746c7");
            return;
        }
        super.onCreate(bundle);
        this.e.getWebSettings().invisibleTitleBar();
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public boolean shouldOverrideUrlLoading(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77363c232fa662e6a1f7a8fdd2c0cb28", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77363c232fa662e6a1f7a8fdd2c0cb28")).booleanValue();
        }
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            a.a("b_pay_xyzb0yc6_mv", new a.c().a(PushConstants.INTENT_ACTIVITY_NAME, StringUtil.NULL).b);
            return false;
        } else if (new PayTask(activity).payInterceptorWithUrl(str, false, new H5PayCallback() { // from class: com.meituan.android.paymentchannel.webpay.CashierWebViewWithTitansFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.alipay.sdk.app.H5PayCallback
            public final void onPayResult(com.alipay.sdk.util.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "125bb5e60b2010688af4afbc5f88b972", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "125bb5e60b2010688af4afbc5f88b972");
                } else if (aVar == null) {
                    CashierWebViewWithTitansFragment.this.a(activity, "");
                    a.a("b_pay_yc6458cc_mv", (Map<String, Object>) null);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay_by_h5", -9753);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(Constant.KEY_RESULT_CODE, aVar.b());
                        jSONObject.put("returnUrl", aVar.a());
                    } catch (JSONException e) {
                        a.a(e, "CashierWebViewWithTitansFragment_shouldOverrideUrlLoading", (Map<String, Object>) null);
                    }
                    CashierWebViewWithTitansFragment.this.a(activity, jSONObject.toString());
                }
            }
        })) {
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_call_alipay_by_h5", 200);
            a.a("b_pay_cos93ujl_mv", new a.c().a("url", str).b);
            return true;
        } else {
            return false;
        }
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onReceivedError(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de6b81eb09ddc83591fdbb9360b08fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de6b81eb09ddc83591fdbb9360b08fc");
            return;
        }
        super.onReceivedError(i, str, str2);
        if (getActivity() != null) {
            a(getActivity(), "");
        }
        a.a("b_pay_ojnx4yee_mv", new a.c().a("errorCode", Integer.valueOf(i)).a("msg", str).a("failingUrl", str2).b);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_call_alipay_by_h5", 1140061);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a659e3f23dbf6a38288c69e7cd00d91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a659e3f23dbf6a38288c69e7cd00d91");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("result", str);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
