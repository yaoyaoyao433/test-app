package com.meituan.android.neohybrid.neo.nsr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;
    private final Context c;

    private g(d dVar, Context context) {
        this.b = dVar;
        this.c = context;
    }

    public static Runnable a(d dVar, Context context) {
        Object[] objArr = {dVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5f95d181ccad680c7100fb0c2aef624", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5f95d181ccad680c7100fb0c2aef624") : new g(dVar, context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8343de3f5d191992004745bd981cead4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8343de3f5d191992004745bd981cead4");
            return;
        }
        d dVar = this.b;
        Context context = this.c;
        Object[] objArr2 = {dVar, context};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1c0fd2d1d7e4b8fc9883fb59e23e2fab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1c0fd2d1d7e4b8fc9883fb59e23e2fab");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        dVar.b.a(LayoutInflater.from(context), (ViewGroup) null);
        com.meituan.android.neohybrid.neo.report.b.c("NSRPersist", "onCreateView", new com.meituan.android.neohybrid.neo.report.a().a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).b);
    }
}
