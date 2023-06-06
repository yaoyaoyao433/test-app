package com.dianping.nvtunnelkit.debug;

import com.dianping.nvtunnelkit.logger.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a c = new a();
    public boolean b;
    private boolean d;

    public static a a() {
        return c;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619b0e5d35bb76f3c42c8cad171af253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619b0e5d35bb76f3c42c8cad171af253");
            return;
        }
        this.d = z;
        b.a(z);
    }
}
