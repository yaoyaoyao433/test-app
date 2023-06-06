package com.sankuai.waimai.mach.recycler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.mach.ASTTemplate;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    ASTTemplate b;
    com.sankuai.waimai.mach.manager.cache.e c;

    public h(com.sankuai.waimai.mach.manager.cache.e eVar, ASTTemplate aSTTemplate) {
        Object[] objArr = {eVar, aSTTemplate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9062e7bb26dbc50dc10ebfd24667f91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9062e7bb26dbc50dc10ebfd24667f91");
            return;
        }
        this.b = aSTTemplate;
        this.c = eVar;
    }
}
