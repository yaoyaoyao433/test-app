package com.sankuai.titans.live.video.bridge.rtc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.video.bridge.BaseLiveJsHandler;
import com.sankuai.titans.live.video.bridge.rtc.params.ViewFillModeParam;
import com.sankuai.titans.live.video.rtc.IRTC;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetLocalViewFillModeJsHandler extends BaseLiveJsHandler<ViewFillModeParam> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public String getSignature() {
        return "RZqVnzK4mwIZUrNNg8G//qezAX4RoBbPZwQujrI3enkG211ZnMWI2JPPSctrZV/vfPbcfvbqHZ1rpVIV3OhzYw==";
    }

    @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler
    public void execWithData(ViewFillModeParam viewFillModeParam, BaseLiveJsHandler.ExecCallback execCallback) {
        Object[] objArr = {viewFillModeParam, execCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef630a899b989b8b1d008a9cfe862c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef630a899b989b8b1d008a9cfe862c42");
            return;
        }
        IRTC rTCManager = getRTCManager();
        if (rTCManager == null) {
            execCallback.onFail(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code(), "null point exception occur");
            return;
        }
        rTCManager.setLocalViewFillMode(viewFillModeParam.mode);
        execCallback.onSuccess();
    }
}
