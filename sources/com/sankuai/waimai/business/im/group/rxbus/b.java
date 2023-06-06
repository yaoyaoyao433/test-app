package com.sankuai.waimai.business.im.group.rxbus;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.business.im.group.model.c b;

    public b(com.sankuai.waimai.business.im.group.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dfba69dd763ddf6ad53099ddab3afd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dfba69dd763ddf6ad53099ddab3afd7");
        } else {
            this.b = cVar;
        }
    }
}
