package com.sankuai.waimai.foundation.location;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public LocationCatReporter b;
    public LocationSnifferReporter c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "432b1fc60818b5bfa1943cf5d3110712", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "432b1fc60818b5bfa1943cf5d3110712");
            return;
        }
        this.b = new LocationCatReporter();
        this.c = new LocationSnifferReporter();
    }
}
