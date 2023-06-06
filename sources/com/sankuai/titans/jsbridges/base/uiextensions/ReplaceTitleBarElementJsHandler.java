package com.sankuai.titans.jsbridges.base.uiextensions;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.utils.JsonUtils;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ReplaceTitleBarElementJsHandler extends DeprecatedJsBridge<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Void r11) {
        Object[] objArr = {r11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98e82f23afd13af804408a42caa5ba8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98e82f23afd13af804408a42caa5ba8f");
            return;
        }
        try {
            JSONObject jSONObject = this.argsJson;
            String optString = jSONObject.optString("name");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("no name");
                return;
            }
            String optString2 = jSONObject.optString("model");
            if (TextUtils.isEmpty(optString2)) {
                jsCallbackErrorMsg("no model");
            } else if (TextUtils.isEmpty(new JSONObject(optString2).optString("type"))) {
                jsCallbackErrorMsg("no type");
            } else {
                jsHost().getUiManager().replaceDynamicTitleBarElement(optString, (DynamicTitleBarElementEntity) JsonUtils.getExcludeGson().fromJson(optString2, (Class<Object>) DynamicTitleBarElementEntity.class), new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.ReplaceTitleBarElementJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "617f2a9a9471f07d09538503de13677b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "617f2a9a9471f07d09538503de13677b");
                        } else {
                            ReplaceTitleBarElementJsHandler.this.jsCallback();
                        }
                    }

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onFail(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "36814be8cdf310bfa450d0948c82c467", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "36814be8cdf310bfa450d0948c82c467");
                        } else {
                            ReplaceTitleBarElementJsHandler.this.jsCallbackErrorMsg(str);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            jsCallbackErrorMsg(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83e62cd71d5fc55bc56cdba7a75657e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83e62cd71d5fc55bc56cdba7a75657e0");
        } else {
            jsCallback(new RespResult.Builder().create());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallbackErrorMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b851c7994507335f5eea7c8e2e10086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b851c7994507335f5eea7c8e2e10086");
        } else {
            jsCallback(new RespResult.Builder().setStatus("fail").setMsg(str).create());
        }
    }
}
