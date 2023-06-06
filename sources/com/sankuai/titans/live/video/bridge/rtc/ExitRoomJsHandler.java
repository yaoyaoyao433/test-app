package com.sankuai.titans.live.video.bridge.rtc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.video.bridge.BaseLiveJsHandler;
import com.sankuai.titans.live.video.rtc.IRTC;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ExitRoomJsHandler extends BaseLiveJsHandler<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public String getSignature() {
        return "jqKoAJwk/1h7eL50otaCt6ODTiujG3V0waHn+HXV6ZKXQucRyHov+/ElSzTSv9fKnz8QiRL6ZyapkbthdKMX2w==";
    }

    @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler
    public void execWithData(Void r11, BaseLiveJsHandler.ExecCallback execCallback) {
        Object[] objArr = {r11, execCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "273746f2ea628fcc8482f48687d37aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "273746f2ea628fcc8482f48687d37aea");
            return;
        }
        IRTC rTCManager = getRTCManager();
        if (rTCManager == null) {
            execCallback.onFail(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code(), "null point exception occur");
            return;
        }
        rTCManager.exitRoom();
        execCallback.onSuccess();
    }
}
