package com.sankuai.titans.jsbridges.base.Interactions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UnsubscribeJsHandler extends DeprecatedJsBridge<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Void r11) {
        Object[] objArr = {r11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c2265d2882147c95f4b7650516759cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c2265d2882147c95f4b7650516759cf");
        } else if (this.argsJson == null) {
        } else {
            String optString = this.argsJson.optString("action");
            jsHost().getBridgePubSub().unsubscribe(optString);
            AbsJsHost jsHost = jsHost();
            jsHost.getTitansContext().getJsHostCenter().unSubscribe(optString, jsHost);
            jsCallback(new RespResult.Builder().create());
        }
    }
}
