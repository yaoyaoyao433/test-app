package com.sankuai.titans.jsbridges.base.Interactions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ReadyJsHandler extends DeprecatedJsBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cf6cc12663d2a0e45f957213812329d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cf6cc12663d2a0e45f957213812329d");
        } else {
            jsCallback(new RespResult.Builder().create());
        }
    }
}
