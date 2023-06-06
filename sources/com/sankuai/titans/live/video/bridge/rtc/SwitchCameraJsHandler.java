package com.sankuai.titans.live.video.bridge.rtc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.video.bridge.BaseLiveJsHandler;
import com.sankuai.titans.live.video.rtc.IRTC;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SwitchCameraJsHandler extends BaseLiveJsHandler<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public String getSignature() {
        return "oK+ZgM/RjjlQSon1MN5lroFNZh/s6U+ya05CD/1qz1PKmHz14Uds1COQN1Gd0dRTN5kkJ89txZH1VT0xzV8rXQ==";
    }

    @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler
    public void execWithData(Void r11, BaseLiveJsHandler.ExecCallback execCallback) {
        Object[] objArr = {r11, execCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b873b6415b7af5bb169ff192349588b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b873b6415b7af5bb169ff192349588b9");
            return;
        }
        IRTC rTCManager = getRTCManager();
        if (rTCManager == null) {
            execCallback.onFail(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code(), "null point exception occur");
            return;
        }
        rTCManager.switchCamera();
        execCallback.onSuccess();
    }
}
