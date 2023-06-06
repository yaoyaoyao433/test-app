package com.sankuai.titans.jsbridges.base.uiextensions;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetTitleBarActionJsHandler extends DeprecatedJsBridge<SetTitleBarAction> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SetTitleBarAction {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("action")
        @Expose
        public String action;
        @SerializedName("name")
        @Expose
        public String name;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(SetTitleBarAction setTitleBarAction) {
        Object[] objArr = {setTitleBarAction};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3e49a47816609d6fd84bb06f27501df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3e49a47816609d6fd84bb06f27501df");
            return;
        }
        if (TextUtils.isEmpty(setTitleBarAction.name) || TextUtils.isEmpty(setTitleBarAction.action)) {
            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid).create());
        }
        jsHost().getUiManager().setDynamicTitleBarElementAction(setTitleBarAction.name, setTitleBarAction.action, new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetTitleBarActionJsHandler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
            public void onSuccess() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "81e6f934ecfeed5dde1f9125e0f84e3f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "81e6f934ecfeed5dde1f9125e0f84e3f");
                } else {
                    SetTitleBarActionJsHandler.this.jsCallback(new RespResult.Builder().create());
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
            public void onFail(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c513ea9d52687c4570363139495d17f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c513ea9d52687c4570363139495d17f5");
                } else {
                    SetTitleBarActionJsHandler.this.jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_5_ContextError.code(), str).create());
                }
            }
        });
    }
}
