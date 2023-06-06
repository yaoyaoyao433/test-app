package com.sankuai.waimai.contextual.computing.storage.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public long b;
    public int c;

    public a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e17e77106e9a31b3518b09f968d54b48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e17e77106e9a31b3518b09f968d54b48");
            return;
        }
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f05c5821d0ee09a64e5c9de76408daf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f05c5821d0ee09a64e5c9de76408daf")).booleanValue() : (obj instanceof a) && this.b == ((a) obj).b;
    }

    public final int hashCode() {
        return (int) this.b;
    }
}
