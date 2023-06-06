package com.sankuai.titans.jsbridges.base.uiextensions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.jsbridge.StrictJsBridge;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DismissLoadingViewJsHandler extends StrictJsBridge<Void, Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public boolean isSync(Void r1) {
        return true;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public RespResult<Void> doExecSync(Void r11) {
        Object[] objArr = {r11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95319266ae2bdb95aae17fb05fe457f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (RespResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95319266ae2bdb95aae17fb05fe457f9");
        }
        jsHost().getUiManager().dismissLoadingView();
        return new RespResult.Builder().create();
    }
}
