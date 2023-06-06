package com.sankuai.titans.protocol.jsbridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StrictJsBridge<T, R> extends AbsJsHandler<T, RespResult<R>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public /* bridge */ /* synthetic */ void jsCallback(Object obj) {
        jsCallback((RespResult) ((RespResult) obj));
    }

    public void jsCallback(RespResult<R> respResult) {
        Object[] objArr = {respResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "accbe54375fff14945d278b047059569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "accbe54375fff14945d278b047059569");
        } else {
            callbackResult(respResult);
        }
    }
}
