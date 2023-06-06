package com.meituan.android.neohybrid.neo.bridge.presenter;

import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final String c;
    private final NeoBridgeBean d;

    private c(b bVar, String str, NeoBridgeBean neoBridgeBean) {
        this.b = bVar;
        this.c = str;
        this.d = neoBridgeBean;
    }

    public static Runnable a(b bVar, String str, NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {bVar, str, neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2183f320855e249c1e9fce2e439ca919", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2183f320855e249c1e9fce2e439ca919") : new c(bVar, str, neoBridgeBean);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb629a2596a3b8e8b6b4628b96dc5914", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb629a2596a3b8e8b6b4628b96dc5914");
        } else {
            b.a(this.b, this.c, this.d);
        }
    }
}
