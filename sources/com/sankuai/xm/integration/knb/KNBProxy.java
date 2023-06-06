package com.sankuai.xm.integration.knb;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes6.dex */
public class KNBProxy implements IKNB {
    public static ChangeQuickRedirect a;
    private volatile boolean b;

    public KNBProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39840f4cd0cd7e2b5a48d390c06d4746", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39840f4cd0cd7e2b5a48d390c06d4746");
        } else {
            this.b = false;
        }
    }
}
