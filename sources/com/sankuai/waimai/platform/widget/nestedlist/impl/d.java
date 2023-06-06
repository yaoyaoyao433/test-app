package com.sankuai.waimai.platform.widget.nestedlist.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    private final com.sankuai.waimai.platform.widget.nestedlist.interfaces.d d;

    public d(com.sankuai.waimai.platform.widget.nestedlist.interfaces.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5973808b97a0f4fba38e17c0cf7676a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5973808b97a0f4fba38e17c0cf7676a0");
            return;
        }
        this.b = -1;
        this.c = -1;
        this.d = dVar;
    }
}
