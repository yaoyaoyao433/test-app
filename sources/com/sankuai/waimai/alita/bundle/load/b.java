package com.sankuai.waimai.alita.bundle.load;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends RuntimeException {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.alita.bundle.exception.a b;

    public b() {
    }

    public b(com.sankuai.waimai.alita.bundle.exception.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb47de68eaef11b3b8a3de84ed55769", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb47de68eaef11b3b8a3de84ed55769");
        } else {
            this.b = aVar;
        }
    }
}
