package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.bridge.BridgeConfigManager;
import com.dianping.titans.js.jshandler.JsHandlerVerifyImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReadyJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b06b5eff5d13b85ace979545c326457a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b06b5eff5d13b85ace979545c326457a");
            return;
        }
        String url = jsHost().getUrl();
        if (TextUtils.isEmpty(url)) {
            jsCallback();
        } else if (!BridgeConfigManager.isAccessWhite(url) && (this.jsHandlerVerifyStrategy instanceof JsHandlerVerifyImpl)) {
            ((JsHandlerVerifyImpl) this.jsHandlerVerifyStrategy).requestBridgeAccess(jsHost(), url, new JsHandlerVerifyImpl.BridgeAccessCallback() { // from class: com.dianping.titans.js.jshandler.ReadyJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.titans.js.jshandler.JsHandlerVerifyImpl.BridgeAccessCallback
                public void onGetBridge(List<String> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f1a1fcbcedfc52bd94ba6fc14f189a69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f1a1fcbcedfc52bd94ba6fc14f189a69");
                    } else {
                        ReadyJsHandler.this.jsCallback();
                    }
                }

                @Override // com.dianping.titans.js.jshandler.JsHandlerVerifyImpl.BridgeAccessCallback
                public void onFailed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ec984add9f9063dbfb46bb373eae8c50", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ec984add9f9063dbfb46bb373eae8c50");
                    } else {
                        ReadyJsHandler.this.jsCallback();
                    }
                }
            });
        } else {
            jsCallback();
        }
    }
}
