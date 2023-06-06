package com.meituan.android.cipstorage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public long d;
    public long e;

    public i(long j, long j2, long j3, long j4) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64aa15fea81fbb63aba927a3778a6714", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64aa15fea81fbb63aba927a3778a6714");
            return;
        }
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f4c943bc948f1298a091dcff42c540", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f4c943bc948f1298a091dcff42c540");
        }
        return "size:" + this.b + " at:" + this.c + " mt:" + this.d + " ct:" + this.e;
    }

    public final boolean a() {
        return this.c > this.d;
    }

    public final long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761ea6c9dc1ababe070a1745e1fc4a04", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761ea6c9dc1ababe070a1745e1fc4a04")).longValue() : a() ? this.c : this.d;
    }
}
