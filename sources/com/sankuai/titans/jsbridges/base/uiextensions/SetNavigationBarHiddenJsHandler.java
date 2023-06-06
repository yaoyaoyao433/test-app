package com.sankuai.titans.jsbridges.base.uiextensions;

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
public class SetNavigationBarHiddenJsHandler extends DeprecatedJsBridge<SetNavigationBarHidden> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SetNavigationBarHidden {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("flag")
        @Expose
        public int flag = -1;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(SetNavigationBarHidden setNavigationBarHidden) {
        Object[] objArr = {setNavigationBarHidden};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f67215b031d7c532f691185feb99301e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f67215b031d7c532f691185feb99301e");
        } else if (setNavigationBarHidden == null || (setNavigationBarHidden.flag != 1 && setNavigationBarHidden.flag != 0)) {
            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code(), "UNIMPLEMENTED PARAMETERS").create());
        } else {
            jsHost().getUiManager().setNavigationBarHidden(setNavigationBarHidden.flag != 1, new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetNavigationBarHiddenJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f3917a2fb1e4b57052a86f081f351b8a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f3917a2fb1e4b57052a86f081f351b8a");
                    } else {
                        SetNavigationBarHiddenJsHandler.this.jsCallback(new RespResult.Builder().create());
                    }
                }

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onFail(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ce5f3a970c049f2acfbc3c1c57b80b82", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ce5f3a970c049f2acfbc3c1c57b80b82");
                    } else {
                        SetNavigationBarHiddenJsHandler.this.jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_5_ContextError.code(), str).create());
                    }
                }
            });
        }
    }
}
