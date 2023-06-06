package com.sankuai.waimai.business.order.api.submit.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;

    public b(String str, long j, String str2, boolean z) {
        Object[] objArr = {str, new Long(j), str2, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f71d85c87c524fecf76256e3d0e1c2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f71d85c87c524fecf76256e3d0e1c2c");
            return;
        }
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = true;
    }
}
