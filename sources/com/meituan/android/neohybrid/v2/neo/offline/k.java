package com.meituan.android.neohybrid.v2.neo.offline;

import android.util.Log;
import com.meituan.android.neohybrid.v2.neo.offline.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public static ChangeQuickRedirect a;
    private final Exception b;
    private final g.d c;

    private k(Exception exc, g.d dVar) {
        this.b = exc;
        this.c = dVar;
    }

    public static Runnable a(Exception exc, g.d dVar) {
        Object[] objArr = {exc, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "001db3592f65a36e89a6ceed6d29d390", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "001db3592f65a36e89a6ceed6d29d390") : new k(exc, dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ca5a8927b95475e198aa53e11169ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ca5a8927b95475e198aa53e11169ab");
            return;
        }
        Exception exc = this.b;
        g.d dVar = this.c;
        Object[] objArr2 = {exc, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5953c7bca29377baebd596ac2d33c908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5953c7bca29377baebd596ac2d33c908");
            return;
        }
        new StringBuilder("兜底离线包拉取失败 ").append(exc.getMessage());
        com.dianping.networklog.c.a("loadDDDDefaultResource: onFail " + exc.getMessage(), 3, new String[]{"Recce-Android"});
        dVar.a("wasai_ddd_load_resource_fail");
        Log.i("RecceOfflineManager", "onFail", exc);
    }
}
