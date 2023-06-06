package com.meituan.msc.modules.service.codecache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends com.meituan.msc.modules.preload.executor.c {
    public static ChangeQuickRedirect a;
    private c b;
    private a g;

    public e(c cVar, a aVar) {
        super(aVar.b());
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee193ccb3d6c6f73b12fdb8e28016a42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee193ccb3d6c6f73b12fdb8e28016a42");
            return;
        }
        this.g = aVar;
        this.b = cVar;
    }

    @Override // com.meituan.msc.modules.preload.executor.c
    public final void a(com.meituan.msc.modules.preload.executor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ce6c65deda1028ea0294b643423d02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ce6c65deda1028ea0294b643423d02");
        } else if (this.b.a(this.g, true)) {
            this.b.a(this.g);
        }
    }
}
