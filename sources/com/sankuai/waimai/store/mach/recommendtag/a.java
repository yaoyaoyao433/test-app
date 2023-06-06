package com.sankuai.waimai.store.mach.recommendtag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.newwidgets.list.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T, Contract extends com.sankuai.waimai.store.newwidgets.list.b> extends com.sankuai.waimai.store.newwidgets.list.c<T, Contract> {
    public static ChangeQuickRedirect a;

    public boolean a() {
        return false;
    }

    public a(Contract contract) {
        super(contract);
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8134c28c053b0334d3cd2ebf1f4c8ce4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8134c28c053b0334d3cd2ebf1f4c8ce4");
        }
    }
}
