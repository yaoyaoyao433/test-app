package com.sankuai.titans.jsbridges.base.uiextensions;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.utils.JsonUtils;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetTitleBarJsHandler extends DeprecatedJsBridge<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Void r11) {
        Object[] objArr = {r11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e877d2cc61efb1f16708e38a2bd1bcfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e877d2cc61efb1f16708e38a2bd1bcfc");
            return;
        }
        try {
            String optString = this.argsJson.optString("model");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("no model");
            } else {
                jsHost().getUiManager().setDynamicTitleBar((DynamicTitleBarEntity) JsonUtils.getExcludeGson().fromJson(optString, (Class<Object>) DynamicTitleBarEntity.class), new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetTitleBarJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83c3108844332f9308c50469809cadb4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83c3108844332f9308c50469809cadb4");
                        } else {
                            SetTitleBarJsHandler.this.jsCallback(new RespResult.Builder().create());
                        }
                    }

                    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                    public void onFail(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf3957089ebefee636b0a0fa9e5dd998", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf3957089ebefee636b0a0fa9e5dd998");
                        } else {
                            SetTitleBarJsHandler.this.jsCallbackErrorMsg(str);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d1b4ac8ddfdfe07f9a9b8908dafb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d1b4ac8ddfdfe07f9a9b8908dafb5e");
        } else {
            jsCallback(new RespResult.Builder().setStatus("fail").setMsg(str).create());
        }
    }
}
