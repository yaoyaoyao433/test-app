package com.meituan.msi.api.device;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private long b;
    private long c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a();
    }

    public c(long j, a aVar) {
        Object[] objArr = {new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae1c9e56ce97b11ef45ef72efffc9b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae1c9e56ce97b11ef45ef72efffc9b4");
            return;
        }
        if (j > 20) {
            this.b = j - 20;
        } else {
            this.b = j;
        }
        this.d = aVar;
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eabdeeaa4d9f2d50ceada2e9b02700fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eabdeeaa4d9f2d50ceada2e9b02700fc")).booleanValue() : System.currentTimeMillis() - this.c < this.b;
    }

    public final boolean a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028008c1175987e0229fc1ef9e5b1608", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028008c1175987e0229fc1ef9e5b1608")).booleanValue();
        }
        if (!b() && this.d != null && (z = this.d.a())) {
            this.c = System.currentTimeMillis();
        }
        return z;
    }
}
