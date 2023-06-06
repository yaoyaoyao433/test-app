package com.sankuai.xm.imui.session.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    public static ChangeQuickRedirect a;
    public int b;

    public g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95bdcd6a32e7cd46f182f2e10e9085d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95bdcd6a32e7cd46f182f2e10e9085d4");
        } else {
            this.b = i;
        }
    }
}
