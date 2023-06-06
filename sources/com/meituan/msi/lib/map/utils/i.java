package com.meituan.msi.lib.map.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public final double b;
    public final double c;

    public i(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23baaf3c15c1977cfe1257e86683b29d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23baaf3c15c1977cfe1257e86683b29d");
            return;
        }
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d00c638339efeffee793aa1e52bfe0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d00c638339efeffee793aa1e52bfe0")).booleanValue();
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.b == iVar.b && this.c == iVar.c;
        }
        return false;
    }
}
