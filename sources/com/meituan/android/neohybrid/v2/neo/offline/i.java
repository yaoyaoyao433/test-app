package com.meituan.android.neohybrid.v2.neo.offline;

import android.util.Log;
import com.meituan.android.neohybrid.v2.neo.offline.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public static ChangeQuickRedirect a;
    private final Exception b;
    private final g.d c;

    private i(Exception exc, g.d dVar) {
        this.b = exc;
        this.c = dVar;
    }

    public static Runnable a(Exception exc, g.d dVar) {
        Object[] objArr = {exc, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e7a542a82076041587899f5cfb32171", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e7a542a82076041587899f5cfb32171") : new i(exc, dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332dedf20e1945ef0bd21aeacfd4cc07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332dedf20e1945ef0bd21aeacfd4cc07");
            return;
        }
        Exception exc = this.b;
        g.d dVar = this.c;
        Object[] objArr2 = {exc, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1c262aee4d7bd5e946720cc7fbdb096e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1c262aee4d7bd5e946720cc7fbdb096e");
            return;
        }
        new StringBuilder("离线包拉取失败 ").append(exc.getMessage());
        com.dianping.networklog.c.a("loadDDDResource: onFail " + exc.getMessage(), 3, new String[]{"Recce-Android"});
        dVar.a("wasai_ddd_load_resource_fail");
        Log.i("RecceOfflineManager", "onFail", exc);
    }
}
