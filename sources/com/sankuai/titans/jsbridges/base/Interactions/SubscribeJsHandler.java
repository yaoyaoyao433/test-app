package com.sankuai.titans.jsbridges.base.Interactions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SubscribeJsHandler extends DeprecatedJsBridge<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Void r11) {
        Object[] objArr = {r11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bd06874637fad8cdad56df052e86461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bd06874637fad8cdad56df052e86461");
        } else if (this.argsJson == null) {
        } else {
            String optString = this.argsJson.optString("action");
            AbsJsHost jsHost = jsHost();
            jsHost.getTitansContext().getJsHostCenter().subscribe(optString, jsHost, this);
            jsCallback(new RespResult.Builder().create());
        }
    }
}
