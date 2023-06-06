package com.dianping.titans.js.jshandler;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.dianping.titans.js.JsCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.AbsJsHandler;
import com.sankuai.titans.protocol.jsbridge.VerifyInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class KnbWebDelegateJsHandler extends AbsJsHandler<String, String> implements JsCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final JsHandler jsHandler;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public boolean isSync(String str) {
        return false;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void jsCallback(String str) {
    }

    public KnbWebDelegateJsHandler(JsHandler jsHandler) {
        Object[] objArr = {jsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf2ed170945b3abf4f044d2bb9932307", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf2ed170945b3abf4f044d2bb9932307");
            return;
        }
        this.jsHandler = jsHandler;
        this.jsHandler.setJsCallback(this);
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public VerifyInfo doVerify(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e45856588801f46344d2045df043f291", RobustBitConfig.DEFAULT_VALUE) ? (VerifyInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e45856588801f46344d2045df043f291") : super.doVerify((KnbWebDelegateJsHandler) str);
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler, com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf80b656a93e2f0e6b5d2a336f0695bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf80b656a93e2f0e6b5d2a336f0695bf");
        } else {
            this.jsHandler.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler, com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c233559fa2e3b743fa2c9b213c3edee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c233559fa2e3b743fa2c9b213c3edee");
        } else {
            this.jsHandler.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public String getApiVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebda9c3e5ff39eadfcd91b5f7a28adb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebda9c3e5ff39eadfcd91b5f7a28adb3");
        }
        if (this.jsHandler instanceof BaseJsHandler) {
            return ((BaseJsHandler) this.jsHandler).getApiVersion();
        }
        return super.getApiVersion();
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "924db6b047a1b0f1a9da89e1f0617a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "924db6b047a1b0f1a9da89e1f0617a10");
        } else {
            this.jsHandler.doExec();
        }
    }

    @Override // com.dianping.titans.js.JsCallback
    public void jsCallback(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c08302e6678f65dbf4f1199309d8b46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c08302e6678f65dbf4f1199309d8b46");
        } else {
            callbackImplJson(jSONObject);
        }
    }
}
