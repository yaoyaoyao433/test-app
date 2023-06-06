package com.meituan.android.neohybrid.v2.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final String c;

    private c(a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public static Runnable a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a40e4c76f56c855978617d1035b36544", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a40e4c76f56c855978617d1035b36544") : new c(aVar, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d3bd3ed035b8132c28500628af3a62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d3bd3ed035b8132c28500628af3a62");
        } else {
            a.a(this.b, this.c);
        }
    }
}
