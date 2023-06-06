package com.meituan.android.paycommon.lib.webview.jshandler;

import android.content.Intent;
import android.support.annotation.Nullable;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OpenHalfPageJsHandler extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String NAME = "pay.openHalfPage";
    public static ChangeQuickRedirect changeQuickRedirect;

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
        return "up6g2wesqm8qXYXAbZK+RhwVZrrViKU5MLbTfFMtlbLvZAYmcHYOYWIE9yF7ZoSOjT0eH3inMY3+QmOV5lg9ag==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d18bf770f92d10bd825d55aa96328a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d18bf770f92d10bd825d55aa96328a");
            return;
        }
        super.exec();
        try {
            JSONObject jSONObject = new JSONObject(jsBean().argsJson.optString("data"));
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("initial_data");
            String optString3 = jSONObject.optString("target_scene");
            String optString4 = jSONObject.optString("background_color");
            String optString5 = jSONObject.optString("outer_business_params");
            if (jsHost() == null || jsHost().getActivity() == null) {
                return;
            }
            HalfPageFragment.a aVar = new HalfPageFragment.a(optString3, optString, optString2, 406);
            aVar.f = optString4;
            aVar.j = optString5;
            HalfPageFragment.a(jsHost().getActivity(), aVar);
        } catch (Exception unused) {
            loadFail();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadFail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad3aaf68f7a42c40bb18b01ee321385a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad3aaf68f7a42c40bb18b01ee321385a");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void success(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d30ed7a8d58efeb299a19c70e0f0319f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d30ed7a8d58efeb299a19c70e0f0319f");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "success");
            jSONObject.put("result", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a6a104ccb2ff09af21c8eafe084f033", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a6a104ccb2ff09af21c8eafe084f033") : getClass();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea133043d8a5be4612e20e411cfe450e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea133043d8a5be4612e20e411cfe450e");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 406) {
            HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.paycommon.lib.webview.jshandler.OpenHalfPageJsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(int i3, String str) {
                    Object[] objArr2 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c52809da2a4e01ca8329d88b92017267", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c52809da2a4e01ca8329d88b92017267");
                    } else {
                        OpenHalfPageJsHandler.this.loadFail();
                    }
                }

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(@Nullable String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4b70ac9fa339e2f8fb2864e3801268cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4b70ac9fa339e2f8fb2864e3801268cd");
                    } else {
                        OpenHalfPageJsHandler.this.success(str);
                    }
                }
            });
        }
    }
}
