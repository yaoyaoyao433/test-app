package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.bridge.BridgeConfigManager;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OpenMiniProgramJsHandler extends BaseJsHandler {
    private static final int ERRORCODE_COMMON = -1;
    private static final int ERRORCODE_ZERO = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "931db981eb7934aeec9c397b96aa1104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "931db981eb7934aeec9c397b96aa1104");
        } else if (TextUtils.isEmpty(BridgeConfigManager.getWxId())) {
            jsCallbackError(-1, "no app id");
        } else {
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(jsHost().getContext(), BridgeConfigManager.getWxId());
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = jsBean().argsJson.optString(JsBridgeResult.ARG_KEY_SHARE_MINI_PROGRAM_ID);
            if (TextUtils.isEmpty(req.userName)) {
                jsCallbackError(-1, "no mini program id");
                return;
            }
            req.path = jsBean().argsJson.optString("path");
            req.miniprogramType = jsBean().argsJson.optInt("type", 0);
            try {
                if (createWXAPI.sendReq(req)) {
                    jsCallback();
                } else {
                    jsCallbackError(0, "微信分享失败");
                }
            } catch (Exception unused) {
                jsCallbackError(0, "微信分享失败");
            }
        }
    }
}
