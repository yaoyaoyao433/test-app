package com.sankuai.waimai.machpro.component.cellcontainer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.machpro.component.view.b;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends b {
    public static ChangeQuickRedirect a;
    private static a b;

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b5cc3ce4f467933a0e8c79c9552eca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b5cc3ce4f467933a0e8c79c9552eca");
        } else {
            b = this;
        }
    }

    public static a b() {
        a aVar = b;
        b = null;
        return aVar;
    }
}
