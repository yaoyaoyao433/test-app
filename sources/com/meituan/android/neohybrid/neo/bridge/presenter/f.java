package com.meituan.android.neohybrid.neo.bridge.presenter;

import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final e b;
    private final NeoBridgeCustomizeInterface c;

    private f(e eVar, NeoBridgeCustomizeInterface neoBridgeCustomizeInterface) {
        this.b = eVar;
        this.c = neoBridgeCustomizeInterface;
    }

    public static Runnable a(e eVar, NeoBridgeCustomizeInterface neoBridgeCustomizeInterface) {
        Object[] objArr = {eVar, neoBridgeCustomizeInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7577a513dafdf841168ed3cd2a4a7aa2", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7577a513dafdf841168ed3cd2a4a7aa2") : new f(eVar, neoBridgeCustomizeInterface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecdb4af562f315eab992a8b803b36cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecdb4af562f315eab992a8b803b36cdc");
        } else {
            e.a(this.b, this.c);
        }
    }
}
