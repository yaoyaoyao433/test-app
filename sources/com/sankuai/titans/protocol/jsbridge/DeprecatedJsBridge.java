package com.sankuai.titans.protocol.jsbridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public class DeprecatedJsBridge<T> extends AbsJsHandler<T, RespResult> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public /* bridge */ /* synthetic */ RespResult doExecSync(Object obj) {
        return doExecSync((DeprecatedJsBridge<T>) obj);
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void jsCallback(RespResult respResult) {
        Object[] objArr = {respResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "398aa3c9e0370e3117d0af14a12a9b6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "398aa3c9e0370e3117d0af14a12a9b6a");
        } else {
            callbackResult(respResult);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public RespResult doExecSync(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d3e3f3571e33d65cbf656b9ccfb8414", RobustBitConfig.DEFAULT_VALUE) ? (RespResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d3e3f3571e33d65cbf656b9ccfb8414") : (RespResult) super.doExecSync((DeprecatedJsBridge<T>) t);
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public boolean isSync(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d34b0c180b8533ca9cdb473f2c0f3a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d34b0c180b8533ca9cdb473f2c0f3a5")).booleanValue() : super.isSync(t);
    }
}
