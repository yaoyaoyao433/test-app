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
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetBackgroundColorJsHandler extends DeprecatedJsBridge<SetBackgroundColor> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SetBackgroundColor {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("color")
        @Expose
        public String color;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(SetBackgroundColor setBackgroundColor) {
        Object[] objArr = {setBackgroundColor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "606629da8b86b847e95f4ba1478cc658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "606629da8b86b847e95f4ba1478cc658");
        } else if (setBackgroundColor == null || TextUtils.isEmpty(setBackgroundColor.color)) {
            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid).create());
        } else {
            AbsJsHost jsHost = jsHost();
            if (jsHost.getUiManager() == null) {
                jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_5_ContextError.code(), "ui manager is null").create());
            } else {
                jsHost.getUiManager().setBackGroundColor(setBackgroundColor.color, new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetBackgroundColorJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0d8a1602332ce796fccaf770526c1f0d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0d8a1602332ce796fccaf770526c1f0d");
                        } else {
                            SetBackgroundColorJsHandler.this.jsCallback(new RespResult.Builder().create());
                        }
                    }

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onFail(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "06e04b9019988dbd69485aa8f8fbdccc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "06e04b9019988dbd69485aa8f8fbdccc");
                        } else {
                            SetBackgroundColorJsHandler.this.jsCallback(new RespResult.Builder().setResultInfo(i, str).create());
                        }
                    }
                });
            }
        }
    }
}
