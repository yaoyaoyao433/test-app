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
public class AddTitleBarElementJsHandler extends DeprecatedJsBridge<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Void r11) {
        Object[] objArr = {r11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a332d8e4ca32d1894bebf0d526db7282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a332d8e4ca32d1894bebf0d526db7282");
            return;
        }
        try {
            JSONObject jSONObject = this.argsJson;
            String optString = jSONObject.optString("model");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("no model");
                return;
            }
            JSONObject jSONObject2 = new JSONObject(optString);
            if (TextUtils.isEmpty(jSONObject2.optString("name", ""))) {
                jsCallbackErrorMsg("no name");
            } else if (TextUtils.isEmpty(jSONObject2.optString("type"))) {
                jsCallbackErrorMsg("no type");
            } else {
                jsHost().getUiManager().addDynamicTitleBarElement(jSONObject.optString("name", ""), (DynamicTitleBarElementEntity) JsonUtils.getExcludeGson().fromJson(optString, (Class<Object>) DynamicTitleBarElementEntity.class), new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.AddTitleBarElementJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "086c1f22808090beffa7052ebd462660", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "086c1f22808090beffa7052ebd462660");
                        } else {
                            AddTitleBarElementJsHandler.this.jsCallback(new RespResult.Builder().create());
                        }
                    }

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onFail(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "210ec1b8e21b3c4c63ae6d954aeb61fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "210ec1b8e21b3c4c63ae6d954aeb61fa");
                        } else {
                            AddTitleBarElementJsHandler.this.jsCallbackErrorMsg(str);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            jsCallbackErrorMsg(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallbackErrorMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "235e92073e05570d73c487dadfa17ea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "235e92073e05570d73c487dadfa17ea1");
        } else {
            jsCallback(new RespResult.Builder().setStatus("fail").setMsg(str).create());
        }
    }
}
