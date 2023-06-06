package com.sankuai.eh.component.web.modal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final e b;
    private final com.sankuai.eh.component.web.plugins.api.a c;

    private f(e eVar, com.sankuai.eh.component.web.plugins.api.a aVar) {
        this.b = eVar;
        this.c = aVar;
    }

    public static Runnable a(e eVar, com.sankuai.eh.component.web.plugins.api.a aVar) {
        Object[] objArr = {eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3912fe2850ba7ca94ca5fa8961610db7", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3912fe2850ba7ca94ca5fa8961610db7") : new f(eVar, aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff7dba84a3888c7819c9d0fe16735a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff7dba84a3888c7819c9d0fe16735a2");
        } else {
            e.a(this.b, this.c);
        }
    }
}
