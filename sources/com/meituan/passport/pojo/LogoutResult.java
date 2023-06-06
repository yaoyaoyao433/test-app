package com.meituan.passport.pojo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LogoutResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public String message;
    public String type;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "030f4b19518579bafef83640b093595e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "030f4b19518579bafef83640b093595e");
        }
        return "LogoutResult{code=" + this.code + ", message='" + this.message + "', type='" + this.type + "'}";
    }
}
