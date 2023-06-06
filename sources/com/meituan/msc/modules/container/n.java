package com.meituan.msc.modules.container;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n extends com.meituan.msc.modules.reporter.f {
    public static ChangeQuickRedirect d;
    public long e;
    com.meituan.msc.modules.reporter.memory.e f;

    public n(com.meituan.msc.modules.reporter.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755a45f58629e1116de733628d61a834", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755a45f58629e1116de733628d61a834");
        }
    }

    public final com.meituan.msc.modules.reporter.memory.e b() {
        com.meituan.msc.modules.reporter.memory.e eVar = this.f;
        this.f = null;
        return eVar;
    }
}
