package com.meituan.mmp.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class u {
    public static ChangeQuickRedirect a;
    private long b;
    private long c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a();
    }

    public u(long j, a aVar) {
        Object[] objArr = {new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1556ac83c9415af69dcfdb66c784038", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1556ac83c9415af69dcfdb66c784038");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d9f1aeada71414dce9116c2c524fc0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d9f1aeada71414dce9116c2c524fc0")).booleanValue() : System.currentTimeMillis() - this.c < this.b;
    }

    public final boolean a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d4829726bda373ade74fd1a87f6dfc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d4829726bda373ade74fd1a87f6dfc")).booleanValue();
        }
        if (!b() && this.d != null && (z = this.d.a())) {
            this.c = System.currentTimeMillis();
        }
        return z;
    }
}
