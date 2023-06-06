package com.meituan.android.neohybrid.v2.neo.offline;

import com.meituan.android.legwork.bean.monitor.LinkNode;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.v2.neo.offline.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {
    public static ChangeQuickRedirect a;
    private final g.a b;
    private final String c;

    private l(g.a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public static Runnable a(g.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a64a349ce45543918e70c9b9bf78ad15", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a64a349ce45543918e70c9b9bf78ad15") : new l(aVar, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53c70bf51cc5e403b29f3bad14800b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53c70bf51cc5e403b29f3bad14800b0a");
            return;
        }
        g.a aVar = this.b;
        String str = this.c;
        Object[] objArr2 = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = g.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dd35a272be37753b4ae9e38f3cb99adb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dd35a272be37753b4ae9e38f3cb99adb");
            return;
        }
        synchronized (aVar) {
            if (aVar.b != null) {
                aVar.b.a("wasai_get_resource_timeout");
                aVar.b = null;
                com.meituan.android.neohybrid.v2.neo.recce.a.a(aVar.c.get(), "recce_offline_prepare", com.meituan.android.neohybrid.neo.report.a.a().a("status", LinkNode.NODE_TYPE_TIME_OUT).a(NeoConfig.NEO_SCENE, str).b);
            }
        }
    }
}
