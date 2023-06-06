package com.sankuai.waimai.platform.net.weaknetwork.strategy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public long d;
    public int e;

    public b(com.sankuai.waimai.platform.net.weaknetwork.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85dd6c7b596b582fab14340c8e690074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85dd6c7b596b582fab14340c8e690074");
            return;
        }
        this.b = 30000;
        this.c = 4;
        if (aVar != null) {
            this.b = aVar.h;
            this.c = aVar.g;
        }
    }
}
