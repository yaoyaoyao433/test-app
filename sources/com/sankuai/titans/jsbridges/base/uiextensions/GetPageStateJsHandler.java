package com.sankuai.titans.jsbridges.base.uiextensions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.HostState;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.jsbridge.RespResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetPageStateJsHandler extends DeprecatedJsBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95ea2bfa057f835a65ff80aca31f0241", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95ea2bfa057f835a65ff80aca31f0241");
            return;
        }
        try {
            HostState hostState = jsHost().getHostState();
            jsCallback(new RespResult.Builder().append("appear", Boolean.valueOf(hostState.appear)).append("foreground", Boolean.valueOf(hostState.foreground)).create());
        } catch (Throwable unused) {
            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_8_SystemApiError).create());
        }
    }
}
