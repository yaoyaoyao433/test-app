package com.sankuai.titans.jsbridges.base.uiextensions;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RemoveTitleBarElementJsHandler extends DeprecatedJsBridge<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Void r11) {
        Object[] objArr = {r11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23a150d28ef34ebf00abf2b1fd580696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23a150d28ef34ebf00abf2b1fd580696");
            return;
        }
        try {
            String optString = this.argsJson.optString("name");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("no name");
            } else {
                jsHost().getUiManager().removeDynamicTitleBarElement(optString, new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.RemoveTitleBarElementJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a076321f1376c92dc039457062b0596", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a076321f1376c92dc039457062b0596");
                        } else {
                            RemoveTitleBarElementJsHandler.this.jsCallback(new RespResult.Builder().create());
                        }
                    }

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onFail(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5b0cfc870af55ae16c0db40b132451df", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5b0cfc870af55ae16c0db40b132451df");
                        } else {
                            RemoveTitleBarElementJsHandler.this.jsCallbackErrorMsg(str);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ffb0bd696d4c5d07e2bfc5569af5f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ffb0bd696d4c5d07e2bfc5569af5f07");
        } else {
            jsCallback(new RespResult.Builder().setStatus("fail").setMsg(str).create());
        }
    }
}
