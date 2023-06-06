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
import com.sankuai.titans.protocol.webcompat.elements.OnTitleBarEventListener;
import com.sankuai.titans.protocol.webcompat.jshost.IUIManager;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetTitleJsHandler extends DeprecatedJsBridge<SetTitleParam> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SetTitleParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("subtitle")
        @Expose
        public String subtitle;
        @SerializedName("title")
        @Expose
        public String title;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(SetTitleParam setTitleParam) {
        Object[] objArr = {setTitleParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b15cc3d33f0a8c6981de833ea4cbcad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b15cc3d33f0a8c6981de833ea4cbcad");
            return;
        }
        IUIManager uiManager = jsHost().getUiManager();
        if (uiManager == null) {
            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_5_ContextError).create());
        } else if (setTitleParam == null) {
            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid).create());
        } else {
            if (!TextUtils.isEmpty(setTitleParam.subtitle)) {
                try {
                    uiManager.setTitleContentParams(new JSONObject(this.args));
                } catch (Throwable th) {
                    jsHost().getTitansContext().getServiceManager().getStatisticsService().reportClassError("SetTitleJsHandler", "doExecSync", th);
                }
            } else {
                uiManager.setTitle(setTitleParam.title);
            }
            jsCallback(new RespResult.Builder().create());
            uiManager.setOnTitleBarEventListener(new OnTitleBarEventListener() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetTitleJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.protocol.webcompat.elements.OnTitleBarEventListener
                public void onEvent(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "843ee3e1123014310289fa44ec329c6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "843ee3e1123014310289fa44ec329c6b");
                    } else {
                        SetTitleJsHandler.this.callbackImplJson(jSONObject);
                    }
                }
            });
        }
    }
}
