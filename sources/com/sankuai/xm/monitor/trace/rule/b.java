package com.sankuai.xm.monitor.trace.rule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends d {
    public static ChangeQuickRedirect a;
    public volatile Map<String, Integer> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112b0ef1a0c5f3c26343755337c241af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112b0ef1a0c5f3c26343755337c241af");
        } else {
            this.b = new HashMap();
        }
    }
}
