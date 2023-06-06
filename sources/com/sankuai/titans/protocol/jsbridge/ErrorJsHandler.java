package com.sankuai.titans.protocol.jsbridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.RespResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ErrorJsHandler extends DeprecatedJsBridge {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JsHandlerResultInfo errorInfo;

    public ErrorJsHandler(JsHandlerResultInfo jsHandlerResultInfo) {
        Object[] objArr = {jsHandlerResultInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5910983232bb091d756ea4cebaa72b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5910983232bb091d756ea4cebaa72b1");
        } else {
            this.errorInfo = jsHandlerResultInfo;
        }
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e128919cb1921215368d2d65e4f562a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e128919cb1921215368d2d65e4f562a");
        } else {
            jsCallback(new RespResult.Builder().setStatus("fail").setResultInfo(this.errorInfo).create());
        }
    }
}
