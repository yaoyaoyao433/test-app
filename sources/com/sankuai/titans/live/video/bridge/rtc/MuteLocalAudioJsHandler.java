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
public class MuteLocalAudioJsHandler extends BaseLiveJsHandler<MuteParam> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public String getSignature() {
        return "m68ipvRv6uaJ/fiWd76gkDt29rwtogkKD2tkgkKRWD14yO6ZOXhwkeW9OaBsc8GjHxR0FOajmo6CkoO4ekamZA==";
    }

    @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler
    public void execWithData(MuteParam muteParam, BaseLiveJsHandler.ExecCallback execCallback) {
        Object[] objArr = {muteParam, execCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f57d36e599e4832c42daeb7afd95639c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f57d36e599e4832c42daeb7afd95639c");
            return;
        }
        IRTC rTCManager = getRTCManager();
        if (rTCManager == null) {
            execCallback.onFail(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code(), "null point exception occur");
            return;
        }
        rTCManager.muteLocalAudio(muteParam.mute);
        execCallback.onSuccess();
    }
}
