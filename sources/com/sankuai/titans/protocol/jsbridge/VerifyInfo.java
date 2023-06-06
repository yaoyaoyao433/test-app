package com.sankuai.titans.protocol.jsbridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VerifyInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private RespResult errorInfo;
    private boolean result;

    public VerifyInfo(boolean z, RespResult respResult) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), respResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a24f3cd62563e05c9d0f42c3a00bfbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a24f3cd62563e05c9d0f42c3a00bfbf");
            return;
        }
        this.result = true;
        this.result = z;
        this.errorInfo = respResult;
    }

    public boolean isResult() {
        return this.result;
    }

    public RespResult getErrorInfo() {
        return this.errorInfo;
    }

    public VerifyInfo(RespResult respResult) {
        Object[] objArr = {respResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfa96d51dc39e14fdbc8dd19a2c3b3c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfa96d51dc39e14fdbc8dd19a2c3b3c9");
            return;
        }
        this.result = true;
        this.errorInfo = respResult;
    }

    public static VerifyInfo SUCCEED() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3efbb917b663fdeac6afa0dcd163e68d", RobustBitConfig.DEFAULT_VALUE) ? (VerifyInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3efbb917b663fdeac6afa0dcd163e68d") : new VerifyInfo(true, null);
    }

    public static VerifyInfo FAIL(RespResult respResult) {
        Object[] objArr = {respResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8b485e885c773bf48486dbc94025d21", RobustBitConfig.DEFAULT_VALUE) ? (VerifyInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8b485e885c773bf48486dbc94025d21") : new VerifyInfo(false, respResult);
    }
}
