package com.sankuai.meituan.mtliveqos.statistic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72dc2b1b7374190bb13ed3cfbcd99595", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72dc2b1b7374190bb13ed3cfbcd99595");
        }
        return "mClassSimpleName" + this.b + "\nmMethod= " + this.c + "\nmLog= " + this.d;
    }
}
