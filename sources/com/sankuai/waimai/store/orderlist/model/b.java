package com.sankuai.waimai.store.orderlist.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    public final long b;
    public final String c;

    public b(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e3600e64393958872e7c11bdc5b8e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e3600e64393958872e7c11bdc5b8e8");
            return;
        }
        this.b = j;
        this.c = str;
    }
}
