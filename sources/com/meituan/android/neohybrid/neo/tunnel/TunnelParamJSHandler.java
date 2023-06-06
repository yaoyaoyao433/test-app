package com.meituan.android.neohybrid.neo.tunnel;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.neohybrid.base.jshandler.HybridBaseJSHandler;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TunnelParamJSHandler extends HybridBaseJSHandler {
    private static final String GET_ALL_BUSINESS_PARAMS = "getAllBusinessParams";
    private static final String GET_ALL_GLOBAL_PARAMS = "getAllGlobalParams";
    private static final String GET_ALL_PARAMS = "getAllParams";
    private static final String GET_SPECIFIC_PARAMS = "getSpecifiedParams";
    private static final String KEYS = "keys";
    public static final String NAME = "neohybrid.useParamTunnel";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler
    public String getName() {
        return NAME;
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.HybridBaseJSHandler, com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler, com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38324ac9b2c40da82df4c96d8e1e0296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38324ac9b2c40da82df4c96d8e1e0296");
            return;
        }
        super.exec();
        try {
            if (jsBean() != null && jsBean().argsJson != null) {
                String optString = jsBean().argsJson.optString("action");
                d.a(getNeoCompat(), "b_pay_1tpd4rr8_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("action", optString).b);
                if (GET_ALL_BUSINESS_PARAMS.equals(optString)) {
                    getAllBusinessParams();
                    return;
                } else if (GET_ALL_GLOBAL_PARAMS.equals(optString)) {
                    getAllGlobalParams();
                    return;
                } else if (GET_SPECIFIC_PARAMS.equals(optString)) {
                    getSpecifiedParams(jsBean().argsJson.optJSONArray(KEYS));
                    return;
                } else if (GET_ALL_PARAMS.equals(optString)) {
                    getAllParams();
                    return;
                } else {
                    callBackError("不存在的action");
                    return;
                }
            }
            callBackError("缺少 action 参数");
            d.a(getNeoCompat(), "b_pay_5ono0j8c_sc", (Map<String, Object>) null);
        } catch (Exception e) {
            b.a(e, "ParamTunnelJSHandler_exec", (Map<String, Object>) null);
            callBackError("异常错误：" + e.getLocalizedMessage());
        }
    }

    private void callBackError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ec34812d4be8a036db1dc8269afb7ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ec34812d4be8a036db1dc8269afb7ad");
            return;
        }
        jsCallbackHybridError(str);
        d.a(getNeoCompat(), "b_pay_q13u4iiv_sc", (Map<String, Object>) null);
    }

    private void getAllParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2da02fcd41a76c1fd367b70ef3172aac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2da02fcd41a76c1fd367b70ef3172aac");
            return;
        }
        jsCallbackHybridSuccess(com.meituan.android.neohybrid.util.gson.b.a().toJson(a.a().b(getNeoCompat())));
        d.a(getNeoCompat(), "b_pay_wzw31ej1_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(KEYS, GET_ALL_PARAMS).b);
    }

    private void getSpecifiedParams(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52081594b86336613a1b05ac3d9eccf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52081594b86336613a1b05ac3d9eccf0");
            return;
        }
        List list = (List) com.meituan.android.neohybrid.util.gson.b.a().fromJson(jSONArray.toString(), new TypeToken<List<String>>() { // from class: com.meituan.android.neohybrid.neo.tunnel.TunnelParamJSHandler.1
        }.getType());
        jsCallbackHybridSuccess(com.meituan.android.neohybrid.util.gson.b.a().toJson(a.a().a(getNeoCompat(), list)));
        d.a(getNeoCompat(), "b_pay_wzw31ej1_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(KEYS, list).b);
    }

    private void getAllGlobalParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9a4138239baa9e28813e35df4ac75cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9a4138239baa9e28813e35df4ac75cd");
            return;
        }
        jsCallbackHybridSuccess(com.meituan.android.neohybrid.util.gson.b.a().toJson(a.a().c()));
        d.a(getNeoCompat(), "b_pay_wzw31ej1_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(KEYS, GET_ALL_GLOBAL_PARAMS).b);
    }

    private void getAllBusinessParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34a96a8d807125374a87237ff7c1d7a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34a96a8d807125374a87237ff7c1d7a7");
            return;
        }
        jsCallbackHybridSuccess(com.meituan.android.neohybrid.util.gson.b.a().toJson(a.a().a(getNeoCompat())));
        d.a(getNeoCompat(), "b_pay_wzw31ej1_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(KEYS, GET_ALL_BUSINESS_PARAMS).b);
    }
}
