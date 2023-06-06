package com.sankuai.xm.im.message.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements c {
    public static ChangeQuickRedirect a;
    private com.sankuai.xm.im.message.d b;

    @Override // com.sankuai.xm.base.service.j
    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397a95ba33a293eaaae356a6a35a3b82", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397a95ba33a293eaaae356a6a35a3b82")).intValue();
        }
        this.b = IMClient.a().i();
        return 0;
    }
}
