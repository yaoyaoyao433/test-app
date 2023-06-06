package com.meituan.android.neohybrid.v2.neo.breathe;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final boolean c;

    private d(a aVar, boolean z) {
        this.b = aVar;
        this.c = z;
    }

    public static Runnable a(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "697e1c88aae32a86dc31d93ac492554b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "697e1c88aae32a86dc31d93ac492554b") : new d(aVar, z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aef14e2a8f21e5157e63e88e2a5d89ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aef14e2a8f21e5157e63e88e2a5d89ad");
        } else {
            a.a(this.b, this.c);
        }
    }
}
