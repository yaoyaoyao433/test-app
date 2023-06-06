package com.dianping.nvtunnelkit.kit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q {
    public static ChangeQuickRedirect a;
    public ByteBuffer b;
    public final long c;

    public q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49dd187eb0be7aa2a53a5915bc62b89f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49dd187eb0be7aa2a53a5915bc62b89f");
        } else {
            this.c = System.nanoTime();
        }
    }
}
