package com.sankuai.waimai.machpro.component.list;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    int d;

    public f(boolean z, boolean z2, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4129e1a8b3c7d8563fcfdd2928da993d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4129e1a8b3c7d8563fcfdd2928da993d");
            return;
        }
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
