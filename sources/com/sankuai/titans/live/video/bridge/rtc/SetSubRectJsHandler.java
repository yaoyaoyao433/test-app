package com.sankuai.titans.live.video.bridge.rtc;

import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.video.bridge.BaseLiveJsHandler;
import com.sankuai.titans.live.video.bridge.rtc.params.SubRectParam;
import com.sankuai.titans.live.video.rtc.IRTC;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetSubRectJsHandler extends BaseLiveJsHandler<SubRectParam> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public String getSignature() {
        return "k7sL+5jGPEOjCMmeieGdXHA9Dp10o9TmVQASXk2MvWAbQM2EyMfF2K0r+/m4VFBsOS8j60vNzYEPmgP77CgueA==";
    }

    @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler
    public void execWithData(SubRectParam subRectParam, BaseLiveJsHandler.ExecCallback execCallback) {
        Object[] objArr = {subRectParam, execCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e38150d61450b1e583b6833fd40f426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e38150d61450b1e583b6833fd40f426");
            return;
        }
        IRTC rTCManager = getRTCManager();
        if (rTCManager == null) {
            execCallback.onFail(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code(), "null point exception occur");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.GestureMoveEvent.KEY_X, subRectParam.x);
            jSONObject.put(Constants.GestureMoveEvent.KEY_Y, subRectParam.y);
            jSONObject.put("w", subRectParam.w);
            jSONObject.put("h", subRectParam.h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        rTCManager.setSubRect(jSONObject);
        execCallback.onSuccess();
    }
}
