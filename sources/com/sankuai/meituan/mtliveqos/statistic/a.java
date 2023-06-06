package com.sankuai.meituan.mtliveqos.statistic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160781da160b9cdb2a9a0e68bd74f73f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160781da160b9cdb2a9a0e68bd74f73f");
        }
        return "mErrorCode" + this.b + "\nmErrorReason= " + this.c + "\nmErrorType= " + this.d;
    }
}
