package com.sankuai.model.rpc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.model.NoProguard;
/* compiled from: ProGuard */
@NoProguard
/* loaded from: classes4.dex */
public class BaseRpcResult {
    protected static final int ERROR = 1;
    protected static final int OK = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String msg;
    private int needLogout;
    protected int success;

    public BaseRpcResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8380bc1317f2782b9328db727e5c8863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8380bc1317f2782b9328db727e5c8863");
        } else {
            this.success = 1;
        }
    }

    public String getErrorMsg() {
        return this.msg;
    }

    public void setSuccess(int i) {
        this.success = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public boolean isOk() {
        return this.success == 0;
    }

    public boolean needLogout() {
        return this.needLogout == 1;
    }
}
