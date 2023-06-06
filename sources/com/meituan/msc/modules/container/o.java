package com.meituan.msc.modules.container;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;
    public static o b = new o();
    private volatile boolean c;

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9669066062eb7aa1ddc355178d253f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9669066062eb7aa1ddc355178d253f");
        } else {
            this.c = false;
        }
    }

    public final synchronized boolean a() {
        return this.c;
    }

    public final synchronized void a(boolean z) {
        this.c = z;
    }
}
