package com.meituan.android.neohybrid.neo.breathe;

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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fca5eaf4d56d7f6744584ab5eb316317", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fca5eaf4d56d7f6744584ab5eb316317") : new d(aVar, z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "266d71170710153fe6374901670f8155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "266d71170710153fe6374901670f8155");
        } else {
            a.a(this.b, this.c);
        }
    }
}
