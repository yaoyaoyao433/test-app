package com.sankuai.waimai.store.newwidgets.flowlayout;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.newwidgets.list.b;
import com.sankuai.waimai.store.newwidgets.list.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T, Contract extends b> extends c<T, Contract> {
    public static ChangeQuickRedirect b;

    public boolean a() {
        return false;
    }

    public a(Contract contract) {
        super(contract);
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc84d31d95fc880e852673d3e901e7e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc84d31d95fc880e852673d3e901e7e5");
        }
    }
}
