package com.sankuai.xm.login.net.taskqueue;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82543e42982b3216fae0c4c71d15c87b", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82543e42982b3216fae0c4c71d15c87b")).longValue() : System.currentTimeMillis();
    }
}
