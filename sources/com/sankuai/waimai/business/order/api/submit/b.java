package com.sankuai.waimai.business.order.api.submit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private long b;

    public b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb913e97d5d4b651ddddde69ab2ad1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb913e97d5d4b651ddddde69ab2ad1d");
        } else {
            this.b = j;
        }
    }
}
