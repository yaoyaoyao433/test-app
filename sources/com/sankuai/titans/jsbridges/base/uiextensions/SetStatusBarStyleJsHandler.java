package com.sankuai.titans.jsbridges.base.uiextensions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetStatusBarStyleJsHandler extends DeprecatedJsBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ef6a4cd5d08be0b037adb29e147fc68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ef6a4cd5d08be0b037adb29e147fc68");
            return;
        }
        try {
            jsHost().getUiManager().setStatusBarStyle(jsHost().getActivity().getWindow(), this.argsJson.optInt("style", -1), this.argsJson.optString("backgroundColor"), new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetStatusBarStyleJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d97215c0f5ed92d54eb3cb6518fdf50c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d97215c0f5ed92d54eb3cb6518fdf50c");
                    } else {
                        SetStatusBarStyleJsHandler.this.jsCallback(new RespResult.Builder().create());
                    }
                }

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onFail(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "09771ecd07be79398d1d402ba36dd8b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "09771ecd07be79398d1d402ba36dd8b3");
                    } else {
                        SetStatusBarStyleJsHandler.this.jsCallback(new RespResult.Builder().setResultInfo(i, str).create());
                    }
                }
            });
        } catch (Exception e) {
            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_UNKNOWN.code(), e.getMessage()).create());
        }
    }
}
