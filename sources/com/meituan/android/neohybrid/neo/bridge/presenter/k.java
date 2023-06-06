package com.meituan.android.neohybrid.neo.bridge.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public static ChangeQuickRedirect a;
    private final j b;

    private k(j jVar) {
        this.b = jVar;
    }

    public static Runnable a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b882743ce403b0ccc378b02177c4db4", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b882743ce403b0ccc378b02177c4db4") : new k(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "906d7e925aec20a08f23032fe778f5d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "906d7e925aec20a08f23032fe778f5d6");
        } else {
            j.a(this.b);
        }
    }
}
