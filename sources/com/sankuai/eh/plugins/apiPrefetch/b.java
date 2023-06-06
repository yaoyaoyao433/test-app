package com.sankuai.eh.plugins.apiPrefetch;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.apiPrefetch.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements a.b.InterfaceC0559a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final a.b c;
    private final a.d d;

    private b(a aVar, a.b bVar, a.d dVar) {
        this.b = aVar;
        this.c = bVar;
        this.d = dVar;
    }

    public static a.b.InterfaceC0559a a(a aVar, a.b bVar, a.d dVar) {
        Object[] objArr = {aVar, bVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ae68420b8e64945c7827d102e4fbbe9", RobustBitConfig.DEFAULT_VALUE) ? (a.b.InterfaceC0559a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ae68420b8e64945c7827d102e4fbbe9") : new b(aVar, bVar, dVar);
    }

    @Override // com.sankuai.eh.plugins.apiPrefetch.a.b.InterfaceC0559a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ca0c25962d66b8b40116d3ea8f279c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ca0c25962d66b8b40116d3ea8f279c");
        } else {
            a.a(this.b, this.c, this.d);
        }
    }
}
