package com.meituan.msc.modules.page.widget;

import com.meituan.msc.common.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final boolean b;
    final float c;
    final float d;
    final float e;
    final float f;

    public a(boolean z, float f, float f2, float f3, float f4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f51af19ec13a5ad3db8a3c4ea73e71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f51af19ec13a5ad3db8a3c4ea73e71");
            return;
        }
        this.b = z;
        this.c = n.b().density * f;
        this.d = n.b().density * f2;
        this.e = n.b().density * f3;
        this.f = n.b().density * f4;
    }
}
