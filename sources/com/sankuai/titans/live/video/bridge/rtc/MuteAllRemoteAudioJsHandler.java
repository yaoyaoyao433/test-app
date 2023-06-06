package com.sankuai.titans.live.video.bridge.rtc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.video.bridge.BaseLiveJsHandler;
import com.sankuai.titans.live.video.bridge.rtc.params.MuteParam;
import com.sankuai.titans.live.video.rtc.IRTC;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MuteAllRemoteAudioJsHandler extends BaseLiveJsHandler<MuteParam> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public String getSignature() {
        return "al3urKGt4ELFK9Hcny8lvPgAmiKZb1E2OIBskwRAx/rRfP73tHxfkZPuTOA+6/FNWWWiL86RNUM28QtOPix95w==";
    }

    @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler
    public void execWithData(MuteParam muteParam, BaseLiveJsHandler.ExecCallback execCallback) {
        Object[] objArr = {muteParam, execCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31cef6692c93ab941001b46a38ea25f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31cef6692c93ab941001b46a38ea25f3");
            return;
        }
        IRTC rTCManager = getRTCManager();
        if (rTCManager == null) {
            execCallback.onFail(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code(), "null point exception occur");
            return;
        }
        rTCManager.muteAllRemoteAudio(muteParam.mute);
        execCallback.onSuccess();
    }
}
