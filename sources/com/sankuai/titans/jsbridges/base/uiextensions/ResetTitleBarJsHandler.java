package com.sankuai.titans.jsbridges.base.uiextensions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ResetTitleBarJsHandler extends DeprecatedJsBridge<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Void r11) {
        Object[] objArr = {r11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "264343fc28c282b16a22d0d1a4affc81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "264343fc28c282b16a22d0d1a4affc81");
        } else {
            jsCallback(new RespResult.Builder().setResultInfo(404, "不再支持").create());
        }
    }
}
